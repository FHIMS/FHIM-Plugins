/*
 * generated by Xtext 2.12.0
 */
package org.standardhealh.cimpl.dsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.standardhealh.cimpl.dsl.ui.internal.DslActivator;

public class CimplUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DslActivator.getInstance().getInjector("org.standardhealh.cimpl.dsl.Cimpl");
	}

}