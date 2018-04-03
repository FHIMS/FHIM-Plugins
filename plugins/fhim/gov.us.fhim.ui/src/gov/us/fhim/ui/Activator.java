package gov.us.fhim.ui;

import java.util.StringTokenizer;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "gov.us.fhim.ui"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	// The entry delimiter
	private static String PREFERENCE_DELIMITER = ";";

	private static String VALUE_IDENTIFIER = "=";

	private static String ENTRY_DELIMITER = ",";

	private static String KEY_DELIMITER = ";";

	// The identifiers for the preferences
	public static final String FHIR_TERM_SERVERS = "fhirtermservers";

	// public static final String HIGHLIGHT_PREFERENCE = "highlight";

	// The default values for the preferences
	// public static final String DEFAULT_BAD_WORDS = "bug;bogus;hack;";

	// public static final int DEFAULT_HIGHLIGHT = SWT.COLOR_BLUE;

	/**
	 * The constructor.
	 */
	// public BadWordCheckerPlugin(IPluginDescriptor descriptor) {
	// super(descriptor);
	// plugin = this;
	// }

	// /**
	// * Returns the shared instance.
	// */
	// public static BadWordCheckerPlugin getDefault() {
	// return plugin;
	// }

	/**
	 * Returns the workspace instance.
	 */
	public static IWorkspace getWorkspace() {
		return ResourcesPlugin.getWorkspace();
	}

	/**
	 * Initializes a preference store with default preference values
	 * for this plug-in.
	 * @param store the preference store to fill
	 */
	@Override
	protected void initializeDefaultPreferences(IPreferenceStore store) {
		store.setDefault(FHIR_TERM_SERVERS, "https://ontoserver.csiro.au/stu3-latest");
	}

	/**
	 * Return the bad words preference default
	 * as an array of Strings.
	 * @return String[]
	 */
	public String[] getDefaultFHIRTermServers() {
		return convert(getPreferenceStore().getDefaultString(FHIR_TERM_SERVERS));
	}

	/**
	* Return the bad words preference as an array of
	* Strings.
	* @return String[]
	*/
	public String[] getFHIRTermServers() {
		return convert(getPreferenceStore().getString(FHIR_TERM_SERVERS));
	}

	/**
	 * Convert the supplied PREFERENCE_DELIMITER delimited
	 * String to a String array.
	 * @return String[]
	 */
	private String[] convert(String preferenceValue) {
		StringTokenizer tokenizer = new StringTokenizer(preferenceValue, PREFERENCE_DELIMITER);
		int tokenCount = tokenizer.countTokens();
		String[] elements = new String[tokenCount];

		for (int i = 0; i < tokenCount; i++) {
			elements[i] = tokenizer.nextToken();
		}

		return elements;
	}

	/**
	 * Set the bad words preference
	 * @param String [] elements - the Strings to be
	 * 	converted to the preference value
	 */
	public void setFHIRTermServers(String[] elements) {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < elements.length; i++) {
			buffer.append(elements[i]);
			buffer.append(PREFERENCE_DELIMITER);
		}
		getPreferenceStore().setValue(FHIR_TERM_SERVERS, buffer.toString());
	}
}
