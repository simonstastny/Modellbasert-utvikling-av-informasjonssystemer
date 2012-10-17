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
			public class �className� implements Runnable {
				
				private tdt4250.io.AbstractIO io = new tdt4250.io.ConsoleIO();
				
				public void run() {
					�generate(resource.contents.get(0) as QATest)�
				}

				public static void main(String[] args) {
					new �className�().run();
				}
			}
		''')
	}

	def dispatch CharSequence generate(QATest qa) {
		qa.parts.join("\n", [p | p.generate])
	}

	def dispatch CharSequence generate(QAPart qa) {
	}

	def dispatch CharSequence generate(QASection qs) {
		'''
		{
		io.println("[Section �qs.name�]");
		�qs.questions.join("\n", [q | q.generate])�
		}
		'''
	}

	def dispatch CharSequence generate(Question q) {
		'''
		{
			io.print("[�q.correct.^class.toString�] ");
			io.print("�q.text�");
			
			�IF q.correct instanceof YesNoAnswer�
				{
				String response = io.inputString("");
				if (response.equals("yes") && �(q.correct as YesNoAnswer).yes�) {
					io.println("Correct!");
				}
				else {
					io.println("Wrong!");
				}
				}
			�ENDIF�
			�IF q.correct instanceof TextAnswer�
				{
				String response = io.inputString("");
				if (response.equals("�(q.correct as TextAnswer).text�")) {
					io.println("Correct!");
				}
				else {
					io.println("Wrong!");
				}
				}
			�ENDIF�
			�IF q.correct instanceof NumberAnswer�
				{
				Double response = io.inputDouble("");
				if (response == �(q.correct as NumberAnswer).number�) {
					io.println("Correct!");
				}
				else {
					io.println("Wrong!");
				}
				}
			�ENDIF�
			�IF q.correct instanceof ExpressionAnswer�
				{
				String response = io.inputString(""); //use XBase to eval the expression
				if (2 == �(q.correct as NumberAnswer).number�) { //temp
					io.println("Correct!");
				}
				else {
					io.println("Wrong!");
				}
				}
			�ENDIF�
			�IF q.correct instanceof OptionAnswer�
				{
				//print options
				�var i=0�
				�FOR option : q.candidates�				
					io.println("? �i=i+1�)�(option as TextAnswer).text�");
				�ENDFOR�
				
				int response = io.inputInt("");
				if (response == �(q.correct as OptionAnswer).optionNumber�) {
					io.println("Correct!");
				}
				else {
					io.println("Wrong!");
				}
				}
		  �ENDIF�
		}
		'''
	}
}