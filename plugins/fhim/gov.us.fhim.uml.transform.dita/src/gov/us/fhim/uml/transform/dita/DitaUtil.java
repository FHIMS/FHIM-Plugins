package gov.us.fhim.uml.transform.dita;

import org.apache.commons.lang.StringUtils;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;

public class DitaUtil {

 /*
  * "This data element contains the actual content of [the document] if the sender chooses to send the document." - ICH E2B(R3), C.1.6.1.r.1 
  *  Medwatch 3500A form question C.1 (name), C.6 (lot), C.7 (exp date), C.9 (ndc)
  */
	
	public static Integer calculateCommentHeight(org.eclipse.uml2.uml.Element element) {		
		int commentLength = 0;
		for (Comment comment : element.getOwnedComments()) {
			if (!StringUtils.isEmpty(comment.getBody())) {
				commentLength += comment.getBody().length();
			}			
		}		
		
		int x = commentLength / 80; 
		return  (x+1) * 18;
		
	}
}
