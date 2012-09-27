package qa.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import qa.xtext.services.QaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'no'", "'E'", "'e'", "'Title: '", "'try'", "'times'", "'correct'", "'answer'", "'?'", "'!'", "'Candidates: '", "', '", "'Section '", "'{'", "'}'", "'='", "'+-'", "'#'", "'-'", "'.'", "'reveal'", "'yes'"
    };
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalQaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQaParser.tokenNames; }
    public String getGrammarFileName() { return "../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g"; }


     
     	private QaGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(QaGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleQATest"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:60:1: entryRuleQATest : ruleQATest EOF ;
    public final void entryRuleQATest() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:61:1: ( ruleQATest EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:62:1: ruleQATest EOF
            {
             before(grammarAccess.getQATestRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQATest_in_entryRuleQATest61);
            ruleQATest();

            state._fsp--;

             after(grammarAccess.getQATestRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQATest68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQATest"


    // $ANTLR start "ruleQATest"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:69:1: ruleQATest : ( ( rule__QATest__Group__0 ) ) ;
    public final void ruleQATest() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:73:2: ( ( ( rule__QATest__Group__0 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:74:1: ( ( rule__QATest__Group__0 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:74:1: ( ( rule__QATest__Group__0 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:75:1: ( rule__QATest__Group__0 )
            {
             before(grammarAccess.getQATestAccess().getGroup()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:76:1: ( rule__QATest__Group__0 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:76:2: rule__QATest__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QATest__Group__0_in_ruleQATest94);
            rule__QATest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQATestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQATest"


    // $ANTLR start "entryRuleQAContainerOptions"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:88:1: entryRuleQAContainerOptions : ruleQAContainerOptions EOF ;
    public final void entryRuleQAContainerOptions() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:89:1: ( ruleQAContainerOptions EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:90:1: ruleQAContainerOptions EOF
            {
             before(grammarAccess.getQAContainerOptionsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQAContainerOptions_in_entryRuleQAContainerOptions121);
            ruleQAContainerOptions();

            state._fsp--;

             after(grammarAccess.getQAContainerOptionsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQAContainerOptions128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQAContainerOptions"


    // $ANTLR start "ruleQAContainerOptions"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:97:1: ruleQAContainerOptions : ( ( rule__QAContainerOptions__Group__0 ) ) ;
    public final void ruleQAContainerOptions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:101:2: ( ( ( rule__QAContainerOptions__Group__0 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:102:1: ( ( rule__QAContainerOptions__Group__0 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:102:1: ( ( rule__QAContainerOptions__Group__0 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:103:1: ( rule__QAContainerOptions__Group__0 )
            {
             before(grammarAccess.getQAContainerOptionsAccess().getGroup()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:104:1: ( rule__QAContainerOptions__Group__0 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:104:2: rule__QAContainerOptions__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group__0_in_ruleQAContainerOptions154);
            rule__QAContainerOptions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQAContainerOptionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQAContainerOptions"


    // $ANTLR start "entryRuleQAPart"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:116:1: entryRuleQAPart : ruleQAPart EOF ;
    public final void entryRuleQAPart() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:117:1: ( ruleQAPart EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:118:1: ruleQAPart EOF
            {
             before(grammarAccess.getQAPartRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQAPart_in_entryRuleQAPart181);
            ruleQAPart();

            state._fsp--;

             after(grammarAccess.getQAPartRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQAPart188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQAPart"


    // $ANTLR start "ruleQAPart"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:125:1: ruleQAPart : ( ( rule__QAPart__Alternatives ) ) ;
    public final void ruleQAPart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:129:2: ( ( ( rule__QAPart__Alternatives ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:130:1: ( ( rule__QAPart__Alternatives ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:130:1: ( ( rule__QAPart__Alternatives ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:131:1: ( rule__QAPart__Alternatives )
            {
             before(grammarAccess.getQAPartAccess().getAlternatives()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:132:1: ( rule__QAPart__Alternatives )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:132:2: rule__QAPart__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAPart__Alternatives_in_ruleQAPart214);
            rule__QAPart__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQAPartAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQAPart"


    // $ANTLR start "entryRuleQuestion"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:144:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:145:1: ( ruleQuestion EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:146:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion241);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:153:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:157:2: ( ( ( rule__Question__Group__0 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:158:1: ( ( rule__Question__Group__0 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:158:1: ( ( rule__Question__Group__0 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:159:1: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:160:1: ( rule__Question__Group__0 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:160:2: rule__Question__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__0_in_ruleQuestion274);
            rule__Question__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleQASection"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:172:1: entryRuleQASection : ruleQASection EOF ;
    public final void entryRuleQASection() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:173:1: ( ruleQASection EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:174:1: ruleQASection EOF
            {
             before(grammarAccess.getQASectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQASection_in_entryRuleQASection301);
            ruleQASection();

            state._fsp--;

             after(grammarAccess.getQASectionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQASection308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQASection"


    // $ANTLR start "ruleQASection"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:181:1: ruleQASection : ( ( rule__QASection__Group__0 ) ) ;
    public final void ruleQASection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:185:2: ( ( ( rule__QASection__Group__0 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:186:1: ( ( rule__QASection__Group__0 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:186:1: ( ( rule__QASection__Group__0 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:187:1: ( rule__QASection__Group__0 )
            {
             before(grammarAccess.getQASectionAccess().getGroup()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:188:1: ( rule__QASection__Group__0 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:188:2: rule__QASection__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QASection__Group__0_in_ruleQASection334);
            rule__QASection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQASectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQASection"


    // $ANTLR start "entryRuleAnswer"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:200:1: entryRuleAnswer : ruleAnswer EOF ;
    public final void entryRuleAnswer() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:201:1: ( ruleAnswer EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:202:1: ruleAnswer EOF
            {
             before(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer361);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnswer"


    // $ANTLR start "ruleAnswer"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:209:1: ruleAnswer : ( ( rule__Answer__Alternatives ) ) ;
    public final void ruleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:213:2: ( ( ( rule__Answer__Alternatives ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:214:1: ( ( rule__Answer__Alternatives ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:214:1: ( ( rule__Answer__Alternatives ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:215:1: ( rule__Answer__Alternatives )
            {
             before(grammarAccess.getAnswerAccess().getAlternatives()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:216:1: ( rule__Answer__Alternatives )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:216:2: rule__Answer__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Alternatives_in_ruleAnswer394);
            rule__Answer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "entryRuleExpressionAnswer"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:228:1: entryRuleExpressionAnswer : ruleExpressionAnswer EOF ;
    public final void entryRuleExpressionAnswer() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:229:1: ( ruleExpressionAnswer EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:230:1: ruleExpressionAnswer EOF
            {
             before(grammarAccess.getExpressionAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionAnswer_in_entryRuleExpressionAnswer421);
            ruleExpressionAnswer();

            state._fsp--;

             after(grammarAccess.getExpressionAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpressionAnswer428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionAnswer"


    // $ANTLR start "ruleExpressionAnswer"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:237:1: ruleExpressionAnswer : ( ( rule__ExpressionAnswer__Group__0 ) ) ;
    public final void ruleExpressionAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:241:2: ( ( ( rule__ExpressionAnswer__Group__0 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:242:1: ( ( rule__ExpressionAnswer__Group__0 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:242:1: ( ( rule__ExpressionAnswer__Group__0 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:243:1: ( rule__ExpressionAnswer__Group__0 )
            {
             before(grammarAccess.getExpressionAnswerAccess().getGroup()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:244:1: ( rule__ExpressionAnswer__Group__0 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:244:2: rule__ExpressionAnswer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionAnswer__Group__0_in_ruleExpressionAnswer454);
            rule__ExpressionAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAnswerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionAnswer"


    // $ANTLR start "entryRuleOptionAnswer"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:256:1: entryRuleOptionAnswer : ruleOptionAnswer EOF ;
    public final void entryRuleOptionAnswer() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:257:1: ( ruleOptionAnswer EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:258:1: ruleOptionAnswer EOF
            {
             before(grammarAccess.getOptionAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOptionAnswer_in_entryRuleOptionAnswer481);
            ruleOptionAnswer();

            state._fsp--;

             after(grammarAccess.getOptionAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOptionAnswer488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOptionAnswer"


    // $ANTLR start "ruleOptionAnswer"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:265:1: ruleOptionAnswer : ( ( rule__OptionAnswer__Group__0 ) ) ;
    public final void ruleOptionAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:269:2: ( ( ( rule__OptionAnswer__Group__0 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:270:1: ( ( rule__OptionAnswer__Group__0 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:270:1: ( ( rule__OptionAnswer__Group__0 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:271:1: ( rule__OptionAnswer__Group__0 )
            {
             before(grammarAccess.getOptionAnswerAccess().getGroup()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:272:1: ( rule__OptionAnswer__Group__0 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:272:2: rule__OptionAnswer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OptionAnswer__Group__0_in_ruleOptionAnswer514);
            rule__OptionAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionAnswerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptionAnswer"


    // $ANTLR start "entryRuleNumberAnswer"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:284:1: entryRuleNumberAnswer : ruleNumberAnswer EOF ;
    public final void entryRuleNumberAnswer() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:285:1: ( ruleNumberAnswer EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:286:1: ruleNumberAnswer EOF
            {
             before(grammarAccess.getNumberAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumberAnswer_in_entryRuleNumberAnswer541);
            ruleNumberAnswer();

            state._fsp--;

             after(grammarAccess.getNumberAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumberAnswer548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberAnswer"


    // $ANTLR start "ruleNumberAnswer"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:293:1: ruleNumberAnswer : ( ( rule__NumberAnswer__Alternatives ) ) ;
    public final void ruleNumberAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:297:2: ( ( ( rule__NumberAnswer__Alternatives ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:298:1: ( ( rule__NumberAnswer__Alternatives ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:298:1: ( ( rule__NumberAnswer__Alternatives ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:299:1: ( rule__NumberAnswer__Alternatives )
            {
             before(grammarAccess.getNumberAnswerAccess().getAlternatives()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:300:1: ( rule__NumberAnswer__Alternatives )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:300:2: rule__NumberAnswer__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__Alternatives_in_ruleNumberAnswer574);
            rule__NumberAnswer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberAnswerAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberAnswer"


    // $ANTLR start "entryRuleTextAnswer"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:312:1: entryRuleTextAnswer : ruleTextAnswer EOF ;
    public final void entryRuleTextAnswer() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:313:1: ( ruleTextAnswer EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:314:1: ruleTextAnswer EOF
            {
             before(grammarAccess.getTextAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTextAnswer_in_entryRuleTextAnswer601);
            ruleTextAnswer();

            state._fsp--;

             after(grammarAccess.getTextAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextAnswer608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextAnswer"


    // $ANTLR start "ruleTextAnswer"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:321:1: ruleTextAnswer : ( ( rule__TextAnswer__TextAssignment ) ) ;
    public final void ruleTextAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:325:2: ( ( ( rule__TextAnswer__TextAssignment ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:326:1: ( ( rule__TextAnswer__TextAssignment ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:326:1: ( ( rule__TextAnswer__TextAssignment ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:327:1: ( rule__TextAnswer__TextAssignment )
            {
             before(grammarAccess.getTextAnswerAccess().getTextAssignment()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:328:1: ( rule__TextAnswer__TextAssignment )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:328:2: rule__TextAnswer__TextAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextAnswer__TextAssignment_in_ruleTextAnswer634);
            rule__TextAnswer__TextAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTextAnswerAccess().getTextAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextAnswer"


    // $ANTLR start "entryRuleYesNoAnswer"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:340:1: entryRuleYesNoAnswer : ruleYesNoAnswer EOF ;
    public final void entryRuleYesNoAnswer() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:341:1: ( ruleYesNoAnswer EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:342:1: ruleYesNoAnswer EOF
            {
             before(grammarAccess.getYesNoAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleYesNoAnswer_in_entryRuleYesNoAnswer661);
            ruleYesNoAnswer();

            state._fsp--;

             after(grammarAccess.getYesNoAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleYesNoAnswer668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleYesNoAnswer"


    // $ANTLR start "ruleYesNoAnswer"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:349:1: ruleYesNoAnswer : ( ( rule__YesNoAnswer__Group__0 ) ) ;
    public final void ruleYesNoAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:353:2: ( ( ( rule__YesNoAnswer__Group__0 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:354:1: ( ( rule__YesNoAnswer__Group__0 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:354:1: ( ( rule__YesNoAnswer__Group__0 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:355:1: ( rule__YesNoAnswer__Group__0 )
            {
             before(grammarAccess.getYesNoAnswerAccess().getGroup()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:356:1: ( rule__YesNoAnswer__Group__0 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:356:2: rule__YesNoAnswer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__YesNoAnswer__Group__0_in_ruleYesNoAnswer694);
            rule__YesNoAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getYesNoAnswerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYesNoAnswer"


    // $ANTLR start "entryRuleEString"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:368:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:369:1: ( ruleEString EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:370:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString721);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:377:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:381:2: ( ( RULE_STRING ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:382:1: ( RULE_STRING )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:382:1: ( RULE_STRING )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:383:1: RULE_STRING
            {
             before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString754); 
             after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDouble"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:396:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:397:1: ( ruleEDouble EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:398:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble780);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble787); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:405:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:409:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:410:1: ( ( rule__EDouble__Group__0 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:410:1: ( ( rule__EDouble__Group__0 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:411:1: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:412:1: ( rule__EDouble__Group__0 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:412:2: rule__EDouble__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0_in_ruleEDouble813);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEInt"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:424:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:425:1: ( ruleEInt EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:426:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt840);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt847); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:433:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:437:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:438:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:438:1: ( ( rule__EInt__Group__0 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:439:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:440:1: ( rule__EInt__Group__0 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:440:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt873);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__QAPart__Alternatives"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:452:1: rule__QAPart__Alternatives : ( ( ruleQuestion ) | ( ruleQASection ) );
    public final void rule__QAPart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:456:1: ( ( ruleQuestion ) | ( ruleQASection ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==23) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:457:1: ( ruleQuestion )
                    {
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:457:1: ( ruleQuestion )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:458:1: ruleQuestion
                    {
                     before(grammarAccess.getQAPartAccess().getQuestionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__QAPart__Alternatives909);
                    ruleQuestion();

                    state._fsp--;

                     after(grammarAccess.getQAPartAccess().getQuestionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:463:6: ( ruleQASection )
                    {
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:463:6: ( ruleQASection )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:464:1: ruleQASection
                    {
                     before(grammarAccess.getQAPartAccess().getQASectionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleQASection_in_rule__QAPart__Alternatives926);
                    ruleQASection();

                    state._fsp--;

                     after(grammarAccess.getQAPartAccess().getQASectionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QAPart__Alternatives"


    // $ANTLR start "rule__Answer__Alternatives"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:474:1: rule__Answer__Alternatives : ( ( ruleOptionAnswer ) | ( ruleNumberAnswer ) | ( ruleTextAnswer ) | ( ruleYesNoAnswer ) );
    public final void rule__Answer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:478:1: ( ( ruleOptionAnswer ) | ( ruleNumberAnswer ) | ( ruleTextAnswer ) | ( ruleYesNoAnswer ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt2=1;
                }
                break;
            case RULE_INT:
            case 26:
            case 29:
                {
                alt2=2;
                }
                break;
            case RULE_STRING:
                {
                alt2=3;
                }
                break;
            case 11:
            case 32:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:479:1: ( ruleOptionAnswer )
                    {
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:479:1: ( ruleOptionAnswer )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:480:1: ruleOptionAnswer
                    {
                     before(grammarAccess.getAnswerAccess().getOptionAnswerParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOptionAnswer_in_rule__Answer__Alternatives958);
                    ruleOptionAnswer();

                    state._fsp--;

                     after(grammarAccess.getAnswerAccess().getOptionAnswerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:485:6: ( ruleNumberAnswer )
                    {
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:485:6: ( ruleNumberAnswer )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:486:1: ruleNumberAnswer
                    {
                     before(grammarAccess.getAnswerAccess().getNumberAnswerParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumberAnswer_in_rule__Answer__Alternatives975);
                    ruleNumberAnswer();

                    state._fsp--;

                     after(grammarAccess.getAnswerAccess().getNumberAnswerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:491:6: ( ruleTextAnswer )
                    {
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:491:6: ( ruleTextAnswer )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:492:1: ruleTextAnswer
                    {
                     before(grammarAccess.getAnswerAccess().getTextAnswerParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTextAnswer_in_rule__Answer__Alternatives992);
                    ruleTextAnswer();

                    state._fsp--;

                     after(grammarAccess.getAnswerAccess().getTextAnswerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:497:6: ( ruleYesNoAnswer )
                    {
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:497:6: ( ruleYesNoAnswer )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:498:1: ruleYesNoAnswer
                    {
                     before(grammarAccess.getAnswerAccess().getYesNoAnswerParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleYesNoAnswer_in_rule__Answer__Alternatives1009);
                    ruleYesNoAnswer();

                    state._fsp--;

                     after(grammarAccess.getAnswerAccess().getYesNoAnswerParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Alternatives"


    // $ANTLR start "rule__NumberAnswer__Alternatives"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:508:1: rule__NumberAnswer__Alternatives : ( ( ( rule__NumberAnswer__Group_0__0 ) ) | ( ruleExpressionAnswer ) );
    public final void rule__NumberAnswer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:512:1: ( ( ( rule__NumberAnswer__Group_0__0 ) ) | ( ruleExpressionAnswer ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT||LA3_0==29) ) {
                alt3=1;
            }
            else if ( (LA3_0==26) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:513:1: ( ( rule__NumberAnswer__Group_0__0 ) )
                    {
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:513:1: ( ( rule__NumberAnswer__Group_0__0 ) )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:514:1: ( rule__NumberAnswer__Group_0__0 )
                    {
                     before(grammarAccess.getNumberAnswerAccess().getGroup_0()); 
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:515:1: ( rule__NumberAnswer__Group_0__0 )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:515:2: rule__NumberAnswer__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__Group_0__0_in_rule__NumberAnswer__Alternatives1041);
                    rule__NumberAnswer__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNumberAnswerAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:519:6: ( ruleExpressionAnswer )
                    {
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:519:6: ( ruleExpressionAnswer )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:520:1: ruleExpressionAnswer
                    {
                     before(grammarAccess.getNumberAnswerAccess().getExpressionAnswerParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExpressionAnswer_in_rule__NumberAnswer__Alternatives1059);
                    ruleExpressionAnswer();

                    state._fsp--;

                     after(grammarAccess.getNumberAnswerAccess().getExpressionAnswerParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberAnswer__Alternatives"


    // $ANTLR start "rule__YesNoAnswer__Alternatives_1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:530:1: rule__YesNoAnswer__Alternatives_1 : ( ( ( rule__YesNoAnswer__YesAssignment_1_0 ) ) | ( 'no' ) );
    public final void rule__YesNoAnswer__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:534:1: ( ( ( rule__YesNoAnswer__YesAssignment_1_0 ) ) | ( 'no' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==32) ) {
                alt4=1;
            }
            else if ( (LA4_0==11) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:535:1: ( ( rule__YesNoAnswer__YesAssignment_1_0 ) )
                    {
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:535:1: ( ( rule__YesNoAnswer__YesAssignment_1_0 ) )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:536:1: ( rule__YesNoAnswer__YesAssignment_1_0 )
                    {
                     before(grammarAccess.getYesNoAnswerAccess().getYesAssignment_1_0()); 
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:537:1: ( rule__YesNoAnswer__YesAssignment_1_0 )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:537:2: rule__YesNoAnswer__YesAssignment_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__YesNoAnswer__YesAssignment_1_0_in_rule__YesNoAnswer__Alternatives_11091);
                    rule__YesNoAnswer__YesAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getYesNoAnswerAccess().getYesAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:541:6: ( 'no' )
                    {
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:541:6: ( 'no' )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:542:1: 'no'
                    {
                     before(grammarAccess.getYesNoAnswerAccess().getNoKeyword_1_1()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__YesNoAnswer__Alternatives_11110); 
                     after(grammarAccess.getYesNoAnswerAccess().getNoKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YesNoAnswer__Alternatives_1"


    // $ANTLR start "rule__EDouble__Alternatives_2_2_0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:554:1: rule__EDouble__Alternatives_2_2_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:558:1: ( ( 'E' ) | ( 'e' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:559:1: ( 'E' )
                    {
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:559:1: ( 'E' )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:560:1: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_2_2_0_0()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EDouble__Alternatives_2_2_01145); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_2_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:567:6: ( 'e' )
                    {
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:567:6: ( 'e' )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:568:1: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_2_2_0_1()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__EDouble__Alternatives_2_2_01165); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_2_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_2_2_0"


    // $ANTLR start "rule__QATest__Group__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:582:1: rule__QATest__Group__0 : rule__QATest__Group__0__Impl rule__QATest__Group__1 ;
    public final void rule__QATest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:586:1: ( rule__QATest__Group__0__Impl rule__QATest__Group__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:587:2: rule__QATest__Group__0__Impl rule__QATest__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QATest__Group__0__Impl_in_rule__QATest__Group__01197);
            rule__QATest__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QATest__Group__1_in_rule__QATest__Group__01200);
            rule__QATest__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QATest__Group__0"


    // $ANTLR start "rule__QATest__Group__0__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:594:1: rule__QATest__Group__0__Impl : ( 'Title: ' ) ;
    public final void rule__QATest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:598:1: ( ( 'Title: ' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:599:1: ( 'Title: ' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:599:1: ( 'Title: ' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:600:1: 'Title: '
            {
             before(grammarAccess.getQATestAccess().getTitleKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__QATest__Group__0__Impl1228); 
             after(grammarAccess.getQATestAccess().getTitleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QATest__Group__0__Impl"


    // $ANTLR start "rule__QATest__Group__1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:613:1: rule__QATest__Group__1 : rule__QATest__Group__1__Impl rule__QATest__Group__2 ;
    public final void rule__QATest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:617:1: ( rule__QATest__Group__1__Impl rule__QATest__Group__2 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:618:2: rule__QATest__Group__1__Impl rule__QATest__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QATest__Group__1__Impl_in_rule__QATest__Group__11259);
            rule__QATest__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QATest__Group__2_in_rule__QATest__Group__11262);
            rule__QATest__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QATest__Group__1"


    // $ANTLR start "rule__QATest__Group__1__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:625:1: rule__QATest__Group__1__Impl : ( ( rule__QATest__TitleAssignment_1 ) ) ;
    public final void rule__QATest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:629:1: ( ( ( rule__QATest__TitleAssignment_1 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:630:1: ( ( rule__QATest__TitleAssignment_1 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:630:1: ( ( rule__QATest__TitleAssignment_1 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:631:1: ( rule__QATest__TitleAssignment_1 )
            {
             before(grammarAccess.getQATestAccess().getTitleAssignment_1()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:632:1: ( rule__QATest__TitleAssignment_1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:632:2: rule__QATest__TitleAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QATest__TitleAssignment_1_in_rule__QATest__Group__1__Impl1289);
            rule__QATest__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQATestAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QATest__Group__1__Impl"


    // $ANTLR start "rule__QATest__Group__2"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:642:1: rule__QATest__Group__2 : rule__QATest__Group__2__Impl rule__QATest__Group__3 ;
    public final void rule__QATest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:646:1: ( rule__QATest__Group__2__Impl rule__QATest__Group__3 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:647:2: rule__QATest__Group__2__Impl rule__QATest__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QATest__Group__2__Impl_in_rule__QATest__Group__21319);
            rule__QATest__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QATest__Group__3_in_rule__QATest__Group__21322);
            rule__QATest__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QATest__Group__2"


    // $ANTLR start "rule__QATest__Group__2__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:654:1: rule__QATest__Group__2__Impl : ( ( rule__QATest__OptionsAssignment_2 )? ) ;
    public final void rule__QATest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:658:1: ( ( ( rule__QATest__OptionsAssignment_2 )? ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:659:1: ( ( rule__QATest__OptionsAssignment_2 )? )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:659:1: ( ( rule__QATest__OptionsAssignment_2 )? )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:660:1: ( rule__QATest__OptionsAssignment_2 )?
            {
             before(grammarAccess.getQATestAccess().getOptionsAssignment_2()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:661:1: ( rule__QATest__OptionsAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:661:2: rule__QATest__OptionsAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__QATest__OptionsAssignment_2_in_rule__QATest__Group__2__Impl1349);
                    rule__QATest__OptionsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQATestAccess().getOptionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QATest__Group__2__Impl"


    // $ANTLR start "rule__QATest__Group__3"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:671:1: rule__QATest__Group__3 : rule__QATest__Group__3__Impl ;
    public final void rule__QATest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:675:1: ( rule__QATest__Group__3__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:676:2: rule__QATest__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QATest__Group__3__Impl_in_rule__QATest__Group__31380);
            rule__QATest__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QATest__Group__3"


    // $ANTLR start "rule__QATest__Group__3__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:682:1: rule__QATest__Group__3__Impl : ( ( rule__QATest__PartsAssignment_3 )* ) ;
    public final void rule__QATest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:686:1: ( ( ( rule__QATest__PartsAssignment_3 )* ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:687:1: ( ( rule__QATest__PartsAssignment_3 )* )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:687:1: ( ( rule__QATest__PartsAssignment_3 )* )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:688:1: ( rule__QATest__PartsAssignment_3 )*
            {
             before(grammarAccess.getQATestAccess().getPartsAssignment_3()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:689:1: ( rule__QATest__PartsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING||LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:689:2: rule__QATest__PartsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QATest__PartsAssignment_3_in_rule__QATest__Group__3__Impl1407);
            	    rule__QATest__PartsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getQATestAccess().getPartsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QATest__Group__3__Impl"


    // $ANTLR start "rule__QAContainerOptions__Group__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:707:1: rule__QAContainerOptions__Group__0 : rule__QAContainerOptions__Group__0__Impl rule__QAContainerOptions__Group__1 ;
    public final void rule__QAContainerOptions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:711:1: ( rule__QAContainerOptions__Group__0__Impl rule__QAContainerOptions__Group__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:712:2: rule__QAContainerOptions__Group__0__Impl rule__QAContainerOptions__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group__0__Impl_in_rule__QAContainerOptions__Group__01446);
            rule__QAContainerOptions__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group__1_in_rule__QAContainerOptions__Group__01449);
            rule__QAContainerOptions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QAContainerOptions__Group__0"


    // $ANTLR start "rule__QAContainerOptions__Group__0__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:719:1: rule__QAContainerOptions__Group__0__Impl : ( 'try' ) ;
    public final void rule__QAContainerOptions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:723:1: ( ( 'try' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:724:1: ( 'try' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:724:1: ( 'try' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:725:1: 'try'
            {
             before(grammarAccess.getQAContainerOptionsAccess().getTryKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__QAContainerOptions__Group__0__Impl1477); 
             after(grammarAccess.getQAContainerOptionsAccess().getTryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QAContainerOptions__Group__0__Impl"


    // $ANTLR start "rule__QAContainerOptions__Group__1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:738:1: rule__QAContainerOptions__Group__1 : rule__QAContainerOptions__Group__1__Impl rule__QAContainerOptions__Group__2 ;
    public final void rule__QAContainerOptions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:742:1: ( rule__QAContainerOptions__Group__1__Impl rule__QAContainerOptions__Group__2 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:743:2: rule__QAContainerOptions__Group__1__Impl rule__QAContainerOptions__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group__1__Impl_in_rule__QAContainerOptions__Group__11508);
            rule__QAContainerOptions__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group__2_in_rule__QAContainerOptions__Group__11511);
            rule__QAContainerOptions__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QAContainerOptions__Group__1"


    // $ANTLR start "rule__QAContainerOptions__Group__1__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:750:1: rule__QAContainerOptions__Group__1__Impl : ( ( rule__QAContainerOptions__MaxTriesAssignment_1 ) ) ;
    public final void rule__QAContainerOptions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:754:1: ( ( ( rule__QAContainerOptions__MaxTriesAssignment_1 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:755:1: ( ( rule__QAContainerOptions__MaxTriesAssignment_1 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:755:1: ( ( rule__QAContainerOptions__MaxTriesAssignment_1 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:756:1: ( rule__QAContainerOptions__MaxTriesAssignment_1 )
            {
             before(grammarAccess.getQAContainerOptionsAccess().getMaxTriesAssignment_1()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:757:1: ( rule__QAContainerOptions__MaxTriesAssignment_1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:757:2: rule__QAContainerOptions__MaxTriesAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__MaxTriesAssignment_1_in_rule__QAContainerOptions__Group__1__Impl1538);
            rule__QAContainerOptions__MaxTriesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQAContainerOptionsAccess().getMaxTriesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QAContainerOptions__Group__1__Impl"


    // $ANTLR start "rule__QAContainerOptions__Group__2"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:767:1: rule__QAContainerOptions__Group__2 : rule__QAContainerOptions__Group__2__Impl rule__QAContainerOptions__Group__3 ;
    public final void rule__QAContainerOptions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:771:1: ( rule__QAContainerOptions__Group__2__Impl rule__QAContainerOptions__Group__3 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:772:2: rule__QAContainerOptions__Group__2__Impl rule__QAContainerOptions__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group__2__Impl_in_rule__QAContainerOptions__Group__21568);
            rule__QAContainerOptions__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group__3_in_rule__QAContainerOptions__Group__21571);
            rule__QAContainerOptions__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QAContainerOptions__Group__2"


    // $ANTLR start "rule__QAContainerOptions__Group__2__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:779:1: rule__QAContainerOptions__Group__2__Impl : ( 'times' ) ;
    public final void rule__QAContainerOptions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:783:1: ( ( 'times' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:784:1: ( 'times' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:784:1: ( 'times' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:785:1: 'times'
            {
             before(grammarAccess.getQAContainerOptionsAccess().getTimesKeyword_2()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__QAContainerOptions__Group__2__Impl1599); 
             after(grammarAccess.getQAContainerOptionsAccess().getTimesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QAContainerOptions__Group__2__Impl"


    // $ANTLR start "rule__QAContainerOptions__Group__3"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:798:1: rule__QAContainerOptions__Group__3 : rule__QAContainerOptions__Group__3__Impl ;
    public final void rule__QAContainerOptions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:802:1: ( rule__QAContainerOptions__Group__3__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:803:2: rule__QAContainerOptions__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group__3__Impl_in_rule__QAContainerOptions__Group__31630);
            rule__QAContainerOptions__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QAContainerOptions__Group__3"


    // $ANTLR start "rule__QAContainerOptions__Group__3__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:809:1: rule__QAContainerOptions__Group__3__Impl : ( ( rule__QAContainerOptions__Group_3__0 )? ) ;
    public final void rule__QAContainerOptions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:813:1: ( ( ( rule__QAContainerOptions__Group_3__0 )? ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:814:1: ( ( rule__QAContainerOptions__Group_3__0 )? )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:814:1: ( ( rule__QAContainerOptions__Group_3__0 )? )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:815:1: ( rule__QAContainerOptions__Group_3__0 )?
            {
             before(grammarAccess.getQAContainerOptionsAccess().getGroup_3()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:816:1: ( rule__QAContainerOptions__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:816:2: rule__QAContainerOptions__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group_3__0_in_rule__QAContainerOptions__Group__3__Impl1657);
                    rule__QAContainerOptions__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQAContainerOptionsAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QAContainerOptions__Group__3__Impl"


    // $ANTLR start "rule__QAContainerOptions__Group_3__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:834:1: rule__QAContainerOptions__Group_3__0 : rule__QAContainerOptions__Group_3__0__Impl rule__QAContainerOptions__Group_3__1 ;
    public final void rule__QAContainerOptions__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:838:1: ( rule__QAContainerOptions__Group_3__0__Impl rule__QAContainerOptions__Group_3__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:839:2: rule__QAContainerOptions__Group_3__0__Impl rule__QAContainerOptions__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group_3__0__Impl_in_rule__QAContainerOptions__Group_3__01696);
            rule__QAContainerOptions__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group_3__1_in_rule__QAContainerOptions__Group_3__01699);
            rule__QAContainerOptions__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QAContainerOptions__Group_3__0"


    // $ANTLR start "rule__QAContainerOptions__Group_3__0__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:846:1: rule__QAContainerOptions__Group_3__0__Impl : ( ( rule__QAContainerOptions__RevealAnswerAssignment_3_0 ) ) ;
    public final void rule__QAContainerOptions__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:850:1: ( ( ( rule__QAContainerOptions__RevealAnswerAssignment_3_0 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:851:1: ( ( rule__QAContainerOptions__RevealAnswerAssignment_3_0 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:851:1: ( ( rule__QAContainerOptions__RevealAnswerAssignment_3_0 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:852:1: ( rule__QAContainerOptions__RevealAnswerAssignment_3_0 )
            {
             before(grammarAccess.getQAContainerOptionsAccess().getRevealAnswerAssignment_3_0()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:853:1: ( rule__QAContainerOptions__RevealAnswerAssignment_3_0 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:853:2: rule__QAContainerOptions__RevealAnswerAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__RevealAnswerAssignment_3_0_in_rule__QAContainerOptions__Group_3__0__Impl1726);
            rule__QAContainerOptions__RevealAnswerAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getQAContainerOptionsAccess().getRevealAnswerAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QAContainerOptions__Group_3__0__Impl"


    // $ANTLR start "rule__QAContainerOptions__Group_3__1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:863:1: rule__QAContainerOptions__Group_3__1 : rule__QAContainerOptions__Group_3__1__Impl rule__QAContainerOptions__Group_3__2 ;
    public final void rule__QAContainerOptions__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:867:1: ( rule__QAContainerOptions__Group_3__1__Impl rule__QAContainerOptions__Group_3__2 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:868:2: rule__QAContainerOptions__Group_3__1__Impl rule__QAContainerOptions__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group_3__1__Impl_in_rule__QAContainerOptions__Group_3__11756);
            rule__QAContainerOptions__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group_3__2_in_rule__QAContainerOptions__Group_3__11759);
            rule__QAContainerOptions__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QAContainerOptions__Group_3__1"


    // $ANTLR start "rule__QAContainerOptions__Group_3__1__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:875:1: rule__QAContainerOptions__Group_3__1__Impl : ( 'correct' ) ;
    public final void rule__QAContainerOptions__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:879:1: ( ( 'correct' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:880:1: ( 'correct' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:880:1: ( 'correct' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:881:1: 'correct'
            {
             before(grammarAccess.getQAContainerOptionsAccess().getCorrectKeyword_3_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__QAContainerOptions__Group_3__1__Impl1787); 
             after(grammarAccess.getQAContainerOptionsAccess().getCorrectKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QAContainerOptions__Group_3__1__Impl"


    // $ANTLR start "rule__QAContainerOptions__Group_3__2"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:894:1: rule__QAContainerOptions__Group_3__2 : rule__QAContainerOptions__Group_3__2__Impl ;
    public final void rule__QAContainerOptions__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:898:1: ( rule__QAContainerOptions__Group_3__2__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:899:2: rule__QAContainerOptions__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group_3__2__Impl_in_rule__QAContainerOptions__Group_3__21818);
            rule__QAContainerOptions__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QAContainerOptions__Group_3__2"


    // $ANTLR start "rule__QAContainerOptions__Group_3__2__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:905:1: rule__QAContainerOptions__Group_3__2__Impl : ( 'answer' ) ;
    public final void rule__QAContainerOptions__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:909:1: ( ( 'answer' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:910:1: ( 'answer' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:910:1: ( 'answer' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:911:1: 'answer'
            {
             before(grammarAccess.getQAContainerOptionsAccess().getAnswerKeyword_3_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__QAContainerOptions__Group_3__2__Impl1846); 
             after(grammarAccess.getQAContainerOptionsAccess().getAnswerKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QAContainerOptions__Group_3__2__Impl"


    // $ANTLR start "rule__Question__Group__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:930:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:934:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:935:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__01883);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__1_in_rule__Question__Group__01886);
            rule__Question__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0"


    // $ANTLR start "rule__Question__Group__0__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:942:1: rule__Question__Group__0__Impl : ( ( rule__Question__TextAssignment_0 ) ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:946:1: ( ( ( rule__Question__TextAssignment_0 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:947:1: ( ( rule__Question__TextAssignment_0 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:947:1: ( ( rule__Question__TextAssignment_0 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:948:1: ( rule__Question__TextAssignment_0 )
            {
             before(grammarAccess.getQuestionAccess().getTextAssignment_0()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:949:1: ( rule__Question__TextAssignment_0 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:949:2: rule__Question__TextAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__TextAssignment_0_in_rule__Question__Group__0__Impl1913);
            rule__Question__TextAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getTextAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0__Impl"


    // $ANTLR start "rule__Question__Group__1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:959:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:963:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:964:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__11943);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__2_in_rule__Question__Group__11946);
            rule__Question__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1"


    // $ANTLR start "rule__Question__Group__1__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:971:1: rule__Question__Group__1__Impl : ( '?' ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:975:1: ( ( '?' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:976:1: ( '?' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:976:1: ( '?' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:977:1: '?'
            {
             before(grammarAccess.getQuestionAccess().getQuestionMarkKeyword_1()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Question__Group__1__Impl1974); 
             after(grammarAccess.getQuestionAccess().getQuestionMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1__Impl"


    // $ANTLR start "rule__Question__Group__2"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:990:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:994:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:995:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__22005);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__3_in_rule__Question__Group__22008);
            rule__Question__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2"


    // $ANTLR start "rule__Question__Group__2__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1002:1: rule__Question__Group__2__Impl : ( ( rule__Question__CorrectAssignment_2 ) ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1006:1: ( ( ( rule__Question__CorrectAssignment_2 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1007:1: ( ( rule__Question__CorrectAssignment_2 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1007:1: ( ( rule__Question__CorrectAssignment_2 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1008:1: ( rule__Question__CorrectAssignment_2 )
            {
             before(grammarAccess.getQuestionAccess().getCorrectAssignment_2()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1009:1: ( rule__Question__CorrectAssignment_2 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1009:2: rule__Question__CorrectAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__CorrectAssignment_2_in_rule__Question__Group__2__Impl2035);
            rule__Question__CorrectAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getCorrectAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2__Impl"


    // $ANTLR start "rule__Question__Group__3"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1019:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1023:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1024:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__32065);
            rule__Question__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__4_in_rule__Question__Group__32068);
            rule__Question__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__3"


    // $ANTLR start "rule__Question__Group__3__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1031:1: rule__Question__Group__3__Impl : ( '!' ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1035:1: ( ( '!' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1036:1: ( '!' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1036:1: ( '!' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1037:1: '!'
            {
             before(grammarAccess.getQuestionAccess().getExclamationMarkKeyword_3()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Question__Group__3__Impl2096); 
             after(grammarAccess.getQuestionAccess().getExclamationMarkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__3__Impl"


    // $ANTLR start "rule__Question__Group__4"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1050:1: rule__Question__Group__4 : rule__Question__Group__4__Impl ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1054:1: ( rule__Question__Group__4__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1055:2: rule__Question__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__42127);
            rule__Question__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__4"


    // $ANTLR start "rule__Question__Group__4__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1061:1: rule__Question__Group__4__Impl : ( ( rule__Question__Group_4__0 )? ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1065:1: ( ( ( rule__Question__Group_4__0 )? ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1066:1: ( ( rule__Question__Group_4__0 )? )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1066:1: ( ( rule__Question__Group_4__0 )? )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1067:1: ( rule__Question__Group_4__0 )?
            {
             before(grammarAccess.getQuestionAccess().getGroup_4()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1068:1: ( rule__Question__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1068:2: rule__Question__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Question__Group_4__0_in_rule__Question__Group__4__Impl2154);
                    rule__Question__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__4__Impl"


    // $ANTLR start "rule__Question__Group_4__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1088:1: rule__Question__Group_4__0 : rule__Question__Group_4__0__Impl rule__Question__Group_4__1 ;
    public final void rule__Question__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1092:1: ( rule__Question__Group_4__0__Impl rule__Question__Group_4__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1093:2: rule__Question__Group_4__0__Impl rule__Question__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group_4__0__Impl_in_rule__Question__Group_4__02195);
            rule__Question__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group_4__1_in_rule__Question__Group_4__02198);
            rule__Question__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_4__0"


    // $ANTLR start "rule__Question__Group_4__0__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1100:1: rule__Question__Group_4__0__Impl : ( 'Candidates: ' ) ;
    public final void rule__Question__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1104:1: ( ( 'Candidates: ' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1105:1: ( 'Candidates: ' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1105:1: ( 'Candidates: ' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1106:1: 'Candidates: '
            {
             before(grammarAccess.getQuestionAccess().getCandidatesKeyword_4_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Question__Group_4__0__Impl2226); 
             after(grammarAccess.getQuestionAccess().getCandidatesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_4__0__Impl"


    // $ANTLR start "rule__Question__Group_4__1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1119:1: rule__Question__Group_4__1 : rule__Question__Group_4__1__Impl rule__Question__Group_4__2 ;
    public final void rule__Question__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1123:1: ( rule__Question__Group_4__1__Impl rule__Question__Group_4__2 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1124:2: rule__Question__Group_4__1__Impl rule__Question__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group_4__1__Impl_in_rule__Question__Group_4__12257);
            rule__Question__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group_4__2_in_rule__Question__Group_4__12260);
            rule__Question__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_4__1"


    // $ANTLR start "rule__Question__Group_4__1__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1131:1: rule__Question__Group_4__1__Impl : ( ( rule__Question__CandidatesAssignment_4_1 ) ) ;
    public final void rule__Question__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1135:1: ( ( ( rule__Question__CandidatesAssignment_4_1 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1136:1: ( ( rule__Question__CandidatesAssignment_4_1 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1136:1: ( ( rule__Question__CandidatesAssignment_4_1 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1137:1: ( rule__Question__CandidatesAssignment_4_1 )
            {
             before(grammarAccess.getQuestionAccess().getCandidatesAssignment_4_1()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1138:1: ( rule__Question__CandidatesAssignment_4_1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1138:2: rule__Question__CandidatesAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__CandidatesAssignment_4_1_in_rule__Question__Group_4__1__Impl2287);
            rule__Question__CandidatesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getCandidatesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_4__1__Impl"


    // $ANTLR start "rule__Question__Group_4__2"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1148:1: rule__Question__Group_4__2 : rule__Question__Group_4__2__Impl ;
    public final void rule__Question__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1152:1: ( rule__Question__Group_4__2__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1153:2: rule__Question__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group_4__2__Impl_in_rule__Question__Group_4__22317);
            rule__Question__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_4__2"


    // $ANTLR start "rule__Question__Group_4__2__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1159:1: rule__Question__Group_4__2__Impl : ( ( rule__Question__Group_4_2__0 )* ) ;
    public final void rule__Question__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1163:1: ( ( ( rule__Question__Group_4_2__0 )* ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1164:1: ( ( rule__Question__Group_4_2__0 )* )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1164:1: ( ( rule__Question__Group_4_2__0 )* )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1165:1: ( rule__Question__Group_4_2__0 )*
            {
             before(grammarAccess.getQuestionAccess().getGroup_4_2()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1166:1: ( rule__Question__Group_4_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1166:2: rule__Question__Group_4_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Question__Group_4_2__0_in_rule__Question__Group_4__2__Impl2344);
            	    rule__Question__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getQuestionAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_4__2__Impl"


    // $ANTLR start "rule__Question__Group_4_2__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1182:1: rule__Question__Group_4_2__0 : rule__Question__Group_4_2__0__Impl rule__Question__Group_4_2__1 ;
    public final void rule__Question__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1186:1: ( rule__Question__Group_4_2__0__Impl rule__Question__Group_4_2__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1187:2: rule__Question__Group_4_2__0__Impl rule__Question__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group_4_2__0__Impl_in_rule__Question__Group_4_2__02381);
            rule__Question__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group_4_2__1_in_rule__Question__Group_4_2__02384);
            rule__Question__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_4_2__0"


    // $ANTLR start "rule__Question__Group_4_2__0__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1194:1: rule__Question__Group_4_2__0__Impl : ( ', ' ) ;
    public final void rule__Question__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1198:1: ( ( ', ' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1199:1: ( ', ' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1199:1: ( ', ' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1200:1: ', '
            {
             before(grammarAccess.getQuestionAccess().getCommaSpaceKeyword_4_2_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Question__Group_4_2__0__Impl2412); 
             after(grammarAccess.getQuestionAccess().getCommaSpaceKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_4_2__0__Impl"


    // $ANTLR start "rule__Question__Group_4_2__1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1213:1: rule__Question__Group_4_2__1 : rule__Question__Group_4_2__1__Impl ;
    public final void rule__Question__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1217:1: ( rule__Question__Group_4_2__1__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1218:2: rule__Question__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group_4_2__1__Impl_in_rule__Question__Group_4_2__12443);
            rule__Question__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_4_2__1"


    // $ANTLR start "rule__Question__Group_4_2__1__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1224:1: rule__Question__Group_4_2__1__Impl : ( ( rule__Question__CandidatesAssignment_4_2_1 ) ) ;
    public final void rule__Question__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1228:1: ( ( ( rule__Question__CandidatesAssignment_4_2_1 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1229:1: ( ( rule__Question__CandidatesAssignment_4_2_1 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1229:1: ( ( rule__Question__CandidatesAssignment_4_2_1 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1230:1: ( rule__Question__CandidatesAssignment_4_2_1 )
            {
             before(grammarAccess.getQuestionAccess().getCandidatesAssignment_4_2_1()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1231:1: ( rule__Question__CandidatesAssignment_4_2_1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1231:2: rule__Question__CandidatesAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__CandidatesAssignment_4_2_1_in_rule__Question__Group_4_2__1__Impl2470);
            rule__Question__CandidatesAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getCandidatesAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_4_2__1__Impl"


    // $ANTLR start "rule__QASection__Group__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1245:1: rule__QASection__Group__0 : rule__QASection__Group__0__Impl rule__QASection__Group__1 ;
    public final void rule__QASection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1249:1: ( rule__QASection__Group__0__Impl rule__QASection__Group__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1250:2: rule__QASection__Group__0__Impl rule__QASection__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QASection__Group__0__Impl_in_rule__QASection__Group__02504);
            rule__QASection__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QASection__Group__1_in_rule__QASection__Group__02507);
            rule__QASection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QASection__Group__0"


    // $ANTLR start "rule__QASection__Group__0__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1257:1: rule__QASection__Group__0__Impl : ( 'Section ' ) ;
    public final void rule__QASection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1261:1: ( ( 'Section ' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1262:1: ( 'Section ' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1262:1: ( 'Section ' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1263:1: 'Section '
            {
             before(grammarAccess.getQASectionAccess().getSectionKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__QASection__Group__0__Impl2535); 
             after(grammarAccess.getQASectionAccess().getSectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QASection__Group__0__Impl"


    // $ANTLR start "rule__QASection__Group__1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1276:1: rule__QASection__Group__1 : rule__QASection__Group__1__Impl rule__QASection__Group__2 ;
    public final void rule__QASection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1280:1: ( rule__QASection__Group__1__Impl rule__QASection__Group__2 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1281:2: rule__QASection__Group__1__Impl rule__QASection__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QASection__Group__1__Impl_in_rule__QASection__Group__12566);
            rule__QASection__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QASection__Group__2_in_rule__QASection__Group__12569);
            rule__QASection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QASection__Group__1"


    // $ANTLR start "rule__QASection__Group__1__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1288:1: rule__QASection__Group__1__Impl : ( ( rule__QASection__NameAssignment_1 ) ) ;
    public final void rule__QASection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1292:1: ( ( ( rule__QASection__NameAssignment_1 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1293:1: ( ( rule__QASection__NameAssignment_1 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1293:1: ( ( rule__QASection__NameAssignment_1 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1294:1: ( rule__QASection__NameAssignment_1 )
            {
             before(grammarAccess.getQASectionAccess().getNameAssignment_1()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1295:1: ( rule__QASection__NameAssignment_1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1295:2: rule__QASection__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QASection__NameAssignment_1_in_rule__QASection__Group__1__Impl2596);
            rule__QASection__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQASectionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QASection__Group__1__Impl"


    // $ANTLR start "rule__QASection__Group__2"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1305:1: rule__QASection__Group__2 : rule__QASection__Group__2__Impl rule__QASection__Group__3 ;
    public final void rule__QASection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1309:1: ( rule__QASection__Group__2__Impl rule__QASection__Group__3 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1310:2: rule__QASection__Group__2__Impl rule__QASection__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QASection__Group__2__Impl_in_rule__QASection__Group__22626);
            rule__QASection__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QASection__Group__3_in_rule__QASection__Group__22629);
            rule__QASection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QASection__Group__2"


    // $ANTLR start "rule__QASection__Group__2__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1317:1: rule__QASection__Group__2__Impl : ( '{' ) ;
    public final void rule__QASection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1321:1: ( ( '{' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1322:1: ( '{' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1322:1: ( '{' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1323:1: '{'
            {
             before(grammarAccess.getQASectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__QASection__Group__2__Impl2657); 
             after(grammarAccess.getQASectionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QASection__Group__2__Impl"


    // $ANTLR start "rule__QASection__Group__3"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1336:1: rule__QASection__Group__3 : rule__QASection__Group__3__Impl rule__QASection__Group__4 ;
    public final void rule__QASection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1340:1: ( rule__QASection__Group__3__Impl rule__QASection__Group__4 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1341:2: rule__QASection__Group__3__Impl rule__QASection__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__QASection__Group__3__Impl_in_rule__QASection__Group__32688);
            rule__QASection__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QASection__Group__4_in_rule__QASection__Group__32691);
            rule__QASection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QASection__Group__3"


    // $ANTLR start "rule__QASection__Group__3__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1348:1: rule__QASection__Group__3__Impl : ( ( rule__QASection__OptionsAssignment_3 )? ) ;
    public final void rule__QASection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1352:1: ( ( ( rule__QASection__OptionsAssignment_3 )? ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1353:1: ( ( rule__QASection__OptionsAssignment_3 )? )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1353:1: ( ( rule__QASection__OptionsAssignment_3 )? )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1354:1: ( rule__QASection__OptionsAssignment_3 )?
            {
             before(grammarAccess.getQASectionAccess().getOptionsAssignment_3()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1355:1: ( rule__QASection__OptionsAssignment_3 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1355:2: rule__QASection__OptionsAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__QASection__OptionsAssignment_3_in_rule__QASection__Group__3__Impl2718);
                    rule__QASection__OptionsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQASectionAccess().getOptionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QASection__Group__3__Impl"


    // $ANTLR start "rule__QASection__Group__4"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1365:1: rule__QASection__Group__4 : rule__QASection__Group__4__Impl rule__QASection__Group__5 ;
    public final void rule__QASection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1369:1: ( rule__QASection__Group__4__Impl rule__QASection__Group__5 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1370:2: rule__QASection__Group__4__Impl rule__QASection__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__QASection__Group__4__Impl_in_rule__QASection__Group__42749);
            rule__QASection__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QASection__Group__5_in_rule__QASection__Group__42752);
            rule__QASection__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QASection__Group__4"


    // $ANTLR start "rule__QASection__Group__4__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1377:1: rule__QASection__Group__4__Impl : ( ( rule__QASection__QuestionsAssignment_4 )* ) ;
    public final void rule__QASection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1381:1: ( ( ( rule__QASection__QuestionsAssignment_4 )* ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1382:1: ( ( rule__QASection__QuestionsAssignment_4 )* )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1382:1: ( ( rule__QASection__QuestionsAssignment_4 )* )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1383:1: ( rule__QASection__QuestionsAssignment_4 )*
            {
             before(grammarAccess.getQASectionAccess().getQuestionsAssignment_4()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1384:1: ( rule__QASection__QuestionsAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_STRING) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1384:2: rule__QASection__QuestionsAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QASection__QuestionsAssignment_4_in_rule__QASection__Group__4__Impl2779);
            	    rule__QASection__QuestionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getQASectionAccess().getQuestionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QASection__Group__4__Impl"


    // $ANTLR start "rule__QASection__Group__5"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1394:1: rule__QASection__Group__5 : rule__QASection__Group__5__Impl ;
    public final void rule__QASection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1398:1: ( rule__QASection__Group__5__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1399:2: rule__QASection__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QASection__Group__5__Impl_in_rule__QASection__Group__52810);
            rule__QASection__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QASection__Group__5"


    // $ANTLR start "rule__QASection__Group__5__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1405:1: rule__QASection__Group__5__Impl : ( '}' ) ;
    public final void rule__QASection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1409:1: ( ( '}' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1410:1: ( '}' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1410:1: ( '}' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1411:1: '}'
            {
             before(grammarAccess.getQASectionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__QASection__Group__5__Impl2838); 
             after(grammarAccess.getQASectionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QASection__Group__5__Impl"


    // $ANTLR start "rule__ExpressionAnswer__Group__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1436:1: rule__ExpressionAnswer__Group__0 : rule__ExpressionAnswer__Group__0__Impl rule__ExpressionAnswer__Group__1 ;
    public final void rule__ExpressionAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1440:1: ( rule__ExpressionAnswer__Group__0__Impl rule__ExpressionAnswer__Group__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1441:2: rule__ExpressionAnswer__Group__0__Impl rule__ExpressionAnswer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionAnswer__Group__0__Impl_in_rule__ExpressionAnswer__Group__02881);
            rule__ExpressionAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpressionAnswer__Group__1_in_rule__ExpressionAnswer__Group__02884);
            rule__ExpressionAnswer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAnswer__Group__0"


    // $ANTLR start "rule__ExpressionAnswer__Group__0__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1448:1: rule__ExpressionAnswer__Group__0__Impl : ( '=' ) ;
    public final void rule__ExpressionAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1452:1: ( ( '=' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1453:1: ( '=' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1453:1: ( '=' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1454:1: '='
            {
             before(grammarAccess.getExpressionAnswerAccess().getEqualsSignKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ExpressionAnswer__Group__0__Impl2912); 
             after(grammarAccess.getExpressionAnswerAccess().getEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAnswer__Group__0__Impl"


    // $ANTLR start "rule__ExpressionAnswer__Group__1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1467:1: rule__ExpressionAnswer__Group__1 : rule__ExpressionAnswer__Group__1__Impl rule__ExpressionAnswer__Group__2 ;
    public final void rule__ExpressionAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1471:1: ( rule__ExpressionAnswer__Group__1__Impl rule__ExpressionAnswer__Group__2 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1472:2: rule__ExpressionAnswer__Group__1__Impl rule__ExpressionAnswer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionAnswer__Group__1__Impl_in_rule__ExpressionAnswer__Group__12943);
            rule__ExpressionAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpressionAnswer__Group__2_in_rule__ExpressionAnswer__Group__12946);
            rule__ExpressionAnswer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAnswer__Group__1"


    // $ANTLR start "rule__ExpressionAnswer__Group__1__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1479:1: rule__ExpressionAnswer__Group__1__Impl : ( ( rule__ExpressionAnswer__ExpressionAssignment_1 ) ) ;
    public final void rule__ExpressionAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1483:1: ( ( ( rule__ExpressionAnswer__ExpressionAssignment_1 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1484:1: ( ( rule__ExpressionAnswer__ExpressionAssignment_1 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1484:1: ( ( rule__ExpressionAnswer__ExpressionAssignment_1 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1485:1: ( rule__ExpressionAnswer__ExpressionAssignment_1 )
            {
             before(grammarAccess.getExpressionAnswerAccess().getExpressionAssignment_1()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1486:1: ( rule__ExpressionAnswer__ExpressionAssignment_1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1486:2: rule__ExpressionAnswer__ExpressionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionAnswer__ExpressionAssignment_1_in_rule__ExpressionAnswer__Group__1__Impl2973);
            rule__ExpressionAnswer__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAnswerAccess().getExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAnswer__Group__1__Impl"


    // $ANTLR start "rule__ExpressionAnswer__Group__2"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1496:1: rule__ExpressionAnswer__Group__2 : rule__ExpressionAnswer__Group__2__Impl ;
    public final void rule__ExpressionAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1500:1: ( rule__ExpressionAnswer__Group__2__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1501:2: rule__ExpressionAnswer__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionAnswer__Group__2__Impl_in_rule__ExpressionAnswer__Group__23003);
            rule__ExpressionAnswer__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAnswer__Group__2"


    // $ANTLR start "rule__ExpressionAnswer__Group__2__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1507:1: rule__ExpressionAnswer__Group__2__Impl : ( ( rule__ExpressionAnswer__Group_2__0 )? ) ;
    public final void rule__ExpressionAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1511:1: ( ( ( rule__ExpressionAnswer__Group_2__0 )? ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1512:1: ( ( rule__ExpressionAnswer__Group_2__0 )? )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1512:1: ( ( rule__ExpressionAnswer__Group_2__0 )? )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1513:1: ( rule__ExpressionAnswer__Group_2__0 )?
            {
             before(grammarAccess.getExpressionAnswerAccess().getGroup_2()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1514:1: ( rule__ExpressionAnswer__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1514:2: rule__ExpressionAnswer__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ExpressionAnswer__Group_2__0_in_rule__ExpressionAnswer__Group__2__Impl3030);
                    rule__ExpressionAnswer__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAnswerAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAnswer__Group__2__Impl"


    // $ANTLR start "rule__ExpressionAnswer__Group_2__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1530:1: rule__ExpressionAnswer__Group_2__0 : rule__ExpressionAnswer__Group_2__0__Impl rule__ExpressionAnswer__Group_2__1 ;
    public final void rule__ExpressionAnswer__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1534:1: ( rule__ExpressionAnswer__Group_2__0__Impl rule__ExpressionAnswer__Group_2__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1535:2: rule__ExpressionAnswer__Group_2__0__Impl rule__ExpressionAnswer__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionAnswer__Group_2__0__Impl_in_rule__ExpressionAnswer__Group_2__03067);
            rule__ExpressionAnswer__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpressionAnswer__Group_2__1_in_rule__ExpressionAnswer__Group_2__03070);
            rule__ExpressionAnswer__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAnswer__Group_2__0"


    // $ANTLR start "rule__ExpressionAnswer__Group_2__0__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1542:1: rule__ExpressionAnswer__Group_2__0__Impl : ( '+-' ) ;
    public final void rule__ExpressionAnswer__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1546:1: ( ( '+-' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1547:1: ( '+-' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1547:1: ( '+-' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1548:1: '+-'
            {
             before(grammarAccess.getExpressionAnswerAccess().getPlusSignHyphenMinusKeyword_2_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__ExpressionAnswer__Group_2__0__Impl3098); 
             after(grammarAccess.getExpressionAnswerAccess().getPlusSignHyphenMinusKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAnswer__Group_2__0__Impl"


    // $ANTLR start "rule__ExpressionAnswer__Group_2__1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1561:1: rule__ExpressionAnswer__Group_2__1 : rule__ExpressionAnswer__Group_2__1__Impl ;
    public final void rule__ExpressionAnswer__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1565:1: ( rule__ExpressionAnswer__Group_2__1__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1566:2: rule__ExpressionAnswer__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionAnswer__Group_2__1__Impl_in_rule__ExpressionAnswer__Group_2__13129);
            rule__ExpressionAnswer__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAnswer__Group_2__1"


    // $ANTLR start "rule__ExpressionAnswer__Group_2__1__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1572:1: rule__ExpressionAnswer__Group_2__1__Impl : ( ( rule__ExpressionAnswer__EpsilonAssignment_2_1 ) ) ;
    public final void rule__ExpressionAnswer__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1576:1: ( ( ( rule__ExpressionAnswer__EpsilonAssignment_2_1 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1577:1: ( ( rule__ExpressionAnswer__EpsilonAssignment_2_1 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1577:1: ( ( rule__ExpressionAnswer__EpsilonAssignment_2_1 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1578:1: ( rule__ExpressionAnswer__EpsilonAssignment_2_1 )
            {
             before(grammarAccess.getExpressionAnswerAccess().getEpsilonAssignment_2_1()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1579:1: ( rule__ExpressionAnswer__EpsilonAssignment_2_1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1579:2: rule__ExpressionAnswer__EpsilonAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionAnswer__EpsilonAssignment_2_1_in_rule__ExpressionAnswer__Group_2__1__Impl3156);
            rule__ExpressionAnswer__EpsilonAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAnswerAccess().getEpsilonAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAnswer__Group_2__1__Impl"


    // $ANTLR start "rule__OptionAnswer__Group__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1593:1: rule__OptionAnswer__Group__0 : rule__OptionAnswer__Group__0__Impl rule__OptionAnswer__Group__1 ;
    public final void rule__OptionAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1597:1: ( rule__OptionAnswer__Group__0__Impl rule__OptionAnswer__Group__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1598:2: rule__OptionAnswer__Group__0__Impl rule__OptionAnswer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OptionAnswer__Group__0__Impl_in_rule__OptionAnswer__Group__03190);
            rule__OptionAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OptionAnswer__Group__1_in_rule__OptionAnswer__Group__03193);
            rule__OptionAnswer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionAnswer__Group__0"


    // $ANTLR start "rule__OptionAnswer__Group__0__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1605:1: rule__OptionAnswer__Group__0__Impl : ( '#' ) ;
    public final void rule__OptionAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1609:1: ( ( '#' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1610:1: ( '#' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1610:1: ( '#' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1611:1: '#'
            {
             before(grammarAccess.getOptionAnswerAccess().getNumberSignKeyword_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__OptionAnswer__Group__0__Impl3221); 
             after(grammarAccess.getOptionAnswerAccess().getNumberSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionAnswer__Group__0__Impl"


    // $ANTLR start "rule__OptionAnswer__Group__1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1624:1: rule__OptionAnswer__Group__1 : rule__OptionAnswer__Group__1__Impl ;
    public final void rule__OptionAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1628:1: ( rule__OptionAnswer__Group__1__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1629:2: rule__OptionAnswer__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OptionAnswer__Group__1__Impl_in_rule__OptionAnswer__Group__13252);
            rule__OptionAnswer__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionAnswer__Group__1"


    // $ANTLR start "rule__OptionAnswer__Group__1__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1635:1: rule__OptionAnswer__Group__1__Impl : ( ( rule__OptionAnswer__OptionNumberAssignment_1 ) ) ;
    public final void rule__OptionAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1639:1: ( ( ( rule__OptionAnswer__OptionNumberAssignment_1 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1640:1: ( ( rule__OptionAnswer__OptionNumberAssignment_1 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1640:1: ( ( rule__OptionAnswer__OptionNumberAssignment_1 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1641:1: ( rule__OptionAnswer__OptionNumberAssignment_1 )
            {
             before(grammarAccess.getOptionAnswerAccess().getOptionNumberAssignment_1()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1642:1: ( rule__OptionAnswer__OptionNumberAssignment_1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1642:2: rule__OptionAnswer__OptionNumberAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OptionAnswer__OptionNumberAssignment_1_in_rule__OptionAnswer__Group__1__Impl3279);
            rule__OptionAnswer__OptionNumberAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionAnswerAccess().getOptionNumberAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionAnswer__Group__1__Impl"


    // $ANTLR start "rule__NumberAnswer__Group_0__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1656:1: rule__NumberAnswer__Group_0__0 : rule__NumberAnswer__Group_0__0__Impl rule__NumberAnswer__Group_0__1 ;
    public final void rule__NumberAnswer__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1660:1: ( rule__NumberAnswer__Group_0__0__Impl rule__NumberAnswer__Group_0__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1661:2: rule__NumberAnswer__Group_0__0__Impl rule__NumberAnswer__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__Group_0__0__Impl_in_rule__NumberAnswer__Group_0__03313);
            rule__NumberAnswer__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__Group_0__1_in_rule__NumberAnswer__Group_0__03316);
            rule__NumberAnswer__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberAnswer__Group_0__0"


    // $ANTLR start "rule__NumberAnswer__Group_0__0__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1668:1: rule__NumberAnswer__Group_0__0__Impl : ( ( rule__NumberAnswer__NumberAssignment_0_0 ) ) ;
    public final void rule__NumberAnswer__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1672:1: ( ( ( rule__NumberAnswer__NumberAssignment_0_0 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1673:1: ( ( rule__NumberAnswer__NumberAssignment_0_0 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1673:1: ( ( rule__NumberAnswer__NumberAssignment_0_0 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1674:1: ( rule__NumberAnswer__NumberAssignment_0_0 )
            {
             before(grammarAccess.getNumberAnswerAccess().getNumberAssignment_0_0()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1675:1: ( rule__NumberAnswer__NumberAssignment_0_0 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1675:2: rule__NumberAnswer__NumberAssignment_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__NumberAssignment_0_0_in_rule__NumberAnswer__Group_0__0__Impl3343);
            rule__NumberAnswer__NumberAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAnswerAccess().getNumberAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberAnswer__Group_0__0__Impl"


    // $ANTLR start "rule__NumberAnswer__Group_0__1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1685:1: rule__NumberAnswer__Group_0__1 : rule__NumberAnswer__Group_0__1__Impl ;
    public final void rule__NumberAnswer__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1689:1: ( rule__NumberAnswer__Group_0__1__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1690:2: rule__NumberAnswer__Group_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__Group_0__1__Impl_in_rule__NumberAnswer__Group_0__13373);
            rule__NumberAnswer__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberAnswer__Group_0__1"


    // $ANTLR start "rule__NumberAnswer__Group_0__1__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1696:1: rule__NumberAnswer__Group_0__1__Impl : ( ( rule__NumberAnswer__Group_0_1__0 )? ) ;
    public final void rule__NumberAnswer__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1700:1: ( ( ( rule__NumberAnswer__Group_0_1__0 )? ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1701:1: ( ( rule__NumberAnswer__Group_0_1__0 )? )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1701:1: ( ( rule__NumberAnswer__Group_0_1__0 )? )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1702:1: ( rule__NumberAnswer__Group_0_1__0 )?
            {
             before(grammarAccess.getNumberAnswerAccess().getGroup_0_1()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1703:1: ( rule__NumberAnswer__Group_0_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1703:2: rule__NumberAnswer__Group_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__Group_0_1__0_in_rule__NumberAnswer__Group_0__1__Impl3400);
                    rule__NumberAnswer__Group_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberAnswerAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberAnswer__Group_0__1__Impl"


    // $ANTLR start "rule__NumberAnswer__Group_0_1__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1717:1: rule__NumberAnswer__Group_0_1__0 : rule__NumberAnswer__Group_0_1__0__Impl rule__NumberAnswer__Group_0_1__1 ;
    public final void rule__NumberAnswer__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1721:1: ( rule__NumberAnswer__Group_0_1__0__Impl rule__NumberAnswer__Group_0_1__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1722:2: rule__NumberAnswer__Group_0_1__0__Impl rule__NumberAnswer__Group_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__Group_0_1__0__Impl_in_rule__NumberAnswer__Group_0_1__03435);
            rule__NumberAnswer__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__Group_0_1__1_in_rule__NumberAnswer__Group_0_1__03438);
            rule__NumberAnswer__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberAnswer__Group_0_1__0"


    // $ANTLR start "rule__NumberAnswer__Group_0_1__0__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1729:1: rule__NumberAnswer__Group_0_1__0__Impl : ( '+-' ) ;
    public final void rule__NumberAnswer__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1733:1: ( ( '+-' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1734:1: ( '+-' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1734:1: ( '+-' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1735:1: '+-'
            {
             before(grammarAccess.getNumberAnswerAccess().getPlusSignHyphenMinusKeyword_0_1_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__NumberAnswer__Group_0_1__0__Impl3466); 
             after(grammarAccess.getNumberAnswerAccess().getPlusSignHyphenMinusKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberAnswer__Group_0_1__0__Impl"


    // $ANTLR start "rule__NumberAnswer__Group_0_1__1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1748:1: rule__NumberAnswer__Group_0_1__1 : rule__NumberAnswer__Group_0_1__1__Impl ;
    public final void rule__NumberAnswer__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1752:1: ( rule__NumberAnswer__Group_0_1__1__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1753:2: rule__NumberAnswer__Group_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__Group_0_1__1__Impl_in_rule__NumberAnswer__Group_0_1__13497);
            rule__NumberAnswer__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberAnswer__Group_0_1__1"


    // $ANTLR start "rule__NumberAnswer__Group_0_1__1__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1759:1: rule__NumberAnswer__Group_0_1__1__Impl : ( ( rule__NumberAnswer__EpsilonAssignment_0_1_1 ) ) ;
    public final void rule__NumberAnswer__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1763:1: ( ( ( rule__NumberAnswer__EpsilonAssignment_0_1_1 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1764:1: ( ( rule__NumberAnswer__EpsilonAssignment_0_1_1 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1764:1: ( ( rule__NumberAnswer__EpsilonAssignment_0_1_1 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1765:1: ( rule__NumberAnswer__EpsilonAssignment_0_1_1 )
            {
             before(grammarAccess.getNumberAnswerAccess().getEpsilonAssignment_0_1_1()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1766:1: ( rule__NumberAnswer__EpsilonAssignment_0_1_1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1766:2: rule__NumberAnswer__EpsilonAssignment_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__EpsilonAssignment_0_1_1_in_rule__NumberAnswer__Group_0_1__1__Impl3524);
            rule__NumberAnswer__EpsilonAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberAnswerAccess().getEpsilonAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberAnswer__Group_0_1__1__Impl"


    // $ANTLR start "rule__YesNoAnswer__Group__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1780:1: rule__YesNoAnswer__Group__0 : rule__YesNoAnswer__Group__0__Impl rule__YesNoAnswer__Group__1 ;
    public final void rule__YesNoAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1784:1: ( rule__YesNoAnswer__Group__0__Impl rule__YesNoAnswer__Group__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1785:2: rule__YesNoAnswer__Group__0__Impl rule__YesNoAnswer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__YesNoAnswer__Group__0__Impl_in_rule__YesNoAnswer__Group__03558);
            rule__YesNoAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__YesNoAnswer__Group__1_in_rule__YesNoAnswer__Group__03561);
            rule__YesNoAnswer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YesNoAnswer__Group__0"


    // $ANTLR start "rule__YesNoAnswer__Group__0__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1792:1: rule__YesNoAnswer__Group__0__Impl : ( () ) ;
    public final void rule__YesNoAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1796:1: ( ( () ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1797:1: ( () )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1797:1: ( () )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1798:1: ()
            {
             before(grammarAccess.getYesNoAnswerAccess().getYesNoAnswerAction_0()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1799:1: ()
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1801:1: 
            {
            }

             after(grammarAccess.getYesNoAnswerAccess().getYesNoAnswerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YesNoAnswer__Group__0__Impl"


    // $ANTLR start "rule__YesNoAnswer__Group__1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1811:1: rule__YesNoAnswer__Group__1 : rule__YesNoAnswer__Group__1__Impl ;
    public final void rule__YesNoAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1815:1: ( rule__YesNoAnswer__Group__1__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1816:2: rule__YesNoAnswer__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__YesNoAnswer__Group__1__Impl_in_rule__YesNoAnswer__Group__13619);
            rule__YesNoAnswer__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YesNoAnswer__Group__1"


    // $ANTLR start "rule__YesNoAnswer__Group__1__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1822:1: rule__YesNoAnswer__Group__1__Impl : ( ( rule__YesNoAnswer__Alternatives_1 ) ) ;
    public final void rule__YesNoAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1826:1: ( ( ( rule__YesNoAnswer__Alternatives_1 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1827:1: ( ( rule__YesNoAnswer__Alternatives_1 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1827:1: ( ( rule__YesNoAnswer__Alternatives_1 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1828:1: ( rule__YesNoAnswer__Alternatives_1 )
            {
             before(grammarAccess.getYesNoAnswerAccess().getAlternatives_1()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1829:1: ( rule__YesNoAnswer__Alternatives_1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1829:2: rule__YesNoAnswer__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__YesNoAnswer__Alternatives_1_in_rule__YesNoAnswer__Group__1__Impl3646);
            rule__YesNoAnswer__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getYesNoAnswerAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YesNoAnswer__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1843:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1847:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1848:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__03680);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__03683);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1855:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1859:1: ( ( ( '-' )? ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1860:1: ( ( '-' )? )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1860:1: ( ( '-' )? )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1861:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1862:1: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1863:2: '-'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__EDouble__Group__0__Impl3712); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1874:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1878:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1879:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__13745);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__13748);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1886:1: rule__EDouble__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1890:1: ( ( RULE_INT ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1891:1: ( RULE_INT )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1891:1: ( RULE_INT )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1892:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl3775); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1903:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1907:1: ( rule__EDouble__Group__2__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1908:2: rule__EDouble__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__23804);
            rule__EDouble__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1914:1: rule__EDouble__Group__2__Impl : ( ( rule__EDouble__Group_2__0 )? ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1918:1: ( ( ( rule__EDouble__Group_2__0 )? ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1919:1: ( ( rule__EDouble__Group_2__0 )? )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1919:1: ( ( rule__EDouble__Group_2__0 )? )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1920:1: ( rule__EDouble__Group_2__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_2()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1921:1: ( rule__EDouble__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1921:2: rule__EDouble__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_2__0_in_rule__EDouble__Group__2__Impl3831);
                    rule__EDouble__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group_2__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1937:1: rule__EDouble__Group_2__0 : rule__EDouble__Group_2__0__Impl rule__EDouble__Group_2__1 ;
    public final void rule__EDouble__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1941:1: ( rule__EDouble__Group_2__0__Impl rule__EDouble__Group_2__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1942:2: rule__EDouble__Group_2__0__Impl rule__EDouble__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_2__0__Impl_in_rule__EDouble__Group_2__03868);
            rule__EDouble__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_2__1_in_rule__EDouble__Group_2__03871);
            rule__EDouble__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_2__0"


    // $ANTLR start "rule__EDouble__Group_2__0__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1949:1: rule__EDouble__Group_2__0__Impl : ( '.' ) ;
    public final void rule__EDouble__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1953:1: ( ( '.' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1954:1: ( '.' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1954:1: ( '.' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1955:1: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__EDouble__Group_2__0__Impl3899); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_2__0__Impl"


    // $ANTLR start "rule__EDouble__Group_2__1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1968:1: rule__EDouble__Group_2__1 : rule__EDouble__Group_2__1__Impl rule__EDouble__Group_2__2 ;
    public final void rule__EDouble__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1972:1: ( rule__EDouble__Group_2__1__Impl rule__EDouble__Group_2__2 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1973:2: rule__EDouble__Group_2__1__Impl rule__EDouble__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_2__1__Impl_in_rule__EDouble__Group_2__13930);
            rule__EDouble__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_2__2_in_rule__EDouble__Group_2__13933);
            rule__EDouble__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_2__1"


    // $ANTLR start "rule__EDouble__Group_2__1__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1980:1: rule__EDouble__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1984:1: ( ( RULE_INT ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1985:1: ( RULE_INT )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1985:1: ( RULE_INT )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1986:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group_2__1__Impl3960); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_2__1__Impl"


    // $ANTLR start "rule__EDouble__Group_2__2"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1997:1: rule__EDouble__Group_2__2 : rule__EDouble__Group_2__2__Impl ;
    public final void rule__EDouble__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2001:1: ( rule__EDouble__Group_2__2__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2002:2: rule__EDouble__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_2__2__Impl_in_rule__EDouble__Group_2__23989);
            rule__EDouble__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_2__2"


    // $ANTLR start "rule__EDouble__Group_2__2__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2008:1: rule__EDouble__Group_2__2__Impl : ( ( rule__EDouble__Group_2_2__0 )? ) ;
    public final void rule__EDouble__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2012:1: ( ( ( rule__EDouble__Group_2_2__0 )? ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2013:1: ( ( rule__EDouble__Group_2_2__0 )? )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2013:1: ( ( rule__EDouble__Group_2_2__0 )? )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2014:1: ( rule__EDouble__Group_2_2__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_2_2()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2015:1: ( rule__EDouble__Group_2_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=12 && LA17_0<=13)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2015:2: rule__EDouble__Group_2_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_2_2__0_in_rule__EDouble__Group_2__2__Impl4016);
                    rule__EDouble__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_2__2__Impl"


    // $ANTLR start "rule__EDouble__Group_2_2__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2031:1: rule__EDouble__Group_2_2__0 : rule__EDouble__Group_2_2__0__Impl rule__EDouble__Group_2_2__1 ;
    public final void rule__EDouble__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2035:1: ( rule__EDouble__Group_2_2__0__Impl rule__EDouble__Group_2_2__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2036:2: rule__EDouble__Group_2_2__0__Impl rule__EDouble__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_2_2__0__Impl_in_rule__EDouble__Group_2_2__04053);
            rule__EDouble__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_2_2__1_in_rule__EDouble__Group_2_2__04056);
            rule__EDouble__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_2_2__0"


    // $ANTLR start "rule__EDouble__Group_2_2__0__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2043:1: rule__EDouble__Group_2_2__0__Impl : ( ( rule__EDouble__Alternatives_2_2_0 ) ) ;
    public final void rule__EDouble__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2047:1: ( ( ( rule__EDouble__Alternatives_2_2_0 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2048:1: ( ( rule__EDouble__Alternatives_2_2_0 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2048:1: ( ( rule__EDouble__Alternatives_2_2_0 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2049:1: ( rule__EDouble__Alternatives_2_2_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_2_2_0()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2050:1: ( rule__EDouble__Alternatives_2_2_0 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2050:2: rule__EDouble__Alternatives_2_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Alternatives_2_2_0_in_rule__EDouble__Group_2_2__0__Impl4083);
            rule__EDouble__Alternatives_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_2_2__0__Impl"


    // $ANTLR start "rule__EDouble__Group_2_2__1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2060:1: rule__EDouble__Group_2_2__1 : rule__EDouble__Group_2_2__1__Impl rule__EDouble__Group_2_2__2 ;
    public final void rule__EDouble__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2064:1: ( rule__EDouble__Group_2_2__1__Impl rule__EDouble__Group_2_2__2 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2065:2: rule__EDouble__Group_2_2__1__Impl rule__EDouble__Group_2_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_2_2__1__Impl_in_rule__EDouble__Group_2_2__14113);
            rule__EDouble__Group_2_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_2_2__2_in_rule__EDouble__Group_2_2__14116);
            rule__EDouble__Group_2_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_2_2__1"


    // $ANTLR start "rule__EDouble__Group_2_2__1__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2072:1: rule__EDouble__Group_2_2__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2076:1: ( ( ( '-' )? ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2077:1: ( ( '-' )? )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2077:1: ( ( '-' )? )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2078:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_2_2_1()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2079:1: ( '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2080:2: '-'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__EDouble__Group_2_2__1__Impl4145); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_2_2__1__Impl"


    // $ANTLR start "rule__EDouble__Group_2_2__2"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2091:1: rule__EDouble__Group_2_2__2 : rule__EDouble__Group_2_2__2__Impl ;
    public final void rule__EDouble__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2095:1: ( rule__EDouble__Group_2_2__2__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2096:2: rule__EDouble__Group_2_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_2_2__2__Impl_in_rule__EDouble__Group_2_2__24178);
            rule__EDouble__Group_2_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_2_2__2"


    // $ANTLR start "rule__EDouble__Group_2_2__2__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2102:1: rule__EDouble__Group_2_2__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2106:1: ( ( RULE_INT ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2107:1: ( RULE_INT )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2107:1: ( RULE_INT )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2108:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2_2_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group_2_2__2__Impl4205); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_2_2__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2125:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2129:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2130:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__04240);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__04243);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2137:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2141:1: ( ( ( '-' )? ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2142:1: ( ( '-' )? )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2142:1: ( ( '-' )? )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2143:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2144:1: ( '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2145:2: '-'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__EInt__Group__0__Impl4272); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2156:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2160:1: ( rule__EInt__Group__1__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2161:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__14305);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2167:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2171:1: ( ( RULE_INT ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2172:1: ( RULE_INT )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2172:1: ( RULE_INT )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2173:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl4332); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__QATest__TitleAssignment_1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2189:1: rule__QATest__TitleAssignment_1 : ( ruleEString ) ;
    public final void rule__QATest__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2193:1: ( ( ruleEString ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2194:1: ( ruleEString )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2194:1: ( ruleEString )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2195:1: ruleEString
            {
             before(grammarAccess.getQATestAccess().getTitleEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__QATest__TitleAssignment_14370);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQATestAccess().getTitleEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QATest__TitleAssignment_1"


    // $ANTLR start "rule__QATest__OptionsAssignment_2"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2204:1: rule__QATest__OptionsAssignment_2 : ( ruleQAContainerOptions ) ;
    public final void rule__QATest__OptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2208:1: ( ( ruleQAContainerOptions ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2209:1: ( ruleQAContainerOptions )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2209:1: ( ruleQAContainerOptions )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2210:1: ruleQAContainerOptions
            {
             before(grammarAccess.getQATestAccess().getOptionsQAContainerOptionsParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQAContainerOptions_in_rule__QATest__OptionsAssignment_24401);
            ruleQAContainerOptions();

            state._fsp--;

             after(grammarAccess.getQATestAccess().getOptionsQAContainerOptionsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QATest__OptionsAssignment_2"


    // $ANTLR start "rule__QATest__PartsAssignment_3"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2219:1: rule__QATest__PartsAssignment_3 : ( ruleQAPart ) ;
    public final void rule__QATest__PartsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2223:1: ( ( ruleQAPart ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2224:1: ( ruleQAPart )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2224:1: ( ruleQAPart )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2225:1: ruleQAPart
            {
             before(grammarAccess.getQATestAccess().getPartsQAPartParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQAPart_in_rule__QATest__PartsAssignment_34432);
            ruleQAPart();

            state._fsp--;

             after(grammarAccess.getQATestAccess().getPartsQAPartParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QATest__PartsAssignment_3"


    // $ANTLR start "rule__QAContainerOptions__MaxTriesAssignment_1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2234:1: rule__QAContainerOptions__MaxTriesAssignment_1 : ( RULE_INT ) ;
    public final void rule__QAContainerOptions__MaxTriesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2238:1: ( ( RULE_INT ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2239:1: ( RULE_INT )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2239:1: ( RULE_INT )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2240:1: RULE_INT
            {
             before(grammarAccess.getQAContainerOptionsAccess().getMaxTriesINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__QAContainerOptions__MaxTriesAssignment_14463); 
             after(grammarAccess.getQAContainerOptionsAccess().getMaxTriesINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QAContainerOptions__MaxTriesAssignment_1"


    // $ANTLR start "rule__QAContainerOptions__RevealAnswerAssignment_3_0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2249:1: rule__QAContainerOptions__RevealAnswerAssignment_3_0 : ( ( 'reveal' ) ) ;
    public final void rule__QAContainerOptions__RevealAnswerAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2253:1: ( ( ( 'reveal' ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2254:1: ( ( 'reveal' ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2254:1: ( ( 'reveal' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2255:1: ( 'reveal' )
            {
             before(grammarAccess.getQAContainerOptionsAccess().getRevealAnswerRevealKeyword_3_0_0()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2256:1: ( 'reveal' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2257:1: 'reveal'
            {
             before(grammarAccess.getQAContainerOptionsAccess().getRevealAnswerRevealKeyword_3_0_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__QAContainerOptions__RevealAnswerAssignment_3_04499); 
             after(grammarAccess.getQAContainerOptionsAccess().getRevealAnswerRevealKeyword_3_0_0()); 

            }

             after(grammarAccess.getQAContainerOptionsAccess().getRevealAnswerRevealKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QAContainerOptions__RevealAnswerAssignment_3_0"


    // $ANTLR start "rule__Question__TextAssignment_0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2272:1: rule__Question__TextAssignment_0 : ( ruleEString ) ;
    public final void rule__Question__TextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2276:1: ( ( ruleEString ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2277:1: ( ruleEString )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2277:1: ( ruleEString )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2278:1: ruleEString
            {
             before(grammarAccess.getQuestionAccess().getTextEStringParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Question__TextAssignment_04538);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getTextEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__TextAssignment_0"


    // $ANTLR start "rule__Question__CorrectAssignment_2"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2287:1: rule__Question__CorrectAssignment_2 : ( ruleAnswer ) ;
    public final void rule__Question__CorrectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2291:1: ( ( ruleAnswer ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2292:1: ( ruleAnswer )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2292:1: ( ruleAnswer )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2293:1: ruleAnswer
            {
             before(grammarAccess.getQuestionAccess().getCorrectAnswerParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__Question__CorrectAssignment_24569);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getCorrectAnswerParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__CorrectAssignment_2"


    // $ANTLR start "rule__Question__CandidatesAssignment_4_1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2302:1: rule__Question__CandidatesAssignment_4_1 : ( ruleAnswer ) ;
    public final void rule__Question__CandidatesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2306:1: ( ( ruleAnswer ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2307:1: ( ruleAnswer )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2307:1: ( ruleAnswer )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2308:1: ruleAnswer
            {
             before(grammarAccess.getQuestionAccess().getCandidatesAnswerParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__Question__CandidatesAssignment_4_14600);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getCandidatesAnswerParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__CandidatesAssignment_4_1"


    // $ANTLR start "rule__Question__CandidatesAssignment_4_2_1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2317:1: rule__Question__CandidatesAssignment_4_2_1 : ( ruleAnswer ) ;
    public final void rule__Question__CandidatesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2321:1: ( ( ruleAnswer ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2322:1: ( ruleAnswer )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2322:1: ( ruleAnswer )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2323:1: ruleAnswer
            {
             before(grammarAccess.getQuestionAccess().getCandidatesAnswerParserRuleCall_4_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__Question__CandidatesAssignment_4_2_14631);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getCandidatesAnswerParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__CandidatesAssignment_4_2_1"


    // $ANTLR start "rule__QASection__NameAssignment_1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2332:1: rule__QASection__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__QASection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2336:1: ( ( ruleEString ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2337:1: ( ruleEString )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2337:1: ( ruleEString )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2338:1: ruleEString
            {
             before(grammarAccess.getQASectionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__QASection__NameAssignment_14662);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQASectionAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QASection__NameAssignment_1"


    // $ANTLR start "rule__QASection__OptionsAssignment_3"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2347:1: rule__QASection__OptionsAssignment_3 : ( ruleQAContainerOptions ) ;
    public final void rule__QASection__OptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2351:1: ( ( ruleQAContainerOptions ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2352:1: ( ruleQAContainerOptions )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2352:1: ( ruleQAContainerOptions )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2353:1: ruleQAContainerOptions
            {
             before(grammarAccess.getQASectionAccess().getOptionsQAContainerOptionsParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQAContainerOptions_in_rule__QASection__OptionsAssignment_34693);
            ruleQAContainerOptions();

            state._fsp--;

             after(grammarAccess.getQASectionAccess().getOptionsQAContainerOptionsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QASection__OptionsAssignment_3"


    // $ANTLR start "rule__QASection__QuestionsAssignment_4"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2362:1: rule__QASection__QuestionsAssignment_4 : ( ruleQuestion ) ;
    public final void rule__QASection__QuestionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2366:1: ( ( ruleQuestion ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2367:1: ( ruleQuestion )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2367:1: ( ruleQuestion )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2368:1: ruleQuestion
            {
             before(grammarAccess.getQASectionAccess().getQuestionsQuestionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__QASection__QuestionsAssignment_44724);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQASectionAccess().getQuestionsQuestionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QASection__QuestionsAssignment_4"


    // $ANTLR start "rule__ExpressionAnswer__ExpressionAssignment_1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2377:1: rule__ExpressionAnswer__ExpressionAssignment_1 : ( ruleEString ) ;
    public final void rule__ExpressionAnswer__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2381:1: ( ( ruleEString ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2382:1: ( ruleEString )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2382:1: ( ruleEString )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2383:1: ruleEString
            {
             before(grammarAccess.getExpressionAnswerAccess().getExpressionEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ExpressionAnswer__ExpressionAssignment_14755);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpressionAnswerAccess().getExpressionEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAnswer__ExpressionAssignment_1"


    // $ANTLR start "rule__ExpressionAnswer__EpsilonAssignment_2_1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2392:1: rule__ExpressionAnswer__EpsilonAssignment_2_1 : ( ruleEDouble ) ;
    public final void rule__ExpressionAnswer__EpsilonAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2396:1: ( ( ruleEDouble ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2397:1: ( ruleEDouble )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2397:1: ( ruleEDouble )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2398:1: ruleEDouble
            {
             before(grammarAccess.getExpressionAnswerAccess().getEpsilonEDoubleParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__ExpressionAnswer__EpsilonAssignment_2_14786);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getExpressionAnswerAccess().getEpsilonEDoubleParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionAnswer__EpsilonAssignment_2_1"


    // $ANTLR start "rule__OptionAnswer__OptionNumberAssignment_1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2407:1: rule__OptionAnswer__OptionNumberAssignment_1 : ( ruleEInt ) ;
    public final void rule__OptionAnswer__OptionNumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2411:1: ( ( ruleEInt ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2412:1: ( ruleEInt )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2412:1: ( ruleEInt )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2413:1: ruleEInt
            {
             before(grammarAccess.getOptionAnswerAccess().getOptionNumberEIntParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__OptionAnswer__OptionNumberAssignment_14817);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getOptionAnswerAccess().getOptionNumberEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionAnswer__OptionNumberAssignment_1"


    // $ANTLR start "rule__NumberAnswer__NumberAssignment_0_0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2422:1: rule__NumberAnswer__NumberAssignment_0_0 : ( ruleEDouble ) ;
    public final void rule__NumberAnswer__NumberAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2426:1: ( ( ruleEDouble ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2427:1: ( ruleEDouble )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2427:1: ( ruleEDouble )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2428:1: ruleEDouble
            {
             before(grammarAccess.getNumberAnswerAccess().getNumberEDoubleParserRuleCall_0_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__NumberAnswer__NumberAssignment_0_04848);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getNumberAnswerAccess().getNumberEDoubleParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberAnswer__NumberAssignment_0_0"


    // $ANTLR start "rule__NumberAnswer__EpsilonAssignment_0_1_1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2437:1: rule__NumberAnswer__EpsilonAssignment_0_1_1 : ( ruleEDouble ) ;
    public final void rule__NumberAnswer__EpsilonAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2441:1: ( ( ruleEDouble ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2442:1: ( ruleEDouble )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2442:1: ( ruleEDouble )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2443:1: ruleEDouble
            {
             before(grammarAccess.getNumberAnswerAccess().getEpsilonEDoubleParserRuleCall_0_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__NumberAnswer__EpsilonAssignment_0_1_14879);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getNumberAnswerAccess().getEpsilonEDoubleParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberAnswer__EpsilonAssignment_0_1_1"


    // $ANTLR start "rule__TextAnswer__TextAssignment"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2452:1: rule__TextAnswer__TextAssignment : ( ruleEString ) ;
    public final void rule__TextAnswer__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2456:1: ( ( ruleEString ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2457:1: ( ruleEString )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2457:1: ( ruleEString )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2458:1: ruleEString
            {
             before(grammarAccess.getTextAnswerAccess().getTextEStringParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TextAnswer__TextAssignment4910);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTextAnswerAccess().getTextEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAnswer__TextAssignment"


    // $ANTLR start "rule__YesNoAnswer__YesAssignment_1_0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2467:1: rule__YesNoAnswer__YesAssignment_1_0 : ( ( 'yes' ) ) ;
    public final void rule__YesNoAnswer__YesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2471:1: ( ( ( 'yes' ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2472:1: ( ( 'yes' ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2472:1: ( ( 'yes' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2473:1: ( 'yes' )
            {
             before(grammarAccess.getYesNoAnswerAccess().getYesYesKeyword_1_0_0()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2474:1: ( 'yes' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2475:1: 'yes'
            {
             before(grammarAccess.getYesNoAnswerAccess().getYesYesKeyword_1_0_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__YesNoAnswer__YesAssignment_1_04946); 
             after(grammarAccess.getYesNoAnswerAccess().getYesYesKeyword_1_0_0()); 

            }

             after(grammarAccess.getYesNoAnswerAccess().getYesYesKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YesNoAnswer__YesAssignment_1_0"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleQATest_in_entryRuleQATest61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQATest68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QATest__Group__0_in_ruleQATest94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQAContainerOptions_in_entryRuleQAContainerOptions121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQAContainerOptions128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__0_in_ruleQAContainerOptions154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQAPart_in_entryRuleQAPart181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQAPart188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAPart__Alternatives_in_ruleQAPart214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__0_in_ruleQuestion274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQASection_in_entryRuleQASection301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQASection308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QASection__Group__0_in_ruleQASection334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Alternatives_in_ruleAnswer394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionAnswer_in_entryRuleExpressionAnswer421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpressionAnswer428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionAnswer__Group__0_in_ruleExpressionAnswer454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptionAnswer_in_entryRuleOptionAnswer481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOptionAnswer488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OptionAnswer__Group__0_in_ruleOptionAnswer514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberAnswer_in_entryRuleNumberAnswer541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumberAnswer548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumberAnswer__Alternatives_in_ruleNumberAnswer574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextAnswer_in_entryRuleTextAnswer601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextAnswer608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextAnswer__TextAssignment_in_ruleTextAnswer634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleYesNoAnswer_in_entryRuleYesNoAnswer661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleYesNoAnswer668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__YesNoAnswer__Group__0_in_ruleYesNoAnswer694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble780 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0_in_ruleEDouble813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt840 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__QAPart__Alternatives909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQASection_in_rule__QAPart__Alternatives926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptionAnswer_in_rule__Answer__Alternatives958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberAnswer_in_rule__Answer__Alternatives975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextAnswer_in_rule__Answer__Alternatives992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleYesNoAnswer_in_rule__Answer__Alternatives1009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumberAnswer__Group_0__0_in_rule__NumberAnswer__Alternatives1041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionAnswer_in_rule__NumberAnswer__Alternatives1059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__YesNoAnswer__YesAssignment_1_0_in_rule__YesNoAnswer__Alternatives_11091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__YesNoAnswer__Alternatives_11110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EDouble__Alternatives_2_2_01145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__EDouble__Alternatives_2_2_01165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QATest__Group__0__Impl_in_rule__QATest__Group__01197 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QATest__Group__1_in_rule__QATest__Group__01200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__QATest__Group__0__Impl1228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QATest__Group__1__Impl_in_rule__QATest__Group__11259 = new BitSet(new long[]{0x0000000000808010L});
        public static final BitSet FOLLOW_rule__QATest__Group__2_in_rule__QATest__Group__11262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QATest__TitleAssignment_1_in_rule__QATest__Group__1__Impl1289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QATest__Group__2__Impl_in_rule__QATest__Group__21319 = new BitSet(new long[]{0x0000000000808010L});
        public static final BitSet FOLLOW_rule__QATest__Group__3_in_rule__QATest__Group__21322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QATest__OptionsAssignment_2_in_rule__QATest__Group__2__Impl1349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QATest__Group__3__Impl_in_rule__QATest__Group__31380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QATest__PartsAssignment_3_in_rule__QATest__Group__3__Impl1407 = new BitSet(new long[]{0x0000000000800012L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__0__Impl_in_rule__QAContainerOptions__Group__01446 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__1_in_rule__QAContainerOptions__Group__01449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__QAContainerOptions__Group__0__Impl1477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__1__Impl_in_rule__QAContainerOptions__Group__11508 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__2_in_rule__QAContainerOptions__Group__11511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__MaxTriesAssignment_1_in_rule__QAContainerOptions__Group__1__Impl1538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__2__Impl_in_rule__QAContainerOptions__Group__21568 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__3_in_rule__QAContainerOptions__Group__21571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__QAContainerOptions__Group__2__Impl1599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__3__Impl_in_rule__QAContainerOptions__Group__31630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group_3__0_in_rule__QAContainerOptions__Group__3__Impl1657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group_3__0__Impl_in_rule__QAContainerOptions__Group_3__01696 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group_3__1_in_rule__QAContainerOptions__Group_3__01699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__RevealAnswerAssignment_3_0_in_rule__QAContainerOptions__Group_3__0__Impl1726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group_3__1__Impl_in_rule__QAContainerOptions__Group_3__11756 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group_3__2_in_rule__QAContainerOptions__Group_3__11759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__QAContainerOptions__Group_3__1__Impl1787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group_3__2__Impl_in_rule__QAContainerOptions__Group_3__21818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__QAContainerOptions__Group_3__2__Impl1846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__01883 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Question__Group__1_in_rule__Question__Group__01886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__TextAssignment_0_in_rule__Question__Group__0__Impl1913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__11943 = new BitSet(new long[]{0x0000000134000830L});
        public static final BitSet FOLLOW_rule__Question__Group__2_in_rule__Question__Group__11946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Question__Group__1__Impl1974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__22005 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Question__Group__3_in_rule__Question__Group__22008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__CorrectAssignment_2_in_rule__Question__Group__2__Impl2035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__32065 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Question__Group__4_in_rule__Question__Group__32068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Question__Group__3__Impl2096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__42127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group_4__0_in_rule__Question__Group__4__Impl2154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group_4__0__Impl_in_rule__Question__Group_4__02195 = new BitSet(new long[]{0x0000000134000830L});
        public static final BitSet FOLLOW_rule__Question__Group_4__1_in_rule__Question__Group_4__02198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Question__Group_4__0__Impl2226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group_4__1__Impl_in_rule__Question__Group_4__12257 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Question__Group_4__2_in_rule__Question__Group_4__12260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__CandidatesAssignment_4_1_in_rule__Question__Group_4__1__Impl2287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group_4__2__Impl_in_rule__Question__Group_4__22317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group_4_2__0_in_rule__Question__Group_4__2__Impl2344 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__Question__Group_4_2__0__Impl_in_rule__Question__Group_4_2__02381 = new BitSet(new long[]{0x0000000134000830L});
        public static final BitSet FOLLOW_rule__Question__Group_4_2__1_in_rule__Question__Group_4_2__02384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Question__Group_4_2__0__Impl2412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group_4_2__1__Impl_in_rule__Question__Group_4_2__12443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__CandidatesAssignment_4_2_1_in_rule__Question__Group_4_2__1__Impl2470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QASection__Group__0__Impl_in_rule__QASection__Group__02504 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QASection__Group__1_in_rule__QASection__Group__02507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__QASection__Group__0__Impl2535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QASection__Group__1__Impl_in_rule__QASection__Group__12566 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__QASection__Group__2_in_rule__QASection__Group__12569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QASection__NameAssignment_1_in_rule__QASection__Group__1__Impl2596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QASection__Group__2__Impl_in_rule__QASection__Group__22626 = new BitSet(new long[]{0x0000000002008010L});
        public static final BitSet FOLLOW_rule__QASection__Group__3_in_rule__QASection__Group__22629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__QASection__Group__2__Impl2657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QASection__Group__3__Impl_in_rule__QASection__Group__32688 = new BitSet(new long[]{0x0000000002008010L});
        public static final BitSet FOLLOW_rule__QASection__Group__4_in_rule__QASection__Group__32691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QASection__OptionsAssignment_3_in_rule__QASection__Group__3__Impl2718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QASection__Group__4__Impl_in_rule__QASection__Group__42749 = new BitSet(new long[]{0x0000000002008010L});
        public static final BitSet FOLLOW_rule__QASection__Group__5_in_rule__QASection__Group__42752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QASection__QuestionsAssignment_4_in_rule__QASection__Group__4__Impl2779 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__QASection__Group__5__Impl_in_rule__QASection__Group__52810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__QASection__Group__5__Impl2838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionAnswer__Group__0__Impl_in_rule__ExpressionAnswer__Group__02881 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ExpressionAnswer__Group__1_in_rule__ExpressionAnswer__Group__02884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ExpressionAnswer__Group__0__Impl2912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionAnswer__Group__1__Impl_in_rule__ExpressionAnswer__Group__12943 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__ExpressionAnswer__Group__2_in_rule__ExpressionAnswer__Group__12946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionAnswer__ExpressionAssignment_1_in_rule__ExpressionAnswer__Group__1__Impl2973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionAnswer__Group__2__Impl_in_rule__ExpressionAnswer__Group__23003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionAnswer__Group_2__0_in_rule__ExpressionAnswer__Group__2__Impl3030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionAnswer__Group_2__0__Impl_in_rule__ExpressionAnswer__Group_2__03067 = new BitSet(new long[]{0x0000000020000020L});
        public static final BitSet FOLLOW_rule__ExpressionAnswer__Group_2__1_in_rule__ExpressionAnswer__Group_2__03070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__ExpressionAnswer__Group_2__0__Impl3098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionAnswer__Group_2__1__Impl_in_rule__ExpressionAnswer__Group_2__13129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionAnswer__EpsilonAssignment_2_1_in_rule__ExpressionAnswer__Group_2__1__Impl3156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OptionAnswer__Group__0__Impl_in_rule__OptionAnswer__Group__03190 = new BitSet(new long[]{0x0000000020000020L});
        public static final BitSet FOLLOW_rule__OptionAnswer__Group__1_in_rule__OptionAnswer__Group__03193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__OptionAnswer__Group__0__Impl3221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OptionAnswer__Group__1__Impl_in_rule__OptionAnswer__Group__13252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OptionAnswer__OptionNumberAssignment_1_in_rule__OptionAnswer__Group__1__Impl3279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumberAnswer__Group_0__0__Impl_in_rule__NumberAnswer__Group_0__03313 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__NumberAnswer__Group_0__1_in_rule__NumberAnswer__Group_0__03316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumberAnswer__NumberAssignment_0_0_in_rule__NumberAnswer__Group_0__0__Impl3343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumberAnswer__Group_0__1__Impl_in_rule__NumberAnswer__Group_0__13373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumberAnswer__Group_0_1__0_in_rule__NumberAnswer__Group_0__1__Impl3400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumberAnswer__Group_0_1__0__Impl_in_rule__NumberAnswer__Group_0_1__03435 = new BitSet(new long[]{0x0000000020000020L});
        public static final BitSet FOLLOW_rule__NumberAnswer__Group_0_1__1_in_rule__NumberAnswer__Group_0_1__03438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__NumberAnswer__Group_0_1__0__Impl3466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumberAnswer__Group_0_1__1__Impl_in_rule__NumberAnswer__Group_0_1__13497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumberAnswer__EpsilonAssignment_0_1_1_in_rule__NumberAnswer__Group_0_1__1__Impl3524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__YesNoAnswer__Group__0__Impl_in_rule__YesNoAnswer__Group__03558 = new BitSet(new long[]{0x0000000134000830L});
        public static final BitSet FOLLOW_rule__YesNoAnswer__Group__1_in_rule__YesNoAnswer__Group__03561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__YesNoAnswer__Group__1__Impl_in_rule__YesNoAnswer__Group__13619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__YesNoAnswer__Alternatives_1_in_rule__YesNoAnswer__Group__1__Impl3646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__03680 = new BitSet(new long[]{0x0000000020000020L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__03683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__EDouble__Group__0__Impl3712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__13745 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__13748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl3775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__23804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_2__0_in_rule__EDouble__Group__2__Impl3831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_2__0__Impl_in_rule__EDouble__Group_2__03868 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__EDouble__Group_2__1_in_rule__EDouble__Group_2__03871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__EDouble__Group_2__0__Impl3899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_2__1__Impl_in_rule__EDouble__Group_2__13930 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_rule__EDouble__Group_2__2_in_rule__EDouble__Group_2__13933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group_2__1__Impl3960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_2__2__Impl_in_rule__EDouble__Group_2__23989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_2_2__0_in_rule__EDouble__Group_2__2__Impl4016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_2_2__0__Impl_in_rule__EDouble__Group_2_2__04053 = new BitSet(new long[]{0x0000000020000020L});
        public static final BitSet FOLLOW_rule__EDouble__Group_2_2__1_in_rule__EDouble__Group_2_2__04056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Alternatives_2_2_0_in_rule__EDouble__Group_2_2__0__Impl4083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_2_2__1__Impl_in_rule__EDouble__Group_2_2__14113 = new BitSet(new long[]{0x0000000020000020L});
        public static final BitSet FOLLOW_rule__EDouble__Group_2_2__2_in_rule__EDouble__Group_2_2__14116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__EDouble__Group_2_2__1__Impl4145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_2_2__2__Impl_in_rule__EDouble__Group_2_2__24178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group_2_2__2__Impl4205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__04240 = new BitSet(new long[]{0x0000000020000020L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__04243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__EInt__Group__0__Impl4272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__14305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl4332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__QATest__TitleAssignment_14370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQAContainerOptions_in_rule__QATest__OptionsAssignment_24401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQAPart_in_rule__QATest__PartsAssignment_34432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__QAContainerOptions__MaxTriesAssignment_14463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__QAContainerOptions__RevealAnswerAssignment_3_04499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Question__TextAssignment_04538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__Question__CorrectAssignment_24569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__Question__CandidatesAssignment_4_14600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__Question__CandidatesAssignment_4_2_14631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__QASection__NameAssignment_14662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQAContainerOptions_in_rule__QASection__OptionsAssignment_34693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__QASection__QuestionsAssignment_44724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ExpressionAnswer__ExpressionAssignment_14755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__ExpressionAnswer__EpsilonAssignment_2_14786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__OptionAnswer__OptionNumberAssignment_14817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__NumberAnswer__NumberAssignment_0_04848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__NumberAnswer__EpsilonAssignment_0_1_14879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TextAnswer__TextAssignment4910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__YesNoAnswer__YesAssignment_1_04946 = new BitSet(new long[]{0x0000000000000002L});
    }


}