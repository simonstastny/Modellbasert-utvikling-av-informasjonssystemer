/*
 * generated by Xtext
 *///
package qa.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import tdt4250.qa.QATest
import tdt4250.qa.Question
import tdt4250.qa.QAPart
import tdt4250.qa.QASection
import tdt4250.qa.AnswerType
import tdt4250.qa.Answer
import tdt4250.qa.YesNoAnswer
import tdt4250.qa.TextAnswer
import tdt4250.qa.NumberAnswer
import tdt4250.qa.OptionAnswer
import tdt4250.qa.ExpressionAnswer
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.NumberType

class QaGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val className = resource.URI.trimFileExtension.lastSegment.toFirstUpper
		val packageNameList = resource.URI.trimSegments(1).segmentsList.drop(3)
		val packageName = packageNameList.join(".")
		fsa.generateFile(packageNameList.join("/") + "/" + className + ".java", '''
			package �packageNameList.join(".")�;
			
			import java.util.Stack;
			
			public class �className� implements Runnable {
				
				private Stack maxTries = new Stack();
				private Stack reveal = new Stack();
				
				
				private int tries = 0;			
				private String rightAnswer = null;
				
				private int nextPart = 0;
				
				private tdt4250.io.AbstractIO io = new tdt4250.io.ConsoleIO();
				
				public void run() {
					maxTries.push(Integer.valueOf(3));
					reveal.push(Boolean.TRUE);
					�generate(resource.contents.get(0) as QATest)�
				}

				public static void main(String[] args) {
					new �className�().run();
				}
			}
		''')
	}

	def dispatch CharSequence generate(QATest qa) {
		'''
		{
		�IF qa.options !=null� 
			maxTries.push(Integer.valueOf(�qa.options.maxTries�));
			reveal.push(Boolean.valueOf(�qa.options.revealAnswer�));
		�ENDIF�
		�qa.parts.join("\n", [p | p.generate])�
		�IF qa.options !=null� 
			reveal.pop();
			maxTries.pop();
		�ENDIF� 
		}
		'''
	}

	def dispatch CharSequence generate(QAPart qa) {
	}

	def dispatch CharSequence generate(QASection qs) {
		'''
		{
		io.println("[Section �qs.title�]");
		�IF qs.options !=null� 
			maxTries.push(Integer.valueOf(�qs.options.maxTries�));
			reveal.push(Boolean.valueOf(�qs.options.revealAnswer�));
		�ENDIF�
		�qs.questions.join("\n", [q | q.generate])�
		�IF qs.options !=null� 
			reveal.pop();
			maxTries.pop();
		�ENDIF� 
		}
		'''
	}

	def dispatch CharSequence generate(Question q) {
		'''
		{
			tries = 0;
			
			if(nextPart == 0 || nextPart == �q.hashCode�) {
			
			nextPart = 0;
			
			while(tries < (Integer) maxTries.peek()) {
				tries++;
				
			io.print("�q.text�");
			�var i=0�
			�FOR option : q.candidates�
				�IF i==0�
				io.println("");
				�ENDIF�				
				�IF option instanceof TextAnswer�
				io.println("? �i=i+1�)�(option as TextAnswer).text�");
				�ENDIF�
				�IF option instanceof NumberAnswer�
				io.println("? �i=i+1�)�(option as NumberAnswer).number�");
				�ENDIF�
				�IF option instanceof YesNoAnswer�
				io.println("? �i=i+1�)�(option as YesNoAnswer).yes�");
				�ENDIF�
				�IF option instanceof ExpressionAnswer�
				io.println("? �i=i+1�)�(option as ExpressionAnswer).number�");
				�ENDIF�
			�ENDFOR�
			�IF i>0 && q.correct instanceof OptionAnswer�
				io.print("Select option (1-�i�)");
			�ENDIF�
			
			
			�IF q.correct instanceof YesNoAnswer�
				{
					rightAnswer = "�(q.correct as YesNoAnswer).yes�";
					String response = io.inputString("");
					if (response.equals("yes") && �(q.correct as YesNoAnswer).yes�) {
						io.println("Correct!");
						break;
					} else if (response.equals("no") && !�(q.correct as YesNoAnswer).yes�) {
						io.println("Correct!");
						
						�FOR rule : q.nextRules�
						if(tries<=�rule.tries� && �rule.next != null�) {
							nextPart = �rule.next.hashCode�;
							}
						�ENDFOR�
						
						break;
					}
					else {
						io.println("Wrong!");
					}
				}
			�ENDIF�
			�IF q.correct instanceof TextAnswer�
				{
					rightAnswer = "�(q.correct as TextAnswer).text�";
					String response = io.inputString("");
					if (response.equals("�(q.correct as TextAnswer).text�")) {
						io.println("Correct!");
						
						�FOR rule : q.nextRules�
						if(tries<=�rule.tries� && �rule.next != null�) {
							nextPart = �rule.next.hashCode�;
							}
						�ENDFOR�
						
						break;
					}
					else {
						io.println("Wrong!");
					}
				}
			�ENDIF�
			�IF q.correct instanceof ExpressionAnswer�
				{
					rightAnswer = String.valueOf(�(q.correct as ExpressionAnswer).expression�) + "�(q.correct as ExpressionAnswer).epsilon�";
					Double response = io.inputDouble("");
					
					if (Math.abs(response - �(q.correct as ExpressionAnswer).expression�) <= �(q.correct as ExpressionAnswer).epsilon�) {
						io.println("Correct!");
						
						�FOR rule : q.nextRules�
						if(tries<=�rule.tries� && �rule.next != null�) {
							nextPart = �rule.next.hashCode�;
							}
						�ENDFOR�
						
						break;
					}
					else {
						io.println("Wrong!");
					}
				}
			�ELSEIF q.correct instanceof NumberAnswer�
				{
					rightAnswer = "�(q.correct as NumberAnswer).number�";
					Double response = io.inputDouble("");
					if (Math.abs(response - �(q.correct as NumberAnswer).number�) <= �(q.correct as NumberAnswer).epsilon�) {
						io.println("Correct!");
						
						�FOR rule : q.nextRules�
						if(tries<=�rule.tries� && �rule.next != null�) {
							nextPart = �rule.next.hashCode�;
							}
						�ENDFOR�
						
						break;
					}
					else {
						io.println("Wrong!");
					}
				}
			�ENDIF�
			�IF q.correct instanceof OptionAnswer�
				{
					rightAnswer = "�(q.correct as OptionAnswer).optionNumber�";
					io.println("");
					//print options
					
					
					int response = io.inputInt("");
					if (response == �(q.correct as OptionAnswer).optionNumber�) {
						io.println("Correct!");
						
						�FOR rule : q.nextRules�
						if(tries<=�rule.tries� && �rule.next != null�) {
							nextPart = �rule.next.hashCode�;
							}
						�ENDFOR�

						break;
					}
					else {
						io.println("Wrong!");
					}
				}
		  �ENDIF�
		  
		  }
		
			if(tries== (Integer) maxTries.peek() && (Boolean) reveal.peek()) {
				io.println(rightAnswer);
			}
			}
		}
		'''
	}
}