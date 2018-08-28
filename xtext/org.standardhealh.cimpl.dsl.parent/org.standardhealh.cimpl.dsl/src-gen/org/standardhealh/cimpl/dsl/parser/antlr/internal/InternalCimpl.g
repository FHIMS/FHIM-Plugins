/*
 * generated by Xtext 2.12.0
 */
grammar InternalCimpl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.standardhealh.cimpl.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.standardhealh.cimpl.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.standardhealh.cimpl.dsl.services.CimplGrammarAccess;

}

@parser::members {

 	private CimplGrammarAccess grammarAccess;

    public InternalCimplParser(TokenStream input, CimplGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Profile";
   	}

   	@Override
   	protected CimplGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleProfile
entryRuleProfile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProfileRule()); }
	iv_ruleProfile=ruleProfile
	{ $current=$iv_ruleProfile.current; }
	EOF;

// Rule Profile
ruleProfile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getProfileAccess().getHeaderHeaderParserRuleCall_0_0());
				}
				lv_header_0_0=ruleHeader
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProfileRule());
					}
					set(
						$current,
						"header",
						lv_header_0_0,
						"org.standardhealh.cimpl.dsl.Cimpl.Header");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProfileAccess().getDescriptionDescriptionParserRuleCall_1_0());
				}
				lv_description_1_0=ruleDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProfileRule());
					}
					set(
						$current,
						"description",
						lv_description_1_0,
						"org.standardhealh.cimpl.dsl.Cimpl.Description");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProfileAccess().getUsesUsesStatementParserRuleCall_2_0());
				}
				lv_uses_2_0=ruleUsesStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProfileRule());
					}
					set(
						$current,
						"uses",
						lv_uses_2_0,
						"org.standardhealh.cimpl.dsl.Cimpl.UsesStatement");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getProfileAccess().getCodeSystemsCodeSystemParserRuleCall_3_0());
				}
				lv_codeSystems_3_0=ruleCodeSystem
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProfileRule());
					}
					add(
						$current,
						"codeSystems",
						lv_codeSystems_3_0,
						"org.standardhealh.cimpl.dsl.Cimpl.CodeSystem");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getProfileAccess().getEntriesEntryElementParserRuleCall_4_0());
				}
				lv_entries_4_0=ruleEntryElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProfileRule());
					}
					add(
						$current,
						"entries",
						lv_entries_4_0,
						"org.standardhealh.cimpl.dsl.Cimpl.EntryElement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getProfileAccess().getElementsElementParserRuleCall_5_0());
				}
				lv_elements_5_0=ruleElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProfileRule());
					}
					add(
						$current,
						"elements",
						lv_elements_5_0,
						"org.standardhealh.cimpl.dsl.Cimpl.Element");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleDescription
entryRuleDescription returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDescriptionRule()); }
	iv_ruleDescription=ruleDescription
	{ $current=$iv_ruleDescription.current; }
	EOF;

// Rule Description
ruleDescription returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Description:'
		{
			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
		}
		(
			(
				lv_description_1_0=RULE_STRING
				{
					newLeafNode(lv_description_1_0, grammarAccess.getDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDescriptionRule());
					}
					setWithLastConsumed(
						$current,
						"description",
						lv_description_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2='\r'
		{
			newLeafNode(otherlv_2, grammarAccess.getDescriptionAccess().getCarriageReturnKeyword_2());
		}
	)
;

// Entry rule entryRuleHeader
entryRuleHeader returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHeaderRule()); }
	iv_ruleHeader=ruleHeader
	{ $current=$iv_ruleHeader.current; }
	EOF;

// Rule Header
ruleHeader returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Grammar:\tDataElement'
		{
			newLeafNode(otherlv_0, grammarAccess.getHeaderAccess().getGrammarDataElementKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getHeaderAccess().getVersionCIMPLSTRINGParserRuleCall_1_0());
				}
				lv_version_1_0=ruleCIMPLSTRING
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHeaderRule());
					}
					set(
						$current,
						"version",
						lv_version_1_0,
						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='\r\n'
		{
			newLeafNode(otherlv_2, grammarAccess.getHeaderAccess().getControl000dControl000aKeyword_2());
		}
		otherlv_3='Namespace:'
		{
			newLeafNode(otherlv_3, grammarAccess.getHeaderAccess().getNamespaceKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getHeaderAccess().getNamespaceCIMPLSTRINGParserRuleCall_4_0());
				}
				lv_namespace_4_0=ruleCIMPLSTRING
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHeaderRule());
					}
					set(
						$current,
						"namespace",
						lv_namespace_4_0,
						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='\r'
		{
			newLeafNode(otherlv_5, grammarAccess.getHeaderAccess().getCarriageReturnKeyword_5());
		}
	)
