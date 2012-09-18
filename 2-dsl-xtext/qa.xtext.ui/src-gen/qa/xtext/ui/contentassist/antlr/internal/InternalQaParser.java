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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Title: '", "'try'", "'times'", "'correct'", "'answer'", "'reveal'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

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


    // $ANTLR start "entryRuleEString"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:116:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:117:1: ( ruleEString EOF )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:118:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString181);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString188); 

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:125:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:129:2: ( ( RULE_STRING ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:130:1: ( RULE_STRING )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:130:1: ( RULE_STRING )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:131:1: RULE_STRING
            {
             before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString214); 
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


    // $ANTLR start "rule__QATest__Group__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:151:1: rule__QATest__Group__0 : rule__QATest__Group__0__Impl rule__QATest__Group__1 ;
    public final void rule__QATest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:155:1: ( rule__QATest__Group__0__Impl rule__QATest__Group__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:156:2: rule__QATest__Group__0__Impl rule__QATest__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QATest__Group__0__Impl_in_rule__QATest__Group__0252);
            rule__QATest__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QATest__Group__1_in_rule__QATest__Group__0255);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:163:1: rule__QATest__Group__0__Impl : ( 'Title: ' ) ;
    public final void rule__QATest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:167:1: ( ( 'Title: ' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:168:1: ( 'Title: ' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:168:1: ( 'Title: ' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:169:1: 'Title: '
            {
             before(grammarAccess.getQATestAccess().getTitleKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__QATest__Group__0__Impl283); 
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:182:1: rule__QATest__Group__1 : rule__QATest__Group__1__Impl rule__QATest__Group__2 ;
    public final void rule__QATest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:186:1: ( rule__QATest__Group__1__Impl rule__QATest__Group__2 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:187:2: rule__QATest__Group__1__Impl rule__QATest__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QATest__Group__1__Impl_in_rule__QATest__Group__1314);
            rule__QATest__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QATest__Group__2_in_rule__QATest__Group__1317);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:194:1: rule__QATest__Group__1__Impl : ( ( rule__QATest__TitleAssignment_1 ) ) ;
    public final void rule__QATest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:198:1: ( ( ( rule__QATest__TitleAssignment_1 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:199:1: ( ( rule__QATest__TitleAssignment_1 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:199:1: ( ( rule__QATest__TitleAssignment_1 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:200:1: ( rule__QATest__TitleAssignment_1 )
            {
             before(grammarAccess.getQATestAccess().getTitleAssignment_1()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:201:1: ( rule__QATest__TitleAssignment_1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:201:2: rule__QATest__TitleAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QATest__TitleAssignment_1_in_rule__QATest__Group__1__Impl344);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:211:1: rule__QATest__Group__2 : rule__QATest__Group__2__Impl ;
    public final void rule__QATest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:215:1: ( rule__QATest__Group__2__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:216:2: rule__QATest__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QATest__Group__2__Impl_in_rule__QATest__Group__2374);
            rule__QATest__Group__2__Impl();

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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:222:1: rule__QATest__Group__2__Impl : ( ( rule__QATest__OptionsAssignment_2 )? ) ;
    public final void rule__QATest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:226:1: ( ( ( rule__QATest__OptionsAssignment_2 )? ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:227:1: ( ( rule__QATest__OptionsAssignment_2 )? )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:227:1: ( ( rule__QATest__OptionsAssignment_2 )? )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:228:1: ( rule__QATest__OptionsAssignment_2 )?
            {
             before(grammarAccess.getQATestAccess().getOptionsAssignment_2()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:229:1: ( rule__QATest__OptionsAssignment_2 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:229:2: rule__QATest__OptionsAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__QATest__OptionsAssignment_2_in_rule__QATest__Group__2__Impl401);
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


    // $ANTLR start "rule__QAContainerOptions__Group__0"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:245:1: rule__QAContainerOptions__Group__0 : rule__QAContainerOptions__Group__0__Impl rule__QAContainerOptions__Group__1 ;
    public final void rule__QAContainerOptions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:249:1: ( rule__QAContainerOptions__Group__0__Impl rule__QAContainerOptions__Group__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:250:2: rule__QAContainerOptions__Group__0__Impl rule__QAContainerOptions__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group__0__Impl_in_rule__QAContainerOptions__Group__0438);
            rule__QAContainerOptions__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group__1_in_rule__QAContainerOptions__Group__0441);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:257:1: rule__QAContainerOptions__Group__0__Impl : ( 'try' ) ;
    public final void rule__QAContainerOptions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:261:1: ( ( 'try' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:262:1: ( 'try' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:262:1: ( 'try' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:263:1: 'try'
            {
             before(grammarAccess.getQAContainerOptionsAccess().getTryKeyword_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__QAContainerOptions__Group__0__Impl469); 
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:276:1: rule__QAContainerOptions__Group__1 : rule__QAContainerOptions__Group__1__Impl rule__QAContainerOptions__Group__2 ;
    public final void rule__QAContainerOptions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:280:1: ( rule__QAContainerOptions__Group__1__Impl rule__QAContainerOptions__Group__2 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:281:2: rule__QAContainerOptions__Group__1__Impl rule__QAContainerOptions__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group__1__Impl_in_rule__QAContainerOptions__Group__1500);
            rule__QAContainerOptions__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group__2_in_rule__QAContainerOptions__Group__1503);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:288:1: rule__QAContainerOptions__Group__1__Impl : ( ( rule__QAContainerOptions__MaxTriesAssignment_1 ) ) ;
    public final void rule__QAContainerOptions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:292:1: ( ( ( rule__QAContainerOptions__MaxTriesAssignment_1 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:293:1: ( ( rule__QAContainerOptions__MaxTriesAssignment_1 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:293:1: ( ( rule__QAContainerOptions__MaxTriesAssignment_1 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:294:1: ( rule__QAContainerOptions__MaxTriesAssignment_1 )
            {
             before(grammarAccess.getQAContainerOptionsAccess().getMaxTriesAssignment_1()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:295:1: ( rule__QAContainerOptions__MaxTriesAssignment_1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:295:2: rule__QAContainerOptions__MaxTriesAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__MaxTriesAssignment_1_in_rule__QAContainerOptions__Group__1__Impl530);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:305:1: rule__QAContainerOptions__Group__2 : rule__QAContainerOptions__Group__2__Impl rule__QAContainerOptions__Group__3 ;
    public final void rule__QAContainerOptions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:309:1: ( rule__QAContainerOptions__Group__2__Impl rule__QAContainerOptions__Group__3 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:310:2: rule__QAContainerOptions__Group__2__Impl rule__QAContainerOptions__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group__2__Impl_in_rule__QAContainerOptions__Group__2560);
            rule__QAContainerOptions__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group__3_in_rule__QAContainerOptions__Group__2563);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:317:1: rule__QAContainerOptions__Group__2__Impl : ( 'times' ) ;
    public final void rule__QAContainerOptions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:321:1: ( ( 'times' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:322:1: ( 'times' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:322:1: ( 'times' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:323:1: 'times'
            {
             before(grammarAccess.getQAContainerOptionsAccess().getTimesKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__QAContainerOptions__Group__2__Impl591); 
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:336:1: rule__QAContainerOptions__Group__3 : rule__QAContainerOptions__Group__3__Impl ;
    public final void rule__QAContainerOptions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:340:1: ( rule__QAContainerOptions__Group__3__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:341:2: rule__QAContainerOptions__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group__3__Impl_in_rule__QAContainerOptions__Group__3622);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:347:1: rule__QAContainerOptions__Group__3__Impl : ( ( rule__QAContainerOptions__Group_3__0 )? ) ;
    public final void rule__QAContainerOptions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:351:1: ( ( ( rule__QAContainerOptions__Group_3__0 )? ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:352:1: ( ( rule__QAContainerOptions__Group_3__0 )? )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:352:1: ( ( rule__QAContainerOptions__Group_3__0 )? )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:353:1: ( rule__QAContainerOptions__Group_3__0 )?
            {
             before(grammarAccess.getQAContainerOptionsAccess().getGroup_3()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:354:1: ( rule__QAContainerOptions__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:354:2: rule__QAContainerOptions__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group_3__0_in_rule__QAContainerOptions__Group__3__Impl649);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:372:1: rule__QAContainerOptions__Group_3__0 : rule__QAContainerOptions__Group_3__0__Impl rule__QAContainerOptions__Group_3__1 ;
    public final void rule__QAContainerOptions__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:376:1: ( rule__QAContainerOptions__Group_3__0__Impl rule__QAContainerOptions__Group_3__1 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:377:2: rule__QAContainerOptions__Group_3__0__Impl rule__QAContainerOptions__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group_3__0__Impl_in_rule__QAContainerOptions__Group_3__0688);
            rule__QAContainerOptions__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group_3__1_in_rule__QAContainerOptions__Group_3__0691);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:384:1: rule__QAContainerOptions__Group_3__0__Impl : ( ( rule__QAContainerOptions__RevealAnswerAssignment_3_0 ) ) ;
    public final void rule__QAContainerOptions__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:388:1: ( ( ( rule__QAContainerOptions__RevealAnswerAssignment_3_0 ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:389:1: ( ( rule__QAContainerOptions__RevealAnswerAssignment_3_0 ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:389:1: ( ( rule__QAContainerOptions__RevealAnswerAssignment_3_0 ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:390:1: ( rule__QAContainerOptions__RevealAnswerAssignment_3_0 )
            {
             before(grammarAccess.getQAContainerOptionsAccess().getRevealAnswerAssignment_3_0()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:391:1: ( rule__QAContainerOptions__RevealAnswerAssignment_3_0 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:391:2: rule__QAContainerOptions__RevealAnswerAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__RevealAnswerAssignment_3_0_in_rule__QAContainerOptions__Group_3__0__Impl718);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:401:1: rule__QAContainerOptions__Group_3__1 : rule__QAContainerOptions__Group_3__1__Impl rule__QAContainerOptions__Group_3__2 ;
    public final void rule__QAContainerOptions__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:405:1: ( rule__QAContainerOptions__Group_3__1__Impl rule__QAContainerOptions__Group_3__2 )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:406:2: rule__QAContainerOptions__Group_3__1__Impl rule__QAContainerOptions__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group_3__1__Impl_in_rule__QAContainerOptions__Group_3__1748);
            rule__QAContainerOptions__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group_3__2_in_rule__QAContainerOptions__Group_3__1751);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:413:1: rule__QAContainerOptions__Group_3__1__Impl : ( 'correct' ) ;
    public final void rule__QAContainerOptions__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:417:1: ( ( 'correct' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:418:1: ( 'correct' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:418:1: ( 'correct' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:419:1: 'correct'
            {
             before(grammarAccess.getQAContainerOptionsAccess().getCorrectKeyword_3_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__QAContainerOptions__Group_3__1__Impl779); 
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:432:1: rule__QAContainerOptions__Group_3__2 : rule__QAContainerOptions__Group_3__2__Impl ;
    public final void rule__QAContainerOptions__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:436:1: ( rule__QAContainerOptions__Group_3__2__Impl )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:437:2: rule__QAContainerOptions__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QAContainerOptions__Group_3__2__Impl_in_rule__QAContainerOptions__Group_3__2810);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:443:1: rule__QAContainerOptions__Group_3__2__Impl : ( 'answer' ) ;
    public final void rule__QAContainerOptions__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:447:1: ( ( 'answer' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:448:1: ( 'answer' )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:448:1: ( 'answer' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:449:1: 'answer'
            {
             before(grammarAccess.getQAContainerOptionsAccess().getAnswerKeyword_3_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__QAContainerOptions__Group_3__2__Impl838); 
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


    // $ANTLR start "rule__QATest__TitleAssignment_1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:473:1: rule__QATest__TitleAssignment_1 : ( ruleEString ) ;
    public final void rule__QATest__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:477:1: ( ( ruleEString ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:478:1: ( ruleEString )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:478:1: ( ruleEString )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:479:1: ruleEString
            {
             before(grammarAccess.getQATestAccess().getTitleEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__QATest__TitleAssignment_1884);
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:488:1: rule__QATest__OptionsAssignment_2 : ( ruleQAContainerOptions ) ;
    public final void rule__QATest__OptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:492:1: ( ( ruleQAContainerOptions ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:493:1: ( ruleQAContainerOptions )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:493:1: ( ruleQAContainerOptions )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:494:1: ruleQAContainerOptions
            {
             before(grammarAccess.getQATestAccess().getOptionsQAContainerOptionsParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQAContainerOptions_in_rule__QATest__OptionsAssignment_2915);
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


    // $ANTLR start "rule__QAContainerOptions__MaxTriesAssignment_1"
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:503:1: rule__QAContainerOptions__MaxTriesAssignment_1 : ( RULE_INT ) ;
    public final void rule__QAContainerOptions__MaxTriesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:507:1: ( ( RULE_INT ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:508:1: ( RULE_INT )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:508:1: ( RULE_INT )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:509:1: RULE_INT
            {
             before(grammarAccess.getQAContainerOptionsAccess().getMaxTriesINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__QAContainerOptions__MaxTriesAssignment_1946); 
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
    // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:518:1: rule__QAContainerOptions__RevealAnswerAssignment_3_0 : ( ( 'reveal' ) ) ;
    public final void rule__QAContainerOptions__RevealAnswerAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:522:1: ( ( ( 'reveal' ) ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:523:1: ( ( 'reveal' ) )
            {
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:523:1: ( ( 'reveal' ) )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:524:1: ( 'reveal' )
            {
             before(grammarAccess.getQAContainerOptionsAccess().getRevealAnswerRevealKeyword_3_0_0()); 
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:525:1: ( 'reveal' )
            // ../qa.xtext.ui/src-gen/qa/xtext/ui/contentassist/antlr/internal/InternalQa.g:526:1: 'reveal'
            {
             before(grammarAccess.getQAContainerOptionsAccess().getRevealAnswerRevealKeyword_3_0_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__QAContainerOptions__RevealAnswerAssignment_3_0982); 
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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleQATest_in_entryRuleQATest61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQATest68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QATest__Group__0_in_ruleQATest94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQAContainerOptions_in_entryRuleQAContainerOptions121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQAContainerOptions128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__0_in_ruleQAContainerOptions154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QATest__Group__0__Impl_in_rule__QATest__Group__0252 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QATest__Group__1_in_rule__QATest__Group__0255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__QATest__Group__0__Impl283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QATest__Group__1__Impl_in_rule__QATest__Group__1314 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__QATest__Group__2_in_rule__QATest__Group__1317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QATest__TitleAssignment_1_in_rule__QATest__Group__1__Impl344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QATest__Group__2__Impl_in_rule__QATest__Group__2374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QATest__OptionsAssignment_2_in_rule__QATest__Group__2__Impl401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__0__Impl_in_rule__QAContainerOptions__Group__0438 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__1_in_rule__QAContainerOptions__Group__0441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__QAContainerOptions__Group__0__Impl469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__1__Impl_in_rule__QAContainerOptions__Group__1500 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__2_in_rule__QAContainerOptions__Group__1503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__MaxTriesAssignment_1_in_rule__QAContainerOptions__Group__1__Impl530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__2__Impl_in_rule__QAContainerOptions__Group__2560 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__3_in_rule__QAContainerOptions__Group__2563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__QAContainerOptions__Group__2__Impl591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group__3__Impl_in_rule__QAContainerOptions__Group__3622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group_3__0_in_rule__QAContainerOptions__Group__3__Impl649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group_3__0__Impl_in_rule__QAContainerOptions__Group_3__0688 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group_3__1_in_rule__QAContainerOptions__Group_3__0691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__RevealAnswerAssignment_3_0_in_rule__QAContainerOptions__Group_3__0__Impl718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group_3__1__Impl_in_rule__QAContainerOptions__Group_3__1748 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group_3__2_in_rule__QAContainerOptions__Group_3__1751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__QAContainerOptions__Group_3__1__Impl779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QAContainerOptions__Group_3__2__Impl_in_rule__QAContainerOptions__Group_3__2810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__QAContainerOptions__Group_3__2__Impl838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__QATest__TitleAssignment_1884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQAContainerOptions_in_rule__QATest__OptionsAssignment_2915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__QAContainerOptions__MaxTriesAssignment_1946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__QAContainerOptions__RevealAnswerAssignment_3_0982 = new BitSet(new long[]{0x0000000000000002L});
    }


}