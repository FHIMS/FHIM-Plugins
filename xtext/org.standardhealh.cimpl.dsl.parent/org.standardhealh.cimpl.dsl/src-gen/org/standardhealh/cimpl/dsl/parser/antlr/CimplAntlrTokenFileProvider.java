/*
 * generated by Xtext 2.10.0
 */
package org.standardhealh.cimpl.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class CimplAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/standardhealh/cimpl/dsl/parser/antlr/internal/InternalCimpl.tokens");
	}
}
