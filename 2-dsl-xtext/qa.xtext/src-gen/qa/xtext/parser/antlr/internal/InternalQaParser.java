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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Title: '", "'RevealAnswer: '", "'try'", "'times'", "'reveal'", "'correct'", "'answer'", "'Name: '", "'Tries: '", "'Text: '", "'Epsilon: '", "'Number: '", "'Expression: '", "'Yes: '", "'OptionNumber: '", "'-'", "'.'", "'E'", "'e'", "'YES'", "'NO'"
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
        	return "QAContainer";	
       	}
       	
       	@Override
       	protected QaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleQAContainer"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:67:1: entryRuleQAContainer returns [EObject current=null] : iv_ruleQAContainer= ruleQAContainer EOF ;
    public final EObject entryRuleQAContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQAContainer = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:68:2: (iv_ruleQAContainer= ruleQAContainer EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:69:2: iv_ruleQAContainer= ruleQAContainer EOF
            {
             newCompositeNode(grammarAccess.getQAContainerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQAContainer_in_entryRuleQAContainer75);
            iv_ruleQAContainer=ruleQAContainer();

            state._fsp--;

             current =iv_ruleQAContainer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQAContainer85); 

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
    // $ANTLR end "entryRuleQAContainer"


    // $ANTLR start "ruleQAContainer"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:76:1: ruleQAContainer returns [EObject current=null] : (this_QATest_0= ruleQATest | this_QASection_1= ruleQASection ) ;
    public final EObject ruleQAContainer() throws RecognitionException {
        EObject current = null;

        EObject this_QATest_0 = null;

        EObject this_QASection_1 = null;


         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:79:28: ( (this_QATest_0= ruleQATest | this_QASection_1= ruleQASection ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:80:1: (this_QATest_0= ruleQATest | this_QASection_1= ruleQASection )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:80:1: (this_QATest_0= ruleQATest | this_QASection_1= ruleQASection )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_STRING) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==EOF||(LA1_2>=11 && LA1_2<=12)||LA1_2==20) ) {
                        alt1=1;
                    }
                    else if ( (LA1_2==18) ) {
                        alt1=2;
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
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:81:5: this_QATest_0= ruleQATest
                    {
                     
                            newCompositeNode(grammarAccess.getQAContainerAccess().getQATestParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQATest_in_ruleQAContainer132);
                    this_QATest_0=ruleQATest();

                    state._fsp--;

                     
                            current = this_QATest_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:91:5: this_QASection_1= ruleQASection
                    {
                     
                            newCompositeNode(grammarAccess.getQAContainerAccess().getQASectionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQASection_in_ruleQAContainer159);
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
    // $ANTLR end "ruleQAContainer"


    // $ANTLR start "entryRuleQATest"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:107:1: entryRuleQATest returns [EObject current=null] : iv_ruleQATest= ruleQATest EOF ;
    public final EObject entryRuleQATest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQATest = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:108:2: (iv_ruleQATest= ruleQATest EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:109:2: iv_ruleQATest= ruleQATest EOF
            {
             newCompositeNode(grammarAccess.getQATestRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQATest_in_entryRuleQATest194);
            iv_ruleQATest=ruleQATest();

            state._fsp--;

             current =iv_ruleQATest; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQATest204); 

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
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:116:1: ruleQATest returns [EObject current=null] : (otherlv_0= 'Title: ' ( (lv_title_1_0= ruleEString ) ) ( (lv_options_2_0= ruleQAContainerOptions ) )? ( (lv_parts_3_0= ruleQAPart ) )* ) ;
    public final EObject ruleQATest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;

        EObject lv_options_2_0 = null;

        EObject lv_parts_3_0 = null;


         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:119:28: ( (otherlv_0= 'Title: ' ( (lv_title_1_0= ruleEString ) ) ( (lv_options_2_0= ruleQAContainerOptions ) )? ( (lv_parts_3_0= ruleQAPart ) )* ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:120:1: (otherlv_0= 'Title: ' ( (lv_title_1_0= ruleEString ) ) ( (lv_options_2_0= ruleQAContainerOptions ) )? ( (lv_parts_3_0= ruleQAPart ) )* )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:120:1: (otherlv_0= 'Title: ' ( (lv_title_1_0= ruleEString ) ) ( (lv_options_2_0= ruleQAContainerOptions ) )? ( (lv_parts_3_0= ruleQAPart ) )* )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:120:3: otherlv_0= 'Title: ' ( (lv_title_1_0= ruleEString ) ) ( (lv_options_2_0= ruleQAContainerOptions ) )? ( (lv_parts_3_0= ruleQAPart ) )*
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleQATest241); 

                	newLeafNode(otherlv_0, grammarAccess.getQATestAccess().getTitleKeyword_0());
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:124:1: ( (lv_title_1_0= ruleEString ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:125:1: (lv_title_1_0= ruleEString )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:125:1: (lv_title_1_0= ruleEString )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:126:3: lv_title_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getQATestAccess().getTitleEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQATest262);
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

            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:142:2: ( (lv_options_2_0= ruleQAContainerOptions ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:143:1: (lv_options_2_0= ruleQAContainerOptions )
                    {
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:143:1: (lv_options_2_0= ruleQAContainerOptions )
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:144:3: lv_options_2_0= ruleQAContainerOptions
                    {
                     
                    	        newCompositeNode(grammarAccess.getQATestAccess().getOptionsQAContainerOptionsParserRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQAContainerOptions_in_ruleQATest283);
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

            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:160:3: ( (lv_parts_3_0= ruleQAPart ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11||LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:161:1: (lv_parts_3_0= ruleQAPart )
            	    {
            	    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:161:1: (lv_parts_3_0= ruleQAPart )
            	    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:162:3: lv_parts_3_0= ruleQAPart
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQATestAccess().getPartsQAPartParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQAPart_in_ruleQATest305);
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
            	    break loop3;
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
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:186:1: entryRuleQAContainerOptions returns [EObject current=null] : iv_ruleQAContainerOptions= ruleQAContainerOptions EOF ;
    public final EObject entryRuleQAContainerOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQAContainerOptions = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:187:2: (iv_ruleQAContainerOptions= ruleQAContainerOptions EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:188:2: iv_ruleQAContainerOptions= ruleQAContainerOptions EOF
            {
             newCompositeNode(grammarAccess.getQAContainerOptionsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQAContainerOptions_in_entryRuleQAContainerOptions342);
            iv_ruleQAContainerOptions=ruleQAContainerOptions();

            state._fsp--;

             current =iv_ruleQAContainerOptions; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQAContainerOptions352); 

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
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:195:1: ruleQAContainerOptions returns [EObject current=null] : (otherlv_0= 'RevealAnswer: ' ( (lv_revealAnswer_1_0= ruleEBoolean ) ) otherlv_2= 'try' ( (lv_maxTries_3_0= RULE_INT ) ) otherlv_4= 'times' ( ( (lv_revealAnswer_5_0= 'reveal' ) ) otherlv_6= 'correct' otherlv_7= 'answer' )? ) ;
    public final EObject ruleQAContainerOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_maxTries_3_0=null;
        Token otherlv_4=null;
        Token lv_revealAnswer_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_revealAnswer_1_0 = null;


         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:198:28: ( (otherlv_0= 'RevealAnswer: ' ( (lv_revealAnswer_1_0= ruleEBoolean ) ) otherlv_2= 'try' ( (lv_maxTries_3_0= RULE_INT ) ) otherlv_4= 'times' ( ( (lv_revealAnswer_5_0= 'reveal' ) ) otherlv_6= 'correct' otherlv_7= 'answer' )? ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:199:1: (otherlv_0= 'RevealAnswer: ' ( (lv_revealAnswer_1_0= ruleEBoolean ) ) otherlv_2= 'try' ( (lv_maxTries_3_0= RULE_INT ) ) otherlv_4= 'times' ( ( (lv_revealAnswer_5_0= 'reveal' ) ) otherlv_6= 'correct' otherlv_7= 'answer' )? )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:199:1: (otherlv_0= 'RevealAnswer: ' ( (lv_revealAnswer_1_0= ruleEBoolean ) ) otherlv_2= 'try' ( (lv_maxTries_3_0= RULE_INT ) ) otherlv_4= 'times' ( ( (lv_revealAnswer_5_0= 'reveal' ) ) otherlv_6= 'correct' otherlv_7= 'answer' )? )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:199:3: otherlv_0= 'RevealAnswer: ' ( (lv_revealAnswer_1_0= ruleEBoolean ) ) otherlv_2= 'try' ( (lv_maxTries_3_0= RULE_INT ) ) otherlv_4= 'times' ( ( (lv_revealAnswer_5_0= 'reveal' ) ) otherlv_6= 'correct' otherlv_7= 'answer' )?
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleQAContainerOptions389); 

                	newLeafNode(otherlv_0, grammarAccess.getQAContainerOptionsAccess().getRevealAnswerKeyword_0());
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:203:1: ( (lv_revealAnswer_1_0= ruleEBoolean ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:204:1: (lv_revealAnswer_1_0= ruleEBoolean )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:204:1: (lv_revealAnswer_1_0= ruleEBoolean )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:205:3: lv_revealAnswer_1_0= ruleEBoolean
            {
             
            	        newCompositeNode(grammarAccess.getQAContainerOptionsAccess().getRevealAnswerEBooleanParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleQAContainerOptions410);
            lv_revealAnswer_1_0=ruleEBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQAContainerOptionsRule());
            	        }
                   		set(
                   			current, 
                   			"revealAnswer",
                    		lv_revealAnswer_1_0, 
                    		"EBoolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleQAContainerOptions422); 

                	newLeafNode(otherlv_2, grammarAccess.getQAContainerOptionsAccess().getTryKeyword_2());
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:225:1: ( (lv_maxTries_3_0= RULE_INT ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:226:1: (lv_maxTries_3_0= RULE_INT )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:226:1: (lv_maxTries_3_0= RULE_INT )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:227:3: lv_maxTries_3_0= RULE_INT
            {
            lv_maxTries_3_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleQAContainerOptions439); 

            			newLeafNode(lv_maxTries_3_0, grammarAccess.getQAContainerOptionsAccess().getMaxTriesINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQAContainerOptionsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"maxTries",
                    		lv_maxTries_3_0, 
                    		"INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleQAContainerOptions456); 

                	newLeafNode(otherlv_4, grammarAccess.getQAContainerOptionsAccess().getTimesKeyword_4());
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:247:1: ( ( (lv_revealAnswer_5_0= 'reveal' ) ) otherlv_6= 'correct' otherlv_7= 'answer' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:247:2: ( (lv_revealAnswer_5_0= 'reveal' ) ) otherlv_6= 'correct' otherlv_7= 'answer'
                    {
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:247:2: ( (lv_revealAnswer_5_0= 'reveal' ) )
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:248:1: (lv_revealAnswer_5_0= 'reveal' )
                    {
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:248:1: (lv_revealAnswer_5_0= 'reveal' )
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:249:3: lv_revealAnswer_5_0= 'reveal'
                    {
                    lv_revealAnswer_5_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleQAContainerOptions475); 

                            newLeafNode(lv_revealAnswer_5_0, grammarAccess.getQAContainerOptionsAccess().getRevealAnswerRevealKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQAContainerOptionsRule());
                    	        }
                           		setWithLastConsumed(current, "revealAnswer", true, "reveal");
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleQAContainerOptions500); 

                        	newLeafNode(otherlv_6, grammarAccess.getQAContainerOptionsAccess().getCorrectKeyword_5_1());
                        
                    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleQAContainerOptions512); 

                        	newLeafNode(otherlv_7, grammarAccess.getQAContainerOptionsAccess().getAnswerKeyword_5_2());
                        

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
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:278:1: entryRuleQAPart returns [EObject current=null] : iv_ruleQAPart= ruleQAPart EOF ;
    public final EObject entryRuleQAPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQAPart = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:279:2: (iv_ruleQAPart= ruleQAPart EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:280:2: iv_ruleQAPart= ruleQAPart EOF
            {
             newCompositeNode(grammarAccess.getQAPartRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQAPart_in_entryRuleQAPart550);
            iv_ruleQAPart=ruleQAPart();

            state._fsp--;

             current =iv_ruleQAPart; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQAPart560); 

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
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:287:1: ruleQAPart returns [EObject current=null] : (this_Question_0= ruleQuestion | this_QASection_1= ruleQASection ) ;
    public final EObject ruleQAPart() throws RecognitionException {
        EObject current = null;

        EObject this_Question_0 = null;

        EObject this_QASection_1 = null;


         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:290:28: ( (this_Question_0= ruleQuestion | this_QASection_1= ruleQASection ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:291:1: (this_Question_0= ruleQuestion | this_QASection_1= ruleQASection )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:291:1: (this_Question_0= ruleQuestion | this_QASection_1= ruleQASection )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==11) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:292:5: this_Question_0= ruleQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQAPartAccess().getQuestionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleQAPart607);
                    this_Question_0=ruleQuestion();

                    state._fsp--;

                     
                            current = this_Question_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:302:5: this_QASection_1= ruleQASection
                    {
                     
                            newCompositeNode(grammarAccess.getQAPartAccess().getQASectionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQASection_in_ruleQAPart634);
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


    // $ANTLR start "entryRuleQASection"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:318:1: entryRuleQASection returns [EObject current=null] : iv_ruleQASection= ruleQASection EOF ;
    public final EObject entryRuleQASection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQASection = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:319:2: (iv_ruleQASection= ruleQASection EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:320:2: iv_ruleQASection= ruleQASection EOF
            {
             newCompositeNode(grammarAccess.getQASectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQASection_in_entryRuleQASection669);
            iv_ruleQASection=ruleQASection();

            state._fsp--;

             current =iv_ruleQASection; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQASection679); 

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
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:327:1: ruleQASection returns [EObject current=null] : (otherlv_0= 'Title: ' ( (lv_title_1_0= ruleEString ) ) otherlv_2= 'Name: ' ( (lv_name_3_0= ruleEString ) ) ( (lv_options_4_0= ruleQAContainerOptions ) )? ( (lv_questions_5_0= ruleQuestion ) )* ) ;
    public final EObject ruleQASection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_options_4_0 = null;

        EObject lv_questions_5_0 = null;


         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:330:28: ( (otherlv_0= 'Title: ' ( (lv_title_1_0= ruleEString ) ) otherlv_2= 'Name: ' ( (lv_name_3_0= ruleEString ) ) ( (lv_options_4_0= ruleQAContainerOptions ) )? ( (lv_questions_5_0= ruleQuestion ) )* ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:331:1: (otherlv_0= 'Title: ' ( (lv_title_1_0= ruleEString ) ) otherlv_2= 'Name: ' ( (lv_name_3_0= ruleEString ) ) ( (lv_options_4_0= ruleQAContainerOptions ) )? ( (lv_questions_5_0= ruleQuestion ) )* )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:331:1: (otherlv_0= 'Title: ' ( (lv_title_1_0= ruleEString ) ) otherlv_2= 'Name: ' ( (lv_name_3_0= ruleEString ) ) ( (lv_options_4_0= ruleQAContainerOptions ) )? ( (lv_questions_5_0= ruleQuestion ) )* )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:331:3: otherlv_0= 'Title: ' ( (lv_title_1_0= ruleEString ) ) otherlv_2= 'Name: ' ( (lv_name_3_0= ruleEString ) ) ( (lv_options_4_0= ruleQAContainerOptions ) )? ( (lv_questions_5_0= ruleQuestion ) )*
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleQASection716); 

                	newLeafNode(otherlv_0, grammarAccess.getQASectionAccess().getTitleKeyword_0());
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:335:1: ( (lv_title_1_0= ruleEString ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:336:1: (lv_title_1_0= ruleEString )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:336:1: (lv_title_1_0= ruleEString )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:337:3: lv_title_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getQASectionAccess().getTitleEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQASection737);
            lv_title_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQASectionRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleQASection749); 

                	newLeafNode(otherlv_2, grammarAccess.getQASectionAccess().getNameKeyword_2());
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:357:1: ( (lv_name_3_0= ruleEString ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:358:1: (lv_name_3_0= ruleEString )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:358:1: (lv_name_3_0= ruleEString )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:359:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getQASectionAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQASection770);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQASectionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:375:2: ( (lv_options_4_0= ruleQAContainerOptions ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:376:1: (lv_options_4_0= ruleQAContainerOptions )
                    {
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:376:1: (lv_options_4_0= ruleQAContainerOptions )
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:377:3: lv_options_4_0= ruleQAContainerOptions
                    {
                     
                    	        newCompositeNode(grammarAccess.getQASectionAccess().getOptionsQAContainerOptionsParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQAContainerOptions_in_ruleQASection791);
                    lv_options_4_0=ruleQAContainerOptions();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQASectionRule());
                    	        }
                           		set(
                           			current, 
                           			"options",
                            		lv_options_4_0, 
                            		"QAContainerOptions");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:393:3: ( (lv_questions_5_0= ruleQuestion ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==RULE_STRING) ) {
                        int LA7_3 = input.LA(3);

                        if ( (LA7_3==18) ) {
                            int LA7_4 = input.LA(4);

                            if ( (LA7_4==RULE_STRING) ) {
                                alt7=1;
                            }


                        }


                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:394:1: (lv_questions_5_0= ruleQuestion )
            	    {
            	    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:394:1: (lv_questions_5_0= ruleQuestion )
            	    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:395:3: lv_questions_5_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQASectionAccess().getQuestionsQuestionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_ruleQASection813);
            	    lv_questions_5_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQASectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_5_0, 
            	            		"Question");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleQASection"


    // $ANTLR start "entryRuleNextRule"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:419:1: entryRuleNextRule returns [EObject current=null] : iv_ruleNextRule= ruleNextRule EOF ;
    public final EObject entryRuleNextRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextRule = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:420:2: (iv_ruleNextRule= ruleNextRule EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:421:2: iv_ruleNextRule= ruleNextRule EOF
            {
             newCompositeNode(grammarAccess.getNextRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNextRule_in_entryRuleNextRule850);
            iv_ruleNextRule=ruleNextRule();

            state._fsp--;

             current =iv_ruleNextRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNextRule860); 

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
    // $ANTLR end "entryRuleNextRule"


    // $ANTLR start "ruleNextRule"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:428:1: ruleNextRule returns [EObject current=null] : (otherlv_0= 'Tries: ' ( (lv_tries_1_0= ruleEInt ) ) ) ;
    public final EObject ruleNextRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_tries_1_0 = null;


         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:431:28: ( (otherlv_0= 'Tries: ' ( (lv_tries_1_0= ruleEInt ) ) ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:432:1: (otherlv_0= 'Tries: ' ( (lv_tries_1_0= ruleEInt ) ) )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:432:1: (otherlv_0= 'Tries: ' ( (lv_tries_1_0= ruleEInt ) ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:432:3: otherlv_0= 'Tries: ' ( (lv_tries_1_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNextRule897); 

                	newLeafNode(otherlv_0, grammarAccess.getNextRuleAccess().getTriesKeyword_0());
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:436:1: ( (lv_tries_1_0= ruleEInt ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:437:1: (lv_tries_1_0= ruleEInt )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:437:1: (lv_tries_1_0= ruleEInt )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:438:3: lv_tries_1_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getNextRuleAccess().getTriesEIntParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNextRule918);
            lv_tries_1_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNextRuleRule());
            	        }
                   		set(
                   			current, 
                   			"tries",
                    		lv_tries_1_0, 
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
    // $ANTLR end "ruleNextRule"


    // $ANTLR start "entryRuleTextAnswer"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:462:1: entryRuleTextAnswer returns [EObject current=null] : iv_ruleTextAnswer= ruleTextAnswer EOF ;
    public final EObject entryRuleTextAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextAnswer = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:463:2: (iv_ruleTextAnswer= ruleTextAnswer EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:464:2: iv_ruleTextAnswer= ruleTextAnswer EOF
            {
             newCompositeNode(grammarAccess.getTextAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTextAnswer_in_entryRuleTextAnswer954);
            iv_ruleTextAnswer=ruleTextAnswer();

            state._fsp--;

             current =iv_ruleTextAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextAnswer964); 

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
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:471:1: ruleTextAnswer returns [EObject current=null] : (otherlv_0= 'Text: ' ( (lv_text_1_0= ruleEString ) ) ) ;
    public final EObject ruleTextAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_text_1_0 = null;


         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:474:28: ( (otherlv_0= 'Text: ' ( (lv_text_1_0= ruleEString ) ) ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:475:1: (otherlv_0= 'Text: ' ( (lv_text_1_0= ruleEString ) ) )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:475:1: (otherlv_0= 'Text: ' ( (lv_text_1_0= ruleEString ) ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:475:3: otherlv_0= 'Text: ' ( (lv_text_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTextAnswer1001); 

                	newLeafNode(otherlv_0, grammarAccess.getTextAnswerAccess().getTextKeyword_0());
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:479:1: ( (lv_text_1_0= ruleEString ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:480:1: (lv_text_1_0= ruleEString )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:480:1: (lv_text_1_0= ruleEString )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:481:3: lv_text_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTextAnswerAccess().getTextEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTextAnswer1022);
            lv_text_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTextAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_1_0, 
                    		"EString");
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
    // $ANTLR end "ruleTextAnswer"


    // $ANTLR start "entryRuleExpressionAnswer"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:505:1: entryRuleExpressionAnswer returns [EObject current=null] : iv_ruleExpressionAnswer= ruleExpressionAnswer EOF ;
    public final EObject entryRuleExpressionAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionAnswer = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:506:2: (iv_ruleExpressionAnswer= ruleExpressionAnswer EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:507:2: iv_ruleExpressionAnswer= ruleExpressionAnswer EOF
            {
             newCompositeNode(grammarAccess.getExpressionAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpressionAnswer_in_entryRuleExpressionAnswer1058);
            iv_ruleExpressionAnswer=ruleExpressionAnswer();

            state._fsp--;

             current =iv_ruleExpressionAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpressionAnswer1068); 

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
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:514:1: ruleExpressionAnswer returns [EObject current=null] : (otherlv_0= 'Epsilon: ' ( (lv_epsilon_1_0= ruleEDouble ) ) otherlv_2= 'Number: ' ( (lv_number_3_0= ruleEDouble ) ) otherlv_4= 'Expression: ' ( (lv_expression_5_0= ruleEString ) ) ) ;
    public final EObject ruleExpressionAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_epsilon_1_0 = null;

        AntlrDatatypeRuleToken lv_number_3_0 = null;

        AntlrDatatypeRuleToken lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:517:28: ( (otherlv_0= 'Epsilon: ' ( (lv_epsilon_1_0= ruleEDouble ) ) otherlv_2= 'Number: ' ( (lv_number_3_0= ruleEDouble ) ) otherlv_4= 'Expression: ' ( (lv_expression_5_0= ruleEString ) ) ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:518:1: (otherlv_0= 'Epsilon: ' ( (lv_epsilon_1_0= ruleEDouble ) ) otherlv_2= 'Number: ' ( (lv_number_3_0= ruleEDouble ) ) otherlv_4= 'Expression: ' ( (lv_expression_5_0= ruleEString ) ) )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:518:1: (otherlv_0= 'Epsilon: ' ( (lv_epsilon_1_0= ruleEDouble ) ) otherlv_2= 'Number: ' ( (lv_number_3_0= ruleEDouble ) ) otherlv_4= 'Expression: ' ( (lv_expression_5_0= ruleEString ) ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:518:3: otherlv_0= 'Epsilon: ' ( (lv_epsilon_1_0= ruleEDouble ) ) otherlv_2= 'Number: ' ( (lv_number_3_0= ruleEDouble ) ) otherlv_4= 'Expression: ' ( (lv_expression_5_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleExpressionAnswer1105); 

                	newLeafNode(otherlv_0, grammarAccess.getExpressionAnswerAccess().getEpsilonKeyword_0());
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:522:1: ( (lv_epsilon_1_0= ruleEDouble ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:523:1: (lv_epsilon_1_0= ruleEDouble )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:523:1: (lv_epsilon_1_0= ruleEDouble )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:524:3: lv_epsilon_1_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getExpressionAnswerAccess().getEpsilonEDoubleParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleExpressionAnswer1126);
            lv_epsilon_1_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"epsilon",
                    		lv_epsilon_1_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleExpressionAnswer1138); 

                	newLeafNode(otherlv_2, grammarAccess.getExpressionAnswerAccess().getNumberKeyword_2());
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:544:1: ( (lv_number_3_0= ruleEDouble ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:545:1: (lv_number_3_0= ruleEDouble )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:545:1: (lv_number_3_0= ruleEDouble )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:546:3: lv_number_3_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getExpressionAnswerAccess().getNumberEDoubleParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleExpressionAnswer1159);
            lv_number_3_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"number",
                    		lv_number_3_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleExpressionAnswer1171); 

                	newLeafNode(otherlv_4, grammarAccess.getExpressionAnswerAccess().getExpressionKeyword_4());
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:566:1: ( (lv_expression_5_0= ruleEString ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:567:1: (lv_expression_5_0= ruleEString )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:567:1: (lv_expression_5_0= ruleEString )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:568:3: lv_expression_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getExpressionAnswerAccess().getExpressionEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExpressionAnswer1192);
            lv_expression_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_5_0, 
                    		"EString");
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
    // $ANTLR end "ruleExpressionAnswer"


    // $ANTLR start "entryRuleNumberAnswer"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:592:1: entryRuleNumberAnswer returns [EObject current=null] : iv_ruleNumberAnswer= ruleNumberAnswer EOF ;
    public final EObject entryRuleNumberAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberAnswer = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:593:2: (iv_ruleNumberAnswer= ruleNumberAnswer EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:594:2: iv_ruleNumberAnswer= ruleNumberAnswer EOF
            {
             newCompositeNode(grammarAccess.getNumberAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumberAnswer_in_entryRuleNumberAnswer1228);
            iv_ruleNumberAnswer=ruleNumberAnswer();

            state._fsp--;

             current =iv_ruleNumberAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumberAnswer1238); 

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
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:601:1: ruleNumberAnswer returns [EObject current=null] : ( (otherlv_0= 'Epsilon: ' ( (lv_epsilon_1_0= ruleEDouble ) ) otherlv_2= 'Number: ' ( (lv_number_3_0= ruleEDouble ) ) ) | this_ExpressionAnswer_4= ruleExpressionAnswer ) ;
    public final EObject ruleNumberAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_epsilon_1_0 = null;

        AntlrDatatypeRuleToken lv_number_3_0 = null;

        EObject this_ExpressionAnswer_4 = null;


         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:604:28: ( ( (otherlv_0= 'Epsilon: ' ( (lv_epsilon_1_0= ruleEDouble ) ) otherlv_2= 'Number: ' ( (lv_number_3_0= ruleEDouble ) ) ) | this_ExpressionAnswer_4= ruleExpressionAnswer ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:605:1: ( (otherlv_0= 'Epsilon: ' ( (lv_epsilon_1_0= ruleEDouble ) ) otherlv_2= 'Number: ' ( (lv_number_3_0= ruleEDouble ) ) ) | this_ExpressionAnswer_4= ruleExpressionAnswer )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:605:1: ( (otherlv_0= 'Epsilon: ' ( (lv_epsilon_1_0= ruleEDouble ) ) otherlv_2= 'Number: ' ( (lv_number_3_0= ruleEDouble ) ) ) | this_ExpressionAnswer_4= ruleExpressionAnswer )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:605:2: (otherlv_0= 'Epsilon: ' ( (lv_epsilon_1_0= ruleEDouble ) ) otherlv_2= 'Number: ' ( (lv_number_3_0= ruleEDouble ) ) )
                    {
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:605:2: (otherlv_0= 'Epsilon: ' ( (lv_epsilon_1_0= ruleEDouble ) ) otherlv_2= 'Number: ' ( (lv_number_3_0= ruleEDouble ) ) )
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:605:4: otherlv_0= 'Epsilon: ' ( (lv_epsilon_1_0= ruleEDouble ) ) otherlv_2= 'Number: ' ( (lv_number_3_0= ruleEDouble ) )
                    {
                    otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleNumberAnswer1276); 

                        	newLeafNode(otherlv_0, grammarAccess.getNumberAnswerAccess().getEpsilonKeyword_0_0());
                        
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:609:1: ( (lv_epsilon_1_0= ruleEDouble ) )
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:610:1: (lv_epsilon_1_0= ruleEDouble )
                    {
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:610:1: (lv_epsilon_1_0= ruleEDouble )
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:611:3: lv_epsilon_1_0= ruleEDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumberAnswerAccess().getEpsilonEDoubleParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleNumberAnswer1297);
                    lv_epsilon_1_0=ruleEDouble();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNumberAnswerRule());
                    	        }
                           		set(
                           			current, 
                           			"epsilon",
                            		lv_epsilon_1_0, 
                            		"EDouble");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleNumberAnswer1309); 

                        	newLeafNode(otherlv_2, grammarAccess.getNumberAnswerAccess().getNumberKeyword_0_2());
                        
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:631:1: ( (lv_number_3_0= ruleEDouble ) )
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:632:1: (lv_number_3_0= ruleEDouble )
                    {
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:632:1: (lv_number_3_0= ruleEDouble )
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:633:3: lv_number_3_0= ruleEDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumberAnswerAccess().getNumberEDoubleParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleNumberAnswer1330);
                    lv_number_3_0=ruleEDouble();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNumberAnswerRule());
                    	        }
                           		set(
                           			current, 
                           			"number",
                            		lv_number_3_0, 
                            		"EDouble");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:651:5: this_ExpressionAnswer_4= ruleExpressionAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getNumberAnswerAccess().getExpressionAnswerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpressionAnswer_in_ruleNumberAnswer1359);
                    this_ExpressionAnswer_4=ruleExpressionAnswer();

                    state._fsp--;

                     
                            current = this_ExpressionAnswer_4; 
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


    // $ANTLR start "entryRuleYesNoAnswer"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:667:1: entryRuleYesNoAnswer returns [EObject current=null] : iv_ruleYesNoAnswer= ruleYesNoAnswer EOF ;
    public final EObject entryRuleYesNoAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYesNoAnswer = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:668:2: (iv_ruleYesNoAnswer= ruleYesNoAnswer EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:669:2: iv_ruleYesNoAnswer= ruleYesNoAnswer EOF
            {
             newCompositeNode(grammarAccess.getYesNoAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleYesNoAnswer_in_entryRuleYesNoAnswer1394);
            iv_ruleYesNoAnswer=ruleYesNoAnswer();

            state._fsp--;

             current =iv_ruleYesNoAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleYesNoAnswer1404); 

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
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:676:1: ruleYesNoAnswer returns [EObject current=null] : (otherlv_0= 'Yes: ' ( (lv_yes_1_0= ruleEBoolean ) ) ) ;
    public final EObject ruleYesNoAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_yes_1_0 = null;


         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:679:28: ( (otherlv_0= 'Yes: ' ( (lv_yes_1_0= ruleEBoolean ) ) ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:680:1: (otherlv_0= 'Yes: ' ( (lv_yes_1_0= ruleEBoolean ) ) )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:680:1: (otherlv_0= 'Yes: ' ( (lv_yes_1_0= ruleEBoolean ) ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:680:3: otherlv_0= 'Yes: ' ( (lv_yes_1_0= ruleEBoolean ) )
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleYesNoAnswer1441); 

                	newLeafNode(otherlv_0, grammarAccess.getYesNoAnswerAccess().getYesKeyword_0());
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:684:1: ( (lv_yes_1_0= ruleEBoolean ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:685:1: (lv_yes_1_0= ruleEBoolean )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:685:1: (lv_yes_1_0= ruleEBoolean )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:686:3: lv_yes_1_0= ruleEBoolean
            {
             
            	        newCompositeNode(grammarAccess.getYesNoAnswerAccess().getYesEBooleanParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleYesNoAnswer1462);
            lv_yes_1_0=ruleEBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getYesNoAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"yes",
                    		true, 
                    		"EBoolean");
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
    // $ANTLR end "ruleYesNoAnswer"


    // $ANTLR start "entryRuleOptionAnswer"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:710:1: entryRuleOptionAnswer returns [EObject current=null] : iv_ruleOptionAnswer= ruleOptionAnswer EOF ;
    public final EObject entryRuleOptionAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionAnswer = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:711:2: (iv_ruleOptionAnswer= ruleOptionAnswer EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:712:2: iv_ruleOptionAnswer= ruleOptionAnswer EOF
            {
             newCompositeNode(grammarAccess.getOptionAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOptionAnswer_in_entryRuleOptionAnswer1498);
            iv_ruleOptionAnswer=ruleOptionAnswer();

            state._fsp--;

             current =iv_ruleOptionAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOptionAnswer1508); 

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
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:719:1: ruleOptionAnswer returns [EObject current=null] : (otherlv_0= 'OptionNumber: ' ( (lv_optionNumber_1_0= ruleEInt ) ) ) ;
    public final EObject ruleOptionAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_optionNumber_1_0 = null;


         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:722:28: ( (otherlv_0= 'OptionNumber: ' ( (lv_optionNumber_1_0= ruleEInt ) ) ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:723:1: (otherlv_0= 'OptionNumber: ' ( (lv_optionNumber_1_0= ruleEInt ) ) )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:723:1: (otherlv_0= 'OptionNumber: ' ( (lv_optionNumber_1_0= ruleEInt ) ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:723:3: otherlv_0= 'OptionNumber: ' ( (lv_optionNumber_1_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleOptionAnswer1545); 

                	newLeafNode(otherlv_0, grammarAccess.getOptionAnswerAccess().getOptionNumberKeyword_0());
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:727:1: ( (lv_optionNumber_1_0= ruleEInt ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:728:1: (lv_optionNumber_1_0= ruleEInt )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:728:1: (lv_optionNumber_1_0= ruleEInt )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:729:3: lv_optionNumber_1_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getOptionAnswerAccess().getOptionNumberEIntParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleOptionAnswer1566);
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


    // $ANTLR start "entryRuleAnswer"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:753:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:754:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:755:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer1602);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer1612); 

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
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:762:1: ruleAnswer returns [EObject current=null] : (this_TextAnswer_0= ruleTextAnswer | this_NumberAnswer_1= ruleNumberAnswer | this_YesNoAnswer_2= ruleYesNoAnswer | this_OptionAnswer_3= ruleOptionAnswer ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        EObject this_TextAnswer_0 = null;

        EObject this_NumberAnswer_1 = null;

        EObject this_YesNoAnswer_2 = null;

        EObject this_OptionAnswer_3 = null;


         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:765:28: ( (this_TextAnswer_0= ruleTextAnswer | this_NumberAnswer_1= ruleNumberAnswer | this_YesNoAnswer_2= ruleYesNoAnswer | this_OptionAnswer_3= ruleOptionAnswer ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:766:1: (this_TextAnswer_0= ruleTextAnswer | this_NumberAnswer_1= ruleNumberAnswer | this_YesNoAnswer_2= ruleYesNoAnswer | this_OptionAnswer_3= ruleOptionAnswer )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:766:1: (this_TextAnswer_0= ruleTextAnswer | this_NumberAnswer_1= ruleNumberAnswer | this_YesNoAnswer_2= ruleYesNoAnswer | this_OptionAnswer_3= ruleOptionAnswer )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 21:
                {
                alt9=2;
                }
                break;
            case 24:
                {
                alt9=3;
                }
                break;
            case 25:
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
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:767:5: this_TextAnswer_0= ruleTextAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getAnswerAccess().getTextAnswerParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTextAnswer_in_ruleAnswer1659);
                    this_TextAnswer_0=ruleTextAnswer();

                    state._fsp--;

                     
                            current = this_TextAnswer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:777:5: this_NumberAnswer_1= ruleNumberAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getAnswerAccess().getNumberAnswerParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumberAnswer_in_ruleAnswer1686);
                    this_NumberAnswer_1=ruleNumberAnswer();

                    state._fsp--;

                     
                            current = this_NumberAnswer_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:787:5: this_YesNoAnswer_2= ruleYesNoAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getAnswerAccess().getYesNoAnswerParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleYesNoAnswer_in_ruleAnswer1713);
                    this_YesNoAnswer_2=ruleYesNoAnswer();

                    state._fsp--;

                     
                            current = this_YesNoAnswer_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:797:5: this_OptionAnswer_3= ruleOptionAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getAnswerAccess().getOptionAnswerParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOptionAnswer_in_ruleAnswer1740);
                    this_OptionAnswer_3=ruleOptionAnswer();

                    state._fsp--;

                     
                            current = this_OptionAnswer_3; 
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


    // $ANTLR start "entryRuleQuestion"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:813:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:814:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:815:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_entryRuleQuestion1775);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestion1785); 

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
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:822:1: ruleQuestion returns [EObject current=null] : (otherlv_0= 'Text: ' ( (lv_text_1_0= ruleEString ) ) otherlv_2= 'Name: ' ( (lv_name_3_0= ruleEString ) ) ( (lv_nextRules_4_0= ruleNextRule ) )* ( (lv_correct_5_0= ruleAnswer ) )? ( (lv_candidates_6_0= ruleAnswer ) )* ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_text_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_nextRules_4_0 = null;

        EObject lv_correct_5_0 = null;

        EObject lv_candidates_6_0 = null;


         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:825:28: ( (otherlv_0= 'Text: ' ( (lv_text_1_0= ruleEString ) ) otherlv_2= 'Name: ' ( (lv_name_3_0= ruleEString ) ) ( (lv_nextRules_4_0= ruleNextRule ) )* ( (lv_correct_5_0= ruleAnswer ) )? ( (lv_candidates_6_0= ruleAnswer ) )* ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:826:1: (otherlv_0= 'Text: ' ( (lv_text_1_0= ruleEString ) ) otherlv_2= 'Name: ' ( (lv_name_3_0= ruleEString ) ) ( (lv_nextRules_4_0= ruleNextRule ) )* ( (lv_correct_5_0= ruleAnswer ) )? ( (lv_candidates_6_0= ruleAnswer ) )* )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:826:1: (otherlv_0= 'Text: ' ( (lv_text_1_0= ruleEString ) ) otherlv_2= 'Name: ' ( (lv_name_3_0= ruleEString ) ) ( (lv_nextRules_4_0= ruleNextRule ) )* ( (lv_correct_5_0= ruleAnswer ) )? ( (lv_candidates_6_0= ruleAnswer ) )* )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:826:3: otherlv_0= 'Text: ' ( (lv_text_1_0= ruleEString ) ) otherlv_2= 'Name: ' ( (lv_name_3_0= ruleEString ) ) ( (lv_nextRules_4_0= ruleNextRule ) )* ( (lv_correct_5_0= ruleAnswer ) )? ( (lv_candidates_6_0= ruleAnswer ) )*
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleQuestion1822); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getTextKeyword_0());
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:830:1: ( (lv_text_1_0= ruleEString ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:831:1: (lv_text_1_0= ruleEString )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:831:1: (lv_text_1_0= ruleEString )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:832:3: lv_text_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getQuestionAccess().getTextEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQuestion1843);
            lv_text_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleQuestion1855); 

                	newLeafNode(otherlv_2, grammarAccess.getQuestionAccess().getNameKeyword_2());
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:852:1: ( (lv_name_3_0= ruleEString ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:853:1: (lv_name_3_0= ruleEString )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:853:1: (lv_name_3_0= ruleEString )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:854:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getQuestionAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleQuestion1876);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:870:2: ( (lv_nextRules_4_0= ruleNextRule ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:871:1: (lv_nextRules_4_0= ruleNextRule )
            	    {
            	    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:871:1: (lv_nextRules_4_0= ruleNextRule )
            	    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:872:3: lv_nextRules_4_0= ruleNextRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getNextRulesNextRuleParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleNextRule_in_ruleQuestion1897);
            	    lv_nextRules_4_0=ruleNextRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nextRules",
            	            		lv_nextRules_4_0, 
            	            		"NextRule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:888:3: ( (lv_correct_5_0= ruleAnswer ) )?
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:889:1: (lv_correct_5_0= ruleAnswer )
                    {
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:889:1: (lv_correct_5_0= ruleAnswer )
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:890:3: lv_correct_5_0= ruleAnswer
                    {
                     
                    	        newCompositeNode(grammarAccess.getQuestionAccess().getCorrectAnswerParserRuleCall_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleQuestion1919);
                    lv_correct_5_0=ruleAnswer();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
                    	        }
                           		set(
                           			current, 
                           			"correct",
                            		lv_correct_5_0, 
                            		"Answer");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:906:3: ( (lv_candidates_6_0= ruleAnswer ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==RULE_STRING) ) {
                        int LA12_4 = input.LA(3);

                        if ( (LA12_4==EOF||LA12_4==11||(LA12_4>=20 && LA12_4<=21)||(LA12_4>=24 && LA12_4<=25)) ) {
                            alt12=1;
                        }


                    }


                }
                else if ( (LA12_0==21||(LA12_0>=24 && LA12_0<=25)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:907:1: (lv_candidates_6_0= ruleAnswer )
            	    {
            	    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:907:1: (lv_candidates_6_0= ruleAnswer )
            	    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:908:3: lv_candidates_6_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getCandidatesAnswerParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_ruleQuestion1941);
            	    lv_candidates_6_0=ruleAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"candidates",
            	            		lv_candidates_6_0, 
            	            		"Answer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleEString"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:932:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:933:2: (iv_ruleEString= ruleEString EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:934:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1979);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1990); 

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
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:941:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:944:28: (this_STRING_0= RULE_STRING )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:945:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString2029); 

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
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:960:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:961:2: (iv_ruleEDouble= ruleEDouble EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:962:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble2074);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble2085); 

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
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:969:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:972:28: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )? ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:973:1: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )? )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:973:1: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )? )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:973:2: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )?
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:973:2: (kw= '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:974:2: kw= '-'
                    {
                    kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEDouble2124); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble2141); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:986:1: (kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:987:2: kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
                    {
                    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEDouble2160); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2_0()); 
                        
                    this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble2175); 

                    		current.merge(this_INT_3);
                        
                     
                        newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_2_1()); 
                        
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:999:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=28 && LA16_0<=29)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:999:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                            {
                            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:999:2: (kw= 'E' | kw= 'e' )
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==28) ) {
                                alt14=1;
                            }
                            else if ( (LA14_0==29) ) {
                                alt14=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 14, 0, input);

                                throw nvae;
                            }
                            switch (alt14) {
                                case 1 :
                                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:1000:2: kw= 'E'
                                    {
                                    kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEDouble2195); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_2_2_0_0()); 
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:1007:2: kw= 'e'
                                    {
                                    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEDouble2214); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_2_2_0_1()); 
                                        

                                    }
                                    break;

                            }

                            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:1012:2: (kw= '-' )?
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0==26) ) {
                                alt15=1;
                            }
                            switch (alt15) {
                                case 1 :
                                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:1013:2: kw= '-'
                                    {
                                    kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEDouble2229); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_2_2_1()); 
                                        

                                    }
                                    break;

                            }

                            this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble2246); 

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
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:1033:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:1034:2: (iv_ruleEInt= ruleEInt EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:1035:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2296);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2307); 

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
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:1042:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:1045:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:1046:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:1046:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:1046:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:1046:2: (kw= '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:1047:2: kw= '-'
                    {
                    kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEInt2346); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2363); 

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


    // $ANTLR start "entryRuleEBoolean"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:1067:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:1068:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:1069:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean2409);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean2420); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:1076:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING (kw= 'YES' | kw= 'NO' ) ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:1079:28: ( (this_STRING_0= RULE_STRING (kw= 'YES' | kw= 'NO' ) ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:1080:1: (this_STRING_0= RULE_STRING (kw= 'YES' | kw= 'NO' ) )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:1080:1: (this_STRING_0= RULE_STRING (kw= 'YES' | kw= 'NO' ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:1080:6: this_STRING_0= RULE_STRING (kw= 'YES' | kw= 'NO' )
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEBoolean2460); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getEBooleanAccess().getSTRINGTerminalRuleCall_0()); 
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:1087:1: (kw= 'YES' | kw= 'NO' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            else if ( (LA19_0==31) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:1088:2: kw= 'YES'
                    {
                    kw=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleEBoolean2479); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getYESKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:1095:2: kw= 'NO'
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleEBoolean2498); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getNOKeyword_1_1()); 
                        

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
    // $ANTLR end "ruleEBoolean"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA8_eotS =
        "\25\uffff";
    static final String DFA8_eofS =
        "\10\uffff\1\15\7\uffff\1\15\3\uffff\1\15";
    static final String DFA8_minS =
        "\1\25\2\4\1\26\2\4\1\26\1\4\1\13\3\4\2\uffff\1\4\1\26\1\13\3\4"+
        "\1\13";
    static final String DFA8_maxS =
        "\1\25\1\32\1\4\1\33\1\4\1\32\1\35\1\4\1\33\2\32\1\4\2\uffff\1\4"+
        "\1\26\1\35\2\32\1\4\1\31";
    static final String DFA8_acceptS =
        "\14\uffff\1\2\1\1\7\uffff";
    static final String DFA8_specialS =
        "\25\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1",
            "\1\3\25\uffff\1\2",
            "\1\3",
            "\1\5\4\uffff\1\4",
            "\1\6",
            "\1\10\25\uffff\1\7",
            "\1\5\5\uffff\1\11\1\12",
            "\1\10",
            "\1\15\10\uffff\2\15\1\uffff\1\14\2\15\1\uffff\1\13",
            "\1\17\25\uffff\1\16",
            "\1\17\25\uffff\1\16",
            "\1\20",
            "",
            "",
            "\1\17",
            "\1\5",
            "\1\15\10\uffff\2\15\1\uffff\1\14\2\15\2\uffff\1\21\1\22",
            "\1\24\25\uffff\1\23",
            "\1\24\25\uffff\1\23",
            "\1\24",
            "\1\15\10\uffff\2\15\1\uffff\1\14\2\15"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "605:1: ( (otherlv_0= 'Epsilon: ' ( (lv_epsilon_1_0= ruleEDouble ) ) otherlv_2= 'Number: ' ( (lv_number_3_0= ruleEDouble ) ) ) | this_ExpressionAnswer_4= ruleExpressionAnswer )";
        }
    }
    static final String DFA11_eotS =
        "\27\uffff";
    static final String DFA11_eofS =
        "\1\5\26\uffff";
    static final String DFA11_minS =
        "\1\13\1\5\1\4\1\5\1\4\2\uffff\1\4\1\26\1\36\1\4\1\uffff\2\4\2\uffff"+
        "\1\26\1\4\1\uffff\3\4\1\26";
    static final String DFA11_maxS =
        "\1\31\1\5\1\32\1\5\1\32\2\uffff\1\4\1\33\1\37\1\4\1\uffff\1\4\1"+
        "\32\2\uffff\1\35\1\4\1\uffff\2\32\1\4\1\26";
    static final String DFA11_acceptS =
        "\5\uffff\1\2\1\1\4\uffff\1\1\2\uffff\2\1\2\uffff\1\1\4\uffff";
    static final String DFA11_specialS =
        "\27\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\5\10\uffff\1\1\1\2\2\uffff\1\3\1\4",
            "\1\6",
            "\1\10\25\uffff\1\7",
            "\1\11",
            "\1\13\25\uffff\1\12",
            "",
            "",
            "\1\10",
            "\1\15\4\uffff\1\14",
            "\1\16\1\17",
            "\1\13",
            "",
            "\1\20",
            "\1\22\25\uffff\1\21",
            "",
            "",
            "\1\15\5\uffff\1\23\1\24",
            "\1\22",
            "",
            "\1\26\25\uffff\1\25",
            "\1\26\25\uffff\1\25",
            "\1\26",
            "\1\15"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "888:3: ( (lv_correct_5_0= ruleAnswer ) )?";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleQAContainer_in_entryRuleQAContainer75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQAContainer85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQATest_in_ruleQAContainer132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQASection_in_ruleQAContainer159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQATest_in_entryRuleQATest194 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQATest204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleQATest241 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQATest262 = new BitSet(new long[]{0x0000000000101802L});
        public static final BitSet FOLLOW_ruleQAContainerOptions_in_ruleQATest283 = new BitSet(new long[]{0x0000000000100802L});
        public static final BitSet FOLLOW_ruleQAPart_in_ruleQATest305 = new BitSet(new long[]{0x0000000000100802L});
        public static final BitSet FOLLOW_ruleQAContainerOptions_in_entryRuleQAContainerOptions342 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQAContainerOptions352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleQAContainerOptions389 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleQAContainerOptions410 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleQAContainerOptions422 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleQAContainerOptions439 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleQAContainerOptions456 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_15_in_ruleQAContainerOptions475 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleQAContainerOptions500 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleQAContainerOptions512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQAPart_in_entryRuleQAPart550 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQAPart560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleQAPart607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQASection_in_ruleQAPart634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQASection_in_entryRuleQASection669 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQASection679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleQASection716 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQASection737 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleQASection749 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQASection770 = new BitSet(new long[]{0x0000000000101002L});
        public static final BitSet FOLLOW_ruleQAContainerOptions_in_ruleQASection791 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_ruleQuestion_in_ruleQASection813 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_ruleNextRule_in_entryRuleNextRule850 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNextRule860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleNextRule897 = new BitSet(new long[]{0x0000000004000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNextRule918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextAnswer_in_entryRuleTextAnswer954 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextAnswer964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleTextAnswer1001 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTextAnswer1022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionAnswer_in_entryRuleExpressionAnswer1058 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpressionAnswer1068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleExpressionAnswer1105 = new BitSet(new long[]{0x0000000004000010L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleExpressionAnswer1126 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleExpressionAnswer1138 = new BitSet(new long[]{0x0000000004000010L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleExpressionAnswer1159 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleExpressionAnswer1171 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExpressionAnswer1192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberAnswer_in_entryRuleNumberAnswer1228 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumberAnswer1238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleNumberAnswer1276 = new BitSet(new long[]{0x0000000004000010L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleNumberAnswer1297 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleNumberAnswer1309 = new BitSet(new long[]{0x0000000004000010L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleNumberAnswer1330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpressionAnswer_in_ruleNumberAnswer1359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleYesNoAnswer_in_entryRuleYesNoAnswer1394 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleYesNoAnswer1404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleYesNoAnswer1441 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleYesNoAnswer1462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptionAnswer_in_entryRuleOptionAnswer1498 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOptionAnswer1508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleOptionAnswer1545 = new BitSet(new long[]{0x0000000004000010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleOptionAnswer1566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer1602 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer1612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextAnswer_in_ruleAnswer1659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumberAnswer_in_ruleAnswer1686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleYesNoAnswer_in_ruleAnswer1713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOptionAnswer_in_ruleAnswer1740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion1775 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestion1785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleQuestion1822 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQuestion1843 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleQuestion1855 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQuestion1876 = new BitSet(new long[]{0x0000000003380002L});
        public static final BitSet FOLLOW_ruleNextRule_in_ruleQuestion1897 = new BitSet(new long[]{0x0000000003380002L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleQuestion1919 = new BitSet(new long[]{0x0000000003300002L});
        public static final BitSet FOLLOW_ruleAnswer_in_ruleQuestion1941 = new BitSet(new long[]{0x0000000003300002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1979 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString2029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble2074 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble2085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleEDouble2124 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble2141 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_27_in_ruleEDouble2160 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble2175 = new BitSet(new long[]{0x0000000030000002L});
        public static final BitSet FOLLOW_28_in_ruleEDouble2195 = new BitSet(new long[]{0x0000000004000010L});
        public static final BitSet FOLLOW_29_in_ruleEDouble2214 = new BitSet(new long[]{0x0000000004000010L});
        public static final BitSet FOLLOW_26_in_ruleEDouble2229 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble2246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2296 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleEInt2346 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean2409 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean2420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEBoolean2460 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_30_in_ruleEBoolean2479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleEBoolean2498 = new BitSet(new long[]{0x0000000000000002L});
    }


}