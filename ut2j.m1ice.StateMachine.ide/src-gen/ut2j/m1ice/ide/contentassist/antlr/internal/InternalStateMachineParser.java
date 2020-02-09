package ut2j.m1ice.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import ut2j.m1ice.services.StateMachineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateMachineParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(StateMachineGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleStateMachine"
    // InternalStateMachine.g:53:1: entryRuleStateMachine : ruleStateMachine EOF ;
    public final void entryRuleStateMachine() throws RecognitionException {
        try {
            // InternalStateMachine.g:54:1: ( ruleStateMachine EOF )
            // InternalStateMachine.g:55:1: ruleStateMachine EOF
            {
             before(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_1);
            ruleStateMachine();

            state._fsp--;

             after(grammarAccess.getStateMachineRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalStateMachine.g:62:1: ruleStateMachine : ( ( rule__StateMachine__Group__0 ) ) ;
    public final void ruleStateMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:66:2: ( ( ( rule__StateMachine__Group__0 ) ) )
            // InternalStateMachine.g:67:2: ( ( rule__StateMachine__Group__0 ) )
            {
            // InternalStateMachine.g:67:2: ( ( rule__StateMachine__Group__0 ) )
            // InternalStateMachine.g:68:3: ( rule__StateMachine__Group__0 )
            {
             before(grammarAccess.getStateMachineAccess().getGroup()); 
            // InternalStateMachine.g:69:3: ( rule__StateMachine__Group__0 )
            // InternalStateMachine.g:69:4: rule__StateMachine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getGroup()); 

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
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleState"
    // InternalStateMachine.g:78:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalStateMachine.g:79:1: ( ruleState EOF )
            // InternalStateMachine.g:80:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalStateMachine.g:87:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:91:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalStateMachine.g:92:2: ( ( rule__State__Group__0 ) )
            {
            // InternalStateMachine.g:92:2: ( ( rule__State__Group__0 ) )
            // InternalStateMachine.g:93:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalStateMachine.g:94:3: ( rule__State__Group__0 )
            // InternalStateMachine.g:94:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalStateMachine.g:103:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalStateMachine.g:104:1: ( ruleTransition EOF )
            // InternalStateMachine.g:105:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalStateMachine.g:112:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:116:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalStateMachine.g:117:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalStateMachine.g:117:2: ( ( rule__Transition__Group__0 ) )
            // InternalStateMachine.g:118:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalStateMachine.g:119:3: ( rule__Transition__Group__0 )
            // InternalStateMachine.g:119:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleStartState"
    // InternalStateMachine.g:128:1: entryRuleStartState : ruleStartState EOF ;
    public final void entryRuleStartState() throws RecognitionException {
        try {
            // InternalStateMachine.g:129:1: ( ruleStartState EOF )
            // InternalStateMachine.g:130:1: ruleStartState EOF
            {
             before(grammarAccess.getStartStateRule()); 
            pushFollow(FOLLOW_1);
            ruleStartState();

            state._fsp--;

             after(grammarAccess.getStartStateRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStartState"


    // $ANTLR start "ruleStartState"
    // InternalStateMachine.g:137:1: ruleStartState : ( ( rule__StartState__Group__0 ) ) ;
    public final void ruleStartState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:141:2: ( ( ( rule__StartState__Group__0 ) ) )
            // InternalStateMachine.g:142:2: ( ( rule__StartState__Group__0 ) )
            {
            // InternalStateMachine.g:142:2: ( ( rule__StartState__Group__0 ) )
            // InternalStateMachine.g:143:3: ( rule__StartState__Group__0 )
            {
             before(grammarAccess.getStartStateAccess().getGroup()); 
            // InternalStateMachine.g:144:3: ( rule__StartState__Group__0 )
            // InternalStateMachine.g:144:4: rule__StartState__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StartState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStartStateAccess().getGroup()); 

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
    // $ANTLR end "ruleStartState"


    // $ANTLR start "entryRuleEndState"
    // InternalStateMachine.g:153:1: entryRuleEndState : ruleEndState EOF ;
    public final void entryRuleEndState() throws RecognitionException {
        try {
            // InternalStateMachine.g:154:1: ( ruleEndState EOF )
            // InternalStateMachine.g:155:1: ruleEndState EOF
            {
             before(grammarAccess.getEndStateRule()); 
            pushFollow(FOLLOW_1);
            ruleEndState();

            state._fsp--;

             after(grammarAccess.getEndStateRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEndState"


    // $ANTLR start "ruleEndState"
    // InternalStateMachine.g:162:1: ruleEndState : ( ( rule__EndState__Group__0 ) ) ;
    public final void ruleEndState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:166:2: ( ( ( rule__EndState__Group__0 ) ) )
            // InternalStateMachine.g:167:2: ( ( rule__EndState__Group__0 ) )
            {
            // InternalStateMachine.g:167:2: ( ( rule__EndState__Group__0 ) )
            // InternalStateMachine.g:168:3: ( rule__EndState__Group__0 )
            {
             before(grammarAccess.getEndStateAccess().getGroup()); 
            // InternalStateMachine.g:169:3: ( rule__EndState__Group__0 )
            // InternalStateMachine.g:169:4: rule__EndState__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EndState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEndStateAccess().getGroup()); 

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
    // $ANTLR end "ruleEndState"


    // $ANTLR start "entryRuleEString"
    // InternalStateMachine.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalStateMachine.g:179:1: ( ruleEString EOF )
            // InternalStateMachine.g:180:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalStateMachine.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalStateMachine.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalStateMachine.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalStateMachine.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalStateMachine.g:194:3: ( rule__EString__Alternatives )
            // InternalStateMachine.g:194:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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


    // $ANTLR start "rule__StateMachine__Alternatives_5"
    // InternalStateMachine.g:202:1: rule__StateMachine__Alternatives_5 : ( ( ( rule__StateMachine__StateAssignment_5_0 ) ) | ( ( rule__StateMachine__TransitionAssignment_5_1 ) ) );
    public final void rule__StateMachine__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:206:1: ( ( ( rule__StateMachine__StateAssignment_5_0 ) ) | ( ( rule__StateMachine__TransitionAssignment_5_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalStateMachine.g:207:2: ( ( rule__StateMachine__StateAssignment_5_0 ) )
                    {
                    // InternalStateMachine.g:207:2: ( ( rule__StateMachine__StateAssignment_5_0 ) )
                    // InternalStateMachine.g:208:3: ( rule__StateMachine__StateAssignment_5_0 )
                    {
                     before(grammarAccess.getStateMachineAccess().getStateAssignment_5_0()); 
                    // InternalStateMachine.g:209:3: ( rule__StateMachine__StateAssignment_5_0 )
                    // InternalStateMachine.g:209:4: rule__StateMachine__StateAssignment_5_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StateMachine__StateAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStateMachineAccess().getStateAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:213:2: ( ( rule__StateMachine__TransitionAssignment_5_1 ) )
                    {
                    // InternalStateMachine.g:213:2: ( ( rule__StateMachine__TransitionAssignment_5_1 ) )
                    // InternalStateMachine.g:214:3: ( rule__StateMachine__TransitionAssignment_5_1 )
                    {
                     before(grammarAccess.getStateMachineAccess().getTransitionAssignment_5_1()); 
                    // InternalStateMachine.g:215:3: ( rule__StateMachine__TransitionAssignment_5_1 )
                    // InternalStateMachine.g:215:4: rule__StateMachine__TransitionAssignment_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__StateMachine__TransitionAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStateMachineAccess().getTransitionAssignment_5_1()); 

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
    // $ANTLR end "rule__StateMachine__Alternatives_5"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalStateMachine.g:223:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:227:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalStateMachine.g:228:2: ( RULE_STRING )
                    {
                    // InternalStateMachine.g:228:2: ( RULE_STRING )
                    // InternalStateMachine.g:229:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:234:2: ( RULE_ID )
                    {
                    // InternalStateMachine.g:234:2: ( RULE_ID )
                    // InternalStateMachine.g:235:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__StateMachine__Group__0"
    // InternalStateMachine.g:244:1: rule__StateMachine__Group__0 : rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 ;
    public final void rule__StateMachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:248:1: ( rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 )
            // InternalStateMachine.g:249:2: rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__StateMachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__1();

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
    // $ANTLR end "rule__StateMachine__Group__0"


    // $ANTLR start "rule__StateMachine__Group__0__Impl"
    // InternalStateMachine.g:256:1: rule__StateMachine__Group__0__Impl : ( 'StateMachine' ) ;
    public final void rule__StateMachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:260:1: ( ( 'StateMachine' ) )
            // InternalStateMachine.g:261:1: ( 'StateMachine' )
            {
            // InternalStateMachine.g:261:1: ( 'StateMachine' )
            // InternalStateMachine.g:262:2: 'StateMachine'
            {
             before(grammarAccess.getStateMachineAccess().getStateMachineKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getStateMachineKeyword_0()); 

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
    // $ANTLR end "rule__StateMachine__Group__0__Impl"


    // $ANTLR start "rule__StateMachine__Group__1"
    // InternalStateMachine.g:271:1: rule__StateMachine__Group__1 : rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 ;
    public final void rule__StateMachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:275:1: ( rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 )
            // InternalStateMachine.g:276:2: rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__StateMachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__2();

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
    // $ANTLR end "rule__StateMachine__Group__1"


    // $ANTLR start "rule__StateMachine__Group__1__Impl"
    // InternalStateMachine.g:283:1: rule__StateMachine__Group__1__Impl : ( ( rule__StateMachine__NameAssignment_1 ) ) ;
    public final void rule__StateMachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:287:1: ( ( ( rule__StateMachine__NameAssignment_1 ) ) )
            // InternalStateMachine.g:288:1: ( ( rule__StateMachine__NameAssignment_1 ) )
            {
            // InternalStateMachine.g:288:1: ( ( rule__StateMachine__NameAssignment_1 ) )
            // InternalStateMachine.g:289:2: ( rule__StateMachine__NameAssignment_1 )
            {
             before(grammarAccess.getStateMachineAccess().getNameAssignment_1()); 
            // InternalStateMachine.g:290:2: ( rule__StateMachine__NameAssignment_1 )
            // InternalStateMachine.g:290:3: rule__StateMachine__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__StateMachine__Group__1__Impl"


    // $ANTLR start "rule__StateMachine__Group__2"
    // InternalStateMachine.g:298:1: rule__StateMachine__Group__2 : rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 ;
    public final void rule__StateMachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:302:1: ( rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 )
            // InternalStateMachine.g:303:2: rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__StateMachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__3();

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
    // $ANTLR end "rule__StateMachine__Group__2"


    // $ANTLR start "rule__StateMachine__Group__2__Impl"
    // InternalStateMachine.g:310:1: rule__StateMachine__Group__2__Impl : ( ( rule__StateMachine__StateAssignment_2 ) ) ;
    public final void rule__StateMachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:314:1: ( ( ( rule__StateMachine__StateAssignment_2 ) ) )
            // InternalStateMachine.g:315:1: ( ( rule__StateMachine__StateAssignment_2 ) )
            {
            // InternalStateMachine.g:315:1: ( ( rule__StateMachine__StateAssignment_2 ) )
            // InternalStateMachine.g:316:2: ( rule__StateMachine__StateAssignment_2 )
            {
             before(grammarAccess.getStateMachineAccess().getStateAssignment_2()); 
            // InternalStateMachine.g:317:2: ( rule__StateMachine__StateAssignment_2 )
            // InternalStateMachine.g:317:3: rule__StateMachine__StateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__StateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getStateAssignment_2()); 

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
    // $ANTLR end "rule__StateMachine__Group__2__Impl"


    // $ANTLR start "rule__StateMachine__Group__3"
    // InternalStateMachine.g:325:1: rule__StateMachine__Group__3 : rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 ;
    public final void rule__StateMachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:329:1: ( rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 )
            // InternalStateMachine.g:330:2: rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__StateMachine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__4();

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
    // $ANTLR end "rule__StateMachine__Group__3"


    // $ANTLR start "rule__StateMachine__Group__3__Impl"
    // InternalStateMachine.g:337:1: rule__StateMachine__Group__3__Impl : ( ( rule__StateMachine__StateAssignment_3 ) ) ;
    public final void rule__StateMachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:341:1: ( ( ( rule__StateMachine__StateAssignment_3 ) ) )
            // InternalStateMachine.g:342:1: ( ( rule__StateMachine__StateAssignment_3 ) )
            {
            // InternalStateMachine.g:342:1: ( ( rule__StateMachine__StateAssignment_3 ) )
            // InternalStateMachine.g:343:2: ( rule__StateMachine__StateAssignment_3 )
            {
             before(grammarAccess.getStateMachineAccess().getStateAssignment_3()); 
            // InternalStateMachine.g:344:2: ( rule__StateMachine__StateAssignment_3 )
            // InternalStateMachine.g:344:3: rule__StateMachine__StateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__StateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getStateAssignment_3()); 

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
    // $ANTLR end "rule__StateMachine__Group__3__Impl"


    // $ANTLR start "rule__StateMachine__Group__4"
    // InternalStateMachine.g:352:1: rule__StateMachine__Group__4 : rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5 ;
    public final void rule__StateMachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:356:1: ( rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5 )
            // InternalStateMachine.g:357:2: rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__StateMachine__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__5();

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
    // $ANTLR end "rule__StateMachine__Group__4"


    // $ANTLR start "rule__StateMachine__Group__4__Impl"
    // InternalStateMachine.g:364:1: rule__StateMachine__Group__4__Impl : ( '{' ) ;
    public final void rule__StateMachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:368:1: ( ( '{' ) )
            // InternalStateMachine.g:369:1: ( '{' )
            {
            // InternalStateMachine.g:369:1: ( '{' )
            // InternalStateMachine.g:370:2: '{'
            {
             before(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__StateMachine__Group__4__Impl"


    // $ANTLR start "rule__StateMachine__Group__5"
    // InternalStateMachine.g:379:1: rule__StateMachine__Group__5 : rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6 ;
    public final void rule__StateMachine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:383:1: ( rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6 )
            // InternalStateMachine.g:384:2: rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__StateMachine__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__6();

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
    // $ANTLR end "rule__StateMachine__Group__5"


    // $ANTLR start "rule__StateMachine__Group__5__Impl"
    // InternalStateMachine.g:391:1: rule__StateMachine__Group__5__Impl : ( ( rule__StateMachine__Alternatives_5 )* ) ;
    public final void rule__StateMachine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:395:1: ( ( ( rule__StateMachine__Alternatives_5 )* ) )
            // InternalStateMachine.g:396:1: ( ( rule__StateMachine__Alternatives_5 )* )
            {
            // InternalStateMachine.g:396:1: ( ( rule__StateMachine__Alternatives_5 )* )
            // InternalStateMachine.g:397:2: ( rule__StateMachine__Alternatives_5 )*
            {
             before(grammarAccess.getStateMachineAccess().getAlternatives_5()); 
            // InternalStateMachine.g:398:2: ( rule__StateMachine__Alternatives_5 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=14 && LA3_0<=15)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalStateMachine.g:398:3: rule__StateMachine__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__StateMachine__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getAlternatives_5()); 

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
    // $ANTLR end "rule__StateMachine__Group__5__Impl"


    // $ANTLR start "rule__StateMachine__Group__6"
    // InternalStateMachine.g:406:1: rule__StateMachine__Group__6 : rule__StateMachine__Group__6__Impl ;
    public final void rule__StateMachine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:410:1: ( rule__StateMachine__Group__6__Impl )
            // InternalStateMachine.g:411:2: rule__StateMachine__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__6__Impl();

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
    // $ANTLR end "rule__StateMachine__Group__6"


    // $ANTLR start "rule__StateMachine__Group__6__Impl"
    // InternalStateMachine.g:417:1: rule__StateMachine__Group__6__Impl : ( '}' ) ;
    public final void rule__StateMachine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:421:1: ( ( '}' ) )
            // InternalStateMachine.g:422:1: ( '}' )
            {
            // InternalStateMachine.g:422:1: ( '}' )
            // InternalStateMachine.g:423:2: '}'
            {
             before(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__StateMachine__Group__6__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalStateMachine.g:433:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:437:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalStateMachine.g:438:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

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
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalStateMachine.g:445:1: rule__State__Group__0__Impl : ( 'State' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:449:1: ( ( 'State' ) )
            // InternalStateMachine.g:450:1: ( 'State' )
            {
            // InternalStateMachine.g:450:1: ( 'State' )
            // InternalStateMachine.g:451:2: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

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
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalStateMachine.g:460:1: rule__State__Group__1 : rule__State__Group__1__Impl ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:464:1: ( rule__State__Group__1__Impl )
            // InternalStateMachine.g:465:2: rule__State__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__1__Impl();

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
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalStateMachine.g:471:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:475:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalStateMachine.g:476:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalStateMachine.g:476:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalStateMachine.g:477:2: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // InternalStateMachine.g:478:2: ( rule__State__NameAssignment_1 )
            // InternalStateMachine.g:478:3: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalStateMachine.g:487:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:491:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalStateMachine.g:492:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

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
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalStateMachine.g:499:1: rule__Transition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:503:1: ( ( 'Transition' ) )
            // InternalStateMachine.g:504:1: ( 'Transition' )
            {
            // InternalStateMachine.g:504:1: ( 'Transition' )
            // InternalStateMachine.g:505:2: 'Transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 

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
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalStateMachine.g:514:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:518:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalStateMachine.g:519:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

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
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalStateMachine.g:526:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__NameAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:530:1: ( ( ( rule__Transition__NameAssignment_1 ) ) )
            // InternalStateMachine.g:531:1: ( ( rule__Transition__NameAssignment_1 ) )
            {
            // InternalStateMachine.g:531:1: ( ( rule__Transition__NameAssignment_1 ) )
            // InternalStateMachine.g:532:2: ( rule__Transition__NameAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getNameAssignment_1()); 
            // InternalStateMachine.g:533:2: ( rule__Transition__NameAssignment_1 )
            // InternalStateMachine.g:533:3: rule__Transition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalStateMachine.g:541:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:545:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalStateMachine.g:546:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__3();

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
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalStateMachine.g:553:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__SourceAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:557:1: ( ( ( rule__Transition__SourceAssignment_2 ) ) )
            // InternalStateMachine.g:558:1: ( ( rule__Transition__SourceAssignment_2 ) )
            {
            // InternalStateMachine.g:558:1: ( ( rule__Transition__SourceAssignment_2 ) )
            // InternalStateMachine.g:559:2: ( rule__Transition__SourceAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_2()); 
            // InternalStateMachine.g:560:2: ( rule__Transition__SourceAssignment_2 )
            // InternalStateMachine.g:560:3: rule__Transition__SourceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__SourceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getSourceAssignment_2()); 

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
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalStateMachine.g:568:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:572:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalStateMachine.g:573:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__4();

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
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalStateMachine.g:580:1: rule__Transition__Group__3__Impl : ( '=>' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:584:1: ( ( '=>' ) )
            // InternalStateMachine.g:585:1: ( '=>' )
            {
            // InternalStateMachine.g:585:1: ( '=>' )
            // InternalStateMachine.g:586:2: '=>'
            {
             before(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // InternalStateMachine.g:595:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:599:1: ( rule__Transition__Group__4__Impl )
            // InternalStateMachine.g:600:2: rule__Transition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__4__Impl();

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
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // InternalStateMachine.g:606:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__TargetAssignment_4 ) ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:610:1: ( ( ( rule__Transition__TargetAssignment_4 ) ) )
            // InternalStateMachine.g:611:1: ( ( rule__Transition__TargetAssignment_4 ) )
            {
            // InternalStateMachine.g:611:1: ( ( rule__Transition__TargetAssignment_4 ) )
            // InternalStateMachine.g:612:2: ( rule__Transition__TargetAssignment_4 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_4()); 
            // InternalStateMachine.g:613:2: ( rule__Transition__TargetAssignment_4 )
            // InternalStateMachine.g:613:3: rule__Transition__TargetAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Transition__TargetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTargetAssignment_4()); 

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
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__StartState__Group__0"
    // InternalStateMachine.g:622:1: rule__StartState__Group__0 : rule__StartState__Group__0__Impl rule__StartState__Group__1 ;
    public final void rule__StartState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:626:1: ( rule__StartState__Group__0__Impl rule__StartState__Group__1 )
            // InternalStateMachine.g:627:2: rule__StartState__Group__0__Impl rule__StartState__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__StartState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartState__Group__1();

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
    // $ANTLR end "rule__StartState__Group__0"


    // $ANTLR start "rule__StartState__Group__0__Impl"
    // InternalStateMachine.g:634:1: rule__StartState__Group__0__Impl : ( () ) ;
    public final void rule__StartState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:638:1: ( ( () ) )
            // InternalStateMachine.g:639:1: ( () )
            {
            // InternalStateMachine.g:639:1: ( () )
            // InternalStateMachine.g:640:2: ()
            {
             before(grammarAccess.getStartStateAccess().getStartStateAction_0()); 
            // InternalStateMachine.g:641:2: ()
            // InternalStateMachine.g:641:3: 
            {
            }

             after(grammarAccess.getStartStateAccess().getStartStateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartState__Group__0__Impl"


    // $ANTLR start "rule__StartState__Group__1"
    // InternalStateMachine.g:649:1: rule__StartState__Group__1 : rule__StartState__Group__1__Impl rule__StartState__Group__2 ;
    public final void rule__StartState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:653:1: ( rule__StartState__Group__1__Impl rule__StartState__Group__2 )
            // InternalStateMachine.g:654:2: rule__StartState__Group__1__Impl rule__StartState__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__StartState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartState__Group__2();

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
    // $ANTLR end "rule__StartState__Group__1"


    // $ANTLR start "rule__StartState__Group__1__Impl"
    // InternalStateMachine.g:661:1: rule__StartState__Group__1__Impl : ( 'StartState' ) ;
    public final void rule__StartState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:665:1: ( ( 'StartState' ) )
            // InternalStateMachine.g:666:1: ( 'StartState' )
            {
            // InternalStateMachine.g:666:1: ( 'StartState' )
            // InternalStateMachine.g:667:2: 'StartState'
            {
             before(grammarAccess.getStartStateAccess().getStartStateKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStartStateAccess().getStartStateKeyword_1()); 

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
    // $ANTLR end "rule__StartState__Group__1__Impl"


    // $ANTLR start "rule__StartState__Group__2"
    // InternalStateMachine.g:676:1: rule__StartState__Group__2 : rule__StartState__Group__2__Impl ;
    public final void rule__StartState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:680:1: ( rule__StartState__Group__2__Impl )
            // InternalStateMachine.g:681:2: rule__StartState__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartState__Group__2__Impl();

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
    // $ANTLR end "rule__StartState__Group__2"


    // $ANTLR start "rule__StartState__Group__2__Impl"
    // InternalStateMachine.g:687:1: rule__StartState__Group__2__Impl : ( ( rule__StartState__NameAssignment_2 ) ) ;
    public final void rule__StartState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:691:1: ( ( ( rule__StartState__NameAssignment_2 ) ) )
            // InternalStateMachine.g:692:1: ( ( rule__StartState__NameAssignment_2 ) )
            {
            // InternalStateMachine.g:692:1: ( ( rule__StartState__NameAssignment_2 ) )
            // InternalStateMachine.g:693:2: ( rule__StartState__NameAssignment_2 )
            {
             before(grammarAccess.getStartStateAccess().getNameAssignment_2()); 
            // InternalStateMachine.g:694:2: ( rule__StartState__NameAssignment_2 )
            // InternalStateMachine.g:694:3: rule__StartState__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StartState__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStartStateAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__StartState__Group__2__Impl"


    // $ANTLR start "rule__EndState__Group__0"
    // InternalStateMachine.g:703:1: rule__EndState__Group__0 : rule__EndState__Group__0__Impl rule__EndState__Group__1 ;
    public final void rule__EndState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:707:1: ( rule__EndState__Group__0__Impl rule__EndState__Group__1 )
            // InternalStateMachine.g:708:2: rule__EndState__Group__0__Impl rule__EndState__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EndState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndState__Group__1();

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
    // $ANTLR end "rule__EndState__Group__0"


    // $ANTLR start "rule__EndState__Group__0__Impl"
    // InternalStateMachine.g:715:1: rule__EndState__Group__0__Impl : ( () ) ;
    public final void rule__EndState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:719:1: ( ( () ) )
            // InternalStateMachine.g:720:1: ( () )
            {
            // InternalStateMachine.g:720:1: ( () )
            // InternalStateMachine.g:721:2: ()
            {
             before(grammarAccess.getEndStateAccess().getEndStateAction_0()); 
            // InternalStateMachine.g:722:2: ()
            // InternalStateMachine.g:722:3: 
            {
            }

             after(grammarAccess.getEndStateAccess().getEndStateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndState__Group__0__Impl"


    // $ANTLR start "rule__EndState__Group__1"
    // InternalStateMachine.g:730:1: rule__EndState__Group__1 : rule__EndState__Group__1__Impl rule__EndState__Group__2 ;
    public final void rule__EndState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:734:1: ( rule__EndState__Group__1__Impl rule__EndState__Group__2 )
            // InternalStateMachine.g:735:2: rule__EndState__Group__1__Impl rule__EndState__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__EndState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndState__Group__2();

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
    // $ANTLR end "rule__EndState__Group__1"


    // $ANTLR start "rule__EndState__Group__1__Impl"
    // InternalStateMachine.g:742:1: rule__EndState__Group__1__Impl : ( 'EndState' ) ;
    public final void rule__EndState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:746:1: ( ( 'EndState' ) )
            // InternalStateMachine.g:747:1: ( 'EndState' )
            {
            // InternalStateMachine.g:747:1: ( 'EndState' )
            // InternalStateMachine.g:748:2: 'EndState'
            {
             before(grammarAccess.getEndStateAccess().getEndStateKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEndStateAccess().getEndStateKeyword_1()); 

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
    // $ANTLR end "rule__EndState__Group__1__Impl"


    // $ANTLR start "rule__EndState__Group__2"
    // InternalStateMachine.g:757:1: rule__EndState__Group__2 : rule__EndState__Group__2__Impl ;
    public final void rule__EndState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:761:1: ( rule__EndState__Group__2__Impl )
            // InternalStateMachine.g:762:2: rule__EndState__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EndState__Group__2__Impl();

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
    // $ANTLR end "rule__EndState__Group__2"


    // $ANTLR start "rule__EndState__Group__2__Impl"
    // InternalStateMachine.g:768:1: rule__EndState__Group__2__Impl : ( ( rule__EndState__NameAssignment_2 ) ) ;
    public final void rule__EndState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:772:1: ( ( ( rule__EndState__NameAssignment_2 ) ) )
            // InternalStateMachine.g:773:1: ( ( rule__EndState__NameAssignment_2 ) )
            {
            // InternalStateMachine.g:773:1: ( ( rule__EndState__NameAssignment_2 ) )
            // InternalStateMachine.g:774:2: ( rule__EndState__NameAssignment_2 )
            {
             before(grammarAccess.getEndStateAccess().getNameAssignment_2()); 
            // InternalStateMachine.g:775:2: ( rule__EndState__NameAssignment_2 )
            // InternalStateMachine.g:775:3: rule__EndState__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EndState__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEndStateAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__EndState__Group__2__Impl"


    // $ANTLR start "rule__StateMachine__NameAssignment_1"
    // InternalStateMachine.g:784:1: rule__StateMachine__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__StateMachine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:788:1: ( ( ruleEString ) )
            // InternalStateMachine.g:789:2: ( ruleEString )
            {
            // InternalStateMachine.g:789:2: ( ruleEString )
            // InternalStateMachine.g:790:3: ruleEString
            {
             before(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__StateMachine__NameAssignment_1"


    // $ANTLR start "rule__StateMachine__StateAssignment_2"
    // InternalStateMachine.g:799:1: rule__StateMachine__StateAssignment_2 : ( ruleStartState ) ;
    public final void rule__StateMachine__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:803:1: ( ( ruleStartState ) )
            // InternalStateMachine.g:804:2: ( ruleStartState )
            {
            // InternalStateMachine.g:804:2: ( ruleStartState )
            // InternalStateMachine.g:805:3: ruleStartState
            {
             before(grammarAccess.getStateMachineAccess().getStateStartStateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStartState();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getStateStartStateParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__StateMachine__StateAssignment_2"


    // $ANTLR start "rule__StateMachine__StateAssignment_3"
    // InternalStateMachine.g:814:1: rule__StateMachine__StateAssignment_3 : ( ruleEndState ) ;
    public final void rule__StateMachine__StateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:818:1: ( ( ruleEndState ) )
            // InternalStateMachine.g:819:2: ( ruleEndState )
            {
            // InternalStateMachine.g:819:2: ( ruleEndState )
            // InternalStateMachine.g:820:3: ruleEndState
            {
             before(grammarAccess.getStateMachineAccess().getStateEndStateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEndState();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getStateEndStateParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__StateMachine__StateAssignment_3"


    // $ANTLR start "rule__StateMachine__StateAssignment_5_0"
    // InternalStateMachine.g:829:1: rule__StateMachine__StateAssignment_5_0 : ( ruleState ) ;
    public final void rule__StateMachine__StateAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:833:1: ( ( ruleState ) )
            // InternalStateMachine.g:834:2: ( ruleState )
            {
            // InternalStateMachine.g:834:2: ( ruleState )
            // InternalStateMachine.g:835:3: ruleState
            {
             before(grammarAccess.getStateMachineAccess().getStateStateParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getStateStateParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__StateMachine__StateAssignment_5_0"


    // $ANTLR start "rule__StateMachine__TransitionAssignment_5_1"
    // InternalStateMachine.g:844:1: rule__StateMachine__TransitionAssignment_5_1 : ( ruleTransition ) ;
    public final void rule__StateMachine__TransitionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:848:1: ( ( ruleTransition ) )
            // InternalStateMachine.g:849:2: ( ruleTransition )
            {
            // InternalStateMachine.g:849:2: ( ruleTransition )
            // InternalStateMachine.g:850:3: ruleTransition
            {
             before(grammarAccess.getStateMachineAccess().getTransitionTransitionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getTransitionTransitionParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__StateMachine__TransitionAssignment_5_1"


    // $ANTLR start "rule__State__NameAssignment_1"
    // InternalStateMachine.g:859:1: rule__State__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:863:1: ( ( ruleEString ) )
            // InternalStateMachine.g:864:2: ( ruleEString )
            {
            // InternalStateMachine.g:864:2: ( ruleEString )
            // InternalStateMachine.g:865:3: ruleEString
            {
             before(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__State__NameAssignment_1"


    // $ANTLR start "rule__Transition__NameAssignment_1"
    // InternalStateMachine.g:874:1: rule__Transition__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Transition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:878:1: ( ( ruleEString ) )
            // InternalStateMachine.g:879:2: ( ruleEString )
            {
            // InternalStateMachine.g:879:2: ( ruleEString )
            // InternalStateMachine.g:880:3: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Transition__NameAssignment_1"


    // $ANTLR start "rule__Transition__SourceAssignment_2"
    // InternalStateMachine.g:889:1: rule__Transition__SourceAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Transition__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:893:1: ( ( ( ruleEString ) ) )
            // InternalStateMachine.g:894:2: ( ( ruleEString ) )
            {
            // InternalStateMachine.g:894:2: ( ( ruleEString ) )
            // InternalStateMachine.g:895:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getSourceStateCrossReference_2_0()); 
            // InternalStateMachine.g:896:3: ( ruleEString )
            // InternalStateMachine.g:897:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getSourceStateEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getSourceStateEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getSourceStateCrossReference_2_0()); 

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
    // $ANTLR end "rule__Transition__SourceAssignment_2"


    // $ANTLR start "rule__Transition__TargetAssignment_4"
    // InternalStateMachine.g:908:1: rule__Transition__TargetAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Transition__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:912:1: ( ( ( ruleEString ) ) )
            // InternalStateMachine.g:913:2: ( ( ruleEString ) )
            {
            // InternalStateMachine.g:913:2: ( ( ruleEString ) )
            // InternalStateMachine.g:914:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_4_0()); 
            // InternalStateMachine.g:915:3: ( ruleEString )
            // InternalStateMachine.g:916:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getTargetStateEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getTargetStateEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getTargetStateCrossReference_4_0()); 

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
    // $ANTLR end "rule__Transition__TargetAssignment_4"


    // $ANTLR start "rule__StartState__NameAssignment_2"
    // InternalStateMachine.g:927:1: rule__StartState__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__StartState__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:931:1: ( ( ruleEString ) )
            // InternalStateMachine.g:932:2: ( ruleEString )
            {
            // InternalStateMachine.g:932:2: ( ruleEString )
            // InternalStateMachine.g:933:3: ruleEString
            {
             before(grammarAccess.getStartStateAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStartStateAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__StartState__NameAssignment_2"


    // $ANTLR start "rule__EndState__NameAssignment_2"
    // InternalStateMachine.g:942:1: rule__EndState__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__EndState__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:946:1: ( ( ruleEString ) )
            // InternalStateMachine.g:947:2: ( ruleEString )
            {
            // InternalStateMachine.g:947:2: ( ruleEString )
            // InternalStateMachine.g:948:3: ruleEString
            {
             before(grammarAccess.getEndStateAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEndStateAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__EndState__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});

}