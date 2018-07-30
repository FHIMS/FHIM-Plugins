/*
 * generated by Xtext 2.10.0
 */
package org.standardhealh.cimpl.dsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.standardhealh.cimpl.dsl.cimpl.CimplPackage;
import org.standardhealh.cimpl.dsl.cimpl.Doc;
import org.standardhealh.cimpl.dsl.cimpl.DocHeader;
import org.standardhealh.cimpl.dsl.cimpl.Element;
import org.standardhealh.cimpl.dsl.cimpl.EntryElement;
import org.standardhealh.cimpl.dsl.cimpl.Model;
import org.standardhealh.cimpl.dsl.cimpl.UsesStatement;
import org.standardhealh.cimpl.dsl.services.CimplGrammarAccess;

@SuppressWarnings("all")
public class CimplSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CimplGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CimplPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CimplPackage.DOC:
				sequence_Doc(context, (Doc) semanticObject); 
				return; 
			case CimplPackage.DOC_HEADER:
				sequence_DocHeader(context, (DocHeader) semanticObject); 
				return; 
			case CimplPackage.ELEMENT:
				sequence_Element(context, (Element) semanticObject); 
				return; 
			case CimplPackage.ENTRY_ELEMENT:
				sequence_EntryElement(context, (EntryElement) semanticObject); 
				return; 
			case CimplPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case CimplPackage.USES_STATEMENT:
				sequence_UsesStatement(context, (UsesStatement) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     DocHeader returns DocHeader
	 *
	 * Constraint:
	 *     (version=STRING namespace=STRING)
	 */
	protected void sequence_DocHeader(ISerializationContext context, DocHeader semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CimplPackage.Literals.DOC_HEADER__VERSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CimplPackage.Literals.DOC_HEADER__VERSION));
			if (transientValues.isValueTransient(semanticObject, CimplPackage.Literals.DOC_HEADER__NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CimplPackage.Literals.DOC_HEADER__NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDocHeaderAccess().getVersionSTRINGTerminalRuleCall_2_0(), semanticObject.getVersion());
		feeder.accept(grammarAccess.getDocHeaderAccess().getNamespaceSTRINGTerminalRuleCall_5_0(), semanticObject.getNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Doc returns Doc
	 *
	 * Constraint:
	 *     (header=DocHeader uses=UsesStatement entries+=EntryElement*)
	 */
	protected void sequence_Doc(ISerializationContext context, Doc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Element
	 *
	 * Constraint:
	 *     (lower=INT upper=INT name=STRING)
	 */
	protected void sequence_Element(ISerializationContext context, Element semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CimplPackage.Literals.ELEMENT__LOWER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CimplPackage.Literals.ELEMENT__LOWER));
			if (transientValues.isValueTransient(semanticObject, CimplPackage.Literals.ELEMENT__UPPER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CimplPackage.Literals.ELEMENT__UPPER));
			if (transientValues.isValueTransient(semanticObject, CimplPackage.Literals.ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CimplPackage.Literals.ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getElementAccess().getLowerINTTerminalRuleCall_0_0(), semanticObject.getLower());
		feeder.accept(grammarAccess.getElementAccess().getUpperINTTerminalRuleCall_2_0(), semanticObject.getUpper());
		feeder.accept(grammarAccess.getElementAccess().getNameSTRINGTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EntryElement returns EntryElement
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         basedOn=STRING 
	 *         concept=STRING 
	 *         description=STRING 
	 *         elements+=Element? 
	 *         elements+=Element* 
	 *         subelements+=EntryElement* 
	 *         value=STRING?
	 *     )
	 */
	protected void sequence_EntryElement(ISerializationContext context, EntryElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     elements=Doc
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CimplPackage.Literals.MODEL__ELEMENTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CimplPackage.Literals.MODEL__ELEMENTS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelAccess().getElementsDocParserRuleCall_0(), semanticObject.getElements());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     UsesStatement returns UsesStatement
	 *
	 * Constraint:
	 *     (namespace+=STRING namespace+=STRING*)
	 */
	protected void sequence_UsesStatement(ISerializationContext context, UsesStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