;

// Entry rule entryRuleUsesStatement
entryRuleUsesStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUsesStatementRule()); }
	iv_ruleUsesStatement=ruleUsesStatement
	{ $current=$iv_ruleUsesStatement.current; }
	EOF;

// Rule UsesStatement
ruleUsesStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Uses:'
		{
			newLeafNode(otherlv_0, grammarAccess.getUsesStatementAccess().getUsesKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUsesStatementAccess().getNamespaceCIMPLSTRINGParserRuleCall_1_0());
				}
				lv_namespace_1_0=ruleCIMPLSTRING
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUsesStatementRule());
					}
					add(
						$current,
						"namespace",
						lv_namespace_1_0,
						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getUsesStatementAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getUsesStatementAccess().getNamespaceCIMPLSTRINGParserRuleCall_2_1_0());
					}
					lv_namespace_3_0=ruleCIMPLSTRING
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUsesStatementRule());
						}
						add(
							$current,
							"namespace",
							lv_namespace_3_0,
							"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_4='\r'
		{
			newLeafNode(otherlv_4, grammarAccess.getUsesStatementAccess().getCarriageReturnKeyword_3());
		}
		otherlv_5='\r'
		{
			newLeafNode(otherlv_5, grammarAccess.getUsesStatementAccess().getCarriageReturnKeyword_4());
		}
	)
;

// Entry rule entryRuleCodeSystem
entryRuleCodeSystem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCodeSystemRule()); }
	iv_ruleCodeSystem=ruleCodeSystem
	{ $current=$iv_ruleCodeSystem.current; }
	EOF;

// Rule CodeSystem
ruleCodeSystem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CodeSystem:'
		{
			newLeafNode(otherlv_0, grammarAccess.getCodeSystemAccess().getCodeSystemKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCodeSystemAccess().getNamespaceCIMPLSTRINGParserRuleCall_1_0());
				}
				lv_namespace_1_0=ruleCIMPLSTRING
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCodeSystemRule());
					}
					set(
						$current,
						"namespace",
						lv_namespace_1_0,
						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='\r'
		{
			newLeafNode(otherlv_2, grammarAccess.getCodeSystemAccess().getCarriageReturnKeyword_2());
		}
	)
;

// Entry rule entryRuleEntryElement
entryRuleEntryElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntryElementRule()); }
	iv_ruleEntryElement=ruleEntryElement
	{ $current=$iv_ruleEntryElement.current; }
	EOF;

