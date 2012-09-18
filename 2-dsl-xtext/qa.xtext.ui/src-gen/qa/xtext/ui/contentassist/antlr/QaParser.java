/*
* generated by Xtext
*/
package qa.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import qa.xtext.services.QaGrammarAccess;

public class QaParser extends AbstractContentAssistParser {
	
	@Inject
	private QaGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected qa.xtext.ui.contentassist.antlr.internal.InternalQaParser createParser() {
		qa.xtext.ui.contentassist.antlr.internal.InternalQaParser result = new qa.xtext.ui.contentassist.antlr.internal.InternalQaParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEDoubleAccess().getAlternatives_2_2_0(), "rule__EDouble__Alternatives_2_2_0");
					put(grammarAccess.getQATestAccess().getGroup(), "rule__QATest__Group__0");
					put(grammarAccess.getQAContainerOptionsAccess().getGroup(), "rule__QAContainerOptions__Group__0");
					put(grammarAccess.getQAContainerOptionsAccess().getGroup_3(), "rule__QAContainerOptions__Group_3__0");
					put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
					put(grammarAccess.getEDoubleAccess().getGroup_2(), "rule__EDouble__Group_2__0");
					put(grammarAccess.getEDoubleAccess().getGroup_2_2(), "rule__EDouble__Group_2_2__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getQATestAccess().getTitleAssignment_1(), "rule__QATest__TitleAssignment_1");
					put(grammarAccess.getQATestAccess().getOptionsAssignment_2(), "rule__QATest__OptionsAssignment_2");
					put(grammarAccess.getQAContainerOptionsAccess().getMaxTriesAssignment_1(), "rule__QAContainerOptions__MaxTriesAssignment_1");
					put(grammarAccess.getQAContainerOptionsAccess().getRevealAnswerAssignment_3_0(), "rule__QAContainerOptions__RevealAnswerAssignment_3_0");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			qa.xtext.ui.contentassist.antlr.internal.InternalQaParser typedParser = (qa.xtext.ui.contentassist.antlr.internal.InternalQaParser) parser;
			typedParser.entryRuleQATest();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public QaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(QaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
