package org.standardhealh.cimpl.dsl;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.standardhealh.cimpl.dsl.cimpl.Cardinality;
import org.standardhealh.cimpl.dsl.cimpl.CimplFactory;
import org.standardhealh.cimpl.dsl.cimpl.CodeableConcept;
import org.standardhealh.cimpl.dsl.cimpl.Element;
import org.standardhealh.cimpl.dsl.cimpl.EntryElement;
import org.standardhealh.cimpl.dsl.cimpl.Header;
import org.standardhealh.cimpl.dsl.cimpl.Profile;
import org.standardhealh.cimpl.dsl.cimpl.Redefinition;
import org.standardhealh.cimpl.dsl.cimpl.Subset;
import org.standardhealh.cimpl.dsl.cimpl.UsesStatement;
 
public class Test {
	
	@org.junit.Test
	public void test2() {
		
		
		
		
		// change MyLanguage with your language name
//		com.google.inject.Injector injector = new CimplStandaloneSetup().createInjectorAndDoEMFRegistration();
//		
//	    XtextResourceSet resourceSet = injector
//	            .getInstance(XtextResourceSet.class);
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("cimpl", new XMIResourceFactoryImpl());

	    ResourceSet resourceSet = new ResourceSetImpl();

	    
	   
	    
	    URI fileURI =  URI.createFileURI("/Users/seanmuir/eclipse-workspaceoxygenjbmn/gov.us.fhim2cimpl.qvt/cimpl/NewTransformation.cimpl");
	    //URI.createPlatformPluginURI("platform:/resource/gov.us.fhim2cimpl.qvt/cimpl/NewTransformation.cimpl",false);

		// Demand load the resource for this file.
		Resource resource = resourceSet.getResource(fileURI, true);
		
		EObject root = resource.getContents().get(0);
		
		System.out.println(root);;

		
	    
//	    // .ext ist the extension of the model file
//	    String inputURI = "file:///" + absuloteTargetFolderPath + "/MyFile.ext";
//	    String outputURI = "file:///" + absuloteTargetFolderPath + "/MyFile.xmi";
//	    URI uri = URI.createURI(inputURI);
//	    Resource xtextResource = resourceSet.getResource(uri, true);
//
//	    EcoreUtil.resolveAll(xtextResource);

//	    Resource xmiResource = resourceSet
//	            .createResource(URI.createURI(outputURI));
//	    xmiResource.getContents().add(xtextResource.getContents().get(0));
//	    try {
//	        xmiResource.save(null);
//	    } catch (IOException e) {
//	        e.printStackTrace();
//	    }
	}

