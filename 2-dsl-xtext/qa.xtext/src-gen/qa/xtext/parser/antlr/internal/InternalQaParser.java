package qa.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import qa.xtext.services.QaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Title: '", "'try'", "'times'", "'reveal'", "'correct'", "'answer'", "'?'", "'!'", "'Candidates: '", "', '", "'Section '", "'{'", "'}'", "'='", "'+-'", "'#'", "'yes'", "'no'", "'-'", "'.'", "'E'", "'e'"
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
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
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
    public String getGrammarFileName() { return "../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g"; }



     	private QaGrammarAccess grammarAccess;
     	
        public InternalQaParser(TokenStream input, QaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "QATest";	
       	}
       	
       	@Override
       	protected QaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleQATest"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:67:1: entryRuleQATest returns [EObject current=null] : iv_ruleQATest= ruleQATest EOF ;
    public final EObject entryRuleQATest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQATest = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:68:2: (iv_ruleQATest= ruleQATest EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:69:2: iv_ruleQATest= ruleQATest EOF
            {
             newCompositeNode(grammarAccess.getQATestRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQATest_in_entryRuleQATest75);
            iv_ruleQATest=ruleQATest();

            state._fsp--;

             current =iv_ruleQATest; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQATest85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQATest"


    // $ANTLR start "ruleQATest"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:76:1: ruleQATest returns [EObject current=null] : (otherlv_0= 'Title: ' ( (lv_title_1_0= ruleEString ) ) ( (lv_options_2_0= ruleQAContainerOptions ) )? ( (lv_parts_3_0= ruleQAPart ) )* ) ;
    public final EObject ruleQATest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;

        EObject lv_options_2_0 = null;

        EObject lv_parts_3_0 = null;


         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:79:28: ( (otherlv_0= 'Title: ' ( (lv_title_1_0= ruleEString ) ) ( (lv_options_2_0= ruleQAContainerOptions ) )? ( (lv_parts_3_0= ruleQAPart ) )* ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:80:1: (otherlv_0= 'Title: ' ( (lv_title_1_0= ruleEString ) ) ( (lv_options_2_0= ruleQAContainerOptions ) )? ( (lv_parts_3_0= ruleQAPart ) )* )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:80:1: (otherlv_0= 'Title: ' ( (lv_title_1_0= ruleEString ) ) ( (lv_options_2_0= ruleQAContainerOptions ) )? ( (lv_parts_3_0= ruleQAPart ) )* )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:80:3: otherlv_0= 'Title: ' ( (lv_title_1_0= ruleEString ) ) ( (lv_options_2_0= ruleQAContainerOptions ) )? ( (lv_parts_3_0= ruleQAPart ) )*
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleQATest122); 

                	newLeafNode(otherlv_0, grammarAccess.getQATestAccess().getTitleKeyword_0());
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:84:1: ( (lv_title_1_0= ruleEString ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:85:1: (lv_title_1_0= ruleEString )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:85:1: (lv_title_1_0= ruleEString )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:86:3: lv_title_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getQATestAccess().getTitleEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQATest143);
            lv_title_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQATestRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:102:2: ( (lv_options_2_0= ruleQAContainerOptions ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:103:1: (lv_options_2_0= ruleQAContainerOptions )
                    {
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:103:1: (lv_options_2_0= ruleQAContainerOptions )
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:104:3: lv_options_2_0= ruleQAContainerOptions
                    {
                     
                    	        newCompositeNode(grammarAccess.getQATestAccess().getOptionsQAContainerOptionsParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQAContainerOptions_in_ruleQATest164);
                    lv_options_2_0=ruleQAContainerOptions();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQATestRule());
                    	        }
                           		set(
                           			current, 
                           			"options",
                            		lv_options_2_0, 
                            		"QAContainerOptions");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:120:3: ( (lv_parts_3_0= ruleQAPart ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_STRING||LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:121:1: (lv_parts_3_0= ruleQAPart )
            	    {
            	    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:121:1: (lv_parts_3_0= ruleQAPart )
            	    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:122:3: lv_parts_3_0= ruleQAPart
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQATestAccess().getPartsQAPartParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQAPart_in_ruleQATest186);
            	    lv_parts_3_0=ruleQAPart();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQATestRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parts",
            	            		lv_parts_3_0, 
            	            		"QAPart");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQATest"


    // $ANTLR start "entryRuleQAContainerOptions"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:146:1: entryRuleQAContainerOptions returns [EObject current=null] : iv_ruleQAContainerOptions= ruleQAContainerOptions EOF ;
    public final EObject entryRuleQAContainerOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQAContainerOptions = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:147:2: (iv_ruleQAContainerOptions= ruleQAContainerOptions EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:148:2: iv_ruleQAContainerOptions= ruleQAContainerOptions EOF
            {
             newCompositeNode(grammarAccess.getQAContainerOptionsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQAContainerOptions_in_entryRuleQAContainerOptions223);
            iv_ruleQAContainerOptions=ruleQAContainerOptions();

            state._fsp--;

             current =iv_ruleQAContainerOptions; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQAContainerOptions233); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQAContainerOptions"


    // $ANTLR start "ruleQAContainerOptions"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:155:1: ruleQAContainerOptions returns [EObject current=null] : (otherlv_0= 'try' ( (lv_maxTries_1_0= RULE_INT ) ) otherlv_2= 'times' ( ( (lv_revealAnswer_3_0= 'reveal' ) ) otherlv_4= 'correct' otherlv_5= 'answer' )? ) ;
    public final EObject ruleQAContainerOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_maxTries_1_0=null;
        Token otherlv_2=null;
        Token lv_revealAnswer_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:158:28: ( (otherlv_0= 'try' ( (lv_maxTries_1_0= RULE_INT ) ) otherlv_2= 'times' ( ( (lv_revealAnswer_3_0= 'reveal' ) ) otherlv_4= 'correct' otherlv_5= 'answer' )? ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:159:1: (otherlv_0= 'try' ( (lv_maxTries_1_0= RULE_INT ) ) otherlv_2= 'times' ( ( (lv_revealAnswer_3_0= 'reveal' ) ) otherlv_4= 'correct' otherlv_5= 'answer' )? )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:159:1: (otherlv_0= 'try' ( (lv_maxTries_1_0= RULE_INT ) ) otherlv_2= 'times' ( ( (lv_revealAnswer_3_0= 'reveal' ) ) otherlv_4= 'correct' otherlv_5= 'answer' )? )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:159:3: otherlv_0= 'try' ( (lv_maxTries_1_0= RULE_INT ) ) otherlv_2= 'times' ( ( (lv_revealAnswer_3_0= 'reveal' ) ) otherlv_4= 'correct' otherlv_5= 'answer' )?
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleQAContainerOptions270); 

                	newLeafNode(otherlv_0, grammarAccess.getQAContainerOptionsAccess().getTryKeyword_0());
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:163:1: ( (lv_maxTries_1_0= RULE_INT ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:164:1: (lv_maxTries_1_0= RULE_INT )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:164:1: (lv_maxTries_1_0= RULE_INT )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:165:3: lv_maxTries_1_0= RULE_INT
            {
            lv_maxTries_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleQAContainerOptions287); 

            			newLeafNode(lv_maxTries_1_0, grammarAccess.getQAContainerOptionsAccess().getMaxTriesINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQAContainerOptionsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"maxTries",
                    		lv_maxTries_1_0, 
                    		"INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleQAContainerOptions304); 

                	newLeafNode(otherlv_2, grammarAccess.getQAContainerOptionsAccess().getTimesKeyword_2());
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:185:1: ( ( (lv_revealAnswer_3_0= 'reveal' ) ) otherlv_4= 'correct' otherlv_5= 'answer' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:185:2: ( (lv_revealAnswer_3_0= 'reveal' ) ) otherlv_4= 'correct' otherlv_5= 'answer'
                    {
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:185:2: ( (lv_revealAnswer_3_0= 'reveal' ) )
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:186:1: (lv_revealAnswer_3_0= 'reveal' )
                    {
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:186:1: (lv_revealAnswer_3_0= 'reveal' )
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:187:3: lv_revealAnswer_3_0= 'reveal'
                    {
                    lv_revealAnswer_3_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleQAContainerOptions323); 

                            newLeafNode(lv_revealAnswer_3_0, grammarAccess.getQAContainerOptionsAccess().getRevealAnswerRevealKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQAContainerOptionsRule());
                    	        }
                           		setWithLastConsumed(current, "revealAnswer", true, "reveal");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleQAContainerOptions348); 

                        	newLeafNode(otherlv_4, grammarAccess.getQAContainerOptionsAccess().getCorrectKeyword_3_1());
                        
                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleQAContainerOptions360); 

                        	newLeafNode(otherlv_5, grammarAccess.getQAContainerOptionsAccess().getAnswerKeyword_3_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQAContainerOptions"


    // $ANTLR start "entryRuleQAPart"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:216:1: entryRuleQAPart returns [EObject current=null] : iv_ruleQAPart= ruleQAPart EOF ;
    public final EObject entryRuleQAPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQAPart = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:217:2: (iv_ruleQAPart= ruleQAPart EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:218:2: iv_ruleQAPart= ruleQAPart EOF
            {
             newCompositeNode(grammarAccess.getQAPartRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQAPart_in_entryRuleQAPart398);
            iv_ruleQAPart=ruleQAPart();

            state._fsp--;

             current =iv_ruleQAPart; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQAPart408); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQAPart"


    // $ANTLR start "ruleQAPart"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:225:1: ruleQAPart returns [EObject current=null] : (this_Question_0= ruleQuestion | this_QASection_1= ruleQASection ) ;
    public final EObject ruleQAPart() throws RecognitionException {
        EObject current = null;

        EObject this_Question_0 = null;

        EObject this_QASection_1 = null;


         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:228:28: ( (this_Question_0= ruleQuestion | this_QASection_1= ruleQASection ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:229:1: (this_Question_0= ruleQuestion | this_QASection_1= ruleQASection )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:229:1: (this_Question_0= ruleQuestion | this_QASection_1= ruleQASection )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:230:5: this_Question_0= ruleQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQAPartAccess().getQuestionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleQAPart455);
                    this_Question_0=ruleQuestion();

                    state._fsp--;

                     
                            current = this_Question_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:240:5: this_QASection_1= ruleQASection
                    {
                     
                            newCompositeNode(grammarAccess.getQAPartAccess().getQASectionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQASection_in_ruleQAPart482);
                    this_QASection_1=ruleQASection();

                    state._fsp--;

                     
                            current = this_QASection_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQAPart"


    // $ANTLR start "entryRuleQuestion"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:256:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:257:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:258:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion517);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion527); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:265:1: ruleQuestion returns [EObject current=null] : ( ( (lv_text_0_0= ruleEString ) ) otherlv_1= '?' ( (lv_correct_2_0= ruleAnswer ) ) otherlv_3= '!' (otherlv_4= 'Candidates: ' ( (lv_candidates_5_0= ruleAnswer ) ) (otherlv_6= ', ' ( (lv_candidates_7_0= ruleAnswer ) ) )* )? ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_text_0_0 = null;

        EObject lv_correct_2_0 = null;

        EObject lv_candidates_5_0 = null;

        EObject lv_candidates_7_0 = null;


         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:268:28: ( ( ( (lv_text_0_0= ruleEString ) ) otherlv_1= '?' ( (lv_correct_2_0= ruleAnswer ) ) otherlv_3= '!' (otherlv_4= 'Candidates: ' ( (lv_candidates_5_0= ruleAnswer ) ) (otherlv_6= ', ' ( (lv_candidates_7_0= ruleAnswer ) ) )* )? ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:269:1: ( ( (lv_text_0_0= ruleEString ) ) otherlv_1= '?' ( (lv_correct_2_0= ruleAnswer ) ) otherlv_3= '!' (otherlv_4= 'Candidates: ' ( (lv_candidates_5_0= ruleAnswer ) ) (otherlv_6= ', ' ( (lv_candidates_7_0= ruleAnswer ) ) )* )? )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:269:1: ( ( (lv_text_0_0= ruleEString ) ) otherlv_1= '?' ( (lv_correct_2_0= ruleAnswer ) ) otherlv_3= '!' (otherlv_4= 'Candidates: ' ( (lv_candidates_5_0= ruleAnswer ) ) (otherlv_6= ', ' ( (lv_candidates_7_0= ruleAnswer ) ) )* )? )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:269:2: ( (lv_text_0_0= ruleEString ) ) otherlv_1= '?' ( (lv_correct_2_0= ruleAnswer ) ) otherlv_3= '!' (otherlv_4= 'Candidates: ' ( (lv_candidates_5_0= ruleAnswer ) ) (otherlv_6= ', ' ( (lv_candidates_7_0= ruleAnswer ) ) )* )?
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:269:2: ( (lv_text_0_0= ruleEString ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:270:1: (lv_text_0_0= ruleEString )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:270:1: (lv_text_0_0= ruleEString )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:271:3: lv_text_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getQuestionAccess().getTextEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQuestion573);
            lv_text_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleQuestion585); 

                	newLeafNode(otherlv_1, grammarAccess.getQuestionAccess().getQuestionMarkKeyword_1());
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:291:1: ( (lv_correct_2_0= ruleAnswer ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:292:1: (lv_correct_2_0= ruleAnswer )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:292:1: (lv_correct_2_0= ruleAnswer )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:293:3: lv_correct_2_0= ruleAnswer
            {
             
            	        newCompositeNode(grammarAccess.getQuestionAccess().getCorrectAnswerParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleQuestion606);
            lv_correct_2_0=ruleAnswer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"correct",
                    		lv_correct_2_0, 
                    		"Answer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleQuestion618); 

                	newLeafNode(otherlv_3, grammarAccess.getQuestionAccess().getExclamationMarkKeyword_3());
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:313:1: (otherlv_4= 'Candidates: ' ( (lv_candidates_5_0= ruleAnswer ) ) (otherlv_6= ', ' ( (lv_candidates_7_0= ruleAnswer ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:313:3: otherlv_4= 'Candidates: ' ( (lv_candidates_5_0= ruleAnswer ) ) (otherlv_6= ', ' ( (lv_candidates_7_0= ruleAnswer ) ) )*
                    {
                    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleQuestion631); 

                        	newLeafNode(otherlv_4, grammarAccess.getQuestionAccess().getCandidatesKeyword_4_0());
                        
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:317:1: ( (lv_candidates_5_0= ruleAnswer ) )
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:318:1: (lv_candidates_5_0= ruleAnswer )
                    {
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:318:1: (lv_candidates_5_0= ruleAnswer )
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:319:3: lv_candidates_5_0= ruleAnswer
                    {
                     
                    	        newCompositeNode(grammarAccess.getQuestionAccess().getCandidatesAnswerParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleQuestion652);
                    lv_candidates_5_0=ruleAnswer();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
                    	        }
                           		add(
                           			current, 
                           			"candidates",
                            		lv_candidates_5_0, 
                            		"Answer");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:335:2: (otherlv_6= ', ' ( (lv_candidates_7_0= ruleAnswer ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==20) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:335:4: otherlv_6= ', ' ( (lv_candidates_7_0= ruleAnswer ) )
                    	    {
                    	    otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleQuestion665); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getQuestionAccess().getCommaSpaceKeyword_4_2_0());
                    	        
                    	    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:339:1: ( (lv_candidates_7_0= ruleAnswer ) )
                    	    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:340:1: (lv_candidates_7_0= ruleAnswer )
                    	    {
                    	    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:340:1: (lv_candidates_7_0= ruleAnswer )
                    	    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:341:3: lv_candidates_7_0= ruleAnswer
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getQuestionAccess().getCandidatesAnswerParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleQuestion686);
                    	    lv_candidates_7_0=ruleAnswer();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"candidates",
                    	            		lv_candidates_7_0, 
                    	            		"Answer");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleQASection"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:365:1: entryRuleQASection returns [EObject current=null] : iv_ruleQASection= ruleQASection EOF ;
    public final EObject entryRuleQASection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQASection = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:366:2: (iv_ruleQASection= ruleQASection EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:367:2: iv_ruleQASection= ruleQASection EOF
            {
             newCompositeNode(grammarAccess.getQASectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQASection_in_entryRuleQASection726);
            iv_ruleQASection=ruleQASection();

            state._fsp--;

             current =iv_ruleQASection; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQASection736); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQASection"


    // $ANTLR start "ruleQASection"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:374:1: ruleQASection returns [EObject current=null] : (otherlv_0= 'Section ' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_options_3_0= ruleQAContainerOptions ) )? ( (lv_questions_4_0= ruleQuestion ) )* otherlv_5= '}' ) ;
    public final EObject ruleQASection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_options_3_0 = null;

        EObject lv_questions_4_0 = null;


         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:377:28: ( (otherlv_0= 'Section ' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_options_3_0= ruleQAContainerOptions ) )? ( (lv_questions_4_0= ruleQuestion ) )* otherlv_5= '}' ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:378:1: (otherlv_0= 'Section ' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_options_3_0= ruleQAContainerOptions ) )? ( (lv_questions_4_0= ruleQuestion ) )* otherlv_5= '}' )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:378:1: (otherlv_0= 'Section ' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_options_3_0= ruleQAContainerOptions ) )? ( (lv_questions_4_0= ruleQuestion ) )* otherlv_5= '}' )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:378:3: otherlv_0= 'Section ' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_options_3_0= ruleQAContainerOptions ) )? ( (lv_questions_4_0= ruleQuestion ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleQASection773); 

                	newLeafNode(otherlv_0, grammarAccess.getQASectionAccess().getSectionKeyword_0());
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:382:1: ( (lv_name_1_0= ruleEString ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:383:1: (lv_name_1_0= ruleEString )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:383:1: (lv_name_1_0= ruleEString )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:384:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getQASectionAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQASection794);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQASectionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleQASection806); 

                	newLeafNode(otherlv_2, grammarAccess.getQASectionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:404:1: ( (lv_options_3_0= ruleQAContainerOptions ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:405:1: (lv_options_3_0= ruleQAContainerOptions )
                    {
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:405:1: (lv_options_3_0= ruleQAContainerOptions )
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:406:3: lv_options_3_0= ruleQAContainerOptions
                    {
                     
                    	        newCompositeNode(grammarAccess.getQASectionAccess().getOptionsQAContainerOptionsParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQAContainerOptions_in_ruleQASection827);
                    lv_options_3_0=ruleQAContainerOptions();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQASectionRule());
                    	        }
                           		set(
                           			current, 
                           			"options",
                            		lv_options_3_0, 
                            		"QAContainerOptions");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:422:3: ( (lv_questions_4_0= ruleQuestion ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:423:1: (lv_questions_4_0= ruleQuestion )
            	    {
            	    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:423:1: (lv_questions_4_0= ruleQuestion )
            	    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:424:3: lv_questions_4_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQASectionAccess().getQuestionsQuestionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleQASection849);
            	    lv_questions_4_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQASectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_4_0, 
            	            		"Question");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleQASection862); 

                	newLeafNode(otherlv_5, grammarAccess.getQASectionAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQASection"


    // $ANTLR start "entryRuleAnswer"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:452:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:453:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:454:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer898);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer908); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnswer"


    // $ANTLR start "ruleAnswer"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:461:1: ruleAnswer returns [EObject current=null] : (this_OptionAnswer_0= ruleOptionAnswer | this_NumberAnswer_1= ruleNumberAnswer | this_TextAnswer_2= ruleTextAnswer | this_YesNoAnswer_3= ruleYesNoAnswer ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        EObject this_OptionAnswer_0 = null;

        EObject this_NumberAnswer_1 = null;

        EObject this_TextAnswer_2 = null;

        EObject this_YesNoAnswer_3 = null;


         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:464:28: ( (this_OptionAnswer_0= ruleOptionAnswer | this_NumberAnswer_1= ruleNumberAnswer | this_TextAnswer_2= ruleTextAnswer | this_YesNoAnswer_3= ruleYesNoAnswer ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:465:1: (this_OptionAnswer_0= ruleOptionAnswer | this_NumberAnswer_1= ruleNumberAnswer | this_TextAnswer_2= ruleTextAnswer | this_YesNoAnswer_3= ruleYesNoAnswer )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:465:1: (this_OptionAnswer_0= ruleOptionAnswer | this_NumberAnswer_1= ruleNumberAnswer | this_TextAnswer_2= ruleTextAnswer | this_YesNoAnswer_3= ruleYesNoAnswer )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt9=1;
                }
                break;
            case RULE_INT:
            case 24:
            case 29:
                {
                alt9=2;
                }
                break;
            case RULE_STRING:
                {
                alt9=3;
                }
                break;
            case 27:
            case 28:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:466:5: this_OptionAnswer_0= ruleOptionAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getAnswerAccess().getOptionAnswerParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOptionAnswer_in_ruleAnswer955);
                    this_OptionAnswer_0=ruleOptionAnswer();

                    state._fsp--;

                     
                            current = this_OptionAnswer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:476:5: this_NumberAnswer_1= ruleNumberAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getAnswerAccess().getNumberAnswerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumberAnswer_in_ruleAnswer982);
                    this_NumberAnswer_1=ruleNumberAnswer();

                    state._fsp--;

                     
                            current = this_NumberAnswer_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:486:5: this_TextAnswer_2= ruleTextAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getAnswerAccess().getTextAnswerParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTextAnswer_in_ruleAnswer1009);
                    this_TextAnswer_2=ruleTextAnswer();

                    state._fsp--;

                     
                            current = this_TextAnswer_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:496:5: this_YesNoAnswer_3= ruleYesNoAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getAnswerAccess().getYesNoAnswerParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleYesNoAnswer_in_ruleAnswer1036);
                    this_YesNoAnswer_3=ruleYesNoAnswer();

                    state._fsp--;

                     
                            current = this_YesNoAnswer_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "entryRuleExpressionAnswer"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:512:1: entryRuleExpressionAnswer returns [EObject current=null] : iv_ruleExpressionAnswer= ruleExpressionAnswer EOF ;
    public final EObject entryRuleExpressionAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionAnswer = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:513:2: (iv_ruleExpressionAnswer= ruleExpressionAnswer EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:514:2: iv_ruleExpressionAnswer= ruleExpressionAnswer EOF
            {
             newCompositeNode(grammarAccess.getExpressionAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionAnswer_in_entryRuleExpressionAnswer1071);
            iv_ruleExpressionAnswer=ruleExpressionAnswer();

            state._fsp--;

             current =iv_ruleExpressionAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpressionAnswer1081); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionAnswer"


    // $ANTLR start "ruleExpressionAnswer"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:521:1: ruleExpressionAnswer returns [EObject current=null] : (otherlv_0= '=' ( (lv_expression_1_0= ruleEString ) ) (otherlv_2= '+-' ( (lv_epsilon_3_0= ruleEDouble ) ) )? ) ;
    public final EObject ruleExpressionAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_expression_1_0 = null;

        AntlrDatatypeRuleToken lv_epsilon_3_0 = null;


         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:524:28: ( (otherlv_0= '=' ( (lv_expression_1_0= ruleEString ) ) (otherlv_2= '+-' ( (lv_epsilon_3_0= ruleEDouble ) ) )? ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:525:1: (otherlv_0= '=' ( (lv_expression_1_0= ruleEString ) ) (otherlv_2= '+-' ( (lv_epsilon_3_0= ruleEDouble ) ) )? )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:525:1: (otherlv_0= '=' ( (lv_expression_1_0= ruleEString ) ) (otherlv_2= '+-' ( (lv_epsilon_3_0= ruleEDouble ) ) )? )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:525:3: otherlv_0= '=' ( (lv_expression_1_0= ruleEString ) ) (otherlv_2= '+-' ( (lv_epsilon_3_0= ruleEDouble ) ) )?
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleExpressionAnswer1118); 

                	newLeafNode(otherlv_0, grammarAccess.getExpressionAnswerAccess().getEqualsSignKeyword_0());
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:529:1: ( (lv_expression_1_0= ruleEString ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:530:1: (lv_expression_1_0= ruleEString )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:530:1: (lv_expression_1_0= ruleEString )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:531:3: lv_expression_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getExpressionAnswerAccess().getExpressionEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExpressionAnswer1139);
            lv_expression_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:547:2: (otherlv_2= '+-' ( (lv_epsilon_3_0= ruleEDouble ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:547:4: otherlv_2= '+-' ( (lv_epsilon_3_0= ruleEDouble ) )
                    {
                    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleExpressionAnswer1152); 

                        	newLeafNode(otherlv_2, grammarAccess.getExpressionAnswerAccess().getPlusSignHyphenMinusKeyword_2_0());
                        
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:551:1: ( (lv_epsilon_3_0= ruleEDouble ) )
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:552:1: (lv_epsilon_3_0= ruleEDouble )
                    {
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:552:1: (lv_epsilon_3_0= ruleEDouble )
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:553:3: lv_epsilon_3_0= ruleEDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAnswerAccess().getEpsilonEDoubleParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleExpressionAnswer1173);
                    lv_epsilon_3_0=ruleEDouble();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpressionAnswerRule());
                    	        }
                           		set(
                           			current, 
                           			"epsilon",
                            		lv_epsilon_3_0, 
                            		"EDouble");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionAnswer"


    // $ANTLR start "entryRuleOptionAnswer"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:577:1: entryRuleOptionAnswer returns [EObject current=null] : iv_ruleOptionAnswer= ruleOptionAnswer EOF ;
    public final EObject entryRuleOptionAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionAnswer = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:578:2: (iv_ruleOptionAnswer= ruleOptionAnswer EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:579:2: iv_ruleOptionAnswer= ruleOptionAnswer EOF
            {
             newCompositeNode(grammarAccess.getOptionAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOptionAnswer_in_entryRuleOptionAnswer1211);
            iv_ruleOptionAnswer=ruleOptionAnswer();

            state._fsp--;

             current =iv_ruleOptionAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOptionAnswer1221); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionAnswer"


    // $ANTLR start "ruleOptionAnswer"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:586:1: ruleOptionAnswer returns [EObject current=null] : (otherlv_0= '#' ( (lv_optionNumber_1_0= ruleEInt ) ) ) ;
    public final EObject ruleOptionAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_optionNumber_1_0 = null;


         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:589:28: ( (otherlv_0= '#' ( (lv_optionNumber_1_0= ruleEInt ) ) ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:590:1: (otherlv_0= '#' ( (lv_optionNumber_1_0= ruleEInt ) ) )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:590:1: (otherlv_0= '#' ( (lv_optionNumber_1_0= ruleEInt ) ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:590:3: otherlv_0= '#' ( (lv_optionNumber_1_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleOptionAnswer1258); 

                	newLeafNode(otherlv_0, grammarAccess.getOptionAnswerAccess().getNumberSignKeyword_0());
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:594:1: ( (lv_optionNumber_1_0= ruleEInt ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:595:1: (lv_optionNumber_1_0= ruleEInt )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:595:1: (lv_optionNumber_1_0= ruleEInt )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:596:3: lv_optionNumber_1_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getOptionAnswerAccess().getOptionNumberEIntParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleOptionAnswer1279);
            lv_optionNumber_1_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"optionNumber",
                    		lv_optionNumber_1_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionAnswer"


    // $ANTLR start "entryRuleNumberAnswer"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:620:1: entryRuleNumberAnswer returns [EObject current=null] : iv_ruleNumberAnswer= ruleNumberAnswer EOF ;
    public final EObject entryRuleNumberAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberAnswer = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:621:2: (iv_ruleNumberAnswer= ruleNumberAnswer EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:622:2: iv_ruleNumberAnswer= ruleNumberAnswer EOF
            {
             newCompositeNode(grammarAccess.getNumberAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumberAnswer_in_entryRuleNumberAnswer1315);
            iv_ruleNumberAnswer=ruleNumberAnswer();

            state._fsp--;

             current =iv_ruleNumberAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumberAnswer1325); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberAnswer"


    // $ANTLR start "ruleNumberAnswer"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:629:1: ruleNumberAnswer returns [EObject current=null] : ( ( ( (lv_number_0_0= ruleEDouble ) ) (otherlv_1= '+-' ( (lv_epsilon_2_0= ruleEDouble ) ) )? ) | this_ExpressionAnswer_3= ruleExpressionAnswer ) ;
    public final EObject ruleNumberAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_number_0_0 = null;

        AntlrDatatypeRuleToken lv_epsilon_2_0 = null;

        EObject this_ExpressionAnswer_3 = null;


         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:632:28: ( ( ( ( (lv_number_0_0= ruleEDouble ) ) (otherlv_1= '+-' ( (lv_epsilon_2_0= ruleEDouble ) ) )? ) | this_ExpressionAnswer_3= ruleExpressionAnswer ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:633:1: ( ( ( (lv_number_0_0= ruleEDouble ) ) (otherlv_1= '+-' ( (lv_epsilon_2_0= ruleEDouble ) ) )? ) | this_ExpressionAnswer_3= ruleExpressionAnswer )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:633:1: ( ( ( (lv_number_0_0= ruleEDouble ) ) (otherlv_1= '+-' ( (lv_epsilon_2_0= ruleEDouble ) ) )? ) | this_ExpressionAnswer_3= ruleExpressionAnswer )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT||LA12_0==29) ) {
                alt12=1;
            }
            else if ( (LA12_0==24) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:633:2: ( ( (lv_number_0_0= ruleEDouble ) ) (otherlv_1= '+-' ( (lv_epsilon_2_0= ruleEDouble ) ) )? )
                    {
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:633:2: ( ( (lv_number_0_0= ruleEDouble ) ) (otherlv_1= '+-' ( (lv_epsilon_2_0= ruleEDouble ) ) )? )
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:633:3: ( (lv_number_0_0= ruleEDouble ) ) (otherlv_1= '+-' ( (lv_epsilon_2_0= ruleEDouble ) ) )?
                    {
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:633:3: ( (lv_number_0_0= ruleEDouble ) )
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:634:1: (lv_number_0_0= ruleEDouble )
                    {
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:634:1: (lv_number_0_0= ruleEDouble )
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:635:3: lv_number_0_0= ruleEDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumberAnswerAccess().getNumberEDoubleParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleNumberAnswer1372);
                    lv_number_0_0=ruleEDouble();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNumberAnswerRule());
                    	        }
                           		set(
                           			current, 
                           			"number",
                            		lv_number_0_0, 
                            		"EDouble");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:651:2: (otherlv_1= '+-' ( (lv_epsilon_2_0= ruleEDouble ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==25) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:651:4: otherlv_1= '+-' ( (lv_epsilon_2_0= ruleEDouble ) )
                            {
                            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleNumberAnswer1385); 

                                	newLeafNode(otherlv_1, grammarAccess.getNumberAnswerAccess().getPlusSignHyphenMinusKeyword_0_1_0());
                                
                            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:655:1: ( (lv_epsilon_2_0= ruleEDouble ) )
                            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:656:1: (lv_epsilon_2_0= ruleEDouble )
                            {
                            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:656:1: (lv_epsilon_2_0= ruleEDouble )
                            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:657:3: lv_epsilon_2_0= ruleEDouble
                            {
                             
                            	        newCompositeNode(grammarAccess.getNumberAnswerAccess().getEpsilonEDoubleParserRuleCall_0_1_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleNumberAnswer1406);
                            lv_epsilon_2_0=ruleEDouble();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getNumberAnswerRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"epsilon",
                                    		lv_epsilon_2_0, 
                                    		"EDouble");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:675:5: this_ExpressionAnswer_3= ruleExpressionAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getNumberAnswerAccess().getExpressionAnswerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpressionAnswer_in_ruleNumberAnswer1437);
                    this_ExpressionAnswer_3=ruleExpressionAnswer();

                    state._fsp--;

                     
                            current = this_ExpressionAnswer_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberAnswer"


    // $ANTLR start "entryRuleTextAnswer"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:691:1: entryRuleTextAnswer returns [EObject current=null] : iv_ruleTextAnswer= ruleTextAnswer EOF ;
    public final EObject entryRuleTextAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextAnswer = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:692:2: (iv_ruleTextAnswer= ruleTextAnswer EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:693:2: iv_ruleTextAnswer= ruleTextAnswer EOF
            {
             newCompositeNode(grammarAccess.getTextAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTextAnswer_in_entryRuleTextAnswer1472);
            iv_ruleTextAnswer=ruleTextAnswer();

            state._fsp--;

             current =iv_ruleTextAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextAnswer1482); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextAnswer"


    // $ANTLR start "ruleTextAnswer"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:700:1: ruleTextAnswer returns [EObject current=null] : ( (lv_text_0_0= ruleEString ) ) ;
    public final EObject ruleTextAnswer() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_text_0_0 = null;


         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:703:28: ( ( (lv_text_0_0= ruleEString ) ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:704:1: ( (lv_text_0_0= ruleEString ) )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:704:1: ( (lv_text_0_0= ruleEString ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:705:1: (lv_text_0_0= ruleEString )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:705:1: (lv_text_0_0= ruleEString )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:706:3: lv_text_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTextAnswerAccess().getTextEStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTextAnswer1527);
            lv_text_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTextAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextAnswer"


    // $ANTLR start "entryRuleYesNoAnswer"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:730:1: entryRuleYesNoAnswer returns [EObject current=null] : iv_ruleYesNoAnswer= ruleYesNoAnswer EOF ;
    public final EObject entryRuleYesNoAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYesNoAnswer = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:731:2: (iv_ruleYesNoAnswer= ruleYesNoAnswer EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:732:2: iv_ruleYesNoAnswer= ruleYesNoAnswer EOF
            {
             newCompositeNode(grammarAccess.getYesNoAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleYesNoAnswer_in_entryRuleYesNoAnswer1562);
            iv_ruleYesNoAnswer=ruleYesNoAnswer();

            state._fsp--;

             current =iv_ruleYesNoAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleYesNoAnswer1572); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleYesNoAnswer"


    // $ANTLR start "ruleYesNoAnswer"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:739:1: ruleYesNoAnswer returns [EObject current=null] : ( () ( ( (lv_yes_1_0= 'yes' ) ) | otherlv_2= 'no' ) ) ;
    public final EObject ruleYesNoAnswer() throws RecognitionException {
        EObject current = null;

        Token lv_yes_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:742:28: ( ( () ( ( (lv_yes_1_0= 'yes' ) ) | otherlv_2= 'no' ) ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:743:1: ( () ( ( (lv_yes_1_0= 'yes' ) ) | otherlv_2= 'no' ) )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:743:1: ( () ( ( (lv_yes_1_0= 'yes' ) ) | otherlv_2= 'no' ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:743:2: () ( ( (lv_yes_1_0= 'yes' ) ) | otherlv_2= 'no' )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:743:2: ()
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:744:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getYesNoAnswerAccess().getYesNoAnswerAction_0(),
                        current);
                

            }

            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:749:2: ( ( (lv_yes_1_0= 'yes' ) ) | otherlv_2= 'no' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            else if ( (LA13_0==28) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:749:3: ( (lv_yes_1_0= 'yes' ) )
                    {
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:749:3: ( (lv_yes_1_0= 'yes' ) )
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:750:1: (lv_yes_1_0= 'yes' )
                    {
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:750:1: (lv_yes_1_0= 'yes' )
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:751:3: lv_yes_1_0= 'yes'
                    {
                    lv_yes_1_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleYesNoAnswer1625); 

                            newLeafNode(lv_yes_1_0, grammarAccess.getYesNoAnswerAccess().getYesYesKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getYesNoAnswerRule());
                    	        }
                           		setWithLastConsumed(current, "yes", true, "yes");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:765:7: otherlv_2= 'no'
                    {
                    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleYesNoAnswer1656); 

                        	newLeafNode(otherlv_2, grammarAccess.getYesNoAnswerAccess().getNoKeyword_1_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleYesNoAnswer"


    // $ANTLR start "entryRuleEString"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:777:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:778:2: (iv_ruleEString= ruleEString EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:779:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1694);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1705); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:786:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:789:28: (this_STRING_0= RULE_STRING )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:790:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1744); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDouble"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:805:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:806:2: (iv_ruleEDouble= ruleEDouble EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:807:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble1789);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble1800); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:814:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:817:28: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )? ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:818:1: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )? )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:818:1: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )? )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:818:2: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )?
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:818:2: (kw= '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:819:2: kw= '-'
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEDouble1839); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble1856); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:831:1: (kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:832:2: kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
                    {
                    kw=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleEDouble1875); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2_0()); 
                        
                    this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble1890); 

                    		current.merge(this_INT_3);
                        
                     
                        newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2_1()); 
                        
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:844:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=31 && LA17_0<=32)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:844:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                            {
                            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:844:2: (kw= 'E' | kw= 'e' )
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0==31) ) {
                                alt15=1;
                            }
                            else if ( (LA15_0==32) ) {
                                alt15=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 15, 0, input);

                                throw nvae;
                            }
                            switch (alt15) {
                                case 1 :
                                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:845:2: kw= 'E'
                                    {
                                    kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleEDouble1910); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_2_2_0_0()); 
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:852:2: kw= 'e'
                                    {
                                    kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEDouble1929); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_2_2_0_1()); 
                                        

                                    }
                                    break;

                            }

                            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:857:2: (kw= '-' )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==29) ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:858:2: kw= '-'
                                    {
                                    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEDouble1944); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_2_2_1()); 
                                        

                                    }
                                    break;

                            }

                            this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble1961); 

                            		current.merge(this_INT_7);
                                
                             
                                newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2_2_2()); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEInt"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:878:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:879:2: (iv_ruleEInt= ruleEInt EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:880:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2011);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2022); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:887:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:890:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:891:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:891:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:891:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:891:2: (kw= '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:892:2: kw= '-'
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEInt2061); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2078); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleQATest_in_entryRuleQATest75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQATest85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleQATest122 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQATest143 = new BitSet(new long[]{0x0000000000201022L});
        public static final BitSet FOLLOW_ruleQAContainerOptions_in_ruleQATest164 = new BitSet(new long[]{0x0000000000200022L});
        public static final BitSet FOLLOW_ruleQAPart_in_ruleQATest186 = new BitSet(new long[]{0x0000000000200022L});
        public static final BitSet FOLLOW_ruleQAContainerOptions_in_entryRuleQAContainerOptions223 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQAContainerOptions233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleQAContainerOptions270 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleQAContainerOptions287 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleQAContainerOptions304 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleQAContainerOptions323 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleQAContainerOptions348 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleQAContainerOptions360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQAPart_in_entryRuleQAPart398 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQAPart408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleQAPart455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQASection_in_ruleQAPart482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion517 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQuestion573 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleQuestion585 = new BitSet(new long[]{0x000000003D000030L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleQuestion606 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleQuestion618 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleQuestion631 = new BitSet(new long[]{0x000000003D000030L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleQuestion652 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleQuestion665 = new BitSet(new long[]{0x000000003D000030L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleQuestion686 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_ruleQASection_in_entryRuleQASection726 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQASection736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleQASection773 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQASection794 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleQASection806 = new BitSet(new long[]{0x0000000000801020L});
        public static final BitSet FOLLOW_ruleQAContainerOptions_in_ruleQASection827 = new BitSet(new long[]{0x0000000000800020L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleQASection849 = new BitSet(new long[]{0x0000000000800020L});
        public static final BitSet FOLLOW_23_in_ruleQASection862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer898 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptionAnswer_in_ruleAnswer955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberAnswer_in_ruleAnswer982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextAnswer_in_ruleAnswer1009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleYesNoAnswer_in_ruleAnswer1036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionAnswer_in_entryRuleExpressionAnswer1071 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpressionAnswer1081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleExpressionAnswer1118 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExpressionAnswer1139 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_25_in_ruleExpressionAnswer1152 = new BitSet(new long[]{0x0000000020000010L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleExpressionAnswer1173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptionAnswer_in_entryRuleOptionAnswer1211 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOptionAnswer1221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleOptionAnswer1258 = new BitSet(new long[]{0x0000000020000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleOptionAnswer1279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberAnswer_in_entryRuleNumberAnswer1315 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumberAnswer1325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleNumberAnswer1372 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_25_in_ruleNumberAnswer1385 = new BitSet(new long[]{0x0000000020000010L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleNumberAnswer1406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionAnswer_in_ruleNumberAnswer1437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextAnswer_in_entryRuleTextAnswer1472 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextAnswer1482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTextAnswer1527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleYesNoAnswer_in_entryRuleYesNoAnswer1562 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleYesNoAnswer1572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleYesNoAnswer1625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleYesNoAnswer1656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1694 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble1789 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble1800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleEDouble1839 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble1856 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_30_in_ruleEDouble1875 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble1890 = new BitSet(new long[]{0x0000000180000002L});
        public static final BitSet FOLLOW_31_in_ruleEDouble1910 = new BitSet(new long[]{0x0000000020000010L});
        public static final BitSet FOLLOW_32_in_ruleEDouble1929 = new BitSet(new long[]{0x0000000020000010L});
        public static final BitSet FOLLOW_29_in_ruleEDouble1944 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble1961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2011 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleEInt2061 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2078 = new BitSet(new long[]{0x0000000000000002L});
    }


}