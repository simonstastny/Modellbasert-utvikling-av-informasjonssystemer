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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'YES'", "'NO'", "'Title: '", "'RevealAnswer: '", "'try'", "'times'", "'correct'", "'answer'", "'Name: '", "'Tries: '", "'Text: '", "'Epsilon: '", "'Number: '", "'Expression: '", "'Yes: '", "'OptionNumber: '", "'-'", "'.'", "'reveal'"
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




    // $ANTLR start "entryRuleQAContainer"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:60:1: entryRuleQAContainer : ruleQAContainer EOF ;
    public final void entryRuleQAContainer() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:61:1: ( ruleQAContainer EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:62:1: ruleQAContainer EOF
            {
             before(grammarAccess.getQAContainerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQAContainer_in_entryRuleQAContainer61);
            ruleQAContainer();

            state._fsp--;

             after(grammarAccess.getQAContainerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQAContainer68); 

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
    // $ANTLR end "entryRuleQAContainer"


    // $ANTLR start "ruleQAContainer"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:69:1: ruleQAContainer : ( ( rule__QAContainer__Alternatives ) ) ;
    public final void ruleQAContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:73:2: ( ( ( rule__QAContainer__Alternatives ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:74:1: ( ( rule__QAContainer__Alternatives ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:74:1: ( ( rule__QAContainer__Alternatives ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:75:1: ( rule__QAContainer__Alternatives )
            {
             before(grammarAccess.getQAContainerAccess().getAlternatives()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:76:1: ( rule__QAContainer__Alternatives )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:76:2: rule__QAContainer__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainer__Alternatives_in_ruleQAContainer94);
            rule__QAContainer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQAContainerAccess().getAlternatives()); 

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
    // $ANTLR end "ruleQAContainer"


    // $ANTLR start "entryRuleQATest"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:88:1: entryRuleQATest : ruleQATest EOF ;
    public final void entryRuleQATest() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:89:1: ( ruleQATest EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:90:1: ruleQATest EOF
            {
             before(grammarAccess.getQATestRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQATest_in_entryRuleQATest121);
            ruleQATest();

            state._fsp--;

             after(grammarAccess.getQATestRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQATest128); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:97:1: ruleQATest : ( ( rule__QATest__Group__0 ) ) ;
    public final void ruleQATest() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:101:2: ( ( ( rule__QATest__Group__0 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:102:1: ( ( rule__QATest__Group__0 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:102:1: ( ( rule__QATest__Group__0 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:103:1: ( rule__QATest__Group__0 )
            {
             before(grammarAccess.getQATestAccess().getGroup()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:104:1: ( rule__QATest__Group__0 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:104:2: rule__QATest__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QATest__Group__0_in_ruleQATest154);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:116:1: entryRuleQAContainerOptions : ruleQAContainerOptions EOF ;
    public final void entryRuleQAContainerOptions() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:117:1: ( ruleQAContainerOptions EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:118:1: ruleQAContainerOptions EOF
            {
             before(grammarAccess.getQAContainerOptionsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQAContainerOptions_in_entryRuleQAContainerOptions181);
            ruleQAContainerOptions();

            state._fsp--;

             after(grammarAccess.getQAContainerOptionsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQAContainerOptions188); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:125:1: ruleQAContainerOptions : ( ( rule__QAContainerOptions__Group__0 ) ) ;
    public final void ruleQAContainerOptions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:129:2: ( ( ( rule__QAContainerOptions__Group__0 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:130:1: ( ( rule__QAContainerOptions__Group__0 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:130:1: ( ( rule__QAContainerOptions__Group__0 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:131:1: ( rule__QAContainerOptions__Group__0 )
            {
             before(grammarAccess.getQAContainerOptionsAccess().getGroup()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:132:1: ( rule__QAContainerOptions__Group__0 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:132:2: rule__QAContainerOptions__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group__0_in_ruleQAContainerOptions214);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:144:1: entryRuleQAPart : ruleQAPart EOF ;
    public final void entryRuleQAPart() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:145:1: ( ruleQAPart EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:146:1: ruleQAPart EOF
            {
             before(grammarAccess.getQAPartRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQAPart_in_entryRuleQAPart241);
            ruleQAPart();

            state._fsp--;

             after(grammarAccess.getQAPartRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQAPart248); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:153:1: ruleQAPart : ( ( rule__QAPart__Alternatives ) ) ;
    public final void ruleQAPart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:157:2: ( ( ( rule__QAPart__Alternatives ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:158:1: ( ( rule__QAPart__Alternatives ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:158:1: ( ( rule__QAPart__Alternatives ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:159:1: ( rule__QAPart__Alternatives )
            {
             before(grammarAccess.getQAPartAccess().getAlternatives()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:160:1: ( rule__QAPart__Alternatives )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:160:2: rule__QAPart__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAPart__Alternatives_in_ruleQAPart274);
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


    // $ANTLR start "entryRuleNextRule"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:200:1: entryRuleNextRule : ruleNextRule EOF ;
    public final void entryRuleNextRule() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:201:1: ( ruleNextRule EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:202:1: ruleNextRule EOF
            {
             before(grammarAccess.getNextRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNextRule_in_entryRuleNextRule361);
            ruleNextRule();

            state._fsp--;

             after(grammarAccess.getNextRuleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNextRule368); 

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
    // $ANTLR end "entryRuleNextRule"


    // $ANTLR start "ruleNextRule"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:209:1: ruleNextRule : ( ( rule__NextRule__Group__0 ) ) ;
    public final void ruleNextRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:213:2: ( ( ( rule__NextRule__Group__0 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:214:1: ( ( rule__NextRule__Group__0 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:214:1: ( ( rule__NextRule__Group__0 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:215:1: ( rule__NextRule__Group__0 )
            {
             before(grammarAccess.getNextRuleAccess().getGroup()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:216:1: ( rule__NextRule__Group__0 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:216:2: rule__NextRule__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__NextRule__Group__0_in_ruleNextRule394);
            rule__NextRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNextRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleNextRule"


    // $ANTLR start "entryRuleTextAnswer"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:228:1: entryRuleTextAnswer : ruleTextAnswer EOF ;
    public final void entryRuleTextAnswer() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:229:1: ( ruleTextAnswer EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:230:1: ruleTextAnswer EOF
            {
             before(grammarAccess.getTextAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTextAnswer_in_entryRuleTextAnswer421);
            ruleTextAnswer();

            state._fsp--;

             after(grammarAccess.getTextAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextAnswer428); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:237:1: ruleTextAnswer : ( ( rule__TextAnswer__Group__0 ) ) ;
    public final void ruleTextAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:241:2: ( ( ( rule__TextAnswer__Group__0 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:242:1: ( ( rule__TextAnswer__Group__0 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:242:1: ( ( rule__TextAnswer__Group__0 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:243:1: ( rule__TextAnswer__Group__0 )
            {
             before(grammarAccess.getTextAnswerAccess().getGroup()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:244:1: ( rule__TextAnswer__Group__0 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:244:2: rule__TextAnswer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextAnswer__Group__0_in_ruleTextAnswer454);
            rule__TextAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextAnswerAccess().getGroup()); 

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


    // $ANTLR start "entryRuleExpressionAnswer"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:256:1: entryRuleExpressionAnswer : ruleExpressionAnswer EOF ;
    public final void entryRuleExpressionAnswer() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:257:1: ( ruleExpressionAnswer EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:258:1: ruleExpressionAnswer EOF
            {
             before(grammarAccess.getExpressionAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionAnswer_in_entryRuleExpressionAnswer481);
            ruleExpressionAnswer();

            state._fsp--;

             after(grammarAccess.getExpressionAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpressionAnswer488); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:265:1: ruleExpressionAnswer : ( ( rule__ExpressionAnswer__Group__0 ) ) ;
    public final void ruleExpressionAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:269:2: ( ( ( rule__ExpressionAnswer__Group__0 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:270:1: ( ( rule__ExpressionAnswer__Group__0 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:270:1: ( ( rule__ExpressionAnswer__Group__0 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:271:1: ( rule__ExpressionAnswer__Group__0 )
            {
             before(grammarAccess.getExpressionAnswerAccess().getGroup()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:272:1: ( rule__ExpressionAnswer__Group__0 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:272:2: rule__ExpressionAnswer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionAnswer__Group__0_in_ruleExpressionAnswer514);
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


    // $ANTLR start "entryRuleYesNoAnswer"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:312:1: entryRuleYesNoAnswer : ruleYesNoAnswer EOF ;
    public final void entryRuleYesNoAnswer() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:313:1: ( ruleYesNoAnswer EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:314:1: ruleYesNoAnswer EOF
            {
             before(grammarAccess.getYesNoAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleYesNoAnswer_in_entryRuleYesNoAnswer601);
            ruleYesNoAnswer();

            state._fsp--;

             after(grammarAccess.getYesNoAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleYesNoAnswer608); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:321:1: ruleYesNoAnswer : ( ( rule__YesNoAnswer__Group__0 ) ) ;
    public final void ruleYesNoAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:325:2: ( ( ( rule__YesNoAnswer__Group__0 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:326:1: ( ( rule__YesNoAnswer__Group__0 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:326:1: ( ( rule__YesNoAnswer__Group__0 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:327:1: ( rule__YesNoAnswer__Group__0 )
            {
             before(grammarAccess.getYesNoAnswerAccess().getGroup()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:328:1: ( rule__YesNoAnswer__Group__0 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:328:2: rule__YesNoAnswer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__YesNoAnswer__Group__0_in_ruleYesNoAnswer634);
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


    // $ANTLR start "entryRuleOptionAnswer"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:340:1: entryRuleOptionAnswer : ruleOptionAnswer EOF ;
    public final void entryRuleOptionAnswer() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:341:1: ( ruleOptionAnswer EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:342:1: ruleOptionAnswer EOF
            {
             before(grammarAccess.getOptionAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOptionAnswer_in_entryRuleOptionAnswer661);
            ruleOptionAnswer();

            state._fsp--;

             after(grammarAccess.getOptionAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOptionAnswer668); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:349:1: ruleOptionAnswer : ( ( rule__OptionAnswer__Group__0 ) ) ;
    public final void ruleOptionAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:353:2: ( ( ( rule__OptionAnswer__Group__0 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:354:1: ( ( rule__OptionAnswer__Group__0 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:354:1: ( ( rule__OptionAnswer__Group__0 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:355:1: ( rule__OptionAnswer__Group__0 )
            {
             before(grammarAccess.getOptionAnswerAccess().getGroup()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:356:1: ( rule__OptionAnswer__Group__0 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:356:2: rule__OptionAnswer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OptionAnswer__Group__0_in_ruleOptionAnswer694);
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


    // $ANTLR start "entryRuleAnswer"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:368:1: entryRuleAnswer : ruleAnswer EOF ;
    public final void entryRuleAnswer() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:369:1: ( ruleAnswer EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:370:1: ruleAnswer EOF
            {
             before(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer721);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer728); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:377:1: ruleAnswer : ( ( rule__Answer__Alternatives ) ) ;
    public final void ruleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:381:2: ( ( ( rule__Answer__Alternatives ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:382:1: ( ( rule__Answer__Alternatives ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:382:1: ( ( rule__Answer__Alternatives ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:383:1: ( rule__Answer__Alternatives )
            {
             before(grammarAccess.getAnswerAccess().getAlternatives()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:384:1: ( rule__Answer__Alternatives )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:384:2: rule__Answer__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Alternatives_in_ruleAnswer754);
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


    // $ANTLR start "entryRuleQuestion"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:396:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:397:1: ( ruleQuestion EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:398:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion781);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion788); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:405:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:409:2: ( ( ( rule__Question__Group__0 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:410:1: ( ( rule__Question__Group__0 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:410:1: ( ( rule__Question__Group__0 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:411:1: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:412:1: ( rule__Question__Group__0 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:412:2: rule__Question__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__0_in_ruleQuestion814);
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


    // $ANTLR start "entryRuleEString"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:424:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:425:1: ( ruleEString EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:426:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString841);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString848); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:433:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:437:2: ( ( RULE_STRING ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:438:1: ( RULE_STRING )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:438:1: ( RULE_STRING )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:439:1: RULE_STRING
            {
             before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString874); 
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:452:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:453:1: ( ruleEDouble EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:454:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble900);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble907); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:461:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:465:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:466:1: ( ( rule__EDouble__Group__0 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:466:1: ( ( rule__EDouble__Group__0 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:467:1: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:468:1: ( rule__EDouble__Group__0 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:468:2: rule__EDouble__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0_in_ruleEDouble933);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:480:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:481:1: ( ruleEInt EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:482:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt960);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt967); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:489:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:493:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:494:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:494:1: ( ( rule__EInt__Group__0 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:495:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:496:1: ( rule__EInt__Group__0 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:496:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt993);
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


    // $ANTLR start "entryRuleEBoolean"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:508:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:509:1: ( ruleEBoolean EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:510:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean1020);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean1027); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:517:1: ruleEBoolean : ( ( rule__EBoolean__Group__0 ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:521:2: ( ( ( rule__EBoolean__Group__0 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:522:1: ( ( rule__EBoolean__Group__0 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:522:1: ( ( rule__EBoolean__Group__0 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:523:1: ( rule__EBoolean__Group__0 )
            {
             before(grammarAccess.getEBooleanAccess().getGroup()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:524:1: ( rule__EBoolean__Group__0 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:524:2: rule__EBoolean__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBoolean__Group__0_in_ruleEBoolean1053);
            rule__EBoolean__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getGroup()); 

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "rule__QAContainer__Alternatives"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:536:1: rule__QAContainer__Alternatives : ( ( ruleQATest ) | ( ruleQASection ) );
    public final void rule__QAContainer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:540:1: ( ( ruleQATest ) | ( ruleQASection ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_STRING) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==21) ) {
                        alt1=2;
                    }
                    else if ( (LA1_2==EOF||(LA1_2>=15 && LA1_2<=16)||LA1_2==23) ) {
                        alt1=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:541:1: ( ruleQATest )
                    {
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:541:1: ( ruleQATest )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:542:1: ruleQATest
                    {
                     before(grammarAccess.getQAContainerAccess().getQATestParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleQATest_in_rule__QAContainer__Alternatives1089);
                    ruleQATest();

                    state._fsp--;

                     after(grammarAccess.getQAContainerAccess().getQATestParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:547:6: ( ruleQASection )
                    {
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:547:6: ( ruleQASection )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:548:1: ruleQASection
                    {
                     before(grammarAccess.getQAContainerAccess().getQASectionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleQASection_in_rule__QAContainer__Alternatives1106);
                    ruleQASection();

                    state._fsp--;

                     after(grammarAccess.getQAContainerAccess().getQASectionParserRuleCall_1()); 

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
    // $ANTLR end "rule__QAContainer__Alternatives"


    // $ANTLR start "rule__QAPart__Alternatives"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:558:1: rule__QAPart__Alternatives : ( ( ruleQuestion ) | ( ruleQASection ) );
    public final void rule__QAPart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:562:1: ( ( ruleQuestion ) | ( ruleQASection ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==23) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:563:1: ( ruleQuestion )
                    {
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:563:1: ( ruleQuestion )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:564:1: ruleQuestion
                    {
                     before(grammarAccess.getQAPartAccess().getQuestionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__QAPart__Alternatives1138);
                    ruleQuestion();

                    state._fsp--;

                     after(grammarAccess.getQAPartAccess().getQuestionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:569:6: ( ruleQASection )
                    {
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:569:6: ( ruleQASection )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:570:1: ruleQASection
                    {
                     before(grammarAccess.getQAPartAccess().getQASectionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleQASection_in_rule__QAPart__Alternatives1155);
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


    // $ANTLR start "rule__NumberAnswer__Alternatives"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:580:1: rule__NumberAnswer__Alternatives : ( ( ( rule__NumberAnswer__Group_0__0 ) ) | ( ruleExpressionAnswer ) );
    public final void rule__NumberAnswer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:584:1: ( ( ( rule__NumberAnswer__Group_0__0 ) ) | ( ruleExpressionAnswer ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:585:1: ( ( rule__NumberAnswer__Group_0__0 ) )
                    {
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:585:1: ( ( rule__NumberAnswer__Group_0__0 ) )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:586:1: ( rule__NumberAnswer__Group_0__0 )
                    {
                     before(grammarAccess.getNumberAnswerAccess().getGroup_0()); 
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:587:1: ( rule__NumberAnswer__Group_0__0 )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:587:2: rule__NumberAnswer__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__Group_0__0_in_rule__NumberAnswer__Alternatives1187);
                    rule__NumberAnswer__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNumberAnswerAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:591:6: ( ruleExpressionAnswer )
                    {
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:591:6: ( ruleExpressionAnswer )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:592:1: ruleExpressionAnswer
                    {
                     before(grammarAccess.getNumberAnswerAccess().getExpressionAnswerParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleExpressionAnswer_in_rule__NumberAnswer__Alternatives1205);
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


    // $ANTLR start "rule__Answer__Alternatives"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:602:1: rule__Answer__Alternatives : ( ( ruleTextAnswer ) | ( ruleNumberAnswer ) | ( ruleYesNoAnswer ) | ( ruleOptionAnswer ) );
    public final void rule__Answer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:606:1: ( ( ruleTextAnswer ) | ( ruleNumberAnswer ) | ( ruleYesNoAnswer ) | ( ruleOptionAnswer ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt4=1;
                }
                break;
            case 24:
                {
                alt4=2;
                }
                break;
            case 27:
                {
                alt4=3;
                }
                break;
            case 28:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:607:1: ( ruleTextAnswer )
                    {
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:607:1: ( ruleTextAnswer )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:608:1: ruleTextAnswer
                    {
                     before(grammarAccess.getAnswerAccess().getTextAnswerParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleTextAnswer_in_rule__Answer__Alternatives1237);
                    ruleTextAnswer();

                    state._fsp--;

                     after(grammarAccess.getAnswerAccess().getTextAnswerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:613:6: ( ruleNumberAnswer )
                    {
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:613:6: ( ruleNumberAnswer )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:614:1: ruleNumberAnswer
                    {
                     before(grammarAccess.getAnswerAccess().getNumberAnswerParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumberAnswer_in_rule__Answer__Alternatives1254);
                    ruleNumberAnswer();

                    state._fsp--;

                     after(grammarAccess.getAnswerAccess().getNumberAnswerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:619:6: ( ruleYesNoAnswer )
                    {
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:619:6: ( ruleYesNoAnswer )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:620:1: ruleYesNoAnswer
                    {
                     before(grammarAccess.getAnswerAccess().getYesNoAnswerParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleYesNoAnswer_in_rule__Answer__Alternatives1271);
                    ruleYesNoAnswer();

                    state._fsp--;

                     after(grammarAccess.getAnswerAccess().getYesNoAnswerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:625:6: ( ruleOptionAnswer )
                    {
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:625:6: ( ruleOptionAnswer )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:626:1: ruleOptionAnswer
                    {
                     before(grammarAccess.getAnswerAccess().getOptionAnswerParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOptionAnswer_in_rule__Answer__Alternatives1288);
                    ruleOptionAnswer();

                    state._fsp--;

                     after(grammarAccess.getAnswerAccess().getOptionAnswerParserRuleCall_3()); 

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


    // $ANTLR start "rule__EDouble__Alternatives_2_2_0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:636:1: rule__EDouble__Alternatives_2_2_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:640:1: ( ( 'E' ) | ( 'e' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:641:1: ( 'E' )
                    {
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:641:1: ( 'E' )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:642:1: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_2_2_0_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__EDouble__Alternatives_2_2_01321); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_2_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:649:6: ( 'e' )
                    {
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:649:6: ( 'e' )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:650:1: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_2_2_0_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EDouble__Alternatives_2_2_01341); 
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


    // $ANTLR start "rule__EBoolean__Alternatives_1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:662:1: rule__EBoolean__Alternatives_1 : ( ( 'YES' ) | ( 'NO' ) );
    public final void rule__EBoolean__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:666:1: ( ( 'YES' ) | ( 'NO' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:667:1: ( 'YES' )
                    {
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:667:1: ( 'YES' )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:668:1: 'YES'
                    {
                     before(grammarAccess.getEBooleanAccess().getYESKeyword_1_0()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__EBoolean__Alternatives_11376); 
                     after(grammarAccess.getEBooleanAccess().getYESKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:675:6: ( 'NO' )
                    {
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:675:6: ( 'NO' )
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:676:1: 'NO'
                    {
                     before(grammarAccess.getEBooleanAccess().getNOKeyword_1_1()); 
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__EBoolean__Alternatives_11396); 
                     after(grammarAccess.getEBooleanAccess().getNOKeyword_1_1()); 

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
    // $ANTLR end "rule__EBoolean__Alternatives_1"


    // $ANTLR start "rule__QATest__Group__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:690:1: rule__QATest__Group__0 : rule__QATest__Group__0__Impl rule__QATest__Group__1 ;
    public final void rule__QATest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:694:1: ( rule__QATest__Group__0__Impl rule__QATest__Group__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:695:2: rule__QATest__Group__0__Impl rule__QATest__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QATest__Group__0__Impl_in_rule__QATest__Group__01428);
            rule__QATest__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QATest__Group__1_in_rule__QATest__Group__01431);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:702:1: rule__QATest__Group__0__Impl : ( 'Title: ' ) ;
    public final void rule__QATest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:706:1: ( ( 'Title: ' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:707:1: ( 'Title: ' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:707:1: ( 'Title: ' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:708:1: 'Title: '
            {
             before(grammarAccess.getQATestAccess().getTitleKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__QATest__Group__0__Impl1459); 
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:721:1: rule__QATest__Group__1 : rule__QATest__Group__1__Impl rule__QATest__Group__2 ;
    public final void rule__QATest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:725:1: ( rule__QATest__Group__1__Impl rule__QATest__Group__2 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:726:2: rule__QATest__Group__1__Impl rule__QATest__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QATest__Group__1__Impl_in_rule__QATest__Group__11490);
            rule__QATest__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QATest__Group__2_in_rule__QATest__Group__11493);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:733:1: rule__QATest__Group__1__Impl : ( ( rule__QATest__TitleAssignment_1 ) ) ;
    public final void rule__QATest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:737:1: ( ( ( rule__QATest__TitleAssignment_1 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:738:1: ( ( rule__QATest__TitleAssignment_1 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:738:1: ( ( rule__QATest__TitleAssignment_1 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:739:1: ( rule__QATest__TitleAssignment_1 )
            {
             before(grammarAccess.getQATestAccess().getTitleAssignment_1()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:740:1: ( rule__QATest__TitleAssignment_1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:740:2: rule__QATest__TitleAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QATest__TitleAssignment_1_in_rule__QATest__Group__1__Impl1520);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:750:1: rule__QATest__Group__2 : rule__QATest__Group__2__Impl rule__QATest__Group__3 ;
    public final void rule__QATest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:754:1: ( rule__QATest__Group__2__Impl rule__QATest__Group__3 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:755:2: rule__QATest__Group__2__Impl rule__QATest__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QATest__Group__2__Impl_in_rule__QATest__Group__21550);
            rule__QATest__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QATest__Group__3_in_rule__QATest__Group__21553);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:762:1: rule__QATest__Group__2__Impl : ( ( rule__QATest__OptionsAssignment_2 )? ) ;
    public final void rule__QATest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:766:1: ( ( ( rule__QATest__OptionsAssignment_2 )? ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:767:1: ( ( rule__QATest__OptionsAssignment_2 )? )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:767:1: ( ( rule__QATest__OptionsAssignment_2 )? )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:768:1: ( rule__QATest__OptionsAssignment_2 )?
            {
             before(grammarAccess.getQATestAccess().getOptionsAssignment_2()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:769:1: ( rule__QATest__OptionsAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:769:2: rule__QATest__OptionsAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__QATest__OptionsAssignment_2_in_rule__QATest__Group__2__Impl1580);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:779:1: rule__QATest__Group__3 : rule__QATest__Group__3__Impl ;
    public final void rule__QATest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:783:1: ( rule__QATest__Group__3__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:784:2: rule__QATest__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QATest__Group__3__Impl_in_rule__QATest__Group__31611);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:790:1: rule__QATest__Group__3__Impl : ( ( rule__QATest__PartsAssignment_3 )* ) ;
    public final void rule__QATest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:794:1: ( ( ( rule__QATest__PartsAssignment_3 )* ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:795:1: ( ( rule__QATest__PartsAssignment_3 )* )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:795:1: ( ( rule__QATest__PartsAssignment_3 )* )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:796:1: ( rule__QATest__PartsAssignment_3 )*
            {
             before(grammarAccess.getQATestAccess().getPartsAssignment_3()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:797:1: ( rule__QATest__PartsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15||LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:797:2: rule__QATest__PartsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QATest__PartsAssignment_3_in_rule__QATest__Group__3__Impl1638);
            	    rule__QATest__PartsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:815:1: rule__QAContainerOptions__Group__0 : rule__QAContainerOptions__Group__0__Impl rule__QAContainerOptions__Group__1 ;
    public final void rule__QAContainerOptions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:819:1: ( rule__QAContainerOptions__Group__0__Impl rule__QAContainerOptions__Group__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:820:2: rule__QAContainerOptions__Group__0__Impl rule__QAContainerOptions__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group__0__Impl_in_rule__QAContainerOptions__Group__01677);
            rule__QAContainerOptions__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group__1_in_rule__QAContainerOptions__Group__01680);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:827:1: rule__QAContainerOptions__Group__0__Impl : ( 'RevealAnswer: ' ) ;
    public final void rule__QAContainerOptions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:831:1: ( ( 'RevealAnswer: ' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:832:1: ( 'RevealAnswer: ' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:832:1: ( 'RevealAnswer: ' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:833:1: 'RevealAnswer: '
            {
             before(grammarAccess.getQAContainerOptionsAccess().getRevealAnswerKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__QAContainerOptions__Group__0__Impl1708); 
             after(grammarAccess.getQAContainerOptionsAccess().getRevealAnswerKeyword_0()); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:846:1: rule__QAContainerOptions__Group__1 : rule__QAContainerOptions__Group__1__Impl rule__QAContainerOptions__Group__2 ;
    public final void rule__QAContainerOptions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:850:1: ( rule__QAContainerOptions__Group__1__Impl rule__QAContainerOptions__Group__2 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:851:2: rule__QAContainerOptions__Group__1__Impl rule__QAContainerOptions__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group__1__Impl_in_rule__QAContainerOptions__Group__11739);
            rule__QAContainerOptions__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group__2_in_rule__QAContainerOptions__Group__11742);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:858:1: rule__QAContainerOptions__Group__1__Impl : ( ( rule__QAContainerOptions__RevealAnswerAssignment_1 ) ) ;
    public final void rule__QAContainerOptions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:862:1: ( ( ( rule__QAContainerOptions__RevealAnswerAssignment_1 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:863:1: ( ( rule__QAContainerOptions__RevealAnswerAssignment_1 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:863:1: ( ( rule__QAContainerOptions__RevealAnswerAssignment_1 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:864:1: ( rule__QAContainerOptions__RevealAnswerAssignment_1 )
            {
             before(grammarAccess.getQAContainerOptionsAccess().getRevealAnswerAssignment_1()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:865:1: ( rule__QAContainerOptions__RevealAnswerAssignment_1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:865:2: rule__QAContainerOptions__RevealAnswerAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__RevealAnswerAssignment_1_in_rule__QAContainerOptions__Group__1__Impl1769);
            rule__QAContainerOptions__RevealAnswerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQAContainerOptionsAccess().getRevealAnswerAssignment_1()); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:875:1: rule__QAContainerOptions__Group__2 : rule__QAContainerOptions__Group__2__Impl rule__QAContainerOptions__Group__3 ;
    public final void rule__QAContainerOptions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:879:1: ( rule__QAContainerOptions__Group__2__Impl rule__QAContainerOptions__Group__3 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:880:2: rule__QAContainerOptions__Group__2__Impl rule__QAContainerOptions__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group__2__Impl_in_rule__QAContainerOptions__Group__21799);
            rule__QAContainerOptions__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group__3_in_rule__QAContainerOptions__Group__21802);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:887:1: rule__QAContainerOptions__Group__2__Impl : ( 'try' ) ;
    public final void rule__QAContainerOptions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:891:1: ( ( 'try' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:892:1: ( 'try' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:892:1: ( 'try' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:893:1: 'try'
            {
             before(grammarAccess.getQAContainerOptionsAccess().getTryKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__QAContainerOptions__Group__2__Impl1830); 
             after(grammarAccess.getQAContainerOptionsAccess().getTryKeyword_2()); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:906:1: rule__QAContainerOptions__Group__3 : rule__QAContainerOptions__Group__3__Impl rule__QAContainerOptions__Group__4 ;
    public final void rule__QAContainerOptions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:910:1: ( rule__QAContainerOptions__Group__3__Impl rule__QAContainerOptions__Group__4 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:911:2: rule__QAContainerOptions__Group__3__Impl rule__QAContainerOptions__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group__3__Impl_in_rule__QAContainerOptions__Group__31861);
            rule__QAContainerOptions__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group__4_in_rule__QAContainerOptions__Group__31864);
            rule__QAContainerOptions__Group__4();

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:918:1: rule__QAContainerOptions__Group__3__Impl : ( ( rule__QAContainerOptions__MaxTriesAssignment_3 ) ) ;
    public final void rule__QAContainerOptions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:922:1: ( ( ( rule__QAContainerOptions__MaxTriesAssignment_3 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:923:1: ( ( rule__QAContainerOptions__MaxTriesAssignment_3 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:923:1: ( ( rule__QAContainerOptions__MaxTriesAssignment_3 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:924:1: ( rule__QAContainerOptions__MaxTriesAssignment_3 )
            {
             before(grammarAccess.getQAContainerOptionsAccess().getMaxTriesAssignment_3()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:925:1: ( rule__QAContainerOptions__MaxTriesAssignment_3 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:925:2: rule__QAContainerOptions__MaxTriesAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__MaxTriesAssignment_3_in_rule__QAContainerOptions__Group__3__Impl1891);
            rule__QAContainerOptions__MaxTriesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQAContainerOptionsAccess().getMaxTriesAssignment_3()); 

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


    // $ANTLR start "rule__QAContainerOptions__Group__4"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:935:1: rule__QAContainerOptions__Group__4 : rule__QAContainerOptions__Group__4__Impl rule__QAContainerOptions__Group__5 ;
    public final void rule__QAContainerOptions__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:939:1: ( rule__QAContainerOptions__Group__4__Impl rule__QAContainerOptions__Group__5 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:940:2: rule__QAContainerOptions__Group__4__Impl rule__QAContainerOptions__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group__4__Impl_in_rule__QAContainerOptions__Group__41921);
            rule__QAContainerOptions__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group__5_in_rule__QAContainerOptions__Group__41924);
            rule__QAContainerOptions__Group__5();

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
    // $ANTLR end "rule__QAContainerOptions__Group__4"


    // $ANTLR start "rule__QAContainerOptions__Group__4__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:947:1: rule__QAContainerOptions__Group__4__Impl : ( 'times' ) ;
    public final void rule__QAContainerOptions__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:951:1: ( ( 'times' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:952:1: ( 'times' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:952:1: ( 'times' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:953:1: 'times'
            {
             before(grammarAccess.getQAContainerOptionsAccess().getTimesKeyword_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__QAContainerOptions__Group__4__Impl1952); 
             after(grammarAccess.getQAContainerOptionsAccess().getTimesKeyword_4()); 

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
    // $ANTLR end "rule__QAContainerOptions__Group__4__Impl"


    // $ANTLR start "rule__QAContainerOptions__Group__5"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:966:1: rule__QAContainerOptions__Group__5 : rule__QAContainerOptions__Group__5__Impl ;
    public final void rule__QAContainerOptions__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:970:1: ( rule__QAContainerOptions__Group__5__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:971:2: rule__QAContainerOptions__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group__5__Impl_in_rule__QAContainerOptions__Group__51983);
            rule__QAContainerOptions__Group__5__Impl();

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
    // $ANTLR end "rule__QAContainerOptions__Group__5"


    // $ANTLR start "rule__QAContainerOptions__Group__5__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:977:1: rule__QAContainerOptions__Group__5__Impl : ( ( rule__QAContainerOptions__Group_5__0 )? ) ;
    public final void rule__QAContainerOptions__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:981:1: ( ( ( rule__QAContainerOptions__Group_5__0 )? ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:982:1: ( ( rule__QAContainerOptions__Group_5__0 )? )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:982:1: ( ( rule__QAContainerOptions__Group_5__0 )? )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:983:1: ( rule__QAContainerOptions__Group_5__0 )?
            {
             before(grammarAccess.getQAContainerOptionsAccess().getGroup_5()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:984:1: ( rule__QAContainerOptions__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:984:2: rule__QAContainerOptions__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group_5__0_in_rule__QAContainerOptions__Group__5__Impl2010);
                    rule__QAContainerOptions__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQAContainerOptionsAccess().getGroup_5()); 

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
    // $ANTLR end "rule__QAContainerOptions__Group__5__Impl"


    // $ANTLR start "rule__QAContainerOptions__Group_5__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1006:1: rule__QAContainerOptions__Group_5__0 : rule__QAContainerOptions__Group_5__0__Impl rule__QAContainerOptions__Group_5__1 ;
    public final void rule__QAContainerOptions__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1010:1: ( rule__QAContainerOptions__Group_5__0__Impl rule__QAContainerOptions__Group_5__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1011:2: rule__QAContainerOptions__Group_5__0__Impl rule__QAContainerOptions__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group_5__0__Impl_in_rule__QAContainerOptions__Group_5__02053);
            rule__QAContainerOptions__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group_5__1_in_rule__QAContainerOptions__Group_5__02056);
            rule__QAContainerOptions__Group_5__1();

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
    // $ANTLR end "rule__QAContainerOptions__Group_5__0"


    // $ANTLR start "rule__QAContainerOptions__Group_5__0__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1018:1: rule__QAContainerOptions__Group_5__0__Impl : ( ( rule__QAContainerOptions__RevealAnswerAssignment_5_0 ) ) ;
    public final void rule__QAContainerOptions__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1022:1: ( ( ( rule__QAContainerOptions__RevealAnswerAssignment_5_0 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1023:1: ( ( rule__QAContainerOptions__RevealAnswerAssignment_5_0 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1023:1: ( ( rule__QAContainerOptions__RevealAnswerAssignment_5_0 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1024:1: ( rule__QAContainerOptions__RevealAnswerAssignment_5_0 )
            {
             before(grammarAccess.getQAContainerOptionsAccess().getRevealAnswerAssignment_5_0()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1025:1: ( rule__QAContainerOptions__RevealAnswerAssignment_5_0 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1025:2: rule__QAContainerOptions__RevealAnswerAssignment_5_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__RevealAnswerAssignment_5_0_in_rule__QAContainerOptions__Group_5__0__Impl2083);
            rule__QAContainerOptions__RevealAnswerAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getQAContainerOptionsAccess().getRevealAnswerAssignment_5_0()); 

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
    // $ANTLR end "rule__QAContainerOptions__Group_5__0__Impl"


    // $ANTLR start "rule__QAContainerOptions__Group_5__1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1035:1: rule__QAContainerOptions__Group_5__1 : rule__QAContainerOptions__Group_5__1__Impl rule__QAContainerOptions__Group_5__2 ;
    public final void rule__QAContainerOptions__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1039:1: ( rule__QAContainerOptions__Group_5__1__Impl rule__QAContainerOptions__Group_5__2 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1040:2: rule__QAContainerOptions__Group_5__1__Impl rule__QAContainerOptions__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group_5__1__Impl_in_rule__QAContainerOptions__Group_5__12113);
            rule__QAContainerOptions__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group_5__2_in_rule__QAContainerOptions__Group_5__12116);
            rule__QAContainerOptions__Group_5__2();

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
    // $ANTLR end "rule__QAContainerOptions__Group_5__1"


    // $ANTLR start "rule__QAContainerOptions__Group_5__1__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1047:1: rule__QAContainerOptions__Group_5__1__Impl : ( 'correct' ) ;
    public final void rule__QAContainerOptions__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1051:1: ( ( 'correct' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1052:1: ( 'correct' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1052:1: ( 'correct' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1053:1: 'correct'
            {
             before(grammarAccess.getQAContainerOptionsAccess().getCorrectKeyword_5_1()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__QAContainerOptions__Group_5__1__Impl2144); 
             after(grammarAccess.getQAContainerOptionsAccess().getCorrectKeyword_5_1()); 

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
    // $ANTLR end "rule__QAContainerOptions__Group_5__1__Impl"


    // $ANTLR start "rule__QAContainerOptions__Group_5__2"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1066:1: rule__QAContainerOptions__Group_5__2 : rule__QAContainerOptions__Group_5__2__Impl ;
    public final void rule__QAContainerOptions__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1070:1: ( rule__QAContainerOptions__Group_5__2__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1071:2: rule__QAContainerOptions__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group_5__2__Impl_in_rule__QAContainerOptions__Group_5__22175);
            rule__QAContainerOptions__Group_5__2__Impl();

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
    // $ANTLR end "rule__QAContainerOptions__Group_5__2"


    // $ANTLR start "rule__QAContainerOptions__Group_5__2__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1077:1: rule__QAContainerOptions__Group_5__2__Impl : ( 'answer' ) ;
    public final void rule__QAContainerOptions__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1081:1: ( ( 'answer' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1082:1: ( 'answer' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1082:1: ( 'answer' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1083:1: 'answer'
            {
             before(grammarAccess.getQAContainerOptionsAccess().getAnswerKeyword_5_2()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__QAContainerOptions__Group_5__2__Impl2203); 
             after(grammarAccess.getQAContainerOptionsAccess().getAnswerKeyword_5_2()); 

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
    // $ANTLR end "rule__QAContainerOptions__Group_5__2__Impl"


    // $ANTLR start "rule__QASection__Group__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1102:1: rule__QASection__Group__0 : rule__QASection__Group__0__Impl rule__QASection__Group__1 ;
    public final void rule__QASection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1106:1: ( rule__QASection__Group__0__Impl rule__QASection__Group__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1107:2: rule__QASection__Group__0__Impl rule__QASection__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QASection__Group__0__Impl_in_rule__QASection__Group__02240);
            rule__QASection__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QASection__Group__1_in_rule__QASection__Group__02243);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1114:1: rule__QASection__Group__0__Impl : ( 'Title: ' ) ;
    public final void rule__QASection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1118:1: ( ( 'Title: ' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1119:1: ( 'Title: ' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1119:1: ( 'Title: ' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1120:1: 'Title: '
            {
             before(grammarAccess.getQASectionAccess().getTitleKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__QASection__Group__0__Impl2271); 
             after(grammarAccess.getQASectionAccess().getTitleKeyword_0()); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1133:1: rule__QASection__Group__1 : rule__QASection__Group__1__Impl rule__QASection__Group__2 ;
    public final void rule__QASection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1137:1: ( rule__QASection__Group__1__Impl rule__QASection__Group__2 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1138:2: rule__QASection__Group__1__Impl rule__QASection__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QASection__Group__1__Impl_in_rule__QASection__Group__12302);
            rule__QASection__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QASection__Group__2_in_rule__QASection__Group__12305);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1145:1: rule__QASection__Group__1__Impl : ( ( rule__QASection__TitleAssignment_1 ) ) ;
    public final void rule__QASection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1149:1: ( ( ( rule__QASection__TitleAssignment_1 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1150:1: ( ( rule__QASection__TitleAssignment_1 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1150:1: ( ( rule__QASection__TitleAssignment_1 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1151:1: ( rule__QASection__TitleAssignment_1 )
            {
             before(grammarAccess.getQASectionAccess().getTitleAssignment_1()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1152:1: ( rule__QASection__TitleAssignment_1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1152:2: rule__QASection__TitleAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QASection__TitleAssignment_1_in_rule__QASection__Group__1__Impl2332);
            rule__QASection__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQASectionAccess().getTitleAssignment_1()); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1162:1: rule__QASection__Group__2 : rule__QASection__Group__2__Impl rule__QASection__Group__3 ;
    public final void rule__QASection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1166:1: ( rule__QASection__Group__2__Impl rule__QASection__Group__3 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1167:2: rule__QASection__Group__2__Impl rule__QASection__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QASection__Group__2__Impl_in_rule__QASection__Group__22362);
            rule__QASection__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QASection__Group__3_in_rule__QASection__Group__22365);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1174:1: rule__QASection__Group__2__Impl : ( 'Name: ' ) ;
    public final void rule__QASection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1178:1: ( ( 'Name: ' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1179:1: ( 'Name: ' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1179:1: ( 'Name: ' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1180:1: 'Name: '
            {
             before(grammarAccess.getQASectionAccess().getNameKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__QASection__Group__2__Impl2393); 
             after(grammarAccess.getQASectionAccess().getNameKeyword_2()); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1193:1: rule__QASection__Group__3 : rule__QASection__Group__3__Impl rule__QASection__Group__4 ;
    public final void rule__QASection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1197:1: ( rule__QASection__Group__3__Impl rule__QASection__Group__4 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1198:2: rule__QASection__Group__3__Impl rule__QASection__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__QASection__Group__3__Impl_in_rule__QASection__Group__32424);
            rule__QASection__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QASection__Group__4_in_rule__QASection__Group__32427);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1205:1: rule__QASection__Group__3__Impl : ( ( rule__QASection__NameAssignment_3 ) ) ;
    public final void rule__QASection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1209:1: ( ( ( rule__QASection__NameAssignment_3 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1210:1: ( ( rule__QASection__NameAssignment_3 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1210:1: ( ( rule__QASection__NameAssignment_3 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1211:1: ( rule__QASection__NameAssignment_3 )
            {
             before(grammarAccess.getQASectionAccess().getNameAssignment_3()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1212:1: ( rule__QASection__NameAssignment_3 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1212:2: rule__QASection__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QASection__NameAssignment_3_in_rule__QASection__Group__3__Impl2454);
            rule__QASection__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQASectionAccess().getNameAssignment_3()); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1222:1: rule__QASection__Group__4 : rule__QASection__Group__4__Impl rule__QASection__Group__5 ;
    public final void rule__QASection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1226:1: ( rule__QASection__Group__4__Impl rule__QASection__Group__5 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1227:2: rule__QASection__Group__4__Impl rule__QASection__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__QASection__Group__4__Impl_in_rule__QASection__Group__42484);
            rule__QASection__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QASection__Group__5_in_rule__QASection__Group__42487);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1234:1: rule__QASection__Group__4__Impl : ( ( rule__QASection__OptionsAssignment_4 )? ) ;
    public final void rule__QASection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1238:1: ( ( ( rule__QASection__OptionsAssignment_4 )? ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1239:1: ( ( rule__QASection__OptionsAssignment_4 )? )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1239:1: ( ( rule__QASection__OptionsAssignment_4 )? )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1240:1: ( rule__QASection__OptionsAssignment_4 )?
            {
             before(grammarAccess.getQASectionAccess().getOptionsAssignment_4()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1241:1: ( rule__QASection__OptionsAssignment_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1241:2: rule__QASection__OptionsAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__QASection__OptionsAssignment_4_in_rule__QASection__Group__4__Impl2514);
                    rule__QASection__OptionsAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQASectionAccess().getOptionsAssignment_4()); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1251:1: rule__QASection__Group__5 : rule__QASection__Group__5__Impl ;
    public final void rule__QASection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1255:1: ( rule__QASection__Group__5__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1256:2: rule__QASection__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QASection__Group__5__Impl_in_rule__QASection__Group__52545);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1262:1: rule__QASection__Group__5__Impl : ( ( rule__QASection__QuestionsAssignment_5 )* ) ;
    public final void rule__QASection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1266:1: ( ( ( rule__QASection__QuestionsAssignment_5 )* ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1267:1: ( ( rule__QASection__QuestionsAssignment_5 )* )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1267:1: ( ( rule__QASection__QuestionsAssignment_5 )* )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1268:1: ( rule__QASection__QuestionsAssignment_5 )*
            {
             before(grammarAccess.getQASectionAccess().getQuestionsAssignment_5()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1269:1: ( rule__QASection__QuestionsAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==RULE_STRING) ) {
                        int LA11_3 = input.LA(3);

                        if ( (LA11_3==21) ) {
                            int LA11_4 = input.LA(4);

                            if ( (LA11_4==RULE_STRING) ) {
                                alt11=1;
                            }


                        }


                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1269:2: rule__QASection__QuestionsAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QASection__QuestionsAssignment_5_in_rule__QASection__Group__5__Impl2572);
            	    rule__QASection__QuestionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getQASectionAccess().getQuestionsAssignment_5()); 

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


    // $ANTLR start "rule__NextRule__Group__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1291:1: rule__NextRule__Group__0 : rule__NextRule__Group__0__Impl rule__NextRule__Group__1 ;
    public final void rule__NextRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1295:1: ( rule__NextRule__Group__0__Impl rule__NextRule__Group__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1296:2: rule__NextRule__Group__0__Impl rule__NextRule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NextRule__Group__0__Impl_in_rule__NextRule__Group__02615);
            rule__NextRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NextRule__Group__1_in_rule__NextRule__Group__02618);
            rule__NextRule__Group__1();

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
    // $ANTLR end "rule__NextRule__Group__0"


    // $ANTLR start "rule__NextRule__Group__0__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1303:1: rule__NextRule__Group__0__Impl : ( 'Tries: ' ) ;
    public final void rule__NextRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1307:1: ( ( 'Tries: ' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1308:1: ( 'Tries: ' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1308:1: ( 'Tries: ' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1309:1: 'Tries: '
            {
             before(grammarAccess.getNextRuleAccess().getTriesKeyword_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__NextRule__Group__0__Impl2646); 
             after(grammarAccess.getNextRuleAccess().getTriesKeyword_0()); 

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
    // $ANTLR end "rule__NextRule__Group__0__Impl"


    // $ANTLR start "rule__NextRule__Group__1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1322:1: rule__NextRule__Group__1 : rule__NextRule__Group__1__Impl ;
    public final void rule__NextRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1326:1: ( rule__NextRule__Group__1__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1327:2: rule__NextRule__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NextRule__Group__1__Impl_in_rule__NextRule__Group__12677);
            rule__NextRule__Group__1__Impl();

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
    // $ANTLR end "rule__NextRule__Group__1"


    // $ANTLR start "rule__NextRule__Group__1__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1333:1: rule__NextRule__Group__1__Impl : ( ( rule__NextRule__TriesAssignment_1 ) ) ;
    public final void rule__NextRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1337:1: ( ( ( rule__NextRule__TriesAssignment_1 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1338:1: ( ( rule__NextRule__TriesAssignment_1 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1338:1: ( ( rule__NextRule__TriesAssignment_1 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1339:1: ( rule__NextRule__TriesAssignment_1 )
            {
             before(grammarAccess.getNextRuleAccess().getTriesAssignment_1()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1340:1: ( rule__NextRule__TriesAssignment_1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1340:2: rule__NextRule__TriesAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NextRule__TriesAssignment_1_in_rule__NextRule__Group__1__Impl2704);
            rule__NextRule__TriesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNextRuleAccess().getTriesAssignment_1()); 

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
    // $ANTLR end "rule__NextRule__Group__1__Impl"


    // $ANTLR start "rule__TextAnswer__Group__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1354:1: rule__TextAnswer__Group__0 : rule__TextAnswer__Group__0__Impl rule__TextAnswer__Group__1 ;
    public final void rule__TextAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1358:1: ( rule__TextAnswer__Group__0__Impl rule__TextAnswer__Group__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1359:2: rule__TextAnswer__Group__0__Impl rule__TextAnswer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextAnswer__Group__0__Impl_in_rule__TextAnswer__Group__02738);
            rule__TextAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TextAnswer__Group__1_in_rule__TextAnswer__Group__02741);
            rule__TextAnswer__Group__1();

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
    // $ANTLR end "rule__TextAnswer__Group__0"


    // $ANTLR start "rule__TextAnswer__Group__0__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1366:1: rule__TextAnswer__Group__0__Impl : ( 'Text: ' ) ;
    public final void rule__TextAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1370:1: ( ( 'Text: ' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1371:1: ( 'Text: ' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1371:1: ( 'Text: ' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1372:1: 'Text: '
            {
             before(grammarAccess.getTextAnswerAccess().getTextKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__TextAnswer__Group__0__Impl2769); 
             after(grammarAccess.getTextAnswerAccess().getTextKeyword_0()); 

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
    // $ANTLR end "rule__TextAnswer__Group__0__Impl"


    // $ANTLR start "rule__TextAnswer__Group__1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1385:1: rule__TextAnswer__Group__1 : rule__TextAnswer__Group__1__Impl ;
    public final void rule__TextAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1389:1: ( rule__TextAnswer__Group__1__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1390:2: rule__TextAnswer__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextAnswer__Group__1__Impl_in_rule__TextAnswer__Group__12800);
            rule__TextAnswer__Group__1__Impl();

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
    // $ANTLR end "rule__TextAnswer__Group__1"


    // $ANTLR start "rule__TextAnswer__Group__1__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1396:1: rule__TextAnswer__Group__1__Impl : ( ( rule__TextAnswer__TextAssignment_1 ) ) ;
    public final void rule__TextAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1400:1: ( ( ( rule__TextAnswer__TextAssignment_1 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1401:1: ( ( rule__TextAnswer__TextAssignment_1 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1401:1: ( ( rule__TextAnswer__TextAssignment_1 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1402:1: ( rule__TextAnswer__TextAssignment_1 )
            {
             before(grammarAccess.getTextAnswerAccess().getTextAssignment_1()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1403:1: ( rule__TextAnswer__TextAssignment_1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1403:2: rule__TextAnswer__TextAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextAnswer__TextAssignment_1_in_rule__TextAnswer__Group__1__Impl2827);
            rule__TextAnswer__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAnswerAccess().getTextAssignment_1()); 

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
    // $ANTLR end "rule__TextAnswer__Group__1__Impl"


    // $ANTLR start "rule__ExpressionAnswer__Group__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1417:1: rule__ExpressionAnswer__Group__0 : rule__ExpressionAnswer__Group__0__Impl rule__ExpressionAnswer__Group__1 ;
    public final void rule__ExpressionAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1421:1: ( rule__ExpressionAnswer__Group__0__Impl rule__ExpressionAnswer__Group__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1422:2: rule__ExpressionAnswer__Group__0__Impl rule__ExpressionAnswer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionAnswer__Group__0__Impl_in_rule__ExpressionAnswer__Group__02861);
            rule__ExpressionAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpressionAnswer__Group__1_in_rule__ExpressionAnswer__Group__02864);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1429:1: rule__ExpressionAnswer__Group__0__Impl : ( 'Epsilon: ' ) ;
    public final void rule__ExpressionAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1433:1: ( ( 'Epsilon: ' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1434:1: ( 'Epsilon: ' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1434:1: ( 'Epsilon: ' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1435:1: 'Epsilon: '
            {
             before(grammarAccess.getExpressionAnswerAccess().getEpsilonKeyword_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__ExpressionAnswer__Group__0__Impl2892); 
             after(grammarAccess.getExpressionAnswerAccess().getEpsilonKeyword_0()); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1448:1: rule__ExpressionAnswer__Group__1 : rule__ExpressionAnswer__Group__1__Impl rule__ExpressionAnswer__Group__2 ;
    public final void rule__ExpressionAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1452:1: ( rule__ExpressionAnswer__Group__1__Impl rule__ExpressionAnswer__Group__2 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1453:2: rule__ExpressionAnswer__Group__1__Impl rule__ExpressionAnswer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionAnswer__Group__1__Impl_in_rule__ExpressionAnswer__Group__12923);
            rule__ExpressionAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpressionAnswer__Group__2_in_rule__ExpressionAnswer__Group__12926);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1460:1: rule__ExpressionAnswer__Group__1__Impl : ( ( rule__ExpressionAnswer__EpsilonAssignment_1 ) ) ;
    public final void rule__ExpressionAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1464:1: ( ( ( rule__ExpressionAnswer__EpsilonAssignment_1 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1465:1: ( ( rule__ExpressionAnswer__EpsilonAssignment_1 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1465:1: ( ( rule__ExpressionAnswer__EpsilonAssignment_1 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1466:1: ( rule__ExpressionAnswer__EpsilonAssignment_1 )
            {
             before(grammarAccess.getExpressionAnswerAccess().getEpsilonAssignment_1()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1467:1: ( rule__ExpressionAnswer__EpsilonAssignment_1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1467:2: rule__ExpressionAnswer__EpsilonAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionAnswer__EpsilonAssignment_1_in_rule__ExpressionAnswer__Group__1__Impl2953);
            rule__ExpressionAnswer__EpsilonAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAnswerAccess().getEpsilonAssignment_1()); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1477:1: rule__ExpressionAnswer__Group__2 : rule__ExpressionAnswer__Group__2__Impl rule__ExpressionAnswer__Group__3 ;
    public final void rule__ExpressionAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1481:1: ( rule__ExpressionAnswer__Group__2__Impl rule__ExpressionAnswer__Group__3 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1482:2: rule__ExpressionAnswer__Group__2__Impl rule__ExpressionAnswer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionAnswer__Group__2__Impl_in_rule__ExpressionAnswer__Group__22983);
            rule__ExpressionAnswer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpressionAnswer__Group__3_in_rule__ExpressionAnswer__Group__22986);
            rule__ExpressionAnswer__Group__3();

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1489:1: rule__ExpressionAnswer__Group__2__Impl : ( 'Number: ' ) ;
    public final void rule__ExpressionAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1493:1: ( ( 'Number: ' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1494:1: ( 'Number: ' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1494:1: ( 'Number: ' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1495:1: 'Number: '
            {
             before(grammarAccess.getExpressionAnswerAccess().getNumberKeyword_2()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__ExpressionAnswer__Group__2__Impl3014); 
             after(grammarAccess.getExpressionAnswerAccess().getNumberKeyword_2()); 

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


    // $ANTLR start "rule__ExpressionAnswer__Group__3"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1508:1: rule__ExpressionAnswer__Group__3 : rule__ExpressionAnswer__Group__3__Impl rule__ExpressionAnswer__Group__4 ;
    public final void rule__ExpressionAnswer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1512:1: ( rule__ExpressionAnswer__Group__3__Impl rule__ExpressionAnswer__Group__4 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1513:2: rule__ExpressionAnswer__Group__3__Impl rule__ExpressionAnswer__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionAnswer__Group__3__Impl_in_rule__ExpressionAnswer__Group__33045);
            rule__ExpressionAnswer__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpressionAnswer__Group__4_in_rule__ExpressionAnswer__Group__33048);
            rule__ExpressionAnswer__Group__4();

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
    // $ANTLR end "rule__ExpressionAnswer__Group__3"


    // $ANTLR start "rule__ExpressionAnswer__Group__3__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1520:1: rule__ExpressionAnswer__Group__3__Impl : ( ( rule__ExpressionAnswer__NumberAssignment_3 ) ) ;
    public final void rule__ExpressionAnswer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1524:1: ( ( ( rule__ExpressionAnswer__NumberAssignment_3 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1525:1: ( ( rule__ExpressionAnswer__NumberAssignment_3 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1525:1: ( ( rule__ExpressionAnswer__NumberAssignment_3 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1526:1: ( rule__ExpressionAnswer__NumberAssignment_3 )
            {
             before(grammarAccess.getExpressionAnswerAccess().getNumberAssignment_3()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1527:1: ( rule__ExpressionAnswer__NumberAssignment_3 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1527:2: rule__ExpressionAnswer__NumberAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionAnswer__NumberAssignment_3_in_rule__ExpressionAnswer__Group__3__Impl3075);
            rule__ExpressionAnswer__NumberAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAnswerAccess().getNumberAssignment_3()); 

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
    // $ANTLR end "rule__ExpressionAnswer__Group__3__Impl"


    // $ANTLR start "rule__ExpressionAnswer__Group__4"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1537:1: rule__ExpressionAnswer__Group__4 : rule__ExpressionAnswer__Group__4__Impl rule__ExpressionAnswer__Group__5 ;
    public final void rule__ExpressionAnswer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1541:1: ( rule__ExpressionAnswer__Group__4__Impl rule__ExpressionAnswer__Group__5 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1542:2: rule__ExpressionAnswer__Group__4__Impl rule__ExpressionAnswer__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionAnswer__Group__4__Impl_in_rule__ExpressionAnswer__Group__43105);
            rule__ExpressionAnswer__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ExpressionAnswer__Group__5_in_rule__ExpressionAnswer__Group__43108);
            rule__ExpressionAnswer__Group__5();

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
    // $ANTLR end "rule__ExpressionAnswer__Group__4"


    // $ANTLR start "rule__ExpressionAnswer__Group__4__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1549:1: rule__ExpressionAnswer__Group__4__Impl : ( 'Expression: ' ) ;
    public final void rule__ExpressionAnswer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1553:1: ( ( 'Expression: ' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1554:1: ( 'Expression: ' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1554:1: ( 'Expression: ' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1555:1: 'Expression: '
            {
             before(grammarAccess.getExpressionAnswerAccess().getExpressionKeyword_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ExpressionAnswer__Group__4__Impl3136); 
             after(grammarAccess.getExpressionAnswerAccess().getExpressionKeyword_4()); 

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
    // $ANTLR end "rule__ExpressionAnswer__Group__4__Impl"


    // $ANTLR start "rule__ExpressionAnswer__Group__5"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1568:1: rule__ExpressionAnswer__Group__5 : rule__ExpressionAnswer__Group__5__Impl ;
    public final void rule__ExpressionAnswer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1572:1: ( rule__ExpressionAnswer__Group__5__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1573:2: rule__ExpressionAnswer__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionAnswer__Group__5__Impl_in_rule__ExpressionAnswer__Group__53167);
            rule__ExpressionAnswer__Group__5__Impl();

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
    // $ANTLR end "rule__ExpressionAnswer__Group__5"


    // $ANTLR start "rule__ExpressionAnswer__Group__5__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1579:1: rule__ExpressionAnswer__Group__5__Impl : ( ( rule__ExpressionAnswer__ExpressionAssignment_5 ) ) ;
    public final void rule__ExpressionAnswer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1583:1: ( ( ( rule__ExpressionAnswer__ExpressionAssignment_5 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1584:1: ( ( rule__ExpressionAnswer__ExpressionAssignment_5 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1584:1: ( ( rule__ExpressionAnswer__ExpressionAssignment_5 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1585:1: ( rule__ExpressionAnswer__ExpressionAssignment_5 )
            {
             before(grammarAccess.getExpressionAnswerAccess().getExpressionAssignment_5()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1586:1: ( rule__ExpressionAnswer__ExpressionAssignment_5 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1586:2: rule__ExpressionAnswer__ExpressionAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ExpressionAnswer__ExpressionAssignment_5_in_rule__ExpressionAnswer__Group__5__Impl3194);
            rule__ExpressionAnswer__ExpressionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAnswerAccess().getExpressionAssignment_5()); 

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
    // $ANTLR end "rule__ExpressionAnswer__Group__5__Impl"


    // $ANTLR start "rule__NumberAnswer__Group_0__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1608:1: rule__NumberAnswer__Group_0__0 : rule__NumberAnswer__Group_0__0__Impl rule__NumberAnswer__Group_0__1 ;
    public final void rule__NumberAnswer__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1612:1: ( rule__NumberAnswer__Group_0__0__Impl rule__NumberAnswer__Group_0__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1613:2: rule__NumberAnswer__Group_0__0__Impl rule__NumberAnswer__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__Group_0__0__Impl_in_rule__NumberAnswer__Group_0__03236);
            rule__NumberAnswer__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__Group_0__1_in_rule__NumberAnswer__Group_0__03239);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1620:1: rule__NumberAnswer__Group_0__0__Impl : ( 'Epsilon: ' ) ;
    public final void rule__NumberAnswer__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1624:1: ( ( 'Epsilon: ' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1625:1: ( 'Epsilon: ' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1625:1: ( 'Epsilon: ' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1626:1: 'Epsilon: '
            {
             before(grammarAccess.getNumberAnswerAccess().getEpsilonKeyword_0_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__NumberAnswer__Group_0__0__Impl3267); 
             after(grammarAccess.getNumberAnswerAccess().getEpsilonKeyword_0_0()); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1639:1: rule__NumberAnswer__Group_0__1 : rule__NumberAnswer__Group_0__1__Impl rule__NumberAnswer__Group_0__2 ;
    public final void rule__NumberAnswer__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1643:1: ( rule__NumberAnswer__Group_0__1__Impl rule__NumberAnswer__Group_0__2 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1644:2: rule__NumberAnswer__Group_0__1__Impl rule__NumberAnswer__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__Group_0__1__Impl_in_rule__NumberAnswer__Group_0__13298);
            rule__NumberAnswer__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__Group_0__2_in_rule__NumberAnswer__Group_0__13301);
            rule__NumberAnswer__Group_0__2();

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1651:1: rule__NumberAnswer__Group_0__1__Impl : ( ( rule__NumberAnswer__EpsilonAssignment_0_1 ) ) ;
    public final void rule__NumberAnswer__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1655:1: ( ( ( rule__NumberAnswer__EpsilonAssignment_0_1 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1656:1: ( ( rule__NumberAnswer__EpsilonAssignment_0_1 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1656:1: ( ( rule__NumberAnswer__EpsilonAssignment_0_1 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1657:1: ( rule__NumberAnswer__EpsilonAssignment_0_1 )
            {
             before(grammarAccess.getNumberAnswerAccess().getEpsilonAssignment_0_1()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1658:1: ( rule__NumberAnswer__EpsilonAssignment_0_1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1658:2: rule__NumberAnswer__EpsilonAssignment_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__EpsilonAssignment_0_1_in_rule__NumberAnswer__Group_0__1__Impl3328);
            rule__NumberAnswer__EpsilonAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberAnswerAccess().getEpsilonAssignment_0_1()); 

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


    // $ANTLR start "rule__NumberAnswer__Group_0__2"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1668:1: rule__NumberAnswer__Group_0__2 : rule__NumberAnswer__Group_0__2__Impl rule__NumberAnswer__Group_0__3 ;
    public final void rule__NumberAnswer__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1672:1: ( rule__NumberAnswer__Group_0__2__Impl rule__NumberAnswer__Group_0__3 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1673:2: rule__NumberAnswer__Group_0__2__Impl rule__NumberAnswer__Group_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__Group_0__2__Impl_in_rule__NumberAnswer__Group_0__23358);
            rule__NumberAnswer__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__Group_0__3_in_rule__NumberAnswer__Group_0__23361);
            rule__NumberAnswer__Group_0__3();

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
    // $ANTLR end "rule__NumberAnswer__Group_0__2"


    // $ANTLR start "rule__NumberAnswer__Group_0__2__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1680:1: rule__NumberAnswer__Group_0__2__Impl : ( 'Number: ' ) ;
    public final void rule__NumberAnswer__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1684:1: ( ( 'Number: ' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1685:1: ( 'Number: ' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1685:1: ( 'Number: ' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1686:1: 'Number: '
            {
             before(grammarAccess.getNumberAnswerAccess().getNumberKeyword_0_2()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__NumberAnswer__Group_0__2__Impl3389); 
             after(grammarAccess.getNumberAnswerAccess().getNumberKeyword_0_2()); 

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
    // $ANTLR end "rule__NumberAnswer__Group_0__2__Impl"


    // $ANTLR start "rule__NumberAnswer__Group_0__3"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1699:1: rule__NumberAnswer__Group_0__3 : rule__NumberAnswer__Group_0__3__Impl ;
    public final void rule__NumberAnswer__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1703:1: ( rule__NumberAnswer__Group_0__3__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1704:2: rule__NumberAnswer__Group_0__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__Group_0__3__Impl_in_rule__NumberAnswer__Group_0__33420);
            rule__NumberAnswer__Group_0__3__Impl();

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
    // $ANTLR end "rule__NumberAnswer__Group_0__3"


    // $ANTLR start "rule__NumberAnswer__Group_0__3__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1710:1: rule__NumberAnswer__Group_0__3__Impl : ( ( rule__NumberAnswer__NumberAssignment_0_3 ) ) ;
    public final void rule__NumberAnswer__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1714:1: ( ( ( rule__NumberAnswer__NumberAssignment_0_3 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1715:1: ( ( rule__NumberAnswer__NumberAssignment_0_3 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1715:1: ( ( rule__NumberAnswer__NumberAssignment_0_3 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1716:1: ( rule__NumberAnswer__NumberAssignment_0_3 )
            {
             before(grammarAccess.getNumberAnswerAccess().getNumberAssignment_0_3()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1717:1: ( rule__NumberAnswer__NumberAssignment_0_3 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1717:2: rule__NumberAnswer__NumberAssignment_0_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__NumberAnswer__NumberAssignment_0_3_in_rule__NumberAnswer__Group_0__3__Impl3447);
            rule__NumberAnswer__NumberAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getNumberAnswerAccess().getNumberAssignment_0_3()); 

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
    // $ANTLR end "rule__NumberAnswer__Group_0__3__Impl"


    // $ANTLR start "rule__YesNoAnswer__Group__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1735:1: rule__YesNoAnswer__Group__0 : rule__YesNoAnswer__Group__0__Impl rule__YesNoAnswer__Group__1 ;
    public final void rule__YesNoAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1739:1: ( rule__YesNoAnswer__Group__0__Impl rule__YesNoAnswer__Group__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1740:2: rule__YesNoAnswer__Group__0__Impl rule__YesNoAnswer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__YesNoAnswer__Group__0__Impl_in_rule__YesNoAnswer__Group__03485);
            rule__YesNoAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__YesNoAnswer__Group__1_in_rule__YesNoAnswer__Group__03488);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1747:1: rule__YesNoAnswer__Group__0__Impl : ( 'Yes: ' ) ;
    public final void rule__YesNoAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1751:1: ( ( 'Yes: ' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1752:1: ( 'Yes: ' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1752:1: ( 'Yes: ' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1753:1: 'Yes: '
            {
             before(grammarAccess.getYesNoAnswerAccess().getYesKeyword_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__YesNoAnswer__Group__0__Impl3516); 
             after(grammarAccess.getYesNoAnswerAccess().getYesKeyword_0()); 

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
    // $ANTLR end "rule__YesNoAnswer__Group__0__Impl"


    // $ANTLR start "rule__YesNoAnswer__Group__1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1766:1: rule__YesNoAnswer__Group__1 : rule__YesNoAnswer__Group__1__Impl ;
    public final void rule__YesNoAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1770:1: ( rule__YesNoAnswer__Group__1__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1771:2: rule__YesNoAnswer__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__YesNoAnswer__Group__1__Impl_in_rule__YesNoAnswer__Group__13547);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1777:1: rule__YesNoAnswer__Group__1__Impl : ( ( rule__YesNoAnswer__YesAssignment_1 ) ) ;
    public final void rule__YesNoAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1781:1: ( ( ( rule__YesNoAnswer__YesAssignment_1 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1782:1: ( ( rule__YesNoAnswer__YesAssignment_1 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1782:1: ( ( rule__YesNoAnswer__YesAssignment_1 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1783:1: ( rule__YesNoAnswer__YesAssignment_1 )
            {
             before(grammarAccess.getYesNoAnswerAccess().getYesAssignment_1()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1784:1: ( rule__YesNoAnswer__YesAssignment_1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1784:2: rule__YesNoAnswer__YesAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__YesNoAnswer__YesAssignment_1_in_rule__YesNoAnswer__Group__1__Impl3574);
            rule__YesNoAnswer__YesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getYesNoAnswerAccess().getYesAssignment_1()); 

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


    // $ANTLR start "rule__OptionAnswer__Group__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1798:1: rule__OptionAnswer__Group__0 : rule__OptionAnswer__Group__0__Impl rule__OptionAnswer__Group__1 ;
    public final void rule__OptionAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1802:1: ( rule__OptionAnswer__Group__0__Impl rule__OptionAnswer__Group__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1803:2: rule__OptionAnswer__Group__0__Impl rule__OptionAnswer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OptionAnswer__Group__0__Impl_in_rule__OptionAnswer__Group__03608);
            rule__OptionAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OptionAnswer__Group__1_in_rule__OptionAnswer__Group__03611);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1810:1: rule__OptionAnswer__Group__0__Impl : ( 'OptionNumber: ' ) ;
    public final void rule__OptionAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1814:1: ( ( 'OptionNumber: ' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1815:1: ( 'OptionNumber: ' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1815:1: ( 'OptionNumber: ' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1816:1: 'OptionNumber: '
            {
             before(grammarAccess.getOptionAnswerAccess().getOptionNumberKeyword_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__OptionAnswer__Group__0__Impl3639); 
             after(grammarAccess.getOptionAnswerAccess().getOptionNumberKeyword_0()); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1829:1: rule__OptionAnswer__Group__1 : rule__OptionAnswer__Group__1__Impl ;
    public final void rule__OptionAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1833:1: ( rule__OptionAnswer__Group__1__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1834:2: rule__OptionAnswer__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OptionAnswer__Group__1__Impl_in_rule__OptionAnswer__Group__13670);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1840:1: rule__OptionAnswer__Group__1__Impl : ( ( rule__OptionAnswer__OptionNumberAssignment_1 ) ) ;
    public final void rule__OptionAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1844:1: ( ( ( rule__OptionAnswer__OptionNumberAssignment_1 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1845:1: ( ( rule__OptionAnswer__OptionNumberAssignment_1 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1845:1: ( ( rule__OptionAnswer__OptionNumberAssignment_1 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1846:1: ( rule__OptionAnswer__OptionNumberAssignment_1 )
            {
             before(grammarAccess.getOptionAnswerAccess().getOptionNumberAssignment_1()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1847:1: ( rule__OptionAnswer__OptionNumberAssignment_1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1847:2: rule__OptionAnswer__OptionNumberAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OptionAnswer__OptionNumberAssignment_1_in_rule__OptionAnswer__Group__1__Impl3697);
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


    // $ANTLR start "rule__Question__Group__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1861:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1865:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1866:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__03731);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__1_in_rule__Question__Group__03734);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1873:1: rule__Question__Group__0__Impl : ( 'Text: ' ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1877:1: ( ( 'Text: ' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1878:1: ( 'Text: ' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1878:1: ( 'Text: ' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1879:1: 'Text: '
            {
             before(grammarAccess.getQuestionAccess().getTextKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Question__Group__0__Impl3762); 
             after(grammarAccess.getQuestionAccess().getTextKeyword_0()); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1892:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1896:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1897:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__13793);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__2_in_rule__Question__Group__13796);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1904:1: rule__Question__Group__1__Impl : ( ( rule__Question__TextAssignment_1 ) ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1908:1: ( ( ( rule__Question__TextAssignment_1 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1909:1: ( ( rule__Question__TextAssignment_1 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1909:1: ( ( rule__Question__TextAssignment_1 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1910:1: ( rule__Question__TextAssignment_1 )
            {
             before(grammarAccess.getQuestionAccess().getTextAssignment_1()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1911:1: ( rule__Question__TextAssignment_1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1911:2: rule__Question__TextAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__TextAssignment_1_in_rule__Question__Group__1__Impl3823);
            rule__Question__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getTextAssignment_1()); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1921:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1925:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1926:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__23853);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__3_in_rule__Question__Group__23856);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1933:1: rule__Question__Group__2__Impl : ( 'Name: ' ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1937:1: ( ( 'Name: ' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1938:1: ( 'Name: ' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1938:1: ( 'Name: ' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1939:1: 'Name: '
            {
             before(grammarAccess.getQuestionAccess().getNameKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Question__Group__2__Impl3884); 
             after(grammarAccess.getQuestionAccess().getNameKeyword_2()); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1952:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1956:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1957:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__33915);
            rule__Question__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__4_in_rule__Question__Group__33918);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1964:1: rule__Question__Group__3__Impl : ( ( rule__Question__NameAssignment_3 ) ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1968:1: ( ( ( rule__Question__NameAssignment_3 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1969:1: ( ( rule__Question__NameAssignment_3 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1969:1: ( ( rule__Question__NameAssignment_3 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1970:1: ( rule__Question__NameAssignment_3 )
            {
             before(grammarAccess.getQuestionAccess().getNameAssignment_3()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1971:1: ( rule__Question__NameAssignment_3 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1971:2: rule__Question__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__NameAssignment_3_in_rule__Question__Group__3__Impl3945);
            rule__Question__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getNameAssignment_3()); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1981:1: rule__Question__Group__4 : rule__Question__Group__4__Impl rule__Question__Group__5 ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1985:1: ( rule__Question__Group__4__Impl rule__Question__Group__5 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1986:2: rule__Question__Group__4__Impl rule__Question__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__43975);
            rule__Question__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__5_in_rule__Question__Group__43978);
            rule__Question__Group__5();

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1993:1: rule__Question__Group__4__Impl : ( ( rule__Question__NextRulesAssignment_4 )* ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1997:1: ( ( ( rule__Question__NextRulesAssignment_4 )* ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1998:1: ( ( rule__Question__NextRulesAssignment_4 )* )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1998:1: ( ( rule__Question__NextRulesAssignment_4 )* )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:1999:1: ( rule__Question__NextRulesAssignment_4 )*
            {
             before(grammarAccess.getQuestionAccess().getNextRulesAssignment_4()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2000:1: ( rule__Question__NextRulesAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2000:2: rule__Question__NextRulesAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Question__NextRulesAssignment_4_in_rule__Question__Group__4__Impl4005);
            	    rule__Question__NextRulesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getQuestionAccess().getNextRulesAssignment_4()); 

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


    // $ANTLR start "rule__Question__Group__5"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2010:1: rule__Question__Group__5 : rule__Question__Group__5__Impl rule__Question__Group__6 ;
    public final void rule__Question__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2014:1: ( rule__Question__Group__5__Impl rule__Question__Group__6 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2015:2: rule__Question__Group__5__Impl rule__Question__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__54036);
            rule__Question__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__6_in_rule__Question__Group__54039);
            rule__Question__Group__6();

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
    // $ANTLR end "rule__Question__Group__5"


    // $ANTLR start "rule__Question__Group__5__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2022:1: rule__Question__Group__5__Impl : ( ( rule__Question__CorrectAssignment_5 )? ) ;
    public final void rule__Question__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2026:1: ( ( ( rule__Question__CorrectAssignment_5 )? ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2027:1: ( ( rule__Question__CorrectAssignment_5 )? )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2027:1: ( ( rule__Question__CorrectAssignment_5 )? )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2028:1: ( rule__Question__CorrectAssignment_5 )?
            {
             before(grammarAccess.getQuestionAccess().getCorrectAssignment_5()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2029:1: ( rule__Question__CorrectAssignment_5 )?
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2029:2: rule__Question__CorrectAssignment_5
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Question__CorrectAssignment_5_in_rule__Question__Group__5__Impl4066);
                    rule__Question__CorrectAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getCorrectAssignment_5()); 

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
    // $ANTLR end "rule__Question__Group__5__Impl"


    // $ANTLR start "rule__Question__Group__6"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2039:1: rule__Question__Group__6 : rule__Question__Group__6__Impl ;
    public final void rule__Question__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2043:1: ( rule__Question__Group__6__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2044:2: rule__Question__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Question__Group__6__Impl_in_rule__Question__Group__64097);
            rule__Question__Group__6__Impl();

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
    // $ANTLR end "rule__Question__Group__6"


    // $ANTLR start "rule__Question__Group__6__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2050:1: rule__Question__Group__6__Impl : ( ( rule__Question__CandidatesAssignment_6 )* ) ;
    public final void rule__Question__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2054:1: ( ( ( rule__Question__CandidatesAssignment_6 )* ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2055:1: ( ( rule__Question__CandidatesAssignment_6 )* )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2055:1: ( ( rule__Question__CandidatesAssignment_6 )* )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2056:1: ( rule__Question__CandidatesAssignment_6 )*
            {
             before(grammarAccess.getQuestionAccess().getCandidatesAssignment_6()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2057:1: ( rule__Question__CandidatesAssignment_6 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==RULE_STRING) ) {
                        int LA14_4 = input.LA(3);

                        if ( (LA14_4==EOF||LA14_4==15||(LA14_4>=23 && LA14_4<=24)||(LA14_4>=27 && LA14_4<=28)) ) {
                            alt14=1;
                        }


                    }


                }
                else if ( (LA14_0==24||(LA14_0>=27 && LA14_0<=28)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2057:2: rule__Question__CandidatesAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Question__CandidatesAssignment_6_in_rule__Question__Group__6__Impl4124);
            	    rule__Question__CandidatesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getQuestionAccess().getCandidatesAssignment_6()); 

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
    // $ANTLR end "rule__Question__Group__6__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2081:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2085:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2086:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__04169);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__04172);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2093:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2097:1: ( ( ( '-' )? ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2098:1: ( ( '-' )? )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2098:1: ( ( '-' )? )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2099:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2100:1: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2101:2: '-'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__EDouble__Group__0__Impl4201); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2112:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2116:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2117:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__14234);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__14237);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2124:1: rule__EDouble__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2128:1: ( ( RULE_INT ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2129:1: ( RULE_INT )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2129:1: ( RULE_INT )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2130:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl4264); 
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2141:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2145:1: ( rule__EDouble__Group__2__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2146:2: rule__EDouble__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__24293);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2152:1: rule__EDouble__Group__2__Impl : ( ( rule__EDouble__Group_2__0 )? ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2156:1: ( ( ( rule__EDouble__Group_2__0 )? ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2157:1: ( ( rule__EDouble__Group_2__0 )? )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2157:1: ( ( rule__EDouble__Group_2__0 )? )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2158:1: ( rule__EDouble__Group_2__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_2()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2159:1: ( rule__EDouble__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2159:2: rule__EDouble__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_2__0_in_rule__EDouble__Group__2__Impl4320);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2175:1: rule__EDouble__Group_2__0 : rule__EDouble__Group_2__0__Impl rule__EDouble__Group_2__1 ;
    public final void rule__EDouble__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2179:1: ( rule__EDouble__Group_2__0__Impl rule__EDouble__Group_2__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2180:2: rule__EDouble__Group_2__0__Impl rule__EDouble__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_2__0__Impl_in_rule__EDouble__Group_2__04357);
            rule__EDouble__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_2__1_in_rule__EDouble__Group_2__04360);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2187:1: rule__EDouble__Group_2__0__Impl : ( '.' ) ;
    public final void rule__EDouble__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2191:1: ( ( '.' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2192:1: ( '.' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2192:1: ( '.' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2193:1: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__EDouble__Group_2__0__Impl4388); 
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2206:1: rule__EDouble__Group_2__1 : rule__EDouble__Group_2__1__Impl rule__EDouble__Group_2__2 ;
    public final void rule__EDouble__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2210:1: ( rule__EDouble__Group_2__1__Impl rule__EDouble__Group_2__2 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2211:2: rule__EDouble__Group_2__1__Impl rule__EDouble__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_2__1__Impl_in_rule__EDouble__Group_2__14419);
            rule__EDouble__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_2__2_in_rule__EDouble__Group_2__14422);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2218:1: rule__EDouble__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2222:1: ( ( RULE_INT ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2223:1: ( RULE_INT )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2223:1: ( RULE_INT )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2224:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group_2__1__Impl4449); 
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2235:1: rule__EDouble__Group_2__2 : rule__EDouble__Group_2__2__Impl ;
    public final void rule__EDouble__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2239:1: ( rule__EDouble__Group_2__2__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2240:2: rule__EDouble__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_2__2__Impl_in_rule__EDouble__Group_2__24478);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2246:1: rule__EDouble__Group_2__2__Impl : ( ( rule__EDouble__Group_2_2__0 )? ) ;
    public final void rule__EDouble__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2250:1: ( ( ( rule__EDouble__Group_2_2__0 )? ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2251:1: ( ( rule__EDouble__Group_2_2__0 )? )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2251:1: ( ( rule__EDouble__Group_2_2__0 )? )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2252:1: ( rule__EDouble__Group_2_2__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_2_2()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2253:1: ( rule__EDouble__Group_2_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=11 && LA17_0<=12)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2253:2: rule__EDouble__Group_2_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_2_2__0_in_rule__EDouble__Group_2__2__Impl4505);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2269:1: rule__EDouble__Group_2_2__0 : rule__EDouble__Group_2_2__0__Impl rule__EDouble__Group_2_2__1 ;
    public final void rule__EDouble__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2273:1: ( rule__EDouble__Group_2_2__0__Impl rule__EDouble__Group_2_2__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2274:2: rule__EDouble__Group_2_2__0__Impl rule__EDouble__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_2_2__0__Impl_in_rule__EDouble__Group_2_2__04542);
            rule__EDouble__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_2_2__1_in_rule__EDouble__Group_2_2__04545);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2281:1: rule__EDouble__Group_2_2__0__Impl : ( ( rule__EDouble__Alternatives_2_2_0 ) ) ;
    public final void rule__EDouble__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2285:1: ( ( ( rule__EDouble__Alternatives_2_2_0 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2286:1: ( ( rule__EDouble__Alternatives_2_2_0 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2286:1: ( ( rule__EDouble__Alternatives_2_2_0 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2287:1: ( rule__EDouble__Alternatives_2_2_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_2_2_0()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2288:1: ( rule__EDouble__Alternatives_2_2_0 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2288:2: rule__EDouble__Alternatives_2_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Alternatives_2_2_0_in_rule__EDouble__Group_2_2__0__Impl4572);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2298:1: rule__EDouble__Group_2_2__1 : rule__EDouble__Group_2_2__1__Impl rule__EDouble__Group_2_2__2 ;
    public final void rule__EDouble__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2302:1: ( rule__EDouble__Group_2_2__1__Impl rule__EDouble__Group_2_2__2 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2303:2: rule__EDouble__Group_2_2__1__Impl rule__EDouble__Group_2_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_2_2__1__Impl_in_rule__EDouble__Group_2_2__14602);
            rule__EDouble__Group_2_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_2_2__2_in_rule__EDouble__Group_2_2__14605);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2310:1: rule__EDouble__Group_2_2__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2314:1: ( ( ( '-' )? ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2315:1: ( ( '-' )? )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2315:1: ( ( '-' )? )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2316:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_2_2_1()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2317:1: ( '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2318:2: '-'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__EDouble__Group_2_2__1__Impl4634); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2329:1: rule__EDouble__Group_2_2__2 : rule__EDouble__Group_2_2__2__Impl ;
    public final void rule__EDouble__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2333:1: ( rule__EDouble__Group_2_2__2__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2334:2: rule__EDouble__Group_2_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_2_2__2__Impl_in_rule__EDouble__Group_2_2__24667);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2340:1: rule__EDouble__Group_2_2__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2344:1: ( ( RULE_INT ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2345:1: ( RULE_INT )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2345:1: ( RULE_INT )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2346:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2_2_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group_2_2__2__Impl4694); 
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2363:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2367:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2368:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__04729);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__04732);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2375:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2379:1: ( ( ( '-' )? ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2380:1: ( ( '-' )? )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2380:1: ( ( '-' )? )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2381:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2382:1: ( '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2383:2: '-'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__EInt__Group__0__Impl4761); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2394:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2398:1: ( rule__EInt__Group__1__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2399:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__14794);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2405:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2409:1: ( ( RULE_INT ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2410:1: ( RULE_INT )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2410:1: ( RULE_INT )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2411:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl4821); 
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


    // $ANTLR start "rule__EBoolean__Group__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2426:1: rule__EBoolean__Group__0 : rule__EBoolean__Group__0__Impl rule__EBoolean__Group__1 ;
    public final void rule__EBoolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2430:1: ( rule__EBoolean__Group__0__Impl rule__EBoolean__Group__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2431:2: rule__EBoolean__Group__0__Impl rule__EBoolean__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBoolean__Group__0__Impl_in_rule__EBoolean__Group__04854);
            rule__EBoolean__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EBoolean__Group__1_in_rule__EBoolean__Group__04857);
            rule__EBoolean__Group__1();

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
    // $ANTLR end "rule__EBoolean__Group__0"


    // $ANTLR start "rule__EBoolean__Group__0__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2438:1: rule__EBoolean__Group__0__Impl : ( RULE_STRING ) ;
    public final void rule__EBoolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2442:1: ( ( RULE_STRING ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2443:1: ( RULE_STRING )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2443:1: ( RULE_STRING )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2444:1: RULE_STRING
            {
             before(grammarAccess.getEBooleanAccess().getSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EBoolean__Group__0__Impl4884); 
             after(grammarAccess.getEBooleanAccess().getSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__EBoolean__Group__0__Impl"


    // $ANTLR start "rule__EBoolean__Group__1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2455:1: rule__EBoolean__Group__1 : rule__EBoolean__Group__1__Impl ;
    public final void rule__EBoolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2459:1: ( rule__EBoolean__Group__1__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2460:2: rule__EBoolean__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBoolean__Group__1__Impl_in_rule__EBoolean__Group__14913);
            rule__EBoolean__Group__1__Impl();

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
    // $ANTLR end "rule__EBoolean__Group__1"


    // $ANTLR start "rule__EBoolean__Group__1__Impl"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2466:1: rule__EBoolean__Group__1__Impl : ( ( rule__EBoolean__Alternatives_1 ) ) ;
    public final void rule__EBoolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2470:1: ( ( ( rule__EBoolean__Alternatives_1 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2471:1: ( ( rule__EBoolean__Alternatives_1 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2471:1: ( ( rule__EBoolean__Alternatives_1 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2472:1: ( rule__EBoolean__Alternatives_1 )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives_1()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2473:1: ( rule__EBoolean__Alternatives_1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2473:2: rule__EBoolean__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBoolean__Alternatives_1_in_rule__EBoolean__Group__1__Impl4940);
            rule__EBoolean__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__EBoolean__Group__1__Impl"


    // $ANTLR start "rule__QATest__TitleAssignment_1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2488:1: rule__QATest__TitleAssignment_1 : ( ruleEString ) ;
    public final void rule__QATest__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2492:1: ( ( ruleEString ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2493:1: ( ruleEString )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2493:1: ( ruleEString )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2494:1: ruleEString
            {
             before(grammarAccess.getQATestAccess().getTitleEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__QATest__TitleAssignment_14979);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2503:1: rule__QATest__OptionsAssignment_2 : ( ruleQAContainerOptions ) ;
    public final void rule__QATest__OptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2507:1: ( ( ruleQAContainerOptions ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2508:1: ( ruleQAContainerOptions )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2508:1: ( ruleQAContainerOptions )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2509:1: ruleQAContainerOptions
            {
             before(grammarAccess.getQATestAccess().getOptionsQAContainerOptionsParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQAContainerOptions_in_rule__QATest__OptionsAssignment_25010);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2518:1: rule__QATest__PartsAssignment_3 : ( ruleQAPart ) ;
    public final void rule__QATest__PartsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2522:1: ( ( ruleQAPart ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2523:1: ( ruleQAPart )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2523:1: ( ruleQAPart )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2524:1: ruleQAPart
            {
             before(grammarAccess.getQATestAccess().getPartsQAPartParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQAPart_in_rule__QATest__PartsAssignment_35041);
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


    // $ANTLR start "rule__QAContainerOptions__RevealAnswerAssignment_1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2533:1: rule__QAContainerOptions__RevealAnswerAssignment_1 : ( ruleEBoolean ) ;
    public final void rule__QAContainerOptions__RevealAnswerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2537:1: ( ( ruleEBoolean ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2538:1: ( ruleEBoolean )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2538:1: ( ruleEBoolean )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2539:1: ruleEBoolean
            {
             before(grammarAccess.getQAContainerOptionsAccess().getRevealAnswerEBooleanParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__QAContainerOptions__RevealAnswerAssignment_15072);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getQAContainerOptionsAccess().getRevealAnswerEBooleanParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__QAContainerOptions__RevealAnswerAssignment_1"


    // $ANTLR start "rule__QAContainerOptions__MaxTriesAssignment_3"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2548:1: rule__QAContainerOptions__MaxTriesAssignment_3 : ( RULE_INT ) ;
    public final void rule__QAContainerOptions__MaxTriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2552:1: ( ( RULE_INT ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2553:1: ( RULE_INT )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2553:1: ( RULE_INT )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2554:1: RULE_INT
            {
             before(grammarAccess.getQAContainerOptionsAccess().getMaxTriesINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__QAContainerOptions__MaxTriesAssignment_35103); 
             after(grammarAccess.getQAContainerOptionsAccess().getMaxTriesINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__QAContainerOptions__MaxTriesAssignment_3"


    // $ANTLR start "rule__QAContainerOptions__RevealAnswerAssignment_5_0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2563:1: rule__QAContainerOptions__RevealAnswerAssignment_5_0 : ( ( 'reveal' ) ) ;
    public final void rule__QAContainerOptions__RevealAnswerAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2567:1: ( ( ( 'reveal' ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2568:1: ( ( 'reveal' ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2568:1: ( ( 'reveal' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2569:1: ( 'reveal' )
            {
             before(grammarAccess.getQAContainerOptionsAccess().getRevealAnswerRevealKeyword_5_0_0()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2570:1: ( 'reveal' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2571:1: 'reveal'
            {
             before(grammarAccess.getQAContainerOptionsAccess().getRevealAnswerRevealKeyword_5_0_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__QAContainerOptions__RevealAnswerAssignment_5_05139); 
             after(grammarAccess.getQAContainerOptionsAccess().getRevealAnswerRevealKeyword_5_0_0()); 

            }

             after(grammarAccess.getQAContainerOptionsAccess().getRevealAnswerRevealKeyword_5_0_0()); 

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
    // $ANTLR end "rule__QAContainerOptions__RevealAnswerAssignment_5_0"


    // $ANTLR start "rule__QASection__TitleAssignment_1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2586:1: rule__QASection__TitleAssignment_1 : ( ruleEString ) ;
    public final void rule__QASection__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2590:1: ( ( ruleEString ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2591:1: ( ruleEString )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2591:1: ( ruleEString )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2592:1: ruleEString
            {
             before(grammarAccess.getQASectionAccess().getTitleEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__QASection__TitleAssignment_15178);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQASectionAccess().getTitleEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__QASection__TitleAssignment_1"


    // $ANTLR start "rule__QASection__NameAssignment_3"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2601:1: rule__QASection__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__QASection__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2605:1: ( ( ruleEString ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2606:1: ( ruleEString )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2606:1: ( ruleEString )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2607:1: ruleEString
            {
             before(grammarAccess.getQASectionAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__QASection__NameAssignment_35209);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQASectionAccess().getNameEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__QASection__NameAssignment_3"


    // $ANTLR start "rule__QASection__OptionsAssignment_4"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2616:1: rule__QASection__OptionsAssignment_4 : ( ruleQAContainerOptions ) ;
    public final void rule__QASection__OptionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2620:1: ( ( ruleQAContainerOptions ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2621:1: ( ruleQAContainerOptions )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2621:1: ( ruleQAContainerOptions )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2622:1: ruleQAContainerOptions
            {
             before(grammarAccess.getQASectionAccess().getOptionsQAContainerOptionsParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQAContainerOptions_in_rule__QASection__OptionsAssignment_45240);
            ruleQAContainerOptions();

            state._fsp--;

             after(grammarAccess.getQASectionAccess().getOptionsQAContainerOptionsParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__QASection__OptionsAssignment_4"


    // $ANTLR start "rule__QASection__QuestionsAssignment_5"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2631:1: rule__QASection__QuestionsAssignment_5 : ( ruleQuestion ) ;
    public final void rule__QASection__QuestionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2635:1: ( ( ruleQuestion ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2636:1: ( ruleQuestion )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2636:1: ( ruleQuestion )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2637:1: ruleQuestion
            {
             before(grammarAccess.getQASectionAccess().getQuestionsQuestionParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__QASection__QuestionsAssignment_55271);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQASectionAccess().getQuestionsQuestionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__QASection__QuestionsAssignment_5"


    // $ANTLR start "rule__NextRule__TriesAssignment_1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2646:1: rule__NextRule__TriesAssignment_1 : ( ruleEInt ) ;
    public final void rule__NextRule__TriesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2650:1: ( ( ruleEInt ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2651:1: ( ruleEInt )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2651:1: ( ruleEInt )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2652:1: ruleEInt
            {
             before(grammarAccess.getNextRuleAccess().getTriesEIntParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__NextRule__TriesAssignment_15302);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getNextRuleAccess().getTriesEIntParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NextRule__TriesAssignment_1"


    // $ANTLR start "rule__TextAnswer__TextAssignment_1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2661:1: rule__TextAnswer__TextAssignment_1 : ( ruleEString ) ;
    public final void rule__TextAnswer__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2665:1: ( ( ruleEString ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2666:1: ( ruleEString )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2666:1: ( ruleEString )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2667:1: ruleEString
            {
             before(grammarAccess.getTextAnswerAccess().getTextEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TextAnswer__TextAssignment_15333);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTextAnswerAccess().getTextEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TextAnswer__TextAssignment_1"


    // $ANTLR start "rule__ExpressionAnswer__EpsilonAssignment_1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2676:1: rule__ExpressionAnswer__EpsilonAssignment_1 : ( ruleEDouble ) ;
    public final void rule__ExpressionAnswer__EpsilonAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2680:1: ( ( ruleEDouble ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2681:1: ( ruleEDouble )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2681:1: ( ruleEDouble )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2682:1: ruleEDouble
            {
             before(grammarAccess.getExpressionAnswerAccess().getEpsilonEDoubleParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__ExpressionAnswer__EpsilonAssignment_15364);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getExpressionAnswerAccess().getEpsilonEDoubleParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ExpressionAnswer__EpsilonAssignment_1"


    // $ANTLR start "rule__ExpressionAnswer__NumberAssignment_3"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2691:1: rule__ExpressionAnswer__NumberAssignment_3 : ( ruleEDouble ) ;
    public final void rule__ExpressionAnswer__NumberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2695:1: ( ( ruleEDouble ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2696:1: ( ruleEDouble )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2696:1: ( ruleEDouble )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2697:1: ruleEDouble
            {
             before(grammarAccess.getExpressionAnswerAccess().getNumberEDoubleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__ExpressionAnswer__NumberAssignment_35395);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getExpressionAnswerAccess().getNumberEDoubleParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ExpressionAnswer__NumberAssignment_3"


    // $ANTLR start "rule__ExpressionAnswer__ExpressionAssignment_5"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2706:1: rule__ExpressionAnswer__ExpressionAssignment_5 : ( ruleEString ) ;
    public final void rule__ExpressionAnswer__ExpressionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2710:1: ( ( ruleEString ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2711:1: ( ruleEString )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2711:1: ( ruleEString )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2712:1: ruleEString
            {
             before(grammarAccess.getExpressionAnswerAccess().getExpressionEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ExpressionAnswer__ExpressionAssignment_55426);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExpressionAnswerAccess().getExpressionEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ExpressionAnswer__ExpressionAssignment_5"


    // $ANTLR start "rule__NumberAnswer__EpsilonAssignment_0_1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2721:1: rule__NumberAnswer__EpsilonAssignment_0_1 : ( ruleEDouble ) ;
    public final void rule__NumberAnswer__EpsilonAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2725:1: ( ( ruleEDouble ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2726:1: ( ruleEDouble )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2726:1: ( ruleEDouble )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2727:1: ruleEDouble
            {
             before(grammarAccess.getNumberAnswerAccess().getEpsilonEDoubleParserRuleCall_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__NumberAnswer__EpsilonAssignment_0_15457);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getNumberAnswerAccess().getEpsilonEDoubleParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__NumberAnswer__EpsilonAssignment_0_1"


    // $ANTLR start "rule__NumberAnswer__NumberAssignment_0_3"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2736:1: rule__NumberAnswer__NumberAssignment_0_3 : ( ruleEDouble ) ;
    public final void rule__NumberAnswer__NumberAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2740:1: ( ( ruleEDouble ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2741:1: ( ruleEDouble )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2741:1: ( ruleEDouble )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2742:1: ruleEDouble
            {
             before(grammarAccess.getNumberAnswerAccess().getNumberEDoubleParserRuleCall_0_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__NumberAnswer__NumberAssignment_0_35488);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getNumberAnswerAccess().getNumberEDoubleParserRuleCall_0_3_0()); 

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
    // $ANTLR end "rule__NumberAnswer__NumberAssignment_0_3"


    // $ANTLR start "rule__YesNoAnswer__YesAssignment_1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2751:1: rule__YesNoAnswer__YesAssignment_1 : ( ruleEBoolean ) ;
    public final void rule__YesNoAnswer__YesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2755:1: ( ( ruleEBoolean ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2756:1: ( ruleEBoolean )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2756:1: ( ruleEBoolean )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2757:1: ruleEBoolean
            {
             before(grammarAccess.getYesNoAnswerAccess().getYesEBooleanParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__YesNoAnswer__YesAssignment_15519);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getYesNoAnswerAccess().getYesEBooleanParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__YesNoAnswer__YesAssignment_1"


    // $ANTLR start "rule__OptionAnswer__OptionNumberAssignment_1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2766:1: rule__OptionAnswer__OptionNumberAssignment_1 : ( ruleEInt ) ;
    public final void rule__OptionAnswer__OptionNumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2770:1: ( ( ruleEInt ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2771:1: ( ruleEInt )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2771:1: ( ruleEInt )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2772:1: ruleEInt
            {
             before(grammarAccess.getOptionAnswerAccess().getOptionNumberEIntParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__OptionAnswer__OptionNumberAssignment_15550);
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


    // $ANTLR start "rule__Question__TextAssignment_1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2781:1: rule__Question__TextAssignment_1 : ( ruleEString ) ;
    public final void rule__Question__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2785:1: ( ( ruleEString ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2786:1: ( ruleEString )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2786:1: ( ruleEString )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2787:1: ruleEString
            {
             before(grammarAccess.getQuestionAccess().getTextEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Question__TextAssignment_15581);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getTextEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Question__TextAssignment_1"


    // $ANTLR start "rule__Question__NameAssignment_3"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2796:1: rule__Question__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Question__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2800:1: ( ( ruleEString ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2801:1: ( ruleEString )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2801:1: ( ruleEString )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2802:1: ruleEString
            {
             before(grammarAccess.getQuestionAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Question__NameAssignment_35612);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getNameEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Question__NameAssignment_3"


    // $ANTLR start "rule__Question__NextRulesAssignment_4"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2811:1: rule__Question__NextRulesAssignment_4 : ( ruleNextRule ) ;
    public final void rule__Question__NextRulesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2815:1: ( ( ruleNextRule ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2816:1: ( ruleNextRule )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2816:1: ( ruleNextRule )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2817:1: ruleNextRule
            {
             before(grammarAccess.getQuestionAccess().getNextRulesNextRuleParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleNextRule_in_rule__Question__NextRulesAssignment_45643);
            ruleNextRule();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getNextRulesNextRuleParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Question__NextRulesAssignment_4"


    // $ANTLR start "rule__Question__CorrectAssignment_5"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2826:1: rule__Question__CorrectAssignment_5 : ( ruleAnswer ) ;
    public final void rule__Question__CorrectAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2830:1: ( ( ruleAnswer ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2831:1: ( ruleAnswer )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2831:1: ( ruleAnswer )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2832:1: ruleAnswer
            {
             before(grammarAccess.getQuestionAccess().getCorrectAnswerParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__Question__CorrectAssignment_55674);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getCorrectAnswerParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Question__CorrectAssignment_5"


    // $ANTLR start "rule__Question__CandidatesAssignment_6"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2841:1: rule__Question__CandidatesAssignment_6 : ( ruleAnswer ) ;
    public final void rule__Question__CandidatesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2845:1: ( ( ruleAnswer ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2846:1: ( ruleAnswer )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2846:1: ( ruleAnswer )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:2847:1: ruleAnswer
            {
             before(grammarAccess.getQuestionAccess().getCandidatesAnswerParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__Question__CandidatesAssignment_65705);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getCandidatesAnswerParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Question__CandidatesAssignment_6"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA3_eotS =
        "\25\uffff";
    static final String DFA3_eofS =
        "\10\uffff\1\14\7\uffff\1\14\3\uffff\1\14";
    static final String DFA3_minS =
        "\1\30\2\5\1\31\2\5\1\13\1\5\1\17\3\5\2\uffff\1\5\1\31\1\13\3\5"+
        "\1\17";
    static final String DFA3_maxS =
        "\1\30\1\35\1\5\1\36\1\5\1\35\1\31\1\5\1\36\2\35\1\5\2\uffff\1\5"+
        "\1\31\1\34\2\35\1\5\1\34";
    static final String DFA3_acceptS =
        "\14\uffff\1\1\1\2\7\uffff";
    static final String DFA3_specialS =
        "\25\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\3\27\uffff\1\2",
            "\1\3",
            "\1\5\4\uffff\1\4",
            "\1\6",
            "\1\10\27\uffff\1\7",
            "\1\11\1\12\14\uffff\1\5",
            "\1\10",
            "\1\14\7\uffff\2\14\1\uffff\1\15\2\14\1\uffff\1\13",
            "\1\17\27\uffff\1\16",
            "\1\17\27\uffff\1\16",
            "\1\20",
            "",
            "",
            "\1\17",
            "\1\5",
            "\1\21\1\22\2\uffff\1\14\7\uffff\2\14\1\uffff\1\15\2\14",
            "\1\24\27\uffff\1\23",
            "\1\24\27\uffff\1\23",
            "\1\24",
            "\1\14\7\uffff\2\14\1\uffff\1\15\2\14"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "580:1: rule__NumberAnswer__Alternatives : ( ( ( rule__NumberAnswer__Group_0__0 ) ) | ( ruleExpressionAnswer ) );";
        }
    }
    static final String DFA13_eotS =
        "\27\uffff";
    static final String DFA13_eofS =
        "\1\5\26\uffff";
    static final String DFA13_minS =
        "\1\17\1\4\1\5\1\4\1\5\2\uffff\1\5\1\31\1\15\1\5\1\uffff\2\5\2\uffff"+
        "\1\13\1\5\1\uffff\3\5\1\31";
    static final String DFA13_maxS =
        "\1\34\1\4\1\35\1\4\1\35\2\uffff\1\5\1\36\1\16\1\5\1\uffff\1\5\1"+
        "\35\2\uffff\1\31\1\5\1\uffff\2\35\1\5\1\31";
    static final String DFA13_acceptS =
        "\5\uffff\1\2\1\1\4\uffff\1\1\2\uffff\2\1\2\uffff\1\1\4\uffff";
    static final String DFA13_specialS =
        "\27\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\5\7\uffff\1\1\1\2\2\uffff\1\3\1\4",
            "\1\6",
            "\1\10\27\uffff\1\7",
            "\1\11",
            "\1\13\27\uffff\1\12",
            "",
            "",
            "\1\10",
            "\1\15\4\uffff\1\14",
            "\1\16\1\17",
            "\1\13",
            "",
            "\1\20",
            "\1\22\27\uffff\1\21",
            "",
            "",
            "\1\23\1\24\14\uffff\1\15",
            "\1\22",
            "",
            "\1\26\27\uffff\1\25",
            "\1\26\27\uffff\1\25",
            "\1\26",
            "\1\15"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "2029:1: ( rule__Question__CorrectAssignment_5 )?";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleQAContainer_in_entryRuleQAContainer61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQAContainer68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainer__Alternatives_in_ruleQAContainer94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQATest_in_entryRuleQATest121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQATest128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QATest__Group__0_in_ruleQATest154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQAContainerOptions_in_entryRuleQAContainerOptions181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQAContainerOptions188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__0_in_ruleQAContainerOptions214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQAPart_in_entryRuleQAPart241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQAPart248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAPart__Alternatives_in_ruleQAPart274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQASection_in_entryRuleQASection301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQASection308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QASection__Group__0_in_ruleQASection334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNextRule_in_entryRuleNextRule361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNextRule368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NextRule__Group__0_in_ruleNextRule394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextAnswer_in_entryRuleTextAnswer421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextAnswer428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextAnswer__Group__0_in_ruleTextAnswer454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionAnswer_in_entryRuleExpressionAnswer481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpressionAnswer488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionAnswer__Group__0_in_ruleExpressionAnswer514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberAnswer_in_entryRuleNumberAnswer541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumberAnswer548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumberAnswer__Alternatives_in_ruleNumberAnswer574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleYesNoAnswer_in_entryRuleYesNoAnswer601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleYesNoAnswer608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__YesNoAnswer__Group__0_in_ruleYesNoAnswer634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptionAnswer_in_entryRuleOptionAnswer661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOptionAnswer668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OptionAnswer__Group__0_in_ruleOptionAnswer694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Alternatives_in_ruleAnswer754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__0_in_ruleQuestion814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble900 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0_in_ruleEDouble933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt960 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean1020 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean1027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBoolean__Group__0_in_ruleEBoolean1053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQATest_in_rule__QAContainer__Alternatives1089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQASection_in_rule__QAContainer__Alternatives1106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__QAPart__Alternatives1138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQASection_in_rule__QAPart__Alternatives1155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumberAnswer__Group_0__0_in_rule__NumberAnswer__Alternatives1187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionAnswer_in_rule__NumberAnswer__Alternatives1205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextAnswer_in_rule__Answer__Alternatives1237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberAnswer_in_rule__Answer__Alternatives1254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleYesNoAnswer_in_rule__Answer__Alternatives1271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptionAnswer_in_rule__Answer__Alternatives1288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EDouble__Alternatives_2_2_01321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EDouble__Alternatives_2_2_01341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__EBoolean__Alternatives_11376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__EBoolean__Alternatives_11396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QATest__Group__0__Impl_in_rule__QATest__Group__01428 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QATest__Group__1_in_rule__QATest__Group__01431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__QATest__Group__0__Impl1459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QATest__Group__1__Impl_in_rule__QATest__Group__11490 = new BitSet(new long[]{0x0000000000818000L});
        public static final BitSet FOLLOW_rule__QATest__Group__2_in_rule__QATest__Group__11493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QATest__TitleAssignment_1_in_rule__QATest__Group__1__Impl1520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QATest__Group__2__Impl_in_rule__QATest__Group__21550 = new BitSet(new long[]{0x0000000000818000L});
        public static final BitSet FOLLOW_rule__QATest__Group__3_in_rule__QATest__Group__21553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QATest__OptionsAssignment_2_in_rule__QATest__Group__2__Impl1580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QATest__Group__3__Impl_in_rule__QATest__Group__31611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QATest__PartsAssignment_3_in_rule__QATest__Group__3__Impl1638 = new BitSet(new long[]{0x0000000000808002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__0__Impl_in_rule__QAContainerOptions__Group__01677 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__1_in_rule__QAContainerOptions__Group__01680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__QAContainerOptions__Group__0__Impl1708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__1__Impl_in_rule__QAContainerOptions__Group__11739 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__2_in_rule__QAContainerOptions__Group__11742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__RevealAnswerAssignment_1_in_rule__QAContainerOptions__Group__1__Impl1769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__2__Impl_in_rule__QAContainerOptions__Group__21799 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__3_in_rule__QAContainerOptions__Group__21802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__QAContainerOptions__Group__2__Impl1830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__3__Impl_in_rule__QAContainerOptions__Group__31861 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__4_in_rule__QAContainerOptions__Group__31864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__MaxTriesAssignment_3_in_rule__QAContainerOptions__Group__3__Impl1891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__4__Impl_in_rule__QAContainerOptions__Group__41921 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__5_in_rule__QAContainerOptions__Group__41924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__QAContainerOptions__Group__4__Impl1952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__5__Impl_in_rule__QAContainerOptions__Group__51983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group_5__0_in_rule__QAContainerOptions__Group__5__Impl2010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group_5__0__Impl_in_rule__QAContainerOptions__Group_5__02053 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group_5__1_in_rule__QAContainerOptions__Group_5__02056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__RevealAnswerAssignment_5_0_in_rule__QAContainerOptions__Group_5__0__Impl2083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group_5__1__Impl_in_rule__QAContainerOptions__Group_5__12113 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group_5__2_in_rule__QAContainerOptions__Group_5__12116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__QAContainerOptions__Group_5__1__Impl2144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group_5__2__Impl_in_rule__QAContainerOptions__Group_5__22175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__QAContainerOptions__Group_5__2__Impl2203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QASection__Group__0__Impl_in_rule__QASection__Group__02240 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QASection__Group__1_in_rule__QASection__Group__02243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__QASection__Group__0__Impl2271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QASection__Group__1__Impl_in_rule__QASection__Group__12302 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__QASection__Group__2_in_rule__QASection__Group__12305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QASection__TitleAssignment_1_in_rule__QASection__Group__1__Impl2332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QASection__Group__2__Impl_in_rule__QASection__Group__22362 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QASection__Group__3_in_rule__QASection__Group__22365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__QASection__Group__2__Impl2393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QASection__Group__3__Impl_in_rule__QASection__Group__32424 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_rule__QASection__Group__4_in_rule__QASection__Group__32427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QASection__NameAssignment_3_in_rule__QASection__Group__3__Impl2454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QASection__Group__4__Impl_in_rule__QASection__Group__42484 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_rule__QASection__Group__5_in_rule__QASection__Group__42487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QASection__OptionsAssignment_4_in_rule__QASection__Group__4__Impl2514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QASection__Group__5__Impl_in_rule__QASection__Group__52545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QASection__QuestionsAssignment_5_in_rule__QASection__Group__5__Impl2572 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__NextRule__Group__0__Impl_in_rule__NextRule__Group__02615 = new BitSet(new long[]{0x0000000020000020L});
        public static final BitSet FOLLOW_rule__NextRule__Group__1_in_rule__NextRule__Group__02618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__NextRule__Group__0__Impl2646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NextRule__Group__1__Impl_in_rule__NextRule__Group__12677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NextRule__TriesAssignment_1_in_rule__NextRule__Group__1__Impl2704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextAnswer__Group__0__Impl_in_rule__TextAnswer__Group__02738 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TextAnswer__Group__1_in_rule__TextAnswer__Group__02741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__TextAnswer__Group__0__Impl2769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextAnswer__Group__1__Impl_in_rule__TextAnswer__Group__12800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextAnswer__TextAssignment_1_in_rule__TextAnswer__Group__1__Impl2827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionAnswer__Group__0__Impl_in_rule__ExpressionAnswer__Group__02861 = new BitSet(new long[]{0x0000000020000020L});
        public static final BitSet FOLLOW_rule__ExpressionAnswer__Group__1_in_rule__ExpressionAnswer__Group__02864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__ExpressionAnswer__Group__0__Impl2892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionAnswer__Group__1__Impl_in_rule__ExpressionAnswer__Group__12923 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__ExpressionAnswer__Group__2_in_rule__ExpressionAnswer__Group__12926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionAnswer__EpsilonAssignment_1_in_rule__ExpressionAnswer__Group__1__Impl2953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionAnswer__Group__2__Impl_in_rule__ExpressionAnswer__Group__22983 = new BitSet(new long[]{0x0000000020000020L});
        public static final BitSet FOLLOW_rule__ExpressionAnswer__Group__3_in_rule__ExpressionAnswer__Group__22986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ExpressionAnswer__Group__2__Impl3014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionAnswer__Group__3__Impl_in_rule__ExpressionAnswer__Group__33045 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__ExpressionAnswer__Group__4_in_rule__ExpressionAnswer__Group__33048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionAnswer__NumberAssignment_3_in_rule__ExpressionAnswer__Group__3__Impl3075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionAnswer__Group__4__Impl_in_rule__ExpressionAnswer__Group__43105 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ExpressionAnswer__Group__5_in_rule__ExpressionAnswer__Group__43108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ExpressionAnswer__Group__4__Impl3136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionAnswer__Group__5__Impl_in_rule__ExpressionAnswer__Group__53167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ExpressionAnswer__ExpressionAssignment_5_in_rule__ExpressionAnswer__Group__5__Impl3194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumberAnswer__Group_0__0__Impl_in_rule__NumberAnswer__Group_0__03236 = new BitSet(new long[]{0x0000000020000020L});
        public static final BitSet FOLLOW_rule__NumberAnswer__Group_0__1_in_rule__NumberAnswer__Group_0__03239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__NumberAnswer__Group_0__0__Impl3267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumberAnswer__Group_0__1__Impl_in_rule__NumberAnswer__Group_0__13298 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__NumberAnswer__Group_0__2_in_rule__NumberAnswer__Group_0__13301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumberAnswer__EpsilonAssignment_0_1_in_rule__NumberAnswer__Group_0__1__Impl3328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumberAnswer__Group_0__2__Impl_in_rule__NumberAnswer__Group_0__23358 = new BitSet(new long[]{0x0000000020000020L});
        public static final BitSet FOLLOW_rule__NumberAnswer__Group_0__3_in_rule__NumberAnswer__Group_0__23361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__NumberAnswer__Group_0__2__Impl3389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumberAnswer__Group_0__3__Impl_in_rule__NumberAnswer__Group_0__33420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NumberAnswer__NumberAssignment_0_3_in_rule__NumberAnswer__Group_0__3__Impl3447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__YesNoAnswer__Group__0__Impl_in_rule__YesNoAnswer__Group__03485 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__YesNoAnswer__Group__1_in_rule__YesNoAnswer__Group__03488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__YesNoAnswer__Group__0__Impl3516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__YesNoAnswer__Group__1__Impl_in_rule__YesNoAnswer__Group__13547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__YesNoAnswer__YesAssignment_1_in_rule__YesNoAnswer__Group__1__Impl3574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OptionAnswer__Group__0__Impl_in_rule__OptionAnswer__Group__03608 = new BitSet(new long[]{0x0000000020000020L});
        public static final BitSet FOLLOW_rule__OptionAnswer__Group__1_in_rule__OptionAnswer__Group__03611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__OptionAnswer__Group__0__Impl3639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OptionAnswer__Group__1__Impl_in_rule__OptionAnswer__Group__13670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OptionAnswer__OptionNumberAssignment_1_in_rule__OptionAnswer__Group__1__Impl3697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__03731 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Question__Group__1_in_rule__Question__Group__03734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Question__Group__0__Impl3762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__13793 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Question__Group__2_in_rule__Question__Group__13796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__TextAssignment_1_in_rule__Question__Group__1__Impl3823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__23853 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Question__Group__3_in_rule__Question__Group__23856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Question__Group__2__Impl3884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__33915 = new BitSet(new long[]{0x0000000019C00000L});
        public static final BitSet FOLLOW_rule__Question__Group__4_in_rule__Question__Group__33918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__NameAssignment_3_in_rule__Question__Group__3__Impl3945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__43975 = new BitSet(new long[]{0x0000000019C00000L});
        public static final BitSet FOLLOW_rule__Question__Group__5_in_rule__Question__Group__43978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__NextRulesAssignment_4_in_rule__Question__Group__4__Impl4005 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__Question__Group__5__Impl_in_rule__Question__Group__54036 = new BitSet(new long[]{0x0000000019C00000L});
        public static final BitSet FOLLOW_rule__Question__Group__6_in_rule__Question__Group__54039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__CorrectAssignment_5_in_rule__Question__Group__5__Impl4066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__Group__6__Impl_in_rule__Question__Group__64097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Question__CandidatesAssignment_6_in_rule__Question__Group__6__Impl4124 = new BitSet(new long[]{0x0000000019800002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__04169 = new BitSet(new long[]{0x0000000020000020L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__04172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__EDouble__Group__0__Impl4201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__14234 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__14237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl4264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__24293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_2__0_in_rule__EDouble__Group__2__Impl4320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_2__0__Impl_in_rule__EDouble__Group_2__04357 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__EDouble__Group_2__1_in_rule__EDouble__Group_2__04360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__EDouble__Group_2__0__Impl4388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_2__1__Impl_in_rule__EDouble__Group_2__14419 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__EDouble__Group_2__2_in_rule__EDouble__Group_2__14422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group_2__1__Impl4449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_2__2__Impl_in_rule__EDouble__Group_2__24478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_2_2__0_in_rule__EDouble__Group_2__2__Impl4505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_2_2__0__Impl_in_rule__EDouble__Group_2_2__04542 = new BitSet(new long[]{0x0000000020000020L});
        public static final BitSet FOLLOW_rule__EDouble__Group_2_2__1_in_rule__EDouble__Group_2_2__04545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Alternatives_2_2_0_in_rule__EDouble__Group_2_2__0__Impl4572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_2_2__1__Impl_in_rule__EDouble__Group_2_2__14602 = new BitSet(new long[]{0x0000000020000020L});
        public static final BitSet FOLLOW_rule__EDouble__Group_2_2__2_in_rule__EDouble__Group_2_2__14605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__EDouble__Group_2_2__1__Impl4634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_2_2__2__Impl_in_rule__EDouble__Group_2_2__24667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group_2_2__2__Impl4694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__04729 = new BitSet(new long[]{0x0000000020000020L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__04732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__EInt__Group__0__Impl4761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__14794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl4821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBoolean__Group__0__Impl_in_rule__EBoolean__Group__04854 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__EBoolean__Group__1_in_rule__EBoolean__Group__04857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EBoolean__Group__0__Impl4884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBoolean__Group__1__Impl_in_rule__EBoolean__Group__14913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBoolean__Alternatives_1_in_rule__EBoolean__Group__1__Impl4940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__QATest__TitleAssignment_14979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQAContainerOptions_in_rule__QATest__OptionsAssignment_25010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQAPart_in_rule__QATest__PartsAssignment_35041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__QAContainerOptions__RevealAnswerAssignment_15072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__QAContainerOptions__MaxTriesAssignment_35103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__QAContainerOptions__RevealAnswerAssignment_5_05139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__QASection__TitleAssignment_15178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__QASection__NameAssignment_35209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQAContainerOptions_in_rule__QASection__OptionsAssignment_45240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__QASection__QuestionsAssignment_55271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__NextRule__TriesAssignment_15302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TextAnswer__TextAssignment_15333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__ExpressionAnswer__EpsilonAssignment_15364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__ExpressionAnswer__NumberAssignment_35395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ExpressionAnswer__ExpressionAssignment_55426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__NumberAnswer__EpsilonAssignment_0_15457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__NumberAnswer__NumberAssignment_0_35488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__YesNoAnswer__YesAssignment_15519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__OptionAnswer__OptionNumberAssignment_15550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Question__TextAssignment_15581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Question__NameAssignment_35612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNextRule_in_rule__Question__NextRulesAssignment_45643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__Question__CorrectAssignment_55674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__Question__CandidatesAssignment_65705 = new BitSet(new long[]{0x0000000000000002L});
    }


}