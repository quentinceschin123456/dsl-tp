package ut2j.m1ice.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ut2j.m1ice.services.StateMachineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateMachineParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'StateMachine'", "'{'", "'}'", "'State'", "'Transition'", "'=>'", "'StartState'", "'EndState'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalStateMachineParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStateMachineParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStateMachineParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStateMachine.g"; }



     	private StateMachineGrammarAccess grammarAccess;

        public InternalStateMachineParser(TokenStream input, StateMachineGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "StateMachine";
       	}

       	@Override
       	protected StateMachineGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStateMachine"
    // InternalStateMachine.g:64:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // InternalStateMachine.g:64:53: (iv_ruleStateMachine= ruleStateMachine EOF )
            // InternalStateMachine.g:65:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
             newCompositeNode(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;

             current =iv_ruleStateMachine; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalStateMachine.g:71:1: ruleStateMachine returns [EObject current=null] : (otherlv_0= 'StateMachine' ( (lv_name_1_0= ruleEString ) ) ( (lv_state_2_0= ruleStartState ) ) ( (lv_state_3_0= ruleEndState ) ) otherlv_4= '{' ( ( (lv_state_5_0= ruleState ) ) | ( (lv_transition_6_0= ruleTransition ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_state_2_0 = null;

        EObject lv_state_3_0 = null;

        EObject lv_state_5_0 = null;

        EObject lv_transition_6_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:77:2: ( (otherlv_0= 'StateMachine' ( (lv_name_1_0= ruleEString ) ) ( (lv_state_2_0= ruleStartState ) ) ( (lv_state_3_0= ruleEndState ) ) otherlv_4= '{' ( ( (lv_state_5_0= ruleState ) ) | ( (lv_transition_6_0= ruleTransition ) ) )* otherlv_7= '}' ) )
            // InternalStateMachine.g:78:2: (otherlv_0= 'StateMachine' ( (lv_name_1_0= ruleEString ) ) ( (lv_state_2_0= ruleStartState ) ) ( (lv_state_3_0= ruleEndState ) ) otherlv_4= '{' ( ( (lv_state_5_0= ruleState ) ) | ( (lv_transition_6_0= ruleTransition ) ) )* otherlv_7= '}' )
            {
            // InternalStateMachine.g:78:2: (otherlv_0= 'StateMachine' ( (lv_name_1_0= ruleEString ) ) ( (lv_state_2_0= ruleStartState ) ) ( (lv_state_3_0= ruleEndState ) ) otherlv_4= '{' ( ( (lv_state_5_0= ruleState ) ) | ( (lv_transition_6_0= ruleTransition ) ) )* otherlv_7= '}' )
            // InternalStateMachine.g:79:3: otherlv_0= 'StateMachine' ( (lv_name_1_0= ruleEString ) ) ( (lv_state_2_0= ruleStartState ) ) ( (lv_state_3_0= ruleEndState ) ) otherlv_4= '{' ( ( (lv_state_5_0= ruleState ) ) | ( (lv_transition_6_0= ruleTransition ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStateMachineAccess().getStateMachineKeyword_0());
            		
            // InternalStateMachine.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalStateMachine.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalStateMachine.g:84:4: (lv_name_1_0= ruleEString )
            // InternalStateMachine.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"ut2j.m1ice.StateMachine.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStateMachine.g:102:3: ( (lv_state_2_0= ruleStartState ) )
            // InternalStateMachine.g:103:4: (lv_state_2_0= ruleStartState )
            {
            // InternalStateMachine.g:103:4: (lv_state_2_0= ruleStartState )
            // InternalStateMachine.g:104:5: lv_state_2_0= ruleStartState
            {

            					newCompositeNode(grammarAccess.getStateMachineAccess().getStateStartStateParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_state_2_0=ruleStartState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            					}
            					add(
            						current,
            						"state",
            						lv_state_2_0,
            						"ut2j.m1ice.StateMachine.StartState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStateMachine.g:121:3: ( (lv_state_3_0= ruleEndState ) )
            // InternalStateMachine.g:122:4: (lv_state_3_0= ruleEndState )
            {
            // InternalStateMachine.g:122:4: (lv_state_3_0= ruleEndState )
            // InternalStateMachine.g:123:5: lv_state_3_0= ruleEndState
            {

            					newCompositeNode(grammarAccess.getStateMachineAccess().getStateEndStateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_state_3_0=ruleEndState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            					}
            					add(
            						current,
            						"state",
            						lv_state_3_0,
            						"ut2j.m1ice.StateMachine.EndState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalStateMachine.g:144:3: ( ( (lv_state_5_0= ruleState ) ) | ( (lv_transition_6_0= ruleTransition ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }
                else if ( (LA1_0==15) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalStateMachine.g:145:4: ( (lv_state_5_0= ruleState ) )
            	    {
            	    // InternalStateMachine.g:145:4: ( (lv_state_5_0= ruleState ) )
            	    // InternalStateMachine.g:146:5: (lv_state_5_0= ruleState )
            	    {
            	    // InternalStateMachine.g:146:5: (lv_state_5_0= ruleState )
            	    // InternalStateMachine.g:147:6: lv_state_5_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getStateMachineAccess().getStateStateParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_state_5_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"state",
            	    							lv_state_5_0,
            	    							"ut2j.m1ice.StateMachine.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalStateMachine.g:165:4: ( (lv_transition_6_0= ruleTransition ) )
            	    {
            	    // InternalStateMachine.g:165:4: ( (lv_transition_6_0= ruleTransition ) )
            	    // InternalStateMachine.g:166:5: (lv_transition_6_0= ruleTransition )
            	    {
            	    // InternalStateMachine.g:166:5: (lv_transition_6_0= ruleTransition )
            	    // InternalStateMachine.g:167:6: lv_transition_6_0= ruleTransition
            	    {

            	    						newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionTransitionParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_transition_6_0=ruleTransition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transition",
            	    							lv_transition_6_0,
            	    							"ut2j.m1ice.StateMachine.Transition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleState"
    // InternalStateMachine.g:193:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalStateMachine.g:193:46: (iv_ruleState= ruleState EOF )
            // InternalStateMachine.g:194:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalStateMachine.g:200:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:206:2: ( (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalStateMachine.g:207:2: (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalStateMachine.g:207:2: (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) )
            // InternalStateMachine.g:208:3: otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalStateMachine.g:212:3: ( (lv_name_1_0= ruleEString ) )
            // InternalStateMachine.g:213:4: (lv_name_1_0= ruleEString )
            {
            // InternalStateMachine.g:213:4: (lv_name_1_0= ruleEString )
            // InternalStateMachine.g:214:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"ut2j.m1ice.StateMachine.EString");
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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalStateMachine.g:235:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalStateMachine.g:235:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalStateMachine.g:236:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalStateMachine.g:242:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '=>' ( ( ruleEString ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:248:2: ( (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '=>' ( ( ruleEString ) ) ) )
            // InternalStateMachine.g:249:2: (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '=>' ( ( ruleEString ) ) )
            {
            // InternalStateMachine.g:249:2: (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '=>' ( ( ruleEString ) ) )
            // InternalStateMachine.g:250:3: otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= '=>' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            // InternalStateMachine.g:254:3: ( (lv_name_1_0= ruleEString ) )
            // InternalStateMachine.g:255:4: (lv_name_1_0= ruleEString )
            {
            // InternalStateMachine.g:255:4: (lv_name_1_0= ruleEString )
            // InternalStateMachine.g:256:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"ut2j.m1ice.StateMachine.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStateMachine.g:273:3: ( ( ruleEString ) )
            // InternalStateMachine.g:274:4: ( ruleEString )
            {
            // InternalStateMachine.g:274:4: ( ruleEString )
            // InternalStateMachine.g:275:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getSourceStateCrossReference_2_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_3());
            		
            // InternalStateMachine.g:293:3: ( ( ruleEString ) )
            // InternalStateMachine.g:294:4: ( ruleEString )
            {
            // InternalStateMachine.g:294:4: ( ruleEString )
            // InternalStateMachine.g:295:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getTargetStateCrossReference_4_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleStartState"
    // InternalStateMachine.g:313:1: entryRuleStartState returns [EObject current=null] : iv_ruleStartState= ruleStartState EOF ;
    public final EObject entryRuleStartState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartState = null;


        try {
            // InternalStateMachine.g:313:51: (iv_ruleStartState= ruleStartState EOF )
            // InternalStateMachine.g:314:2: iv_ruleStartState= ruleStartState EOF
            {
             newCompositeNode(grammarAccess.getStartStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartState=ruleStartState();

            state._fsp--;

             current =iv_ruleStartState; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStartState"


    // $ANTLR start "ruleStartState"
    // InternalStateMachine.g:320:1: ruleStartState returns [EObject current=null] : ( () otherlv_1= 'StartState' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleStartState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:326:2: ( ( () otherlv_1= 'StartState' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalStateMachine.g:327:2: ( () otherlv_1= 'StartState' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalStateMachine.g:327:2: ( () otherlv_1= 'StartState' ( (lv_name_2_0= ruleEString ) ) )
            // InternalStateMachine.g:328:3: () otherlv_1= 'StartState' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalStateMachine.g:328:3: ()
            // InternalStateMachine.g:329:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStartStateAccess().getStartStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStartStateAccess().getStartStateKeyword_1());
            		
            // InternalStateMachine.g:339:3: ( (lv_name_2_0= ruleEString ) )
            // InternalStateMachine.g:340:4: (lv_name_2_0= ruleEString )
            {
            // InternalStateMachine.g:340:4: (lv_name_2_0= ruleEString )
            // InternalStateMachine.g:341:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStartStateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStartStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ut2j.m1ice.StateMachine.EString");
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
    // $ANTLR end "ruleStartState"


    // $ANTLR start "entryRuleEndState"
    // InternalStateMachine.g:362:1: entryRuleEndState returns [EObject current=null] : iv_ruleEndState= ruleEndState EOF ;
    public final EObject entryRuleEndState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndState = null;


        try {
            // InternalStateMachine.g:362:49: (iv_ruleEndState= ruleEndState EOF )
            // InternalStateMachine.g:363:2: iv_ruleEndState= ruleEndState EOF
            {
             newCompositeNode(grammarAccess.getEndStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndState=ruleEndState();

            state._fsp--;

             current =iv_ruleEndState; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEndState"


    // $ANTLR start "ruleEndState"
    // InternalStateMachine.g:369:1: ruleEndState returns [EObject current=null] : ( () otherlv_1= 'EndState' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleEndState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalStateMachine.g:375:2: ( ( () otherlv_1= 'EndState' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalStateMachine.g:376:2: ( () otherlv_1= 'EndState' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalStateMachine.g:376:2: ( () otherlv_1= 'EndState' ( (lv_name_2_0= ruleEString ) ) )
            // InternalStateMachine.g:377:3: () otherlv_1= 'EndState' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalStateMachine.g:377:3: ()
            // InternalStateMachine.g:378:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEndStateAccess().getEndStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEndStateAccess().getEndStateKeyword_1());
            		
            // InternalStateMachine.g:388:3: ( (lv_name_2_0= ruleEString ) )
            // InternalStateMachine.g:389:4: (lv_name_2_0= ruleEString )
            {
            // InternalStateMachine.g:389:4: (lv_name_2_0= ruleEString )
            // InternalStateMachine.g:390:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEndStateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ut2j.m1ice.StateMachine.EString");
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
    // $ANTLR end "ruleEndState"


    // $ANTLR start "entryRuleEString"
    // InternalStateMachine.g:411:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalStateMachine.g:411:47: (iv_ruleEString= ruleEString EOF )
            // InternalStateMachine.g:412:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalStateMachine.g:418:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalStateMachine.g:424:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalStateMachine.g:425:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalStateMachine.g:425:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalStateMachine.g:426:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:434:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});

}