// Rule EntryElement
ruleEntryElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='\r\nEntryElement:'
		{
			newLeafNode(otherlv_0, grammarAccess.getEntryElementAccess().getEntryElementKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntryElementAccess().getNameCIMPLSTRINGParserRuleCall_1_0());
				}
				lv_name_1_0=ruleCIMPLSTRING
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntryElementRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='\r\n'
		{
			newLeafNode(otherlv_2, grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_2());
		}
		(
			otherlv_3='Based on:'
			{
				newLeafNode(otherlv_3, grammarAccess.getEntryElementAccess().getBasedOnKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEntryElementAccess().getBasedOnCIMPLSTRINGParserRuleCall_3_1_0());
					}
					lv_basedOn_4_0=ruleCIMPLSTRING
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEntryElementRule());
						}
						set(
							$current,
							"basedOn",
							lv_basedOn_4_0,
							"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_5='\r\n'
			{
				newLeafNode(otherlv_5, grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_3_2());
			}
		)?
		otherlv_6='Concept:'
		{
			newLeafNode(otherlv_6, grammarAccess.getEntryElementAccess().getConceptKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntryElementAccess().getConceptCIMPLSTRINGParserRuleCall_5_0());
				}
				lv_concept_7_0=ruleCIMPLSTRING
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntryElementRule());
					}
					set(
						$current,
						"concept",
						lv_concept_7_0,
						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_conceptDescription_8_0=RULE_STRING
				{
					newLeafNode(lv_conceptDescription_8_0, grammarAccess.getEntryElementAccess().getConceptDescriptionSTRINGTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntryElementRule());
					}
					setWithLastConsumed(
						$current,
						"conceptDescription",
						lv_conceptDescription_8_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_9='\r\n'
		{
			newLeafNode(otherlv_9, grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_7());
		}
		otherlv_10='Description:'
		{
			newLeafNode(otherlv_10, grammarAccess.getEntryElementAccess().getDescriptionKeyword_8());
		}
		(
			(
				lv_description_11_0=RULE_STRING
				{
					newLeafNode(lv_description_11_0, grammarAccess.getEntryElementAccess().getDescriptionSTRINGTerminalRuleCall_9_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntryElementRule());
					}
					setWithLastConsumed(
						$current,
						"description",
						lv_description_11_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_12='\r\n'
		{
			newLeafNode(otherlv_12, grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_10());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getEntryElementAccess().getRedefinitionsRedefinitionParserRuleCall_11_0_0());
					}
					lv_redefinitions_13_0=ruleRedefinition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEntryElementRule());
						}
						add(
							$current,
							"redefinitions",
							lv_redefinitions_13_0,
							"org.standardhealh.cimpl.dsl.Cimpl.Redefinition");
						afterParserOrEnumRuleCall();
					}
				)
			)?
			(
				otherlv_14='\r\n'
				{
					newLeafNode(otherlv_14, grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_11_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getEntryElementAccess().getRedefinitionsRedefinitionParserRuleCall_11_1_1_0());
						}
						lv_redefinitions_15_0=ruleRedefinition
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getEntryElementRule());
							}
							add(
								$current,
								"redefinitions",
								lv_redefinitions_15_0,
								"org.standardhealh.cimpl.dsl.Cimpl.Redefinition");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_16='\r\n'
			{
				newLeafNode(otherlv_16, grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_11_2());
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getEntryElementAccess().getSubsetsSubsetsParserRuleCall_12_0());
				}
				lv_subsets_17_0=ruleSubsets
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntryElementRule());
					}
					add(
						$current,
						"subsets",
						lv_subsets_17_0,
						"org.standardhealh.cimpl.dsl.Cimpl.Subsets");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleSubsets
entryRuleSubsets returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubsetsRule()); }
	iv_ruleSubsets=ruleSubsets
	{ $current=$iv_ruleSubsets.current; }
	EOF;

// Rule Subsets
ruleSubsets returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getSubsetsAccess().getNameCIMPLSTRINGParserRuleCall_0_0());
				}
				lv_name_0_0=ruleCIMPLSTRING
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSubsetsRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='\r\n'
		{
			newLeafNode(otherlv_1, grammarAccess.getSubsetsAccess().getControl000dControl000aKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSubsetsAccess().getSubsetsSubsetParserRuleCall_2_0());
				}
				lv_subsets_2_0=ruleSubset
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSubsetsRule());
					}
					add(
						$current,
						"subsets",
						lv_subsets_2_0,
						"org.standardhealh.cimpl.dsl.Cimpl.Subset");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			otherlv_3='\r\n'
			{
				newLeafNode(otherlv_3, grammarAccess.getSubsetsAccess().getControl000dControl000aKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSubsetsAccess().getSubsetsSubsetParserRuleCall_3_1_0());
					}
					lv_subsets_4_0=ruleSubset
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSubsetsRule());
						}
						add(
							$current,
							"subsets",
							lv_subsets_4_0,
							"org.standardhealh.cimpl.dsl.Cimpl.Subset");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_5='\r\n'
		{
			newLeafNode(otherlv_5, grammarAccess.getSubsetsAccess().getControl000dControl000aKeyword_4());
		}
	)
;

// Entry rule entryRuleSubset
entryRuleSubset returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubsetRule()); }
	iv_ruleSubset=ruleSubset
	{ $current=$iv_ruleSubset.current; }
	EOF;

