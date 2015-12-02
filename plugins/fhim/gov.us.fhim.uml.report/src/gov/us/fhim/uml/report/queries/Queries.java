package gov.us.fhim.uml.report.queries;

import java.util.ArrayList;
import java.util.TreeSet;

public class Queries {

	
	 public static ArrayList<String> getStandardBuckets(String standard){
		
		ArrayList<String> buckets = populateStandardHL7V2();
		
	
		return buckets;
	}
	 
	 private static void addHL7Segments(TreeSet<String> set,String segment) { 
			for (int ctr = 1; ctr <=50; ctr++) {
				set.add(segment+"-"+ctr);
			} 
	 }
	 
	 private static ArrayList<String>  populateStandardHL7V2() {
		 
			ArrayList<String> buckets = new ArrayList<String>();
			
			TreeSet<String> set = new TreeSet<String>();
			
			addHL7Segments(set,"AFF");
			addHL7Segments(set,"AL1");
			addHL7Segments(set,"BLG");
			addHL7Segments(set,"IAM");
			
			addHL7Segments(set,"IN1");
			addHL7Segments(set,"NK1");
			addHL7Segments(set,"OBR");
			addHL7Segments(set,"PD1");
			addHL7Segments(set,"PID");
			addHL7Segments(set,"PRB");
			addHL7Segments(set,"PV1");
			addHL7Segments(set,"RXA");
			addHL7Segments(set,"RXD");
			addHL7Segments(set,"RXO");
			addHL7Segments(set,"RXR");
			addHL7Segments(set,"SAC");
			addHL7Segments(set,"SPM");
			addHL7Segments(set,"TQ1");
//			addHL7Segments(set,"BLG");
//			addHL7Segments(set,"IAM");
			
				set.add("AFF-1");
			set.add("AFF-4");
			set.add("AL1-3");
			set.add("BLG-2");
			set.add("IAM-12");
			set.add("IAM-17");
			set.add("IN1-11");
			set.add("IN1-17");
			set.add("IN1-23");
			set.add("IN1-5");
			set.add("NK1-10");
			set.add("NK1-3");
			set.add("NK1-8");
			set.add("OBR-13");
			set.add("OBR-28");
			set.add("OBR-34");
			set.add("OBR-39");
			set.add("OBR-49");
			set.add("OBX-14");
			set.add("OBX-19");
			set.add("OBX-8");
			set.add("ORC-14");
			set.add("ORC-2");
			set.add("ORC-27");
			set.add("ORC-4");
			set.add("PD1-15");
			set.add("PID-17");
			set.add("PID-6");
			set.add("PRB-12");
			set.add("PRB-20");
			set.add("PRB-9");
			set.add("PV1-14");
			set.add("PV1-2");
			set.add("PV1-36");
			set.add("PV1-41");
			set.add("PV1-5");
			set.add("PV1-7");
			set.add("PV2-21");
			set.add("PV2-4");
			set.add("PV2-9");
			set.add("RXA-15");
			set.add("RXA-2");
			set.add("RXA-26");
			set.add("RXA-4");
			set.add("RXD-1");
			set.add("RXD-14");
			set.add("RXD-8");
			set.add("RXD-9");
			set.add("RXO-1");
			set.add("RXO-13");
			set.add("RXO-14");
			set.add("RXO-16");
			set.add("RXO-2");
			set.add("RXO-20");
			set.add("RXO-25");
			set.add("RXO-32");
			set.add("RXO-34");
			set.add("RXO-4");
			set.add("RXO-5");
			set.add("RXO-6");
			set.add("RXO-7");
			set.add("RXR-1");
			set.add("RXR-2");
			set.add("RXR-3");
			set.add("RXR-4");
			set.add("RXR-5");
			set.add("RXR-6");
			set.add("SAC-16");
			set.add("SAC-17");
			set.add("SAC-18");
			set.add("SAC-21");
			set.add("SAC-25");
			set.add("SAC-26");
			set.add("SAC-3");
			set.add("SAC-31");
			set.add("SPM-10");
			set.add("SPM-11");
			set.add("SPM-12");
			set.add("SPM-13");
			set.add("SPM-14");
			set.add("SPM-15");
			set.add("SPM-16");
			set.add("SPM-17");
			set.add("SPM-18");
			set.add("SPM-19");
			set.add("SPM-2");
			set.add("SPM-20");
			set.add("SPM-21");
			set.add("SPM-22");
			set.add("SPM-23");
			set.add("SPM-24");
			set.add("SPM-25");
			set.add("SPM-27");
			set.add("SPM-28");
			set.add("SPM-30");
			set.add("SPM-32");
			set.add("SPM-4");
			set.add("SPM-5");
			set.add("SPM-6");
			set.add("SPM-7");
			set.add("SPM-8");
			set.add("SPM-9");
			set.add("TQ1-6");
			set.add("TQ1-7");
			set.add("TQ1-8");
			set.add("TQ1-9");
			
			buckets.addAll(set);
			

			return buckets;
		 
	 }
}
