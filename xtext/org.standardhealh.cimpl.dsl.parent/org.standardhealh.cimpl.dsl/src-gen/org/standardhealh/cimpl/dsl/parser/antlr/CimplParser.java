/*
 * generated by Xtext 2.12.0
 */
package org.standardhealh.cimpl.dsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.standardhealh.cimpl.dsl.parser.antlr.internal.InternalCimplParser;
import org.standardhealh.cimpl.dsl.services.CimplGrammarAccess;

public class CimplParser extends AbstractAntlrParser {

	@Inject
	private CimplGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalCimplParser createParser(XtextTokenStream stream) {
		return new InternalCimplParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Profile";
	}

	public CimplGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CimplGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}