// Rule Subset
ruleSubset returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='includes'
		{
			newLeafNode(otherlv_0, grammarAccess.getSubsetAccess().getIncludesKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSubsetAccess().getCardinalityCardinalityParserRuleCall_1_0());
				}
				lv_cardinality_1_0=ruleCardinality
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSubsetRule());
					}
					set(
						$current,
						"cardinality",
						lv_cardinality_1_0,
						"org.standardhealh.cimpl.dsl.Cimpl.Cardinality");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSubsetAccess().getTypeNameCIMPLSTRINGParserRuleCall_2_0());
				}
				lv_typeName_2_0=ruleCIMPLSTRING
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSubsetRule());
					}
					set(
						$current,
						"typeName",
						lv_typeName_2_0,
						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleRedefinition
entryRuleRedefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRedefinitionRule()); }
	iv_ruleRedefinition=ruleRedefinition
	{ $current=$iv_ruleRedefinition.current; }
	EOF;

// Rule Redefinition
ruleRedefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getRedefinitionAccess().getCardinalityCardinalityParserRuleCall_0_0());
				}
				lv_cardinality_0_0=ruleCardinality
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRedefinitionRule());
					}
					set(
						$current,
						"cardinality",
						lv_cardinality_0_0,
						"org.standardhealh.cimpl.dsl.Cimpl.Cardinality");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getRedefinitionAccess().getNameCIMPLSTRINGParserRuleCall_1_0());
				}
				lv_name_1_0=ruleCIMPLSTRING
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRedefinitionRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCardinality
entryRuleCardinality returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCardinalityRule()); }
	iv_ruleCardinality=ruleCardinality
	{ $current=$iv_ruleCardinality.current; }
	EOF;

// Rule Cardinality
ruleCardinality returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_lower_0_0=RULE_INT
				{
					newLeafNode(lv_lower_0_0, grammarAccess.getCardinalityAccess().getLowerINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCardinalityRule());
					}
					setWithLastConsumed(
						$current,
						"lower",
						lv_lower_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_1='..'
		{
			newLeafNode(otherlv_1, grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1());
		}
		(
			(
				lv_upper_2_0=RULE_INT
				{
					newLeafNode(lv_upper_2_0, grammarAccess.getCardinalityAccess().getUpperINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCardinalityRule());
					}
					setWithLastConsumed(
						$current,
						"upper",
						lv_upper_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleElement
entryRuleElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElementRule()); }
	iv_ruleElement=ruleElement
	{ $current=$iv_ruleElement.current; }
	EOF;

// Rule Element
ruleElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='\r\nElement:'
		{
			newLeafNode(otherlv_0, grammarAccess.getElementAccess().getElementKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getElementAccess().getNameCIMPLSTRINGParserRuleCall_1_0());
				}
				lv_name_1_0=ruleCIMPLSTRING
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getElementRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='\r\n'
		{
			newLeafNode(otherlv_2, grammarAccess.getElementAccess().getControl000dControl000aKeyword_2());
		}
		(
			otherlv_3='Based on:'
			{
				newLeafNode(otherlv_3, grammarAccess.getElementAccess().getBasedOnKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getElementAccess().getBasedOnCIMPLSTRINGParserRuleCall_3_1_0());
					}
					lv_basedOn_4_0=ruleCIMPLSTRING
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getElementRule());
						}
						set(
							$current,
							"basedOn",
							lv_basedOn_4_0,
							"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_5='\r\n'
			{
				newLeafNode(otherlv_5, grammarAccess.getElementAccess().getControl000dControl000aKeyword_3_2());
			}
		)?
		otherlv_6='Concept:'
		{
			newLeafNode(otherlv_6, grammarAccess.getElementAccess().getConceptKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getElementAccess().getConceptCIMPLSTRINGParserRuleCall_5_0());
				}
				lv_concept_7_0=ruleCIMPLSTRING
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getElementRule());
					}
					set(
						$current,
						"concept",
						lv_concept_7_0,
						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='\r\n'
		{
			newLeafNode(otherlv_8, grammarAccess.getElementAccess().getControl000dControl000aKeyword_6());
		}
		otherlv_9='Description:'
		{
			newLeafNode(otherlv_9, grammarAccess.getElementAccess().getDescriptionKeyword_7());
		}
		(
			(
				lv_description_10_0=RULE_STRING
				{
					newLeafNode(lv_description_10_0, grammarAccess.getElementAccess().getDescriptionSTRINGTerminalRuleCall_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getElementRule());
					}
					setWithLastConsumed(
						$current,
						"description",
						lv_description_10_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_11='\r\n'
		{
			newLeafNode(otherlv_11, grammarAccess.getElementAccess().getControl000dControl000aKeyword_9());
		}
		otherlv_12='Value:'
		{
			newLeafNode(otherlv_12, grammarAccess.getElementAccess().getValueKeyword_10());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getElementAccess().getValueCIMPLSTRINGParserRuleCall_11_0());
				}
				lv_value_13_0=ruleCIMPLSTRING
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getElementRule());
					}
					set(
						$current,
						"value",
						lv_value_13_0,
						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_14='\r\n'
		{
			newLeafNode(otherlv_14, grammarAccess.getElementAccess().getControl000dControl000aKeyword_12());
		}
	)
;

// Entry rule entryRuleCodeableConcept
entryRuleCodeableConcept returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCodeableConceptRule()); }
	iv_ruleCodeableConcept=ruleCodeableConcept
	{ $current=$iv_ruleCodeableConcept.current; }
	EOF;

