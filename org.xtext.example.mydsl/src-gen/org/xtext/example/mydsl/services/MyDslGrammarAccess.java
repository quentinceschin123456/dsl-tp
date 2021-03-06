/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStateAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cStateKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cTransitionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cTransitionAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cTransitionTransitionCrossReference_4_1_0 = (CrossReference)cTransitionAssignment_4_1.eContents().get(0);
		private final RuleCall cTransitionTransitionEStringParserRuleCall_4_1_0_1 = (RuleCall)cTransitionTransitionCrossReference_4_1_0.eContents().get(1);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cTransitionKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cTransitionAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cTransitionTransitionCrossReference_5_1_0 = (CrossReference)cTransitionAssignment_5_1.eContents().get(0);
		private final RuleCall cTransitionTransitionEStringParserRuleCall_5_1_0_1 = (RuleCall)cTransitionTransitionCrossReference_5_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//State:
		//	{State}
		//	'State'
		//	name=EString
		//	'{' ('transition' transition=[Transition|EString])? ('transition' transition=[Transition|EString])?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{State} 'State' name=EString '{' ('transition' transition=[Transition|EString])? ('transition'
		//transition=[Transition|EString])? '}'
		public Group getGroup() { return cGroup; }
		
		//{State}
		public Action getStateAction_0() { return cStateAction_0; }
		
		//'State'
		public Keyword getStateKeyword_1() { return cStateKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//('transition' transition=[Transition|EString])?
		public Group getGroup_4() { return cGroup_4; }
		
		//'transition'
		public Keyword getTransitionKeyword_4_0() { return cTransitionKeyword_4_0; }
		
		//transition=[Transition|EString]
		public Assignment getTransitionAssignment_4_1() { return cTransitionAssignment_4_1; }
		
		//[Transition|EString]
		public CrossReference getTransitionTransitionCrossReference_4_1_0() { return cTransitionTransitionCrossReference_4_1_0; }
		
		//EString
		public RuleCall getTransitionTransitionEStringParserRuleCall_4_1_0_1() { return cTransitionTransitionEStringParserRuleCall_4_1_0_1; }
		
		//('transition' transition=[Transition|EString])?
		public Group getGroup_5() { return cGroup_5; }
		
		//'transition'
		public Keyword getTransitionKeyword_5_0() { return cTransitionKeyword_5_0; }
		
		//transition=[Transition|EString]
		public Assignment getTransitionAssignment_5_1() { return cTransitionAssignment_5_1; }
		
		//[Transition|EString]
		public CrossReference getTransitionTransitionCrossReference_5_1_0() { return cTransitionTransitionCrossReference_5_1_0; }
		
		//EString
		public RuleCall getTransitionTransitionEStringParserRuleCall_5_1_0_1() { return cTransitionTransitionEStringParserRuleCall_5_1_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTransitionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTransitionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cStateKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cStateAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cStateStateCrossReference_4_1_0 = (CrossReference)cStateAssignment_4_1.eContents().get(0);
		private final RuleCall cStateStateEStringParserRuleCall_4_1_0_1 = (RuleCall)cStateStateCrossReference_4_1_0.eContents().get(1);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cStateKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cStateAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cStateStateCrossReference_5_1_0 = (CrossReference)cStateAssignment_5_1.eContents().get(0);
		private final RuleCall cStateStateEStringParserRuleCall_5_1_0_1 = (RuleCall)cStateStateCrossReference_5_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Transition:
		//	{Transition}
		//	'Transition'
		//	name=EString
		//	'{' ('state' state=[State|EString])? ('state' state=[State|EString])?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Transition} 'Transition' name=EString '{' ('state' state=[State|EString])? ('state' state=[State|EString])? '}'
		public Group getGroup() { return cGroup; }
		
		//{Transition}
		public Action getTransitionAction_0() { return cTransitionAction_0; }
		
		//'Transition'
		public Keyword getTransitionKeyword_1() { return cTransitionKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//('state' state=[State|EString])?
		public Group getGroup_4() { return cGroup_4; }
		
		//'state'
		public Keyword getStateKeyword_4_0() { return cStateKeyword_4_0; }
		
		//state=[State|EString]
		public Assignment getStateAssignment_4_1() { return cStateAssignment_4_1; }
		
		//[State|EString]
		public CrossReference getStateStateCrossReference_4_1_0() { return cStateStateCrossReference_4_1_0; }
		
		//EString
		public RuleCall getStateStateEStringParserRuleCall_4_1_0_1() { return cStateStateEStringParserRuleCall_4_1_0_1; }
		
		//('state' state=[State|EString])?
		public Group getGroup_5() { return cGroup_5; }
		
		//'state'
		public Keyword getStateKeyword_5_0() { return cStateKeyword_5_0; }
		
		//state=[State|EString]
		public Assignment getStateAssignment_5_1() { return cStateAssignment_5_1; }
		
		//[State|EString]
		public CrossReference getStateStateCrossReference_5_1_0() { return cStateStateCrossReference_5_1_0; }
		
		//EString
		public RuleCall getStateStateEStringParserRuleCall_5_1_0_1() { return cStateStateEStringParserRuleCall_5_1_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	
	
	private final StateElements pState;
	private final EStringElements pEString;
	private final TransitionElements pTransition;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pState = new StateElements();
		this.pEString = new EStringElements();
		this.pTransition = new TransitionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//State:
	//	{State}
	//	'State'
	//	name=EString
	//	'{' ('transition' transition=[Transition|EString])? ('transition' transition=[Transition|EString])?
	//	'}';
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//Transition:
	//	{Transition}
	//	'Transition'
	//	name=EString
	//	'{' ('state' state=[State|EString])? ('state' state=[State|EString])?
	//	'}';
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
