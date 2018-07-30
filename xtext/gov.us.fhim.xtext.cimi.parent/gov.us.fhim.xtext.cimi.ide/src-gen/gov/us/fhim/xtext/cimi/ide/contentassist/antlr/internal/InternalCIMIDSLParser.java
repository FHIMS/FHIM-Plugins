package gov.us.fhim.xtext.cimi.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import gov.us.fhim.xtext.cimi.services.CIMIDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCIMIDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_MYSTRING", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'archetype'", "'('", "'adl_version='", "';'", "'rm_release='", "'generated'", "')\\r'", "'\\r'", "'language\\r'", "'description\\r'", "'definition\\r'", "'terminology\\r'", "'original_author'", "'='", "'<'", "'>'", "'details'", "'\"['", "']\"'", "'language'", "'<['", "']>'", "'use'", "'copyright'", "'other_details'", "'[\"lifecycle_state\"]'", "'[\"custodian_namespace\"]'", "'[\"custodian_organization\"]'", "'[\"license\"]'", "'[\"ip_acknowledgement_loinc\"]'", "'[\"ip_acknowledgement_snomed\"]'", "'[\"date\"]'", "'[\"organization\"]'", "'[\"name\"]'", "'[\"email\"]'", "'original_language'", "'matches'", "'{\\r'", "'}\\r'", "'['", "']'", "'term_definitions'", "'term_bindings'", "'text'", "'description'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_MYSTRING=4;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalCIMIDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCIMIDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCIMIDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCIMIDSL.g"; }


    	private CIMIDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(CIMIDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleArchetypeModel"
    // InternalCIMIDSL.g:53:1: entryRuleArchetypeModel : ruleArchetypeModel EOF ;
    public final void entryRuleArchetypeModel() throws RecognitionException {
        try {
            // InternalCIMIDSL.g:54:1: ( ruleArchetypeModel EOF )
            // InternalCIMIDSL.g:55:1: ruleArchetypeModel EOF
            {
             before(grammarAccess.getArchetypeModelRule()); 
            pushFollow(FOLLOW_1);
            ruleArchetypeModel();

            state._fsp--;

             after(grammarAccess.getArchetypeModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArchetypeModel"


    // $ANTLR start "ruleArchetypeModel"
    // InternalCIMIDSL.g:62:1: ruleArchetypeModel : ( ( rule__ArchetypeModel__ElementsAssignment )* ) ;
    public final void ruleArchetypeModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:66:2: ( ( ( rule__ArchetypeModel__ElementsAssignment )* ) )
            // InternalCIMIDSL.g:67:2: ( ( rule__ArchetypeModel__ElementsAssignment )* )
            {
            // InternalCIMIDSL.g:67:2: ( ( rule__ArchetypeModel__ElementsAssignment )* )
            // InternalCIMIDSL.g:68:3: ( rule__ArchetypeModel__ElementsAssignment )*
            {
             before(grammarAccess.getArchetypeModelAccess().getElementsAssignment()); 
            // InternalCIMIDSL.g:69:3: ( rule__ArchetypeModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCIMIDSL.g:69:4: rule__ArchetypeModel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ArchetypeModel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getArchetypeModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArchetypeModel"


    // $ANTLR start "entryRuleArchetype"
    // InternalCIMIDSL.g:78:1: entryRuleArchetype : ruleArchetype EOF ;
    public final void entryRuleArchetype() throws RecognitionException {
        try {
            // InternalCIMIDSL.g:79:1: ( ruleArchetype EOF )
            // InternalCIMIDSL.g:80:1: ruleArchetype EOF
            {
             before(grammarAccess.getArchetypeRule()); 
            pushFollow(FOLLOW_1);
            ruleArchetype();

            state._fsp--;

             after(grammarAccess.getArchetypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArchetype"


    // $ANTLR start "ruleArchetype"
    // InternalCIMIDSL.g:87:1: ruleArchetype : ( ( rule__Archetype__Group__0 ) ) ;
    public final void ruleArchetype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:91:2: ( ( ( rule__Archetype__Group__0 ) ) )
            // InternalCIMIDSL.g:92:2: ( ( rule__Archetype__Group__0 ) )
            {
            // InternalCIMIDSL.g:92:2: ( ( rule__Archetype__Group__0 ) )
            // InternalCIMIDSL.g:93:3: ( rule__Archetype__Group__0 )
            {
             before(grammarAccess.getArchetypeAccess().getGroup()); 
            // InternalCIMIDSL.g:94:3: ( rule__Archetype__Group__0 )
            // InternalCIMIDSL.g:94:4: rule__Archetype__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Archetype__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArchetypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArchetype"


    // $ANTLR start "entryRuleDescription"
    // InternalCIMIDSL.g:103:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalCIMIDSL.g:104:1: ( ruleDescription EOF )
            // InternalCIMIDSL.g:105:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalCIMIDSL.g:112:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:116:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalCIMIDSL.g:117:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalCIMIDSL.g:117:2: ( ( rule__Description__Group__0 ) )
            // InternalCIMIDSL.g:118:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalCIMIDSL.g:119:3: ( rule__Description__Group__0 )
            // InternalCIMIDSL.g:119:4: rule__Description__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleDetails"
    // InternalCIMIDSL.g:128:1: entryRuleDetails : ruleDetails EOF ;
    public final void entryRuleDetails() throws RecognitionException {
        try {
            // InternalCIMIDSL.g:129:1: ( ruleDetails EOF )
            // InternalCIMIDSL.g:130:1: ruleDetails EOF
            {
             before(grammarAccess.getDetailsRule()); 
            pushFollow(FOLLOW_1);
            ruleDetails();

            state._fsp--;

             after(grammarAccess.getDetailsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDetails"


    // $ANTLR start "ruleDetails"
    // InternalCIMIDSL.g:137:1: ruleDetails : ( ( rule__Details__Group__0 ) ) ;
    public final void ruleDetails() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:141:2: ( ( ( rule__Details__Group__0 ) ) )
            // InternalCIMIDSL.g:142:2: ( ( rule__Details__Group__0 ) )
            {
            // InternalCIMIDSL.g:142:2: ( ( rule__Details__Group__0 ) )
            // InternalCIMIDSL.g:143:3: ( rule__Details__Group__0 )
            {
             before(grammarAccess.getDetailsAccess().getGroup()); 
            // InternalCIMIDSL.g:144:3: ( rule__Details__Group__0 )
            // InternalCIMIDSL.g:144:4: rule__Details__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Details__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDetailsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDetails"


    // $ANTLR start "entryRuleOtherDetails"
    // InternalCIMIDSL.g:153:1: entryRuleOtherDetails : ruleOtherDetails EOF ;
    public final void entryRuleOtherDetails() throws RecognitionException {
        try {
            // InternalCIMIDSL.g:154:1: ( ruleOtherDetails EOF )
            // InternalCIMIDSL.g:155:1: ruleOtherDetails EOF
            {
             before(grammarAccess.getOtherDetailsRule()); 
            pushFollow(FOLLOW_1);
            ruleOtherDetails();

            state._fsp--;

             after(grammarAccess.getOtherDetailsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOtherDetails"


    // $ANTLR start "ruleOtherDetails"
    // InternalCIMIDSL.g:162:1: ruleOtherDetails : ( ( rule__OtherDetails__Group__0 ) ) ;
    public final void ruleOtherDetails() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:166:2: ( ( ( rule__OtherDetails__Group__0 ) ) )
            // InternalCIMIDSL.g:167:2: ( ( rule__OtherDetails__Group__0 ) )
            {
            // InternalCIMIDSL.g:167:2: ( ( rule__OtherDetails__Group__0 ) )
            // InternalCIMIDSL.g:168:3: ( rule__OtherDetails__Group__0 )
            {
             before(grammarAccess.getOtherDetailsAccess().getGroup()); 
            // InternalCIMIDSL.g:169:3: ( rule__OtherDetails__Group__0 )
            // InternalCIMIDSL.g:169:4: rule__OtherDetails__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOtherDetailsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOtherDetails"


    // $ANTLR start "entryRuleOriginalAuthor"
    // InternalCIMIDSL.g:178:1: entryRuleOriginalAuthor : ruleOriginalAuthor EOF ;
    public final void entryRuleOriginalAuthor() throws RecognitionException {
        try {
            // InternalCIMIDSL.g:179:1: ( ruleOriginalAuthor EOF )
            // InternalCIMIDSL.g:180:1: ruleOriginalAuthor EOF
            {
             before(grammarAccess.getOriginalAuthorRule()); 
            pushFollow(FOLLOW_1);
            ruleOriginalAuthor();

            state._fsp--;

             after(grammarAccess.getOriginalAuthorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOriginalAuthor"


    // $ANTLR start "ruleOriginalAuthor"
    // InternalCIMIDSL.g:187:1: ruleOriginalAuthor : ( ( rule__OriginalAuthor__Group__0 ) ) ;
    public final void ruleOriginalAuthor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:191:2: ( ( ( rule__OriginalAuthor__Group__0 ) ) )
            // InternalCIMIDSL.g:192:2: ( ( rule__OriginalAuthor__Group__0 ) )
            {
            // InternalCIMIDSL.g:192:2: ( ( rule__OriginalAuthor__Group__0 ) )
            // InternalCIMIDSL.g:193:3: ( rule__OriginalAuthor__Group__0 )
            {
             before(grammarAccess.getOriginalAuthorAccess().getGroup()); 
            // InternalCIMIDSL.g:194:3: ( rule__OriginalAuthor__Group__0 )
            // InternalCIMIDSL.g:194:4: rule__OriginalAuthor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOriginalAuthorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOriginalAuthor"


    // $ANTLR start "entryRuleLanguge"
    // InternalCIMIDSL.g:203:1: entryRuleLanguge : ruleLanguge EOF ;
    public final void entryRuleLanguge() throws RecognitionException {
        try {
            // InternalCIMIDSL.g:204:1: ( ruleLanguge EOF )
            // InternalCIMIDSL.g:205:1: ruleLanguge EOF
            {
             before(grammarAccess.getLangugeRule()); 
            pushFollow(FOLLOW_1);
            ruleLanguge();

            state._fsp--;

             after(grammarAccess.getLangugeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLanguge"


    // $ANTLR start "ruleLanguge"
    // InternalCIMIDSL.g:212:1: ruleLanguge : ( ( rule__Languge__Group__0 ) ) ;
    public final void ruleLanguge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:216:2: ( ( ( rule__Languge__Group__0 ) ) )
            // InternalCIMIDSL.g:217:2: ( ( rule__Languge__Group__0 ) )
            {
            // InternalCIMIDSL.g:217:2: ( ( rule__Languge__Group__0 ) )
            // InternalCIMIDSL.g:218:3: ( rule__Languge__Group__0 )
            {
             before(grammarAccess.getLangugeAccess().getGroup()); 
            // InternalCIMIDSL.g:219:3: ( rule__Languge__Group__0 )
            // InternalCIMIDSL.g:219:4: rule__Languge__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Languge__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLangugeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLanguge"


    // $ANTLR start "entryRuleMatches"
    // InternalCIMIDSL.g:228:1: entryRuleMatches : ruleMatches EOF ;
    public final void entryRuleMatches() throws RecognitionException {
        try {
            // InternalCIMIDSL.g:229:1: ( ruleMatches EOF )
            // InternalCIMIDSL.g:230:1: ruleMatches EOF
            {
             before(grammarAccess.getMatchesRule()); 
            pushFollow(FOLLOW_1);
            ruleMatches();

            state._fsp--;

             after(grammarAccess.getMatchesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMatches"


    // $ANTLR start "ruleMatches"
    // InternalCIMIDSL.g:237:1: ruleMatches : ( ( rule__Matches__Group__0 ) ) ;
    public final void ruleMatches() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:241:2: ( ( ( rule__Matches__Group__0 ) ) )
            // InternalCIMIDSL.g:242:2: ( ( rule__Matches__Group__0 ) )
            {
            // InternalCIMIDSL.g:242:2: ( ( rule__Matches__Group__0 ) )
            // InternalCIMIDSL.g:243:3: ( rule__Matches__Group__0 )
            {
             before(grammarAccess.getMatchesAccess().getGroup()); 
            // InternalCIMIDSL.g:244:3: ( rule__Matches__Group__0 )
            // InternalCIMIDSL.g:244:4: rule__Matches__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Matches__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMatchesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatches"


    // $ANTLR start "entryRuleTerminology"
    // InternalCIMIDSL.g:253:1: entryRuleTerminology : ruleTerminology EOF ;
    public final void entryRuleTerminology() throws RecognitionException {
        try {
            // InternalCIMIDSL.g:254:1: ( ruleTerminology EOF )
            // InternalCIMIDSL.g:255:1: ruleTerminology EOF
            {
             before(grammarAccess.getTerminologyRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminology();

            state._fsp--;

             after(grammarAccess.getTerminologyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminology"


    // $ANTLR start "ruleTerminology"
    // InternalCIMIDSL.g:262:1: ruleTerminology : ( ( rule__Terminology__Group__0 ) ) ;
    public final void ruleTerminology() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:266:2: ( ( ( rule__Terminology__Group__0 ) ) )
            // InternalCIMIDSL.g:267:2: ( ( rule__Terminology__Group__0 ) )
            {
            // InternalCIMIDSL.g:267:2: ( ( rule__Terminology__Group__0 ) )
            // InternalCIMIDSL.g:268:3: ( rule__Terminology__Group__0 )
            {
             before(grammarAccess.getTerminologyAccess().getGroup()); 
            // InternalCIMIDSL.g:269:3: ( rule__Terminology__Group__0 )
            // InternalCIMIDSL.g:269:4: rule__Terminology__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Terminology__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTerminologyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminology"


    // $ANTLR start "entryRuleTermDefinitions"
    // InternalCIMIDSL.g:278:1: entryRuleTermDefinitions : ruleTermDefinitions EOF ;
    public final void entryRuleTermDefinitions() throws RecognitionException {
        try {
            // InternalCIMIDSL.g:279:1: ( ruleTermDefinitions EOF )
            // InternalCIMIDSL.g:280:1: ruleTermDefinitions EOF
            {
             before(grammarAccess.getTermDefinitionsRule()); 
            pushFollow(FOLLOW_1);
            ruleTermDefinitions();

            state._fsp--;

             after(grammarAccess.getTermDefinitionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTermDefinitions"


    // $ANTLR start "ruleTermDefinitions"
    // InternalCIMIDSL.g:287:1: ruleTermDefinitions : ( ( rule__TermDefinitions__Group__0 ) ) ;
    public final void ruleTermDefinitions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:291:2: ( ( ( rule__TermDefinitions__Group__0 ) ) )
            // InternalCIMIDSL.g:292:2: ( ( rule__TermDefinitions__Group__0 ) )
            {
            // InternalCIMIDSL.g:292:2: ( ( rule__TermDefinitions__Group__0 ) )
            // InternalCIMIDSL.g:293:3: ( rule__TermDefinitions__Group__0 )
            {
             before(grammarAccess.getTermDefinitionsAccess().getGroup()); 
            // InternalCIMIDSL.g:294:3: ( rule__TermDefinitions__Group__0 )
            // InternalCIMIDSL.g:294:4: rule__TermDefinitions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TermDefinitions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermDefinitionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTermDefinitions"


    // $ANTLR start "entryRuleTermBindings"
    // InternalCIMIDSL.g:303:1: entryRuleTermBindings : ruleTermBindings EOF ;
    public final void entryRuleTermBindings() throws RecognitionException {
        try {
            // InternalCIMIDSL.g:304:1: ( ruleTermBindings EOF )
            // InternalCIMIDSL.g:305:1: ruleTermBindings EOF
            {
             before(grammarAccess.getTermBindingsRule()); 
            pushFollow(FOLLOW_1);
            ruleTermBindings();

            state._fsp--;

             after(grammarAccess.getTermBindingsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTermBindings"


    // $ANTLR start "ruleTermBindings"
    // InternalCIMIDSL.g:312:1: ruleTermBindings : ( ( rule__TermBindings__Group__0 ) ) ;
    public final void ruleTermBindings() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:316:2: ( ( ( rule__TermBindings__Group__0 ) ) )
            // InternalCIMIDSL.g:317:2: ( ( rule__TermBindings__Group__0 ) )
            {
            // InternalCIMIDSL.g:317:2: ( ( rule__TermBindings__Group__0 ) )
            // InternalCIMIDSL.g:318:3: ( rule__TermBindings__Group__0 )
            {
             before(grammarAccess.getTermBindingsAccess().getGroup()); 
            // InternalCIMIDSL.g:319:3: ( rule__TermBindings__Group__0 )
            // InternalCIMIDSL.g:319:4: rule__TermBindings__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TermBindings__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermBindingsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTermBindings"


    // $ANTLR start "entryRuleTermDefinition"
    // InternalCIMIDSL.g:328:1: entryRuleTermDefinition : ruleTermDefinition EOF ;
    public final void entryRuleTermDefinition() throws RecognitionException {
        try {
            // InternalCIMIDSL.g:329:1: ( ruleTermDefinition EOF )
            // InternalCIMIDSL.g:330:1: ruleTermDefinition EOF
            {
             before(grammarAccess.getTermDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTermDefinition();

            state._fsp--;

             after(grammarAccess.getTermDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTermDefinition"


    // $ANTLR start "ruleTermDefinition"
    // InternalCIMIDSL.g:337:1: ruleTermDefinition : ( ( rule__TermDefinition__Group__0 ) ) ;
    public final void ruleTermDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:341:2: ( ( ( rule__TermDefinition__Group__0 ) ) )
            // InternalCIMIDSL.g:342:2: ( ( rule__TermDefinition__Group__0 ) )
            {
            // InternalCIMIDSL.g:342:2: ( ( rule__TermDefinition__Group__0 ) )
            // InternalCIMIDSL.g:343:3: ( rule__TermDefinition__Group__0 )
            {
             before(grammarAccess.getTermDefinitionAccess().getGroup()); 
            // InternalCIMIDSL.g:344:3: ( rule__TermDefinition__Group__0 )
            // InternalCIMIDSL.g:344:4: rule__TermDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TermDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTermDefinition"


    // $ANTLR start "entryRuleTermBinding"
    // InternalCIMIDSL.g:353:1: entryRuleTermBinding : ruleTermBinding EOF ;
    public final void entryRuleTermBinding() throws RecognitionException {
        try {
            // InternalCIMIDSL.g:354:1: ( ruleTermBinding EOF )
            // InternalCIMIDSL.g:355:1: ruleTermBinding EOF
            {
             before(grammarAccess.getTermBindingRule()); 
            pushFollow(FOLLOW_1);
            ruleTermBinding();

            state._fsp--;

             after(grammarAccess.getTermBindingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTermBinding"


    // $ANTLR start "ruleTermBinding"
    // InternalCIMIDSL.g:362:1: ruleTermBinding : ( ( rule__TermBinding__Group__0 ) ) ;
    public final void ruleTermBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:366:2: ( ( ( rule__TermBinding__Group__0 ) ) )
            // InternalCIMIDSL.g:367:2: ( ( rule__TermBinding__Group__0 ) )
            {
            // InternalCIMIDSL.g:367:2: ( ( rule__TermBinding__Group__0 ) )
            // InternalCIMIDSL.g:368:3: ( rule__TermBinding__Group__0 )
            {
             before(grammarAccess.getTermBindingAccess().getGroup()); 
            // InternalCIMIDSL.g:369:3: ( rule__TermBinding__Group__0 )
            // InternalCIMIDSL.g:369:4: rule__TermBinding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TermBinding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermBindingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTermBinding"


    // $ANTLR start "rule__Matches__Alternatives_4"
    // InternalCIMIDSL.g:377:1: rule__Matches__Alternatives_4 : ( ( ( rule__Matches__SubmatchAssignment_4_0 )* ) | ( ( rule__Matches__Group_4_1__0 ) ) );
    public final void rule__Matches__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:381:1: ( ( ( rule__Matches__SubmatchAssignment_4_0 )* ) | ( ( rule__Matches__Group_4_1__0 ) ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case RULE_MYSTRING:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==51) ) {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4==RULE_MYSTRING) ) {
                        int LA3_5 = input.LA(4);

                        if ( (LA3_5==52) ) {
                            int LA3_6 = input.LA(5);

                            if ( (LA3_6==48) ) {
                                alt3=1;
                            }
                            else if ( (LA3_6==50) ) {
                                alt3=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA3_1==48) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 50:
                {
                alt3=1;
                }
                break;
            case 51:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalCIMIDSL.g:382:2: ( ( rule__Matches__SubmatchAssignment_4_0 )* )
                    {
                    // InternalCIMIDSL.g:382:2: ( ( rule__Matches__SubmatchAssignment_4_0 )* )
                    // InternalCIMIDSL.g:383:3: ( rule__Matches__SubmatchAssignment_4_0 )*
                    {
                     before(grammarAccess.getMatchesAccess().getSubmatchAssignment_4_0()); 
                    // InternalCIMIDSL.g:384:3: ( rule__Matches__SubmatchAssignment_4_0 )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_MYSTRING) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalCIMIDSL.g:384:4: rule__Matches__SubmatchAssignment_4_0
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__Matches__SubmatchAssignment_4_0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                     after(grammarAccess.getMatchesAccess().getSubmatchAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCIMIDSL.g:388:2: ( ( rule__Matches__Group_4_1__0 ) )
                    {
                    // InternalCIMIDSL.g:388:2: ( ( rule__Matches__Group_4_1__0 ) )
                    // InternalCIMIDSL.g:389:3: ( rule__Matches__Group_4_1__0 )
                    {
                     before(grammarAccess.getMatchesAccess().getGroup_4_1()); 
                    // InternalCIMIDSL.g:390:3: ( rule__Matches__Group_4_1__0 )
                    // InternalCIMIDSL.g:390:4: rule__Matches__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Matches__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMatchesAccess().getGroup_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__Alternatives_4"


    // $ANTLR start "rule__Archetype__Group__0"
    // InternalCIMIDSL.g:398:1: rule__Archetype__Group__0 : rule__Archetype__Group__0__Impl rule__Archetype__Group__1 ;
    public final void rule__Archetype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:402:1: ( rule__Archetype__Group__0__Impl rule__Archetype__Group__1 )
            // InternalCIMIDSL.g:403:2: rule__Archetype__Group__0__Impl rule__Archetype__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Archetype__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__0"


    // $ANTLR start "rule__Archetype__Group__0__Impl"
    // InternalCIMIDSL.g:410:1: rule__Archetype__Group__0__Impl : ( 'archetype' ) ;
    public final void rule__Archetype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:414:1: ( ( 'archetype' ) )
            // InternalCIMIDSL.g:415:1: ( 'archetype' )
            {
            // InternalCIMIDSL.g:415:1: ( 'archetype' )
            // InternalCIMIDSL.g:416:2: 'archetype'
            {
             before(grammarAccess.getArchetypeAccess().getArchetypeKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getArchetypeAccess().getArchetypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__0__Impl"


    // $ANTLR start "rule__Archetype__Group__1"
    // InternalCIMIDSL.g:425:1: rule__Archetype__Group__1 : rule__Archetype__Group__1__Impl rule__Archetype__Group__2 ;
    public final void rule__Archetype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:429:1: ( rule__Archetype__Group__1__Impl rule__Archetype__Group__2 )
            // InternalCIMIDSL.g:430:2: rule__Archetype__Group__1__Impl rule__Archetype__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Archetype__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__1"


    // $ANTLR start "rule__Archetype__Group__1__Impl"
    // InternalCIMIDSL.g:437:1: rule__Archetype__Group__1__Impl : ( '(' ) ;
    public final void rule__Archetype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:441:1: ( ( '(' ) )
            // InternalCIMIDSL.g:442:1: ( '(' )
            {
            // InternalCIMIDSL.g:442:1: ( '(' )
            // InternalCIMIDSL.g:443:2: '('
            {
             before(grammarAccess.getArchetypeAccess().getLeftParenthesisKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getArchetypeAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__1__Impl"


    // $ANTLR start "rule__Archetype__Group__2"
    // InternalCIMIDSL.g:452:1: rule__Archetype__Group__2 : rule__Archetype__Group__2__Impl rule__Archetype__Group__3 ;
    public final void rule__Archetype__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:456:1: ( rule__Archetype__Group__2__Impl rule__Archetype__Group__3 )
            // InternalCIMIDSL.g:457:2: rule__Archetype__Group__2__Impl rule__Archetype__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Archetype__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__2"


    // $ANTLR start "rule__Archetype__Group__2__Impl"
    // InternalCIMIDSL.g:464:1: rule__Archetype__Group__2__Impl : ( 'adl_version=' ) ;
    public final void rule__Archetype__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:468:1: ( ( 'adl_version=' ) )
            // InternalCIMIDSL.g:469:1: ( 'adl_version=' )
            {
            // InternalCIMIDSL.g:469:1: ( 'adl_version=' )
            // InternalCIMIDSL.g:470:2: 'adl_version='
            {
             before(grammarAccess.getArchetypeAccess().getAdl_versionKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getArchetypeAccess().getAdl_versionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__2__Impl"


    // $ANTLR start "rule__Archetype__Group__3"
    // InternalCIMIDSL.g:479:1: rule__Archetype__Group__3 : rule__Archetype__Group__3__Impl rule__Archetype__Group__4 ;
    public final void rule__Archetype__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:483:1: ( rule__Archetype__Group__3__Impl rule__Archetype__Group__4 )
            // InternalCIMIDSL.g:484:2: rule__Archetype__Group__3__Impl rule__Archetype__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Archetype__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__3"


    // $ANTLR start "rule__Archetype__Group__3__Impl"
    // InternalCIMIDSL.g:491:1: rule__Archetype__Group__3__Impl : ( ( rule__Archetype__Adl_versionAssignment_3 ) ) ;
    public final void rule__Archetype__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:495:1: ( ( ( rule__Archetype__Adl_versionAssignment_3 ) ) )
            // InternalCIMIDSL.g:496:1: ( ( rule__Archetype__Adl_versionAssignment_3 ) )
            {
            // InternalCIMIDSL.g:496:1: ( ( rule__Archetype__Adl_versionAssignment_3 ) )
            // InternalCIMIDSL.g:497:2: ( rule__Archetype__Adl_versionAssignment_3 )
            {
             before(grammarAccess.getArchetypeAccess().getAdl_versionAssignment_3()); 
            // InternalCIMIDSL.g:498:2: ( rule__Archetype__Adl_versionAssignment_3 )
            // InternalCIMIDSL.g:498:3: rule__Archetype__Adl_versionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Archetype__Adl_versionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getArchetypeAccess().getAdl_versionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__3__Impl"


    // $ANTLR start "rule__Archetype__Group__4"
    // InternalCIMIDSL.g:506:1: rule__Archetype__Group__4 : rule__Archetype__Group__4__Impl rule__Archetype__Group__5 ;
    public final void rule__Archetype__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:510:1: ( rule__Archetype__Group__4__Impl rule__Archetype__Group__5 )
            // InternalCIMIDSL.g:511:2: rule__Archetype__Group__4__Impl rule__Archetype__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Archetype__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__4"


    // $ANTLR start "rule__Archetype__Group__4__Impl"
    // InternalCIMIDSL.g:518:1: rule__Archetype__Group__4__Impl : ( ';' ) ;
    public final void rule__Archetype__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:522:1: ( ( ';' ) )
            // InternalCIMIDSL.g:523:1: ( ';' )
            {
            // InternalCIMIDSL.g:523:1: ( ';' )
            // InternalCIMIDSL.g:524:2: ';'
            {
             before(grammarAccess.getArchetypeAccess().getSemicolonKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getArchetypeAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__4__Impl"


    // $ANTLR start "rule__Archetype__Group__5"
    // InternalCIMIDSL.g:533:1: rule__Archetype__Group__5 : rule__Archetype__Group__5__Impl rule__Archetype__Group__6 ;
    public final void rule__Archetype__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:537:1: ( rule__Archetype__Group__5__Impl rule__Archetype__Group__6 )
            // InternalCIMIDSL.g:538:2: rule__Archetype__Group__5__Impl rule__Archetype__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Archetype__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__5"


    // $ANTLR start "rule__Archetype__Group__5__Impl"
    // InternalCIMIDSL.g:545:1: rule__Archetype__Group__5__Impl : ( 'rm_release=' ) ;
    public final void rule__Archetype__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:549:1: ( ( 'rm_release=' ) )
            // InternalCIMIDSL.g:550:1: ( 'rm_release=' )
            {
            // InternalCIMIDSL.g:550:1: ( 'rm_release=' )
            // InternalCIMIDSL.g:551:2: 'rm_release='
            {
             before(grammarAccess.getArchetypeAccess().getRm_releaseKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getArchetypeAccess().getRm_releaseKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__5__Impl"


    // $ANTLR start "rule__Archetype__Group__6"
    // InternalCIMIDSL.g:560:1: rule__Archetype__Group__6 : rule__Archetype__Group__6__Impl rule__Archetype__Group__7 ;
    public final void rule__Archetype__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:564:1: ( rule__Archetype__Group__6__Impl rule__Archetype__Group__7 )
            // InternalCIMIDSL.g:565:2: rule__Archetype__Group__6__Impl rule__Archetype__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Archetype__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__6"


    // $ANTLR start "rule__Archetype__Group__6__Impl"
    // InternalCIMIDSL.g:572:1: rule__Archetype__Group__6__Impl : ( ( rule__Archetype__Rm_releaseAssignment_6 ) ) ;
    public final void rule__Archetype__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:576:1: ( ( ( rule__Archetype__Rm_releaseAssignment_6 ) ) )
            // InternalCIMIDSL.g:577:1: ( ( rule__Archetype__Rm_releaseAssignment_6 ) )
            {
            // InternalCIMIDSL.g:577:1: ( ( rule__Archetype__Rm_releaseAssignment_6 ) )
            // InternalCIMIDSL.g:578:2: ( rule__Archetype__Rm_releaseAssignment_6 )
            {
             before(grammarAccess.getArchetypeAccess().getRm_releaseAssignment_6()); 
            // InternalCIMIDSL.g:579:2: ( rule__Archetype__Rm_releaseAssignment_6 )
            // InternalCIMIDSL.g:579:3: rule__Archetype__Rm_releaseAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Archetype__Rm_releaseAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getArchetypeAccess().getRm_releaseAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__6__Impl"


    // $ANTLR start "rule__Archetype__Group__7"
    // InternalCIMIDSL.g:587:1: rule__Archetype__Group__7 : rule__Archetype__Group__7__Impl rule__Archetype__Group__8 ;
    public final void rule__Archetype__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:591:1: ( rule__Archetype__Group__7__Impl rule__Archetype__Group__8 )
            // InternalCIMIDSL.g:592:2: rule__Archetype__Group__7__Impl rule__Archetype__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Archetype__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__7"


    // $ANTLR start "rule__Archetype__Group__7__Impl"
    // InternalCIMIDSL.g:599:1: rule__Archetype__Group__7__Impl : ( ';' ) ;
    public final void rule__Archetype__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:603:1: ( ( ';' ) )
            // InternalCIMIDSL.g:604:1: ( ';' )
            {
            // InternalCIMIDSL.g:604:1: ( ';' )
            // InternalCIMIDSL.g:605:2: ';'
            {
             before(grammarAccess.getArchetypeAccess().getSemicolonKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getArchetypeAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__7__Impl"


    // $ANTLR start "rule__Archetype__Group__8"
    // InternalCIMIDSL.g:614:1: rule__Archetype__Group__8 : rule__Archetype__Group__8__Impl rule__Archetype__Group__9 ;
    public final void rule__Archetype__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:618:1: ( rule__Archetype__Group__8__Impl rule__Archetype__Group__9 )
            // InternalCIMIDSL.g:619:2: rule__Archetype__Group__8__Impl rule__Archetype__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Archetype__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__8"


    // $ANTLR start "rule__Archetype__Group__8__Impl"
    // InternalCIMIDSL.g:626:1: rule__Archetype__Group__8__Impl : ( 'generated' ) ;
    public final void rule__Archetype__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:630:1: ( ( 'generated' ) )
            // InternalCIMIDSL.g:631:1: ( 'generated' )
            {
            // InternalCIMIDSL.g:631:1: ( 'generated' )
            // InternalCIMIDSL.g:632:2: 'generated'
            {
             before(grammarAccess.getArchetypeAccess().getGeneratedKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getArchetypeAccess().getGeneratedKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__8__Impl"


    // $ANTLR start "rule__Archetype__Group__9"
    // InternalCIMIDSL.g:641:1: rule__Archetype__Group__9 : rule__Archetype__Group__9__Impl rule__Archetype__Group__10 ;
    public final void rule__Archetype__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:645:1: ( rule__Archetype__Group__9__Impl rule__Archetype__Group__10 )
            // InternalCIMIDSL.g:646:2: rule__Archetype__Group__9__Impl rule__Archetype__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__Archetype__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__9"


    // $ANTLR start "rule__Archetype__Group__9__Impl"
    // InternalCIMIDSL.g:653:1: rule__Archetype__Group__9__Impl : ( ')\\r' ) ;
    public final void rule__Archetype__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:657:1: ( ( ')\\r' ) )
            // InternalCIMIDSL.g:658:1: ( ')\\r' )
            {
            // InternalCIMIDSL.g:658:1: ( ')\\r' )
            // InternalCIMIDSL.g:659:2: ')\\r'
            {
             before(grammarAccess.getArchetypeAccess().getRightParenthesisControl000dKeyword_9()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getArchetypeAccess().getRightParenthesisControl000dKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__9__Impl"


    // $ANTLR start "rule__Archetype__Group__10"
    // InternalCIMIDSL.g:668:1: rule__Archetype__Group__10 : rule__Archetype__Group__10__Impl rule__Archetype__Group__11 ;
    public final void rule__Archetype__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:672:1: ( rule__Archetype__Group__10__Impl rule__Archetype__Group__11 )
            // InternalCIMIDSL.g:673:2: rule__Archetype__Group__10__Impl rule__Archetype__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__Archetype__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__10"


    // $ANTLR start "rule__Archetype__Group__10__Impl"
    // InternalCIMIDSL.g:680:1: rule__Archetype__Group__10__Impl : ( ( rule__Archetype__NameAssignment_10 ) ) ;
    public final void rule__Archetype__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:684:1: ( ( ( rule__Archetype__NameAssignment_10 ) ) )
            // InternalCIMIDSL.g:685:1: ( ( rule__Archetype__NameAssignment_10 ) )
            {
            // InternalCIMIDSL.g:685:1: ( ( rule__Archetype__NameAssignment_10 ) )
            // InternalCIMIDSL.g:686:2: ( rule__Archetype__NameAssignment_10 )
            {
             before(grammarAccess.getArchetypeAccess().getNameAssignment_10()); 
            // InternalCIMIDSL.g:687:2: ( rule__Archetype__NameAssignment_10 )
            // InternalCIMIDSL.g:687:3: rule__Archetype__NameAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Archetype__NameAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getArchetypeAccess().getNameAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__10__Impl"


    // $ANTLR start "rule__Archetype__Group__11"
    // InternalCIMIDSL.g:695:1: rule__Archetype__Group__11 : rule__Archetype__Group__11__Impl rule__Archetype__Group__12 ;
    public final void rule__Archetype__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:699:1: ( rule__Archetype__Group__11__Impl rule__Archetype__Group__12 )
            // InternalCIMIDSL.g:700:2: rule__Archetype__Group__11__Impl rule__Archetype__Group__12
            {
            pushFollow(FOLLOW_12);
            rule__Archetype__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__11"


    // $ANTLR start "rule__Archetype__Group__11__Impl"
    // InternalCIMIDSL.g:707:1: rule__Archetype__Group__11__Impl : ( '\\r' ) ;
    public final void rule__Archetype__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:711:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:712:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:712:1: ( '\\r' )
            // InternalCIMIDSL.g:713:2: '\\r'
            {
             before(grammarAccess.getArchetypeAccess().getControl000dKeyword_11()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getArchetypeAccess().getControl000dKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__11__Impl"


    // $ANTLR start "rule__Archetype__Group__12"
    // InternalCIMIDSL.g:722:1: rule__Archetype__Group__12 : rule__Archetype__Group__12__Impl rule__Archetype__Group__13 ;
    public final void rule__Archetype__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:726:1: ( rule__Archetype__Group__12__Impl rule__Archetype__Group__13 )
            // InternalCIMIDSL.g:727:2: rule__Archetype__Group__12__Impl rule__Archetype__Group__13
            {
            pushFollow(FOLLOW_13);
            rule__Archetype__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__12"


    // $ANTLR start "rule__Archetype__Group__12__Impl"
    // InternalCIMIDSL.g:734:1: rule__Archetype__Group__12__Impl : ( '\\r' ) ;
    public final void rule__Archetype__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:738:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:739:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:739:1: ( '\\r' )
            // InternalCIMIDSL.g:740:2: '\\r'
            {
             before(grammarAccess.getArchetypeAccess().getControl000dKeyword_12()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getArchetypeAccess().getControl000dKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__12__Impl"


    // $ANTLR start "rule__Archetype__Group__13"
    // InternalCIMIDSL.g:749:1: rule__Archetype__Group__13 : rule__Archetype__Group__13__Impl rule__Archetype__Group__14 ;
    public final void rule__Archetype__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:753:1: ( rule__Archetype__Group__13__Impl rule__Archetype__Group__14 )
            // InternalCIMIDSL.g:754:2: rule__Archetype__Group__13__Impl rule__Archetype__Group__14
            {
            pushFollow(FOLLOW_14);
            rule__Archetype__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__13"


    // $ANTLR start "rule__Archetype__Group__13__Impl"
    // InternalCIMIDSL.g:761:1: rule__Archetype__Group__13__Impl : ( 'language\\r' ) ;
    public final void rule__Archetype__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:765:1: ( ( 'language\\r' ) )
            // InternalCIMIDSL.g:766:1: ( 'language\\r' )
            {
            // InternalCIMIDSL.g:766:1: ( 'language\\r' )
            // InternalCIMIDSL.g:767:2: 'language\\r'
            {
             before(grammarAccess.getArchetypeAccess().getLanguageKeyword_13()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getArchetypeAccess().getLanguageKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__13__Impl"


    // $ANTLR start "rule__Archetype__Group__14"
    // InternalCIMIDSL.g:776:1: rule__Archetype__Group__14 : rule__Archetype__Group__14__Impl rule__Archetype__Group__15 ;
    public final void rule__Archetype__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:780:1: ( rule__Archetype__Group__14__Impl rule__Archetype__Group__15 )
            // InternalCIMIDSL.g:781:2: rule__Archetype__Group__14__Impl rule__Archetype__Group__15
            {
            pushFollow(FOLLOW_12);
            rule__Archetype__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__14"


    // $ANTLR start "rule__Archetype__Group__14__Impl"
    // InternalCIMIDSL.g:788:1: rule__Archetype__Group__14__Impl : ( ( rule__Archetype__LanguageAssignment_14 ) ) ;
    public final void rule__Archetype__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:792:1: ( ( ( rule__Archetype__LanguageAssignment_14 ) ) )
            // InternalCIMIDSL.g:793:1: ( ( rule__Archetype__LanguageAssignment_14 ) )
            {
            // InternalCIMIDSL.g:793:1: ( ( rule__Archetype__LanguageAssignment_14 ) )
            // InternalCIMIDSL.g:794:2: ( rule__Archetype__LanguageAssignment_14 )
            {
             before(grammarAccess.getArchetypeAccess().getLanguageAssignment_14()); 
            // InternalCIMIDSL.g:795:2: ( rule__Archetype__LanguageAssignment_14 )
            // InternalCIMIDSL.g:795:3: rule__Archetype__LanguageAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Archetype__LanguageAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getArchetypeAccess().getLanguageAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__14__Impl"


    // $ANTLR start "rule__Archetype__Group__15"
    // InternalCIMIDSL.g:803:1: rule__Archetype__Group__15 : rule__Archetype__Group__15__Impl rule__Archetype__Group__16 ;
    public final void rule__Archetype__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:807:1: ( rule__Archetype__Group__15__Impl rule__Archetype__Group__16 )
            // InternalCIMIDSL.g:808:2: rule__Archetype__Group__15__Impl rule__Archetype__Group__16
            {
            pushFollow(FOLLOW_12);
            rule__Archetype__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__15"


    // $ANTLR start "rule__Archetype__Group__15__Impl"
    // InternalCIMIDSL.g:815:1: rule__Archetype__Group__15__Impl : ( '\\r' ) ;
    public final void rule__Archetype__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:819:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:820:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:820:1: ( '\\r' )
            // InternalCIMIDSL.g:821:2: '\\r'
            {
             before(grammarAccess.getArchetypeAccess().getControl000dKeyword_15()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getArchetypeAccess().getControl000dKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__15__Impl"


    // $ANTLR start "rule__Archetype__Group__16"
    // InternalCIMIDSL.g:830:1: rule__Archetype__Group__16 : rule__Archetype__Group__16__Impl rule__Archetype__Group__17 ;
    public final void rule__Archetype__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:834:1: ( rule__Archetype__Group__16__Impl rule__Archetype__Group__17 )
            // InternalCIMIDSL.g:835:2: rule__Archetype__Group__16__Impl rule__Archetype__Group__17
            {
            pushFollow(FOLLOW_15);
            rule__Archetype__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__16"


    // $ANTLR start "rule__Archetype__Group__16__Impl"
    // InternalCIMIDSL.g:842:1: rule__Archetype__Group__16__Impl : ( '\\r' ) ;
    public final void rule__Archetype__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:846:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:847:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:847:1: ( '\\r' )
            // InternalCIMIDSL.g:848:2: '\\r'
            {
             before(grammarAccess.getArchetypeAccess().getControl000dKeyword_16()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getArchetypeAccess().getControl000dKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__16__Impl"


    // $ANTLR start "rule__Archetype__Group__17"
    // InternalCIMIDSL.g:857:1: rule__Archetype__Group__17 : rule__Archetype__Group__17__Impl rule__Archetype__Group__18 ;
    public final void rule__Archetype__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:861:1: ( rule__Archetype__Group__17__Impl rule__Archetype__Group__18 )
            // InternalCIMIDSL.g:862:2: rule__Archetype__Group__17__Impl rule__Archetype__Group__18
            {
            pushFollow(FOLLOW_16);
            rule__Archetype__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__17"


    // $ANTLR start "rule__Archetype__Group__17__Impl"
    // InternalCIMIDSL.g:869:1: rule__Archetype__Group__17__Impl : ( 'description\\r' ) ;
    public final void rule__Archetype__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:873:1: ( ( 'description\\r' ) )
            // InternalCIMIDSL.g:874:1: ( 'description\\r' )
            {
            // InternalCIMIDSL.g:874:1: ( 'description\\r' )
            // InternalCIMIDSL.g:875:2: 'description\\r'
            {
             before(grammarAccess.getArchetypeAccess().getDescriptionKeyword_17()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getArchetypeAccess().getDescriptionKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__17__Impl"


    // $ANTLR start "rule__Archetype__Group__18"
    // InternalCIMIDSL.g:884:1: rule__Archetype__Group__18 : rule__Archetype__Group__18__Impl rule__Archetype__Group__19 ;
    public final void rule__Archetype__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:888:1: ( rule__Archetype__Group__18__Impl rule__Archetype__Group__19 )
            // InternalCIMIDSL.g:889:2: rule__Archetype__Group__18__Impl rule__Archetype__Group__19
            {
            pushFollow(FOLLOW_12);
            rule__Archetype__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__18"


    // $ANTLR start "rule__Archetype__Group__18__Impl"
    // InternalCIMIDSL.g:896:1: rule__Archetype__Group__18__Impl : ( ( rule__Archetype__DescriptionAssignment_18 ) ) ;
    public final void rule__Archetype__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:900:1: ( ( ( rule__Archetype__DescriptionAssignment_18 ) ) )
            // InternalCIMIDSL.g:901:1: ( ( rule__Archetype__DescriptionAssignment_18 ) )
            {
            // InternalCIMIDSL.g:901:1: ( ( rule__Archetype__DescriptionAssignment_18 ) )
            // InternalCIMIDSL.g:902:2: ( rule__Archetype__DescriptionAssignment_18 )
            {
             before(grammarAccess.getArchetypeAccess().getDescriptionAssignment_18()); 
            // InternalCIMIDSL.g:903:2: ( rule__Archetype__DescriptionAssignment_18 )
            // InternalCIMIDSL.g:903:3: rule__Archetype__DescriptionAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__Archetype__DescriptionAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getArchetypeAccess().getDescriptionAssignment_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__18__Impl"


    // $ANTLR start "rule__Archetype__Group__19"
    // InternalCIMIDSL.g:911:1: rule__Archetype__Group__19 : rule__Archetype__Group__19__Impl rule__Archetype__Group__20 ;
    public final void rule__Archetype__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:915:1: ( rule__Archetype__Group__19__Impl rule__Archetype__Group__20 )
            // InternalCIMIDSL.g:916:2: rule__Archetype__Group__19__Impl rule__Archetype__Group__20
            {
            pushFollow(FOLLOW_12);
            rule__Archetype__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__19"


    // $ANTLR start "rule__Archetype__Group__19__Impl"
    // InternalCIMIDSL.g:923:1: rule__Archetype__Group__19__Impl : ( '\\r' ) ;
    public final void rule__Archetype__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:927:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:928:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:928:1: ( '\\r' )
            // InternalCIMIDSL.g:929:2: '\\r'
            {
             before(grammarAccess.getArchetypeAccess().getControl000dKeyword_19()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getArchetypeAccess().getControl000dKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__19__Impl"


    // $ANTLR start "rule__Archetype__Group__20"
    // InternalCIMIDSL.g:938:1: rule__Archetype__Group__20 : rule__Archetype__Group__20__Impl rule__Archetype__Group__21 ;
    public final void rule__Archetype__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:942:1: ( rule__Archetype__Group__20__Impl rule__Archetype__Group__21 )
            // InternalCIMIDSL.g:943:2: rule__Archetype__Group__20__Impl rule__Archetype__Group__21
            {
            pushFollow(FOLLOW_17);
            rule__Archetype__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__20"


    // $ANTLR start "rule__Archetype__Group__20__Impl"
    // InternalCIMIDSL.g:950:1: rule__Archetype__Group__20__Impl : ( '\\r' ) ;
    public final void rule__Archetype__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:954:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:955:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:955:1: ( '\\r' )
            // InternalCIMIDSL.g:956:2: '\\r'
            {
             before(grammarAccess.getArchetypeAccess().getControl000dKeyword_20()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getArchetypeAccess().getControl000dKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__20__Impl"


    // $ANTLR start "rule__Archetype__Group__21"
    // InternalCIMIDSL.g:965:1: rule__Archetype__Group__21 : rule__Archetype__Group__21__Impl rule__Archetype__Group__22 ;
    public final void rule__Archetype__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:969:1: ( rule__Archetype__Group__21__Impl rule__Archetype__Group__22 )
            // InternalCIMIDSL.g:970:2: rule__Archetype__Group__21__Impl rule__Archetype__Group__22
            {
            pushFollow(FOLLOW_7);
            rule__Archetype__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__21"


    // $ANTLR start "rule__Archetype__Group__21__Impl"
    // InternalCIMIDSL.g:977:1: rule__Archetype__Group__21__Impl : ( 'definition\\r' ) ;
    public final void rule__Archetype__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:981:1: ( ( 'definition\\r' ) )
            // InternalCIMIDSL.g:982:1: ( 'definition\\r' )
            {
            // InternalCIMIDSL.g:982:1: ( 'definition\\r' )
            // InternalCIMIDSL.g:983:2: 'definition\\r'
            {
             before(grammarAccess.getArchetypeAccess().getDefinitionKeyword_21()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getArchetypeAccess().getDefinitionKeyword_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__21__Impl"


    // $ANTLR start "rule__Archetype__Group__22"
    // InternalCIMIDSL.g:992:1: rule__Archetype__Group__22 : rule__Archetype__Group__22__Impl rule__Archetype__Group__23 ;
    public final void rule__Archetype__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:996:1: ( rule__Archetype__Group__22__Impl rule__Archetype__Group__23 )
            // InternalCIMIDSL.g:997:2: rule__Archetype__Group__22__Impl rule__Archetype__Group__23
            {
            pushFollow(FOLLOW_12);
            rule__Archetype__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__22"


    // $ANTLR start "rule__Archetype__Group__22__Impl"
    // InternalCIMIDSL.g:1004:1: rule__Archetype__Group__22__Impl : ( ( rule__Archetype__DefinitionAssignment_22 ) ) ;
    public final void rule__Archetype__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1008:1: ( ( ( rule__Archetype__DefinitionAssignment_22 ) ) )
            // InternalCIMIDSL.g:1009:1: ( ( rule__Archetype__DefinitionAssignment_22 ) )
            {
            // InternalCIMIDSL.g:1009:1: ( ( rule__Archetype__DefinitionAssignment_22 ) )
            // InternalCIMIDSL.g:1010:2: ( rule__Archetype__DefinitionAssignment_22 )
            {
             before(grammarAccess.getArchetypeAccess().getDefinitionAssignment_22()); 
            // InternalCIMIDSL.g:1011:2: ( rule__Archetype__DefinitionAssignment_22 )
            // InternalCIMIDSL.g:1011:3: rule__Archetype__DefinitionAssignment_22
            {
            pushFollow(FOLLOW_2);
            rule__Archetype__DefinitionAssignment_22();

            state._fsp--;


            }

             after(grammarAccess.getArchetypeAccess().getDefinitionAssignment_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__22__Impl"


    // $ANTLR start "rule__Archetype__Group__23"
    // InternalCIMIDSL.g:1019:1: rule__Archetype__Group__23 : rule__Archetype__Group__23__Impl rule__Archetype__Group__24 ;
    public final void rule__Archetype__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1023:1: ( rule__Archetype__Group__23__Impl rule__Archetype__Group__24 )
            // InternalCIMIDSL.g:1024:2: rule__Archetype__Group__23__Impl rule__Archetype__Group__24
            {
            pushFollow(FOLLOW_12);
            rule__Archetype__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__23"


    // $ANTLR start "rule__Archetype__Group__23__Impl"
    // InternalCIMIDSL.g:1031:1: rule__Archetype__Group__23__Impl : ( '\\r' ) ;
    public final void rule__Archetype__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1035:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:1036:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:1036:1: ( '\\r' )
            // InternalCIMIDSL.g:1037:2: '\\r'
            {
             before(grammarAccess.getArchetypeAccess().getControl000dKeyword_23()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getArchetypeAccess().getControl000dKeyword_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__23__Impl"


    // $ANTLR start "rule__Archetype__Group__24"
    // InternalCIMIDSL.g:1046:1: rule__Archetype__Group__24 : rule__Archetype__Group__24__Impl rule__Archetype__Group__25 ;
    public final void rule__Archetype__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1050:1: ( rule__Archetype__Group__24__Impl rule__Archetype__Group__25 )
            // InternalCIMIDSL.g:1051:2: rule__Archetype__Group__24__Impl rule__Archetype__Group__25
            {
            pushFollow(FOLLOW_18);
            rule__Archetype__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__25();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__24"


    // $ANTLR start "rule__Archetype__Group__24__Impl"
    // InternalCIMIDSL.g:1058:1: rule__Archetype__Group__24__Impl : ( '\\r' ) ;
    public final void rule__Archetype__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1062:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:1063:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:1063:1: ( '\\r' )
            // InternalCIMIDSL.g:1064:2: '\\r'
            {
             before(grammarAccess.getArchetypeAccess().getControl000dKeyword_24()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getArchetypeAccess().getControl000dKeyword_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__24__Impl"


    // $ANTLR start "rule__Archetype__Group__25"
    // InternalCIMIDSL.g:1073:1: rule__Archetype__Group__25 : rule__Archetype__Group__25__Impl rule__Archetype__Group__26 ;
    public final void rule__Archetype__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1077:1: ( rule__Archetype__Group__25__Impl rule__Archetype__Group__26 )
            // InternalCIMIDSL.g:1078:2: rule__Archetype__Group__25__Impl rule__Archetype__Group__26
            {
            pushFollow(FOLLOW_19);
            rule__Archetype__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__26();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__25"


    // $ANTLR start "rule__Archetype__Group__25__Impl"
    // InternalCIMIDSL.g:1085:1: rule__Archetype__Group__25__Impl : ( 'terminology\\r' ) ;
    public final void rule__Archetype__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1089:1: ( ( 'terminology\\r' ) )
            // InternalCIMIDSL.g:1090:1: ( 'terminology\\r' )
            {
            // InternalCIMIDSL.g:1090:1: ( 'terminology\\r' )
            // InternalCIMIDSL.g:1091:2: 'terminology\\r'
            {
             before(grammarAccess.getArchetypeAccess().getTerminologyKeyword_25()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getArchetypeAccess().getTerminologyKeyword_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__25__Impl"


    // $ANTLR start "rule__Archetype__Group__26"
    // InternalCIMIDSL.g:1100:1: rule__Archetype__Group__26 : rule__Archetype__Group__26__Impl rule__Archetype__Group__27 ;
    public final void rule__Archetype__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1104:1: ( rule__Archetype__Group__26__Impl rule__Archetype__Group__27 )
            // InternalCIMIDSL.g:1105:2: rule__Archetype__Group__26__Impl rule__Archetype__Group__27
            {
            pushFollow(FOLLOW_12);
            rule__Archetype__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__27();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__26"


    // $ANTLR start "rule__Archetype__Group__26__Impl"
    // InternalCIMIDSL.g:1112:1: rule__Archetype__Group__26__Impl : ( ( rule__Archetype__TerminologyAssignment_26 ) ) ;
    public final void rule__Archetype__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1116:1: ( ( ( rule__Archetype__TerminologyAssignment_26 ) ) )
            // InternalCIMIDSL.g:1117:1: ( ( rule__Archetype__TerminologyAssignment_26 ) )
            {
            // InternalCIMIDSL.g:1117:1: ( ( rule__Archetype__TerminologyAssignment_26 ) )
            // InternalCIMIDSL.g:1118:2: ( rule__Archetype__TerminologyAssignment_26 )
            {
             before(grammarAccess.getArchetypeAccess().getTerminologyAssignment_26()); 
            // InternalCIMIDSL.g:1119:2: ( rule__Archetype__TerminologyAssignment_26 )
            // InternalCIMIDSL.g:1119:3: rule__Archetype__TerminologyAssignment_26
            {
            pushFollow(FOLLOW_2);
            rule__Archetype__TerminologyAssignment_26();

            state._fsp--;


            }

             after(grammarAccess.getArchetypeAccess().getTerminologyAssignment_26()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__26__Impl"


    // $ANTLR start "rule__Archetype__Group__27"
    // InternalCIMIDSL.g:1127:1: rule__Archetype__Group__27 : rule__Archetype__Group__27__Impl rule__Archetype__Group__28 ;
    public final void rule__Archetype__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1131:1: ( rule__Archetype__Group__27__Impl rule__Archetype__Group__28 )
            // InternalCIMIDSL.g:1132:2: rule__Archetype__Group__27__Impl rule__Archetype__Group__28
            {
            pushFollow(FOLLOW_12);
            rule__Archetype__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Archetype__Group__28();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__27"


    // $ANTLR start "rule__Archetype__Group__27__Impl"
    // InternalCIMIDSL.g:1139:1: rule__Archetype__Group__27__Impl : ( '\\r' ) ;
    public final void rule__Archetype__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1143:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:1144:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:1144:1: ( '\\r' )
            // InternalCIMIDSL.g:1145:2: '\\r'
            {
             before(grammarAccess.getArchetypeAccess().getControl000dKeyword_27()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getArchetypeAccess().getControl000dKeyword_27()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__27__Impl"


    // $ANTLR start "rule__Archetype__Group__28"
    // InternalCIMIDSL.g:1154:1: rule__Archetype__Group__28 : rule__Archetype__Group__28__Impl ;
    public final void rule__Archetype__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1158:1: ( rule__Archetype__Group__28__Impl )
            // InternalCIMIDSL.g:1159:2: rule__Archetype__Group__28__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Archetype__Group__28__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__28"


    // $ANTLR start "rule__Archetype__Group__28__Impl"
    // InternalCIMIDSL.g:1165:1: rule__Archetype__Group__28__Impl : ( '\\r' ) ;
    public final void rule__Archetype__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1169:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:1170:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:1170:1: ( '\\r' )
            // InternalCIMIDSL.g:1171:2: '\\r'
            {
             before(grammarAccess.getArchetypeAccess().getControl000dKeyword_28()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getArchetypeAccess().getControl000dKeyword_28()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Group__28__Impl"


    // $ANTLR start "rule__Description__Group__0"
    // InternalCIMIDSL.g:1181:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1185:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalCIMIDSL.g:1186:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Description__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0"


    // $ANTLR start "rule__Description__Group__0__Impl"
    // InternalCIMIDSL.g:1193:1: rule__Description__Group__0__Impl : ( 'original_author' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1197:1: ( ( 'original_author' ) )
            // InternalCIMIDSL.g:1198:1: ( 'original_author' )
            {
            // InternalCIMIDSL.g:1198:1: ( 'original_author' )
            // InternalCIMIDSL.g:1199:2: 'original_author'
            {
             before(grammarAccess.getDescriptionAccess().getOriginal_authorKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getOriginal_authorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0__Impl"


    // $ANTLR start "rule__Description__Group__1"
    // InternalCIMIDSL.g:1208:1: rule__Description__Group__1 : rule__Description__Group__1__Impl rule__Description__Group__2 ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1212:1: ( rule__Description__Group__1__Impl rule__Description__Group__2 )
            // InternalCIMIDSL.g:1213:2: rule__Description__Group__1__Impl rule__Description__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Description__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1"


    // $ANTLR start "rule__Description__Group__1__Impl"
    // InternalCIMIDSL.g:1220:1: rule__Description__Group__1__Impl : ( '=' ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1224:1: ( ( '=' ) )
            // InternalCIMIDSL.g:1225:1: ( '=' )
            {
            // InternalCIMIDSL.g:1225:1: ( '=' )
            // InternalCIMIDSL.g:1226:2: '='
            {
             before(grammarAccess.getDescriptionAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1__Impl"


    // $ANTLR start "rule__Description__Group__2"
    // InternalCIMIDSL.g:1235:1: rule__Description__Group__2 : rule__Description__Group__2__Impl rule__Description__Group__3 ;
    public final void rule__Description__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1239:1: ( rule__Description__Group__2__Impl rule__Description__Group__3 )
            // InternalCIMIDSL.g:1240:2: rule__Description__Group__2__Impl rule__Description__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Description__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__2"


    // $ANTLR start "rule__Description__Group__2__Impl"
    // InternalCIMIDSL.g:1247:1: rule__Description__Group__2__Impl : ( '<' ) ;
    public final void rule__Description__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1251:1: ( ( '<' ) )
            // InternalCIMIDSL.g:1252:1: ( '<' )
            {
            // InternalCIMIDSL.g:1252:1: ( '<' )
            // InternalCIMIDSL.g:1253:2: '<'
            {
             before(grammarAccess.getDescriptionAccess().getLessThanSignKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getLessThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__2__Impl"


    // $ANTLR start "rule__Description__Group__3"
    // InternalCIMIDSL.g:1262:1: rule__Description__Group__3 : rule__Description__Group__3__Impl rule__Description__Group__4 ;
    public final void rule__Description__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1266:1: ( rule__Description__Group__3__Impl rule__Description__Group__4 )
            // InternalCIMIDSL.g:1267:2: rule__Description__Group__3__Impl rule__Description__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Description__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__3"


    // $ANTLR start "rule__Description__Group__3__Impl"
    // InternalCIMIDSL.g:1274:1: rule__Description__Group__3__Impl : ( '\\r' ) ;
    public final void rule__Description__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1278:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:1279:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:1279:1: ( '\\r' )
            // InternalCIMIDSL.g:1280:2: '\\r'
            {
             before(grammarAccess.getDescriptionAccess().getControl000dKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getControl000dKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__3__Impl"


    // $ANTLR start "rule__Description__Group__4"
    // InternalCIMIDSL.g:1289:1: rule__Description__Group__4 : rule__Description__Group__4__Impl rule__Description__Group__5 ;
    public final void rule__Description__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1293:1: ( rule__Description__Group__4__Impl rule__Description__Group__5 )
            // InternalCIMIDSL.g:1294:2: rule__Description__Group__4__Impl rule__Description__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Description__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__4"


    // $ANTLR start "rule__Description__Group__4__Impl"
    // InternalCIMIDSL.g:1301:1: rule__Description__Group__4__Impl : ( ( rule__Description__OriginalAuthorAssignment_4 ) ) ;
    public final void rule__Description__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1305:1: ( ( ( rule__Description__OriginalAuthorAssignment_4 ) ) )
            // InternalCIMIDSL.g:1306:1: ( ( rule__Description__OriginalAuthorAssignment_4 ) )
            {
            // InternalCIMIDSL.g:1306:1: ( ( rule__Description__OriginalAuthorAssignment_4 ) )
            // InternalCIMIDSL.g:1307:2: ( rule__Description__OriginalAuthorAssignment_4 )
            {
             before(grammarAccess.getDescriptionAccess().getOriginalAuthorAssignment_4()); 
            // InternalCIMIDSL.g:1308:2: ( rule__Description__OriginalAuthorAssignment_4 )
            // InternalCIMIDSL.g:1308:3: rule__Description__OriginalAuthorAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Description__OriginalAuthorAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getOriginalAuthorAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__4__Impl"


    // $ANTLR start "rule__Description__Group__5"
    // InternalCIMIDSL.g:1316:1: rule__Description__Group__5 : rule__Description__Group__5__Impl rule__Description__Group__6 ;
    public final void rule__Description__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1320:1: ( rule__Description__Group__5__Impl rule__Description__Group__6 )
            // InternalCIMIDSL.g:1321:2: rule__Description__Group__5__Impl rule__Description__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Description__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__5"


    // $ANTLR start "rule__Description__Group__5__Impl"
    // InternalCIMIDSL.g:1328:1: rule__Description__Group__5__Impl : ( '>' ) ;
    public final void rule__Description__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1332:1: ( ( '>' ) )
            // InternalCIMIDSL.g:1333:1: ( '>' )
            {
            // InternalCIMIDSL.g:1333:1: ( '>' )
            // InternalCIMIDSL.g:1334:2: '>'
            {
             before(grammarAccess.getDescriptionAccess().getGreaterThanSignKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getGreaterThanSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__5__Impl"


    // $ANTLR start "rule__Description__Group__6"
    // InternalCIMIDSL.g:1343:1: rule__Description__Group__6 : rule__Description__Group__6__Impl rule__Description__Group__7 ;
    public final void rule__Description__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1347:1: ( rule__Description__Group__6__Impl rule__Description__Group__7 )
            // InternalCIMIDSL.g:1348:2: rule__Description__Group__6__Impl rule__Description__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__Description__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__6"


    // $ANTLR start "rule__Description__Group__6__Impl"
    // InternalCIMIDSL.g:1355:1: rule__Description__Group__6__Impl : ( '\\r' ) ;
    public final void rule__Description__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1359:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:1360:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:1360:1: ( '\\r' )
            // InternalCIMIDSL.g:1361:2: '\\r'
            {
             before(grammarAccess.getDescriptionAccess().getControl000dKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getControl000dKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__6__Impl"


    // $ANTLR start "rule__Description__Group__7"
    // InternalCIMIDSL.g:1370:1: rule__Description__Group__7 : rule__Description__Group__7__Impl rule__Description__Group__8 ;
    public final void rule__Description__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1374:1: ( rule__Description__Group__7__Impl rule__Description__Group__8 )
            // InternalCIMIDSL.g:1375:2: rule__Description__Group__7__Impl rule__Description__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__Description__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__7"


    // $ANTLR start "rule__Description__Group__7__Impl"
    // InternalCIMIDSL.g:1382:1: rule__Description__Group__7__Impl : ( 'details' ) ;
    public final void rule__Description__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1386:1: ( ( 'details' ) )
            // InternalCIMIDSL.g:1387:1: ( 'details' )
            {
            // InternalCIMIDSL.g:1387:1: ( 'details' )
            // InternalCIMIDSL.g:1388:2: 'details'
            {
             before(grammarAccess.getDescriptionAccess().getDetailsKeyword_7()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getDetailsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__7__Impl"


    // $ANTLR start "rule__Description__Group__8"
    // InternalCIMIDSL.g:1397:1: rule__Description__Group__8 : rule__Description__Group__8__Impl rule__Description__Group__9 ;
    public final void rule__Description__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1401:1: ( rule__Description__Group__8__Impl rule__Description__Group__9 )
            // InternalCIMIDSL.g:1402:2: rule__Description__Group__8__Impl rule__Description__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__Description__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__8"


    // $ANTLR start "rule__Description__Group__8__Impl"
    // InternalCIMIDSL.g:1409:1: rule__Description__Group__8__Impl : ( '=' ) ;
    public final void rule__Description__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1413:1: ( ( '=' ) )
            // InternalCIMIDSL.g:1414:1: ( '=' )
            {
            // InternalCIMIDSL.g:1414:1: ( '=' )
            // InternalCIMIDSL.g:1415:2: '='
            {
             before(grammarAccess.getDescriptionAccess().getEqualsSignKeyword_8()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getEqualsSignKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__8__Impl"


    // $ANTLR start "rule__Description__Group__9"
    // InternalCIMIDSL.g:1424:1: rule__Description__Group__9 : rule__Description__Group__9__Impl rule__Description__Group__10 ;
    public final void rule__Description__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1428:1: ( rule__Description__Group__9__Impl rule__Description__Group__10 )
            // InternalCIMIDSL.g:1429:2: rule__Description__Group__9__Impl rule__Description__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__Description__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__9"


    // $ANTLR start "rule__Description__Group__9__Impl"
    // InternalCIMIDSL.g:1436:1: rule__Description__Group__9__Impl : ( '<' ) ;
    public final void rule__Description__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1440:1: ( ( '<' ) )
            // InternalCIMIDSL.g:1441:1: ( '<' )
            {
            // InternalCIMIDSL.g:1441:1: ( '<' )
            // InternalCIMIDSL.g:1442:2: '<'
            {
             before(grammarAccess.getDescriptionAccess().getLessThanSignKeyword_9()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getLessThanSignKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__9__Impl"


    // $ANTLR start "rule__Description__Group__10"
    // InternalCIMIDSL.g:1451:1: rule__Description__Group__10 : rule__Description__Group__10__Impl rule__Description__Group__11 ;
    public final void rule__Description__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1455:1: ( rule__Description__Group__10__Impl rule__Description__Group__11 )
            // InternalCIMIDSL.g:1456:2: rule__Description__Group__10__Impl rule__Description__Group__11
            {
            pushFollow(FOLLOW_25);
            rule__Description__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__10"


    // $ANTLR start "rule__Description__Group__10__Impl"
    // InternalCIMIDSL.g:1463:1: rule__Description__Group__10__Impl : ( '\\r' ) ;
    public final void rule__Description__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1467:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:1468:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:1468:1: ( '\\r' )
            // InternalCIMIDSL.g:1469:2: '\\r'
            {
             before(grammarAccess.getDescriptionAccess().getControl000dKeyword_10()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getControl000dKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__10__Impl"


    // $ANTLR start "rule__Description__Group__11"
    // InternalCIMIDSL.g:1478:1: rule__Description__Group__11 : rule__Description__Group__11__Impl rule__Description__Group__12 ;
    public final void rule__Description__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1482:1: ( rule__Description__Group__11__Impl rule__Description__Group__12 )
            // InternalCIMIDSL.g:1483:2: rule__Description__Group__11__Impl rule__Description__Group__12
            {
            pushFollow(FOLLOW_23);
            rule__Description__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__11"


    // $ANTLR start "rule__Description__Group__11__Impl"
    // InternalCIMIDSL.g:1490:1: rule__Description__Group__11__Impl : ( ( rule__Description__DetailsAssignment_11 ) ) ;
    public final void rule__Description__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1494:1: ( ( ( rule__Description__DetailsAssignment_11 ) ) )
            // InternalCIMIDSL.g:1495:1: ( ( rule__Description__DetailsAssignment_11 ) )
            {
            // InternalCIMIDSL.g:1495:1: ( ( rule__Description__DetailsAssignment_11 ) )
            // InternalCIMIDSL.g:1496:2: ( rule__Description__DetailsAssignment_11 )
            {
             before(grammarAccess.getDescriptionAccess().getDetailsAssignment_11()); 
            // InternalCIMIDSL.g:1497:2: ( rule__Description__DetailsAssignment_11 )
            // InternalCIMIDSL.g:1497:3: rule__Description__DetailsAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Description__DetailsAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getDetailsAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__11__Impl"


    // $ANTLR start "rule__Description__Group__12"
    // InternalCIMIDSL.g:1505:1: rule__Description__Group__12 : rule__Description__Group__12__Impl rule__Description__Group__13 ;
    public final void rule__Description__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1509:1: ( rule__Description__Group__12__Impl rule__Description__Group__13 )
            // InternalCIMIDSL.g:1510:2: rule__Description__Group__12__Impl rule__Description__Group__13
            {
            pushFollow(FOLLOW_12);
            rule__Description__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__12"


    // $ANTLR start "rule__Description__Group__12__Impl"
    // InternalCIMIDSL.g:1517:1: rule__Description__Group__12__Impl : ( '>' ) ;
    public final void rule__Description__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1521:1: ( ( '>' ) )
            // InternalCIMIDSL.g:1522:1: ( '>' )
            {
            // InternalCIMIDSL.g:1522:1: ( '>' )
            // InternalCIMIDSL.g:1523:2: '>'
            {
             before(grammarAccess.getDescriptionAccess().getGreaterThanSignKeyword_12()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getGreaterThanSignKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__12__Impl"


    // $ANTLR start "rule__Description__Group__13"
    // InternalCIMIDSL.g:1532:1: rule__Description__Group__13 : rule__Description__Group__13__Impl ;
    public final void rule__Description__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1536:1: ( rule__Description__Group__13__Impl )
            // InternalCIMIDSL.g:1537:2: rule__Description__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__13"


    // $ANTLR start "rule__Description__Group__13__Impl"
    // InternalCIMIDSL.g:1543:1: rule__Description__Group__13__Impl : ( '\\r' ) ;
    public final void rule__Description__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1547:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:1548:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:1548:1: ( '\\r' )
            // InternalCIMIDSL.g:1549:2: '\\r'
            {
             before(grammarAccess.getDescriptionAccess().getControl000dKeyword_13()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getControl000dKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__13__Impl"


    // $ANTLR start "rule__Details__Group__0"
    // InternalCIMIDSL.g:1559:1: rule__Details__Group__0 : rule__Details__Group__0__Impl rule__Details__Group__1 ;
    public final void rule__Details__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1563:1: ( rule__Details__Group__0__Impl rule__Details__Group__1 )
            // InternalCIMIDSL.g:1564:2: rule__Details__Group__0__Impl rule__Details__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Details__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__0"


    // $ANTLR start "rule__Details__Group__0__Impl"
    // InternalCIMIDSL.g:1571:1: rule__Details__Group__0__Impl : ( '\"[' ) ;
    public final void rule__Details__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1575:1: ( ( '\"[' ) )
            // InternalCIMIDSL.g:1576:1: ( '\"[' )
            {
            // InternalCIMIDSL.g:1576:1: ( '\"[' )
            // InternalCIMIDSL.g:1577:2: '\"['
            {
             before(grammarAccess.getDetailsAccess().getQuotationMarkLeftSquareBracketKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getQuotationMarkLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__0__Impl"


    // $ANTLR start "rule__Details__Group__1"
    // InternalCIMIDSL.g:1586:1: rule__Details__Group__1 : rule__Details__Group__1__Impl rule__Details__Group__2 ;
    public final void rule__Details__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1590:1: ( rule__Details__Group__1__Impl rule__Details__Group__2 )
            // InternalCIMIDSL.g:1591:2: rule__Details__Group__1__Impl rule__Details__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Details__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__1"


    // $ANTLR start "rule__Details__Group__1__Impl"
    // InternalCIMIDSL.g:1598:1: rule__Details__Group__1__Impl : ( ( rule__Details__NameAssignment_1 ) ) ;
    public final void rule__Details__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1602:1: ( ( ( rule__Details__NameAssignment_1 ) ) )
            // InternalCIMIDSL.g:1603:1: ( ( rule__Details__NameAssignment_1 ) )
            {
            // InternalCIMIDSL.g:1603:1: ( ( rule__Details__NameAssignment_1 ) )
            // InternalCIMIDSL.g:1604:2: ( rule__Details__NameAssignment_1 )
            {
             before(grammarAccess.getDetailsAccess().getNameAssignment_1()); 
            // InternalCIMIDSL.g:1605:2: ( rule__Details__NameAssignment_1 )
            // InternalCIMIDSL.g:1605:3: rule__Details__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Details__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDetailsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__1__Impl"


    // $ANTLR start "rule__Details__Group__2"
    // InternalCIMIDSL.g:1613:1: rule__Details__Group__2 : rule__Details__Group__2__Impl rule__Details__Group__3 ;
    public final void rule__Details__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1617:1: ( rule__Details__Group__2__Impl rule__Details__Group__3 )
            // InternalCIMIDSL.g:1618:2: rule__Details__Group__2__Impl rule__Details__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Details__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__2"


    // $ANTLR start "rule__Details__Group__2__Impl"
    // InternalCIMIDSL.g:1625:1: rule__Details__Group__2__Impl : ( ']\"' ) ;
    public final void rule__Details__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1629:1: ( ( ']\"' ) )
            // InternalCIMIDSL.g:1630:1: ( ']\"' )
            {
            // InternalCIMIDSL.g:1630:1: ( ']\"' )
            // InternalCIMIDSL.g:1631:2: ']\"'
            {
             before(grammarAccess.getDetailsAccess().getRightSquareBracketQuotationMarkKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getRightSquareBracketQuotationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__2__Impl"


    // $ANTLR start "rule__Details__Group__3"
    // InternalCIMIDSL.g:1640:1: rule__Details__Group__3 : rule__Details__Group__3__Impl rule__Details__Group__4 ;
    public final void rule__Details__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1644:1: ( rule__Details__Group__3__Impl rule__Details__Group__4 )
            // InternalCIMIDSL.g:1645:2: rule__Details__Group__3__Impl rule__Details__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Details__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__3"


    // $ANTLR start "rule__Details__Group__3__Impl"
    // InternalCIMIDSL.g:1652:1: rule__Details__Group__3__Impl : ( '=' ) ;
    public final void rule__Details__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1656:1: ( ( '=' ) )
            // InternalCIMIDSL.g:1657:1: ( '=' )
            {
            // InternalCIMIDSL.g:1657:1: ( '=' )
            // InternalCIMIDSL.g:1658:2: '='
            {
             before(grammarAccess.getDetailsAccess().getEqualsSignKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__3__Impl"


    // $ANTLR start "rule__Details__Group__4"
    // InternalCIMIDSL.g:1667:1: rule__Details__Group__4 : rule__Details__Group__4__Impl rule__Details__Group__5 ;
    public final void rule__Details__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1671:1: ( rule__Details__Group__4__Impl rule__Details__Group__5 )
            // InternalCIMIDSL.g:1672:2: rule__Details__Group__4__Impl rule__Details__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Details__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__4"


    // $ANTLR start "rule__Details__Group__4__Impl"
    // InternalCIMIDSL.g:1679:1: rule__Details__Group__4__Impl : ( '\\r' ) ;
    public final void rule__Details__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1683:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:1684:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:1684:1: ( '\\r' )
            // InternalCIMIDSL.g:1685:2: '\\r'
            {
             before(grammarAccess.getDetailsAccess().getControl000dKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getControl000dKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__4__Impl"


    // $ANTLR start "rule__Details__Group__5"
    // InternalCIMIDSL.g:1694:1: rule__Details__Group__5 : rule__Details__Group__5__Impl rule__Details__Group__6 ;
    public final void rule__Details__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1698:1: ( rule__Details__Group__5__Impl rule__Details__Group__6 )
            // InternalCIMIDSL.g:1699:2: rule__Details__Group__5__Impl rule__Details__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__Details__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__5"


    // $ANTLR start "rule__Details__Group__5__Impl"
    // InternalCIMIDSL.g:1706:1: rule__Details__Group__5__Impl : ( '<' ) ;
    public final void rule__Details__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1710:1: ( ( '<' ) )
            // InternalCIMIDSL.g:1711:1: ( '<' )
            {
            // InternalCIMIDSL.g:1711:1: ( '<' )
            // InternalCIMIDSL.g:1712:2: '<'
            {
             before(grammarAccess.getDetailsAccess().getLessThanSignKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getLessThanSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__5__Impl"


    // $ANTLR start "rule__Details__Group__6"
    // InternalCIMIDSL.g:1721:1: rule__Details__Group__6 : rule__Details__Group__6__Impl rule__Details__Group__7 ;
    public final void rule__Details__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1725:1: ( rule__Details__Group__6__Impl rule__Details__Group__7 )
            // InternalCIMIDSL.g:1726:2: rule__Details__Group__6__Impl rule__Details__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__Details__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__6"


    // $ANTLR start "rule__Details__Group__6__Impl"
    // InternalCIMIDSL.g:1733:1: rule__Details__Group__6__Impl : ( 'language' ) ;
    public final void rule__Details__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1737:1: ( ( 'language' ) )
            // InternalCIMIDSL.g:1738:1: ( 'language' )
            {
            // InternalCIMIDSL.g:1738:1: ( 'language' )
            // InternalCIMIDSL.g:1739:2: 'language'
            {
             before(grammarAccess.getDetailsAccess().getLanguageKeyword_6()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getLanguageKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__6__Impl"


    // $ANTLR start "rule__Details__Group__7"
    // InternalCIMIDSL.g:1748:1: rule__Details__Group__7 : rule__Details__Group__7__Impl rule__Details__Group__8 ;
    public final void rule__Details__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1752:1: ( rule__Details__Group__7__Impl rule__Details__Group__8 )
            // InternalCIMIDSL.g:1753:2: rule__Details__Group__7__Impl rule__Details__Group__8
            {
            pushFollow(FOLLOW_28);
            rule__Details__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__7"


    // $ANTLR start "rule__Details__Group__7__Impl"
    // InternalCIMIDSL.g:1760:1: rule__Details__Group__7__Impl : ( '=' ) ;
    public final void rule__Details__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1764:1: ( ( '=' ) )
            // InternalCIMIDSL.g:1765:1: ( '=' )
            {
            // InternalCIMIDSL.g:1765:1: ( '=' )
            // InternalCIMIDSL.g:1766:2: '='
            {
             before(grammarAccess.getDetailsAccess().getEqualsSignKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__7__Impl"


    // $ANTLR start "rule__Details__Group__8"
    // InternalCIMIDSL.g:1775:1: rule__Details__Group__8 : rule__Details__Group__8__Impl rule__Details__Group__9 ;
    public final void rule__Details__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1779:1: ( rule__Details__Group__8__Impl rule__Details__Group__9 )
            // InternalCIMIDSL.g:1780:2: rule__Details__Group__8__Impl rule__Details__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__Details__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__8"


    // $ANTLR start "rule__Details__Group__8__Impl"
    // InternalCIMIDSL.g:1787:1: rule__Details__Group__8__Impl : ( '<[' ) ;
    public final void rule__Details__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1791:1: ( ( '<[' ) )
            // InternalCIMIDSL.g:1792:1: ( '<[' )
            {
            // InternalCIMIDSL.g:1792:1: ( '<[' )
            // InternalCIMIDSL.g:1793:2: '<['
            {
             before(grammarAccess.getDetailsAccess().getLessThanSignLeftSquareBracketKeyword_8()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getLessThanSignLeftSquareBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__8__Impl"


    // $ANTLR start "rule__Details__Group__9"
    // InternalCIMIDSL.g:1802:1: rule__Details__Group__9 : rule__Details__Group__9__Impl rule__Details__Group__10 ;
    public final void rule__Details__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1806:1: ( rule__Details__Group__9__Impl rule__Details__Group__10 )
            // InternalCIMIDSL.g:1807:2: rule__Details__Group__9__Impl rule__Details__Group__10
            {
            pushFollow(FOLLOW_29);
            rule__Details__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__9"


    // $ANTLR start "rule__Details__Group__9__Impl"
    // InternalCIMIDSL.g:1814:1: rule__Details__Group__9__Impl : ( ( rule__Details__LanguageAssignment_9 ) ) ;
    public final void rule__Details__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1818:1: ( ( ( rule__Details__LanguageAssignment_9 ) ) )
            // InternalCIMIDSL.g:1819:1: ( ( rule__Details__LanguageAssignment_9 ) )
            {
            // InternalCIMIDSL.g:1819:1: ( ( rule__Details__LanguageAssignment_9 ) )
            // InternalCIMIDSL.g:1820:2: ( rule__Details__LanguageAssignment_9 )
            {
             before(grammarAccess.getDetailsAccess().getLanguageAssignment_9()); 
            // InternalCIMIDSL.g:1821:2: ( rule__Details__LanguageAssignment_9 )
            // InternalCIMIDSL.g:1821:3: rule__Details__LanguageAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Details__LanguageAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getDetailsAccess().getLanguageAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__9__Impl"


    // $ANTLR start "rule__Details__Group__10"
    // InternalCIMIDSL.g:1829:1: rule__Details__Group__10 : rule__Details__Group__10__Impl rule__Details__Group__11 ;
    public final void rule__Details__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1833:1: ( rule__Details__Group__10__Impl rule__Details__Group__11 )
            // InternalCIMIDSL.g:1834:2: rule__Details__Group__10__Impl rule__Details__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__Details__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__10"


    // $ANTLR start "rule__Details__Group__10__Impl"
    // InternalCIMIDSL.g:1841:1: rule__Details__Group__10__Impl : ( ']>' ) ;
    public final void rule__Details__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1845:1: ( ( ']>' ) )
            // InternalCIMIDSL.g:1846:1: ( ']>' )
            {
            // InternalCIMIDSL.g:1846:1: ( ']>' )
            // InternalCIMIDSL.g:1847:2: ']>'
            {
             before(grammarAccess.getDetailsAccess().getRightSquareBracketGreaterThanSignKeyword_10()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getRightSquareBracketGreaterThanSignKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__10__Impl"


    // $ANTLR start "rule__Details__Group__11"
    // InternalCIMIDSL.g:1856:1: rule__Details__Group__11 : rule__Details__Group__11__Impl rule__Details__Group__12 ;
    public final void rule__Details__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1860:1: ( rule__Details__Group__11__Impl rule__Details__Group__12 )
            // InternalCIMIDSL.g:1861:2: rule__Details__Group__11__Impl rule__Details__Group__12
            {
            pushFollow(FOLLOW_30);
            rule__Details__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__11"


    // $ANTLR start "rule__Details__Group__11__Impl"
    // InternalCIMIDSL.g:1868:1: rule__Details__Group__11__Impl : ( '\\r' ) ;
    public final void rule__Details__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1872:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:1873:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:1873:1: ( '\\r' )
            // InternalCIMIDSL.g:1874:2: '\\r'
            {
             before(grammarAccess.getDetailsAccess().getControl000dKeyword_11()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getControl000dKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__11__Impl"


    // $ANTLR start "rule__Details__Group__12"
    // InternalCIMIDSL.g:1883:1: rule__Details__Group__12 : rule__Details__Group__12__Impl rule__Details__Group__13 ;
    public final void rule__Details__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1887:1: ( rule__Details__Group__12__Impl rule__Details__Group__13 )
            // InternalCIMIDSL.g:1888:2: rule__Details__Group__12__Impl rule__Details__Group__13
            {
            pushFollow(FOLLOW_20);
            rule__Details__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__12"


    // $ANTLR start "rule__Details__Group__12__Impl"
    // InternalCIMIDSL.g:1895:1: rule__Details__Group__12__Impl : ( 'use' ) ;
    public final void rule__Details__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1899:1: ( ( 'use' ) )
            // InternalCIMIDSL.g:1900:1: ( 'use' )
            {
            // InternalCIMIDSL.g:1900:1: ( 'use' )
            // InternalCIMIDSL.g:1901:2: 'use'
            {
             before(grammarAccess.getDetailsAccess().getUseKeyword_12()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getUseKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__12__Impl"


    // $ANTLR start "rule__Details__Group__13"
    // InternalCIMIDSL.g:1910:1: rule__Details__Group__13 : rule__Details__Group__13__Impl rule__Details__Group__14 ;
    public final void rule__Details__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1914:1: ( rule__Details__Group__13__Impl rule__Details__Group__14 )
            // InternalCIMIDSL.g:1915:2: rule__Details__Group__13__Impl rule__Details__Group__14
            {
            pushFollow(FOLLOW_28);
            rule__Details__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__13"


    // $ANTLR start "rule__Details__Group__13__Impl"
    // InternalCIMIDSL.g:1922:1: rule__Details__Group__13__Impl : ( '=' ) ;
    public final void rule__Details__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1926:1: ( ( '=' ) )
            // InternalCIMIDSL.g:1927:1: ( '=' )
            {
            // InternalCIMIDSL.g:1927:1: ( '=' )
            // InternalCIMIDSL.g:1928:2: '='
            {
             before(grammarAccess.getDetailsAccess().getEqualsSignKeyword_13()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getEqualsSignKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__13__Impl"


    // $ANTLR start "rule__Details__Group__14"
    // InternalCIMIDSL.g:1937:1: rule__Details__Group__14 : rule__Details__Group__14__Impl rule__Details__Group__15 ;
    public final void rule__Details__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1941:1: ( rule__Details__Group__14__Impl rule__Details__Group__15 )
            // InternalCIMIDSL.g:1942:2: rule__Details__Group__14__Impl rule__Details__Group__15
            {
            pushFollow(FOLLOW_31);
            rule__Details__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__14"


    // $ANTLR start "rule__Details__Group__14__Impl"
    // InternalCIMIDSL.g:1949:1: rule__Details__Group__14__Impl : ( '<[' ) ;
    public final void rule__Details__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1953:1: ( ( '<[' ) )
            // InternalCIMIDSL.g:1954:1: ( '<[' )
            {
            // InternalCIMIDSL.g:1954:1: ( '<[' )
            // InternalCIMIDSL.g:1955:2: '<['
            {
             before(grammarAccess.getDetailsAccess().getLessThanSignLeftSquareBracketKeyword_14()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getLessThanSignLeftSquareBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__14__Impl"


    // $ANTLR start "rule__Details__Group__15"
    // InternalCIMIDSL.g:1964:1: rule__Details__Group__15 : rule__Details__Group__15__Impl rule__Details__Group__16 ;
    public final void rule__Details__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1968:1: ( rule__Details__Group__15__Impl rule__Details__Group__16 )
            // InternalCIMIDSL.g:1969:2: rule__Details__Group__15__Impl rule__Details__Group__16
            {
            pushFollow(FOLLOW_29);
            rule__Details__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__15"


    // $ANTLR start "rule__Details__Group__15__Impl"
    // InternalCIMIDSL.g:1976:1: rule__Details__Group__15__Impl : ( ( rule__Details__UseAssignment_15 ) ) ;
    public final void rule__Details__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1980:1: ( ( ( rule__Details__UseAssignment_15 ) ) )
            // InternalCIMIDSL.g:1981:1: ( ( rule__Details__UseAssignment_15 ) )
            {
            // InternalCIMIDSL.g:1981:1: ( ( rule__Details__UseAssignment_15 ) )
            // InternalCIMIDSL.g:1982:2: ( rule__Details__UseAssignment_15 )
            {
             before(grammarAccess.getDetailsAccess().getUseAssignment_15()); 
            // InternalCIMIDSL.g:1983:2: ( rule__Details__UseAssignment_15 )
            // InternalCIMIDSL.g:1983:3: rule__Details__UseAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__Details__UseAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getDetailsAccess().getUseAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__15__Impl"


    // $ANTLR start "rule__Details__Group__16"
    // InternalCIMIDSL.g:1991:1: rule__Details__Group__16 : rule__Details__Group__16__Impl rule__Details__Group__17 ;
    public final void rule__Details__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:1995:1: ( rule__Details__Group__16__Impl rule__Details__Group__17 )
            // InternalCIMIDSL.g:1996:2: rule__Details__Group__16__Impl rule__Details__Group__17
            {
            pushFollow(FOLLOW_12);
            rule__Details__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__16"


    // $ANTLR start "rule__Details__Group__16__Impl"
    // InternalCIMIDSL.g:2003:1: rule__Details__Group__16__Impl : ( ']>' ) ;
    public final void rule__Details__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2007:1: ( ( ']>' ) )
            // InternalCIMIDSL.g:2008:1: ( ']>' )
            {
            // InternalCIMIDSL.g:2008:1: ( ']>' )
            // InternalCIMIDSL.g:2009:2: ']>'
            {
             before(grammarAccess.getDetailsAccess().getRightSquareBracketGreaterThanSignKeyword_16()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getRightSquareBracketGreaterThanSignKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__16__Impl"


    // $ANTLR start "rule__Details__Group__17"
    // InternalCIMIDSL.g:2018:1: rule__Details__Group__17 : rule__Details__Group__17__Impl rule__Details__Group__18 ;
    public final void rule__Details__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2022:1: ( rule__Details__Group__17__Impl rule__Details__Group__18 )
            // InternalCIMIDSL.g:2023:2: rule__Details__Group__17__Impl rule__Details__Group__18
            {
            pushFollow(FOLLOW_32);
            rule__Details__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__17"


    // $ANTLR start "rule__Details__Group__17__Impl"
    // InternalCIMIDSL.g:2030:1: rule__Details__Group__17__Impl : ( '\\r' ) ;
    public final void rule__Details__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2034:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:2035:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:2035:1: ( '\\r' )
            // InternalCIMIDSL.g:2036:2: '\\r'
            {
             before(grammarAccess.getDetailsAccess().getControl000dKeyword_17()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getControl000dKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__17__Impl"


    // $ANTLR start "rule__Details__Group__18"
    // InternalCIMIDSL.g:2045:1: rule__Details__Group__18 : rule__Details__Group__18__Impl rule__Details__Group__19 ;
    public final void rule__Details__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2049:1: ( rule__Details__Group__18__Impl rule__Details__Group__19 )
            // InternalCIMIDSL.g:2050:2: rule__Details__Group__18__Impl rule__Details__Group__19
            {
            pushFollow(FOLLOW_20);
            rule__Details__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__18"


    // $ANTLR start "rule__Details__Group__18__Impl"
    // InternalCIMIDSL.g:2057:1: rule__Details__Group__18__Impl : ( 'copyright' ) ;
    public final void rule__Details__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2061:1: ( ( 'copyright' ) )
            // InternalCIMIDSL.g:2062:1: ( 'copyright' )
            {
            // InternalCIMIDSL.g:2062:1: ( 'copyright' )
            // InternalCIMIDSL.g:2063:2: 'copyright'
            {
             before(grammarAccess.getDetailsAccess().getCopyrightKeyword_18()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getCopyrightKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__18__Impl"


    // $ANTLR start "rule__Details__Group__19"
    // InternalCIMIDSL.g:2072:1: rule__Details__Group__19 : rule__Details__Group__19__Impl rule__Details__Group__20 ;
    public final void rule__Details__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2076:1: ( rule__Details__Group__19__Impl rule__Details__Group__20 )
            // InternalCIMIDSL.g:2077:2: rule__Details__Group__19__Impl rule__Details__Group__20
            {
            pushFollow(FOLLOW_28);
            rule__Details__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__19"


    // $ANTLR start "rule__Details__Group__19__Impl"
    // InternalCIMIDSL.g:2084:1: rule__Details__Group__19__Impl : ( '=' ) ;
    public final void rule__Details__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2088:1: ( ( '=' ) )
            // InternalCIMIDSL.g:2089:1: ( '=' )
            {
            // InternalCIMIDSL.g:2089:1: ( '=' )
            // InternalCIMIDSL.g:2090:2: '='
            {
             before(grammarAccess.getDetailsAccess().getEqualsSignKeyword_19()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getEqualsSignKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__19__Impl"


    // $ANTLR start "rule__Details__Group__20"
    // InternalCIMIDSL.g:2099:1: rule__Details__Group__20 : rule__Details__Group__20__Impl rule__Details__Group__21 ;
    public final void rule__Details__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2103:1: ( rule__Details__Group__20__Impl rule__Details__Group__21 )
            // InternalCIMIDSL.g:2104:2: rule__Details__Group__20__Impl rule__Details__Group__21
            {
            pushFollow(FOLLOW_31);
            rule__Details__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__20"


    // $ANTLR start "rule__Details__Group__20__Impl"
    // InternalCIMIDSL.g:2111:1: rule__Details__Group__20__Impl : ( '<[' ) ;
    public final void rule__Details__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2115:1: ( ( '<[' ) )
            // InternalCIMIDSL.g:2116:1: ( '<[' )
            {
            // InternalCIMIDSL.g:2116:1: ( '<[' )
            // InternalCIMIDSL.g:2117:2: '<['
            {
             before(grammarAccess.getDetailsAccess().getLessThanSignLeftSquareBracketKeyword_20()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getLessThanSignLeftSquareBracketKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__20__Impl"


    // $ANTLR start "rule__Details__Group__21"
    // InternalCIMIDSL.g:2126:1: rule__Details__Group__21 : rule__Details__Group__21__Impl rule__Details__Group__22 ;
    public final void rule__Details__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2130:1: ( rule__Details__Group__21__Impl rule__Details__Group__22 )
            // InternalCIMIDSL.g:2131:2: rule__Details__Group__21__Impl rule__Details__Group__22
            {
            pushFollow(FOLLOW_29);
            rule__Details__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__21"


    // $ANTLR start "rule__Details__Group__21__Impl"
    // InternalCIMIDSL.g:2138:1: rule__Details__Group__21__Impl : ( ( rule__Details__CopyrightAssignment_21 ) ) ;
    public final void rule__Details__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2142:1: ( ( ( rule__Details__CopyrightAssignment_21 ) ) )
            // InternalCIMIDSL.g:2143:1: ( ( rule__Details__CopyrightAssignment_21 ) )
            {
            // InternalCIMIDSL.g:2143:1: ( ( rule__Details__CopyrightAssignment_21 ) )
            // InternalCIMIDSL.g:2144:2: ( rule__Details__CopyrightAssignment_21 )
            {
             before(grammarAccess.getDetailsAccess().getCopyrightAssignment_21()); 
            // InternalCIMIDSL.g:2145:2: ( rule__Details__CopyrightAssignment_21 )
            // InternalCIMIDSL.g:2145:3: rule__Details__CopyrightAssignment_21
            {
            pushFollow(FOLLOW_2);
            rule__Details__CopyrightAssignment_21();

            state._fsp--;


            }

             after(grammarAccess.getDetailsAccess().getCopyrightAssignment_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__21__Impl"


    // $ANTLR start "rule__Details__Group__22"
    // InternalCIMIDSL.g:2153:1: rule__Details__Group__22 : rule__Details__Group__22__Impl rule__Details__Group__23 ;
    public final void rule__Details__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2157:1: ( rule__Details__Group__22__Impl rule__Details__Group__23 )
            // InternalCIMIDSL.g:2158:2: rule__Details__Group__22__Impl rule__Details__Group__23
            {
            pushFollow(FOLLOW_12);
            rule__Details__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__22"


    // $ANTLR start "rule__Details__Group__22__Impl"
    // InternalCIMIDSL.g:2165:1: rule__Details__Group__22__Impl : ( ']>' ) ;
    public final void rule__Details__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2169:1: ( ( ']>' ) )
            // InternalCIMIDSL.g:2170:1: ( ']>' )
            {
            // InternalCIMIDSL.g:2170:1: ( ']>' )
            // InternalCIMIDSL.g:2171:2: ']>'
            {
             before(grammarAccess.getDetailsAccess().getRightSquareBracketGreaterThanSignKeyword_22()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getRightSquareBracketGreaterThanSignKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__22__Impl"


    // $ANTLR start "rule__Details__Group__23"
    // InternalCIMIDSL.g:2180:1: rule__Details__Group__23 : rule__Details__Group__23__Impl rule__Details__Group__24 ;
    public final void rule__Details__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2184:1: ( rule__Details__Group__23__Impl rule__Details__Group__24 )
            // InternalCIMIDSL.g:2185:2: rule__Details__Group__23__Impl rule__Details__Group__24
            {
            pushFollow(FOLLOW_33);
            rule__Details__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__23"


    // $ANTLR start "rule__Details__Group__23__Impl"
    // InternalCIMIDSL.g:2192:1: rule__Details__Group__23__Impl : ( '\\r' ) ;
    public final void rule__Details__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2196:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:2197:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:2197:1: ( '\\r' )
            // InternalCIMIDSL.g:2198:2: '\\r'
            {
             before(grammarAccess.getDetailsAccess().getControl000dKeyword_23()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getControl000dKeyword_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__23__Impl"


    // $ANTLR start "rule__Details__Group__24"
    // InternalCIMIDSL.g:2207:1: rule__Details__Group__24 : rule__Details__Group__24__Impl rule__Details__Group__25 ;
    public final void rule__Details__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2211:1: ( rule__Details__Group__24__Impl rule__Details__Group__25 )
            // InternalCIMIDSL.g:2212:2: rule__Details__Group__24__Impl rule__Details__Group__25
            {
            pushFollow(FOLLOW_20);
            rule__Details__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__25();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__24"


    // $ANTLR start "rule__Details__Group__24__Impl"
    // InternalCIMIDSL.g:2219:1: rule__Details__Group__24__Impl : ( 'other_details' ) ;
    public final void rule__Details__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2223:1: ( ( 'other_details' ) )
            // InternalCIMIDSL.g:2224:1: ( 'other_details' )
            {
            // InternalCIMIDSL.g:2224:1: ( 'other_details' )
            // InternalCIMIDSL.g:2225:2: 'other_details'
            {
             before(grammarAccess.getDetailsAccess().getOther_detailsKeyword_24()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getOther_detailsKeyword_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__24__Impl"


    // $ANTLR start "rule__Details__Group__25"
    // InternalCIMIDSL.g:2234:1: rule__Details__Group__25 : rule__Details__Group__25__Impl rule__Details__Group__26 ;
    public final void rule__Details__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2238:1: ( rule__Details__Group__25__Impl rule__Details__Group__26 )
            // InternalCIMIDSL.g:2239:2: rule__Details__Group__25__Impl rule__Details__Group__26
            {
            pushFollow(FOLLOW_28);
            rule__Details__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__26();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__25"


    // $ANTLR start "rule__Details__Group__25__Impl"
    // InternalCIMIDSL.g:2246:1: rule__Details__Group__25__Impl : ( '=' ) ;
    public final void rule__Details__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2250:1: ( ( '=' ) )
            // InternalCIMIDSL.g:2251:1: ( '=' )
            {
            // InternalCIMIDSL.g:2251:1: ( '=' )
            // InternalCIMIDSL.g:2252:2: '='
            {
             before(grammarAccess.getDetailsAccess().getEqualsSignKeyword_25()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getEqualsSignKeyword_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__25__Impl"


    // $ANTLR start "rule__Details__Group__26"
    // InternalCIMIDSL.g:2261:1: rule__Details__Group__26 : rule__Details__Group__26__Impl rule__Details__Group__27 ;
    public final void rule__Details__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2265:1: ( rule__Details__Group__26__Impl rule__Details__Group__27 )
            // InternalCIMIDSL.g:2266:2: rule__Details__Group__26__Impl rule__Details__Group__27
            {
            pushFollow(FOLLOW_34);
            rule__Details__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__27();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__26"


    // $ANTLR start "rule__Details__Group__26__Impl"
    // InternalCIMIDSL.g:2273:1: rule__Details__Group__26__Impl : ( '<[' ) ;
    public final void rule__Details__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2277:1: ( ( '<[' ) )
            // InternalCIMIDSL.g:2278:1: ( '<[' )
            {
            // InternalCIMIDSL.g:2278:1: ( '<[' )
            // InternalCIMIDSL.g:2279:2: '<['
            {
             before(grammarAccess.getDetailsAccess().getLessThanSignLeftSquareBracketKeyword_26()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getLessThanSignLeftSquareBracketKeyword_26()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__26__Impl"


    // $ANTLR start "rule__Details__Group__27"
    // InternalCIMIDSL.g:2288:1: rule__Details__Group__27 : rule__Details__Group__27__Impl rule__Details__Group__28 ;
    public final void rule__Details__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2292:1: ( rule__Details__Group__27__Impl rule__Details__Group__28 )
            // InternalCIMIDSL.g:2293:2: rule__Details__Group__27__Impl rule__Details__Group__28
            {
            pushFollow(FOLLOW_29);
            rule__Details__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__28();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__27"


    // $ANTLR start "rule__Details__Group__27__Impl"
    // InternalCIMIDSL.g:2300:1: rule__Details__Group__27__Impl : ( ( rule__Details__Other_detailsAssignment_27 ) ) ;
    public final void rule__Details__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2304:1: ( ( ( rule__Details__Other_detailsAssignment_27 ) ) )
            // InternalCIMIDSL.g:2305:1: ( ( rule__Details__Other_detailsAssignment_27 ) )
            {
            // InternalCIMIDSL.g:2305:1: ( ( rule__Details__Other_detailsAssignment_27 ) )
            // InternalCIMIDSL.g:2306:2: ( rule__Details__Other_detailsAssignment_27 )
            {
             before(grammarAccess.getDetailsAccess().getOther_detailsAssignment_27()); 
            // InternalCIMIDSL.g:2307:2: ( rule__Details__Other_detailsAssignment_27 )
            // InternalCIMIDSL.g:2307:3: rule__Details__Other_detailsAssignment_27
            {
            pushFollow(FOLLOW_2);
            rule__Details__Other_detailsAssignment_27();

            state._fsp--;


            }

             after(grammarAccess.getDetailsAccess().getOther_detailsAssignment_27()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__27__Impl"


    // $ANTLR start "rule__Details__Group__28"
    // InternalCIMIDSL.g:2315:1: rule__Details__Group__28 : rule__Details__Group__28__Impl rule__Details__Group__29 ;
    public final void rule__Details__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2319:1: ( rule__Details__Group__28__Impl rule__Details__Group__29 )
            // InternalCIMIDSL.g:2320:2: rule__Details__Group__28__Impl rule__Details__Group__29
            {
            pushFollow(FOLLOW_12);
            rule__Details__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__29();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__28"


    // $ANTLR start "rule__Details__Group__28__Impl"
    // InternalCIMIDSL.g:2327:1: rule__Details__Group__28__Impl : ( ']>' ) ;
    public final void rule__Details__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2331:1: ( ( ']>' ) )
            // InternalCIMIDSL.g:2332:1: ( ']>' )
            {
            // InternalCIMIDSL.g:2332:1: ( ']>' )
            // InternalCIMIDSL.g:2333:2: ']>'
            {
             before(grammarAccess.getDetailsAccess().getRightSquareBracketGreaterThanSignKeyword_28()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getRightSquareBracketGreaterThanSignKeyword_28()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__28__Impl"


    // $ANTLR start "rule__Details__Group__29"
    // InternalCIMIDSL.g:2342:1: rule__Details__Group__29 : rule__Details__Group__29__Impl rule__Details__Group__30 ;
    public final void rule__Details__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2346:1: ( rule__Details__Group__29__Impl rule__Details__Group__30 )
            // InternalCIMIDSL.g:2347:2: rule__Details__Group__29__Impl rule__Details__Group__30
            {
            pushFollow(FOLLOW_23);
            rule__Details__Group__29__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__30();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__29"


    // $ANTLR start "rule__Details__Group__29__Impl"
    // InternalCIMIDSL.g:2354:1: rule__Details__Group__29__Impl : ( '\\r' ) ;
    public final void rule__Details__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2358:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:2359:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:2359:1: ( '\\r' )
            // InternalCIMIDSL.g:2360:2: '\\r'
            {
             before(grammarAccess.getDetailsAccess().getControl000dKeyword_29()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getControl000dKeyword_29()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__29__Impl"


    // $ANTLR start "rule__Details__Group__30"
    // InternalCIMIDSL.g:2369:1: rule__Details__Group__30 : rule__Details__Group__30__Impl rule__Details__Group__31 ;
    public final void rule__Details__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2373:1: ( rule__Details__Group__30__Impl rule__Details__Group__31 )
            // InternalCIMIDSL.g:2374:2: rule__Details__Group__30__Impl rule__Details__Group__31
            {
            pushFollow(FOLLOW_12);
            rule__Details__Group__30__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Details__Group__31();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__30"


    // $ANTLR start "rule__Details__Group__30__Impl"
    // InternalCIMIDSL.g:2381:1: rule__Details__Group__30__Impl : ( '>' ) ;
    public final void rule__Details__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2385:1: ( ( '>' ) )
            // InternalCIMIDSL.g:2386:1: ( '>' )
            {
            // InternalCIMIDSL.g:2386:1: ( '>' )
            // InternalCIMIDSL.g:2387:2: '>'
            {
             before(grammarAccess.getDetailsAccess().getGreaterThanSignKeyword_30()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getGreaterThanSignKeyword_30()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__30__Impl"


    // $ANTLR start "rule__Details__Group__31"
    // InternalCIMIDSL.g:2396:1: rule__Details__Group__31 : rule__Details__Group__31__Impl ;
    public final void rule__Details__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2400:1: ( rule__Details__Group__31__Impl )
            // InternalCIMIDSL.g:2401:2: rule__Details__Group__31__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Details__Group__31__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__31"


    // $ANTLR start "rule__Details__Group__31__Impl"
    // InternalCIMIDSL.g:2407:1: rule__Details__Group__31__Impl : ( '\\r' ) ;
    public final void rule__Details__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2411:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:2412:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:2412:1: ( '\\r' )
            // InternalCIMIDSL.g:2413:2: '\\r'
            {
             before(grammarAccess.getDetailsAccess().getControl000dKeyword_31()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getControl000dKeyword_31()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Group__31__Impl"


    // $ANTLR start "rule__OtherDetails__Group__0"
    // InternalCIMIDSL.g:2423:1: rule__OtherDetails__Group__0 : rule__OtherDetails__Group__0__Impl rule__OtherDetails__Group__1 ;
    public final void rule__OtherDetails__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2427:1: ( rule__OtherDetails__Group__0__Impl rule__OtherDetails__Group__1 )
            // InternalCIMIDSL.g:2428:2: rule__OtherDetails__Group__0__Impl rule__OtherDetails__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__OtherDetails__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__0"


    // $ANTLR start "rule__OtherDetails__Group__0__Impl"
    // InternalCIMIDSL.g:2435:1: rule__OtherDetails__Group__0__Impl : ( '[\"lifecycle_state\"]' ) ;
    public final void rule__OtherDetails__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2439:1: ( ( '[\"lifecycle_state\"]' ) )
            // InternalCIMIDSL.g:2440:1: ( '[\"lifecycle_state\"]' )
            {
            // InternalCIMIDSL.g:2440:1: ( '[\"lifecycle_state\"]' )
            // InternalCIMIDSL.g:2441:2: '[\"lifecycle_state\"]'
            {
             before(grammarAccess.getOtherDetailsAccess().getLifecycle_stateKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getLifecycle_stateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__0__Impl"


    // $ANTLR start "rule__OtherDetails__Group__1"
    // InternalCIMIDSL.g:2450:1: rule__OtherDetails__Group__1 : rule__OtherDetails__Group__1__Impl rule__OtherDetails__Group__2 ;
    public final void rule__OtherDetails__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2454:1: ( rule__OtherDetails__Group__1__Impl rule__OtherDetails__Group__2 )
            // InternalCIMIDSL.g:2455:2: rule__OtherDetails__Group__1__Impl rule__OtherDetails__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__OtherDetails__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__1"


    // $ANTLR start "rule__OtherDetails__Group__1__Impl"
    // InternalCIMIDSL.g:2462:1: rule__OtherDetails__Group__1__Impl : ( '=' ) ;
    public final void rule__OtherDetails__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2466:1: ( ( '=' ) )
            // InternalCIMIDSL.g:2467:1: ( '=' )
            {
            // InternalCIMIDSL.g:2467:1: ( '=' )
            // InternalCIMIDSL.g:2468:2: '='
            {
             before(grammarAccess.getOtherDetailsAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__1__Impl"


    // $ANTLR start "rule__OtherDetails__Group__2"
    // InternalCIMIDSL.g:2477:1: rule__OtherDetails__Group__2 : rule__OtherDetails__Group__2__Impl rule__OtherDetails__Group__3 ;
    public final void rule__OtherDetails__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2481:1: ( rule__OtherDetails__Group__2__Impl rule__OtherDetails__Group__3 )
            // InternalCIMIDSL.g:2482:2: rule__OtherDetails__Group__2__Impl rule__OtherDetails__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__OtherDetails__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__2"


    // $ANTLR start "rule__OtherDetails__Group__2__Impl"
    // InternalCIMIDSL.g:2489:1: rule__OtherDetails__Group__2__Impl : ( '<' ) ;
    public final void rule__OtherDetails__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2493:1: ( ( '<' ) )
            // InternalCIMIDSL.g:2494:1: ( '<' )
            {
            // InternalCIMIDSL.g:2494:1: ( '<' )
            // InternalCIMIDSL.g:2495:2: '<'
            {
             before(grammarAccess.getOtherDetailsAccess().getLessThanSignKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getLessThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__2__Impl"


    // $ANTLR start "rule__OtherDetails__Group__3"
    // InternalCIMIDSL.g:2504:1: rule__OtherDetails__Group__3 : rule__OtherDetails__Group__3__Impl rule__OtherDetails__Group__4 ;
    public final void rule__OtherDetails__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2508:1: ( rule__OtherDetails__Group__3__Impl rule__OtherDetails__Group__4 )
            // InternalCIMIDSL.g:2509:2: rule__OtherDetails__Group__3__Impl rule__OtherDetails__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__OtherDetails__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__3"


    // $ANTLR start "rule__OtherDetails__Group__3__Impl"
    // InternalCIMIDSL.g:2516:1: rule__OtherDetails__Group__3__Impl : ( ( rule__OtherDetails__Lifecycle_stateAssignment_3 ) ) ;
    public final void rule__OtherDetails__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2520:1: ( ( ( rule__OtherDetails__Lifecycle_stateAssignment_3 ) ) )
            // InternalCIMIDSL.g:2521:1: ( ( rule__OtherDetails__Lifecycle_stateAssignment_3 ) )
            {
            // InternalCIMIDSL.g:2521:1: ( ( rule__OtherDetails__Lifecycle_stateAssignment_3 ) )
            // InternalCIMIDSL.g:2522:2: ( rule__OtherDetails__Lifecycle_stateAssignment_3 )
            {
             before(grammarAccess.getOtherDetailsAccess().getLifecycle_stateAssignment_3()); 
            // InternalCIMIDSL.g:2523:2: ( rule__OtherDetails__Lifecycle_stateAssignment_3 )
            // InternalCIMIDSL.g:2523:3: rule__OtherDetails__Lifecycle_stateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OtherDetails__Lifecycle_stateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOtherDetailsAccess().getLifecycle_stateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__3__Impl"


    // $ANTLR start "rule__OtherDetails__Group__4"
    // InternalCIMIDSL.g:2531:1: rule__OtherDetails__Group__4 : rule__OtherDetails__Group__4__Impl rule__OtherDetails__Group__5 ;
    public final void rule__OtherDetails__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2535:1: ( rule__OtherDetails__Group__4__Impl rule__OtherDetails__Group__5 )
            // InternalCIMIDSL.g:2536:2: rule__OtherDetails__Group__4__Impl rule__OtherDetails__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__OtherDetails__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__4"


    // $ANTLR start "rule__OtherDetails__Group__4__Impl"
    // InternalCIMIDSL.g:2543:1: rule__OtherDetails__Group__4__Impl : ( '>' ) ;
    public final void rule__OtherDetails__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2547:1: ( ( '>' ) )
            // InternalCIMIDSL.g:2548:1: ( '>' )
            {
            // InternalCIMIDSL.g:2548:1: ( '>' )
            // InternalCIMIDSL.g:2549:2: '>'
            {
             before(grammarAccess.getOtherDetailsAccess().getGreaterThanSignKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__4__Impl"


    // $ANTLR start "rule__OtherDetails__Group__5"
    // InternalCIMIDSL.g:2558:1: rule__OtherDetails__Group__5 : rule__OtherDetails__Group__5__Impl rule__OtherDetails__Group__6 ;
    public final void rule__OtherDetails__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2562:1: ( rule__OtherDetails__Group__5__Impl rule__OtherDetails__Group__6 )
            // InternalCIMIDSL.g:2563:2: rule__OtherDetails__Group__5__Impl rule__OtherDetails__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__OtherDetails__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__5"


    // $ANTLR start "rule__OtherDetails__Group__5__Impl"
    // InternalCIMIDSL.g:2570:1: rule__OtherDetails__Group__5__Impl : ( '\\r' ) ;
    public final void rule__OtherDetails__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2574:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:2575:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:2575:1: ( '\\r' )
            // InternalCIMIDSL.g:2576:2: '\\r'
            {
             before(grammarAccess.getOtherDetailsAccess().getControl000dKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getControl000dKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__5__Impl"


    // $ANTLR start "rule__OtherDetails__Group__6"
    // InternalCIMIDSL.g:2585:1: rule__OtherDetails__Group__6 : rule__OtherDetails__Group__6__Impl rule__OtherDetails__Group__7 ;
    public final void rule__OtherDetails__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2589:1: ( rule__OtherDetails__Group__6__Impl rule__OtherDetails__Group__7 )
            // InternalCIMIDSL.g:2590:2: rule__OtherDetails__Group__6__Impl rule__OtherDetails__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__OtherDetails__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__6"


    // $ANTLR start "rule__OtherDetails__Group__6__Impl"
    // InternalCIMIDSL.g:2597:1: rule__OtherDetails__Group__6__Impl : ( '[\"custodian_namespace\"]' ) ;
    public final void rule__OtherDetails__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2601:1: ( ( '[\"custodian_namespace\"]' ) )
            // InternalCIMIDSL.g:2602:1: ( '[\"custodian_namespace\"]' )
            {
            // InternalCIMIDSL.g:2602:1: ( '[\"custodian_namespace\"]' )
            // InternalCIMIDSL.g:2603:2: '[\"custodian_namespace\"]'
            {
             before(grammarAccess.getOtherDetailsAccess().getCustodian_namespaceKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getCustodian_namespaceKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__6__Impl"


    // $ANTLR start "rule__OtherDetails__Group__7"
    // InternalCIMIDSL.g:2612:1: rule__OtherDetails__Group__7 : rule__OtherDetails__Group__7__Impl rule__OtherDetails__Group__8 ;
    public final void rule__OtherDetails__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2616:1: ( rule__OtherDetails__Group__7__Impl rule__OtherDetails__Group__8 )
            // InternalCIMIDSL.g:2617:2: rule__OtherDetails__Group__7__Impl rule__OtherDetails__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__OtherDetails__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__7"


    // $ANTLR start "rule__OtherDetails__Group__7__Impl"
    // InternalCIMIDSL.g:2624:1: rule__OtherDetails__Group__7__Impl : ( '=' ) ;
    public final void rule__OtherDetails__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2628:1: ( ( '=' ) )
            // InternalCIMIDSL.g:2629:1: ( '=' )
            {
            // InternalCIMIDSL.g:2629:1: ( '=' )
            // InternalCIMIDSL.g:2630:2: '='
            {
             before(grammarAccess.getOtherDetailsAccess().getEqualsSignKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__7__Impl"


    // $ANTLR start "rule__OtherDetails__Group__8"
    // InternalCIMIDSL.g:2639:1: rule__OtherDetails__Group__8 : rule__OtherDetails__Group__8__Impl rule__OtherDetails__Group__9 ;
    public final void rule__OtherDetails__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2643:1: ( rule__OtherDetails__Group__8__Impl rule__OtherDetails__Group__9 )
            // InternalCIMIDSL.g:2644:2: rule__OtherDetails__Group__8__Impl rule__OtherDetails__Group__9
            {
            pushFollow(FOLLOW_31);
            rule__OtherDetails__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__8"


    // $ANTLR start "rule__OtherDetails__Group__8__Impl"
    // InternalCIMIDSL.g:2651:1: rule__OtherDetails__Group__8__Impl : ( '<' ) ;
    public final void rule__OtherDetails__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2655:1: ( ( '<' ) )
            // InternalCIMIDSL.g:2656:1: ( '<' )
            {
            // InternalCIMIDSL.g:2656:1: ( '<' )
            // InternalCIMIDSL.g:2657:2: '<'
            {
             before(grammarAccess.getOtherDetailsAccess().getLessThanSignKeyword_8()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getLessThanSignKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__8__Impl"


    // $ANTLR start "rule__OtherDetails__Group__9"
    // InternalCIMIDSL.g:2666:1: rule__OtherDetails__Group__9 : rule__OtherDetails__Group__9__Impl rule__OtherDetails__Group__10 ;
    public final void rule__OtherDetails__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2670:1: ( rule__OtherDetails__Group__9__Impl rule__OtherDetails__Group__10 )
            // InternalCIMIDSL.g:2671:2: rule__OtherDetails__Group__9__Impl rule__OtherDetails__Group__10
            {
            pushFollow(FOLLOW_23);
            rule__OtherDetails__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__9"


    // $ANTLR start "rule__OtherDetails__Group__9__Impl"
    // InternalCIMIDSL.g:2678:1: rule__OtherDetails__Group__9__Impl : ( ( rule__OtherDetails__Custodian_namespaceAssignment_9 ) ) ;
    public final void rule__OtherDetails__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2682:1: ( ( ( rule__OtherDetails__Custodian_namespaceAssignment_9 ) ) )
            // InternalCIMIDSL.g:2683:1: ( ( rule__OtherDetails__Custodian_namespaceAssignment_9 ) )
            {
            // InternalCIMIDSL.g:2683:1: ( ( rule__OtherDetails__Custodian_namespaceAssignment_9 ) )
            // InternalCIMIDSL.g:2684:2: ( rule__OtherDetails__Custodian_namespaceAssignment_9 )
            {
             before(grammarAccess.getOtherDetailsAccess().getCustodian_namespaceAssignment_9()); 
            // InternalCIMIDSL.g:2685:2: ( rule__OtherDetails__Custodian_namespaceAssignment_9 )
            // InternalCIMIDSL.g:2685:3: rule__OtherDetails__Custodian_namespaceAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__OtherDetails__Custodian_namespaceAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getOtherDetailsAccess().getCustodian_namespaceAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__9__Impl"


    // $ANTLR start "rule__OtherDetails__Group__10"
    // InternalCIMIDSL.g:2693:1: rule__OtherDetails__Group__10 : rule__OtherDetails__Group__10__Impl rule__OtherDetails__Group__11 ;
    public final void rule__OtherDetails__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2697:1: ( rule__OtherDetails__Group__10__Impl rule__OtherDetails__Group__11 )
            // InternalCIMIDSL.g:2698:2: rule__OtherDetails__Group__10__Impl rule__OtherDetails__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__OtherDetails__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__10"


    // $ANTLR start "rule__OtherDetails__Group__10__Impl"
    // InternalCIMIDSL.g:2705:1: rule__OtherDetails__Group__10__Impl : ( '>' ) ;
    public final void rule__OtherDetails__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2709:1: ( ( '>' ) )
            // InternalCIMIDSL.g:2710:1: ( '>' )
            {
            // InternalCIMIDSL.g:2710:1: ( '>' )
            // InternalCIMIDSL.g:2711:2: '>'
            {
             before(grammarAccess.getOtherDetailsAccess().getGreaterThanSignKeyword_10()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getGreaterThanSignKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__10__Impl"


    // $ANTLR start "rule__OtherDetails__Group__11"
    // InternalCIMIDSL.g:2720:1: rule__OtherDetails__Group__11 : rule__OtherDetails__Group__11__Impl rule__OtherDetails__Group__12 ;
    public final void rule__OtherDetails__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2724:1: ( rule__OtherDetails__Group__11__Impl rule__OtherDetails__Group__12 )
            // InternalCIMIDSL.g:2725:2: rule__OtherDetails__Group__11__Impl rule__OtherDetails__Group__12
            {
            pushFollow(FOLLOW_36);
            rule__OtherDetails__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__11"


    // $ANTLR start "rule__OtherDetails__Group__11__Impl"
    // InternalCIMIDSL.g:2732:1: rule__OtherDetails__Group__11__Impl : ( '\\r' ) ;
    public final void rule__OtherDetails__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2736:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:2737:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:2737:1: ( '\\r' )
            // InternalCIMIDSL.g:2738:2: '\\r'
            {
             before(grammarAccess.getOtherDetailsAccess().getControl000dKeyword_11()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getControl000dKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__11__Impl"


    // $ANTLR start "rule__OtherDetails__Group__12"
    // InternalCIMIDSL.g:2747:1: rule__OtherDetails__Group__12 : rule__OtherDetails__Group__12__Impl rule__OtherDetails__Group__13 ;
    public final void rule__OtherDetails__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2751:1: ( rule__OtherDetails__Group__12__Impl rule__OtherDetails__Group__13 )
            // InternalCIMIDSL.g:2752:2: rule__OtherDetails__Group__12__Impl rule__OtherDetails__Group__13
            {
            pushFollow(FOLLOW_20);
            rule__OtherDetails__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__12"


    // $ANTLR start "rule__OtherDetails__Group__12__Impl"
    // InternalCIMIDSL.g:2759:1: rule__OtherDetails__Group__12__Impl : ( '[\"custodian_organization\"]' ) ;
    public final void rule__OtherDetails__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2763:1: ( ( '[\"custodian_organization\"]' ) )
            // InternalCIMIDSL.g:2764:1: ( '[\"custodian_organization\"]' )
            {
            // InternalCIMIDSL.g:2764:1: ( '[\"custodian_organization\"]' )
            // InternalCIMIDSL.g:2765:2: '[\"custodian_organization\"]'
            {
             before(grammarAccess.getOtherDetailsAccess().getCustodian_organizationKeyword_12()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getCustodian_organizationKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__12__Impl"


    // $ANTLR start "rule__OtherDetails__Group__13"
    // InternalCIMIDSL.g:2774:1: rule__OtherDetails__Group__13 : rule__OtherDetails__Group__13__Impl rule__OtherDetails__Group__14 ;
    public final void rule__OtherDetails__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2778:1: ( rule__OtherDetails__Group__13__Impl rule__OtherDetails__Group__14 )
            // InternalCIMIDSL.g:2779:2: rule__OtherDetails__Group__13__Impl rule__OtherDetails__Group__14
            {
            pushFollow(FOLLOW_21);
            rule__OtherDetails__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__13"


    // $ANTLR start "rule__OtherDetails__Group__13__Impl"
    // InternalCIMIDSL.g:2786:1: rule__OtherDetails__Group__13__Impl : ( '=' ) ;
    public final void rule__OtherDetails__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2790:1: ( ( '=' ) )
            // InternalCIMIDSL.g:2791:1: ( '=' )
            {
            // InternalCIMIDSL.g:2791:1: ( '=' )
            // InternalCIMIDSL.g:2792:2: '='
            {
             before(grammarAccess.getOtherDetailsAccess().getEqualsSignKeyword_13()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getEqualsSignKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__13__Impl"


    // $ANTLR start "rule__OtherDetails__Group__14"
    // InternalCIMIDSL.g:2801:1: rule__OtherDetails__Group__14 : rule__OtherDetails__Group__14__Impl rule__OtherDetails__Group__15 ;
    public final void rule__OtherDetails__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2805:1: ( rule__OtherDetails__Group__14__Impl rule__OtherDetails__Group__15 )
            // InternalCIMIDSL.g:2806:2: rule__OtherDetails__Group__14__Impl rule__OtherDetails__Group__15
            {
            pushFollow(FOLLOW_31);
            rule__OtherDetails__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__14"


    // $ANTLR start "rule__OtherDetails__Group__14__Impl"
    // InternalCIMIDSL.g:2813:1: rule__OtherDetails__Group__14__Impl : ( '<' ) ;
    public final void rule__OtherDetails__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2817:1: ( ( '<' ) )
            // InternalCIMIDSL.g:2818:1: ( '<' )
            {
            // InternalCIMIDSL.g:2818:1: ( '<' )
            // InternalCIMIDSL.g:2819:2: '<'
            {
             before(grammarAccess.getOtherDetailsAccess().getLessThanSignKeyword_14()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getLessThanSignKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__14__Impl"


    // $ANTLR start "rule__OtherDetails__Group__15"
    // InternalCIMIDSL.g:2828:1: rule__OtherDetails__Group__15 : rule__OtherDetails__Group__15__Impl rule__OtherDetails__Group__16 ;
    public final void rule__OtherDetails__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2832:1: ( rule__OtherDetails__Group__15__Impl rule__OtherDetails__Group__16 )
            // InternalCIMIDSL.g:2833:2: rule__OtherDetails__Group__15__Impl rule__OtherDetails__Group__16
            {
            pushFollow(FOLLOW_23);
            rule__OtherDetails__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__15"


    // $ANTLR start "rule__OtherDetails__Group__15__Impl"
    // InternalCIMIDSL.g:2840:1: rule__OtherDetails__Group__15__Impl : ( ( rule__OtherDetails__Custodian_organizationAssignment_15 ) ) ;
    public final void rule__OtherDetails__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2844:1: ( ( ( rule__OtherDetails__Custodian_organizationAssignment_15 ) ) )
            // InternalCIMIDSL.g:2845:1: ( ( rule__OtherDetails__Custodian_organizationAssignment_15 ) )
            {
            // InternalCIMIDSL.g:2845:1: ( ( rule__OtherDetails__Custodian_organizationAssignment_15 ) )
            // InternalCIMIDSL.g:2846:2: ( rule__OtherDetails__Custodian_organizationAssignment_15 )
            {
             before(grammarAccess.getOtherDetailsAccess().getCustodian_organizationAssignment_15()); 
            // InternalCIMIDSL.g:2847:2: ( rule__OtherDetails__Custodian_organizationAssignment_15 )
            // InternalCIMIDSL.g:2847:3: rule__OtherDetails__Custodian_organizationAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__OtherDetails__Custodian_organizationAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getOtherDetailsAccess().getCustodian_organizationAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__15__Impl"


    // $ANTLR start "rule__OtherDetails__Group__16"
    // InternalCIMIDSL.g:2855:1: rule__OtherDetails__Group__16 : rule__OtherDetails__Group__16__Impl rule__OtherDetails__Group__17 ;
    public final void rule__OtherDetails__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2859:1: ( rule__OtherDetails__Group__16__Impl rule__OtherDetails__Group__17 )
            // InternalCIMIDSL.g:2860:2: rule__OtherDetails__Group__16__Impl rule__OtherDetails__Group__17
            {
            pushFollow(FOLLOW_12);
            rule__OtherDetails__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__16"


    // $ANTLR start "rule__OtherDetails__Group__16__Impl"
    // InternalCIMIDSL.g:2867:1: rule__OtherDetails__Group__16__Impl : ( '>' ) ;
    public final void rule__OtherDetails__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2871:1: ( ( '>' ) )
            // InternalCIMIDSL.g:2872:1: ( '>' )
            {
            // InternalCIMIDSL.g:2872:1: ( '>' )
            // InternalCIMIDSL.g:2873:2: '>'
            {
             before(grammarAccess.getOtherDetailsAccess().getGreaterThanSignKeyword_16()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getGreaterThanSignKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__16__Impl"


    // $ANTLR start "rule__OtherDetails__Group__17"
    // InternalCIMIDSL.g:2882:1: rule__OtherDetails__Group__17 : rule__OtherDetails__Group__17__Impl rule__OtherDetails__Group__18 ;
    public final void rule__OtherDetails__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2886:1: ( rule__OtherDetails__Group__17__Impl rule__OtherDetails__Group__18 )
            // InternalCIMIDSL.g:2887:2: rule__OtherDetails__Group__17__Impl rule__OtherDetails__Group__18
            {
            pushFollow(FOLLOW_37);
            rule__OtherDetails__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__17"


    // $ANTLR start "rule__OtherDetails__Group__17__Impl"
    // InternalCIMIDSL.g:2894:1: rule__OtherDetails__Group__17__Impl : ( '\\r' ) ;
    public final void rule__OtherDetails__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2898:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:2899:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:2899:1: ( '\\r' )
            // InternalCIMIDSL.g:2900:2: '\\r'
            {
             before(grammarAccess.getOtherDetailsAccess().getControl000dKeyword_17()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getControl000dKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__17__Impl"


    // $ANTLR start "rule__OtherDetails__Group__18"
    // InternalCIMIDSL.g:2909:1: rule__OtherDetails__Group__18 : rule__OtherDetails__Group__18__Impl rule__OtherDetails__Group__19 ;
    public final void rule__OtherDetails__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2913:1: ( rule__OtherDetails__Group__18__Impl rule__OtherDetails__Group__19 )
            // InternalCIMIDSL.g:2914:2: rule__OtherDetails__Group__18__Impl rule__OtherDetails__Group__19
            {
            pushFollow(FOLLOW_20);
            rule__OtherDetails__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__18"


    // $ANTLR start "rule__OtherDetails__Group__18__Impl"
    // InternalCIMIDSL.g:2921:1: rule__OtherDetails__Group__18__Impl : ( '[\"license\"]' ) ;
    public final void rule__OtherDetails__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2925:1: ( ( '[\"license\"]' ) )
            // InternalCIMIDSL.g:2926:1: ( '[\"license\"]' )
            {
            // InternalCIMIDSL.g:2926:1: ( '[\"license\"]' )
            // InternalCIMIDSL.g:2927:2: '[\"license\"]'
            {
             before(grammarAccess.getOtherDetailsAccess().getLicenseKeyword_18()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getLicenseKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__18__Impl"


    // $ANTLR start "rule__OtherDetails__Group__19"
    // InternalCIMIDSL.g:2936:1: rule__OtherDetails__Group__19 : rule__OtherDetails__Group__19__Impl rule__OtherDetails__Group__20 ;
    public final void rule__OtherDetails__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2940:1: ( rule__OtherDetails__Group__19__Impl rule__OtherDetails__Group__20 )
            // InternalCIMIDSL.g:2941:2: rule__OtherDetails__Group__19__Impl rule__OtherDetails__Group__20
            {
            pushFollow(FOLLOW_21);
            rule__OtherDetails__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__19"


    // $ANTLR start "rule__OtherDetails__Group__19__Impl"
    // InternalCIMIDSL.g:2948:1: rule__OtherDetails__Group__19__Impl : ( '=' ) ;
    public final void rule__OtherDetails__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2952:1: ( ( '=' ) )
            // InternalCIMIDSL.g:2953:1: ( '=' )
            {
            // InternalCIMIDSL.g:2953:1: ( '=' )
            // InternalCIMIDSL.g:2954:2: '='
            {
             before(grammarAccess.getOtherDetailsAccess().getEqualsSignKeyword_19()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getEqualsSignKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__19__Impl"


    // $ANTLR start "rule__OtherDetails__Group__20"
    // InternalCIMIDSL.g:2963:1: rule__OtherDetails__Group__20 : rule__OtherDetails__Group__20__Impl rule__OtherDetails__Group__21 ;
    public final void rule__OtherDetails__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2967:1: ( rule__OtherDetails__Group__20__Impl rule__OtherDetails__Group__21 )
            // InternalCIMIDSL.g:2968:2: rule__OtherDetails__Group__20__Impl rule__OtherDetails__Group__21
            {
            pushFollow(FOLLOW_31);
            rule__OtherDetails__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__20"


    // $ANTLR start "rule__OtherDetails__Group__20__Impl"
    // InternalCIMIDSL.g:2975:1: rule__OtherDetails__Group__20__Impl : ( '<' ) ;
    public final void rule__OtherDetails__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2979:1: ( ( '<' ) )
            // InternalCIMIDSL.g:2980:1: ( '<' )
            {
            // InternalCIMIDSL.g:2980:1: ( '<' )
            // InternalCIMIDSL.g:2981:2: '<'
            {
             before(grammarAccess.getOtherDetailsAccess().getLessThanSignKeyword_20()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getLessThanSignKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__20__Impl"


    // $ANTLR start "rule__OtherDetails__Group__21"
    // InternalCIMIDSL.g:2990:1: rule__OtherDetails__Group__21 : rule__OtherDetails__Group__21__Impl rule__OtherDetails__Group__22 ;
    public final void rule__OtherDetails__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:2994:1: ( rule__OtherDetails__Group__21__Impl rule__OtherDetails__Group__22 )
            // InternalCIMIDSL.g:2995:2: rule__OtherDetails__Group__21__Impl rule__OtherDetails__Group__22
            {
            pushFollow(FOLLOW_23);
            rule__OtherDetails__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__21"


    // $ANTLR start "rule__OtherDetails__Group__21__Impl"
    // InternalCIMIDSL.g:3002:1: rule__OtherDetails__Group__21__Impl : ( ( rule__OtherDetails__LicenseAssignment_21 ) ) ;
    public final void rule__OtherDetails__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3006:1: ( ( ( rule__OtherDetails__LicenseAssignment_21 ) ) )
            // InternalCIMIDSL.g:3007:1: ( ( rule__OtherDetails__LicenseAssignment_21 ) )
            {
            // InternalCIMIDSL.g:3007:1: ( ( rule__OtherDetails__LicenseAssignment_21 ) )
            // InternalCIMIDSL.g:3008:2: ( rule__OtherDetails__LicenseAssignment_21 )
            {
             before(grammarAccess.getOtherDetailsAccess().getLicenseAssignment_21()); 
            // InternalCIMIDSL.g:3009:2: ( rule__OtherDetails__LicenseAssignment_21 )
            // InternalCIMIDSL.g:3009:3: rule__OtherDetails__LicenseAssignment_21
            {
            pushFollow(FOLLOW_2);
            rule__OtherDetails__LicenseAssignment_21();

            state._fsp--;


            }

             after(grammarAccess.getOtherDetailsAccess().getLicenseAssignment_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__21__Impl"


    // $ANTLR start "rule__OtherDetails__Group__22"
    // InternalCIMIDSL.g:3017:1: rule__OtherDetails__Group__22 : rule__OtherDetails__Group__22__Impl rule__OtherDetails__Group__23 ;
    public final void rule__OtherDetails__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3021:1: ( rule__OtherDetails__Group__22__Impl rule__OtherDetails__Group__23 )
            // InternalCIMIDSL.g:3022:2: rule__OtherDetails__Group__22__Impl rule__OtherDetails__Group__23
            {
            pushFollow(FOLLOW_12);
            rule__OtherDetails__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__22"


    // $ANTLR start "rule__OtherDetails__Group__22__Impl"
    // InternalCIMIDSL.g:3029:1: rule__OtherDetails__Group__22__Impl : ( '>' ) ;
    public final void rule__OtherDetails__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3033:1: ( ( '>' ) )
            // InternalCIMIDSL.g:3034:1: ( '>' )
            {
            // InternalCIMIDSL.g:3034:1: ( '>' )
            // InternalCIMIDSL.g:3035:2: '>'
            {
             before(grammarAccess.getOtherDetailsAccess().getGreaterThanSignKeyword_22()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getGreaterThanSignKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__22__Impl"


    // $ANTLR start "rule__OtherDetails__Group__23"
    // InternalCIMIDSL.g:3044:1: rule__OtherDetails__Group__23 : rule__OtherDetails__Group__23__Impl rule__OtherDetails__Group__24 ;
    public final void rule__OtherDetails__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3048:1: ( rule__OtherDetails__Group__23__Impl rule__OtherDetails__Group__24 )
            // InternalCIMIDSL.g:3049:2: rule__OtherDetails__Group__23__Impl rule__OtherDetails__Group__24
            {
            pushFollow(FOLLOW_38);
            rule__OtherDetails__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__23"


    // $ANTLR start "rule__OtherDetails__Group__23__Impl"
    // InternalCIMIDSL.g:3056:1: rule__OtherDetails__Group__23__Impl : ( '\\r' ) ;
    public final void rule__OtherDetails__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3060:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:3061:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:3061:1: ( '\\r' )
            // InternalCIMIDSL.g:3062:2: '\\r'
            {
             before(grammarAccess.getOtherDetailsAccess().getControl000dKeyword_23()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getControl000dKeyword_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__23__Impl"


    // $ANTLR start "rule__OtherDetails__Group__24"
    // InternalCIMIDSL.g:3071:1: rule__OtherDetails__Group__24 : rule__OtherDetails__Group__24__Impl rule__OtherDetails__Group__25 ;
    public final void rule__OtherDetails__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3075:1: ( rule__OtherDetails__Group__24__Impl rule__OtherDetails__Group__25 )
            // InternalCIMIDSL.g:3076:2: rule__OtherDetails__Group__24__Impl rule__OtherDetails__Group__25
            {
            pushFollow(FOLLOW_20);
            rule__OtherDetails__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__25();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__24"


    // $ANTLR start "rule__OtherDetails__Group__24__Impl"
    // InternalCIMIDSL.g:3083:1: rule__OtherDetails__Group__24__Impl : ( '[\"ip_acknowledgement_loinc\"]' ) ;
    public final void rule__OtherDetails__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3087:1: ( ( '[\"ip_acknowledgement_loinc\"]' ) )
            // InternalCIMIDSL.g:3088:1: ( '[\"ip_acknowledgement_loinc\"]' )
            {
            // InternalCIMIDSL.g:3088:1: ( '[\"ip_acknowledgement_loinc\"]' )
            // InternalCIMIDSL.g:3089:2: '[\"ip_acknowledgement_loinc\"]'
            {
             before(grammarAccess.getOtherDetailsAccess().getIp_acknowledgement_loincKeyword_24()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getIp_acknowledgement_loincKeyword_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__24__Impl"


    // $ANTLR start "rule__OtherDetails__Group__25"
    // InternalCIMIDSL.g:3098:1: rule__OtherDetails__Group__25 : rule__OtherDetails__Group__25__Impl rule__OtherDetails__Group__26 ;
    public final void rule__OtherDetails__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3102:1: ( rule__OtherDetails__Group__25__Impl rule__OtherDetails__Group__26 )
            // InternalCIMIDSL.g:3103:2: rule__OtherDetails__Group__25__Impl rule__OtherDetails__Group__26
            {
            pushFollow(FOLLOW_21);
            rule__OtherDetails__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__26();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__25"


    // $ANTLR start "rule__OtherDetails__Group__25__Impl"
    // InternalCIMIDSL.g:3110:1: rule__OtherDetails__Group__25__Impl : ( '=' ) ;
    public final void rule__OtherDetails__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3114:1: ( ( '=' ) )
            // InternalCIMIDSL.g:3115:1: ( '=' )
            {
            // InternalCIMIDSL.g:3115:1: ( '=' )
            // InternalCIMIDSL.g:3116:2: '='
            {
             before(grammarAccess.getOtherDetailsAccess().getEqualsSignKeyword_25()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getEqualsSignKeyword_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__25__Impl"


    // $ANTLR start "rule__OtherDetails__Group__26"
    // InternalCIMIDSL.g:3125:1: rule__OtherDetails__Group__26 : rule__OtherDetails__Group__26__Impl rule__OtherDetails__Group__27 ;
    public final void rule__OtherDetails__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3129:1: ( rule__OtherDetails__Group__26__Impl rule__OtherDetails__Group__27 )
            // InternalCIMIDSL.g:3130:2: rule__OtherDetails__Group__26__Impl rule__OtherDetails__Group__27
            {
            pushFollow(FOLLOW_31);
            rule__OtherDetails__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__27();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__26"


    // $ANTLR start "rule__OtherDetails__Group__26__Impl"
    // InternalCIMIDSL.g:3137:1: rule__OtherDetails__Group__26__Impl : ( '<' ) ;
    public final void rule__OtherDetails__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3141:1: ( ( '<' ) )
            // InternalCIMIDSL.g:3142:1: ( '<' )
            {
            // InternalCIMIDSL.g:3142:1: ( '<' )
            // InternalCIMIDSL.g:3143:2: '<'
            {
             before(grammarAccess.getOtherDetailsAccess().getLessThanSignKeyword_26()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getLessThanSignKeyword_26()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__26__Impl"


    // $ANTLR start "rule__OtherDetails__Group__27"
    // InternalCIMIDSL.g:3152:1: rule__OtherDetails__Group__27 : rule__OtherDetails__Group__27__Impl rule__OtherDetails__Group__28 ;
    public final void rule__OtherDetails__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3156:1: ( rule__OtherDetails__Group__27__Impl rule__OtherDetails__Group__28 )
            // InternalCIMIDSL.g:3157:2: rule__OtherDetails__Group__27__Impl rule__OtherDetails__Group__28
            {
            pushFollow(FOLLOW_23);
            rule__OtherDetails__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__28();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__27"


    // $ANTLR start "rule__OtherDetails__Group__27__Impl"
    // InternalCIMIDSL.g:3164:1: rule__OtherDetails__Group__27__Impl : ( ( rule__OtherDetails__Ip_acknowledgement_loincAssignment_27 ) ) ;
    public final void rule__OtherDetails__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3168:1: ( ( ( rule__OtherDetails__Ip_acknowledgement_loincAssignment_27 ) ) )
            // InternalCIMIDSL.g:3169:1: ( ( rule__OtherDetails__Ip_acknowledgement_loincAssignment_27 ) )
            {
            // InternalCIMIDSL.g:3169:1: ( ( rule__OtherDetails__Ip_acknowledgement_loincAssignment_27 ) )
            // InternalCIMIDSL.g:3170:2: ( rule__OtherDetails__Ip_acknowledgement_loincAssignment_27 )
            {
             before(grammarAccess.getOtherDetailsAccess().getIp_acknowledgement_loincAssignment_27()); 
            // InternalCIMIDSL.g:3171:2: ( rule__OtherDetails__Ip_acknowledgement_loincAssignment_27 )
            // InternalCIMIDSL.g:3171:3: rule__OtherDetails__Ip_acknowledgement_loincAssignment_27
            {
            pushFollow(FOLLOW_2);
            rule__OtherDetails__Ip_acknowledgement_loincAssignment_27();

            state._fsp--;


            }

             after(grammarAccess.getOtherDetailsAccess().getIp_acknowledgement_loincAssignment_27()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__27__Impl"


    // $ANTLR start "rule__OtherDetails__Group__28"
    // InternalCIMIDSL.g:3179:1: rule__OtherDetails__Group__28 : rule__OtherDetails__Group__28__Impl rule__OtherDetails__Group__29 ;
    public final void rule__OtherDetails__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3183:1: ( rule__OtherDetails__Group__28__Impl rule__OtherDetails__Group__29 )
            // InternalCIMIDSL.g:3184:2: rule__OtherDetails__Group__28__Impl rule__OtherDetails__Group__29
            {
            pushFollow(FOLLOW_12);
            rule__OtherDetails__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__29();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__28"


    // $ANTLR start "rule__OtherDetails__Group__28__Impl"
    // InternalCIMIDSL.g:3191:1: rule__OtherDetails__Group__28__Impl : ( '>' ) ;
    public final void rule__OtherDetails__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3195:1: ( ( '>' ) )
            // InternalCIMIDSL.g:3196:1: ( '>' )
            {
            // InternalCIMIDSL.g:3196:1: ( '>' )
            // InternalCIMIDSL.g:3197:2: '>'
            {
             before(grammarAccess.getOtherDetailsAccess().getGreaterThanSignKeyword_28()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getGreaterThanSignKeyword_28()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__28__Impl"


    // $ANTLR start "rule__OtherDetails__Group__29"
    // InternalCIMIDSL.g:3206:1: rule__OtherDetails__Group__29 : rule__OtherDetails__Group__29__Impl rule__OtherDetails__Group__30 ;
    public final void rule__OtherDetails__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3210:1: ( rule__OtherDetails__Group__29__Impl rule__OtherDetails__Group__30 )
            // InternalCIMIDSL.g:3211:2: rule__OtherDetails__Group__29__Impl rule__OtherDetails__Group__30
            {
            pushFollow(FOLLOW_39);
            rule__OtherDetails__Group__29__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__30();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__29"


    // $ANTLR start "rule__OtherDetails__Group__29__Impl"
    // InternalCIMIDSL.g:3218:1: rule__OtherDetails__Group__29__Impl : ( '\\r' ) ;
    public final void rule__OtherDetails__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3222:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:3223:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:3223:1: ( '\\r' )
            // InternalCIMIDSL.g:3224:2: '\\r'
            {
             before(grammarAccess.getOtherDetailsAccess().getControl000dKeyword_29()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getControl000dKeyword_29()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__29__Impl"


    // $ANTLR start "rule__OtherDetails__Group__30"
    // InternalCIMIDSL.g:3233:1: rule__OtherDetails__Group__30 : rule__OtherDetails__Group__30__Impl rule__OtherDetails__Group__31 ;
    public final void rule__OtherDetails__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3237:1: ( rule__OtherDetails__Group__30__Impl rule__OtherDetails__Group__31 )
            // InternalCIMIDSL.g:3238:2: rule__OtherDetails__Group__30__Impl rule__OtherDetails__Group__31
            {
            pushFollow(FOLLOW_20);
            rule__OtherDetails__Group__30__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__31();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__30"


    // $ANTLR start "rule__OtherDetails__Group__30__Impl"
    // InternalCIMIDSL.g:3245:1: rule__OtherDetails__Group__30__Impl : ( '[\"ip_acknowledgement_snomed\"]' ) ;
    public final void rule__OtherDetails__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3249:1: ( ( '[\"ip_acknowledgement_snomed\"]' ) )
            // InternalCIMIDSL.g:3250:1: ( '[\"ip_acknowledgement_snomed\"]' )
            {
            // InternalCIMIDSL.g:3250:1: ( '[\"ip_acknowledgement_snomed\"]' )
            // InternalCIMIDSL.g:3251:2: '[\"ip_acknowledgement_snomed\"]'
            {
             before(grammarAccess.getOtherDetailsAccess().getIp_acknowledgement_snomedKeyword_30()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getIp_acknowledgement_snomedKeyword_30()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__30__Impl"


    // $ANTLR start "rule__OtherDetails__Group__31"
    // InternalCIMIDSL.g:3260:1: rule__OtherDetails__Group__31 : rule__OtherDetails__Group__31__Impl rule__OtherDetails__Group__32 ;
    public final void rule__OtherDetails__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3264:1: ( rule__OtherDetails__Group__31__Impl rule__OtherDetails__Group__32 )
            // InternalCIMIDSL.g:3265:2: rule__OtherDetails__Group__31__Impl rule__OtherDetails__Group__32
            {
            pushFollow(FOLLOW_21);
            rule__OtherDetails__Group__31__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__32();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__31"


    // $ANTLR start "rule__OtherDetails__Group__31__Impl"
    // InternalCIMIDSL.g:3272:1: rule__OtherDetails__Group__31__Impl : ( '=' ) ;
    public final void rule__OtherDetails__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3276:1: ( ( '=' ) )
            // InternalCIMIDSL.g:3277:1: ( '=' )
            {
            // InternalCIMIDSL.g:3277:1: ( '=' )
            // InternalCIMIDSL.g:3278:2: '='
            {
             before(grammarAccess.getOtherDetailsAccess().getEqualsSignKeyword_31()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getEqualsSignKeyword_31()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__31__Impl"


    // $ANTLR start "rule__OtherDetails__Group__32"
    // InternalCIMIDSL.g:3287:1: rule__OtherDetails__Group__32 : rule__OtherDetails__Group__32__Impl rule__OtherDetails__Group__33 ;
    public final void rule__OtherDetails__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3291:1: ( rule__OtherDetails__Group__32__Impl rule__OtherDetails__Group__33 )
            // InternalCIMIDSL.g:3292:2: rule__OtherDetails__Group__32__Impl rule__OtherDetails__Group__33
            {
            pushFollow(FOLLOW_31);
            rule__OtherDetails__Group__32__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__33();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__32"


    // $ANTLR start "rule__OtherDetails__Group__32__Impl"
    // InternalCIMIDSL.g:3299:1: rule__OtherDetails__Group__32__Impl : ( '<' ) ;
    public final void rule__OtherDetails__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3303:1: ( ( '<' ) )
            // InternalCIMIDSL.g:3304:1: ( '<' )
            {
            // InternalCIMIDSL.g:3304:1: ( '<' )
            // InternalCIMIDSL.g:3305:2: '<'
            {
             before(grammarAccess.getOtherDetailsAccess().getLessThanSignKeyword_32()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getLessThanSignKeyword_32()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__32__Impl"


    // $ANTLR start "rule__OtherDetails__Group__33"
    // InternalCIMIDSL.g:3314:1: rule__OtherDetails__Group__33 : rule__OtherDetails__Group__33__Impl rule__OtherDetails__Group__34 ;
    public final void rule__OtherDetails__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3318:1: ( rule__OtherDetails__Group__33__Impl rule__OtherDetails__Group__34 )
            // InternalCIMIDSL.g:3319:2: rule__OtherDetails__Group__33__Impl rule__OtherDetails__Group__34
            {
            pushFollow(FOLLOW_23);
            rule__OtherDetails__Group__33__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__34();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__33"


    // $ANTLR start "rule__OtherDetails__Group__33__Impl"
    // InternalCIMIDSL.g:3326:1: rule__OtherDetails__Group__33__Impl : ( ( rule__OtherDetails__Ip_acknowledgement_snomedAssignment_33 ) ) ;
    public final void rule__OtherDetails__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3330:1: ( ( ( rule__OtherDetails__Ip_acknowledgement_snomedAssignment_33 ) ) )
            // InternalCIMIDSL.g:3331:1: ( ( rule__OtherDetails__Ip_acknowledgement_snomedAssignment_33 ) )
            {
            // InternalCIMIDSL.g:3331:1: ( ( rule__OtherDetails__Ip_acknowledgement_snomedAssignment_33 ) )
            // InternalCIMIDSL.g:3332:2: ( rule__OtherDetails__Ip_acknowledgement_snomedAssignment_33 )
            {
             before(grammarAccess.getOtherDetailsAccess().getIp_acknowledgement_snomedAssignment_33()); 
            // InternalCIMIDSL.g:3333:2: ( rule__OtherDetails__Ip_acknowledgement_snomedAssignment_33 )
            // InternalCIMIDSL.g:3333:3: rule__OtherDetails__Ip_acknowledgement_snomedAssignment_33
            {
            pushFollow(FOLLOW_2);
            rule__OtherDetails__Ip_acknowledgement_snomedAssignment_33();

            state._fsp--;


            }

             after(grammarAccess.getOtherDetailsAccess().getIp_acknowledgement_snomedAssignment_33()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__33__Impl"


    // $ANTLR start "rule__OtherDetails__Group__34"
    // InternalCIMIDSL.g:3341:1: rule__OtherDetails__Group__34 : rule__OtherDetails__Group__34__Impl rule__OtherDetails__Group__35 ;
    public final void rule__OtherDetails__Group__34() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3345:1: ( rule__OtherDetails__Group__34__Impl rule__OtherDetails__Group__35 )
            // InternalCIMIDSL.g:3346:2: rule__OtherDetails__Group__34__Impl rule__OtherDetails__Group__35
            {
            pushFollow(FOLLOW_12);
            rule__OtherDetails__Group__34__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__35();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__34"


    // $ANTLR start "rule__OtherDetails__Group__34__Impl"
    // InternalCIMIDSL.g:3353:1: rule__OtherDetails__Group__34__Impl : ( '>' ) ;
    public final void rule__OtherDetails__Group__34__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3357:1: ( ( '>' ) )
            // InternalCIMIDSL.g:3358:1: ( '>' )
            {
            // InternalCIMIDSL.g:3358:1: ( '>' )
            // InternalCIMIDSL.g:3359:2: '>'
            {
             before(grammarAccess.getOtherDetailsAccess().getGreaterThanSignKeyword_34()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getGreaterThanSignKeyword_34()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__34__Impl"


    // $ANTLR start "rule__OtherDetails__Group__35"
    // InternalCIMIDSL.g:3368:1: rule__OtherDetails__Group__35 : rule__OtherDetails__Group__35__Impl ;
    public final void rule__OtherDetails__Group__35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3372:1: ( rule__OtherDetails__Group__35__Impl )
            // InternalCIMIDSL.g:3373:2: rule__OtherDetails__Group__35__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OtherDetails__Group__35__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__35"


    // $ANTLR start "rule__OtherDetails__Group__35__Impl"
    // InternalCIMIDSL.g:3379:1: rule__OtherDetails__Group__35__Impl : ( '\\r' ) ;
    public final void rule__OtherDetails__Group__35__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3383:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:3384:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:3384:1: ( '\\r' )
            // InternalCIMIDSL.g:3385:2: '\\r'
            {
             before(grammarAccess.getOtherDetailsAccess().getControl000dKeyword_35()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getControl000dKeyword_35()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Group__35__Impl"


    // $ANTLR start "rule__OriginalAuthor__Group__0"
    // InternalCIMIDSL.g:3395:1: rule__OriginalAuthor__Group__0 : rule__OriginalAuthor__Group__0__Impl rule__OriginalAuthor__Group__1 ;
    public final void rule__OriginalAuthor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3399:1: ( rule__OriginalAuthor__Group__0__Impl rule__OriginalAuthor__Group__1 )
            // InternalCIMIDSL.g:3400:2: rule__OriginalAuthor__Group__0__Impl rule__OriginalAuthor__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__OriginalAuthor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__0"


    // $ANTLR start "rule__OriginalAuthor__Group__0__Impl"
    // InternalCIMIDSL.g:3407:1: rule__OriginalAuthor__Group__0__Impl : ( '[\"date\"]' ) ;
    public final void rule__OriginalAuthor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3411:1: ( ( '[\"date\"]' ) )
            // InternalCIMIDSL.g:3412:1: ( '[\"date\"]' )
            {
            // InternalCIMIDSL.g:3412:1: ( '[\"date\"]' )
            // InternalCIMIDSL.g:3413:2: '[\"date\"]'
            {
             before(grammarAccess.getOriginalAuthorAccess().getDateKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getOriginalAuthorAccess().getDateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__0__Impl"


    // $ANTLR start "rule__OriginalAuthor__Group__1"
    // InternalCIMIDSL.g:3422:1: rule__OriginalAuthor__Group__1 : rule__OriginalAuthor__Group__1__Impl rule__OriginalAuthor__Group__2 ;
    public final void rule__OriginalAuthor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3426:1: ( rule__OriginalAuthor__Group__1__Impl rule__OriginalAuthor__Group__2 )
            // InternalCIMIDSL.g:3427:2: rule__OriginalAuthor__Group__1__Impl rule__OriginalAuthor__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__OriginalAuthor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__1"


    // $ANTLR start "rule__OriginalAuthor__Group__1__Impl"
    // InternalCIMIDSL.g:3434:1: rule__OriginalAuthor__Group__1__Impl : ( '=' ) ;
    public final void rule__OriginalAuthor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3438:1: ( ( '=' ) )
            // InternalCIMIDSL.g:3439:1: ( '=' )
            {
            // InternalCIMIDSL.g:3439:1: ( '=' )
            // InternalCIMIDSL.g:3440:2: '='
            {
             before(grammarAccess.getOriginalAuthorAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOriginalAuthorAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__1__Impl"


    // $ANTLR start "rule__OriginalAuthor__Group__2"
    // InternalCIMIDSL.g:3449:1: rule__OriginalAuthor__Group__2 : rule__OriginalAuthor__Group__2__Impl rule__OriginalAuthor__Group__3 ;
    public final void rule__OriginalAuthor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3453:1: ( rule__OriginalAuthor__Group__2__Impl rule__OriginalAuthor__Group__3 )
            // InternalCIMIDSL.g:3454:2: rule__OriginalAuthor__Group__2__Impl rule__OriginalAuthor__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__OriginalAuthor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__2"


    // $ANTLR start "rule__OriginalAuthor__Group__2__Impl"
    // InternalCIMIDSL.g:3461:1: rule__OriginalAuthor__Group__2__Impl : ( '<' ) ;
    public final void rule__OriginalAuthor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3465:1: ( ( '<' ) )
            // InternalCIMIDSL.g:3466:1: ( '<' )
            {
            // InternalCIMIDSL.g:3466:1: ( '<' )
            // InternalCIMIDSL.g:3467:2: '<'
            {
             before(grammarAccess.getOriginalAuthorAccess().getLessThanSignKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getOriginalAuthorAccess().getLessThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__2__Impl"


    // $ANTLR start "rule__OriginalAuthor__Group__3"
    // InternalCIMIDSL.g:3476:1: rule__OriginalAuthor__Group__3 : rule__OriginalAuthor__Group__3__Impl rule__OriginalAuthor__Group__4 ;
    public final void rule__OriginalAuthor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3480:1: ( rule__OriginalAuthor__Group__3__Impl rule__OriginalAuthor__Group__4 )
            // InternalCIMIDSL.g:3481:2: rule__OriginalAuthor__Group__3__Impl rule__OriginalAuthor__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__OriginalAuthor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__3"


    // $ANTLR start "rule__OriginalAuthor__Group__3__Impl"
    // InternalCIMIDSL.g:3488:1: rule__OriginalAuthor__Group__3__Impl : ( ( rule__OriginalAuthor__DateAssignment_3 ) ) ;
    public final void rule__OriginalAuthor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3492:1: ( ( ( rule__OriginalAuthor__DateAssignment_3 ) ) )
            // InternalCIMIDSL.g:3493:1: ( ( rule__OriginalAuthor__DateAssignment_3 ) )
            {
            // InternalCIMIDSL.g:3493:1: ( ( rule__OriginalAuthor__DateAssignment_3 ) )
            // InternalCIMIDSL.g:3494:2: ( rule__OriginalAuthor__DateAssignment_3 )
            {
             before(grammarAccess.getOriginalAuthorAccess().getDateAssignment_3()); 
            // InternalCIMIDSL.g:3495:2: ( rule__OriginalAuthor__DateAssignment_3 )
            // InternalCIMIDSL.g:3495:3: rule__OriginalAuthor__DateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__DateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOriginalAuthorAccess().getDateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__3__Impl"


    // $ANTLR start "rule__OriginalAuthor__Group__4"
    // InternalCIMIDSL.g:3503:1: rule__OriginalAuthor__Group__4 : rule__OriginalAuthor__Group__4__Impl rule__OriginalAuthor__Group__5 ;
    public final void rule__OriginalAuthor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3507:1: ( rule__OriginalAuthor__Group__4__Impl rule__OriginalAuthor__Group__5 )
            // InternalCIMIDSL.g:3508:2: rule__OriginalAuthor__Group__4__Impl rule__OriginalAuthor__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__OriginalAuthor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__4"


    // $ANTLR start "rule__OriginalAuthor__Group__4__Impl"
    // InternalCIMIDSL.g:3515:1: rule__OriginalAuthor__Group__4__Impl : ( '>' ) ;
    public final void rule__OriginalAuthor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3519:1: ( ( '>' ) )
            // InternalCIMIDSL.g:3520:1: ( '>' )
            {
            // InternalCIMIDSL.g:3520:1: ( '>' )
            // InternalCIMIDSL.g:3521:2: '>'
            {
             before(grammarAccess.getOriginalAuthorAccess().getGreaterThanSignKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOriginalAuthorAccess().getGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__4__Impl"


    // $ANTLR start "rule__OriginalAuthor__Group__5"
    // InternalCIMIDSL.g:3530:1: rule__OriginalAuthor__Group__5 : rule__OriginalAuthor__Group__5__Impl rule__OriginalAuthor__Group__6 ;
    public final void rule__OriginalAuthor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3534:1: ( rule__OriginalAuthor__Group__5__Impl rule__OriginalAuthor__Group__6 )
            // InternalCIMIDSL.g:3535:2: rule__OriginalAuthor__Group__5__Impl rule__OriginalAuthor__Group__6
            {
            pushFollow(FOLLOW_40);
            rule__OriginalAuthor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__5"


    // $ANTLR start "rule__OriginalAuthor__Group__5__Impl"
    // InternalCIMIDSL.g:3542:1: rule__OriginalAuthor__Group__5__Impl : ( '\\r' ) ;
    public final void rule__OriginalAuthor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3546:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:3547:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:3547:1: ( '\\r' )
            // InternalCIMIDSL.g:3548:2: '\\r'
            {
             before(grammarAccess.getOriginalAuthorAccess().getControl000dKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOriginalAuthorAccess().getControl000dKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__5__Impl"


    // $ANTLR start "rule__OriginalAuthor__Group__6"
    // InternalCIMIDSL.g:3557:1: rule__OriginalAuthor__Group__6 : rule__OriginalAuthor__Group__6__Impl rule__OriginalAuthor__Group__7 ;
    public final void rule__OriginalAuthor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3561:1: ( rule__OriginalAuthor__Group__6__Impl rule__OriginalAuthor__Group__7 )
            // InternalCIMIDSL.g:3562:2: rule__OriginalAuthor__Group__6__Impl rule__OriginalAuthor__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__OriginalAuthor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__6"


    // $ANTLR start "rule__OriginalAuthor__Group__6__Impl"
    // InternalCIMIDSL.g:3569:1: rule__OriginalAuthor__Group__6__Impl : ( '[\"organization\"]' ) ;
    public final void rule__OriginalAuthor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3573:1: ( ( '[\"organization\"]' ) )
            // InternalCIMIDSL.g:3574:1: ( '[\"organization\"]' )
            {
            // InternalCIMIDSL.g:3574:1: ( '[\"organization\"]' )
            // InternalCIMIDSL.g:3575:2: '[\"organization\"]'
            {
             before(grammarAccess.getOriginalAuthorAccess().getOrganizationKeyword_6()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getOriginalAuthorAccess().getOrganizationKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__6__Impl"


    // $ANTLR start "rule__OriginalAuthor__Group__7"
    // InternalCIMIDSL.g:3584:1: rule__OriginalAuthor__Group__7 : rule__OriginalAuthor__Group__7__Impl rule__OriginalAuthor__Group__8 ;
    public final void rule__OriginalAuthor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3588:1: ( rule__OriginalAuthor__Group__7__Impl rule__OriginalAuthor__Group__8 )
            // InternalCIMIDSL.g:3589:2: rule__OriginalAuthor__Group__7__Impl rule__OriginalAuthor__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__OriginalAuthor__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__7"


    // $ANTLR start "rule__OriginalAuthor__Group__7__Impl"
    // InternalCIMIDSL.g:3596:1: rule__OriginalAuthor__Group__7__Impl : ( '=' ) ;
    public final void rule__OriginalAuthor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3600:1: ( ( '=' ) )
            // InternalCIMIDSL.g:3601:1: ( '=' )
            {
            // InternalCIMIDSL.g:3601:1: ( '=' )
            // InternalCIMIDSL.g:3602:2: '='
            {
             before(grammarAccess.getOriginalAuthorAccess().getEqualsSignKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOriginalAuthorAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__7__Impl"


    // $ANTLR start "rule__OriginalAuthor__Group__8"
    // InternalCIMIDSL.g:3611:1: rule__OriginalAuthor__Group__8 : rule__OriginalAuthor__Group__8__Impl rule__OriginalAuthor__Group__9 ;
    public final void rule__OriginalAuthor__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3615:1: ( rule__OriginalAuthor__Group__8__Impl rule__OriginalAuthor__Group__9 )
            // InternalCIMIDSL.g:3616:2: rule__OriginalAuthor__Group__8__Impl rule__OriginalAuthor__Group__9
            {
            pushFollow(FOLLOW_31);
            rule__OriginalAuthor__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__8"


    // $ANTLR start "rule__OriginalAuthor__Group__8__Impl"
    // InternalCIMIDSL.g:3623:1: rule__OriginalAuthor__Group__8__Impl : ( '<' ) ;
    public final void rule__OriginalAuthor__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3627:1: ( ( '<' ) )
            // InternalCIMIDSL.g:3628:1: ( '<' )
            {
            // InternalCIMIDSL.g:3628:1: ( '<' )
            // InternalCIMIDSL.g:3629:2: '<'
            {
             before(grammarAccess.getOriginalAuthorAccess().getLessThanSignKeyword_8()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getOriginalAuthorAccess().getLessThanSignKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__8__Impl"


    // $ANTLR start "rule__OriginalAuthor__Group__9"
    // InternalCIMIDSL.g:3638:1: rule__OriginalAuthor__Group__9 : rule__OriginalAuthor__Group__9__Impl rule__OriginalAuthor__Group__10 ;
    public final void rule__OriginalAuthor__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3642:1: ( rule__OriginalAuthor__Group__9__Impl rule__OriginalAuthor__Group__10 )
            // InternalCIMIDSL.g:3643:2: rule__OriginalAuthor__Group__9__Impl rule__OriginalAuthor__Group__10
            {
            pushFollow(FOLLOW_23);
            rule__OriginalAuthor__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__9"


    // $ANTLR start "rule__OriginalAuthor__Group__9__Impl"
    // InternalCIMIDSL.g:3650:1: rule__OriginalAuthor__Group__9__Impl : ( ( rule__OriginalAuthor__OrganizationAssignment_9 ) ) ;
    public final void rule__OriginalAuthor__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3654:1: ( ( ( rule__OriginalAuthor__OrganizationAssignment_9 ) ) )
            // InternalCIMIDSL.g:3655:1: ( ( rule__OriginalAuthor__OrganizationAssignment_9 ) )
            {
            // InternalCIMIDSL.g:3655:1: ( ( rule__OriginalAuthor__OrganizationAssignment_9 ) )
            // InternalCIMIDSL.g:3656:2: ( rule__OriginalAuthor__OrganizationAssignment_9 )
            {
             before(grammarAccess.getOriginalAuthorAccess().getOrganizationAssignment_9()); 
            // InternalCIMIDSL.g:3657:2: ( rule__OriginalAuthor__OrganizationAssignment_9 )
            // InternalCIMIDSL.g:3657:3: rule__OriginalAuthor__OrganizationAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__OrganizationAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getOriginalAuthorAccess().getOrganizationAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__9__Impl"


    // $ANTLR start "rule__OriginalAuthor__Group__10"
    // InternalCIMIDSL.g:3665:1: rule__OriginalAuthor__Group__10 : rule__OriginalAuthor__Group__10__Impl rule__OriginalAuthor__Group__11 ;
    public final void rule__OriginalAuthor__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3669:1: ( rule__OriginalAuthor__Group__10__Impl rule__OriginalAuthor__Group__11 )
            // InternalCIMIDSL.g:3670:2: rule__OriginalAuthor__Group__10__Impl rule__OriginalAuthor__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__OriginalAuthor__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__10"


    // $ANTLR start "rule__OriginalAuthor__Group__10__Impl"
    // InternalCIMIDSL.g:3677:1: rule__OriginalAuthor__Group__10__Impl : ( '>' ) ;
    public final void rule__OriginalAuthor__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3681:1: ( ( '>' ) )
            // InternalCIMIDSL.g:3682:1: ( '>' )
            {
            // InternalCIMIDSL.g:3682:1: ( '>' )
            // InternalCIMIDSL.g:3683:2: '>'
            {
             before(grammarAccess.getOriginalAuthorAccess().getGreaterThanSignKeyword_10()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOriginalAuthorAccess().getGreaterThanSignKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__10__Impl"


    // $ANTLR start "rule__OriginalAuthor__Group__11"
    // InternalCIMIDSL.g:3692:1: rule__OriginalAuthor__Group__11 : rule__OriginalAuthor__Group__11__Impl rule__OriginalAuthor__Group__12 ;
    public final void rule__OriginalAuthor__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3696:1: ( rule__OriginalAuthor__Group__11__Impl rule__OriginalAuthor__Group__12 )
            // InternalCIMIDSL.g:3697:2: rule__OriginalAuthor__Group__11__Impl rule__OriginalAuthor__Group__12
            {
            pushFollow(FOLLOW_41);
            rule__OriginalAuthor__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__11"


    // $ANTLR start "rule__OriginalAuthor__Group__11__Impl"
    // InternalCIMIDSL.g:3704:1: rule__OriginalAuthor__Group__11__Impl : ( '\\r' ) ;
    public final void rule__OriginalAuthor__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3708:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:3709:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:3709:1: ( '\\r' )
            // InternalCIMIDSL.g:3710:2: '\\r'
            {
             before(grammarAccess.getOriginalAuthorAccess().getControl000dKeyword_11()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOriginalAuthorAccess().getControl000dKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__11__Impl"


    // $ANTLR start "rule__OriginalAuthor__Group__12"
    // InternalCIMIDSL.g:3719:1: rule__OriginalAuthor__Group__12 : rule__OriginalAuthor__Group__12__Impl rule__OriginalAuthor__Group__13 ;
    public final void rule__OriginalAuthor__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3723:1: ( rule__OriginalAuthor__Group__12__Impl rule__OriginalAuthor__Group__13 )
            // InternalCIMIDSL.g:3724:2: rule__OriginalAuthor__Group__12__Impl rule__OriginalAuthor__Group__13
            {
            pushFollow(FOLLOW_20);
            rule__OriginalAuthor__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__12"


    // $ANTLR start "rule__OriginalAuthor__Group__12__Impl"
    // InternalCIMIDSL.g:3731:1: rule__OriginalAuthor__Group__12__Impl : ( '[\"name\"]' ) ;
    public final void rule__OriginalAuthor__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3735:1: ( ( '[\"name\"]' ) )
            // InternalCIMIDSL.g:3736:1: ( '[\"name\"]' )
            {
            // InternalCIMIDSL.g:3736:1: ( '[\"name\"]' )
            // InternalCIMIDSL.g:3737:2: '[\"name\"]'
            {
             before(grammarAccess.getOriginalAuthorAccess().getNameKeyword_12()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getOriginalAuthorAccess().getNameKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__12__Impl"


    // $ANTLR start "rule__OriginalAuthor__Group__13"
    // InternalCIMIDSL.g:3746:1: rule__OriginalAuthor__Group__13 : rule__OriginalAuthor__Group__13__Impl rule__OriginalAuthor__Group__14 ;
    public final void rule__OriginalAuthor__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3750:1: ( rule__OriginalAuthor__Group__13__Impl rule__OriginalAuthor__Group__14 )
            // InternalCIMIDSL.g:3751:2: rule__OriginalAuthor__Group__13__Impl rule__OriginalAuthor__Group__14
            {
            pushFollow(FOLLOW_21);
            rule__OriginalAuthor__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__13"


    // $ANTLR start "rule__OriginalAuthor__Group__13__Impl"
    // InternalCIMIDSL.g:3758:1: rule__OriginalAuthor__Group__13__Impl : ( '=' ) ;
    public final void rule__OriginalAuthor__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3762:1: ( ( '=' ) )
            // InternalCIMIDSL.g:3763:1: ( '=' )
            {
            // InternalCIMIDSL.g:3763:1: ( '=' )
            // InternalCIMIDSL.g:3764:2: '='
            {
             before(grammarAccess.getOriginalAuthorAccess().getEqualsSignKeyword_13()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOriginalAuthorAccess().getEqualsSignKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__13__Impl"


    // $ANTLR start "rule__OriginalAuthor__Group__14"
    // InternalCIMIDSL.g:3773:1: rule__OriginalAuthor__Group__14 : rule__OriginalAuthor__Group__14__Impl rule__OriginalAuthor__Group__15 ;
    public final void rule__OriginalAuthor__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3777:1: ( rule__OriginalAuthor__Group__14__Impl rule__OriginalAuthor__Group__15 )
            // InternalCIMIDSL.g:3778:2: rule__OriginalAuthor__Group__14__Impl rule__OriginalAuthor__Group__15
            {
            pushFollow(FOLLOW_31);
            rule__OriginalAuthor__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__14"


    // $ANTLR start "rule__OriginalAuthor__Group__14__Impl"
    // InternalCIMIDSL.g:3785:1: rule__OriginalAuthor__Group__14__Impl : ( '<' ) ;
    public final void rule__OriginalAuthor__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3789:1: ( ( '<' ) )
            // InternalCIMIDSL.g:3790:1: ( '<' )
            {
            // InternalCIMIDSL.g:3790:1: ( '<' )
            // InternalCIMIDSL.g:3791:2: '<'
            {
             before(grammarAccess.getOriginalAuthorAccess().getLessThanSignKeyword_14()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getOriginalAuthorAccess().getLessThanSignKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__14__Impl"


    // $ANTLR start "rule__OriginalAuthor__Group__15"
    // InternalCIMIDSL.g:3800:1: rule__OriginalAuthor__Group__15 : rule__OriginalAuthor__Group__15__Impl rule__OriginalAuthor__Group__16 ;
    public final void rule__OriginalAuthor__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3804:1: ( rule__OriginalAuthor__Group__15__Impl rule__OriginalAuthor__Group__16 )
            // InternalCIMIDSL.g:3805:2: rule__OriginalAuthor__Group__15__Impl rule__OriginalAuthor__Group__16
            {
            pushFollow(FOLLOW_23);
            rule__OriginalAuthor__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__15"


    // $ANTLR start "rule__OriginalAuthor__Group__15__Impl"
    // InternalCIMIDSL.g:3812:1: rule__OriginalAuthor__Group__15__Impl : ( ( rule__OriginalAuthor__NameAssignment_15 ) ) ;
    public final void rule__OriginalAuthor__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3816:1: ( ( ( rule__OriginalAuthor__NameAssignment_15 ) ) )
            // InternalCIMIDSL.g:3817:1: ( ( rule__OriginalAuthor__NameAssignment_15 ) )
            {
            // InternalCIMIDSL.g:3817:1: ( ( rule__OriginalAuthor__NameAssignment_15 ) )
            // InternalCIMIDSL.g:3818:2: ( rule__OriginalAuthor__NameAssignment_15 )
            {
             before(grammarAccess.getOriginalAuthorAccess().getNameAssignment_15()); 
            // InternalCIMIDSL.g:3819:2: ( rule__OriginalAuthor__NameAssignment_15 )
            // InternalCIMIDSL.g:3819:3: rule__OriginalAuthor__NameAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__NameAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getOriginalAuthorAccess().getNameAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__15__Impl"


    // $ANTLR start "rule__OriginalAuthor__Group__16"
    // InternalCIMIDSL.g:3827:1: rule__OriginalAuthor__Group__16 : rule__OriginalAuthor__Group__16__Impl rule__OriginalAuthor__Group__17 ;
    public final void rule__OriginalAuthor__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3831:1: ( rule__OriginalAuthor__Group__16__Impl rule__OriginalAuthor__Group__17 )
            // InternalCIMIDSL.g:3832:2: rule__OriginalAuthor__Group__16__Impl rule__OriginalAuthor__Group__17
            {
            pushFollow(FOLLOW_12);
            rule__OriginalAuthor__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__16"


    // $ANTLR start "rule__OriginalAuthor__Group__16__Impl"
    // InternalCIMIDSL.g:3839:1: rule__OriginalAuthor__Group__16__Impl : ( '>' ) ;
    public final void rule__OriginalAuthor__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3843:1: ( ( '>' ) )
            // InternalCIMIDSL.g:3844:1: ( '>' )
            {
            // InternalCIMIDSL.g:3844:1: ( '>' )
            // InternalCIMIDSL.g:3845:2: '>'
            {
             before(grammarAccess.getOriginalAuthorAccess().getGreaterThanSignKeyword_16()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOriginalAuthorAccess().getGreaterThanSignKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__16__Impl"


    // $ANTLR start "rule__OriginalAuthor__Group__17"
    // InternalCIMIDSL.g:3854:1: rule__OriginalAuthor__Group__17 : rule__OriginalAuthor__Group__17__Impl rule__OriginalAuthor__Group__18 ;
    public final void rule__OriginalAuthor__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3858:1: ( rule__OriginalAuthor__Group__17__Impl rule__OriginalAuthor__Group__18 )
            // InternalCIMIDSL.g:3859:2: rule__OriginalAuthor__Group__17__Impl rule__OriginalAuthor__Group__18
            {
            pushFollow(FOLLOW_42);
            rule__OriginalAuthor__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__17"


    // $ANTLR start "rule__OriginalAuthor__Group__17__Impl"
    // InternalCIMIDSL.g:3866:1: rule__OriginalAuthor__Group__17__Impl : ( '\\r' ) ;
    public final void rule__OriginalAuthor__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3870:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:3871:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:3871:1: ( '\\r' )
            // InternalCIMIDSL.g:3872:2: '\\r'
            {
             before(grammarAccess.getOriginalAuthorAccess().getControl000dKeyword_17()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOriginalAuthorAccess().getControl000dKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__17__Impl"


    // $ANTLR start "rule__OriginalAuthor__Group__18"
    // InternalCIMIDSL.g:3881:1: rule__OriginalAuthor__Group__18 : rule__OriginalAuthor__Group__18__Impl rule__OriginalAuthor__Group__19 ;
    public final void rule__OriginalAuthor__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3885:1: ( rule__OriginalAuthor__Group__18__Impl rule__OriginalAuthor__Group__19 )
            // InternalCIMIDSL.g:3886:2: rule__OriginalAuthor__Group__18__Impl rule__OriginalAuthor__Group__19
            {
            pushFollow(FOLLOW_20);
            rule__OriginalAuthor__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__18"


    // $ANTLR start "rule__OriginalAuthor__Group__18__Impl"
    // InternalCIMIDSL.g:3893:1: rule__OriginalAuthor__Group__18__Impl : ( '[\"email\"]' ) ;
    public final void rule__OriginalAuthor__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3897:1: ( ( '[\"email\"]' ) )
            // InternalCIMIDSL.g:3898:1: ( '[\"email\"]' )
            {
            // InternalCIMIDSL.g:3898:1: ( '[\"email\"]' )
            // InternalCIMIDSL.g:3899:2: '[\"email\"]'
            {
             before(grammarAccess.getOriginalAuthorAccess().getEmailKeyword_18()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getOriginalAuthorAccess().getEmailKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__18__Impl"


    // $ANTLR start "rule__OriginalAuthor__Group__19"
    // InternalCIMIDSL.g:3908:1: rule__OriginalAuthor__Group__19 : rule__OriginalAuthor__Group__19__Impl rule__OriginalAuthor__Group__20 ;
    public final void rule__OriginalAuthor__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3912:1: ( rule__OriginalAuthor__Group__19__Impl rule__OriginalAuthor__Group__20 )
            // InternalCIMIDSL.g:3913:2: rule__OriginalAuthor__Group__19__Impl rule__OriginalAuthor__Group__20
            {
            pushFollow(FOLLOW_21);
            rule__OriginalAuthor__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__19"


    // $ANTLR start "rule__OriginalAuthor__Group__19__Impl"
    // InternalCIMIDSL.g:3920:1: rule__OriginalAuthor__Group__19__Impl : ( '=' ) ;
    public final void rule__OriginalAuthor__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3924:1: ( ( '=' ) )
            // InternalCIMIDSL.g:3925:1: ( '=' )
            {
            // InternalCIMIDSL.g:3925:1: ( '=' )
            // InternalCIMIDSL.g:3926:2: '='
            {
             before(grammarAccess.getOriginalAuthorAccess().getEqualsSignKeyword_19()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOriginalAuthorAccess().getEqualsSignKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__19__Impl"


    // $ANTLR start "rule__OriginalAuthor__Group__20"
    // InternalCIMIDSL.g:3935:1: rule__OriginalAuthor__Group__20 : rule__OriginalAuthor__Group__20__Impl rule__OriginalAuthor__Group__21 ;
    public final void rule__OriginalAuthor__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3939:1: ( rule__OriginalAuthor__Group__20__Impl rule__OriginalAuthor__Group__21 )
            // InternalCIMIDSL.g:3940:2: rule__OriginalAuthor__Group__20__Impl rule__OriginalAuthor__Group__21
            {
            pushFollow(FOLLOW_31);
            rule__OriginalAuthor__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__20"


    // $ANTLR start "rule__OriginalAuthor__Group__20__Impl"
    // InternalCIMIDSL.g:3947:1: rule__OriginalAuthor__Group__20__Impl : ( '<' ) ;
    public final void rule__OriginalAuthor__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3951:1: ( ( '<' ) )
            // InternalCIMIDSL.g:3952:1: ( '<' )
            {
            // InternalCIMIDSL.g:3952:1: ( '<' )
            // InternalCIMIDSL.g:3953:2: '<'
            {
             before(grammarAccess.getOriginalAuthorAccess().getLessThanSignKeyword_20()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getOriginalAuthorAccess().getLessThanSignKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__20__Impl"


    // $ANTLR start "rule__OriginalAuthor__Group__21"
    // InternalCIMIDSL.g:3962:1: rule__OriginalAuthor__Group__21 : rule__OriginalAuthor__Group__21__Impl rule__OriginalAuthor__Group__22 ;
    public final void rule__OriginalAuthor__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3966:1: ( rule__OriginalAuthor__Group__21__Impl rule__OriginalAuthor__Group__22 )
            // InternalCIMIDSL.g:3967:2: rule__OriginalAuthor__Group__21__Impl rule__OriginalAuthor__Group__22
            {
            pushFollow(FOLLOW_23);
            rule__OriginalAuthor__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__21"


    // $ANTLR start "rule__OriginalAuthor__Group__21__Impl"
    // InternalCIMIDSL.g:3974:1: rule__OriginalAuthor__Group__21__Impl : ( ( rule__OriginalAuthor__EmailAssignment_21 ) ) ;
    public final void rule__OriginalAuthor__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3978:1: ( ( ( rule__OriginalAuthor__EmailAssignment_21 ) ) )
            // InternalCIMIDSL.g:3979:1: ( ( rule__OriginalAuthor__EmailAssignment_21 ) )
            {
            // InternalCIMIDSL.g:3979:1: ( ( rule__OriginalAuthor__EmailAssignment_21 ) )
            // InternalCIMIDSL.g:3980:2: ( rule__OriginalAuthor__EmailAssignment_21 )
            {
             before(grammarAccess.getOriginalAuthorAccess().getEmailAssignment_21()); 
            // InternalCIMIDSL.g:3981:2: ( rule__OriginalAuthor__EmailAssignment_21 )
            // InternalCIMIDSL.g:3981:3: rule__OriginalAuthor__EmailAssignment_21
            {
            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__EmailAssignment_21();

            state._fsp--;


            }

             after(grammarAccess.getOriginalAuthorAccess().getEmailAssignment_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__21__Impl"


    // $ANTLR start "rule__OriginalAuthor__Group__22"
    // InternalCIMIDSL.g:3989:1: rule__OriginalAuthor__Group__22 : rule__OriginalAuthor__Group__22__Impl rule__OriginalAuthor__Group__23 ;
    public final void rule__OriginalAuthor__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:3993:1: ( rule__OriginalAuthor__Group__22__Impl rule__OriginalAuthor__Group__23 )
            // InternalCIMIDSL.g:3994:2: rule__OriginalAuthor__Group__22__Impl rule__OriginalAuthor__Group__23
            {
            pushFollow(FOLLOW_12);
            rule__OriginalAuthor__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__22"


    // $ANTLR start "rule__OriginalAuthor__Group__22__Impl"
    // InternalCIMIDSL.g:4001:1: rule__OriginalAuthor__Group__22__Impl : ( '>' ) ;
    public final void rule__OriginalAuthor__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4005:1: ( ( '>' ) )
            // InternalCIMIDSL.g:4006:1: ( '>' )
            {
            // InternalCIMIDSL.g:4006:1: ( '>' )
            // InternalCIMIDSL.g:4007:2: '>'
            {
             before(grammarAccess.getOriginalAuthorAccess().getGreaterThanSignKeyword_22()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOriginalAuthorAccess().getGreaterThanSignKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__22__Impl"


    // $ANTLR start "rule__OriginalAuthor__Group__23"
    // InternalCIMIDSL.g:4016:1: rule__OriginalAuthor__Group__23 : rule__OriginalAuthor__Group__23__Impl ;
    public final void rule__OriginalAuthor__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4020:1: ( rule__OriginalAuthor__Group__23__Impl )
            // InternalCIMIDSL.g:4021:2: rule__OriginalAuthor__Group__23__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OriginalAuthor__Group__23__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__23"


    // $ANTLR start "rule__OriginalAuthor__Group__23__Impl"
    // InternalCIMIDSL.g:4027:1: rule__OriginalAuthor__Group__23__Impl : ( '\\r' ) ;
    public final void rule__OriginalAuthor__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4031:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:4032:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:4032:1: ( '\\r' )
            // InternalCIMIDSL.g:4033:2: '\\r'
            {
             before(grammarAccess.getOriginalAuthorAccess().getControl000dKeyword_23()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOriginalAuthorAccess().getControl000dKeyword_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__Group__23__Impl"


    // $ANTLR start "rule__Languge__Group__0"
    // InternalCIMIDSL.g:4043:1: rule__Languge__Group__0 : rule__Languge__Group__0__Impl rule__Languge__Group__1 ;
    public final void rule__Languge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4047:1: ( rule__Languge__Group__0__Impl rule__Languge__Group__1 )
            // InternalCIMIDSL.g:4048:2: rule__Languge__Group__0__Impl rule__Languge__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Languge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Languge__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languge__Group__0"


    // $ANTLR start "rule__Languge__Group__0__Impl"
    // InternalCIMIDSL.g:4055:1: rule__Languge__Group__0__Impl : ( 'original_language' ) ;
    public final void rule__Languge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4059:1: ( ( 'original_language' ) )
            // InternalCIMIDSL.g:4060:1: ( 'original_language' )
            {
            // InternalCIMIDSL.g:4060:1: ( 'original_language' )
            // InternalCIMIDSL.g:4061:2: 'original_language'
            {
             before(grammarAccess.getLangugeAccess().getOriginal_languageKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getLangugeAccess().getOriginal_languageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languge__Group__0__Impl"


    // $ANTLR start "rule__Languge__Group__1"
    // InternalCIMIDSL.g:4070:1: rule__Languge__Group__1 : rule__Languge__Group__1__Impl rule__Languge__Group__2 ;
    public final void rule__Languge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4074:1: ( rule__Languge__Group__1__Impl rule__Languge__Group__2 )
            // InternalCIMIDSL.g:4075:2: rule__Languge__Group__1__Impl rule__Languge__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Languge__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Languge__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languge__Group__1"


    // $ANTLR start "rule__Languge__Group__1__Impl"
    // InternalCIMIDSL.g:4082:1: rule__Languge__Group__1__Impl : ( '=' ) ;
    public final void rule__Languge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4086:1: ( ( '=' ) )
            // InternalCIMIDSL.g:4087:1: ( '=' )
            {
            // InternalCIMIDSL.g:4087:1: ( '=' )
            // InternalCIMIDSL.g:4088:2: '='
            {
             before(grammarAccess.getLangugeAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLangugeAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languge__Group__1__Impl"


    // $ANTLR start "rule__Languge__Group__2"
    // InternalCIMIDSL.g:4097:1: rule__Languge__Group__2 : rule__Languge__Group__2__Impl rule__Languge__Group__3 ;
    public final void rule__Languge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4101:1: ( rule__Languge__Group__2__Impl rule__Languge__Group__3 )
            // InternalCIMIDSL.g:4102:2: rule__Languge__Group__2__Impl rule__Languge__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Languge__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Languge__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languge__Group__2"


    // $ANTLR start "rule__Languge__Group__2__Impl"
    // InternalCIMIDSL.g:4109:1: rule__Languge__Group__2__Impl : ( '<[' ) ;
    public final void rule__Languge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4113:1: ( ( '<[' ) )
            // InternalCIMIDSL.g:4114:1: ( '<[' )
            {
            // InternalCIMIDSL.g:4114:1: ( '<[' )
            // InternalCIMIDSL.g:4115:2: '<['
            {
             before(grammarAccess.getLangugeAccess().getLessThanSignLeftSquareBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLangugeAccess().getLessThanSignLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languge__Group__2__Impl"


    // $ANTLR start "rule__Languge__Group__3"
    // InternalCIMIDSL.g:4124:1: rule__Languge__Group__3 : rule__Languge__Group__3__Impl rule__Languge__Group__4 ;
    public final void rule__Languge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4128:1: ( rule__Languge__Group__3__Impl rule__Languge__Group__4 )
            // InternalCIMIDSL.g:4129:2: rule__Languge__Group__3__Impl rule__Languge__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Languge__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Languge__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languge__Group__3"


    // $ANTLR start "rule__Languge__Group__3__Impl"
    // InternalCIMIDSL.g:4136:1: rule__Languge__Group__3__Impl : ( ( rule__Languge__NameAssignment_3 ) ) ;
    public final void rule__Languge__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4140:1: ( ( ( rule__Languge__NameAssignment_3 ) ) )
            // InternalCIMIDSL.g:4141:1: ( ( rule__Languge__NameAssignment_3 ) )
            {
            // InternalCIMIDSL.g:4141:1: ( ( rule__Languge__NameAssignment_3 ) )
            // InternalCIMIDSL.g:4142:2: ( rule__Languge__NameAssignment_3 )
            {
             before(grammarAccess.getLangugeAccess().getNameAssignment_3()); 
            // InternalCIMIDSL.g:4143:2: ( rule__Languge__NameAssignment_3 )
            // InternalCIMIDSL.g:4143:3: rule__Languge__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Languge__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLangugeAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languge__Group__3__Impl"


    // $ANTLR start "rule__Languge__Group__4"
    // InternalCIMIDSL.g:4151:1: rule__Languge__Group__4 : rule__Languge__Group__4__Impl ;
    public final void rule__Languge__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4155:1: ( rule__Languge__Group__4__Impl )
            // InternalCIMIDSL.g:4156:2: rule__Languge__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Languge__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languge__Group__4"


    // $ANTLR start "rule__Languge__Group__4__Impl"
    // InternalCIMIDSL.g:4162:1: rule__Languge__Group__4__Impl : ( ']>' ) ;
    public final void rule__Languge__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4166:1: ( ( ']>' ) )
            // InternalCIMIDSL.g:4167:1: ( ']>' )
            {
            // InternalCIMIDSL.g:4167:1: ( ']>' )
            // InternalCIMIDSL.g:4168:2: ']>'
            {
             before(grammarAccess.getLangugeAccess().getRightSquareBracketGreaterThanSignKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLangugeAccess().getRightSquareBracketGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languge__Group__4__Impl"


    // $ANTLR start "rule__Matches__Group__0"
    // InternalCIMIDSL.g:4178:1: rule__Matches__Group__0 : rule__Matches__Group__0__Impl rule__Matches__Group__1 ;
    public final void rule__Matches__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4182:1: ( rule__Matches__Group__0__Impl rule__Matches__Group__1 )
            // InternalCIMIDSL.g:4183:2: rule__Matches__Group__0__Impl rule__Matches__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__Matches__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matches__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__Group__0"


    // $ANTLR start "rule__Matches__Group__0__Impl"
    // InternalCIMIDSL.g:4190:1: rule__Matches__Group__0__Impl : ( ( rule__Matches__NameAssignment_0 ) ) ;
    public final void rule__Matches__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4194:1: ( ( ( rule__Matches__NameAssignment_0 ) ) )
            // InternalCIMIDSL.g:4195:1: ( ( rule__Matches__NameAssignment_0 ) )
            {
            // InternalCIMIDSL.g:4195:1: ( ( rule__Matches__NameAssignment_0 ) )
            // InternalCIMIDSL.g:4196:2: ( rule__Matches__NameAssignment_0 )
            {
             before(grammarAccess.getMatchesAccess().getNameAssignment_0()); 
            // InternalCIMIDSL.g:4197:2: ( rule__Matches__NameAssignment_0 )
            // InternalCIMIDSL.g:4197:3: rule__Matches__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Matches__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMatchesAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__Group__0__Impl"


    // $ANTLR start "rule__Matches__Group__1"
    // InternalCIMIDSL.g:4205:1: rule__Matches__Group__1 : rule__Matches__Group__1__Impl rule__Matches__Group__2 ;
    public final void rule__Matches__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4209:1: ( rule__Matches__Group__1__Impl rule__Matches__Group__2 )
            // InternalCIMIDSL.g:4210:2: rule__Matches__Group__1__Impl rule__Matches__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__Matches__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matches__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__Group__1"


    // $ANTLR start "rule__Matches__Group__1__Impl"
    // InternalCIMIDSL.g:4217:1: rule__Matches__Group__1__Impl : ( ( rule__Matches__Group_1__0 )? ) ;
    public final void rule__Matches__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4221:1: ( ( ( rule__Matches__Group_1__0 )? ) )
            // InternalCIMIDSL.g:4222:1: ( ( rule__Matches__Group_1__0 )? )
            {
            // InternalCIMIDSL.g:4222:1: ( ( rule__Matches__Group_1__0 )? )
            // InternalCIMIDSL.g:4223:2: ( rule__Matches__Group_1__0 )?
            {
             before(grammarAccess.getMatchesAccess().getGroup_1()); 
            // InternalCIMIDSL.g:4224:2: ( rule__Matches__Group_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==51) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCIMIDSL.g:4224:3: rule__Matches__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Matches__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__Group__1__Impl"


    // $ANTLR start "rule__Matches__Group__2"
    // InternalCIMIDSL.g:4232:1: rule__Matches__Group__2 : rule__Matches__Group__2__Impl rule__Matches__Group__3 ;
    public final void rule__Matches__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4236:1: ( rule__Matches__Group__2__Impl rule__Matches__Group__3 )
            // InternalCIMIDSL.g:4237:2: rule__Matches__Group__2__Impl rule__Matches__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__Matches__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matches__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__Group__2"


    // $ANTLR start "rule__Matches__Group__2__Impl"
    // InternalCIMIDSL.g:4244:1: rule__Matches__Group__2__Impl : ( 'matches' ) ;
    public final void rule__Matches__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4248:1: ( ( 'matches' ) )
            // InternalCIMIDSL.g:4249:1: ( 'matches' )
            {
            // InternalCIMIDSL.g:4249:1: ( 'matches' )
            // InternalCIMIDSL.g:4250:2: 'matches'
            {
             before(grammarAccess.getMatchesAccess().getMatchesKeyword_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getMatchesAccess().getMatchesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__Group__2__Impl"


    // $ANTLR start "rule__Matches__Group__3"
    // InternalCIMIDSL.g:4259:1: rule__Matches__Group__3 : rule__Matches__Group__3__Impl rule__Matches__Group__4 ;
    public final void rule__Matches__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4263:1: ( rule__Matches__Group__3__Impl rule__Matches__Group__4 )
            // InternalCIMIDSL.g:4264:2: rule__Matches__Group__3__Impl rule__Matches__Group__4
            {
            pushFollow(FOLLOW_45);
            rule__Matches__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matches__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__Group__3"


    // $ANTLR start "rule__Matches__Group__3__Impl"
    // InternalCIMIDSL.g:4271:1: rule__Matches__Group__3__Impl : ( '{\\r' ) ;
    public final void rule__Matches__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4275:1: ( ( '{\\r' ) )
            // InternalCIMIDSL.g:4276:1: ( '{\\r' )
            {
            // InternalCIMIDSL.g:4276:1: ( '{\\r' )
            // InternalCIMIDSL.g:4277:2: '{\\r'
            {
             before(grammarAccess.getMatchesAccess().getLeftCurlyBracketControl000dKeyword_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMatchesAccess().getLeftCurlyBracketControl000dKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__Group__3__Impl"


    // $ANTLR start "rule__Matches__Group__4"
    // InternalCIMIDSL.g:4286:1: rule__Matches__Group__4 : rule__Matches__Group__4__Impl rule__Matches__Group__5 ;
    public final void rule__Matches__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4290:1: ( rule__Matches__Group__4__Impl rule__Matches__Group__5 )
            // InternalCIMIDSL.g:4291:2: rule__Matches__Group__4__Impl rule__Matches__Group__5
            {
            pushFollow(FOLLOW_46);
            rule__Matches__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matches__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__Group__4"


    // $ANTLR start "rule__Matches__Group__4__Impl"
    // InternalCIMIDSL.g:4298:1: rule__Matches__Group__4__Impl : ( ( rule__Matches__Alternatives_4 ) ) ;
    public final void rule__Matches__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4302:1: ( ( ( rule__Matches__Alternatives_4 ) ) )
            // InternalCIMIDSL.g:4303:1: ( ( rule__Matches__Alternatives_4 ) )
            {
            // InternalCIMIDSL.g:4303:1: ( ( rule__Matches__Alternatives_4 ) )
            // InternalCIMIDSL.g:4304:2: ( rule__Matches__Alternatives_4 )
            {
             before(grammarAccess.getMatchesAccess().getAlternatives_4()); 
            // InternalCIMIDSL.g:4305:2: ( rule__Matches__Alternatives_4 )
            // InternalCIMIDSL.g:4305:3: rule__Matches__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__Matches__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getMatchesAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__Group__4__Impl"


    // $ANTLR start "rule__Matches__Group__5"
    // InternalCIMIDSL.g:4313:1: rule__Matches__Group__5 : rule__Matches__Group__5__Impl ;
    public final void rule__Matches__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4317:1: ( rule__Matches__Group__5__Impl )
            // InternalCIMIDSL.g:4318:2: rule__Matches__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Matches__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__Group__5"


    // $ANTLR start "rule__Matches__Group__5__Impl"
    // InternalCIMIDSL.g:4324:1: rule__Matches__Group__5__Impl : ( '}\\r' ) ;
    public final void rule__Matches__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4328:1: ( ( '}\\r' ) )
            // InternalCIMIDSL.g:4329:1: ( '}\\r' )
            {
            // InternalCIMIDSL.g:4329:1: ( '}\\r' )
            // InternalCIMIDSL.g:4330:2: '}\\r'
            {
             before(grammarAccess.getMatchesAccess().getRightCurlyBracketControl000dKeyword_5()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMatchesAccess().getRightCurlyBracketControl000dKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__Group__5__Impl"


    // $ANTLR start "rule__Matches__Group_1__0"
    // InternalCIMIDSL.g:4340:1: rule__Matches__Group_1__0 : rule__Matches__Group_1__0__Impl rule__Matches__Group_1__1 ;
    public final void rule__Matches__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4344:1: ( rule__Matches__Group_1__0__Impl rule__Matches__Group_1__1 )
            // InternalCIMIDSL.g:4345:2: rule__Matches__Group_1__0__Impl rule__Matches__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Matches__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matches__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__Group_1__0"


    // $ANTLR start "rule__Matches__Group_1__0__Impl"
    // InternalCIMIDSL.g:4352:1: rule__Matches__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Matches__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4356:1: ( ( '[' ) )
            // InternalCIMIDSL.g:4357:1: ( '[' )
            {
            // InternalCIMIDSL.g:4357:1: ( '[' )
            // InternalCIMIDSL.g:4358:2: '['
            {
             before(grammarAccess.getMatchesAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMatchesAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__Group_1__0__Impl"


    // $ANTLR start "rule__Matches__Group_1__1"
    // InternalCIMIDSL.g:4367:1: rule__Matches__Group_1__1 : rule__Matches__Group_1__1__Impl rule__Matches__Group_1__2 ;
    public final void rule__Matches__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4371:1: ( rule__Matches__Group_1__1__Impl rule__Matches__Group_1__2 )
            // InternalCIMIDSL.g:4372:2: rule__Matches__Group_1__1__Impl rule__Matches__Group_1__2
            {
            pushFollow(FOLLOW_47);
            rule__Matches__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matches__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__Group_1__1"


    // $ANTLR start "rule__Matches__Group_1__1__Impl"
    // InternalCIMIDSL.g:4379:1: rule__Matches__Group_1__1__Impl : ( ( rule__Matches__DefinitionAssignment_1_1 ) ) ;
    public final void rule__Matches__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4383:1: ( ( ( rule__Matches__DefinitionAssignment_1_1 ) ) )
            // InternalCIMIDSL.g:4384:1: ( ( rule__Matches__DefinitionAssignment_1_1 ) )
            {
            // InternalCIMIDSL.g:4384:1: ( ( rule__Matches__DefinitionAssignment_1_1 ) )
            // InternalCIMIDSL.g:4385:2: ( rule__Matches__DefinitionAssignment_1_1 )
            {
             before(grammarAccess.getMatchesAccess().getDefinitionAssignment_1_1()); 
            // InternalCIMIDSL.g:4386:2: ( rule__Matches__DefinitionAssignment_1_1 )
            // InternalCIMIDSL.g:4386:3: rule__Matches__DefinitionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Matches__DefinitionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMatchesAccess().getDefinitionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__Group_1__1__Impl"


    // $ANTLR start "rule__Matches__Group_1__2"
    // InternalCIMIDSL.g:4394:1: rule__Matches__Group_1__2 : rule__Matches__Group_1__2__Impl ;
    public final void rule__Matches__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4398:1: ( rule__Matches__Group_1__2__Impl )
            // InternalCIMIDSL.g:4399:2: rule__Matches__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Matches__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__Group_1__2"


    // $ANTLR start "rule__Matches__Group_1__2__Impl"
    // InternalCIMIDSL.g:4405:1: rule__Matches__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Matches__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4409:1: ( ( ']' ) )
            // InternalCIMIDSL.g:4410:1: ( ']' )
            {
            // InternalCIMIDSL.g:4410:1: ( ']' )
            // InternalCIMIDSL.g:4411:2: ']'
            {
             before(grammarAccess.getMatchesAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getMatchesAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__Group_1__2__Impl"


    // $ANTLR start "rule__Matches__Group_4_1__0"
    // InternalCIMIDSL.g:4421:1: rule__Matches__Group_4_1__0 : rule__Matches__Group_4_1__0__Impl rule__Matches__Group_4_1__1 ;
    public final void rule__Matches__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4425:1: ( rule__Matches__Group_4_1__0__Impl rule__Matches__Group_4_1__1 )
            // InternalCIMIDSL.g:4426:2: rule__Matches__Group_4_1__0__Impl rule__Matches__Group_4_1__1
            {
            pushFollow(FOLLOW_45);
            rule__Matches__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matches__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__Group_4_1__0"


    // $ANTLR start "rule__Matches__Group_4_1__0__Impl"
    // InternalCIMIDSL.g:4433:1: rule__Matches__Group_4_1__0__Impl : ( ( rule__Matches__ValueAssignment_4_1_0 )? ) ;
    public final void rule__Matches__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4437:1: ( ( ( rule__Matches__ValueAssignment_4_1_0 )? ) )
            // InternalCIMIDSL.g:4438:1: ( ( rule__Matches__ValueAssignment_4_1_0 )? )
            {
            // InternalCIMIDSL.g:4438:1: ( ( rule__Matches__ValueAssignment_4_1_0 )? )
            // InternalCIMIDSL.g:4439:2: ( rule__Matches__ValueAssignment_4_1_0 )?
            {
             before(grammarAccess.getMatchesAccess().getValueAssignment_4_1_0()); 
            // InternalCIMIDSL.g:4440:2: ( rule__Matches__ValueAssignment_4_1_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_MYSTRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCIMIDSL.g:4440:3: rule__Matches__ValueAssignment_4_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Matches__ValueAssignment_4_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatchesAccess().getValueAssignment_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__Group_4_1__0__Impl"


    // $ANTLR start "rule__Matches__Group_4_1__1"
    // InternalCIMIDSL.g:4448:1: rule__Matches__Group_4_1__1 : rule__Matches__Group_4_1__1__Impl rule__Matches__Group_4_1__2 ;
    public final void rule__Matches__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4452:1: ( rule__Matches__Group_4_1__1__Impl rule__Matches__Group_4_1__2 )
            // InternalCIMIDSL.g:4453:2: rule__Matches__Group_4_1__1__Impl rule__Matches__Group_4_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Matches__Group_4_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matches__Group_4_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__Group_4_1__1"


    // $ANTLR start "rule__Matches__Group_4_1__1__Impl"
    // InternalCIMIDSL.g:4460:1: rule__Matches__Group_4_1__1__Impl : ( '[' ) ;
    public final void rule__Matches__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4464:1: ( ( '[' ) )
            // InternalCIMIDSL.g:4465:1: ( '[' )
            {
            // InternalCIMIDSL.g:4465:1: ( '[' )
            // InternalCIMIDSL.g:4466:2: '['
            {
             before(grammarAccess.getMatchesAccess().getLeftSquareBracketKeyword_4_1_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMatchesAccess().getLeftSquareBracketKeyword_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__Group_4_1__1__Impl"


    // $ANTLR start "rule__Matches__Group_4_1__2"
    // InternalCIMIDSL.g:4475:1: rule__Matches__Group_4_1__2 : rule__Matches__Group_4_1__2__Impl rule__Matches__Group_4_1__3 ;
    public final void rule__Matches__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4479:1: ( rule__Matches__Group_4_1__2__Impl rule__Matches__Group_4_1__3 )
            // InternalCIMIDSL.g:4480:2: rule__Matches__Group_4_1__2__Impl rule__Matches__Group_4_1__3
            {
            pushFollow(FOLLOW_47);
            rule__Matches__Group_4_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matches__Group_4_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__Group_4_1__2"


    // $ANTLR start "rule__Matches__Group_4_1__2__Impl"
    // InternalCIMIDSL.g:4487:1: rule__Matches__Group_4_1__2__Impl : ( ( rule__Matches__ValueDefinitionAssignment_4_1_2 ) ) ;
    public final void rule__Matches__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4491:1: ( ( ( rule__Matches__ValueDefinitionAssignment_4_1_2 ) ) )
            // InternalCIMIDSL.g:4492:1: ( ( rule__Matches__ValueDefinitionAssignment_4_1_2 ) )
            {
            // InternalCIMIDSL.g:4492:1: ( ( rule__Matches__ValueDefinitionAssignment_4_1_2 ) )
            // InternalCIMIDSL.g:4493:2: ( rule__Matches__ValueDefinitionAssignment_4_1_2 )
            {
             before(grammarAccess.getMatchesAccess().getValueDefinitionAssignment_4_1_2()); 
            // InternalCIMIDSL.g:4494:2: ( rule__Matches__ValueDefinitionAssignment_4_1_2 )
            // InternalCIMIDSL.g:4494:3: rule__Matches__ValueDefinitionAssignment_4_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Matches__ValueDefinitionAssignment_4_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMatchesAccess().getValueDefinitionAssignment_4_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__Group_4_1__2__Impl"


    // $ANTLR start "rule__Matches__Group_4_1__3"
    // InternalCIMIDSL.g:4502:1: rule__Matches__Group_4_1__3 : rule__Matches__Group_4_1__3__Impl ;
    public final void rule__Matches__Group_4_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4506:1: ( rule__Matches__Group_4_1__3__Impl )
            // InternalCIMIDSL.g:4507:2: rule__Matches__Group_4_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Matches__Group_4_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__Group_4_1__3"


    // $ANTLR start "rule__Matches__Group_4_1__3__Impl"
    // InternalCIMIDSL.g:4513:1: rule__Matches__Group_4_1__3__Impl : ( ']' ) ;
    public final void rule__Matches__Group_4_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4517:1: ( ( ']' ) )
            // InternalCIMIDSL.g:4518:1: ( ']' )
            {
            // InternalCIMIDSL.g:4518:1: ( ']' )
            // InternalCIMIDSL.g:4519:2: ']'
            {
             before(grammarAccess.getMatchesAccess().getRightSquareBracketKeyword_4_1_3()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getMatchesAccess().getRightSquareBracketKeyword_4_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__Group_4_1__3__Impl"


    // $ANTLR start "rule__Terminology__Group__0"
    // InternalCIMIDSL.g:4529:1: rule__Terminology__Group__0 : rule__Terminology__Group__0__Impl rule__Terminology__Group__1 ;
    public final void rule__Terminology__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4533:1: ( rule__Terminology__Group__0__Impl rule__Terminology__Group__1 )
            // InternalCIMIDSL.g:4534:2: rule__Terminology__Group__0__Impl rule__Terminology__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Terminology__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Terminology__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__0"


    // $ANTLR start "rule__Terminology__Group__0__Impl"
    // InternalCIMIDSL.g:4541:1: rule__Terminology__Group__0__Impl : ( 'term_definitions' ) ;
    public final void rule__Terminology__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4545:1: ( ( 'term_definitions' ) )
            // InternalCIMIDSL.g:4546:1: ( 'term_definitions' )
            {
            // InternalCIMIDSL.g:4546:1: ( 'term_definitions' )
            // InternalCIMIDSL.g:4547:2: 'term_definitions'
            {
             before(grammarAccess.getTerminologyAccess().getTerm_definitionsKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getTerminologyAccess().getTerm_definitionsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__0__Impl"


    // $ANTLR start "rule__Terminology__Group__1"
    // InternalCIMIDSL.g:4556:1: rule__Terminology__Group__1 : rule__Terminology__Group__1__Impl rule__Terminology__Group__2 ;
    public final void rule__Terminology__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4560:1: ( rule__Terminology__Group__1__Impl rule__Terminology__Group__2 )
            // InternalCIMIDSL.g:4561:2: rule__Terminology__Group__1__Impl rule__Terminology__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Terminology__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Terminology__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__1"


    // $ANTLR start "rule__Terminology__Group__1__Impl"
    // InternalCIMIDSL.g:4568:1: rule__Terminology__Group__1__Impl : ( '=' ) ;
    public final void rule__Terminology__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4572:1: ( ( '=' ) )
            // InternalCIMIDSL.g:4573:1: ( '=' )
            {
            // InternalCIMIDSL.g:4573:1: ( '=' )
            // InternalCIMIDSL.g:4574:2: '='
            {
             before(grammarAccess.getTerminologyAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTerminologyAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__1__Impl"


    // $ANTLR start "rule__Terminology__Group__2"
    // InternalCIMIDSL.g:4583:1: rule__Terminology__Group__2 : rule__Terminology__Group__2__Impl rule__Terminology__Group__3 ;
    public final void rule__Terminology__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4587:1: ( rule__Terminology__Group__2__Impl rule__Terminology__Group__3 )
            // InternalCIMIDSL.g:4588:2: rule__Terminology__Group__2__Impl rule__Terminology__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Terminology__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Terminology__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__2"


    // $ANTLR start "rule__Terminology__Group__2__Impl"
    // InternalCIMIDSL.g:4595:1: rule__Terminology__Group__2__Impl : ( '<' ) ;
    public final void rule__Terminology__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4599:1: ( ( '<' ) )
            // InternalCIMIDSL.g:4600:1: ( '<' )
            {
            // InternalCIMIDSL.g:4600:1: ( '<' )
            // InternalCIMIDSL.g:4601:2: '<'
            {
             before(grammarAccess.getTerminologyAccess().getLessThanSignKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTerminologyAccess().getLessThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__2__Impl"


    // $ANTLR start "rule__Terminology__Group__3"
    // InternalCIMIDSL.g:4610:1: rule__Terminology__Group__3 : rule__Terminology__Group__3__Impl rule__Terminology__Group__4 ;
    public final void rule__Terminology__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4614:1: ( rule__Terminology__Group__3__Impl rule__Terminology__Group__4 )
            // InternalCIMIDSL.g:4615:2: rule__Terminology__Group__3__Impl rule__Terminology__Group__4
            {
            pushFollow(FOLLOW_48);
            rule__Terminology__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Terminology__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__3"


    // $ANTLR start "rule__Terminology__Group__3__Impl"
    // InternalCIMIDSL.g:4622:1: rule__Terminology__Group__3__Impl : ( '\\r' ) ;
    public final void rule__Terminology__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4626:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:4627:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:4627:1: ( '\\r' )
            // InternalCIMIDSL.g:4628:2: '\\r'
            {
             before(grammarAccess.getTerminologyAccess().getControl000dKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTerminologyAccess().getControl000dKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__3__Impl"


    // $ANTLR start "rule__Terminology__Group__4"
    // InternalCIMIDSL.g:4637:1: rule__Terminology__Group__4 : rule__Terminology__Group__4__Impl rule__Terminology__Group__5 ;
    public final void rule__Terminology__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4641:1: ( rule__Terminology__Group__4__Impl rule__Terminology__Group__5 )
            // InternalCIMIDSL.g:4642:2: rule__Terminology__Group__4__Impl rule__Terminology__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Terminology__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Terminology__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__4"


    // $ANTLR start "rule__Terminology__Group__4__Impl"
    // InternalCIMIDSL.g:4649:1: rule__Terminology__Group__4__Impl : ( ( rule__Terminology__TermDefinitionAssignment_4 ) ) ;
    public final void rule__Terminology__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4653:1: ( ( ( rule__Terminology__TermDefinitionAssignment_4 ) ) )
            // InternalCIMIDSL.g:4654:1: ( ( rule__Terminology__TermDefinitionAssignment_4 ) )
            {
            // InternalCIMIDSL.g:4654:1: ( ( rule__Terminology__TermDefinitionAssignment_4 ) )
            // InternalCIMIDSL.g:4655:2: ( rule__Terminology__TermDefinitionAssignment_4 )
            {
             before(grammarAccess.getTerminologyAccess().getTermDefinitionAssignment_4()); 
            // InternalCIMIDSL.g:4656:2: ( rule__Terminology__TermDefinitionAssignment_4 )
            // InternalCIMIDSL.g:4656:3: rule__Terminology__TermDefinitionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Terminology__TermDefinitionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTerminologyAccess().getTermDefinitionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__4__Impl"


    // $ANTLR start "rule__Terminology__Group__5"
    // InternalCIMIDSL.g:4664:1: rule__Terminology__Group__5 : rule__Terminology__Group__5__Impl rule__Terminology__Group__6 ;
    public final void rule__Terminology__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4668:1: ( rule__Terminology__Group__5__Impl rule__Terminology__Group__6 )
            // InternalCIMIDSL.g:4669:2: rule__Terminology__Group__5__Impl rule__Terminology__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Terminology__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Terminology__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__5"


    // $ANTLR start "rule__Terminology__Group__5__Impl"
    // InternalCIMIDSL.g:4676:1: rule__Terminology__Group__5__Impl : ( '\\r' ) ;
    public final void rule__Terminology__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4680:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:4681:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:4681:1: ( '\\r' )
            // InternalCIMIDSL.g:4682:2: '\\r'
            {
             before(grammarAccess.getTerminologyAccess().getControl000dKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTerminologyAccess().getControl000dKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__5__Impl"


    // $ANTLR start "rule__Terminology__Group__6"
    // InternalCIMIDSL.g:4691:1: rule__Terminology__Group__6 : rule__Terminology__Group__6__Impl rule__Terminology__Group__7 ;
    public final void rule__Terminology__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4695:1: ( rule__Terminology__Group__6__Impl rule__Terminology__Group__7 )
            // InternalCIMIDSL.g:4696:2: rule__Terminology__Group__6__Impl rule__Terminology__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Terminology__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Terminology__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__6"


    // $ANTLR start "rule__Terminology__Group__6__Impl"
    // InternalCIMIDSL.g:4703:1: rule__Terminology__Group__6__Impl : ( '>' ) ;
    public final void rule__Terminology__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4707:1: ( ( '>' ) )
            // InternalCIMIDSL.g:4708:1: ( '>' )
            {
            // InternalCIMIDSL.g:4708:1: ( '>' )
            // InternalCIMIDSL.g:4709:2: '>'
            {
             before(grammarAccess.getTerminologyAccess().getGreaterThanSignKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTerminologyAccess().getGreaterThanSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__6__Impl"


    // $ANTLR start "rule__Terminology__Group__7"
    // InternalCIMIDSL.g:4718:1: rule__Terminology__Group__7 : rule__Terminology__Group__7__Impl rule__Terminology__Group__8 ;
    public final void rule__Terminology__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4722:1: ( rule__Terminology__Group__7__Impl rule__Terminology__Group__8 )
            // InternalCIMIDSL.g:4723:2: rule__Terminology__Group__7__Impl rule__Terminology__Group__8
            {
            pushFollow(FOLLOW_49);
            rule__Terminology__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Terminology__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__7"


    // $ANTLR start "rule__Terminology__Group__7__Impl"
    // InternalCIMIDSL.g:4730:1: rule__Terminology__Group__7__Impl : ( '\\r' ) ;
    public final void rule__Terminology__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4734:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:4735:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:4735:1: ( '\\r' )
            // InternalCIMIDSL.g:4736:2: '\\r'
            {
             before(grammarAccess.getTerminologyAccess().getControl000dKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTerminologyAccess().getControl000dKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__7__Impl"


    // $ANTLR start "rule__Terminology__Group__8"
    // InternalCIMIDSL.g:4745:1: rule__Terminology__Group__8 : rule__Terminology__Group__8__Impl rule__Terminology__Group__9 ;
    public final void rule__Terminology__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4749:1: ( rule__Terminology__Group__8__Impl rule__Terminology__Group__9 )
            // InternalCIMIDSL.g:4750:2: rule__Terminology__Group__8__Impl rule__Terminology__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__Terminology__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Terminology__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__8"


    // $ANTLR start "rule__Terminology__Group__8__Impl"
    // InternalCIMIDSL.g:4757:1: rule__Terminology__Group__8__Impl : ( 'term_bindings' ) ;
    public final void rule__Terminology__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4761:1: ( ( 'term_bindings' ) )
            // InternalCIMIDSL.g:4762:1: ( 'term_bindings' )
            {
            // InternalCIMIDSL.g:4762:1: ( 'term_bindings' )
            // InternalCIMIDSL.g:4763:2: 'term_bindings'
            {
             before(grammarAccess.getTerminologyAccess().getTerm_bindingsKeyword_8()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getTerminologyAccess().getTerm_bindingsKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__8__Impl"


    // $ANTLR start "rule__Terminology__Group__9"
    // InternalCIMIDSL.g:4772:1: rule__Terminology__Group__9 : rule__Terminology__Group__9__Impl rule__Terminology__Group__10 ;
    public final void rule__Terminology__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4776:1: ( rule__Terminology__Group__9__Impl rule__Terminology__Group__10 )
            // InternalCIMIDSL.g:4777:2: rule__Terminology__Group__9__Impl rule__Terminology__Group__10
            {
            pushFollow(FOLLOW_21);
            rule__Terminology__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Terminology__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__9"


    // $ANTLR start "rule__Terminology__Group__9__Impl"
    // InternalCIMIDSL.g:4784:1: rule__Terminology__Group__9__Impl : ( '=' ) ;
    public final void rule__Terminology__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4788:1: ( ( '=' ) )
            // InternalCIMIDSL.g:4789:1: ( '=' )
            {
            // InternalCIMIDSL.g:4789:1: ( '=' )
            // InternalCIMIDSL.g:4790:2: '='
            {
             before(grammarAccess.getTerminologyAccess().getEqualsSignKeyword_9()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTerminologyAccess().getEqualsSignKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__9__Impl"


    // $ANTLR start "rule__Terminology__Group__10"
    // InternalCIMIDSL.g:4799:1: rule__Terminology__Group__10 : rule__Terminology__Group__10__Impl rule__Terminology__Group__11 ;
    public final void rule__Terminology__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4803:1: ( rule__Terminology__Group__10__Impl rule__Terminology__Group__11 )
            // InternalCIMIDSL.g:4804:2: rule__Terminology__Group__10__Impl rule__Terminology__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__Terminology__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Terminology__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__10"


    // $ANTLR start "rule__Terminology__Group__10__Impl"
    // InternalCIMIDSL.g:4811:1: rule__Terminology__Group__10__Impl : ( '<' ) ;
    public final void rule__Terminology__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4815:1: ( ( '<' ) )
            // InternalCIMIDSL.g:4816:1: ( '<' )
            {
            // InternalCIMIDSL.g:4816:1: ( '<' )
            // InternalCIMIDSL.g:4817:2: '<'
            {
             before(grammarAccess.getTerminologyAccess().getLessThanSignKeyword_10()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTerminologyAccess().getLessThanSignKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__10__Impl"


    // $ANTLR start "rule__Terminology__Group__11"
    // InternalCIMIDSL.g:4826:1: rule__Terminology__Group__11 : rule__Terminology__Group__11__Impl rule__Terminology__Group__12 ;
    public final void rule__Terminology__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4830:1: ( rule__Terminology__Group__11__Impl rule__Terminology__Group__12 )
            // InternalCIMIDSL.g:4831:2: rule__Terminology__Group__11__Impl rule__Terminology__Group__12
            {
            pushFollow(FOLLOW_48);
            rule__Terminology__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Terminology__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__11"


    // $ANTLR start "rule__Terminology__Group__11__Impl"
    // InternalCIMIDSL.g:4838:1: rule__Terminology__Group__11__Impl : ( '\\r' ) ;
    public final void rule__Terminology__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4842:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:4843:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:4843:1: ( '\\r' )
            // InternalCIMIDSL.g:4844:2: '\\r'
            {
             before(grammarAccess.getTerminologyAccess().getControl000dKeyword_11()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTerminologyAccess().getControl000dKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__11__Impl"


    // $ANTLR start "rule__Terminology__Group__12"
    // InternalCIMIDSL.g:4853:1: rule__Terminology__Group__12 : rule__Terminology__Group__12__Impl rule__Terminology__Group__13 ;
    public final void rule__Terminology__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4857:1: ( rule__Terminology__Group__12__Impl rule__Terminology__Group__13 )
            // InternalCIMIDSL.g:4858:2: rule__Terminology__Group__12__Impl rule__Terminology__Group__13
            {
            pushFollow(FOLLOW_12);
            rule__Terminology__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Terminology__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__12"


    // $ANTLR start "rule__Terminology__Group__12__Impl"
    // InternalCIMIDSL.g:4865:1: rule__Terminology__Group__12__Impl : ( ( rule__Terminology__TermBindingAssignment_12 ) ) ;
    public final void rule__Terminology__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4869:1: ( ( ( rule__Terminology__TermBindingAssignment_12 ) ) )
            // InternalCIMIDSL.g:4870:1: ( ( rule__Terminology__TermBindingAssignment_12 ) )
            {
            // InternalCIMIDSL.g:4870:1: ( ( rule__Terminology__TermBindingAssignment_12 ) )
            // InternalCIMIDSL.g:4871:2: ( rule__Terminology__TermBindingAssignment_12 )
            {
             before(grammarAccess.getTerminologyAccess().getTermBindingAssignment_12()); 
            // InternalCIMIDSL.g:4872:2: ( rule__Terminology__TermBindingAssignment_12 )
            // InternalCIMIDSL.g:4872:3: rule__Terminology__TermBindingAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Terminology__TermBindingAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getTerminologyAccess().getTermBindingAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__12__Impl"


    // $ANTLR start "rule__Terminology__Group__13"
    // InternalCIMIDSL.g:4880:1: rule__Terminology__Group__13 : rule__Terminology__Group__13__Impl rule__Terminology__Group__14 ;
    public final void rule__Terminology__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4884:1: ( rule__Terminology__Group__13__Impl rule__Terminology__Group__14 )
            // InternalCIMIDSL.g:4885:2: rule__Terminology__Group__13__Impl rule__Terminology__Group__14
            {
            pushFollow(FOLLOW_23);
            rule__Terminology__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Terminology__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__13"


    // $ANTLR start "rule__Terminology__Group__13__Impl"
    // InternalCIMIDSL.g:4892:1: rule__Terminology__Group__13__Impl : ( '\\r' ) ;
    public final void rule__Terminology__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4896:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:4897:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:4897:1: ( '\\r' )
            // InternalCIMIDSL.g:4898:2: '\\r'
            {
             before(grammarAccess.getTerminologyAccess().getControl000dKeyword_13()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTerminologyAccess().getControl000dKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__13__Impl"


    // $ANTLR start "rule__Terminology__Group__14"
    // InternalCIMIDSL.g:4907:1: rule__Terminology__Group__14 : rule__Terminology__Group__14__Impl rule__Terminology__Group__15 ;
    public final void rule__Terminology__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4911:1: ( rule__Terminology__Group__14__Impl rule__Terminology__Group__15 )
            // InternalCIMIDSL.g:4912:2: rule__Terminology__Group__14__Impl rule__Terminology__Group__15
            {
            pushFollow(FOLLOW_12);
            rule__Terminology__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Terminology__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__14"


    // $ANTLR start "rule__Terminology__Group__14__Impl"
    // InternalCIMIDSL.g:4919:1: rule__Terminology__Group__14__Impl : ( '>' ) ;
    public final void rule__Terminology__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4923:1: ( ( '>' ) )
            // InternalCIMIDSL.g:4924:1: ( '>' )
            {
            // InternalCIMIDSL.g:4924:1: ( '>' )
            // InternalCIMIDSL.g:4925:2: '>'
            {
             before(grammarAccess.getTerminologyAccess().getGreaterThanSignKeyword_14()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTerminologyAccess().getGreaterThanSignKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__14__Impl"


    // $ANTLR start "rule__Terminology__Group__15"
    // InternalCIMIDSL.g:4934:1: rule__Terminology__Group__15 : rule__Terminology__Group__15__Impl ;
    public final void rule__Terminology__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4938:1: ( rule__Terminology__Group__15__Impl )
            // InternalCIMIDSL.g:4939:2: rule__Terminology__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Terminology__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__15"


    // $ANTLR start "rule__Terminology__Group__15__Impl"
    // InternalCIMIDSL.g:4945:1: rule__Terminology__Group__15__Impl : ( '\\r' ) ;
    public final void rule__Terminology__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4949:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:4950:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:4950:1: ( '\\r' )
            // InternalCIMIDSL.g:4951:2: '\\r'
            {
             before(grammarAccess.getTerminologyAccess().getControl000dKeyword_15()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTerminologyAccess().getControl000dKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__Group__15__Impl"


    // $ANTLR start "rule__TermDefinitions__Group__0"
    // InternalCIMIDSL.g:4961:1: rule__TermDefinitions__Group__0 : rule__TermDefinitions__Group__0__Impl rule__TermDefinitions__Group__1 ;
    public final void rule__TermDefinitions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4965:1: ( rule__TermDefinitions__Group__0__Impl rule__TermDefinitions__Group__1 )
            // InternalCIMIDSL.g:4966:2: rule__TermDefinitions__Group__0__Impl rule__TermDefinitions__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__TermDefinitions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinitions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinitions__Group__0"


    // $ANTLR start "rule__TermDefinitions__Group__0__Impl"
    // InternalCIMIDSL.g:4973:1: rule__TermDefinitions__Group__0__Impl : ( '[' ) ;
    public final void rule__TermDefinitions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4977:1: ( ( '[' ) )
            // InternalCIMIDSL.g:4978:1: ( '[' )
            {
            // InternalCIMIDSL.g:4978:1: ( '[' )
            // InternalCIMIDSL.g:4979:2: '['
            {
             before(grammarAccess.getTermDefinitionsAccess().getLeftSquareBracketKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionsAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinitions__Group__0__Impl"


    // $ANTLR start "rule__TermDefinitions__Group__1"
    // InternalCIMIDSL.g:4988:1: rule__TermDefinitions__Group__1 : rule__TermDefinitions__Group__1__Impl rule__TermDefinitions__Group__2 ;
    public final void rule__TermDefinitions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:4992:1: ( rule__TermDefinitions__Group__1__Impl rule__TermDefinitions__Group__2 )
            // InternalCIMIDSL.g:4993:2: rule__TermDefinitions__Group__1__Impl rule__TermDefinitions__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__TermDefinitions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinitions__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinitions__Group__1"


    // $ANTLR start "rule__TermDefinitions__Group__1__Impl"
    // InternalCIMIDSL.g:5000:1: rule__TermDefinitions__Group__1__Impl : ( ( rule__TermDefinitions__NameAssignment_1 ) ) ;
    public final void rule__TermDefinitions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5004:1: ( ( ( rule__TermDefinitions__NameAssignment_1 ) ) )
            // InternalCIMIDSL.g:5005:1: ( ( rule__TermDefinitions__NameAssignment_1 ) )
            {
            // InternalCIMIDSL.g:5005:1: ( ( rule__TermDefinitions__NameAssignment_1 ) )
            // InternalCIMIDSL.g:5006:2: ( rule__TermDefinitions__NameAssignment_1 )
            {
             before(grammarAccess.getTermDefinitionsAccess().getNameAssignment_1()); 
            // InternalCIMIDSL.g:5007:2: ( rule__TermDefinitions__NameAssignment_1 )
            // InternalCIMIDSL.g:5007:3: rule__TermDefinitions__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TermDefinitions__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTermDefinitionsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinitions__Group__1__Impl"


    // $ANTLR start "rule__TermDefinitions__Group__2"
    // InternalCIMIDSL.g:5015:1: rule__TermDefinitions__Group__2 : rule__TermDefinitions__Group__2__Impl rule__TermDefinitions__Group__3 ;
    public final void rule__TermDefinitions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5019:1: ( rule__TermDefinitions__Group__2__Impl rule__TermDefinitions__Group__3 )
            // InternalCIMIDSL.g:5020:2: rule__TermDefinitions__Group__2__Impl rule__TermDefinitions__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__TermDefinitions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinitions__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinitions__Group__2"


    // $ANTLR start "rule__TermDefinitions__Group__2__Impl"
    // InternalCIMIDSL.g:5027:1: rule__TermDefinitions__Group__2__Impl : ( ']' ) ;
    public final void rule__TermDefinitions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5031:1: ( ( ']' ) )
            // InternalCIMIDSL.g:5032:1: ( ']' )
            {
            // InternalCIMIDSL.g:5032:1: ( ']' )
            // InternalCIMIDSL.g:5033:2: ']'
            {
             before(grammarAccess.getTermDefinitionsAccess().getRightSquareBracketKeyword_2()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionsAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinitions__Group__2__Impl"


    // $ANTLR start "rule__TermDefinitions__Group__3"
    // InternalCIMIDSL.g:5042:1: rule__TermDefinitions__Group__3 : rule__TermDefinitions__Group__3__Impl rule__TermDefinitions__Group__4 ;
    public final void rule__TermDefinitions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5046:1: ( rule__TermDefinitions__Group__3__Impl rule__TermDefinitions__Group__4 )
            // InternalCIMIDSL.g:5047:2: rule__TermDefinitions__Group__3__Impl rule__TermDefinitions__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__TermDefinitions__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinitions__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinitions__Group__3"


    // $ANTLR start "rule__TermDefinitions__Group__3__Impl"
    // InternalCIMIDSL.g:5054:1: rule__TermDefinitions__Group__3__Impl : ( '=' ) ;
    public final void rule__TermDefinitions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5058:1: ( ( '=' ) )
            // InternalCIMIDSL.g:5059:1: ( '=' )
            {
            // InternalCIMIDSL.g:5059:1: ( '=' )
            // InternalCIMIDSL.g:5060:2: '='
            {
             before(grammarAccess.getTermDefinitionsAccess().getEqualsSignKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionsAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinitions__Group__3__Impl"


    // $ANTLR start "rule__TermDefinitions__Group__4"
    // InternalCIMIDSL.g:5069:1: rule__TermDefinitions__Group__4 : rule__TermDefinitions__Group__4__Impl rule__TermDefinitions__Group__5 ;
    public final void rule__TermDefinitions__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5073:1: ( rule__TermDefinitions__Group__4__Impl rule__TermDefinitions__Group__5 )
            // InternalCIMIDSL.g:5074:2: rule__TermDefinitions__Group__4__Impl rule__TermDefinitions__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__TermDefinitions__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinitions__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinitions__Group__4"


    // $ANTLR start "rule__TermDefinitions__Group__4__Impl"
    // InternalCIMIDSL.g:5081:1: rule__TermDefinitions__Group__4__Impl : ( '\\r' ) ;
    public final void rule__TermDefinitions__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5085:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:5086:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:5086:1: ( '\\r' )
            // InternalCIMIDSL.g:5087:2: '\\r'
            {
             before(grammarAccess.getTermDefinitionsAccess().getControl000dKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionsAccess().getControl000dKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinitions__Group__4__Impl"


    // $ANTLR start "rule__TermDefinitions__Group__5"
    // InternalCIMIDSL.g:5096:1: rule__TermDefinitions__Group__5 : rule__TermDefinitions__Group__5__Impl rule__TermDefinitions__Group__6 ;
    public final void rule__TermDefinitions__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5100:1: ( rule__TermDefinitions__Group__5__Impl rule__TermDefinitions__Group__6 )
            // InternalCIMIDSL.g:5101:2: rule__TermDefinitions__Group__5__Impl rule__TermDefinitions__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__TermDefinitions__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinitions__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinitions__Group__5"


    // $ANTLR start "rule__TermDefinitions__Group__5__Impl"
    // InternalCIMIDSL.g:5108:1: rule__TermDefinitions__Group__5__Impl : ( '<' ) ;
    public final void rule__TermDefinitions__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5112:1: ( ( '<' ) )
            // InternalCIMIDSL.g:5113:1: ( '<' )
            {
            // InternalCIMIDSL.g:5113:1: ( '<' )
            // InternalCIMIDSL.g:5114:2: '<'
            {
             before(grammarAccess.getTermDefinitionsAccess().getLessThanSignKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionsAccess().getLessThanSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinitions__Group__5__Impl"


    // $ANTLR start "rule__TermDefinitions__Group__6"
    // InternalCIMIDSL.g:5123:1: rule__TermDefinitions__Group__6 : rule__TermDefinitions__Group__6__Impl rule__TermDefinitions__Group__7 ;
    public final void rule__TermDefinitions__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5127:1: ( rule__TermDefinitions__Group__6__Impl rule__TermDefinitions__Group__7 )
            // InternalCIMIDSL.g:5128:2: rule__TermDefinitions__Group__6__Impl rule__TermDefinitions__Group__7
            {
            pushFollow(FOLLOW_50);
            rule__TermDefinitions__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinitions__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinitions__Group__6"


    // $ANTLR start "rule__TermDefinitions__Group__6__Impl"
    // InternalCIMIDSL.g:5135:1: rule__TermDefinitions__Group__6__Impl : ( '\\r' ) ;
    public final void rule__TermDefinitions__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5139:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:5140:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:5140:1: ( '\\r' )
            // InternalCIMIDSL.g:5141:2: '\\r'
            {
             before(grammarAccess.getTermDefinitionsAccess().getControl000dKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionsAccess().getControl000dKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinitions__Group__6__Impl"


    // $ANTLR start "rule__TermDefinitions__Group__7"
    // InternalCIMIDSL.g:5150:1: rule__TermDefinitions__Group__7 : rule__TermDefinitions__Group__7__Impl rule__TermDefinitions__Group__8 ;
    public final void rule__TermDefinitions__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5154:1: ( rule__TermDefinitions__Group__7__Impl rule__TermDefinitions__Group__8 )
            // InternalCIMIDSL.g:5155:2: rule__TermDefinitions__Group__7__Impl rule__TermDefinitions__Group__8
            {
            pushFollow(FOLLOW_50);
            rule__TermDefinitions__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinitions__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinitions__Group__7"


    // $ANTLR start "rule__TermDefinitions__Group__7__Impl"
    // InternalCIMIDSL.g:5162:1: rule__TermDefinitions__Group__7__Impl : ( ( rule__TermDefinitions__ElementsAssignment_7 )* ) ;
    public final void rule__TermDefinitions__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5166:1: ( ( ( rule__TermDefinitions__ElementsAssignment_7 )* ) )
            // InternalCIMIDSL.g:5167:1: ( ( rule__TermDefinitions__ElementsAssignment_7 )* )
            {
            // InternalCIMIDSL.g:5167:1: ( ( rule__TermDefinitions__ElementsAssignment_7 )* )
            // InternalCIMIDSL.g:5168:2: ( rule__TermDefinitions__ElementsAssignment_7 )*
            {
             before(grammarAccess.getTermDefinitionsAccess().getElementsAssignment_7()); 
            // InternalCIMIDSL.g:5169:2: ( rule__TermDefinitions__ElementsAssignment_7 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==51) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCIMIDSL.g:5169:3: rule__TermDefinitions__ElementsAssignment_7
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__TermDefinitions__ElementsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTermDefinitionsAccess().getElementsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinitions__Group__7__Impl"


    // $ANTLR start "rule__TermDefinitions__Group__8"
    // InternalCIMIDSL.g:5177:1: rule__TermDefinitions__Group__8 : rule__TermDefinitions__Group__8__Impl rule__TermDefinitions__Group__9 ;
    public final void rule__TermDefinitions__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5181:1: ( rule__TermDefinitions__Group__8__Impl rule__TermDefinitions__Group__9 )
            // InternalCIMIDSL.g:5182:2: rule__TermDefinitions__Group__8__Impl rule__TermDefinitions__Group__9
            {
            pushFollow(FOLLOW_23);
            rule__TermDefinitions__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinitions__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinitions__Group__8"


    // $ANTLR start "rule__TermDefinitions__Group__8__Impl"
    // InternalCIMIDSL.g:5189:1: rule__TermDefinitions__Group__8__Impl : ( '\\r' ) ;
    public final void rule__TermDefinitions__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5193:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:5194:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:5194:1: ( '\\r' )
            // InternalCIMIDSL.g:5195:2: '\\r'
            {
             before(grammarAccess.getTermDefinitionsAccess().getControl000dKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionsAccess().getControl000dKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinitions__Group__8__Impl"


    // $ANTLR start "rule__TermDefinitions__Group__9"
    // InternalCIMIDSL.g:5204:1: rule__TermDefinitions__Group__9 : rule__TermDefinitions__Group__9__Impl rule__TermDefinitions__Group__10 ;
    public final void rule__TermDefinitions__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5208:1: ( rule__TermDefinitions__Group__9__Impl rule__TermDefinitions__Group__10 )
            // InternalCIMIDSL.g:5209:2: rule__TermDefinitions__Group__9__Impl rule__TermDefinitions__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__TermDefinitions__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinitions__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinitions__Group__9"


    // $ANTLR start "rule__TermDefinitions__Group__9__Impl"
    // InternalCIMIDSL.g:5216:1: rule__TermDefinitions__Group__9__Impl : ( '>' ) ;
    public final void rule__TermDefinitions__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5220:1: ( ( '>' ) )
            // InternalCIMIDSL.g:5221:1: ( '>' )
            {
            // InternalCIMIDSL.g:5221:1: ( '>' )
            // InternalCIMIDSL.g:5222:2: '>'
            {
             before(grammarAccess.getTermDefinitionsAccess().getGreaterThanSignKeyword_9()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionsAccess().getGreaterThanSignKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinitions__Group__9__Impl"


    // $ANTLR start "rule__TermDefinitions__Group__10"
    // InternalCIMIDSL.g:5231:1: rule__TermDefinitions__Group__10 : rule__TermDefinitions__Group__10__Impl ;
    public final void rule__TermDefinitions__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5235:1: ( rule__TermDefinitions__Group__10__Impl )
            // InternalCIMIDSL.g:5236:2: rule__TermDefinitions__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TermDefinitions__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinitions__Group__10"


    // $ANTLR start "rule__TermDefinitions__Group__10__Impl"
    // InternalCIMIDSL.g:5242:1: rule__TermDefinitions__Group__10__Impl : ( '\\r' ) ;
    public final void rule__TermDefinitions__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5246:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:5247:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:5247:1: ( '\\r' )
            // InternalCIMIDSL.g:5248:2: '\\r'
            {
             before(grammarAccess.getTermDefinitionsAccess().getControl000dKeyword_10()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionsAccess().getControl000dKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinitions__Group__10__Impl"


    // $ANTLR start "rule__TermBindings__Group__0"
    // InternalCIMIDSL.g:5258:1: rule__TermBindings__Group__0 : rule__TermBindings__Group__0__Impl rule__TermBindings__Group__1 ;
    public final void rule__TermBindings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5262:1: ( rule__TermBindings__Group__0__Impl rule__TermBindings__Group__1 )
            // InternalCIMIDSL.g:5263:2: rule__TermBindings__Group__0__Impl rule__TermBindings__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__TermBindings__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermBindings__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBindings__Group__0"


    // $ANTLR start "rule__TermBindings__Group__0__Impl"
    // InternalCIMIDSL.g:5270:1: rule__TermBindings__Group__0__Impl : ( '[' ) ;
    public final void rule__TermBindings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5274:1: ( ( '[' ) )
            // InternalCIMIDSL.g:5275:1: ( '[' )
            {
            // InternalCIMIDSL.g:5275:1: ( '[' )
            // InternalCIMIDSL.g:5276:2: '['
            {
             before(grammarAccess.getTermBindingsAccess().getLeftSquareBracketKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTermBindingsAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBindings__Group__0__Impl"


    // $ANTLR start "rule__TermBindings__Group__1"
    // InternalCIMIDSL.g:5285:1: rule__TermBindings__Group__1 : rule__TermBindings__Group__1__Impl rule__TermBindings__Group__2 ;
    public final void rule__TermBindings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5289:1: ( rule__TermBindings__Group__1__Impl rule__TermBindings__Group__2 )
            // InternalCIMIDSL.g:5290:2: rule__TermBindings__Group__1__Impl rule__TermBindings__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__TermBindings__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermBindings__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBindings__Group__1"


    // $ANTLR start "rule__TermBindings__Group__1__Impl"
    // InternalCIMIDSL.g:5297:1: rule__TermBindings__Group__1__Impl : ( ( rule__TermBindings__NameAssignment_1 ) ) ;
    public final void rule__TermBindings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5301:1: ( ( ( rule__TermBindings__NameAssignment_1 ) ) )
            // InternalCIMIDSL.g:5302:1: ( ( rule__TermBindings__NameAssignment_1 ) )
            {
            // InternalCIMIDSL.g:5302:1: ( ( rule__TermBindings__NameAssignment_1 ) )
            // InternalCIMIDSL.g:5303:2: ( rule__TermBindings__NameAssignment_1 )
            {
             before(grammarAccess.getTermBindingsAccess().getNameAssignment_1()); 
            // InternalCIMIDSL.g:5304:2: ( rule__TermBindings__NameAssignment_1 )
            // InternalCIMIDSL.g:5304:3: rule__TermBindings__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TermBindings__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTermBindingsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBindings__Group__1__Impl"


    // $ANTLR start "rule__TermBindings__Group__2"
    // InternalCIMIDSL.g:5312:1: rule__TermBindings__Group__2 : rule__TermBindings__Group__2__Impl rule__TermBindings__Group__3 ;
    public final void rule__TermBindings__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5316:1: ( rule__TermBindings__Group__2__Impl rule__TermBindings__Group__3 )
            // InternalCIMIDSL.g:5317:2: rule__TermBindings__Group__2__Impl rule__TermBindings__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__TermBindings__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermBindings__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBindings__Group__2"


    // $ANTLR start "rule__TermBindings__Group__2__Impl"
    // InternalCIMIDSL.g:5324:1: rule__TermBindings__Group__2__Impl : ( ']' ) ;
    public final void rule__TermBindings__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5328:1: ( ( ']' ) )
            // InternalCIMIDSL.g:5329:1: ( ']' )
            {
            // InternalCIMIDSL.g:5329:1: ( ']' )
            // InternalCIMIDSL.g:5330:2: ']'
            {
             before(grammarAccess.getTermBindingsAccess().getRightSquareBracketKeyword_2()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getTermBindingsAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBindings__Group__2__Impl"


    // $ANTLR start "rule__TermBindings__Group__3"
    // InternalCIMIDSL.g:5339:1: rule__TermBindings__Group__3 : rule__TermBindings__Group__3__Impl rule__TermBindings__Group__4 ;
    public final void rule__TermBindings__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5343:1: ( rule__TermBindings__Group__3__Impl rule__TermBindings__Group__4 )
            // InternalCIMIDSL.g:5344:2: rule__TermBindings__Group__3__Impl rule__TermBindings__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__TermBindings__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermBindings__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBindings__Group__3"


    // $ANTLR start "rule__TermBindings__Group__3__Impl"
    // InternalCIMIDSL.g:5351:1: rule__TermBindings__Group__3__Impl : ( '=' ) ;
    public final void rule__TermBindings__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5355:1: ( ( '=' ) )
            // InternalCIMIDSL.g:5356:1: ( '=' )
            {
            // InternalCIMIDSL.g:5356:1: ( '=' )
            // InternalCIMIDSL.g:5357:2: '='
            {
             before(grammarAccess.getTermBindingsAccess().getEqualsSignKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTermBindingsAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBindings__Group__3__Impl"


    // $ANTLR start "rule__TermBindings__Group__4"
    // InternalCIMIDSL.g:5366:1: rule__TermBindings__Group__4 : rule__TermBindings__Group__4__Impl rule__TermBindings__Group__5 ;
    public final void rule__TermBindings__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5370:1: ( rule__TermBindings__Group__4__Impl rule__TermBindings__Group__5 )
            // InternalCIMIDSL.g:5371:2: rule__TermBindings__Group__4__Impl rule__TermBindings__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__TermBindings__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermBindings__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBindings__Group__4"


    // $ANTLR start "rule__TermBindings__Group__4__Impl"
    // InternalCIMIDSL.g:5378:1: rule__TermBindings__Group__4__Impl : ( '\\r' ) ;
    public final void rule__TermBindings__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5382:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:5383:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:5383:1: ( '\\r' )
            // InternalCIMIDSL.g:5384:2: '\\r'
            {
             before(grammarAccess.getTermBindingsAccess().getControl000dKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTermBindingsAccess().getControl000dKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBindings__Group__4__Impl"


    // $ANTLR start "rule__TermBindings__Group__5"
    // InternalCIMIDSL.g:5393:1: rule__TermBindings__Group__5 : rule__TermBindings__Group__5__Impl rule__TermBindings__Group__6 ;
    public final void rule__TermBindings__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5397:1: ( rule__TermBindings__Group__5__Impl rule__TermBindings__Group__6 )
            // InternalCIMIDSL.g:5398:2: rule__TermBindings__Group__5__Impl rule__TermBindings__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__TermBindings__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermBindings__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBindings__Group__5"


    // $ANTLR start "rule__TermBindings__Group__5__Impl"
    // InternalCIMIDSL.g:5405:1: rule__TermBindings__Group__5__Impl : ( '<' ) ;
    public final void rule__TermBindings__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5409:1: ( ( '<' ) )
            // InternalCIMIDSL.g:5410:1: ( '<' )
            {
            // InternalCIMIDSL.g:5410:1: ( '<' )
            // InternalCIMIDSL.g:5411:2: '<'
            {
             before(grammarAccess.getTermBindingsAccess().getLessThanSignKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTermBindingsAccess().getLessThanSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBindings__Group__5__Impl"


    // $ANTLR start "rule__TermBindings__Group__6"
    // InternalCIMIDSL.g:5420:1: rule__TermBindings__Group__6 : rule__TermBindings__Group__6__Impl rule__TermBindings__Group__7 ;
    public final void rule__TermBindings__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5424:1: ( rule__TermBindings__Group__6__Impl rule__TermBindings__Group__7 )
            // InternalCIMIDSL.g:5425:2: rule__TermBindings__Group__6__Impl rule__TermBindings__Group__7
            {
            pushFollow(FOLLOW_50);
            rule__TermBindings__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermBindings__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBindings__Group__6"


    // $ANTLR start "rule__TermBindings__Group__6__Impl"
    // InternalCIMIDSL.g:5432:1: rule__TermBindings__Group__6__Impl : ( '\\r' ) ;
    public final void rule__TermBindings__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5436:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:5437:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:5437:1: ( '\\r' )
            // InternalCIMIDSL.g:5438:2: '\\r'
            {
             before(grammarAccess.getTermBindingsAccess().getControl000dKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTermBindingsAccess().getControl000dKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBindings__Group__6__Impl"


    // $ANTLR start "rule__TermBindings__Group__7"
    // InternalCIMIDSL.g:5447:1: rule__TermBindings__Group__7 : rule__TermBindings__Group__7__Impl rule__TermBindings__Group__8 ;
    public final void rule__TermBindings__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5451:1: ( rule__TermBindings__Group__7__Impl rule__TermBindings__Group__8 )
            // InternalCIMIDSL.g:5452:2: rule__TermBindings__Group__7__Impl rule__TermBindings__Group__8
            {
            pushFollow(FOLLOW_50);
            rule__TermBindings__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermBindings__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBindings__Group__7"


    // $ANTLR start "rule__TermBindings__Group__7__Impl"
    // InternalCIMIDSL.g:5459:1: rule__TermBindings__Group__7__Impl : ( ( rule__TermBindings__ElementsAssignment_7 )* ) ;
    public final void rule__TermBindings__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5463:1: ( ( ( rule__TermBindings__ElementsAssignment_7 )* ) )
            // InternalCIMIDSL.g:5464:1: ( ( rule__TermBindings__ElementsAssignment_7 )* )
            {
            // InternalCIMIDSL.g:5464:1: ( ( rule__TermBindings__ElementsAssignment_7 )* )
            // InternalCIMIDSL.g:5465:2: ( rule__TermBindings__ElementsAssignment_7 )*
            {
             before(grammarAccess.getTermBindingsAccess().getElementsAssignment_7()); 
            // InternalCIMIDSL.g:5466:2: ( rule__TermBindings__ElementsAssignment_7 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==51) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCIMIDSL.g:5466:3: rule__TermBindings__ElementsAssignment_7
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__TermBindings__ElementsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTermBindingsAccess().getElementsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBindings__Group__7__Impl"


    // $ANTLR start "rule__TermBindings__Group__8"
    // InternalCIMIDSL.g:5474:1: rule__TermBindings__Group__8 : rule__TermBindings__Group__8__Impl rule__TermBindings__Group__9 ;
    public final void rule__TermBindings__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5478:1: ( rule__TermBindings__Group__8__Impl rule__TermBindings__Group__9 )
            // InternalCIMIDSL.g:5479:2: rule__TermBindings__Group__8__Impl rule__TermBindings__Group__9
            {
            pushFollow(FOLLOW_23);
            rule__TermBindings__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermBindings__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBindings__Group__8"


    // $ANTLR start "rule__TermBindings__Group__8__Impl"
    // InternalCIMIDSL.g:5486:1: rule__TermBindings__Group__8__Impl : ( '\\r' ) ;
    public final void rule__TermBindings__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5490:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:5491:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:5491:1: ( '\\r' )
            // InternalCIMIDSL.g:5492:2: '\\r'
            {
             before(grammarAccess.getTermBindingsAccess().getControl000dKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTermBindingsAccess().getControl000dKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBindings__Group__8__Impl"


    // $ANTLR start "rule__TermBindings__Group__9"
    // InternalCIMIDSL.g:5501:1: rule__TermBindings__Group__9 : rule__TermBindings__Group__9__Impl rule__TermBindings__Group__10 ;
    public final void rule__TermBindings__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5505:1: ( rule__TermBindings__Group__9__Impl rule__TermBindings__Group__10 )
            // InternalCIMIDSL.g:5506:2: rule__TermBindings__Group__9__Impl rule__TermBindings__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__TermBindings__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermBindings__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBindings__Group__9"


    // $ANTLR start "rule__TermBindings__Group__9__Impl"
    // InternalCIMIDSL.g:5513:1: rule__TermBindings__Group__9__Impl : ( '>' ) ;
    public final void rule__TermBindings__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5517:1: ( ( '>' ) )
            // InternalCIMIDSL.g:5518:1: ( '>' )
            {
            // InternalCIMIDSL.g:5518:1: ( '>' )
            // InternalCIMIDSL.g:5519:2: '>'
            {
             before(grammarAccess.getTermBindingsAccess().getGreaterThanSignKeyword_9()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTermBindingsAccess().getGreaterThanSignKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBindings__Group__9__Impl"


    // $ANTLR start "rule__TermBindings__Group__10"
    // InternalCIMIDSL.g:5528:1: rule__TermBindings__Group__10 : rule__TermBindings__Group__10__Impl ;
    public final void rule__TermBindings__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5532:1: ( rule__TermBindings__Group__10__Impl )
            // InternalCIMIDSL.g:5533:2: rule__TermBindings__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TermBindings__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBindings__Group__10"


    // $ANTLR start "rule__TermBindings__Group__10__Impl"
    // InternalCIMIDSL.g:5539:1: rule__TermBindings__Group__10__Impl : ( '\\r' ) ;
    public final void rule__TermBindings__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5543:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:5544:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:5544:1: ( '\\r' )
            // InternalCIMIDSL.g:5545:2: '\\r'
            {
             before(grammarAccess.getTermBindingsAccess().getControl000dKeyword_10()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTermBindingsAccess().getControl000dKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBindings__Group__10__Impl"


    // $ANTLR start "rule__TermDefinition__Group__0"
    // InternalCIMIDSL.g:5555:1: rule__TermDefinition__Group__0 : rule__TermDefinition__Group__0__Impl rule__TermDefinition__Group__1 ;
    public final void rule__TermDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5559:1: ( rule__TermDefinition__Group__0__Impl rule__TermDefinition__Group__1 )
            // InternalCIMIDSL.g:5560:2: rule__TermDefinition__Group__0__Impl rule__TermDefinition__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__TermDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__0"


    // $ANTLR start "rule__TermDefinition__Group__0__Impl"
    // InternalCIMIDSL.g:5567:1: rule__TermDefinition__Group__0__Impl : ( '[' ) ;
    public final void rule__TermDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5571:1: ( ( '[' ) )
            // InternalCIMIDSL.g:5572:1: ( '[' )
            {
            // InternalCIMIDSL.g:5572:1: ( '[' )
            // InternalCIMIDSL.g:5573:2: '['
            {
             before(grammarAccess.getTermDefinitionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__0__Impl"


    // $ANTLR start "rule__TermDefinition__Group__1"
    // InternalCIMIDSL.g:5582:1: rule__TermDefinition__Group__1 : rule__TermDefinition__Group__1__Impl rule__TermDefinition__Group__2 ;
    public final void rule__TermDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5586:1: ( rule__TermDefinition__Group__1__Impl rule__TermDefinition__Group__2 )
            // InternalCIMIDSL.g:5587:2: rule__TermDefinition__Group__1__Impl rule__TermDefinition__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__TermDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__1"


    // $ANTLR start "rule__TermDefinition__Group__1__Impl"
    // InternalCIMIDSL.g:5594:1: rule__TermDefinition__Group__1__Impl : ( ( rule__TermDefinition__NameAssignment_1 ) ) ;
    public final void rule__TermDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5598:1: ( ( ( rule__TermDefinition__NameAssignment_1 ) ) )
            // InternalCIMIDSL.g:5599:1: ( ( rule__TermDefinition__NameAssignment_1 ) )
            {
            // InternalCIMIDSL.g:5599:1: ( ( rule__TermDefinition__NameAssignment_1 ) )
            // InternalCIMIDSL.g:5600:2: ( rule__TermDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getTermDefinitionAccess().getNameAssignment_1()); 
            // InternalCIMIDSL.g:5601:2: ( rule__TermDefinition__NameAssignment_1 )
            // InternalCIMIDSL.g:5601:3: rule__TermDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TermDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTermDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__1__Impl"


    // $ANTLR start "rule__TermDefinition__Group__2"
    // InternalCIMIDSL.g:5609:1: rule__TermDefinition__Group__2 : rule__TermDefinition__Group__2__Impl rule__TermDefinition__Group__3 ;
    public final void rule__TermDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5613:1: ( rule__TermDefinition__Group__2__Impl rule__TermDefinition__Group__3 )
            // InternalCIMIDSL.g:5614:2: rule__TermDefinition__Group__2__Impl rule__TermDefinition__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__TermDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__2"


    // $ANTLR start "rule__TermDefinition__Group__2__Impl"
    // InternalCIMIDSL.g:5621:1: rule__TermDefinition__Group__2__Impl : ( ']' ) ;
    public final void rule__TermDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5625:1: ( ( ']' ) )
            // InternalCIMIDSL.g:5626:1: ( ']' )
            {
            // InternalCIMIDSL.g:5626:1: ( ']' )
            // InternalCIMIDSL.g:5627:2: ']'
            {
             before(grammarAccess.getTermDefinitionAccess().getRightSquareBracketKeyword_2()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__2__Impl"


    // $ANTLR start "rule__TermDefinition__Group__3"
    // InternalCIMIDSL.g:5636:1: rule__TermDefinition__Group__3 : rule__TermDefinition__Group__3__Impl rule__TermDefinition__Group__4 ;
    public final void rule__TermDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5640:1: ( rule__TermDefinition__Group__3__Impl rule__TermDefinition__Group__4 )
            // InternalCIMIDSL.g:5641:2: rule__TermDefinition__Group__3__Impl rule__TermDefinition__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__TermDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__3"


    // $ANTLR start "rule__TermDefinition__Group__3__Impl"
    // InternalCIMIDSL.g:5648:1: rule__TermDefinition__Group__3__Impl : ( '=' ) ;
    public final void rule__TermDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5652:1: ( ( '=' ) )
            // InternalCIMIDSL.g:5653:1: ( '=' )
            {
            // InternalCIMIDSL.g:5653:1: ( '=' )
            // InternalCIMIDSL.g:5654:2: '='
            {
             before(grammarAccess.getTermDefinitionAccess().getEqualsSignKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__3__Impl"


    // $ANTLR start "rule__TermDefinition__Group__4"
    // InternalCIMIDSL.g:5663:1: rule__TermDefinition__Group__4 : rule__TermDefinition__Group__4__Impl rule__TermDefinition__Group__5 ;
    public final void rule__TermDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5667:1: ( rule__TermDefinition__Group__4__Impl rule__TermDefinition__Group__5 )
            // InternalCIMIDSL.g:5668:2: rule__TermDefinition__Group__4__Impl rule__TermDefinition__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__TermDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__4"


    // $ANTLR start "rule__TermDefinition__Group__4__Impl"
    // InternalCIMIDSL.g:5675:1: rule__TermDefinition__Group__4__Impl : ( '<' ) ;
    public final void rule__TermDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5679:1: ( ( '<' ) )
            // InternalCIMIDSL.g:5680:1: ( '<' )
            {
            // InternalCIMIDSL.g:5680:1: ( '<' )
            // InternalCIMIDSL.g:5681:2: '<'
            {
             before(grammarAccess.getTermDefinitionAccess().getLessThanSignKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionAccess().getLessThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__4__Impl"


    // $ANTLR start "rule__TermDefinition__Group__5"
    // InternalCIMIDSL.g:5690:1: rule__TermDefinition__Group__5 : rule__TermDefinition__Group__5__Impl rule__TermDefinition__Group__6 ;
    public final void rule__TermDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5694:1: ( rule__TermDefinition__Group__5__Impl rule__TermDefinition__Group__6 )
            // InternalCIMIDSL.g:5695:2: rule__TermDefinition__Group__5__Impl rule__TermDefinition__Group__6
            {
            pushFollow(FOLLOW_52);
            rule__TermDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__5"


    // $ANTLR start "rule__TermDefinition__Group__5__Impl"
    // InternalCIMIDSL.g:5702:1: rule__TermDefinition__Group__5__Impl : ( '\\r' ) ;
    public final void rule__TermDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5706:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:5707:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:5707:1: ( '\\r' )
            // InternalCIMIDSL.g:5708:2: '\\r'
            {
             before(grammarAccess.getTermDefinitionAccess().getControl000dKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionAccess().getControl000dKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__5__Impl"


    // $ANTLR start "rule__TermDefinition__Group__6"
    // InternalCIMIDSL.g:5717:1: rule__TermDefinition__Group__6 : rule__TermDefinition__Group__6__Impl rule__TermDefinition__Group__7 ;
    public final void rule__TermDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5721:1: ( rule__TermDefinition__Group__6__Impl rule__TermDefinition__Group__7 )
            // InternalCIMIDSL.g:5722:2: rule__TermDefinition__Group__6__Impl rule__TermDefinition__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__TermDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__6"


    // $ANTLR start "rule__TermDefinition__Group__6__Impl"
    // InternalCIMIDSL.g:5729:1: rule__TermDefinition__Group__6__Impl : ( 'text' ) ;
    public final void rule__TermDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5733:1: ( ( 'text' ) )
            // InternalCIMIDSL.g:5734:1: ( 'text' )
            {
            // InternalCIMIDSL.g:5734:1: ( 'text' )
            // InternalCIMIDSL.g:5735:2: 'text'
            {
             before(grammarAccess.getTermDefinitionAccess().getTextKeyword_6()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionAccess().getTextKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__6__Impl"


    // $ANTLR start "rule__TermDefinition__Group__7"
    // InternalCIMIDSL.g:5744:1: rule__TermDefinition__Group__7 : rule__TermDefinition__Group__7__Impl rule__TermDefinition__Group__8 ;
    public final void rule__TermDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5748:1: ( rule__TermDefinition__Group__7__Impl rule__TermDefinition__Group__8 )
            // InternalCIMIDSL.g:5749:2: rule__TermDefinition__Group__7__Impl rule__TermDefinition__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__TermDefinition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinition__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__7"


    // $ANTLR start "rule__TermDefinition__Group__7__Impl"
    // InternalCIMIDSL.g:5756:1: rule__TermDefinition__Group__7__Impl : ( '=' ) ;
    public final void rule__TermDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5760:1: ( ( '=' ) )
            // InternalCIMIDSL.g:5761:1: ( '=' )
            {
            // InternalCIMIDSL.g:5761:1: ( '=' )
            // InternalCIMIDSL.g:5762:2: '='
            {
             before(grammarAccess.getTermDefinitionAccess().getEqualsSignKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__7__Impl"


    // $ANTLR start "rule__TermDefinition__Group__8"
    // InternalCIMIDSL.g:5771:1: rule__TermDefinition__Group__8 : rule__TermDefinition__Group__8__Impl rule__TermDefinition__Group__9 ;
    public final void rule__TermDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5775:1: ( rule__TermDefinition__Group__8__Impl rule__TermDefinition__Group__9 )
            // InternalCIMIDSL.g:5776:2: rule__TermDefinition__Group__8__Impl rule__TermDefinition__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__TermDefinition__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinition__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__8"


    // $ANTLR start "rule__TermDefinition__Group__8__Impl"
    // InternalCIMIDSL.g:5783:1: rule__TermDefinition__Group__8__Impl : ( '<' ) ;
    public final void rule__TermDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5787:1: ( ( '<' ) )
            // InternalCIMIDSL.g:5788:1: ( '<' )
            {
            // InternalCIMIDSL.g:5788:1: ( '<' )
            // InternalCIMIDSL.g:5789:2: '<'
            {
             before(grammarAccess.getTermDefinitionAccess().getLessThanSignKeyword_8()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionAccess().getLessThanSignKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__8__Impl"


    // $ANTLR start "rule__TermDefinition__Group__9"
    // InternalCIMIDSL.g:5798:1: rule__TermDefinition__Group__9 : rule__TermDefinition__Group__9__Impl rule__TermDefinition__Group__10 ;
    public final void rule__TermDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5802:1: ( rule__TermDefinition__Group__9__Impl rule__TermDefinition__Group__10 )
            // InternalCIMIDSL.g:5803:2: rule__TermDefinition__Group__9__Impl rule__TermDefinition__Group__10
            {
            pushFollow(FOLLOW_23);
            rule__TermDefinition__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinition__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__9"


    // $ANTLR start "rule__TermDefinition__Group__9__Impl"
    // InternalCIMIDSL.g:5810:1: rule__TermDefinition__Group__9__Impl : ( ( rule__TermDefinition__TextAssignment_9 ) ) ;
    public final void rule__TermDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5814:1: ( ( ( rule__TermDefinition__TextAssignment_9 ) ) )
            // InternalCIMIDSL.g:5815:1: ( ( rule__TermDefinition__TextAssignment_9 ) )
            {
            // InternalCIMIDSL.g:5815:1: ( ( rule__TermDefinition__TextAssignment_9 ) )
            // InternalCIMIDSL.g:5816:2: ( rule__TermDefinition__TextAssignment_9 )
            {
             before(grammarAccess.getTermDefinitionAccess().getTextAssignment_9()); 
            // InternalCIMIDSL.g:5817:2: ( rule__TermDefinition__TextAssignment_9 )
            // InternalCIMIDSL.g:5817:3: rule__TermDefinition__TextAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__TermDefinition__TextAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getTermDefinitionAccess().getTextAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__9__Impl"


    // $ANTLR start "rule__TermDefinition__Group__10"
    // InternalCIMIDSL.g:5825:1: rule__TermDefinition__Group__10 : rule__TermDefinition__Group__10__Impl rule__TermDefinition__Group__11 ;
    public final void rule__TermDefinition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5829:1: ( rule__TermDefinition__Group__10__Impl rule__TermDefinition__Group__11 )
            // InternalCIMIDSL.g:5830:2: rule__TermDefinition__Group__10__Impl rule__TermDefinition__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__TermDefinition__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinition__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__10"


    // $ANTLR start "rule__TermDefinition__Group__10__Impl"
    // InternalCIMIDSL.g:5837:1: rule__TermDefinition__Group__10__Impl : ( '>' ) ;
    public final void rule__TermDefinition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5841:1: ( ( '>' ) )
            // InternalCIMIDSL.g:5842:1: ( '>' )
            {
            // InternalCIMIDSL.g:5842:1: ( '>' )
            // InternalCIMIDSL.g:5843:2: '>'
            {
             before(grammarAccess.getTermDefinitionAccess().getGreaterThanSignKeyword_10()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionAccess().getGreaterThanSignKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__10__Impl"


    // $ANTLR start "rule__TermDefinition__Group__11"
    // InternalCIMIDSL.g:5852:1: rule__TermDefinition__Group__11 : rule__TermDefinition__Group__11__Impl rule__TermDefinition__Group__12 ;
    public final void rule__TermDefinition__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5856:1: ( rule__TermDefinition__Group__11__Impl rule__TermDefinition__Group__12 )
            // InternalCIMIDSL.g:5857:2: rule__TermDefinition__Group__11__Impl rule__TermDefinition__Group__12
            {
            pushFollow(FOLLOW_53);
            rule__TermDefinition__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinition__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__11"


    // $ANTLR start "rule__TermDefinition__Group__11__Impl"
    // InternalCIMIDSL.g:5864:1: rule__TermDefinition__Group__11__Impl : ( '\\r' ) ;
    public final void rule__TermDefinition__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5868:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:5869:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:5869:1: ( '\\r' )
            // InternalCIMIDSL.g:5870:2: '\\r'
            {
             before(grammarAccess.getTermDefinitionAccess().getControl000dKeyword_11()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionAccess().getControl000dKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__11__Impl"


    // $ANTLR start "rule__TermDefinition__Group__12"
    // InternalCIMIDSL.g:5879:1: rule__TermDefinition__Group__12 : rule__TermDefinition__Group__12__Impl rule__TermDefinition__Group__13 ;
    public final void rule__TermDefinition__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5883:1: ( rule__TermDefinition__Group__12__Impl rule__TermDefinition__Group__13 )
            // InternalCIMIDSL.g:5884:2: rule__TermDefinition__Group__12__Impl rule__TermDefinition__Group__13
            {
            pushFollow(FOLLOW_20);
            rule__TermDefinition__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinition__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__12"


    // $ANTLR start "rule__TermDefinition__Group__12__Impl"
    // InternalCIMIDSL.g:5891:1: rule__TermDefinition__Group__12__Impl : ( 'description' ) ;
    public final void rule__TermDefinition__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5895:1: ( ( 'description' ) )
            // InternalCIMIDSL.g:5896:1: ( 'description' )
            {
            // InternalCIMIDSL.g:5896:1: ( 'description' )
            // InternalCIMIDSL.g:5897:2: 'description'
            {
             before(grammarAccess.getTermDefinitionAccess().getDescriptionKeyword_12()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionAccess().getDescriptionKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__12__Impl"


    // $ANTLR start "rule__TermDefinition__Group__13"
    // InternalCIMIDSL.g:5906:1: rule__TermDefinition__Group__13 : rule__TermDefinition__Group__13__Impl rule__TermDefinition__Group__14 ;
    public final void rule__TermDefinition__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5910:1: ( rule__TermDefinition__Group__13__Impl rule__TermDefinition__Group__14 )
            // InternalCIMIDSL.g:5911:2: rule__TermDefinition__Group__13__Impl rule__TermDefinition__Group__14
            {
            pushFollow(FOLLOW_21);
            rule__TermDefinition__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinition__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__13"


    // $ANTLR start "rule__TermDefinition__Group__13__Impl"
    // InternalCIMIDSL.g:5918:1: rule__TermDefinition__Group__13__Impl : ( '=' ) ;
    public final void rule__TermDefinition__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5922:1: ( ( '=' ) )
            // InternalCIMIDSL.g:5923:1: ( '=' )
            {
            // InternalCIMIDSL.g:5923:1: ( '=' )
            // InternalCIMIDSL.g:5924:2: '='
            {
             before(grammarAccess.getTermDefinitionAccess().getEqualsSignKeyword_13()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionAccess().getEqualsSignKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__13__Impl"


    // $ANTLR start "rule__TermDefinition__Group__14"
    // InternalCIMIDSL.g:5933:1: rule__TermDefinition__Group__14 : rule__TermDefinition__Group__14__Impl rule__TermDefinition__Group__15 ;
    public final void rule__TermDefinition__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5937:1: ( rule__TermDefinition__Group__14__Impl rule__TermDefinition__Group__15 )
            // InternalCIMIDSL.g:5938:2: rule__TermDefinition__Group__14__Impl rule__TermDefinition__Group__15
            {
            pushFollow(FOLLOW_7);
            rule__TermDefinition__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinition__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__14"


    // $ANTLR start "rule__TermDefinition__Group__14__Impl"
    // InternalCIMIDSL.g:5945:1: rule__TermDefinition__Group__14__Impl : ( '<' ) ;
    public final void rule__TermDefinition__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5949:1: ( ( '<' ) )
            // InternalCIMIDSL.g:5950:1: ( '<' )
            {
            // InternalCIMIDSL.g:5950:1: ( '<' )
            // InternalCIMIDSL.g:5951:2: '<'
            {
             before(grammarAccess.getTermDefinitionAccess().getLessThanSignKeyword_14()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionAccess().getLessThanSignKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__14__Impl"


    // $ANTLR start "rule__TermDefinition__Group__15"
    // InternalCIMIDSL.g:5960:1: rule__TermDefinition__Group__15 : rule__TermDefinition__Group__15__Impl rule__TermDefinition__Group__16 ;
    public final void rule__TermDefinition__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5964:1: ( rule__TermDefinition__Group__15__Impl rule__TermDefinition__Group__16 )
            // InternalCIMIDSL.g:5965:2: rule__TermDefinition__Group__15__Impl rule__TermDefinition__Group__16
            {
            pushFollow(FOLLOW_23);
            rule__TermDefinition__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinition__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__15"


    // $ANTLR start "rule__TermDefinition__Group__15__Impl"
    // InternalCIMIDSL.g:5972:1: rule__TermDefinition__Group__15__Impl : ( ( rule__TermDefinition__DescriptionAssignment_15 ) ) ;
    public final void rule__TermDefinition__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5976:1: ( ( ( rule__TermDefinition__DescriptionAssignment_15 ) ) )
            // InternalCIMIDSL.g:5977:1: ( ( rule__TermDefinition__DescriptionAssignment_15 ) )
            {
            // InternalCIMIDSL.g:5977:1: ( ( rule__TermDefinition__DescriptionAssignment_15 ) )
            // InternalCIMIDSL.g:5978:2: ( rule__TermDefinition__DescriptionAssignment_15 )
            {
             before(grammarAccess.getTermDefinitionAccess().getDescriptionAssignment_15()); 
            // InternalCIMIDSL.g:5979:2: ( rule__TermDefinition__DescriptionAssignment_15 )
            // InternalCIMIDSL.g:5979:3: rule__TermDefinition__DescriptionAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__TermDefinition__DescriptionAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getTermDefinitionAccess().getDescriptionAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__15__Impl"


    // $ANTLR start "rule__TermDefinition__Group__16"
    // InternalCIMIDSL.g:5987:1: rule__TermDefinition__Group__16 : rule__TermDefinition__Group__16__Impl rule__TermDefinition__Group__17 ;
    public final void rule__TermDefinition__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:5991:1: ( rule__TermDefinition__Group__16__Impl rule__TermDefinition__Group__17 )
            // InternalCIMIDSL.g:5992:2: rule__TermDefinition__Group__16__Impl rule__TermDefinition__Group__17
            {
            pushFollow(FOLLOW_12);
            rule__TermDefinition__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinition__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__16"


    // $ANTLR start "rule__TermDefinition__Group__16__Impl"
    // InternalCIMIDSL.g:5999:1: rule__TermDefinition__Group__16__Impl : ( '>' ) ;
    public final void rule__TermDefinition__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6003:1: ( ( '>' ) )
            // InternalCIMIDSL.g:6004:1: ( '>' )
            {
            // InternalCIMIDSL.g:6004:1: ( '>' )
            // InternalCIMIDSL.g:6005:2: '>'
            {
             before(grammarAccess.getTermDefinitionAccess().getGreaterThanSignKeyword_16()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionAccess().getGreaterThanSignKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__16__Impl"


    // $ANTLR start "rule__TermDefinition__Group__17"
    // InternalCIMIDSL.g:6014:1: rule__TermDefinition__Group__17 : rule__TermDefinition__Group__17__Impl rule__TermDefinition__Group__18 ;
    public final void rule__TermDefinition__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6018:1: ( rule__TermDefinition__Group__17__Impl rule__TermDefinition__Group__18 )
            // InternalCIMIDSL.g:6019:2: rule__TermDefinition__Group__17__Impl rule__TermDefinition__Group__18
            {
            pushFollow(FOLLOW_23);
            rule__TermDefinition__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinition__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__17"


    // $ANTLR start "rule__TermDefinition__Group__17__Impl"
    // InternalCIMIDSL.g:6026:1: rule__TermDefinition__Group__17__Impl : ( '\\r' ) ;
    public final void rule__TermDefinition__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6030:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:6031:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:6031:1: ( '\\r' )
            // InternalCIMIDSL.g:6032:2: '\\r'
            {
             before(grammarAccess.getTermDefinitionAccess().getControl000dKeyword_17()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionAccess().getControl000dKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__17__Impl"


    // $ANTLR start "rule__TermDefinition__Group__18"
    // InternalCIMIDSL.g:6041:1: rule__TermDefinition__Group__18 : rule__TermDefinition__Group__18__Impl rule__TermDefinition__Group__19 ;
    public final void rule__TermDefinition__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6045:1: ( rule__TermDefinition__Group__18__Impl rule__TermDefinition__Group__19 )
            // InternalCIMIDSL.g:6046:2: rule__TermDefinition__Group__18__Impl rule__TermDefinition__Group__19
            {
            pushFollow(FOLLOW_12);
            rule__TermDefinition__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermDefinition__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__18"


    // $ANTLR start "rule__TermDefinition__Group__18__Impl"
    // InternalCIMIDSL.g:6053:1: rule__TermDefinition__Group__18__Impl : ( '>' ) ;
    public final void rule__TermDefinition__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6057:1: ( ( '>' ) )
            // InternalCIMIDSL.g:6058:1: ( '>' )
            {
            // InternalCIMIDSL.g:6058:1: ( '>' )
            // InternalCIMIDSL.g:6059:2: '>'
            {
             before(grammarAccess.getTermDefinitionAccess().getGreaterThanSignKeyword_18()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionAccess().getGreaterThanSignKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__18__Impl"


    // $ANTLR start "rule__TermDefinition__Group__19"
    // InternalCIMIDSL.g:6068:1: rule__TermDefinition__Group__19 : rule__TermDefinition__Group__19__Impl ;
    public final void rule__TermDefinition__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6072:1: ( rule__TermDefinition__Group__19__Impl )
            // InternalCIMIDSL.g:6073:2: rule__TermDefinition__Group__19__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TermDefinition__Group__19__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__19"


    // $ANTLR start "rule__TermDefinition__Group__19__Impl"
    // InternalCIMIDSL.g:6079:1: rule__TermDefinition__Group__19__Impl : ( '\\r' ) ;
    public final void rule__TermDefinition__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6083:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:6084:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:6084:1: ( '\\r' )
            // InternalCIMIDSL.g:6085:2: '\\r'
            {
             before(grammarAccess.getTermDefinitionAccess().getControl000dKeyword_19()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionAccess().getControl000dKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__Group__19__Impl"


    // $ANTLR start "rule__TermBinding__Group__0"
    // InternalCIMIDSL.g:6095:1: rule__TermBinding__Group__0 : rule__TermBinding__Group__0__Impl rule__TermBinding__Group__1 ;
    public final void rule__TermBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6099:1: ( rule__TermBinding__Group__0__Impl rule__TermBinding__Group__1 )
            // InternalCIMIDSL.g:6100:2: rule__TermBinding__Group__0__Impl rule__TermBinding__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__TermBinding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermBinding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBinding__Group__0"


    // $ANTLR start "rule__TermBinding__Group__0__Impl"
    // InternalCIMIDSL.g:6107:1: rule__TermBinding__Group__0__Impl : ( '[' ) ;
    public final void rule__TermBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6111:1: ( ( '[' ) )
            // InternalCIMIDSL.g:6112:1: ( '[' )
            {
            // InternalCIMIDSL.g:6112:1: ( '[' )
            // InternalCIMIDSL.g:6113:2: '['
            {
             before(grammarAccess.getTermBindingAccess().getLeftSquareBracketKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTermBindingAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBinding__Group__0__Impl"


    // $ANTLR start "rule__TermBinding__Group__1"
    // InternalCIMIDSL.g:6122:1: rule__TermBinding__Group__1 : rule__TermBinding__Group__1__Impl rule__TermBinding__Group__2 ;
    public final void rule__TermBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6126:1: ( rule__TermBinding__Group__1__Impl rule__TermBinding__Group__2 )
            // InternalCIMIDSL.g:6127:2: rule__TermBinding__Group__1__Impl rule__TermBinding__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__TermBinding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermBinding__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBinding__Group__1"


    // $ANTLR start "rule__TermBinding__Group__1__Impl"
    // InternalCIMIDSL.g:6134:1: rule__TermBinding__Group__1__Impl : ( ( rule__TermBinding__NameAssignment_1 ) ) ;
    public final void rule__TermBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6138:1: ( ( ( rule__TermBinding__NameAssignment_1 ) ) )
            // InternalCIMIDSL.g:6139:1: ( ( rule__TermBinding__NameAssignment_1 ) )
            {
            // InternalCIMIDSL.g:6139:1: ( ( rule__TermBinding__NameAssignment_1 ) )
            // InternalCIMIDSL.g:6140:2: ( rule__TermBinding__NameAssignment_1 )
            {
             before(grammarAccess.getTermBindingAccess().getNameAssignment_1()); 
            // InternalCIMIDSL.g:6141:2: ( rule__TermBinding__NameAssignment_1 )
            // InternalCIMIDSL.g:6141:3: rule__TermBinding__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TermBinding__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTermBindingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBinding__Group__1__Impl"


    // $ANTLR start "rule__TermBinding__Group__2"
    // InternalCIMIDSL.g:6149:1: rule__TermBinding__Group__2 : rule__TermBinding__Group__2__Impl rule__TermBinding__Group__3 ;
    public final void rule__TermBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6153:1: ( rule__TermBinding__Group__2__Impl rule__TermBinding__Group__3 )
            // InternalCIMIDSL.g:6154:2: rule__TermBinding__Group__2__Impl rule__TermBinding__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__TermBinding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermBinding__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBinding__Group__2"


    // $ANTLR start "rule__TermBinding__Group__2__Impl"
    // InternalCIMIDSL.g:6161:1: rule__TermBinding__Group__2__Impl : ( ']' ) ;
    public final void rule__TermBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6165:1: ( ( ']' ) )
            // InternalCIMIDSL.g:6166:1: ( ']' )
            {
            // InternalCIMIDSL.g:6166:1: ( ']' )
            // InternalCIMIDSL.g:6167:2: ']'
            {
             before(grammarAccess.getTermBindingAccess().getRightSquareBracketKeyword_2()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getTermBindingAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBinding__Group__2__Impl"


    // $ANTLR start "rule__TermBinding__Group__3"
    // InternalCIMIDSL.g:6176:1: rule__TermBinding__Group__3 : rule__TermBinding__Group__3__Impl rule__TermBinding__Group__4 ;
    public final void rule__TermBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6180:1: ( rule__TermBinding__Group__3__Impl rule__TermBinding__Group__4 )
            // InternalCIMIDSL.g:6181:2: rule__TermBinding__Group__3__Impl rule__TermBinding__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__TermBinding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermBinding__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBinding__Group__3"


    // $ANTLR start "rule__TermBinding__Group__3__Impl"
    // InternalCIMIDSL.g:6188:1: rule__TermBinding__Group__3__Impl : ( '=' ) ;
    public final void rule__TermBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6192:1: ( ( '=' ) )
            // InternalCIMIDSL.g:6193:1: ( '=' )
            {
            // InternalCIMIDSL.g:6193:1: ( '=' )
            // InternalCIMIDSL.g:6194:2: '='
            {
             before(grammarAccess.getTermBindingAccess().getEqualsSignKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTermBindingAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBinding__Group__3__Impl"


    // $ANTLR start "rule__TermBinding__Group__4"
    // InternalCIMIDSL.g:6203:1: rule__TermBinding__Group__4 : rule__TermBinding__Group__4__Impl rule__TermBinding__Group__5 ;
    public final void rule__TermBinding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6207:1: ( rule__TermBinding__Group__4__Impl rule__TermBinding__Group__5 )
            // InternalCIMIDSL.g:6208:2: rule__TermBinding__Group__4__Impl rule__TermBinding__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__TermBinding__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermBinding__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBinding__Group__4"


    // $ANTLR start "rule__TermBinding__Group__4__Impl"
    // InternalCIMIDSL.g:6215:1: rule__TermBinding__Group__4__Impl : ( '<' ) ;
    public final void rule__TermBinding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6219:1: ( ( '<' ) )
            // InternalCIMIDSL.g:6220:1: ( '<' )
            {
            // InternalCIMIDSL.g:6220:1: ( '<' )
            // InternalCIMIDSL.g:6221:2: '<'
            {
             before(grammarAccess.getTermBindingAccess().getLessThanSignKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTermBindingAccess().getLessThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBinding__Group__4__Impl"


    // $ANTLR start "rule__TermBinding__Group__5"
    // InternalCIMIDSL.g:6230:1: rule__TermBinding__Group__5 : rule__TermBinding__Group__5__Impl rule__TermBinding__Group__6 ;
    public final void rule__TermBinding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6234:1: ( rule__TermBinding__Group__5__Impl rule__TermBinding__Group__6 )
            // InternalCIMIDSL.g:6235:2: rule__TermBinding__Group__5__Impl rule__TermBinding__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__TermBinding__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermBinding__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBinding__Group__5"


    // $ANTLR start "rule__TermBinding__Group__5__Impl"
    // InternalCIMIDSL.g:6242:1: rule__TermBinding__Group__5__Impl : ( ( rule__TermBinding__BindingAssignment_5 ) ) ;
    public final void rule__TermBinding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6246:1: ( ( ( rule__TermBinding__BindingAssignment_5 ) ) )
            // InternalCIMIDSL.g:6247:1: ( ( rule__TermBinding__BindingAssignment_5 ) )
            {
            // InternalCIMIDSL.g:6247:1: ( ( rule__TermBinding__BindingAssignment_5 ) )
            // InternalCIMIDSL.g:6248:2: ( rule__TermBinding__BindingAssignment_5 )
            {
             before(grammarAccess.getTermBindingAccess().getBindingAssignment_5()); 
            // InternalCIMIDSL.g:6249:2: ( rule__TermBinding__BindingAssignment_5 )
            // InternalCIMIDSL.g:6249:3: rule__TermBinding__BindingAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__TermBinding__BindingAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTermBindingAccess().getBindingAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBinding__Group__5__Impl"


    // $ANTLR start "rule__TermBinding__Group__6"
    // InternalCIMIDSL.g:6257:1: rule__TermBinding__Group__6 : rule__TermBinding__Group__6__Impl rule__TermBinding__Group__7 ;
    public final void rule__TermBinding__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6261:1: ( rule__TermBinding__Group__6__Impl rule__TermBinding__Group__7 )
            // InternalCIMIDSL.g:6262:2: rule__TermBinding__Group__6__Impl rule__TermBinding__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__TermBinding__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TermBinding__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBinding__Group__6"


    // $ANTLR start "rule__TermBinding__Group__6__Impl"
    // InternalCIMIDSL.g:6269:1: rule__TermBinding__Group__6__Impl : ( '>' ) ;
    public final void rule__TermBinding__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6273:1: ( ( '>' ) )
            // InternalCIMIDSL.g:6274:1: ( '>' )
            {
            // InternalCIMIDSL.g:6274:1: ( '>' )
            // InternalCIMIDSL.g:6275:2: '>'
            {
             before(grammarAccess.getTermBindingAccess().getGreaterThanSignKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTermBindingAccess().getGreaterThanSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBinding__Group__6__Impl"


    // $ANTLR start "rule__TermBinding__Group__7"
    // InternalCIMIDSL.g:6284:1: rule__TermBinding__Group__7 : rule__TermBinding__Group__7__Impl ;
    public final void rule__TermBinding__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6288:1: ( rule__TermBinding__Group__7__Impl )
            // InternalCIMIDSL.g:6289:2: rule__TermBinding__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TermBinding__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBinding__Group__7"


    // $ANTLR start "rule__TermBinding__Group__7__Impl"
    // InternalCIMIDSL.g:6295:1: rule__TermBinding__Group__7__Impl : ( '\\r' ) ;
    public final void rule__TermBinding__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6299:1: ( ( '\\r' ) )
            // InternalCIMIDSL.g:6300:1: ( '\\r' )
            {
            // InternalCIMIDSL.g:6300:1: ( '\\r' )
            // InternalCIMIDSL.g:6301:2: '\\r'
            {
             before(grammarAccess.getTermBindingAccess().getControl000dKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTermBindingAccess().getControl000dKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBinding__Group__7__Impl"


    // $ANTLR start "rule__ArchetypeModel__ElementsAssignment"
    // InternalCIMIDSL.g:6311:1: rule__ArchetypeModel__ElementsAssignment : ( ruleArchetype ) ;
    public final void rule__ArchetypeModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6315:1: ( ( ruleArchetype ) )
            // InternalCIMIDSL.g:6316:2: ( ruleArchetype )
            {
            // InternalCIMIDSL.g:6316:2: ( ruleArchetype )
            // InternalCIMIDSL.g:6317:3: ruleArchetype
            {
             before(grammarAccess.getArchetypeModelAccess().getElementsArchetypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleArchetype();

            state._fsp--;

             after(grammarAccess.getArchetypeModelAccess().getElementsArchetypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchetypeModel__ElementsAssignment"


    // $ANTLR start "rule__Archetype__Adl_versionAssignment_3"
    // InternalCIMIDSL.g:6326:1: rule__Archetype__Adl_versionAssignment_3 : ( RULE_MYSTRING ) ;
    public final void rule__Archetype__Adl_versionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6330:1: ( ( RULE_MYSTRING ) )
            // InternalCIMIDSL.g:6331:2: ( RULE_MYSTRING )
            {
            // InternalCIMIDSL.g:6331:2: ( RULE_MYSTRING )
            // InternalCIMIDSL.g:6332:3: RULE_MYSTRING
            {
             before(grammarAccess.getArchetypeAccess().getAdl_versionMYSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_MYSTRING,FOLLOW_2); 
             after(grammarAccess.getArchetypeAccess().getAdl_versionMYSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Adl_versionAssignment_3"


    // $ANTLR start "rule__Archetype__Rm_releaseAssignment_6"
    // InternalCIMIDSL.g:6341:1: rule__Archetype__Rm_releaseAssignment_6 : ( RULE_MYSTRING ) ;
    public final void rule__Archetype__Rm_releaseAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6345:1: ( ( RULE_MYSTRING ) )
            // InternalCIMIDSL.g:6346:2: ( RULE_MYSTRING )
            {
            // InternalCIMIDSL.g:6346:2: ( RULE_MYSTRING )
            // InternalCIMIDSL.g:6347:3: RULE_MYSTRING
            {
             before(grammarAccess.getArchetypeAccess().getRm_releaseMYSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_MYSTRING,FOLLOW_2); 
             after(grammarAccess.getArchetypeAccess().getRm_releaseMYSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__Rm_releaseAssignment_6"


    // $ANTLR start "rule__Archetype__NameAssignment_10"
    // InternalCIMIDSL.g:6356:1: rule__Archetype__NameAssignment_10 : ( RULE_MYSTRING ) ;
    public final void rule__Archetype__NameAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6360:1: ( ( RULE_MYSTRING ) )
            // InternalCIMIDSL.g:6361:2: ( RULE_MYSTRING )
            {
            // InternalCIMIDSL.g:6361:2: ( RULE_MYSTRING )
            // InternalCIMIDSL.g:6362:3: RULE_MYSTRING
            {
             before(grammarAccess.getArchetypeAccess().getNameMYSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_MYSTRING,FOLLOW_2); 
             after(grammarAccess.getArchetypeAccess().getNameMYSTRINGTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__NameAssignment_10"


    // $ANTLR start "rule__Archetype__LanguageAssignment_14"
    // InternalCIMIDSL.g:6371:1: rule__Archetype__LanguageAssignment_14 : ( ruleLanguge ) ;
    public final void rule__Archetype__LanguageAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6375:1: ( ( ruleLanguge ) )
            // InternalCIMIDSL.g:6376:2: ( ruleLanguge )
            {
            // InternalCIMIDSL.g:6376:2: ( ruleLanguge )
            // InternalCIMIDSL.g:6377:3: ruleLanguge
            {
             before(grammarAccess.getArchetypeAccess().getLanguageLangugeParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleLanguge();

            state._fsp--;

             after(grammarAccess.getArchetypeAccess().getLanguageLangugeParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__LanguageAssignment_14"


    // $ANTLR start "rule__Archetype__DescriptionAssignment_18"
    // InternalCIMIDSL.g:6386:1: rule__Archetype__DescriptionAssignment_18 : ( ruleDescription ) ;
    public final void rule__Archetype__DescriptionAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6390:1: ( ( ruleDescription ) )
            // InternalCIMIDSL.g:6391:2: ( ruleDescription )
            {
            // InternalCIMIDSL.g:6391:2: ( ruleDescription )
            // InternalCIMIDSL.g:6392:3: ruleDescription
            {
             before(grammarAccess.getArchetypeAccess().getDescriptionDescriptionParserRuleCall_18_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getArchetypeAccess().getDescriptionDescriptionParserRuleCall_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__DescriptionAssignment_18"


    // $ANTLR start "rule__Archetype__DefinitionAssignment_22"
    // InternalCIMIDSL.g:6401:1: rule__Archetype__DefinitionAssignment_22 : ( ruleMatches ) ;
    public final void rule__Archetype__DefinitionAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6405:1: ( ( ruleMatches ) )
            // InternalCIMIDSL.g:6406:2: ( ruleMatches )
            {
            // InternalCIMIDSL.g:6406:2: ( ruleMatches )
            // InternalCIMIDSL.g:6407:3: ruleMatches
            {
             before(grammarAccess.getArchetypeAccess().getDefinitionMatchesParserRuleCall_22_0()); 
            pushFollow(FOLLOW_2);
            ruleMatches();

            state._fsp--;

             after(grammarAccess.getArchetypeAccess().getDefinitionMatchesParserRuleCall_22_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__DefinitionAssignment_22"


    // $ANTLR start "rule__Archetype__TerminologyAssignment_26"
    // InternalCIMIDSL.g:6416:1: rule__Archetype__TerminologyAssignment_26 : ( ruleTerminology ) ;
    public final void rule__Archetype__TerminologyAssignment_26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6420:1: ( ( ruleTerminology ) )
            // InternalCIMIDSL.g:6421:2: ( ruleTerminology )
            {
            // InternalCIMIDSL.g:6421:2: ( ruleTerminology )
            // InternalCIMIDSL.g:6422:3: ruleTerminology
            {
             before(grammarAccess.getArchetypeAccess().getTerminologyTerminologyParserRuleCall_26_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminology();

            state._fsp--;

             after(grammarAccess.getArchetypeAccess().getTerminologyTerminologyParserRuleCall_26_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Archetype__TerminologyAssignment_26"


    // $ANTLR start "rule__Description__OriginalAuthorAssignment_4"
    // InternalCIMIDSL.g:6431:1: rule__Description__OriginalAuthorAssignment_4 : ( ruleOriginalAuthor ) ;
    public final void rule__Description__OriginalAuthorAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6435:1: ( ( ruleOriginalAuthor ) )
            // InternalCIMIDSL.g:6436:2: ( ruleOriginalAuthor )
            {
            // InternalCIMIDSL.g:6436:2: ( ruleOriginalAuthor )
            // InternalCIMIDSL.g:6437:3: ruleOriginalAuthor
            {
             before(grammarAccess.getDescriptionAccess().getOriginalAuthorOriginalAuthorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOriginalAuthor();

            state._fsp--;

             after(grammarAccess.getDescriptionAccess().getOriginalAuthorOriginalAuthorParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__OriginalAuthorAssignment_4"


    // $ANTLR start "rule__Description__DetailsAssignment_11"
    // InternalCIMIDSL.g:6446:1: rule__Description__DetailsAssignment_11 : ( ruleDetails ) ;
    public final void rule__Description__DetailsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6450:1: ( ( ruleDetails ) )
            // InternalCIMIDSL.g:6451:2: ( ruleDetails )
            {
            // InternalCIMIDSL.g:6451:2: ( ruleDetails )
            // InternalCIMIDSL.g:6452:3: ruleDetails
            {
             before(grammarAccess.getDescriptionAccess().getDetailsDetailsParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleDetails();

            state._fsp--;

             after(grammarAccess.getDescriptionAccess().getDetailsDetailsParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__DetailsAssignment_11"


    // $ANTLR start "rule__Details__NameAssignment_1"
    // InternalCIMIDSL.g:6461:1: rule__Details__NameAssignment_1 : ( RULE_MYSTRING ) ;
    public final void rule__Details__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6465:1: ( ( RULE_MYSTRING ) )
            // InternalCIMIDSL.g:6466:2: ( RULE_MYSTRING )
            {
            // InternalCIMIDSL.g:6466:2: ( RULE_MYSTRING )
            // InternalCIMIDSL.g:6467:3: RULE_MYSTRING
            {
             before(grammarAccess.getDetailsAccess().getNameMYSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_MYSTRING,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getNameMYSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__NameAssignment_1"


    // $ANTLR start "rule__Details__LanguageAssignment_9"
    // InternalCIMIDSL.g:6476:1: rule__Details__LanguageAssignment_9 : ( RULE_MYSTRING ) ;
    public final void rule__Details__LanguageAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6480:1: ( ( RULE_MYSTRING ) )
            // InternalCIMIDSL.g:6481:2: ( RULE_MYSTRING )
            {
            // InternalCIMIDSL.g:6481:2: ( RULE_MYSTRING )
            // InternalCIMIDSL.g:6482:3: RULE_MYSTRING
            {
             before(grammarAccess.getDetailsAccess().getLanguageMYSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_MYSTRING,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getLanguageMYSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__LanguageAssignment_9"


    // $ANTLR start "rule__Details__UseAssignment_15"
    // InternalCIMIDSL.g:6491:1: rule__Details__UseAssignment_15 : ( RULE_STRING ) ;
    public final void rule__Details__UseAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6495:1: ( ( RULE_STRING ) )
            // InternalCIMIDSL.g:6496:2: ( RULE_STRING )
            {
            // InternalCIMIDSL.g:6496:2: ( RULE_STRING )
            // InternalCIMIDSL.g:6497:3: RULE_STRING
            {
             before(grammarAccess.getDetailsAccess().getUseSTRINGTerminalRuleCall_15_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getUseSTRINGTerminalRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__UseAssignment_15"


    // $ANTLR start "rule__Details__CopyrightAssignment_21"
    // InternalCIMIDSL.g:6506:1: rule__Details__CopyrightAssignment_21 : ( RULE_STRING ) ;
    public final void rule__Details__CopyrightAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6510:1: ( ( RULE_STRING ) )
            // InternalCIMIDSL.g:6511:2: ( RULE_STRING )
            {
            // InternalCIMIDSL.g:6511:2: ( RULE_STRING )
            // InternalCIMIDSL.g:6512:3: RULE_STRING
            {
             before(grammarAccess.getDetailsAccess().getCopyrightSTRINGTerminalRuleCall_21_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDetailsAccess().getCopyrightSTRINGTerminalRuleCall_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__CopyrightAssignment_21"


    // $ANTLR start "rule__Details__Other_detailsAssignment_27"
    // InternalCIMIDSL.g:6521:1: rule__Details__Other_detailsAssignment_27 : ( ruleOtherDetails ) ;
    public final void rule__Details__Other_detailsAssignment_27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6525:1: ( ( ruleOtherDetails ) )
            // InternalCIMIDSL.g:6526:2: ( ruleOtherDetails )
            {
            // InternalCIMIDSL.g:6526:2: ( ruleOtherDetails )
            // InternalCIMIDSL.g:6527:3: ruleOtherDetails
            {
             before(grammarAccess.getDetailsAccess().getOther_detailsOtherDetailsParserRuleCall_27_0()); 
            pushFollow(FOLLOW_2);
            ruleOtherDetails();

            state._fsp--;

             after(grammarAccess.getDetailsAccess().getOther_detailsOtherDetailsParserRuleCall_27_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Details__Other_detailsAssignment_27"


    // $ANTLR start "rule__OtherDetails__Lifecycle_stateAssignment_3"
    // InternalCIMIDSL.g:6536:1: rule__OtherDetails__Lifecycle_stateAssignment_3 : ( RULE_STRING ) ;
    public final void rule__OtherDetails__Lifecycle_stateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6540:1: ( ( RULE_STRING ) )
            // InternalCIMIDSL.g:6541:2: ( RULE_STRING )
            {
            // InternalCIMIDSL.g:6541:2: ( RULE_STRING )
            // InternalCIMIDSL.g:6542:3: RULE_STRING
            {
             before(grammarAccess.getOtherDetailsAccess().getLifecycle_stateSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getLifecycle_stateSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Lifecycle_stateAssignment_3"


    // $ANTLR start "rule__OtherDetails__Custodian_namespaceAssignment_9"
    // InternalCIMIDSL.g:6551:1: rule__OtherDetails__Custodian_namespaceAssignment_9 : ( RULE_STRING ) ;
    public final void rule__OtherDetails__Custodian_namespaceAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6555:1: ( ( RULE_STRING ) )
            // InternalCIMIDSL.g:6556:2: ( RULE_STRING )
            {
            // InternalCIMIDSL.g:6556:2: ( RULE_STRING )
            // InternalCIMIDSL.g:6557:3: RULE_STRING
            {
             before(grammarAccess.getOtherDetailsAccess().getCustodian_namespaceSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getCustodian_namespaceSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Custodian_namespaceAssignment_9"


    // $ANTLR start "rule__OtherDetails__Custodian_organizationAssignment_15"
    // InternalCIMIDSL.g:6566:1: rule__OtherDetails__Custodian_organizationAssignment_15 : ( RULE_STRING ) ;
    public final void rule__OtherDetails__Custodian_organizationAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6570:1: ( ( RULE_STRING ) )
            // InternalCIMIDSL.g:6571:2: ( RULE_STRING )
            {
            // InternalCIMIDSL.g:6571:2: ( RULE_STRING )
            // InternalCIMIDSL.g:6572:3: RULE_STRING
            {
             before(grammarAccess.getOtherDetailsAccess().getCustodian_organizationSTRINGTerminalRuleCall_15_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getCustodian_organizationSTRINGTerminalRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Custodian_organizationAssignment_15"


    // $ANTLR start "rule__OtherDetails__LicenseAssignment_21"
    // InternalCIMIDSL.g:6581:1: rule__OtherDetails__LicenseAssignment_21 : ( RULE_STRING ) ;
    public final void rule__OtherDetails__LicenseAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6585:1: ( ( RULE_STRING ) )
            // InternalCIMIDSL.g:6586:2: ( RULE_STRING )
            {
            // InternalCIMIDSL.g:6586:2: ( RULE_STRING )
            // InternalCIMIDSL.g:6587:3: RULE_STRING
            {
             before(grammarAccess.getOtherDetailsAccess().getLicenseSTRINGTerminalRuleCall_21_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getLicenseSTRINGTerminalRuleCall_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__LicenseAssignment_21"


    // $ANTLR start "rule__OtherDetails__Ip_acknowledgement_loincAssignment_27"
    // InternalCIMIDSL.g:6596:1: rule__OtherDetails__Ip_acknowledgement_loincAssignment_27 : ( RULE_STRING ) ;
    public final void rule__OtherDetails__Ip_acknowledgement_loincAssignment_27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6600:1: ( ( RULE_STRING ) )
            // InternalCIMIDSL.g:6601:2: ( RULE_STRING )
            {
            // InternalCIMIDSL.g:6601:2: ( RULE_STRING )
            // InternalCIMIDSL.g:6602:3: RULE_STRING
            {
             before(grammarAccess.getOtherDetailsAccess().getIp_acknowledgement_loincSTRINGTerminalRuleCall_27_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getIp_acknowledgement_loincSTRINGTerminalRuleCall_27_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Ip_acknowledgement_loincAssignment_27"


    // $ANTLR start "rule__OtherDetails__Ip_acknowledgement_snomedAssignment_33"
    // InternalCIMIDSL.g:6611:1: rule__OtherDetails__Ip_acknowledgement_snomedAssignment_33 : ( RULE_STRING ) ;
    public final void rule__OtherDetails__Ip_acknowledgement_snomedAssignment_33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6615:1: ( ( RULE_STRING ) )
            // InternalCIMIDSL.g:6616:2: ( RULE_STRING )
            {
            // InternalCIMIDSL.g:6616:2: ( RULE_STRING )
            // InternalCIMIDSL.g:6617:3: RULE_STRING
            {
             before(grammarAccess.getOtherDetailsAccess().getIp_acknowledgement_snomedSTRINGTerminalRuleCall_33_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOtherDetailsAccess().getIp_acknowledgement_snomedSTRINGTerminalRuleCall_33_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherDetails__Ip_acknowledgement_snomedAssignment_33"


    // $ANTLR start "rule__OriginalAuthor__DateAssignment_3"
    // InternalCIMIDSL.g:6626:1: rule__OriginalAuthor__DateAssignment_3 : ( RULE_STRING ) ;
    public final void rule__OriginalAuthor__DateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6630:1: ( ( RULE_STRING ) )
            // InternalCIMIDSL.g:6631:2: ( RULE_STRING )
            {
            // InternalCIMIDSL.g:6631:2: ( RULE_STRING )
            // InternalCIMIDSL.g:6632:3: RULE_STRING
            {
             before(grammarAccess.getOriginalAuthorAccess().getDateSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOriginalAuthorAccess().getDateSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__DateAssignment_3"


    // $ANTLR start "rule__OriginalAuthor__OrganizationAssignment_9"
    // InternalCIMIDSL.g:6641:1: rule__OriginalAuthor__OrganizationAssignment_9 : ( RULE_STRING ) ;
    public final void rule__OriginalAuthor__OrganizationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6645:1: ( ( RULE_STRING ) )
            // InternalCIMIDSL.g:6646:2: ( RULE_STRING )
            {
            // InternalCIMIDSL.g:6646:2: ( RULE_STRING )
            // InternalCIMIDSL.g:6647:3: RULE_STRING
            {
             before(grammarAccess.getOriginalAuthorAccess().getOrganizationSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOriginalAuthorAccess().getOrganizationSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__OrganizationAssignment_9"


    // $ANTLR start "rule__OriginalAuthor__NameAssignment_15"
    // InternalCIMIDSL.g:6656:1: rule__OriginalAuthor__NameAssignment_15 : ( RULE_STRING ) ;
    public final void rule__OriginalAuthor__NameAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6660:1: ( ( RULE_STRING ) )
            // InternalCIMIDSL.g:6661:2: ( RULE_STRING )
            {
            // InternalCIMIDSL.g:6661:2: ( RULE_STRING )
            // InternalCIMIDSL.g:6662:3: RULE_STRING
            {
             before(grammarAccess.getOriginalAuthorAccess().getNameSTRINGTerminalRuleCall_15_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOriginalAuthorAccess().getNameSTRINGTerminalRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__NameAssignment_15"


    // $ANTLR start "rule__OriginalAuthor__EmailAssignment_21"
    // InternalCIMIDSL.g:6671:1: rule__OriginalAuthor__EmailAssignment_21 : ( RULE_STRING ) ;
    public final void rule__OriginalAuthor__EmailAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6675:1: ( ( RULE_STRING ) )
            // InternalCIMIDSL.g:6676:2: ( RULE_STRING )
            {
            // InternalCIMIDSL.g:6676:2: ( RULE_STRING )
            // InternalCIMIDSL.g:6677:3: RULE_STRING
            {
             before(grammarAccess.getOriginalAuthorAccess().getEmailSTRINGTerminalRuleCall_21_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOriginalAuthorAccess().getEmailSTRINGTerminalRuleCall_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OriginalAuthor__EmailAssignment_21"


    // $ANTLR start "rule__Languge__NameAssignment_3"
    // InternalCIMIDSL.g:6686:1: rule__Languge__NameAssignment_3 : ( RULE_MYSTRING ) ;
    public final void rule__Languge__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6690:1: ( ( RULE_MYSTRING ) )
            // InternalCIMIDSL.g:6691:2: ( RULE_MYSTRING )
            {
            // InternalCIMIDSL.g:6691:2: ( RULE_MYSTRING )
            // InternalCIMIDSL.g:6692:3: RULE_MYSTRING
            {
             before(grammarAccess.getLangugeAccess().getNameMYSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_MYSTRING,FOLLOW_2); 
             after(grammarAccess.getLangugeAccess().getNameMYSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Languge__NameAssignment_3"


    // $ANTLR start "rule__Matches__NameAssignment_0"
    // InternalCIMIDSL.g:6701:1: rule__Matches__NameAssignment_0 : ( RULE_MYSTRING ) ;
    public final void rule__Matches__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6705:1: ( ( RULE_MYSTRING ) )
            // InternalCIMIDSL.g:6706:2: ( RULE_MYSTRING )
            {
            // InternalCIMIDSL.g:6706:2: ( RULE_MYSTRING )
            // InternalCIMIDSL.g:6707:3: RULE_MYSTRING
            {
             before(grammarAccess.getMatchesAccess().getNameMYSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_MYSTRING,FOLLOW_2); 
             after(grammarAccess.getMatchesAccess().getNameMYSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__NameAssignment_0"


    // $ANTLR start "rule__Matches__DefinitionAssignment_1_1"
    // InternalCIMIDSL.g:6716:1: rule__Matches__DefinitionAssignment_1_1 : ( RULE_MYSTRING ) ;
    public final void rule__Matches__DefinitionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6720:1: ( ( RULE_MYSTRING ) )
            // InternalCIMIDSL.g:6721:2: ( RULE_MYSTRING )
            {
            // InternalCIMIDSL.g:6721:2: ( RULE_MYSTRING )
            // InternalCIMIDSL.g:6722:3: RULE_MYSTRING
            {
             before(grammarAccess.getMatchesAccess().getDefinitionMYSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_MYSTRING,FOLLOW_2); 
             after(grammarAccess.getMatchesAccess().getDefinitionMYSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__DefinitionAssignment_1_1"


    // $ANTLR start "rule__Matches__SubmatchAssignment_4_0"
    // InternalCIMIDSL.g:6731:1: rule__Matches__SubmatchAssignment_4_0 : ( ruleMatches ) ;
    public final void rule__Matches__SubmatchAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6735:1: ( ( ruleMatches ) )
            // InternalCIMIDSL.g:6736:2: ( ruleMatches )
            {
            // InternalCIMIDSL.g:6736:2: ( ruleMatches )
            // InternalCIMIDSL.g:6737:3: ruleMatches
            {
             before(grammarAccess.getMatchesAccess().getSubmatchMatchesParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMatches();

            state._fsp--;

             after(grammarAccess.getMatchesAccess().getSubmatchMatchesParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__SubmatchAssignment_4_0"


    // $ANTLR start "rule__Matches__ValueAssignment_4_1_0"
    // InternalCIMIDSL.g:6746:1: rule__Matches__ValueAssignment_4_1_0 : ( RULE_MYSTRING ) ;
    public final void rule__Matches__ValueAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6750:1: ( ( RULE_MYSTRING ) )
            // InternalCIMIDSL.g:6751:2: ( RULE_MYSTRING )
            {
            // InternalCIMIDSL.g:6751:2: ( RULE_MYSTRING )
            // InternalCIMIDSL.g:6752:3: RULE_MYSTRING
            {
             before(grammarAccess.getMatchesAccess().getValueMYSTRINGTerminalRuleCall_4_1_0_0()); 
            match(input,RULE_MYSTRING,FOLLOW_2); 
             after(grammarAccess.getMatchesAccess().getValueMYSTRINGTerminalRuleCall_4_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__ValueAssignment_4_1_0"


    // $ANTLR start "rule__Matches__ValueDefinitionAssignment_4_1_2"
    // InternalCIMIDSL.g:6761:1: rule__Matches__ValueDefinitionAssignment_4_1_2 : ( RULE_MYSTRING ) ;
    public final void rule__Matches__ValueDefinitionAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6765:1: ( ( RULE_MYSTRING ) )
            // InternalCIMIDSL.g:6766:2: ( RULE_MYSTRING )
            {
            // InternalCIMIDSL.g:6766:2: ( RULE_MYSTRING )
            // InternalCIMIDSL.g:6767:3: RULE_MYSTRING
            {
             before(grammarAccess.getMatchesAccess().getValueDefinitionMYSTRINGTerminalRuleCall_4_1_2_0()); 
            match(input,RULE_MYSTRING,FOLLOW_2); 
             after(grammarAccess.getMatchesAccess().getValueDefinitionMYSTRINGTerminalRuleCall_4_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matches__ValueDefinitionAssignment_4_1_2"


    // $ANTLR start "rule__Terminology__TermDefinitionAssignment_4"
    // InternalCIMIDSL.g:6776:1: rule__Terminology__TermDefinitionAssignment_4 : ( ruleTermDefinitions ) ;
    public final void rule__Terminology__TermDefinitionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6780:1: ( ( ruleTermDefinitions ) )
            // InternalCIMIDSL.g:6781:2: ( ruleTermDefinitions )
            {
            // InternalCIMIDSL.g:6781:2: ( ruleTermDefinitions )
            // InternalCIMIDSL.g:6782:3: ruleTermDefinitions
            {
             before(grammarAccess.getTerminologyAccess().getTermDefinitionTermDefinitionsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTermDefinitions();

            state._fsp--;

             after(grammarAccess.getTerminologyAccess().getTermDefinitionTermDefinitionsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__TermDefinitionAssignment_4"


    // $ANTLR start "rule__Terminology__TermBindingAssignment_12"
    // InternalCIMIDSL.g:6791:1: rule__Terminology__TermBindingAssignment_12 : ( ruleTermBindings ) ;
    public final void rule__Terminology__TermBindingAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6795:1: ( ( ruleTermBindings ) )
            // InternalCIMIDSL.g:6796:2: ( ruleTermBindings )
            {
            // InternalCIMIDSL.g:6796:2: ( ruleTermBindings )
            // InternalCIMIDSL.g:6797:3: ruleTermBindings
            {
             before(grammarAccess.getTerminologyAccess().getTermBindingTermBindingsParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleTermBindings();

            state._fsp--;

             after(grammarAccess.getTerminologyAccess().getTermBindingTermBindingsParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminology__TermBindingAssignment_12"


    // $ANTLR start "rule__TermDefinitions__NameAssignment_1"
    // InternalCIMIDSL.g:6806:1: rule__TermDefinitions__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TermDefinitions__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6810:1: ( ( RULE_STRING ) )
            // InternalCIMIDSL.g:6811:2: ( RULE_STRING )
            {
            // InternalCIMIDSL.g:6811:2: ( RULE_STRING )
            // InternalCIMIDSL.g:6812:3: RULE_STRING
            {
             before(grammarAccess.getTermDefinitionsAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionsAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinitions__NameAssignment_1"


    // $ANTLR start "rule__TermDefinitions__ElementsAssignment_7"
    // InternalCIMIDSL.g:6821:1: rule__TermDefinitions__ElementsAssignment_7 : ( ruleTermDefinition ) ;
    public final void rule__TermDefinitions__ElementsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6825:1: ( ( ruleTermDefinition ) )
            // InternalCIMIDSL.g:6826:2: ( ruleTermDefinition )
            {
            // InternalCIMIDSL.g:6826:2: ( ruleTermDefinition )
            // InternalCIMIDSL.g:6827:3: ruleTermDefinition
            {
             before(grammarAccess.getTermDefinitionsAccess().getElementsTermDefinitionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleTermDefinition();

            state._fsp--;

             after(grammarAccess.getTermDefinitionsAccess().getElementsTermDefinitionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinitions__ElementsAssignment_7"


    // $ANTLR start "rule__TermBindings__NameAssignment_1"
    // InternalCIMIDSL.g:6836:1: rule__TermBindings__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TermBindings__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6840:1: ( ( RULE_STRING ) )
            // InternalCIMIDSL.g:6841:2: ( RULE_STRING )
            {
            // InternalCIMIDSL.g:6841:2: ( RULE_STRING )
            // InternalCIMIDSL.g:6842:3: RULE_STRING
            {
             before(grammarAccess.getTermBindingsAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTermBindingsAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBindings__NameAssignment_1"


    // $ANTLR start "rule__TermBindings__ElementsAssignment_7"
    // InternalCIMIDSL.g:6851:1: rule__TermBindings__ElementsAssignment_7 : ( ruleTermBinding ) ;
    public final void rule__TermBindings__ElementsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6855:1: ( ( ruleTermBinding ) )
            // InternalCIMIDSL.g:6856:2: ( ruleTermBinding )
            {
            // InternalCIMIDSL.g:6856:2: ( ruleTermBinding )
            // InternalCIMIDSL.g:6857:3: ruleTermBinding
            {
             before(grammarAccess.getTermBindingsAccess().getElementsTermBindingParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleTermBinding();

            state._fsp--;

             after(grammarAccess.getTermBindingsAccess().getElementsTermBindingParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBindings__ElementsAssignment_7"


    // $ANTLR start "rule__TermDefinition__NameAssignment_1"
    // InternalCIMIDSL.g:6866:1: rule__TermDefinition__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TermDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6870:1: ( ( RULE_STRING ) )
            // InternalCIMIDSL.g:6871:2: ( RULE_STRING )
            {
            // InternalCIMIDSL.g:6871:2: ( RULE_STRING )
            // InternalCIMIDSL.g:6872:3: RULE_STRING
            {
             before(grammarAccess.getTermDefinitionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__NameAssignment_1"


    // $ANTLR start "rule__TermDefinition__TextAssignment_9"
    // InternalCIMIDSL.g:6881:1: rule__TermDefinition__TextAssignment_9 : ( RULE_MYSTRING ) ;
    public final void rule__TermDefinition__TextAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6885:1: ( ( RULE_MYSTRING ) )
            // InternalCIMIDSL.g:6886:2: ( RULE_MYSTRING )
            {
            // InternalCIMIDSL.g:6886:2: ( RULE_MYSTRING )
            // InternalCIMIDSL.g:6887:3: RULE_MYSTRING
            {
             before(grammarAccess.getTermDefinitionAccess().getTextMYSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_MYSTRING,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionAccess().getTextMYSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__TextAssignment_9"


    // $ANTLR start "rule__TermDefinition__DescriptionAssignment_15"
    // InternalCIMIDSL.g:6896:1: rule__TermDefinition__DescriptionAssignment_15 : ( RULE_MYSTRING ) ;
    public final void rule__TermDefinition__DescriptionAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6900:1: ( ( RULE_MYSTRING ) )
            // InternalCIMIDSL.g:6901:2: ( RULE_MYSTRING )
            {
            // InternalCIMIDSL.g:6901:2: ( RULE_MYSTRING )
            // InternalCIMIDSL.g:6902:3: RULE_MYSTRING
            {
             before(grammarAccess.getTermDefinitionAccess().getDescriptionMYSTRINGTerminalRuleCall_15_0()); 
            match(input,RULE_MYSTRING,FOLLOW_2); 
             after(grammarAccess.getTermDefinitionAccess().getDescriptionMYSTRINGTerminalRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermDefinition__DescriptionAssignment_15"


    // $ANTLR start "rule__TermBinding__NameAssignment_1"
    // InternalCIMIDSL.g:6911:1: rule__TermBinding__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TermBinding__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6915:1: ( ( RULE_STRING ) )
            // InternalCIMIDSL.g:6916:2: ( RULE_STRING )
            {
            // InternalCIMIDSL.g:6916:2: ( RULE_STRING )
            // InternalCIMIDSL.g:6917:3: RULE_STRING
            {
             before(grammarAccess.getTermBindingAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTermBindingAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBinding__NameAssignment_1"


    // $ANTLR start "rule__TermBinding__BindingAssignment_5"
    // InternalCIMIDSL.g:6926:1: rule__TermBinding__BindingAssignment_5 : ( RULE_MYSTRING ) ;
    public final void rule__TermBinding__BindingAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCIMIDSL.g:6930:1: ( ( RULE_MYSTRING ) )
            // InternalCIMIDSL.g:6931:2: ( RULE_MYSTRING )
            {
            // InternalCIMIDSL.g:6931:2: ( RULE_MYSTRING )
            // InternalCIMIDSL.g:6932:3: RULE_MYSTRING
            {
             before(grammarAccess.getTermBindingAccess().getBindingMYSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_MYSTRING,FOLLOW_2); 
             after(grammarAccess.getTermBindingAccess().getBindingMYSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TermBinding__BindingAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0008000000080000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0100000000000000L});

}