// Rule CodeableConcept
ruleCodeableConcept returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CodeableConcept from'
		{
			newLeafNode(otherlv_0, grammarAccess.getCodeableConceptAccess().getCodeableConceptFromKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCodeableConceptAccess().getValueSetURLCIMPLSTRINGParserRuleCall_1_0());
				}
				lv_valueSetURL_1_0=ruleCIMPLSTRING
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCodeableConceptRule());
					}
					set(
						$current,
						"valueSetURL",
						lv_valueSetURL_1_0,
						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleQuantity
entryRuleQuantity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQuantityRule()); }
	iv_ruleQuantity=ruleQuantity
	{ $current=$iv_ruleQuantity.current; }
	EOF;

// Rule Quantity
ruleQuantity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Quantity with units'
		{
			newLeafNode(otherlv_0, grammarAccess.getQuantityAccess().getQuantityWithUnitsKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getQuantityAccess().getUnitsCIMPLSTRINGParserRuleCall_1_0());
				}
				lv_units_1_0=ruleCIMPLSTRING
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getQuantityRule());
					}
					set(
						$current,
						"units",
						lv_units_1_0,
						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCIMPLSTRING
entryRuleCIMPLSTRING returns [String current=null]:
	{ newCompositeNode(grammarAccess.getCIMPLSTRINGRule()); }
	iv_ruleCIMPLSTRING=ruleCIMPLSTRING
	{ $current=$iv_ruleCIMPLSTRING.current.getText(); }
	EOF;

// Rule CIMPLSTRING
ruleCIMPLSTRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw=' '
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getSpaceKeyword_0());
		}
		    |
		kw='/'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getSolidusKeyword_1());
		}
		    |
		kw=';'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getSemicolonKeyword_2());
		}
		    |
		kw=','
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getCommaKeyword_3());
		}
		    |
		kw='!'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getExclamationMarkKeyword_4());
		}
		    |
		kw='\u00A7'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getSectionSignKeyword_5());
		}
		    |
		kw='%'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getPercentSignKeyword_6());
		}
		    |
		kw='&'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getAmpersandKeyword_7());
		}
		    |
		kw='('
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getLeftParenthesisKeyword_8());
		}
		    |
		kw=')'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getRightParenthesisKeyword_9());
		}
		    |
		kw='?'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getQuestionMarkKeyword_10());
		}
		    |
		kw='*'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getAsteriskKeyword_11());
		}
		    |
		kw='+'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getPlusSignKeyword_12());
		}
		    |
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getFullStopKeyword_13());
		}
		    |
		kw='-'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getHyphenMinusKeyword_14());
		}
		    |
		kw='|'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getVerticalLineKeyword_15());
		}
		    |
		kw='['
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getLeftSquareBracketKeyword_16());
		}
		    |
		kw=']'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getRightSquareBracketKeyword_17());
		}
	)
;

RULE_BASEDON : 'Based on';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;