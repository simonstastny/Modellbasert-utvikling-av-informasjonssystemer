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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Title: '", "'try'", "'times'", "'reveal'", "'correct'", "'answer'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
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
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:76:1: ruleQATest returns [EObject current=null] : (otherlv_0= 'Title: ' ( (lv_title_1_0= ruleEString ) ) ( (lv_options_2_0= ruleQAContainerOptions ) )? ) ;
    public final EObject ruleQATest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;

        EObject lv_options_2_0 = null;


         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:79:28: ( (otherlv_0= 'Title: ' ( (lv_title_1_0= ruleEString ) ) ( (lv_options_2_0= ruleQAContainerOptions ) )? ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:80:1: (otherlv_0= 'Title: ' ( (lv_title_1_0= ruleEString ) ) ( (lv_options_2_0= ruleQAContainerOptions ) )? )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:80:1: (otherlv_0= 'Title: ' ( (lv_title_1_0= ruleEString ) ) ( (lv_options_2_0= ruleQAContainerOptions ) )? )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:80:3: otherlv_0= 'Title: ' ( (lv_title_1_0= ruleEString ) ) ( (lv_options_2_0= ruleQAContainerOptions ) )?
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
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:128:1: entryRuleQAContainerOptions returns [EObject current=null] : iv_ruleQAContainerOptions= ruleQAContainerOptions EOF ;
    public final EObject entryRuleQAContainerOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQAContainerOptions = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:129:2: (iv_ruleQAContainerOptions= ruleQAContainerOptions EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:130:2: iv_ruleQAContainerOptions= ruleQAContainerOptions EOF
            {
             newCompositeNode(grammarAccess.getQAContainerOptionsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQAContainerOptions_in_entryRuleQAContainerOptions201);
            iv_ruleQAContainerOptions=ruleQAContainerOptions();

            state._fsp--;

             current =iv_ruleQAContainerOptions; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQAContainerOptions211); 

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
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:137:1: ruleQAContainerOptions returns [EObject current=null] : (otherlv_0= 'try' ( (lv_maxTries_1_0= RULE_INT ) ) otherlv_2= 'times' ( ( (lv_revealAnswer_3_0= 'reveal' ) ) otherlv_4= 'correct' otherlv_5= 'answer' )? ) ;
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
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:140:28: ( (otherlv_0= 'try' ( (lv_maxTries_1_0= RULE_INT ) ) otherlv_2= 'times' ( ( (lv_revealAnswer_3_0= 'reveal' ) ) otherlv_4= 'correct' otherlv_5= 'answer' )? ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:141:1: (otherlv_0= 'try' ( (lv_maxTries_1_0= RULE_INT ) ) otherlv_2= 'times' ( ( (lv_revealAnswer_3_0= 'reveal' ) ) otherlv_4= 'correct' otherlv_5= 'answer' )? )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:141:1: (otherlv_0= 'try' ( (lv_maxTries_1_0= RULE_INT ) ) otherlv_2= 'times' ( ( (lv_revealAnswer_3_0= 'reveal' ) ) otherlv_4= 'correct' otherlv_5= 'answer' )? )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:141:3: otherlv_0= 'try' ( (lv_maxTries_1_0= RULE_INT ) ) otherlv_2= 'times' ( ( (lv_revealAnswer_3_0= 'reveal' ) ) otherlv_4= 'correct' otherlv_5= 'answer' )?
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleQAContainerOptions248); 

                	newLeafNode(otherlv_0, grammarAccess.getQAContainerOptionsAccess().getTryKeyword_0());
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:145:1: ( (lv_maxTries_1_0= RULE_INT ) )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:146:1: (lv_maxTries_1_0= RULE_INT )
            {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:146:1: (lv_maxTries_1_0= RULE_INT )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:147:3: lv_maxTries_1_0= RULE_INT
            {
            lv_maxTries_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleQAContainerOptions265); 

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

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleQAContainerOptions282); 

                	newLeafNode(otherlv_2, grammarAccess.getQAContainerOptionsAccess().getTimesKeyword_2());
                
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:167:1: ( ( (lv_revealAnswer_3_0= 'reveal' ) ) otherlv_4= 'correct' otherlv_5= 'answer' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:167:2: ( (lv_revealAnswer_3_0= 'reveal' ) ) otherlv_4= 'correct' otherlv_5= 'answer'
                    {
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:167:2: ( (lv_revealAnswer_3_0= 'reveal' ) )
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:168:1: (lv_revealAnswer_3_0= 'reveal' )
                    {
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:168:1: (lv_revealAnswer_3_0= 'reveal' )
                    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:169:3: lv_revealAnswer_3_0= 'reveal'
                    {
                    lv_revealAnswer_3_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleQAContainerOptions301); 

                            newLeafNode(lv_revealAnswer_3_0, grammarAccess.getQAContainerOptionsAccess().getRevealAnswerRevealKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQAContainerOptionsRule());
                    	        }
                           		setWithLastConsumed(current, "revealAnswer", true, "reveal");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleQAContainerOptions326); 

                        	newLeafNode(otherlv_4, grammarAccess.getQAContainerOptionsAccess().getCorrectKeyword_3_1());
                        
                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleQAContainerOptions338); 

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


    // $ANTLR start "entryRuleEString"
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:198:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:199:2: (iv_ruleEString= ruleEString EOF )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:200:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString377);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString388); 

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
    // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:207:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:210:28: (this_STRING_0= RULE_STRING )
            // ../qa.xtext/src-gen/qa/xtext/parser/antlr/internal/InternalQa.g:211:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString427); 

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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleQATest_in_entryRuleQATest75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQATest85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleQATest122 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleEString_in_ruleQATest143 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_ruleQAContainerOptions_in_ruleQATest164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQAContainerOptions_in_entryRuleQAContainerOptions201 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQAContainerOptions211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleQAContainerOptions248 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleQAContainerOptions265 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleQAContainerOptions282 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleQAContainerOptions301 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleQAContainerOptions326 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleQAContainerOptions338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString377 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString427 = new BitSet(new long[]{0x0000000000000002L});
    }


}