	@org.junit.Test
	public void test() throws IOException {
	new CimplStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		XtextResourceSet resourceSet = new XtextResourceSet();		
//		Resource res = resourceSet.getResource(URI.createFileURI("scr/scr1.mydsl"), true);
//		DslRoot script = (DslRoot)res.getContents().get(0);
		
		Profile profile = CimplFactory.eINSTANCE.createProfile();
		
		Header header = CimplFactory.eINSTANCE.createHeader();
		header.setNamespace("cimi.statement");
		header.setVersion(" 5.0");
		profile.setHeader(header );
		UsesStatement useStatement = CimplFactory.eINSTANCE.createUsesStatement();
		useStatement.getNamespace().add("shr.core");
		useStatement.getNamespace().add("cimi.core");
		useStatement.getNamespace().add("cimi.element");
		profile.setUses(useStatement);
		
		
		EntryElement entryElement = CimplFactory.eINSTANCE.createEntryElement();
		entryElement.setBasedOn("NonLaboratoryObservation");
		entryElement.setConcept("LNC#39135-9");
		entryElement.setDescription("Group of observations regarding the properties and severity of a wound.");
		entryElement.setName("WoundAssessmentPanel");
		
		Redefinition redefinition1 = CimplFactory.eINSTANCE.createRedefinition();
		redefinition1.setName("name one");
		redefinition1.setEntryElement("entry element1");
		
		Redefinition redefinition2 = CimplFactory.eINSTANCE.createRedefinition();
		redefinition2.setName("name two");
		redefinition2.setEntryElement("entry element2");
		Cardinality cardinality = CimplFactory.eINSTANCE.createCardinality();
		redefinition2.setCardinality(cardinality);;
		
		entryElement.getRedefinitions().add(redefinition1 );
		entryElement.getRedefinitions().add(redefinition2 );
		
		Subset subset1 = CimplFactory.eINSTANCE.createSubset();
		subset1.setTypeName("type1");
		subset1.setCardinality(CimplFactory.eINSTANCE.createCardinality());
	 
		
		entryElement.getEvaluationSubsets().add(subset1);
		
		Subset subset2 = CimplFactory.eINSTANCE.createSubset();
		subset2.setTypeName("type2");
				subset2.setCardinality(CimplFactory.eINSTANCE.createCardinality());
		entryElement.getObservationSubsets().add(subset2);
		
		
		profile.getEntries().add(entryElement );
		
		Element element = CimplFactory.eINSTANCE.createElement();
		element.setBasedOn("CodedEvaluationComponent");
		element.setConcept("LNC#89252-1");
		element.setDescription("Wound episode refers to a period of the wound, an incident in the course of a wound");
		element.setName("EpisodeOfWound");
		CodeableConcept value =  CimplFactory.eINSTANCE.createCodeableConcept();
		value.setValueSetURL("https://vsac.nlm.nih.gov/valueset/2.16.840.1.113762.1.4.1181.4/expansion");
		//		element.setValue("CodeableConcept from https://vsac.nlm.nih.gov/valueset/2.16.840.1.113762.1.4.1181.4/expansion");
		element.setValue(value);
		

		
		profile.getElements().add(element);
		
		
		EntryElement entryElement2 = CimplFactory.eINSTANCE.createEntryElement();
		entryElement2.setBasedOn("222222");
		entryElement2.setConcept("2222222#39135-9");
		entryElement2.setDescription("2222222.");
		entryElement2.setName("2222222");

		profile.getEntries().add(entryElement2);
		
		
//		Model m = CimplFactory.eINSTANCE.createModel();
//		
//		Doc doc = CimplFactory.eINSTANCE.createDoc() ;
//		
////		doc.setDescription("description");
//		
//		DocHeader header  = CimplFactory.eINSTANCE.createDocHeader();
//		header.setVersion("version");
//		header.setNamespace("namespace");
//		doc.setHeader(header);
//		
//		UsesStatement uses =   CimplFactory.eINSTANCE.createUsesStatement();
//		
//		uses.getNamespace().add("namespace");
//		
//		doc.setUses(uses);
//		
//		EntryElement entry= CimplFactory.eINSTANCE.createEntryElement();
//		entry.setBasedOn("basedon");
//		entry.setConcept("concept");
//		entry.setDescription("description");
//		entry.setName("name");
//		entry.setValue("value");
//		Element element = CimplFactory.eINSTANCE.createElement();
//		element.setLower(0);
//		element.setUpper(1);
//		element.setName("name1");
//
//		entry.getElements().add(element );
//		
//		element = CimplFactory.eINSTANCE.createElement();
//		element.setLower(0);
//		element.setUpper(1);
//		element.setName("name2");
//
//		entry.getElements().add(element );
//		
//		element = CimplFactory.eINSTANCE.createElement();
//		element.setLower(0);
//		element.setUpper(1);
//		element.setName("name3");
//		
//		EntryElement subentry= CimplFactory.eINSTANCE.createEntryElement();
//		subentry.setBasedOn("subbasedon");
//		subentry.setConcept("subconcept");
//		subentry.setDescription("subdescription");
//		subentry.setName("subname");
//		subentry.setValue("subvalue");
//
//		entry.getSubelements().add(subentry);
//		
//		entry.getElements().add(element );
//		
//		 
//
////		entry.getElements().add(element );
//		
//		
//		doc.getEntries().add(entry);
//		
//		
//		m.setElements(doc );
//		
//		
		
//		CimplFactory.eINSTANCE.cre
		
		Resource res2 = resourceSet.createResource(URI.createFileURI("sample.cimpl"));
//		ArchetypeModel domainmodel = MyDslFactory.eINSTANCE.createArchetypeModel();
//		
//		
//		
//		Archetype e = MyDslFactory.eINSTANCE.createArchetype();
//		
//		Languge language = MyDslFactory.eINSTANCE.createLanguge();
//		
//		language.setName("ISO_639-1::en");
//		
//		Description description = MyDslFactory.eINSTANCE.createDescription();
//		
//		Details details = MyDslFactory.eINSTANCE.createDetails();
//		details.setCopyright("aa");
//		details.setLanguage("aa");
//		details.setName("aa");
//		details.setUse("aa");
//		OtherDetails other = MyDslFactory.eINSTANCE.createOtherDetails();
//		other.setCustodian_namespace("aa");
//		other.setIp_acknowledgement_loinc("aa");
//		other.setLicense("aa");
//		other.setLifecycle_state("aa");
//		other.setIp_acknowledgement_snomed("aa");
//		other.setCustodian_organization("aa");
//		
//		
//		details.setOther_details(other);
//		description.setDetails(details);
//		OriginalAuthor author = MyDslFactory.eINSTANCE.createOriginalAuthor();
//		author.setDate("aa");
//		author.setEmail("aa");
//		author.setName("aa");
//		author.setOrganization("aa");
//		description.setOriginalAuthor(author);
//		e.setDescription(description );
//		
//		e.setLanguage(language);
//		
//		e.setAdl_version("2.1.0");
//		e.setRm_release("0.0.5");
//		e.setName("CIMI-CORE-Address.address.v1.0.0");
//		
//		Matches amatch =  MyDslFactory.eINSTANCE.createMatches();
//		amatch.setDefinition("id1");
//		
//		Matches amatch2 =  MyDslFactory.eINSTANCE.createMatches();
//		amatch2.setDefinition("id2");
////		
//		amatch.setName("Address");
////		amatch.setValue("two");
//		
//		amatch2.setName("Concept");
//		amatch2.setValue("two");
//		amatch2.setValueDefinition("aaaaaa");
//		
//		amatch.getSubmatch().add(amatch2);
//		
////		amatch.setSubmatch(amatch2);
//		
//		Matches amatch3 =  MyDslFactory.eINSTANCE.createMatches();
//		
//		amatch3.setValue("PlainText");
//		amatch3.setValueDefinition("id5");
//		
//		amatch3.setName("addressAsText");
////		amatch3.setDefinition("id5");
//		
//		amatch.getSubmatch().add(amatch3);
//		
//		TermDefinitions terms = MyDslFactory.eINSTANCE.createTermDefinitions();
//		terms.setName("EN");
//		
//		TermDefinition td = MyDslFactory.eINSTANCE.createTermDefinition();
//		td.setName("id1");
//		td.setText("Address");
//		td.setDescription("Base class for addresses to be specialized based on regional and realm-specific needs.");
//		
//		terms.getElements().add(td );
//		
//		Terminology term = MyDslFactory.eINSTANCE.createTerminology();
//		
//		term.setTermDefinition(terms);
//		TermBindings bindings = MyDslFactory.eINSTANCE.createTermBindings();
//		bindings.setName("snomed");
//		TermBinding tb = MyDslFactory.eINSTANCE.createTermBinding();
//		tb.setName("ac2");
//		tb.setBinding("http://cimi.hl7.org/terminology/valueset/snomed-ct/Address/use/id2");
//		bindings.getElements().add(tb );
//		
//		term.setTermBinding(bindings);
//		
//		e.setTerminology(term );
//		amatch2.setValue("aaa");
//		amatch.setSubmatch(amatch2);
//		
////		MatchesValue mv =  MyDslFactory.eINSTANCE.createMatchesValue();
//		 
//	
//		Matches amatch3 =  MyDslFactory.eINSTANCE.createMatches();
//		amatch3.setName("Address3");
//		amatch3.setValue("aaa");
//		
//		amatch2.setSubmatch(amatch3);
//		e.setDefinition(amatch);
//		e.getDefinition().setSubmatch(amatch2);
//		e.getDefinition().add(amatch3);
		
//		domainmodel.getElements().add(e);
		
		 
		
	
		
		res2.getContents().add(profile);
		res2.save(null);
	}
	
	 

}
