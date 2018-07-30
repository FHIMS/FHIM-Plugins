package org.standardhealh.cimpl.dsl;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.standardhealh.cimpl.dsl.cimpl.CimplFactory;
import org.standardhealh.cimpl.dsl.cimpl.Doc;
import org.standardhealh.cimpl.dsl.cimpl.DocHeader;
import org.standardhealh.cimpl.dsl.cimpl.Element;
import org.standardhealh.cimpl.dsl.cimpl.EntryElement;
import org.standardhealh.cimpl.dsl.cimpl.Model;
import org.standardhealh.cimpl.dsl.cimpl.UsesStatement;
 
public class Test {

	@org.junit.Test
	public void test() throws IOException {
	new CimplStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		XtextResourceSet resourceSet = new XtextResourceSet();		
//		Resource res = resourceSet.getResource(URI.createFileURI("scr/scr1.mydsl"), true);
//		DslRoot script = (DslRoot)res.getContents().get(0);
		
		CimplFactory.eINSTANCE.createModel();
		Model m = CimplFactory.eINSTANCE.createModel();
		
		Doc doc = CimplFactory.eINSTANCE.createDoc() ;
		
//		doc.setDescription("description");
		
		DocHeader header  = CimplFactory.eINSTANCE.createDocHeader();
		header.setVersion("version");
		header.setNamespace("namespace");
		doc.setHeader(header);
		
		UsesStatement uses =   CimplFactory.eINSTANCE.createUsesStatement();
		
		uses.getNamespace().add("namespace");
		
		doc.setUses(uses);
		
		EntryElement entry= CimplFactory.eINSTANCE.createEntryElement();
		entry.setBasedOn("basedon");
		entry.setConcept("concept");
		entry.setDescription("description");
		entry.setName("name");
		entry.setValue("value");
		Element element = CimplFactory.eINSTANCE.createElement();
		element.setLower(0);
		element.setUpper(1);
		element.setName("name1");

		entry.getElements().add(element );
		
		element = CimplFactory.eINSTANCE.createElement();
		element.setLower(0);
		element.setUpper(1);
		element.setName("name2");

		entry.getElements().add(element );
		
		element = CimplFactory.eINSTANCE.createElement();
		element.setLower(0);
		element.setUpper(1);
		element.setName("name3");
		
		EntryElement subentry= CimplFactory.eINSTANCE.createEntryElement();
		subentry.setBasedOn("subbasedon");
		subentry.setConcept("subconcept");
		subentry.setDescription("subdescription");
		subentry.setName("subname");
		subentry.setValue("subvalue");

		entry.getSubelements().add(subentry);
		
		entry.getElements().add(element );
		
		 

//		entry.getElements().add(element );
		
		
		doc.getEntries().add(entry);
		
		
		m.setElements(doc );
		
		
		
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
		
		 
		
	
		
		res2.getContents().add(m);
		res2.save(null);
	}
	
	 

}
