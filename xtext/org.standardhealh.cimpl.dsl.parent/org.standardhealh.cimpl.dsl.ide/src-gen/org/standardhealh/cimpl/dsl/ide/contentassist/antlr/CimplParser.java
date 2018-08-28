/*
 * generated by Xtext 2.12.0
 */
package org.standardhealh.cimpl.dsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.standardhealh.cimpl.dsl.ide.contentassist.antlr.internal.InternalCimplParser;
import org.standardhealh.cimpl.dsl.services.CimplGrammarAccess;

public class CimplParser extends AbstractContentAssistParser {

	@Inject
	private CimplGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalCimplParser createParser() {
		InternalCimplParser result = new InternalCimplParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getCIMPLSTRINGAccess().getAlternatives(), "rule__CIMPLSTRING__Alternatives");
					put(grammarAccess.getProfileAccess().getGroup(), "rule__Profile__Group__0");
					put(grammarAccess.getDescriptionAccess().getGroup(), "rule__Description__Group__0");
					put(grammarAccess.getHeaderAccess().getGroup(), "rule__Header__Group__0");
					put(grammarAccess.getUsesStatementAccess().getGroup(), "rule__UsesStatement__Group__0");
					put(grammarAccess.getUsesStatementAccess().getGroup_2(), "rule__UsesStatement__Group_2__0");
					put(grammarAccess.getCodeSystemAccess().getGroup(), "rule__CodeSystem__Group__0");
					put(grammarAccess.getEntryElementAccess().getGroup(), "rule__EntryElement__Group__0");
					put(grammarAccess.getEntryElementAccess().getGroup_3(), "rule__EntryElement__Group_3__0");
					put(grammarAccess.getEntryElementAccess().getGroup_11(), "rule__EntryElement__Group_11__0");
					put(grammarAccess.getEntryElementAccess().getGroup_11_1(), "rule__EntryElement__Group_11_1__0");
					put(grammarAccess.getSubsetsAccess().getGroup(), "rule__Subsets__Group__0");
					put(grammarAccess.getSubsetsAccess().getGroup_3(), "rule__Subsets__Group_3__0");
					put(grammarAccess.getSubsetAccess().getGroup(), "rule__Subset__Group__0");
					put(grammarAccess.getRedefinitionAccess().getGroup(), "rule__Redefinition__Group__0");
					put(grammarAccess.getCardinalityAccess().getGroup(), "rule__Cardinality__Group__0");
					put(grammarAccess.getElementAccess().getGroup(), "rule__Element__Group__0");
					put(grammarAccess.getElementAccess().getGroup_3(), "rule__Element__Group_3__0");
					put(grammarAccess.getCodeableConceptAccess().getGroup(), "rule__CodeableConcept__Group__0");
					put(grammarAccess.getQuantityAccess().getGroup(), "rule__Quantity__Group__0");
					put(grammarAccess.getProfileAccess().getHeaderAssignment_0(), "rule__Profile__HeaderAssignment_0");
					put(grammarAccess.getProfileAccess().getDescriptionAssignment_1(), "rule__Profile__DescriptionAssignment_1");
					put(grammarAccess.getProfileAccess().getUsesAssignment_2(), "rule__Profile__UsesAssignment_2");
					put(grammarAccess.getProfileAccess().getCodeSystemsAssignment_3(), "rule__Profile__CodeSystemsAssignment_3");
					put(grammarAccess.getProfileAccess().getEntriesAssignment_4(), "rule__Profile__EntriesAssignment_4");
					put(grammarAccess.getProfileAccess().getElementsAssignment_5(), "rule__Profile__ElementsAssignment_5");
					put(grammarAccess.getDescriptionAccess().getDescriptionAssignment_1(), "rule__Description__DescriptionAssignment_1");
					put(grammarAccess.getHeaderAccess().getVersionAssignment_1(), "rule__Header__VersionAssignment_1");
					put(grammarAccess.getHeaderAccess().getNamespaceAssignment_4(), "rule__Header__NamespaceAssignment_4");
					put(grammarAccess.getUsesStatementAccess().getNamespaceAssignment_1(), "rule__UsesStatement__NamespaceAssignment_1");
					put(grammarAccess.getUsesStatementAccess().getNamespaceAssignment_2_1(), "rule__UsesStatement__NamespaceAssignment_2_1");
					put(grammarAccess.getCodeSystemAccess().getNamespaceAssignment_1(), "rule__CodeSystem__NamespaceAssignment_1");
					put(grammarAccess.getEntryElementAccess().getNameAssignment_1(), "rule__EntryElement__NameAssignment_1");
					put(grammarAccess.getEntryElementAccess().getBasedOnAssignment_3_1(), "rule__EntryElement__BasedOnAssignment_3_1");
					put(grammarAccess.getEntryElementAccess().getConceptAssignment_5(), "rule__EntryElement__ConceptAssignment_5");
					put(grammarAccess.getEntryElementAccess().getConceptDescriptionAssignment_6(), "rule__EntryElement__ConceptDescriptionAssignment_6");
					put(grammarAccess.getEntryElementAccess().getDescriptionAssignment_9(), "rule__EntryElement__DescriptionAssignment_9");
					put(grammarAccess.getEntryElementAccess().getRedefinitionsAssignment_11_0(), "rule__EntryElement__RedefinitionsAssignment_11_0");
					put(grammarAccess.getEntryElementAccess().getRedefinitionsAssignment_11_1_1(), "rule__EntryElement__RedefinitionsAssignment_11_1_1");
					put(grammarAccess.getEntryElementAccess().getSubsetsAssignment_12(), "rule__EntryElement__SubsetsAssignment_12");
					put(grammarAccess.getSubsetsAccess().getNameAssignment_0(), "rule__Subsets__NameAssignment_0");
					put(grammarAccess.getSubsetsAccess().getSubsetsAssignment_2(), "rule__Subsets__SubsetsAssignment_2");
					put(grammarAccess.getSubsetsAccess().getSubsetsAssignment_3_1(), "rule__Subsets__SubsetsAssignment_3_1");
					put(grammarAccess.getSubsetAccess().getCardinalityAssignment_1(), "rule__Subset__CardinalityAssignment_1");
					put(grammarAccess.getSubsetAccess().getTypeNameAssignment_2(), "rule__Subset__TypeNameAssignment_2");
					put(grammarAccess.getRedefinitionAccess().getCardinalityAssignment_0(), "rule__Redefinition__CardinalityAssignment_0");
					put(grammarAccess.getRedefinitionAccess().getNameAssignment_1(), "rule__Redefinition__NameAssignment_1");
					put(grammarAccess.getCardinalityAccess().getLowerAssignment_0(), "rule__Cardinality__LowerAssignment_0");
					put(grammarAccess.getCardinalityAccess().getUpperAssignment_2(), "rule__Cardinality__UpperAssignment_2");
					put(grammarAccess.getElementAccess().getNameAssignment_1(), "rule__Element__NameAssignment_1");
					put(grammarAccess.getElementAccess().getBasedOnAssignment_3_1(), "rule__Element__BasedOnAssignment_3_1");
					put(grammarAccess.getElementAccess().getConceptAssignment_5(), "rule__Element__ConceptAssignment_5");
					put(grammarAccess.getElementAccess().getDescriptionAssignment_8(), "rule__Element__DescriptionAssignment_8");
					put(grammarAccess.getElementAccess().getValueAssignment_11(), "rule__Element__ValueAssignment_11");
					put(grammarAccess.getCodeableConceptAccess().getValueSetURLAssignment_1(), "rule__CodeableConcept__ValueSetURLAssignment_1");
					put(grammarAccess.getQuantityAccess().getUnitsAssignment_1(), "rule__Quantity__UnitsAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public CimplGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CimplGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}