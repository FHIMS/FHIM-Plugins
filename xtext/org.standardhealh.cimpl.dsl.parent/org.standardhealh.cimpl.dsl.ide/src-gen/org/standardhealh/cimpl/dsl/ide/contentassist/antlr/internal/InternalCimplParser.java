package org.standardhealh.cimpl.dsl.ide.contentassist.antlr.internal;

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
import org.standardhealh.cimpl.dsl.services.CimplGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCimplParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_BASEDON", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "' '", "'/'", "';'", "','", "'!'", "'\\u00A7'", "'%'", "'&'", "'('", "')'", "'?'", "'*'", "'+'", "'.'", "'-'", "'|'", "'['", "']'", "'Description:'", "'\\r'", "'Grammar:\\tDataElement'", "'\\r\\n'", "'Namespace:'", "'Uses:'", "'CodeSystem:'", "'\\r\\nEntryElement:'", "'Concept:'", "'Based on:'", "'includes'", "'..'", "'\\r\\nElement:'", "'Value:'", "'CodeableConcept from'", "'Quantity with units'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
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
    public static final int RULE_BASEDON=6;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalCimplParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCimplParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCimplParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCimpl.g"; }


    	private CimplGrammarAccess grammarAccess;

    	public void setGrammarAccess(CimplGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProfile"
    // InternalCimpl.g:53:1: entryRuleProfile : ruleProfile EOF ;
    public final void entryRuleProfile() throws RecognitionException {
        try {
            // InternalCimpl.g:54:1: ( ruleProfile EOF )
            // InternalCimpl.g:55:1: ruleProfile EOF
            {
             before(grammarAccess.getProfileRule()); 
            pushFollow(FOLLOW_1);
            ruleProfile();

            state._fsp--;

             after(grammarAccess.getProfileRule()); 
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
    // $ANTLR end "entryRuleProfile"


    // $ANTLR start "ruleProfile"
    // InternalCimpl.g:62:1: ruleProfile : ( ( rule__Profile__Group__0 ) ) ;
    public final void ruleProfile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:66:2: ( ( ( rule__Profile__Group__0 ) ) )
            // InternalCimpl.g:67:2: ( ( rule__Profile__Group__0 ) )
            {
            // InternalCimpl.g:67:2: ( ( rule__Profile__Group__0 ) )
            // InternalCimpl.g:68:3: ( rule__Profile__Group__0 )
            {
             before(grammarAccess.getProfileAccess().getGroup()); 
            // InternalCimpl.g:69:3: ( rule__Profile__Group__0 )
            // InternalCimpl.g:69:4: rule__Profile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Profile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProfileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProfile"


    // $ANTLR start "entryRuleDescription"
    // InternalCimpl.g:78:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalCimpl.g:79:1: ( ruleDescription EOF )
            // InternalCimpl.g:80:1: ruleDescription EOF
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
    // InternalCimpl.g:87:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:91:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalCimpl.g:92:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalCimpl.g:92:2: ( ( rule__Description__Group__0 ) )
            // InternalCimpl.g:93:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalCimpl.g:94:3: ( rule__Description__Group__0 )
            // InternalCimpl.g:94:4: rule__Description__Group__0
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


    // $ANTLR start "entryRuleHeader"
    // InternalCimpl.g:103:1: entryRuleHeader : ruleHeader EOF ;
    public final void entryRuleHeader() throws RecognitionException {
        try {
            // InternalCimpl.g:104:1: ( ruleHeader EOF )
            // InternalCimpl.g:105:1: ruleHeader EOF
            {
             before(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getHeaderRule()); 
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
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalCimpl.g:112:1: ruleHeader : ( ( rule__Header__Group__0 ) ) ;
    public final void ruleHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:116:2: ( ( ( rule__Header__Group__0 ) ) )
            // InternalCimpl.g:117:2: ( ( rule__Header__Group__0 ) )
            {
            // InternalCimpl.g:117:2: ( ( rule__Header__Group__0 ) )
            // InternalCimpl.g:118:3: ( rule__Header__Group__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup()); 
            // InternalCimpl.g:119:3: ( rule__Header__Group__0 )
            // InternalCimpl.g:119:4: rule__Header__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleUsesStatement"
    // InternalCimpl.g:128:1: entryRuleUsesStatement : ruleUsesStatement EOF ;
    public final void entryRuleUsesStatement() throws RecognitionException {
        try {
            // InternalCimpl.g:129:1: ( ruleUsesStatement EOF )
            // InternalCimpl.g:130:1: ruleUsesStatement EOF
            {
             before(grammarAccess.getUsesStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleUsesStatement();

            state._fsp--;

             after(grammarAccess.getUsesStatementRule()); 
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
    // $ANTLR end "entryRuleUsesStatement"


    // $ANTLR start "ruleUsesStatement"
    // InternalCimpl.g:137:1: ruleUsesStatement : ( ( rule__UsesStatement__Group__0 ) ) ;
    public final void ruleUsesStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:141:2: ( ( ( rule__UsesStatement__Group__0 ) ) )
            // InternalCimpl.g:142:2: ( ( rule__UsesStatement__Group__0 ) )
            {
            // InternalCimpl.g:142:2: ( ( rule__UsesStatement__Group__0 ) )
            // InternalCimpl.g:143:3: ( rule__UsesStatement__Group__0 )
            {
             before(grammarAccess.getUsesStatementAccess().getGroup()); 
            // InternalCimpl.g:144:3: ( rule__UsesStatement__Group__0 )
            // InternalCimpl.g:144:4: rule__UsesStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UsesStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUsesStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUsesStatement"


    // $ANTLR start "entryRuleCodeSystem"
    // InternalCimpl.g:153:1: entryRuleCodeSystem : ruleCodeSystem EOF ;
    public final void entryRuleCodeSystem() throws RecognitionException {
        try {
            // InternalCimpl.g:154:1: ( ruleCodeSystem EOF )
            // InternalCimpl.g:155:1: ruleCodeSystem EOF
            {
             before(grammarAccess.getCodeSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleCodeSystem();

            state._fsp--;

             after(grammarAccess.getCodeSystemRule()); 
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
    // $ANTLR end "entryRuleCodeSystem"


    // $ANTLR start "ruleCodeSystem"
    // InternalCimpl.g:162:1: ruleCodeSystem : ( ( rule__CodeSystem__Group__0 ) ) ;
    public final void ruleCodeSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:166:2: ( ( ( rule__CodeSystem__Group__0 ) ) )
            // InternalCimpl.g:167:2: ( ( rule__CodeSystem__Group__0 ) )
            {
            // InternalCimpl.g:167:2: ( ( rule__CodeSystem__Group__0 ) )
            // InternalCimpl.g:168:3: ( rule__CodeSystem__Group__0 )
            {
             before(grammarAccess.getCodeSystemAccess().getGroup()); 
            // InternalCimpl.g:169:3: ( rule__CodeSystem__Group__0 )
            // InternalCimpl.g:169:4: rule__CodeSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CodeSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCodeSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCodeSystem"


    // $ANTLR start "entryRuleEntryElement"
    // InternalCimpl.g:178:1: entryRuleEntryElement : ruleEntryElement EOF ;
    public final void entryRuleEntryElement() throws RecognitionException {
        try {
            // InternalCimpl.g:179:1: ( ruleEntryElement EOF )
            // InternalCimpl.g:180:1: ruleEntryElement EOF
            {
             before(grammarAccess.getEntryElementRule()); 
            pushFollow(FOLLOW_1);
            ruleEntryElement();

            state._fsp--;

             after(grammarAccess.getEntryElementRule()); 
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
    // $ANTLR end "entryRuleEntryElement"


    // $ANTLR start "ruleEntryElement"
    // InternalCimpl.g:187:1: ruleEntryElement : ( ( rule__EntryElement__Group__0 ) ) ;
    public final void ruleEntryElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:191:2: ( ( ( rule__EntryElement__Group__0 ) ) )
            // InternalCimpl.g:192:2: ( ( rule__EntryElement__Group__0 ) )
            {
            // InternalCimpl.g:192:2: ( ( rule__EntryElement__Group__0 ) )
            // InternalCimpl.g:193:3: ( rule__EntryElement__Group__0 )
            {
             before(grammarAccess.getEntryElementAccess().getGroup()); 
            // InternalCimpl.g:194:3: ( rule__EntryElement__Group__0 )
            // InternalCimpl.g:194:4: rule__EntryElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntryElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntryElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntryElement"


    // $ANTLR start "entryRuleSubsets"
    // InternalCimpl.g:203:1: entryRuleSubsets : ruleSubsets EOF ;
    public final void entryRuleSubsets() throws RecognitionException {
        try {
            // InternalCimpl.g:204:1: ( ruleSubsets EOF )
            // InternalCimpl.g:205:1: ruleSubsets EOF
            {
             before(grammarAccess.getSubsetsRule()); 
            pushFollow(FOLLOW_1);
            ruleSubsets();

            state._fsp--;

             after(grammarAccess.getSubsetsRule()); 
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
    // $ANTLR end "entryRuleSubsets"


    // $ANTLR start "ruleSubsets"
    // InternalCimpl.g:212:1: ruleSubsets : ( ( rule__Subsets__Group__0 ) ) ;
    public final void ruleSubsets() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:216:2: ( ( ( rule__Subsets__Group__0 ) ) )
            // InternalCimpl.g:217:2: ( ( rule__Subsets__Group__0 ) )
            {
            // InternalCimpl.g:217:2: ( ( rule__Subsets__Group__0 ) )
            // InternalCimpl.g:218:3: ( rule__Subsets__Group__0 )
            {
             before(grammarAccess.getSubsetsAccess().getGroup()); 
            // InternalCimpl.g:219:3: ( rule__Subsets__Group__0 )
            // InternalCimpl.g:219:4: rule__Subsets__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Subsets__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubsetsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubsets"


    // $ANTLR start "entryRuleSubset"
    // InternalCimpl.g:228:1: entryRuleSubset : ruleSubset EOF ;
    public final void entryRuleSubset() throws RecognitionException {
        try {
            // InternalCimpl.g:229:1: ( ruleSubset EOF )
            // InternalCimpl.g:230:1: ruleSubset EOF
            {
             before(grammarAccess.getSubsetRule()); 
            pushFollow(FOLLOW_1);
            ruleSubset();

            state._fsp--;

             after(grammarAccess.getSubsetRule()); 
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
    // $ANTLR end "entryRuleSubset"


    // $ANTLR start "ruleSubset"
    // InternalCimpl.g:237:1: ruleSubset : ( ( rule__Subset__Group__0 ) ) ;
    public final void ruleSubset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:241:2: ( ( ( rule__Subset__Group__0 ) ) )
            // InternalCimpl.g:242:2: ( ( rule__Subset__Group__0 ) )
            {
            // InternalCimpl.g:242:2: ( ( rule__Subset__Group__0 ) )
            // InternalCimpl.g:243:3: ( rule__Subset__Group__0 )
            {
             before(grammarAccess.getSubsetAccess().getGroup()); 
            // InternalCimpl.g:244:3: ( rule__Subset__Group__0 )
            // InternalCimpl.g:244:4: rule__Subset__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Subset__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubsetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubset"


    // $ANTLR start "entryRuleRedefinition"
    // InternalCimpl.g:253:1: entryRuleRedefinition : ruleRedefinition EOF ;
    public final void entryRuleRedefinition() throws RecognitionException {
        try {
            // InternalCimpl.g:254:1: ( ruleRedefinition EOF )
            // InternalCimpl.g:255:1: ruleRedefinition EOF
            {
             before(grammarAccess.getRedefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleRedefinition();

            state._fsp--;

             after(grammarAccess.getRedefinitionRule()); 
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
    // $ANTLR end "entryRuleRedefinition"


    // $ANTLR start "ruleRedefinition"
    // InternalCimpl.g:262:1: ruleRedefinition : ( ( rule__Redefinition__Group__0 ) ) ;
    public final void ruleRedefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:266:2: ( ( ( rule__Redefinition__Group__0 ) ) )
            // InternalCimpl.g:267:2: ( ( rule__Redefinition__Group__0 ) )
            {
            // InternalCimpl.g:267:2: ( ( rule__Redefinition__Group__0 ) )
            // InternalCimpl.g:268:3: ( rule__Redefinition__Group__0 )
            {
             before(grammarAccess.getRedefinitionAccess().getGroup()); 
            // InternalCimpl.g:269:3: ( rule__Redefinition__Group__0 )
            // InternalCimpl.g:269:4: rule__Redefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Redefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRedefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRedefinition"


    // $ANTLR start "entryRuleCardinality"
    // InternalCimpl.g:278:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalCimpl.g:279:1: ( ruleCardinality EOF )
            // InternalCimpl.g:280:1: ruleCardinality EOF
            {
             before(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_1);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getCardinalityRule()); 
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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalCimpl.g:287:1: ruleCardinality : ( ( rule__Cardinality__Group__0 ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:291:2: ( ( ( rule__Cardinality__Group__0 ) ) )
            // InternalCimpl.g:292:2: ( ( rule__Cardinality__Group__0 ) )
            {
            // InternalCimpl.g:292:2: ( ( rule__Cardinality__Group__0 ) )
            // InternalCimpl.g:293:3: ( rule__Cardinality__Group__0 )
            {
             before(grammarAccess.getCardinalityAccess().getGroup()); 
            // InternalCimpl.g:294:3: ( rule__Cardinality__Group__0 )
            // InternalCimpl.g:294:4: rule__Cardinality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleElement"
    // InternalCimpl.g:303:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalCimpl.g:304:1: ( ruleElement EOF )
            // InternalCimpl.g:305:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalCimpl.g:312:1: ruleElement : ( ( rule__Element__Group__0 ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:316:2: ( ( ( rule__Element__Group__0 ) ) )
            // InternalCimpl.g:317:2: ( ( rule__Element__Group__0 ) )
            {
            // InternalCimpl.g:317:2: ( ( rule__Element__Group__0 ) )
            // InternalCimpl.g:318:3: ( rule__Element__Group__0 )
            {
             before(grammarAccess.getElementAccess().getGroup()); 
            // InternalCimpl.g:319:3: ( rule__Element__Group__0 )
            // InternalCimpl.g:319:4: rule__Element__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleCodeableConcept"
    // InternalCimpl.g:328:1: entryRuleCodeableConcept : ruleCodeableConcept EOF ;
    public final void entryRuleCodeableConcept() throws RecognitionException {
        try {
            // InternalCimpl.g:329:1: ( ruleCodeableConcept EOF )
            // InternalCimpl.g:330:1: ruleCodeableConcept EOF
            {
             before(grammarAccess.getCodeableConceptRule()); 
            pushFollow(FOLLOW_1);
            ruleCodeableConcept();

            state._fsp--;

             after(grammarAccess.getCodeableConceptRule()); 
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
    // $ANTLR end "entryRuleCodeableConcept"


    // $ANTLR start "ruleCodeableConcept"
    // InternalCimpl.g:337:1: ruleCodeableConcept : ( ( rule__CodeableConcept__Group__0 ) ) ;
    public final void ruleCodeableConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:341:2: ( ( ( rule__CodeableConcept__Group__0 ) ) )
            // InternalCimpl.g:342:2: ( ( rule__CodeableConcept__Group__0 ) )
            {
            // InternalCimpl.g:342:2: ( ( rule__CodeableConcept__Group__0 ) )
            // InternalCimpl.g:343:3: ( rule__CodeableConcept__Group__0 )
            {
             before(grammarAccess.getCodeableConceptAccess().getGroup()); 
            // InternalCimpl.g:344:3: ( rule__CodeableConcept__Group__0 )
            // InternalCimpl.g:344:4: rule__CodeableConcept__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CodeableConcept__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCodeableConceptAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCodeableConcept"


    // $ANTLR start "entryRuleQuantity"
    // InternalCimpl.g:353:1: entryRuleQuantity : ruleQuantity EOF ;
    public final void entryRuleQuantity() throws RecognitionException {
        try {
            // InternalCimpl.g:354:1: ( ruleQuantity EOF )
            // InternalCimpl.g:355:1: ruleQuantity EOF
            {
             before(grammarAccess.getQuantityRule()); 
            pushFollow(FOLLOW_1);
            ruleQuantity();

            state._fsp--;

             after(grammarAccess.getQuantityRule()); 
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
    // $ANTLR end "entryRuleQuantity"


    // $ANTLR start "ruleQuantity"
    // InternalCimpl.g:362:1: ruleQuantity : ( ( rule__Quantity__Group__0 ) ) ;
    public final void ruleQuantity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:366:2: ( ( ( rule__Quantity__Group__0 ) ) )
            // InternalCimpl.g:367:2: ( ( rule__Quantity__Group__0 ) )
            {
            // InternalCimpl.g:367:2: ( ( rule__Quantity__Group__0 ) )
            // InternalCimpl.g:368:3: ( rule__Quantity__Group__0 )
            {
             before(grammarAccess.getQuantityAccess().getGroup()); 
            // InternalCimpl.g:369:3: ( rule__Quantity__Group__0 )
            // InternalCimpl.g:369:4: rule__Quantity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Quantity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuantityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuantity"


    // $ANTLR start "entryRuleCIMPLSTRING"
    // InternalCimpl.g:378:1: entryRuleCIMPLSTRING : ruleCIMPLSTRING EOF ;
    public final void entryRuleCIMPLSTRING() throws RecognitionException {
        try {
            // InternalCimpl.g:379:1: ( ruleCIMPLSTRING EOF )
            // InternalCimpl.g:380:1: ruleCIMPLSTRING EOF
            {
             before(grammarAccess.getCIMPLSTRINGRule()); 
            pushFollow(FOLLOW_1);
            ruleCIMPLSTRING();

            state._fsp--;

             after(grammarAccess.getCIMPLSTRINGRule()); 
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
    // $ANTLR end "entryRuleCIMPLSTRING"


    // $ANTLR start "ruleCIMPLSTRING"
    // InternalCimpl.g:387:1: ruleCIMPLSTRING : ( ( rule__CIMPLSTRING__Alternatives ) ) ;
    public final void ruleCIMPLSTRING() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:391:2: ( ( ( rule__CIMPLSTRING__Alternatives ) ) )
            // InternalCimpl.g:392:2: ( ( rule__CIMPLSTRING__Alternatives ) )
            {
            // InternalCimpl.g:392:2: ( ( rule__CIMPLSTRING__Alternatives ) )
            // InternalCimpl.g:393:3: ( rule__CIMPLSTRING__Alternatives )
            {
             before(grammarAccess.getCIMPLSTRINGAccess().getAlternatives()); 
            // InternalCimpl.g:394:3: ( rule__CIMPLSTRING__Alternatives )
            // InternalCimpl.g:394:4: rule__CIMPLSTRING__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CIMPLSTRING__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCIMPLSTRINGAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCIMPLSTRING"


    // $ANTLR start "rule__CIMPLSTRING__Alternatives"
    // InternalCimpl.g:402:1: rule__CIMPLSTRING__Alternatives : ( ( ' ' ) | ( '/' ) | ( ';' ) | ( ',' ) | ( '!' ) | ( '\\u00A7' ) | ( '%' ) | ( '&' ) | ( '(' ) | ( ')' ) | ( '?' ) | ( '*' ) | ( '+' ) | ( '.' ) | ( '-' ) | ( '|' ) | ( '[' ) | ( ']' ) );
    public final void rule__CIMPLSTRING__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:406:1: ( ( ' ' ) | ( '/' ) | ( ';' ) | ( ',' ) | ( '!' ) | ( '\\u00A7' ) | ( '%' ) | ( '&' ) | ( '(' ) | ( ')' ) | ( '?' ) | ( '*' ) | ( '+' ) | ( '.' ) | ( '-' ) | ( '|' ) | ( '[' ) | ( ']' ) )
            int alt1=18;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            case 15:
                {
                alt1=4;
                }
                break;
            case 16:
                {
                alt1=5;
                }
                break;
            case 17:
                {
                alt1=6;
                }
                break;
            case 18:
                {
                alt1=7;
                }
                break;
            case 19:
                {
                alt1=8;
                }
                break;
            case 20:
                {
                alt1=9;
                }
                break;
            case 21:
                {
                alt1=10;
                }
                break;
            case 22:
                {
                alt1=11;
                }
                break;
            case 23:
                {
                alt1=12;
                }
                break;
            case 24:
                {
                alt1=13;
                }
                break;
            case 25:
                {
                alt1=14;
                }
                break;
            case 26:
                {
                alt1=15;
                }
                break;
            case 27:
                {
                alt1=16;
                }
                break;
            case 28:
                {
                alt1=17;
                }
                break;
            case 29:
                {
                alt1=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalCimpl.g:407:2: ( ' ' )
                    {
                    // InternalCimpl.g:407:2: ( ' ' )
                    // InternalCimpl.g:408:3: ' '
                    {
                     before(grammarAccess.getCIMPLSTRINGAccess().getSpaceKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getCIMPLSTRINGAccess().getSpaceKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCimpl.g:413:2: ( '/' )
                    {
                    // InternalCimpl.g:413:2: ( '/' )
                    // InternalCimpl.g:414:3: '/'
                    {
                     before(grammarAccess.getCIMPLSTRINGAccess().getSolidusKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getCIMPLSTRINGAccess().getSolidusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCimpl.g:419:2: ( ';' )
                    {
                    // InternalCimpl.g:419:2: ( ';' )
                    // InternalCimpl.g:420:3: ';'
                    {
                     before(grammarAccess.getCIMPLSTRINGAccess().getSemicolonKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getCIMPLSTRINGAccess().getSemicolonKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCimpl.g:425:2: ( ',' )
                    {
                    // InternalCimpl.g:425:2: ( ',' )
                    // InternalCimpl.g:426:3: ','
                    {
                     before(grammarAccess.getCIMPLSTRINGAccess().getCommaKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getCIMPLSTRINGAccess().getCommaKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCimpl.g:431:2: ( '!' )
                    {
                    // InternalCimpl.g:431:2: ( '!' )
                    // InternalCimpl.g:432:3: '!'
                    {
                     before(grammarAccess.getCIMPLSTRINGAccess().getExclamationMarkKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getCIMPLSTRINGAccess().getExclamationMarkKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCimpl.g:437:2: ( '\\u00A7' )
                    {
                    // InternalCimpl.g:437:2: ( '\\u00A7' )
                    // InternalCimpl.g:438:3: '\\u00A7'
                    {
                     before(grammarAccess.getCIMPLSTRINGAccess().getSectionSignKeyword_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getCIMPLSTRINGAccess().getSectionSignKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCimpl.g:443:2: ( '%' )
                    {
                    // InternalCimpl.g:443:2: ( '%' )
                    // InternalCimpl.g:444:3: '%'
                    {
                     before(grammarAccess.getCIMPLSTRINGAccess().getPercentSignKeyword_6()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getCIMPLSTRINGAccess().getPercentSignKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCimpl.g:449:2: ( '&' )
                    {
                    // InternalCimpl.g:449:2: ( '&' )
                    // InternalCimpl.g:450:3: '&'
                    {
                     before(grammarAccess.getCIMPLSTRINGAccess().getAmpersandKeyword_7()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getCIMPLSTRINGAccess().getAmpersandKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalCimpl.g:455:2: ( '(' )
                    {
                    // InternalCimpl.g:455:2: ( '(' )
                    // InternalCimpl.g:456:3: '('
                    {
                     before(grammarAccess.getCIMPLSTRINGAccess().getLeftParenthesisKeyword_8()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getCIMPLSTRINGAccess().getLeftParenthesisKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalCimpl.g:461:2: ( ')' )
                    {
                    // InternalCimpl.g:461:2: ( ')' )
                    // InternalCimpl.g:462:3: ')'
                    {
                     before(grammarAccess.getCIMPLSTRINGAccess().getRightParenthesisKeyword_9()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getCIMPLSTRINGAccess().getRightParenthesisKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalCimpl.g:467:2: ( '?' )
                    {
                    // InternalCimpl.g:467:2: ( '?' )
                    // InternalCimpl.g:468:3: '?'
                    {
                     before(grammarAccess.getCIMPLSTRINGAccess().getQuestionMarkKeyword_10()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getCIMPLSTRINGAccess().getQuestionMarkKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalCimpl.g:473:2: ( '*' )
                    {
                    // InternalCimpl.g:473:2: ( '*' )
                    // InternalCimpl.g:474:3: '*'
                    {
                     before(grammarAccess.getCIMPLSTRINGAccess().getAsteriskKeyword_11()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getCIMPLSTRINGAccess().getAsteriskKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalCimpl.g:479:2: ( '+' )
                    {
                    // InternalCimpl.g:479:2: ( '+' )
                    // InternalCimpl.g:480:3: '+'
                    {
                     before(grammarAccess.getCIMPLSTRINGAccess().getPlusSignKeyword_12()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getCIMPLSTRINGAccess().getPlusSignKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalCimpl.g:485:2: ( '.' )
                    {
                    // InternalCimpl.g:485:2: ( '.' )
                    // InternalCimpl.g:486:3: '.'
                    {
                     before(grammarAccess.getCIMPLSTRINGAccess().getFullStopKeyword_13()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getCIMPLSTRINGAccess().getFullStopKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalCimpl.g:491:2: ( '-' )
                    {
                    // InternalCimpl.g:491:2: ( '-' )
                    // InternalCimpl.g:492:3: '-'
                    {
                     before(grammarAccess.getCIMPLSTRINGAccess().getHyphenMinusKeyword_14()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getCIMPLSTRINGAccess().getHyphenMinusKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalCimpl.g:497:2: ( '|' )
                    {
                    // InternalCimpl.g:497:2: ( '|' )
                    // InternalCimpl.g:498:3: '|'
                    {
                     before(grammarAccess.getCIMPLSTRINGAccess().getVerticalLineKeyword_15()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getCIMPLSTRINGAccess().getVerticalLineKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalCimpl.g:503:2: ( '[' )
                    {
                    // InternalCimpl.g:503:2: ( '[' )
                    // InternalCimpl.g:504:3: '['
                    {
                     before(grammarAccess.getCIMPLSTRINGAccess().getLeftSquareBracketKeyword_16()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getCIMPLSTRINGAccess().getLeftSquareBracketKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalCimpl.g:509:2: ( ']' )
                    {
                    // InternalCimpl.g:509:2: ( ']' )
                    // InternalCimpl.g:510:3: ']'
                    {
                     before(grammarAccess.getCIMPLSTRINGAccess().getRightSquareBracketKeyword_17()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getCIMPLSTRINGAccess().getRightSquareBracketKeyword_17()); 

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
    // $ANTLR end "rule__CIMPLSTRING__Alternatives"


    // $ANTLR start "rule__Profile__Group__0"
    // InternalCimpl.g:519:1: rule__Profile__Group__0 : rule__Profile__Group__0__Impl rule__Profile__Group__1 ;
    public final void rule__Profile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:523:1: ( rule__Profile__Group__0__Impl rule__Profile__Group__1 )
            // InternalCimpl.g:524:2: rule__Profile__Group__0__Impl rule__Profile__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Profile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Profile__Group__1();

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
    // $ANTLR end "rule__Profile__Group__0"


    // $ANTLR start "rule__Profile__Group__0__Impl"
    // InternalCimpl.g:531:1: rule__Profile__Group__0__Impl : ( ( rule__Profile__HeaderAssignment_0 ) ) ;
    public final void rule__Profile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:535:1: ( ( ( rule__Profile__HeaderAssignment_0 ) ) )
            // InternalCimpl.g:536:1: ( ( rule__Profile__HeaderAssignment_0 ) )
            {
            // InternalCimpl.g:536:1: ( ( rule__Profile__HeaderAssignment_0 ) )
            // InternalCimpl.g:537:2: ( rule__Profile__HeaderAssignment_0 )
            {
             before(grammarAccess.getProfileAccess().getHeaderAssignment_0()); 
            // InternalCimpl.g:538:2: ( rule__Profile__HeaderAssignment_0 )
            // InternalCimpl.g:538:3: rule__Profile__HeaderAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Profile__HeaderAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProfileAccess().getHeaderAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__0__Impl"


    // $ANTLR start "rule__Profile__Group__1"
    // InternalCimpl.g:546:1: rule__Profile__Group__1 : rule__Profile__Group__1__Impl rule__Profile__Group__2 ;
    public final void rule__Profile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:550:1: ( rule__Profile__Group__1__Impl rule__Profile__Group__2 )
            // InternalCimpl.g:551:2: rule__Profile__Group__1__Impl rule__Profile__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Profile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Profile__Group__2();

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
    // $ANTLR end "rule__Profile__Group__1"


    // $ANTLR start "rule__Profile__Group__1__Impl"
    // InternalCimpl.g:558:1: rule__Profile__Group__1__Impl : ( ( rule__Profile__DescriptionAssignment_1 ) ) ;
    public final void rule__Profile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:562:1: ( ( ( rule__Profile__DescriptionAssignment_1 ) ) )
            // InternalCimpl.g:563:1: ( ( rule__Profile__DescriptionAssignment_1 ) )
            {
            // InternalCimpl.g:563:1: ( ( rule__Profile__DescriptionAssignment_1 ) )
            // InternalCimpl.g:564:2: ( rule__Profile__DescriptionAssignment_1 )
            {
             before(grammarAccess.getProfileAccess().getDescriptionAssignment_1()); 
            // InternalCimpl.g:565:2: ( rule__Profile__DescriptionAssignment_1 )
            // InternalCimpl.g:565:3: rule__Profile__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Profile__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProfileAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__1__Impl"


    // $ANTLR start "rule__Profile__Group__2"
    // InternalCimpl.g:573:1: rule__Profile__Group__2 : rule__Profile__Group__2__Impl rule__Profile__Group__3 ;
    public final void rule__Profile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:577:1: ( rule__Profile__Group__2__Impl rule__Profile__Group__3 )
            // InternalCimpl.g:578:2: rule__Profile__Group__2__Impl rule__Profile__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Profile__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Profile__Group__3();

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
    // $ANTLR end "rule__Profile__Group__2"


    // $ANTLR start "rule__Profile__Group__2__Impl"
    // InternalCimpl.g:585:1: rule__Profile__Group__2__Impl : ( ( rule__Profile__UsesAssignment_2 )? ) ;
    public final void rule__Profile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:589:1: ( ( ( rule__Profile__UsesAssignment_2 )? ) )
            // InternalCimpl.g:590:1: ( ( rule__Profile__UsesAssignment_2 )? )
            {
            // InternalCimpl.g:590:1: ( ( rule__Profile__UsesAssignment_2 )? )
            // InternalCimpl.g:591:2: ( rule__Profile__UsesAssignment_2 )?
            {
             before(grammarAccess.getProfileAccess().getUsesAssignment_2()); 
            // InternalCimpl.g:592:2: ( rule__Profile__UsesAssignment_2 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==35) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCimpl.g:592:3: rule__Profile__UsesAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Profile__UsesAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProfileAccess().getUsesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__2__Impl"


    // $ANTLR start "rule__Profile__Group__3"
    // InternalCimpl.g:600:1: rule__Profile__Group__3 : rule__Profile__Group__3__Impl rule__Profile__Group__4 ;
    public final void rule__Profile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:604:1: ( rule__Profile__Group__3__Impl rule__Profile__Group__4 )
            // InternalCimpl.g:605:2: rule__Profile__Group__3__Impl rule__Profile__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Profile__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Profile__Group__4();

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
    // $ANTLR end "rule__Profile__Group__3"


    // $ANTLR start "rule__Profile__Group__3__Impl"
    // InternalCimpl.g:612:1: rule__Profile__Group__3__Impl : ( ( rule__Profile__CodeSystemsAssignment_3 )* ) ;
    public final void rule__Profile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:616:1: ( ( ( rule__Profile__CodeSystemsAssignment_3 )* ) )
            // InternalCimpl.g:617:1: ( ( rule__Profile__CodeSystemsAssignment_3 )* )
            {
            // InternalCimpl.g:617:1: ( ( rule__Profile__CodeSystemsAssignment_3 )* )
            // InternalCimpl.g:618:2: ( rule__Profile__CodeSystemsAssignment_3 )*
            {
             before(grammarAccess.getProfileAccess().getCodeSystemsAssignment_3()); 
            // InternalCimpl.g:619:2: ( rule__Profile__CodeSystemsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==36) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCimpl.g:619:3: rule__Profile__CodeSystemsAssignment_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Profile__CodeSystemsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getProfileAccess().getCodeSystemsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__3__Impl"


    // $ANTLR start "rule__Profile__Group__4"
    // InternalCimpl.g:627:1: rule__Profile__Group__4 : rule__Profile__Group__4__Impl rule__Profile__Group__5 ;
    public final void rule__Profile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:631:1: ( rule__Profile__Group__4__Impl rule__Profile__Group__5 )
            // InternalCimpl.g:632:2: rule__Profile__Group__4__Impl rule__Profile__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Profile__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Profile__Group__5();

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
    // $ANTLR end "rule__Profile__Group__4"


    // $ANTLR start "rule__Profile__Group__4__Impl"
    // InternalCimpl.g:639:1: rule__Profile__Group__4__Impl : ( ( rule__Profile__EntriesAssignment_4 )* ) ;
    public final void rule__Profile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:643:1: ( ( ( rule__Profile__EntriesAssignment_4 )* ) )
            // InternalCimpl.g:644:1: ( ( rule__Profile__EntriesAssignment_4 )* )
            {
            // InternalCimpl.g:644:1: ( ( rule__Profile__EntriesAssignment_4 )* )
            // InternalCimpl.g:645:2: ( rule__Profile__EntriesAssignment_4 )*
            {
             before(grammarAccess.getProfileAccess().getEntriesAssignment_4()); 
            // InternalCimpl.g:646:2: ( rule__Profile__EntriesAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==37) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCimpl.g:646:3: rule__Profile__EntriesAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Profile__EntriesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getProfileAccess().getEntriesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__4__Impl"


    // $ANTLR start "rule__Profile__Group__5"
    // InternalCimpl.g:654:1: rule__Profile__Group__5 : rule__Profile__Group__5__Impl ;
    public final void rule__Profile__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:658:1: ( rule__Profile__Group__5__Impl )
            // InternalCimpl.g:659:2: rule__Profile__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Profile__Group__5__Impl();

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
    // $ANTLR end "rule__Profile__Group__5"


    // $ANTLR start "rule__Profile__Group__5__Impl"
    // InternalCimpl.g:665:1: rule__Profile__Group__5__Impl : ( ( rule__Profile__ElementsAssignment_5 )* ) ;
    public final void rule__Profile__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:669:1: ( ( ( rule__Profile__ElementsAssignment_5 )* ) )
            // InternalCimpl.g:670:1: ( ( rule__Profile__ElementsAssignment_5 )* )
            {
            // InternalCimpl.g:670:1: ( ( rule__Profile__ElementsAssignment_5 )* )
            // InternalCimpl.g:671:2: ( rule__Profile__ElementsAssignment_5 )*
            {
             before(grammarAccess.getProfileAccess().getElementsAssignment_5()); 
            // InternalCimpl.g:672:2: ( rule__Profile__ElementsAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==42) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCimpl.g:672:3: rule__Profile__ElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Profile__ElementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProfileAccess().getElementsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__Group__5__Impl"


    // $ANTLR start "rule__Description__Group__0"
    // InternalCimpl.g:681:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:685:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalCimpl.g:686:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCimpl.g:693:1: rule__Description__Group__0__Impl : ( 'Description:' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:697:1: ( ( 'Description:' ) )
            // InternalCimpl.g:698:1: ( 'Description:' )
            {
            // InternalCimpl.g:698:1: ( 'Description:' )
            // InternalCimpl.g:699:2: 'Description:'
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 

            }


            }

        }
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
    // InternalCimpl.g:708:1: rule__Description__Group__1 : rule__Description__Group__1__Impl rule__Description__Group__2 ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:712:1: ( rule__Description__Group__1__Impl rule__Description__Group__2 )
            // InternalCimpl.g:713:2: rule__Description__Group__1__Impl rule__Description__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalCimpl.g:720:1: rule__Description__Group__1__Impl : ( ( rule__Description__DescriptionAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:724:1: ( ( ( rule__Description__DescriptionAssignment_1 ) ) )
            // InternalCimpl.g:725:1: ( ( rule__Description__DescriptionAssignment_1 ) )
            {
            // InternalCimpl.g:725:1: ( ( rule__Description__DescriptionAssignment_1 ) )
            // InternalCimpl.g:726:2: ( rule__Description__DescriptionAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionAssignment_1()); 
            // InternalCimpl.g:727:2: ( rule__Description__DescriptionAssignment_1 )
            // InternalCimpl.g:727:3: rule__Description__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Description__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getDescriptionAssignment_1()); 

            }


            }

        }
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
    // InternalCimpl.g:735:1: rule__Description__Group__2 : rule__Description__Group__2__Impl ;
    public final void rule__Description__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:739:1: ( rule__Description__Group__2__Impl )
            // InternalCimpl.g:740:2: rule__Description__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__2__Impl();

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
    // InternalCimpl.g:746:1: rule__Description__Group__2__Impl : ( '\\r' ) ;
    public final void rule__Description__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:750:1: ( ( '\\r' ) )
            // InternalCimpl.g:751:1: ( '\\r' )
            {
            // InternalCimpl.g:751:1: ( '\\r' )
            // InternalCimpl.g:752:2: '\\r'
            {
             before(grammarAccess.getDescriptionAccess().getCarriageReturnKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getCarriageReturnKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Header__Group__0"
    // InternalCimpl.g:762:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:766:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // InternalCimpl.g:767:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Header__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__1();

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
    // $ANTLR end "rule__Header__Group__0"


    // $ANTLR start "rule__Header__Group__0__Impl"
    // InternalCimpl.g:774:1: rule__Header__Group__0__Impl : ( 'Grammar:\\tDataElement' ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:778:1: ( ( 'Grammar:\\tDataElement' ) )
            // InternalCimpl.g:779:1: ( 'Grammar:\\tDataElement' )
            {
            // InternalCimpl.g:779:1: ( 'Grammar:\\tDataElement' )
            // InternalCimpl.g:780:2: 'Grammar:\\tDataElement'
            {
             before(grammarAccess.getHeaderAccess().getGrammarDataElementKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getGrammarDataElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__0__Impl"


    // $ANTLR start "rule__Header__Group__1"
    // InternalCimpl.g:789:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:793:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // InternalCimpl.g:794:2: rule__Header__Group__1__Impl rule__Header__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Header__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__2();

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
    // $ANTLR end "rule__Header__Group__1"


    // $ANTLR start "rule__Header__Group__1__Impl"
    // InternalCimpl.g:801:1: rule__Header__Group__1__Impl : ( ( rule__Header__VersionAssignment_1 ) ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:805:1: ( ( ( rule__Header__VersionAssignment_1 ) ) )
            // InternalCimpl.g:806:1: ( ( rule__Header__VersionAssignment_1 ) )
            {
            // InternalCimpl.g:806:1: ( ( rule__Header__VersionAssignment_1 ) )
            // InternalCimpl.g:807:2: ( rule__Header__VersionAssignment_1 )
            {
             before(grammarAccess.getHeaderAccess().getVersionAssignment_1()); 
            // InternalCimpl.g:808:2: ( rule__Header__VersionAssignment_1 )
            // InternalCimpl.g:808:3: rule__Header__VersionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Header__VersionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getVersionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__1__Impl"


    // $ANTLR start "rule__Header__Group__2"
    // InternalCimpl.g:816:1: rule__Header__Group__2 : rule__Header__Group__2__Impl rule__Header__Group__3 ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:820:1: ( rule__Header__Group__2__Impl rule__Header__Group__3 )
            // InternalCimpl.g:821:2: rule__Header__Group__2__Impl rule__Header__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Header__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__3();

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
    // $ANTLR end "rule__Header__Group__2"


    // $ANTLR start "rule__Header__Group__2__Impl"
    // InternalCimpl.g:828:1: rule__Header__Group__2__Impl : ( '\\r\\n' ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:832:1: ( ( '\\r\\n' ) )
            // InternalCimpl.g:833:1: ( '\\r\\n' )
            {
            // InternalCimpl.g:833:1: ( '\\r\\n' )
            // InternalCimpl.g:834:2: '\\r\\n'
            {
             before(grammarAccess.getHeaderAccess().getControl000dControl000aKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getControl000dControl000aKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__2__Impl"


    // $ANTLR start "rule__Header__Group__3"
    // InternalCimpl.g:843:1: rule__Header__Group__3 : rule__Header__Group__3__Impl rule__Header__Group__4 ;
    public final void rule__Header__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:847:1: ( rule__Header__Group__3__Impl rule__Header__Group__4 )
            // InternalCimpl.g:848:2: rule__Header__Group__3__Impl rule__Header__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Header__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__4();

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
    // $ANTLR end "rule__Header__Group__3"


    // $ANTLR start "rule__Header__Group__3__Impl"
    // InternalCimpl.g:855:1: rule__Header__Group__3__Impl : ( 'Namespace:' ) ;
    public final void rule__Header__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:859:1: ( ( 'Namespace:' ) )
            // InternalCimpl.g:860:1: ( 'Namespace:' )
            {
            // InternalCimpl.g:860:1: ( 'Namespace:' )
            // InternalCimpl.g:861:2: 'Namespace:'
            {
             before(grammarAccess.getHeaderAccess().getNamespaceKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getNamespaceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__3__Impl"


    // $ANTLR start "rule__Header__Group__4"
    // InternalCimpl.g:870:1: rule__Header__Group__4 : rule__Header__Group__4__Impl rule__Header__Group__5 ;
    public final void rule__Header__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:874:1: ( rule__Header__Group__4__Impl rule__Header__Group__5 )
            // InternalCimpl.g:875:2: rule__Header__Group__4__Impl rule__Header__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Header__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__5();

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
    // $ANTLR end "rule__Header__Group__4"


    // $ANTLR start "rule__Header__Group__4__Impl"
    // InternalCimpl.g:882:1: rule__Header__Group__4__Impl : ( ( rule__Header__NamespaceAssignment_4 ) ) ;
    public final void rule__Header__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:886:1: ( ( ( rule__Header__NamespaceAssignment_4 ) ) )
            // InternalCimpl.g:887:1: ( ( rule__Header__NamespaceAssignment_4 ) )
            {
            // InternalCimpl.g:887:1: ( ( rule__Header__NamespaceAssignment_4 ) )
            // InternalCimpl.g:888:2: ( rule__Header__NamespaceAssignment_4 )
            {
             before(grammarAccess.getHeaderAccess().getNamespaceAssignment_4()); 
            // InternalCimpl.g:889:2: ( rule__Header__NamespaceAssignment_4 )
            // InternalCimpl.g:889:3: rule__Header__NamespaceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Header__NamespaceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getNamespaceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__4__Impl"


    // $ANTLR start "rule__Header__Group__5"
    // InternalCimpl.g:897:1: rule__Header__Group__5 : rule__Header__Group__5__Impl ;
    public final void rule__Header__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:901:1: ( rule__Header__Group__5__Impl )
            // InternalCimpl.g:902:2: rule__Header__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__5__Impl();

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
    // $ANTLR end "rule__Header__Group__5"


    // $ANTLR start "rule__Header__Group__5__Impl"
    // InternalCimpl.g:908:1: rule__Header__Group__5__Impl : ( '\\r' ) ;
    public final void rule__Header__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:912:1: ( ( '\\r' ) )
            // InternalCimpl.g:913:1: ( '\\r' )
            {
            // InternalCimpl.g:913:1: ( '\\r' )
            // InternalCimpl.g:914:2: '\\r'
            {
             before(grammarAccess.getHeaderAccess().getCarriageReturnKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getCarriageReturnKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__5__Impl"


    // $ANTLR start "rule__UsesStatement__Group__0"
    // InternalCimpl.g:924:1: rule__UsesStatement__Group__0 : rule__UsesStatement__Group__0__Impl rule__UsesStatement__Group__1 ;
    public final void rule__UsesStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:928:1: ( rule__UsesStatement__Group__0__Impl rule__UsesStatement__Group__1 )
            // InternalCimpl.g:929:2: rule__UsesStatement__Group__0__Impl rule__UsesStatement__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__UsesStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsesStatement__Group__1();

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
    // $ANTLR end "rule__UsesStatement__Group__0"


    // $ANTLR start "rule__UsesStatement__Group__0__Impl"
    // InternalCimpl.g:936:1: rule__UsesStatement__Group__0__Impl : ( 'Uses:' ) ;
    public final void rule__UsesStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:940:1: ( ( 'Uses:' ) )
            // InternalCimpl.g:941:1: ( 'Uses:' )
            {
            // InternalCimpl.g:941:1: ( 'Uses:' )
            // InternalCimpl.g:942:2: 'Uses:'
            {
             before(grammarAccess.getUsesStatementAccess().getUsesKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getUsesStatementAccess().getUsesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsesStatement__Group__0__Impl"


    // $ANTLR start "rule__UsesStatement__Group__1"
    // InternalCimpl.g:951:1: rule__UsesStatement__Group__1 : rule__UsesStatement__Group__1__Impl rule__UsesStatement__Group__2 ;
    public final void rule__UsesStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:955:1: ( rule__UsesStatement__Group__1__Impl rule__UsesStatement__Group__2 )
            // InternalCimpl.g:956:2: rule__UsesStatement__Group__1__Impl rule__UsesStatement__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__UsesStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsesStatement__Group__2();

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
    // $ANTLR end "rule__UsesStatement__Group__1"


    // $ANTLR start "rule__UsesStatement__Group__1__Impl"
    // InternalCimpl.g:963:1: rule__UsesStatement__Group__1__Impl : ( ( rule__UsesStatement__NamespaceAssignment_1 ) ) ;
    public final void rule__UsesStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:967:1: ( ( ( rule__UsesStatement__NamespaceAssignment_1 ) ) )
            // InternalCimpl.g:968:1: ( ( rule__UsesStatement__NamespaceAssignment_1 ) )
            {
            // InternalCimpl.g:968:1: ( ( rule__UsesStatement__NamespaceAssignment_1 ) )
            // InternalCimpl.g:969:2: ( rule__UsesStatement__NamespaceAssignment_1 )
            {
             before(grammarAccess.getUsesStatementAccess().getNamespaceAssignment_1()); 
            // InternalCimpl.g:970:2: ( rule__UsesStatement__NamespaceAssignment_1 )
            // InternalCimpl.g:970:3: rule__UsesStatement__NamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UsesStatement__NamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUsesStatementAccess().getNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsesStatement__Group__1__Impl"


    // $ANTLR start "rule__UsesStatement__Group__2"
    // InternalCimpl.g:978:1: rule__UsesStatement__Group__2 : rule__UsesStatement__Group__2__Impl rule__UsesStatement__Group__3 ;
    public final void rule__UsesStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:982:1: ( rule__UsesStatement__Group__2__Impl rule__UsesStatement__Group__3 )
            // InternalCimpl.g:983:2: rule__UsesStatement__Group__2__Impl rule__UsesStatement__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__UsesStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsesStatement__Group__3();

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
    // $ANTLR end "rule__UsesStatement__Group__2"


    // $ANTLR start "rule__UsesStatement__Group__2__Impl"
    // InternalCimpl.g:990:1: rule__UsesStatement__Group__2__Impl : ( ( rule__UsesStatement__Group_2__0 )* ) ;
    public final void rule__UsesStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:994:1: ( ( ( rule__UsesStatement__Group_2__0 )* ) )
            // InternalCimpl.g:995:1: ( ( rule__UsesStatement__Group_2__0 )* )
            {
            // InternalCimpl.g:995:1: ( ( rule__UsesStatement__Group_2__0 )* )
            // InternalCimpl.g:996:2: ( rule__UsesStatement__Group_2__0 )*
            {
             before(grammarAccess.getUsesStatementAccess().getGroup_2()); 
            // InternalCimpl.g:997:2: ( rule__UsesStatement__Group_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCimpl.g:997:3: rule__UsesStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__UsesStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getUsesStatementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsesStatement__Group__2__Impl"


    // $ANTLR start "rule__UsesStatement__Group__3"
    // InternalCimpl.g:1005:1: rule__UsesStatement__Group__3 : rule__UsesStatement__Group__3__Impl rule__UsesStatement__Group__4 ;
    public final void rule__UsesStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1009:1: ( rule__UsesStatement__Group__3__Impl rule__UsesStatement__Group__4 )
            // InternalCimpl.g:1010:2: rule__UsesStatement__Group__3__Impl rule__UsesStatement__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__UsesStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsesStatement__Group__4();

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
    // $ANTLR end "rule__UsesStatement__Group__3"


    // $ANTLR start "rule__UsesStatement__Group__3__Impl"
    // InternalCimpl.g:1017:1: rule__UsesStatement__Group__3__Impl : ( '\\r' ) ;
    public final void rule__UsesStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1021:1: ( ( '\\r' ) )
            // InternalCimpl.g:1022:1: ( '\\r' )
            {
            // InternalCimpl.g:1022:1: ( '\\r' )
            // InternalCimpl.g:1023:2: '\\r'
            {
             before(grammarAccess.getUsesStatementAccess().getCarriageReturnKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getUsesStatementAccess().getCarriageReturnKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsesStatement__Group__3__Impl"


    // $ANTLR start "rule__UsesStatement__Group__4"
    // InternalCimpl.g:1032:1: rule__UsesStatement__Group__4 : rule__UsesStatement__Group__4__Impl ;
    public final void rule__UsesStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1036:1: ( rule__UsesStatement__Group__4__Impl )
            // InternalCimpl.g:1037:2: rule__UsesStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UsesStatement__Group__4__Impl();

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
    // $ANTLR end "rule__UsesStatement__Group__4"


    // $ANTLR start "rule__UsesStatement__Group__4__Impl"
    // InternalCimpl.g:1043:1: rule__UsesStatement__Group__4__Impl : ( '\\r' ) ;
    public final void rule__UsesStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1047:1: ( ( '\\r' ) )
            // InternalCimpl.g:1048:1: ( '\\r' )
            {
            // InternalCimpl.g:1048:1: ( '\\r' )
            // InternalCimpl.g:1049:2: '\\r'
            {
             before(grammarAccess.getUsesStatementAccess().getCarriageReturnKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getUsesStatementAccess().getCarriageReturnKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsesStatement__Group__4__Impl"


    // $ANTLR start "rule__UsesStatement__Group_2__0"
    // InternalCimpl.g:1059:1: rule__UsesStatement__Group_2__0 : rule__UsesStatement__Group_2__0__Impl rule__UsesStatement__Group_2__1 ;
    public final void rule__UsesStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1063:1: ( rule__UsesStatement__Group_2__0__Impl rule__UsesStatement__Group_2__1 )
            // InternalCimpl.g:1064:2: rule__UsesStatement__Group_2__0__Impl rule__UsesStatement__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__UsesStatement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UsesStatement__Group_2__1();

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
    // $ANTLR end "rule__UsesStatement__Group_2__0"


    // $ANTLR start "rule__UsesStatement__Group_2__0__Impl"
    // InternalCimpl.g:1071:1: rule__UsesStatement__Group_2__0__Impl : ( ',' ) ;
    public final void rule__UsesStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1075:1: ( ( ',' ) )
            // InternalCimpl.g:1076:1: ( ',' )
            {
            // InternalCimpl.g:1076:1: ( ',' )
            // InternalCimpl.g:1077:2: ','
            {
             before(grammarAccess.getUsesStatementAccess().getCommaKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getUsesStatementAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsesStatement__Group_2__0__Impl"


    // $ANTLR start "rule__UsesStatement__Group_2__1"
    // InternalCimpl.g:1086:1: rule__UsesStatement__Group_2__1 : rule__UsesStatement__Group_2__1__Impl ;
    public final void rule__UsesStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1090:1: ( rule__UsesStatement__Group_2__1__Impl )
            // InternalCimpl.g:1091:2: rule__UsesStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UsesStatement__Group_2__1__Impl();

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
    // $ANTLR end "rule__UsesStatement__Group_2__1"


    // $ANTLR start "rule__UsesStatement__Group_2__1__Impl"
    // InternalCimpl.g:1097:1: rule__UsesStatement__Group_2__1__Impl : ( ( rule__UsesStatement__NamespaceAssignment_2_1 ) ) ;
    public final void rule__UsesStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1101:1: ( ( ( rule__UsesStatement__NamespaceAssignment_2_1 ) ) )
            // InternalCimpl.g:1102:1: ( ( rule__UsesStatement__NamespaceAssignment_2_1 ) )
            {
            // InternalCimpl.g:1102:1: ( ( rule__UsesStatement__NamespaceAssignment_2_1 ) )
            // InternalCimpl.g:1103:2: ( rule__UsesStatement__NamespaceAssignment_2_1 )
            {
             before(grammarAccess.getUsesStatementAccess().getNamespaceAssignment_2_1()); 
            // InternalCimpl.g:1104:2: ( rule__UsesStatement__NamespaceAssignment_2_1 )
            // InternalCimpl.g:1104:3: rule__UsesStatement__NamespaceAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UsesStatement__NamespaceAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUsesStatementAccess().getNamespaceAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsesStatement__Group_2__1__Impl"


    // $ANTLR start "rule__CodeSystem__Group__0"
    // InternalCimpl.g:1113:1: rule__CodeSystem__Group__0 : rule__CodeSystem__Group__0__Impl rule__CodeSystem__Group__1 ;
    public final void rule__CodeSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1117:1: ( rule__CodeSystem__Group__0__Impl rule__CodeSystem__Group__1 )
            // InternalCimpl.g:1118:2: rule__CodeSystem__Group__0__Impl rule__CodeSystem__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__CodeSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodeSystem__Group__1();

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
    // $ANTLR end "rule__CodeSystem__Group__0"


    // $ANTLR start "rule__CodeSystem__Group__0__Impl"
    // InternalCimpl.g:1125:1: rule__CodeSystem__Group__0__Impl : ( 'CodeSystem:' ) ;
    public final void rule__CodeSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1129:1: ( ( 'CodeSystem:' ) )
            // InternalCimpl.g:1130:1: ( 'CodeSystem:' )
            {
            // InternalCimpl.g:1130:1: ( 'CodeSystem:' )
            // InternalCimpl.g:1131:2: 'CodeSystem:'
            {
             before(grammarAccess.getCodeSystemAccess().getCodeSystemKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCodeSystemAccess().getCodeSystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeSystem__Group__0__Impl"


    // $ANTLR start "rule__CodeSystem__Group__1"
    // InternalCimpl.g:1140:1: rule__CodeSystem__Group__1 : rule__CodeSystem__Group__1__Impl rule__CodeSystem__Group__2 ;
    public final void rule__CodeSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1144:1: ( rule__CodeSystem__Group__1__Impl rule__CodeSystem__Group__2 )
            // InternalCimpl.g:1145:2: rule__CodeSystem__Group__1__Impl rule__CodeSystem__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__CodeSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodeSystem__Group__2();

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
    // $ANTLR end "rule__CodeSystem__Group__1"


    // $ANTLR start "rule__CodeSystem__Group__1__Impl"
    // InternalCimpl.g:1152:1: rule__CodeSystem__Group__1__Impl : ( ( rule__CodeSystem__NamespaceAssignment_1 ) ) ;
    public final void rule__CodeSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1156:1: ( ( ( rule__CodeSystem__NamespaceAssignment_1 ) ) )
            // InternalCimpl.g:1157:1: ( ( rule__CodeSystem__NamespaceAssignment_1 ) )
            {
            // InternalCimpl.g:1157:1: ( ( rule__CodeSystem__NamespaceAssignment_1 ) )
            // InternalCimpl.g:1158:2: ( rule__CodeSystem__NamespaceAssignment_1 )
            {
             before(grammarAccess.getCodeSystemAccess().getNamespaceAssignment_1()); 
            // InternalCimpl.g:1159:2: ( rule__CodeSystem__NamespaceAssignment_1 )
            // InternalCimpl.g:1159:3: rule__CodeSystem__NamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CodeSystem__NamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCodeSystemAccess().getNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeSystem__Group__1__Impl"


    // $ANTLR start "rule__CodeSystem__Group__2"
    // InternalCimpl.g:1167:1: rule__CodeSystem__Group__2 : rule__CodeSystem__Group__2__Impl ;
    public final void rule__CodeSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1171:1: ( rule__CodeSystem__Group__2__Impl )
            // InternalCimpl.g:1172:2: rule__CodeSystem__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CodeSystem__Group__2__Impl();

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
    // $ANTLR end "rule__CodeSystem__Group__2"


    // $ANTLR start "rule__CodeSystem__Group__2__Impl"
    // InternalCimpl.g:1178:1: rule__CodeSystem__Group__2__Impl : ( '\\r' ) ;
    public final void rule__CodeSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1182:1: ( ( '\\r' ) )
            // InternalCimpl.g:1183:1: ( '\\r' )
            {
            // InternalCimpl.g:1183:1: ( '\\r' )
            // InternalCimpl.g:1184:2: '\\r'
            {
             before(grammarAccess.getCodeSystemAccess().getCarriageReturnKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCodeSystemAccess().getCarriageReturnKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeSystem__Group__2__Impl"


    // $ANTLR start "rule__EntryElement__Group__0"
    // InternalCimpl.g:1194:1: rule__EntryElement__Group__0 : rule__EntryElement__Group__0__Impl rule__EntryElement__Group__1 ;
    public final void rule__EntryElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1198:1: ( rule__EntryElement__Group__0__Impl rule__EntryElement__Group__1 )
            // InternalCimpl.g:1199:2: rule__EntryElement__Group__0__Impl rule__EntryElement__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__EntryElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntryElement__Group__1();

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
    // $ANTLR end "rule__EntryElement__Group__0"


    // $ANTLR start "rule__EntryElement__Group__0__Impl"
    // InternalCimpl.g:1206:1: rule__EntryElement__Group__0__Impl : ( '\\r\\nEntryElement:' ) ;
    public final void rule__EntryElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1210:1: ( ( '\\r\\nEntryElement:' ) )
            // InternalCimpl.g:1211:1: ( '\\r\\nEntryElement:' )
            {
            // InternalCimpl.g:1211:1: ( '\\r\\nEntryElement:' )
            // InternalCimpl.g:1212:2: '\\r\\nEntryElement:'
            {
             before(grammarAccess.getEntryElementAccess().getEntryElementKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getEntryElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group__0__Impl"


    // $ANTLR start "rule__EntryElement__Group__1"
    // InternalCimpl.g:1221:1: rule__EntryElement__Group__1 : rule__EntryElement__Group__1__Impl rule__EntryElement__Group__2 ;
    public final void rule__EntryElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1225:1: ( rule__EntryElement__Group__1__Impl rule__EntryElement__Group__2 )
            // InternalCimpl.g:1226:2: rule__EntryElement__Group__1__Impl rule__EntryElement__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__EntryElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntryElement__Group__2();

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
    // $ANTLR end "rule__EntryElement__Group__1"


    // $ANTLR start "rule__EntryElement__Group__1__Impl"
    // InternalCimpl.g:1233:1: rule__EntryElement__Group__1__Impl : ( ( rule__EntryElement__NameAssignment_1 ) ) ;
    public final void rule__EntryElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1237:1: ( ( ( rule__EntryElement__NameAssignment_1 ) ) )
            // InternalCimpl.g:1238:1: ( ( rule__EntryElement__NameAssignment_1 ) )
            {
            // InternalCimpl.g:1238:1: ( ( rule__EntryElement__NameAssignment_1 ) )
            // InternalCimpl.g:1239:2: ( rule__EntryElement__NameAssignment_1 )
            {
             before(grammarAccess.getEntryElementAccess().getNameAssignment_1()); 
            // InternalCimpl.g:1240:2: ( rule__EntryElement__NameAssignment_1 )
            // InternalCimpl.g:1240:3: rule__EntryElement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EntryElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntryElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group__1__Impl"


    // $ANTLR start "rule__EntryElement__Group__2"
    // InternalCimpl.g:1248:1: rule__EntryElement__Group__2 : rule__EntryElement__Group__2__Impl rule__EntryElement__Group__3 ;
    public final void rule__EntryElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1252:1: ( rule__EntryElement__Group__2__Impl rule__EntryElement__Group__3 )
            // InternalCimpl.g:1253:2: rule__EntryElement__Group__2__Impl rule__EntryElement__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__EntryElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntryElement__Group__3();

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
    // $ANTLR end "rule__EntryElement__Group__2"


    // $ANTLR start "rule__EntryElement__Group__2__Impl"
    // InternalCimpl.g:1260:1: rule__EntryElement__Group__2__Impl : ( '\\r\\n' ) ;
    public final void rule__EntryElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1264:1: ( ( '\\r\\n' ) )
            // InternalCimpl.g:1265:1: ( '\\r\\n' )
            {
            // InternalCimpl.g:1265:1: ( '\\r\\n' )
            // InternalCimpl.g:1266:2: '\\r\\n'
            {
             before(grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group__2__Impl"


    // $ANTLR start "rule__EntryElement__Group__3"
    // InternalCimpl.g:1275:1: rule__EntryElement__Group__3 : rule__EntryElement__Group__3__Impl rule__EntryElement__Group__4 ;
    public final void rule__EntryElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1279:1: ( rule__EntryElement__Group__3__Impl rule__EntryElement__Group__4 )
            // InternalCimpl.g:1280:2: rule__EntryElement__Group__3__Impl rule__EntryElement__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__EntryElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntryElement__Group__4();

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
    // $ANTLR end "rule__EntryElement__Group__3"


    // $ANTLR start "rule__EntryElement__Group__3__Impl"
    // InternalCimpl.g:1287:1: rule__EntryElement__Group__3__Impl : ( ( rule__EntryElement__Group_3__0 )? ) ;
    public final void rule__EntryElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1291:1: ( ( ( rule__EntryElement__Group_3__0 )? ) )
            // InternalCimpl.g:1292:1: ( ( rule__EntryElement__Group_3__0 )? )
            {
            // InternalCimpl.g:1292:1: ( ( rule__EntryElement__Group_3__0 )? )
            // InternalCimpl.g:1293:2: ( rule__EntryElement__Group_3__0 )?
            {
             before(grammarAccess.getEntryElementAccess().getGroup_3()); 
            // InternalCimpl.g:1294:2: ( rule__EntryElement__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==39) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCimpl.g:1294:3: rule__EntryElement__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EntryElement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntryElementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group__3__Impl"


    // $ANTLR start "rule__EntryElement__Group__4"
    // InternalCimpl.g:1302:1: rule__EntryElement__Group__4 : rule__EntryElement__Group__4__Impl rule__EntryElement__Group__5 ;
    public final void rule__EntryElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1306:1: ( rule__EntryElement__Group__4__Impl rule__EntryElement__Group__5 )
            // InternalCimpl.g:1307:2: rule__EntryElement__Group__4__Impl rule__EntryElement__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__EntryElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntryElement__Group__5();

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
    // $ANTLR end "rule__EntryElement__Group__4"


    // $ANTLR start "rule__EntryElement__Group__4__Impl"
    // InternalCimpl.g:1314:1: rule__EntryElement__Group__4__Impl : ( 'Concept:' ) ;
    public final void rule__EntryElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1318:1: ( ( 'Concept:' ) )
            // InternalCimpl.g:1319:1: ( 'Concept:' )
            {
            // InternalCimpl.g:1319:1: ( 'Concept:' )
            // InternalCimpl.g:1320:2: 'Concept:'
            {
             before(grammarAccess.getEntryElementAccess().getConceptKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getConceptKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group__4__Impl"


    // $ANTLR start "rule__EntryElement__Group__5"
    // InternalCimpl.g:1329:1: rule__EntryElement__Group__5 : rule__EntryElement__Group__5__Impl rule__EntryElement__Group__6 ;
    public final void rule__EntryElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1333:1: ( rule__EntryElement__Group__5__Impl rule__EntryElement__Group__6 )
            // InternalCimpl.g:1334:2: rule__EntryElement__Group__5__Impl rule__EntryElement__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__EntryElement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntryElement__Group__6();

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
    // $ANTLR end "rule__EntryElement__Group__5"


    // $ANTLR start "rule__EntryElement__Group__5__Impl"
    // InternalCimpl.g:1341:1: rule__EntryElement__Group__5__Impl : ( ( rule__EntryElement__ConceptAssignment_5 ) ) ;
    public final void rule__EntryElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1345:1: ( ( ( rule__EntryElement__ConceptAssignment_5 ) ) )
            // InternalCimpl.g:1346:1: ( ( rule__EntryElement__ConceptAssignment_5 ) )
            {
            // InternalCimpl.g:1346:1: ( ( rule__EntryElement__ConceptAssignment_5 ) )
            // InternalCimpl.g:1347:2: ( rule__EntryElement__ConceptAssignment_5 )
            {
             before(grammarAccess.getEntryElementAccess().getConceptAssignment_5()); 
            // InternalCimpl.g:1348:2: ( rule__EntryElement__ConceptAssignment_5 )
            // InternalCimpl.g:1348:3: rule__EntryElement__ConceptAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__EntryElement__ConceptAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEntryElementAccess().getConceptAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group__5__Impl"


    // $ANTLR start "rule__EntryElement__Group__6"
    // InternalCimpl.g:1356:1: rule__EntryElement__Group__6 : rule__EntryElement__Group__6__Impl rule__EntryElement__Group__7 ;
    public final void rule__EntryElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1360:1: ( rule__EntryElement__Group__6__Impl rule__EntryElement__Group__7 )
            // InternalCimpl.g:1361:2: rule__EntryElement__Group__6__Impl rule__EntryElement__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__EntryElement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntryElement__Group__7();

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
    // $ANTLR end "rule__EntryElement__Group__6"


    // $ANTLR start "rule__EntryElement__Group__6__Impl"
    // InternalCimpl.g:1368:1: rule__EntryElement__Group__6__Impl : ( ( rule__EntryElement__ConceptDescriptionAssignment_6 ) ) ;
    public final void rule__EntryElement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1372:1: ( ( ( rule__EntryElement__ConceptDescriptionAssignment_6 ) ) )
            // InternalCimpl.g:1373:1: ( ( rule__EntryElement__ConceptDescriptionAssignment_6 ) )
            {
            // InternalCimpl.g:1373:1: ( ( rule__EntryElement__ConceptDescriptionAssignment_6 ) )
            // InternalCimpl.g:1374:2: ( rule__EntryElement__ConceptDescriptionAssignment_6 )
            {
             before(grammarAccess.getEntryElementAccess().getConceptDescriptionAssignment_6()); 
            // InternalCimpl.g:1375:2: ( rule__EntryElement__ConceptDescriptionAssignment_6 )
            // InternalCimpl.g:1375:3: rule__EntryElement__ConceptDescriptionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__EntryElement__ConceptDescriptionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getEntryElementAccess().getConceptDescriptionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group__6__Impl"


    // $ANTLR start "rule__EntryElement__Group__7"
    // InternalCimpl.g:1383:1: rule__EntryElement__Group__7 : rule__EntryElement__Group__7__Impl rule__EntryElement__Group__8 ;
    public final void rule__EntryElement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1387:1: ( rule__EntryElement__Group__7__Impl rule__EntryElement__Group__8 )
            // InternalCimpl.g:1388:2: rule__EntryElement__Group__7__Impl rule__EntryElement__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__EntryElement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntryElement__Group__8();

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
    // $ANTLR end "rule__EntryElement__Group__7"


    // $ANTLR start "rule__EntryElement__Group__7__Impl"
    // InternalCimpl.g:1395:1: rule__EntryElement__Group__7__Impl : ( '\\r\\n' ) ;
    public final void rule__EntryElement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1399:1: ( ( '\\r\\n' ) )
            // InternalCimpl.g:1400:1: ( '\\r\\n' )
            {
            // InternalCimpl.g:1400:1: ( '\\r\\n' )
            // InternalCimpl.g:1401:2: '\\r\\n'
            {
             before(grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group__7__Impl"


    // $ANTLR start "rule__EntryElement__Group__8"
    // InternalCimpl.g:1410:1: rule__EntryElement__Group__8 : rule__EntryElement__Group__8__Impl rule__EntryElement__Group__9 ;
    public final void rule__EntryElement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1414:1: ( rule__EntryElement__Group__8__Impl rule__EntryElement__Group__9 )
            // InternalCimpl.g:1415:2: rule__EntryElement__Group__8__Impl rule__EntryElement__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__EntryElement__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntryElement__Group__9();

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
    // $ANTLR end "rule__EntryElement__Group__8"


    // $ANTLR start "rule__EntryElement__Group__8__Impl"
    // InternalCimpl.g:1422:1: rule__EntryElement__Group__8__Impl : ( 'Description:' ) ;
    public final void rule__EntryElement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1426:1: ( ( 'Description:' ) )
            // InternalCimpl.g:1427:1: ( 'Description:' )
            {
            // InternalCimpl.g:1427:1: ( 'Description:' )
            // InternalCimpl.g:1428:2: 'Description:'
            {
             before(grammarAccess.getEntryElementAccess().getDescriptionKeyword_8()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getDescriptionKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group__8__Impl"


    // $ANTLR start "rule__EntryElement__Group__9"
    // InternalCimpl.g:1437:1: rule__EntryElement__Group__9 : rule__EntryElement__Group__9__Impl rule__EntryElement__Group__10 ;
    public final void rule__EntryElement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1441:1: ( rule__EntryElement__Group__9__Impl rule__EntryElement__Group__10 )
            // InternalCimpl.g:1442:2: rule__EntryElement__Group__9__Impl rule__EntryElement__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__EntryElement__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntryElement__Group__10();

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
    // $ANTLR end "rule__EntryElement__Group__9"


    // $ANTLR start "rule__EntryElement__Group__9__Impl"
    // InternalCimpl.g:1449:1: rule__EntryElement__Group__9__Impl : ( ( rule__EntryElement__DescriptionAssignment_9 ) ) ;
    public final void rule__EntryElement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1453:1: ( ( ( rule__EntryElement__DescriptionAssignment_9 ) ) )
            // InternalCimpl.g:1454:1: ( ( rule__EntryElement__DescriptionAssignment_9 ) )
            {
            // InternalCimpl.g:1454:1: ( ( rule__EntryElement__DescriptionAssignment_9 ) )
            // InternalCimpl.g:1455:2: ( rule__EntryElement__DescriptionAssignment_9 )
            {
             before(grammarAccess.getEntryElementAccess().getDescriptionAssignment_9()); 
            // InternalCimpl.g:1456:2: ( rule__EntryElement__DescriptionAssignment_9 )
            // InternalCimpl.g:1456:3: rule__EntryElement__DescriptionAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__EntryElement__DescriptionAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getEntryElementAccess().getDescriptionAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group__9__Impl"


    // $ANTLR start "rule__EntryElement__Group__10"
    // InternalCimpl.g:1464:1: rule__EntryElement__Group__10 : rule__EntryElement__Group__10__Impl rule__EntryElement__Group__11 ;
    public final void rule__EntryElement__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1468:1: ( rule__EntryElement__Group__10__Impl rule__EntryElement__Group__11 )
            // InternalCimpl.g:1469:2: rule__EntryElement__Group__10__Impl rule__EntryElement__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__EntryElement__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntryElement__Group__11();

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
    // $ANTLR end "rule__EntryElement__Group__10"


    // $ANTLR start "rule__EntryElement__Group__10__Impl"
    // InternalCimpl.g:1476:1: rule__EntryElement__Group__10__Impl : ( '\\r\\n' ) ;
    public final void rule__EntryElement__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1480:1: ( ( '\\r\\n' ) )
            // InternalCimpl.g:1481:1: ( '\\r\\n' )
            {
            // InternalCimpl.g:1481:1: ( '\\r\\n' )
            // InternalCimpl.g:1482:2: '\\r\\n'
            {
             before(grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_10()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group__10__Impl"


    // $ANTLR start "rule__EntryElement__Group__11"
    // InternalCimpl.g:1491:1: rule__EntryElement__Group__11 : rule__EntryElement__Group__11__Impl rule__EntryElement__Group__12 ;
    public final void rule__EntryElement__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1495:1: ( rule__EntryElement__Group__11__Impl rule__EntryElement__Group__12 )
            // InternalCimpl.g:1496:2: rule__EntryElement__Group__11__Impl rule__EntryElement__Group__12
            {
            pushFollow(FOLLOW_10);
            rule__EntryElement__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntryElement__Group__12();

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
    // $ANTLR end "rule__EntryElement__Group__11"


    // $ANTLR start "rule__EntryElement__Group__11__Impl"
    // InternalCimpl.g:1503:1: rule__EntryElement__Group__11__Impl : ( ( rule__EntryElement__Group_11__0 ) ) ;
    public final void rule__EntryElement__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1507:1: ( ( ( rule__EntryElement__Group_11__0 ) ) )
            // InternalCimpl.g:1508:1: ( ( rule__EntryElement__Group_11__0 ) )
            {
            // InternalCimpl.g:1508:1: ( ( rule__EntryElement__Group_11__0 ) )
            // InternalCimpl.g:1509:2: ( rule__EntryElement__Group_11__0 )
            {
             before(grammarAccess.getEntryElementAccess().getGroup_11()); 
            // InternalCimpl.g:1510:2: ( rule__EntryElement__Group_11__0 )
            // InternalCimpl.g:1510:3: rule__EntryElement__Group_11__0
            {
            pushFollow(FOLLOW_2);
            rule__EntryElement__Group_11__0();

            state._fsp--;


            }

             after(grammarAccess.getEntryElementAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group__11__Impl"


    // $ANTLR start "rule__EntryElement__Group__12"
    // InternalCimpl.g:1518:1: rule__EntryElement__Group__12 : rule__EntryElement__Group__12__Impl ;
    public final void rule__EntryElement__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1522:1: ( rule__EntryElement__Group__12__Impl )
            // InternalCimpl.g:1523:2: rule__EntryElement__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntryElement__Group__12__Impl();

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
    // $ANTLR end "rule__EntryElement__Group__12"


    // $ANTLR start "rule__EntryElement__Group__12__Impl"
    // InternalCimpl.g:1529:1: rule__EntryElement__Group__12__Impl : ( ( rule__EntryElement__SubsetsAssignment_12 )? ) ;
    public final void rule__EntryElement__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1533:1: ( ( ( rule__EntryElement__SubsetsAssignment_12 )? ) )
            // InternalCimpl.g:1534:1: ( ( rule__EntryElement__SubsetsAssignment_12 )? )
            {
            // InternalCimpl.g:1534:1: ( ( rule__EntryElement__SubsetsAssignment_12 )? )
            // InternalCimpl.g:1535:2: ( rule__EntryElement__SubsetsAssignment_12 )?
            {
             before(grammarAccess.getEntryElementAccess().getSubsetsAssignment_12()); 
            // InternalCimpl.g:1536:2: ( rule__EntryElement__SubsetsAssignment_12 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=12 && LA8_0<=29)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCimpl.g:1536:3: rule__EntryElement__SubsetsAssignment_12
                    {
                    pushFollow(FOLLOW_2);
                    rule__EntryElement__SubsetsAssignment_12();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntryElementAccess().getSubsetsAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group__12__Impl"


    // $ANTLR start "rule__EntryElement__Group_3__0"
    // InternalCimpl.g:1545:1: rule__EntryElement__Group_3__0 : rule__EntryElement__Group_3__0__Impl rule__EntryElement__Group_3__1 ;
    public final void rule__EntryElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1549:1: ( rule__EntryElement__Group_3__0__Impl rule__EntryElement__Group_3__1 )
            // InternalCimpl.g:1550:2: rule__EntryElement__Group_3__0__Impl rule__EntryElement__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__EntryElement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntryElement__Group_3__1();

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
    // $ANTLR end "rule__EntryElement__Group_3__0"


    // $ANTLR start "rule__EntryElement__Group_3__0__Impl"
    // InternalCimpl.g:1557:1: rule__EntryElement__Group_3__0__Impl : ( 'Based on:' ) ;
    public final void rule__EntryElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1561:1: ( ( 'Based on:' ) )
            // InternalCimpl.g:1562:1: ( 'Based on:' )
            {
            // InternalCimpl.g:1562:1: ( 'Based on:' )
            // InternalCimpl.g:1563:2: 'Based on:'
            {
             before(grammarAccess.getEntryElementAccess().getBasedOnKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getBasedOnKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group_3__0__Impl"


    // $ANTLR start "rule__EntryElement__Group_3__1"
    // InternalCimpl.g:1572:1: rule__EntryElement__Group_3__1 : rule__EntryElement__Group_3__1__Impl rule__EntryElement__Group_3__2 ;
    public final void rule__EntryElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1576:1: ( rule__EntryElement__Group_3__1__Impl rule__EntryElement__Group_3__2 )
            // InternalCimpl.g:1577:2: rule__EntryElement__Group_3__1__Impl rule__EntryElement__Group_3__2
            {
            pushFollow(FOLLOW_11);
            rule__EntryElement__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntryElement__Group_3__2();

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
    // $ANTLR end "rule__EntryElement__Group_3__1"


    // $ANTLR start "rule__EntryElement__Group_3__1__Impl"
    // InternalCimpl.g:1584:1: rule__EntryElement__Group_3__1__Impl : ( ( rule__EntryElement__BasedOnAssignment_3_1 ) ) ;
    public final void rule__EntryElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1588:1: ( ( ( rule__EntryElement__BasedOnAssignment_3_1 ) ) )
            // InternalCimpl.g:1589:1: ( ( rule__EntryElement__BasedOnAssignment_3_1 ) )
            {
            // InternalCimpl.g:1589:1: ( ( rule__EntryElement__BasedOnAssignment_3_1 ) )
            // InternalCimpl.g:1590:2: ( rule__EntryElement__BasedOnAssignment_3_1 )
            {
             before(grammarAccess.getEntryElementAccess().getBasedOnAssignment_3_1()); 
            // InternalCimpl.g:1591:2: ( rule__EntryElement__BasedOnAssignment_3_1 )
            // InternalCimpl.g:1591:3: rule__EntryElement__BasedOnAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EntryElement__BasedOnAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntryElementAccess().getBasedOnAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group_3__1__Impl"


    // $ANTLR start "rule__EntryElement__Group_3__2"
    // InternalCimpl.g:1599:1: rule__EntryElement__Group_3__2 : rule__EntryElement__Group_3__2__Impl ;
    public final void rule__EntryElement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1603:1: ( rule__EntryElement__Group_3__2__Impl )
            // InternalCimpl.g:1604:2: rule__EntryElement__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntryElement__Group_3__2__Impl();

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
    // $ANTLR end "rule__EntryElement__Group_3__2"


    // $ANTLR start "rule__EntryElement__Group_3__2__Impl"
    // InternalCimpl.g:1610:1: rule__EntryElement__Group_3__2__Impl : ( '\\r\\n' ) ;
    public final void rule__EntryElement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1614:1: ( ( '\\r\\n' ) )
            // InternalCimpl.g:1615:1: ( '\\r\\n' )
            {
            // InternalCimpl.g:1615:1: ( '\\r\\n' )
            // InternalCimpl.g:1616:2: '\\r\\n'
            {
             before(grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_3_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group_3__2__Impl"


    // $ANTLR start "rule__EntryElement__Group_11__0"
    // InternalCimpl.g:1626:1: rule__EntryElement__Group_11__0 : rule__EntryElement__Group_11__0__Impl rule__EntryElement__Group_11__1 ;
    public final void rule__EntryElement__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1630:1: ( rule__EntryElement__Group_11__0__Impl rule__EntryElement__Group_11__1 )
            // InternalCimpl.g:1631:2: rule__EntryElement__Group_11__0__Impl rule__EntryElement__Group_11__1
            {
            pushFollow(FOLLOW_16);
            rule__EntryElement__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntryElement__Group_11__1();

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
    // $ANTLR end "rule__EntryElement__Group_11__0"


    // $ANTLR start "rule__EntryElement__Group_11__0__Impl"
    // InternalCimpl.g:1638:1: rule__EntryElement__Group_11__0__Impl : ( ( rule__EntryElement__RedefinitionsAssignment_11_0 )? ) ;
    public final void rule__EntryElement__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1642:1: ( ( ( rule__EntryElement__RedefinitionsAssignment_11_0 )? ) )
            // InternalCimpl.g:1643:1: ( ( rule__EntryElement__RedefinitionsAssignment_11_0 )? )
            {
            // InternalCimpl.g:1643:1: ( ( rule__EntryElement__RedefinitionsAssignment_11_0 )? )
            // InternalCimpl.g:1644:2: ( rule__EntryElement__RedefinitionsAssignment_11_0 )?
            {
             before(grammarAccess.getEntryElementAccess().getRedefinitionsAssignment_11_0()); 
            // InternalCimpl.g:1645:2: ( rule__EntryElement__RedefinitionsAssignment_11_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT||(LA9_0>=12 && LA9_0<=29)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCimpl.g:1645:3: rule__EntryElement__RedefinitionsAssignment_11_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EntryElement__RedefinitionsAssignment_11_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntryElementAccess().getRedefinitionsAssignment_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group_11__0__Impl"


    // $ANTLR start "rule__EntryElement__Group_11__1"
    // InternalCimpl.g:1653:1: rule__EntryElement__Group_11__1 : rule__EntryElement__Group_11__1__Impl rule__EntryElement__Group_11__2 ;
    public final void rule__EntryElement__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1657:1: ( rule__EntryElement__Group_11__1__Impl rule__EntryElement__Group_11__2 )
            // InternalCimpl.g:1658:2: rule__EntryElement__Group_11__1__Impl rule__EntryElement__Group_11__2
            {
            pushFollow(FOLLOW_16);
            rule__EntryElement__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntryElement__Group_11__2();

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
    // $ANTLR end "rule__EntryElement__Group_11__1"


    // $ANTLR start "rule__EntryElement__Group_11__1__Impl"
    // InternalCimpl.g:1665:1: rule__EntryElement__Group_11__1__Impl : ( ( rule__EntryElement__Group_11_1__0 )* ) ;
    public final void rule__EntryElement__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1669:1: ( ( ( rule__EntryElement__Group_11_1__0 )* ) )
            // InternalCimpl.g:1670:1: ( ( rule__EntryElement__Group_11_1__0 )* )
            {
            // InternalCimpl.g:1670:1: ( ( rule__EntryElement__Group_11_1__0 )* )
            // InternalCimpl.g:1671:2: ( rule__EntryElement__Group_11_1__0 )*
            {
             before(grammarAccess.getEntryElementAccess().getGroup_11_1()); 
            // InternalCimpl.g:1672:2: ( rule__EntryElement__Group_11_1__0 )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalCimpl.g:1672:3: rule__EntryElement__Group_11_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__EntryElement__Group_11_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getEntryElementAccess().getGroup_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group_11__1__Impl"


    // $ANTLR start "rule__EntryElement__Group_11__2"
    // InternalCimpl.g:1680:1: rule__EntryElement__Group_11__2 : rule__EntryElement__Group_11__2__Impl ;
    public final void rule__EntryElement__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1684:1: ( rule__EntryElement__Group_11__2__Impl )
            // InternalCimpl.g:1685:2: rule__EntryElement__Group_11__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntryElement__Group_11__2__Impl();

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
    // $ANTLR end "rule__EntryElement__Group_11__2"


    // $ANTLR start "rule__EntryElement__Group_11__2__Impl"
    // InternalCimpl.g:1691:1: rule__EntryElement__Group_11__2__Impl : ( '\\r\\n' ) ;
    public final void rule__EntryElement__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1695:1: ( ( '\\r\\n' ) )
            // InternalCimpl.g:1696:1: ( '\\r\\n' )
            {
            // InternalCimpl.g:1696:1: ( '\\r\\n' )
            // InternalCimpl.g:1697:2: '\\r\\n'
            {
             before(grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_11_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group_11__2__Impl"


    // $ANTLR start "rule__EntryElement__Group_11_1__0"
    // InternalCimpl.g:1707:1: rule__EntryElement__Group_11_1__0 : rule__EntryElement__Group_11_1__0__Impl rule__EntryElement__Group_11_1__1 ;
    public final void rule__EntryElement__Group_11_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1711:1: ( rule__EntryElement__Group_11_1__0__Impl rule__EntryElement__Group_11_1__1 )
            // InternalCimpl.g:1712:2: rule__EntryElement__Group_11_1__0__Impl rule__EntryElement__Group_11_1__1
            {
            pushFollow(FOLLOW_18);
            rule__EntryElement__Group_11_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntryElement__Group_11_1__1();

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
    // $ANTLR end "rule__EntryElement__Group_11_1__0"


    // $ANTLR start "rule__EntryElement__Group_11_1__0__Impl"
    // InternalCimpl.g:1719:1: rule__EntryElement__Group_11_1__0__Impl : ( '\\r\\n' ) ;
    public final void rule__EntryElement__Group_11_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1723:1: ( ( '\\r\\n' ) )
            // InternalCimpl.g:1724:1: ( '\\r\\n' )
            {
            // InternalCimpl.g:1724:1: ( '\\r\\n' )
            // InternalCimpl.g:1725:2: '\\r\\n'
            {
             before(grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_11_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group_11_1__0__Impl"


    // $ANTLR start "rule__EntryElement__Group_11_1__1"
    // InternalCimpl.g:1734:1: rule__EntryElement__Group_11_1__1 : rule__EntryElement__Group_11_1__1__Impl ;
    public final void rule__EntryElement__Group_11_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1738:1: ( rule__EntryElement__Group_11_1__1__Impl )
            // InternalCimpl.g:1739:2: rule__EntryElement__Group_11_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntryElement__Group_11_1__1__Impl();

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
    // $ANTLR end "rule__EntryElement__Group_11_1__1"


    // $ANTLR start "rule__EntryElement__Group_11_1__1__Impl"
    // InternalCimpl.g:1745:1: rule__EntryElement__Group_11_1__1__Impl : ( ( rule__EntryElement__RedefinitionsAssignment_11_1_1 ) ) ;
    public final void rule__EntryElement__Group_11_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1749:1: ( ( ( rule__EntryElement__RedefinitionsAssignment_11_1_1 ) ) )
            // InternalCimpl.g:1750:1: ( ( rule__EntryElement__RedefinitionsAssignment_11_1_1 ) )
            {
            // InternalCimpl.g:1750:1: ( ( rule__EntryElement__RedefinitionsAssignment_11_1_1 ) )
            // InternalCimpl.g:1751:2: ( rule__EntryElement__RedefinitionsAssignment_11_1_1 )
            {
             before(grammarAccess.getEntryElementAccess().getRedefinitionsAssignment_11_1_1()); 
            // InternalCimpl.g:1752:2: ( rule__EntryElement__RedefinitionsAssignment_11_1_1 )
            // InternalCimpl.g:1752:3: rule__EntryElement__RedefinitionsAssignment_11_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EntryElement__RedefinitionsAssignment_11_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEntryElementAccess().getRedefinitionsAssignment_11_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group_11_1__1__Impl"


    // $ANTLR start "rule__Subsets__Group__0"
    // InternalCimpl.g:1761:1: rule__Subsets__Group__0 : rule__Subsets__Group__0__Impl rule__Subsets__Group__1 ;
    public final void rule__Subsets__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1765:1: ( rule__Subsets__Group__0__Impl rule__Subsets__Group__1 )
            // InternalCimpl.g:1766:2: rule__Subsets__Group__0__Impl rule__Subsets__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Subsets__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subsets__Group__1();

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
    // $ANTLR end "rule__Subsets__Group__0"


    // $ANTLR start "rule__Subsets__Group__0__Impl"
    // InternalCimpl.g:1773:1: rule__Subsets__Group__0__Impl : ( ( rule__Subsets__NameAssignment_0 ) ) ;
    public final void rule__Subsets__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1777:1: ( ( ( rule__Subsets__NameAssignment_0 ) ) )
            // InternalCimpl.g:1778:1: ( ( rule__Subsets__NameAssignment_0 ) )
            {
            // InternalCimpl.g:1778:1: ( ( rule__Subsets__NameAssignment_0 ) )
            // InternalCimpl.g:1779:2: ( rule__Subsets__NameAssignment_0 )
            {
             before(grammarAccess.getSubsetsAccess().getNameAssignment_0()); 
            // InternalCimpl.g:1780:2: ( rule__Subsets__NameAssignment_0 )
            // InternalCimpl.g:1780:3: rule__Subsets__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Subsets__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSubsetsAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsets__Group__0__Impl"


    // $ANTLR start "rule__Subsets__Group__1"
    // InternalCimpl.g:1788:1: rule__Subsets__Group__1 : rule__Subsets__Group__1__Impl rule__Subsets__Group__2 ;
    public final void rule__Subsets__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1792:1: ( rule__Subsets__Group__1__Impl rule__Subsets__Group__2 )
            // InternalCimpl.g:1793:2: rule__Subsets__Group__1__Impl rule__Subsets__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Subsets__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subsets__Group__2();

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
    // $ANTLR end "rule__Subsets__Group__1"


    // $ANTLR start "rule__Subsets__Group__1__Impl"
    // InternalCimpl.g:1800:1: rule__Subsets__Group__1__Impl : ( '\\r\\n' ) ;
    public final void rule__Subsets__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1804:1: ( ( '\\r\\n' ) )
            // InternalCimpl.g:1805:1: ( '\\r\\n' )
            {
            // InternalCimpl.g:1805:1: ( '\\r\\n' )
            // InternalCimpl.g:1806:2: '\\r\\n'
            {
             before(grammarAccess.getSubsetsAccess().getControl000dControl000aKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSubsetsAccess().getControl000dControl000aKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsets__Group__1__Impl"


    // $ANTLR start "rule__Subsets__Group__2"
    // InternalCimpl.g:1815:1: rule__Subsets__Group__2 : rule__Subsets__Group__2__Impl rule__Subsets__Group__3 ;
    public final void rule__Subsets__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1819:1: ( rule__Subsets__Group__2__Impl rule__Subsets__Group__3 )
            // InternalCimpl.g:1820:2: rule__Subsets__Group__2__Impl rule__Subsets__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Subsets__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subsets__Group__3();

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
    // $ANTLR end "rule__Subsets__Group__2"


    // $ANTLR start "rule__Subsets__Group__2__Impl"
    // InternalCimpl.g:1827:1: rule__Subsets__Group__2__Impl : ( ( rule__Subsets__SubsetsAssignment_2 )? ) ;
    public final void rule__Subsets__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1831:1: ( ( ( rule__Subsets__SubsetsAssignment_2 )? ) )
            // InternalCimpl.g:1832:1: ( ( rule__Subsets__SubsetsAssignment_2 )? )
            {
            // InternalCimpl.g:1832:1: ( ( rule__Subsets__SubsetsAssignment_2 )? )
            // InternalCimpl.g:1833:2: ( rule__Subsets__SubsetsAssignment_2 )?
            {
             before(grammarAccess.getSubsetsAccess().getSubsetsAssignment_2()); 
            // InternalCimpl.g:1834:2: ( rule__Subsets__SubsetsAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==40) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCimpl.g:1834:3: rule__Subsets__SubsetsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subsets__SubsetsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubsetsAccess().getSubsetsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsets__Group__2__Impl"


    // $ANTLR start "rule__Subsets__Group__3"
    // InternalCimpl.g:1842:1: rule__Subsets__Group__3 : rule__Subsets__Group__3__Impl rule__Subsets__Group__4 ;
    public final void rule__Subsets__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1846:1: ( rule__Subsets__Group__3__Impl rule__Subsets__Group__4 )
            // InternalCimpl.g:1847:2: rule__Subsets__Group__3__Impl rule__Subsets__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Subsets__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subsets__Group__4();

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
    // $ANTLR end "rule__Subsets__Group__3"


    // $ANTLR start "rule__Subsets__Group__3__Impl"
    // InternalCimpl.g:1854:1: rule__Subsets__Group__3__Impl : ( ( rule__Subsets__Group_3__0 )* ) ;
    public final void rule__Subsets__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1858:1: ( ( ( rule__Subsets__Group_3__0 )* ) )
            // InternalCimpl.g:1859:1: ( ( rule__Subsets__Group_3__0 )* )
            {
            // InternalCimpl.g:1859:1: ( ( rule__Subsets__Group_3__0 )* )
            // InternalCimpl.g:1860:2: ( rule__Subsets__Group_3__0 )*
            {
             before(grammarAccess.getSubsetsAccess().getGroup_3()); 
            // InternalCimpl.g:1861:2: ( rule__Subsets__Group_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==40) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalCimpl.g:1861:3: rule__Subsets__Group_3__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Subsets__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSubsetsAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsets__Group__3__Impl"


    // $ANTLR start "rule__Subsets__Group__4"
    // InternalCimpl.g:1869:1: rule__Subsets__Group__4 : rule__Subsets__Group__4__Impl ;
    public final void rule__Subsets__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1873:1: ( rule__Subsets__Group__4__Impl )
            // InternalCimpl.g:1874:2: rule__Subsets__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subsets__Group__4__Impl();

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
    // $ANTLR end "rule__Subsets__Group__4"


    // $ANTLR start "rule__Subsets__Group__4__Impl"
    // InternalCimpl.g:1880:1: rule__Subsets__Group__4__Impl : ( '\\r\\n' ) ;
    public final void rule__Subsets__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1884:1: ( ( '\\r\\n' ) )
            // InternalCimpl.g:1885:1: ( '\\r\\n' )
            {
            // InternalCimpl.g:1885:1: ( '\\r\\n' )
            // InternalCimpl.g:1886:2: '\\r\\n'
            {
             before(grammarAccess.getSubsetsAccess().getControl000dControl000aKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSubsetsAccess().getControl000dControl000aKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsets__Group__4__Impl"


    // $ANTLR start "rule__Subsets__Group_3__0"
    // InternalCimpl.g:1896:1: rule__Subsets__Group_3__0 : rule__Subsets__Group_3__0__Impl rule__Subsets__Group_3__1 ;
    public final void rule__Subsets__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1900:1: ( rule__Subsets__Group_3__0__Impl rule__Subsets__Group_3__1 )
            // InternalCimpl.g:1901:2: rule__Subsets__Group_3__0__Impl rule__Subsets__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__Subsets__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subsets__Group_3__1();

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
    // $ANTLR end "rule__Subsets__Group_3__0"


    // $ANTLR start "rule__Subsets__Group_3__0__Impl"
    // InternalCimpl.g:1908:1: rule__Subsets__Group_3__0__Impl : ( '\\r\\n' ) ;
    public final void rule__Subsets__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1912:1: ( ( '\\r\\n' ) )
            // InternalCimpl.g:1913:1: ( '\\r\\n' )
            {
            // InternalCimpl.g:1913:1: ( '\\r\\n' )
            // InternalCimpl.g:1914:2: '\\r\\n'
            {
             before(grammarAccess.getSubsetsAccess().getControl000dControl000aKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSubsetsAccess().getControl000dControl000aKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsets__Group_3__0__Impl"


    // $ANTLR start "rule__Subsets__Group_3__1"
    // InternalCimpl.g:1923:1: rule__Subsets__Group_3__1 : rule__Subsets__Group_3__1__Impl ;
    public final void rule__Subsets__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1927:1: ( rule__Subsets__Group_3__1__Impl )
            // InternalCimpl.g:1928:2: rule__Subsets__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subsets__Group_3__1__Impl();

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
    // $ANTLR end "rule__Subsets__Group_3__1"


    // $ANTLR start "rule__Subsets__Group_3__1__Impl"
    // InternalCimpl.g:1934:1: rule__Subsets__Group_3__1__Impl : ( ( rule__Subsets__SubsetsAssignment_3_1 ) ) ;
    public final void rule__Subsets__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1938:1: ( ( ( rule__Subsets__SubsetsAssignment_3_1 ) ) )
            // InternalCimpl.g:1939:1: ( ( rule__Subsets__SubsetsAssignment_3_1 ) )
            {
            // InternalCimpl.g:1939:1: ( ( rule__Subsets__SubsetsAssignment_3_1 ) )
            // InternalCimpl.g:1940:2: ( rule__Subsets__SubsetsAssignment_3_1 )
            {
             before(grammarAccess.getSubsetsAccess().getSubsetsAssignment_3_1()); 
            // InternalCimpl.g:1941:2: ( rule__Subsets__SubsetsAssignment_3_1 )
            // InternalCimpl.g:1941:3: rule__Subsets__SubsetsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Subsets__SubsetsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSubsetsAccess().getSubsetsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsets__Group_3__1__Impl"


    // $ANTLR start "rule__Subset__Group__0"
    // InternalCimpl.g:1950:1: rule__Subset__Group__0 : rule__Subset__Group__0__Impl rule__Subset__Group__1 ;
    public final void rule__Subset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1954:1: ( rule__Subset__Group__0__Impl rule__Subset__Group__1 )
            // InternalCimpl.g:1955:2: rule__Subset__Group__0__Impl rule__Subset__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Subset__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subset__Group__1();

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
    // $ANTLR end "rule__Subset__Group__0"


    // $ANTLR start "rule__Subset__Group__0__Impl"
    // InternalCimpl.g:1962:1: rule__Subset__Group__0__Impl : ( 'includes' ) ;
    public final void rule__Subset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1966:1: ( ( 'includes' ) )
            // InternalCimpl.g:1967:1: ( 'includes' )
            {
            // InternalCimpl.g:1967:1: ( 'includes' )
            // InternalCimpl.g:1968:2: 'includes'
            {
             before(grammarAccess.getSubsetAccess().getIncludesKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSubsetAccess().getIncludesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subset__Group__0__Impl"


    // $ANTLR start "rule__Subset__Group__1"
    // InternalCimpl.g:1977:1: rule__Subset__Group__1 : rule__Subset__Group__1__Impl rule__Subset__Group__2 ;
    public final void rule__Subset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1981:1: ( rule__Subset__Group__1__Impl rule__Subset__Group__2 )
            // InternalCimpl.g:1982:2: rule__Subset__Group__1__Impl rule__Subset__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Subset__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subset__Group__2();

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
    // $ANTLR end "rule__Subset__Group__1"


    // $ANTLR start "rule__Subset__Group__1__Impl"
    // InternalCimpl.g:1989:1: rule__Subset__Group__1__Impl : ( ( rule__Subset__CardinalityAssignment_1 ) ) ;
    public final void rule__Subset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1993:1: ( ( ( rule__Subset__CardinalityAssignment_1 ) ) )
            // InternalCimpl.g:1994:1: ( ( rule__Subset__CardinalityAssignment_1 ) )
            {
            // InternalCimpl.g:1994:1: ( ( rule__Subset__CardinalityAssignment_1 ) )
            // InternalCimpl.g:1995:2: ( rule__Subset__CardinalityAssignment_1 )
            {
             before(grammarAccess.getSubsetAccess().getCardinalityAssignment_1()); 
            // InternalCimpl.g:1996:2: ( rule__Subset__CardinalityAssignment_1 )
            // InternalCimpl.g:1996:3: rule__Subset__CardinalityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Subset__CardinalityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubsetAccess().getCardinalityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subset__Group__1__Impl"


    // $ANTLR start "rule__Subset__Group__2"
    // InternalCimpl.g:2004:1: rule__Subset__Group__2 : rule__Subset__Group__2__Impl ;
    public final void rule__Subset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2008:1: ( rule__Subset__Group__2__Impl )
            // InternalCimpl.g:2009:2: rule__Subset__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subset__Group__2__Impl();

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
    // $ANTLR end "rule__Subset__Group__2"


    // $ANTLR start "rule__Subset__Group__2__Impl"
    // InternalCimpl.g:2015:1: rule__Subset__Group__2__Impl : ( ( rule__Subset__TypeNameAssignment_2 ) ) ;
    public final void rule__Subset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2019:1: ( ( ( rule__Subset__TypeNameAssignment_2 ) ) )
            // InternalCimpl.g:2020:1: ( ( rule__Subset__TypeNameAssignment_2 ) )
            {
            // InternalCimpl.g:2020:1: ( ( rule__Subset__TypeNameAssignment_2 ) )
            // InternalCimpl.g:2021:2: ( rule__Subset__TypeNameAssignment_2 )
            {
             before(grammarAccess.getSubsetAccess().getTypeNameAssignment_2()); 
            // InternalCimpl.g:2022:2: ( rule__Subset__TypeNameAssignment_2 )
            // InternalCimpl.g:2022:3: rule__Subset__TypeNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Subset__TypeNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubsetAccess().getTypeNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subset__Group__2__Impl"


    // $ANTLR start "rule__Redefinition__Group__0"
    // InternalCimpl.g:2031:1: rule__Redefinition__Group__0 : rule__Redefinition__Group__0__Impl rule__Redefinition__Group__1 ;
    public final void rule__Redefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2035:1: ( rule__Redefinition__Group__0__Impl rule__Redefinition__Group__1 )
            // InternalCimpl.g:2036:2: rule__Redefinition__Group__0__Impl rule__Redefinition__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Redefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Redefinition__Group__1();

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
    // $ANTLR end "rule__Redefinition__Group__0"


    // $ANTLR start "rule__Redefinition__Group__0__Impl"
    // InternalCimpl.g:2043:1: rule__Redefinition__Group__0__Impl : ( ( rule__Redefinition__CardinalityAssignment_0 )? ) ;
    public final void rule__Redefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2047:1: ( ( ( rule__Redefinition__CardinalityAssignment_0 )? ) )
            // InternalCimpl.g:2048:1: ( ( rule__Redefinition__CardinalityAssignment_0 )? )
            {
            // InternalCimpl.g:2048:1: ( ( rule__Redefinition__CardinalityAssignment_0 )? )
            // InternalCimpl.g:2049:2: ( rule__Redefinition__CardinalityAssignment_0 )?
            {
             before(grammarAccess.getRedefinitionAccess().getCardinalityAssignment_0()); 
            // InternalCimpl.g:2050:2: ( rule__Redefinition__CardinalityAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCimpl.g:2050:3: rule__Redefinition__CardinalityAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Redefinition__CardinalityAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRedefinitionAccess().getCardinalityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redefinition__Group__0__Impl"


    // $ANTLR start "rule__Redefinition__Group__1"
    // InternalCimpl.g:2058:1: rule__Redefinition__Group__1 : rule__Redefinition__Group__1__Impl ;
    public final void rule__Redefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2062:1: ( rule__Redefinition__Group__1__Impl )
            // InternalCimpl.g:2063:2: rule__Redefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Redefinition__Group__1__Impl();

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
    // $ANTLR end "rule__Redefinition__Group__1"


    // $ANTLR start "rule__Redefinition__Group__1__Impl"
    // InternalCimpl.g:2069:1: rule__Redefinition__Group__1__Impl : ( ( rule__Redefinition__NameAssignment_1 ) ) ;
    public final void rule__Redefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2073:1: ( ( ( rule__Redefinition__NameAssignment_1 ) ) )
            // InternalCimpl.g:2074:1: ( ( rule__Redefinition__NameAssignment_1 ) )
            {
            // InternalCimpl.g:2074:1: ( ( rule__Redefinition__NameAssignment_1 ) )
            // InternalCimpl.g:2075:2: ( rule__Redefinition__NameAssignment_1 )
            {
             before(grammarAccess.getRedefinitionAccess().getNameAssignment_1()); 
            // InternalCimpl.g:2076:2: ( rule__Redefinition__NameAssignment_1 )
            // InternalCimpl.g:2076:3: rule__Redefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Redefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRedefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redefinition__Group__1__Impl"


    // $ANTLR start "rule__Cardinality__Group__0"
    // InternalCimpl.g:2085:1: rule__Cardinality__Group__0 : rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 ;
    public final void rule__Cardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2089:1: ( rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 )
            // InternalCimpl.g:2090:2: rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Cardinality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__1();

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
    // $ANTLR end "rule__Cardinality__Group__0"


    // $ANTLR start "rule__Cardinality__Group__0__Impl"
    // InternalCimpl.g:2097:1: rule__Cardinality__Group__0__Impl : ( ( rule__Cardinality__LowerAssignment_0 ) ) ;
    public final void rule__Cardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2101:1: ( ( ( rule__Cardinality__LowerAssignment_0 ) ) )
            // InternalCimpl.g:2102:1: ( ( rule__Cardinality__LowerAssignment_0 ) )
            {
            // InternalCimpl.g:2102:1: ( ( rule__Cardinality__LowerAssignment_0 ) )
            // InternalCimpl.g:2103:2: ( rule__Cardinality__LowerAssignment_0 )
            {
             before(grammarAccess.getCardinalityAccess().getLowerAssignment_0()); 
            // InternalCimpl.g:2104:2: ( rule__Cardinality__LowerAssignment_0 )
            // InternalCimpl.g:2104:3: rule__Cardinality__LowerAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__LowerAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getLowerAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__0__Impl"


    // $ANTLR start "rule__Cardinality__Group__1"
    // InternalCimpl.g:2112:1: rule__Cardinality__Group__1 : rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2 ;
    public final void rule__Cardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2116:1: ( rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2 )
            // InternalCimpl.g:2117:2: rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Cardinality__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__2();

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
    // $ANTLR end "rule__Cardinality__Group__1"


    // $ANTLR start "rule__Cardinality__Group__1__Impl"
    // InternalCimpl.g:2124:1: rule__Cardinality__Group__1__Impl : ( '..' ) ;
    public final void rule__Cardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2128:1: ( ( '..' ) )
            // InternalCimpl.g:2129:1: ( '..' )
            {
            // InternalCimpl.g:2129:1: ( '..' )
            // InternalCimpl.g:2130:2: '..'
            {
             before(grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__1__Impl"


    // $ANTLR start "rule__Cardinality__Group__2"
    // InternalCimpl.g:2139:1: rule__Cardinality__Group__2 : rule__Cardinality__Group__2__Impl ;
    public final void rule__Cardinality__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2143:1: ( rule__Cardinality__Group__2__Impl )
            // InternalCimpl.g:2144:2: rule__Cardinality__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__2__Impl();

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
    // $ANTLR end "rule__Cardinality__Group__2"


    // $ANTLR start "rule__Cardinality__Group__2__Impl"
    // InternalCimpl.g:2150:1: rule__Cardinality__Group__2__Impl : ( ( rule__Cardinality__UpperAssignment_2 ) ) ;
    public final void rule__Cardinality__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2154:1: ( ( ( rule__Cardinality__UpperAssignment_2 ) ) )
            // InternalCimpl.g:2155:1: ( ( rule__Cardinality__UpperAssignment_2 ) )
            {
            // InternalCimpl.g:2155:1: ( ( rule__Cardinality__UpperAssignment_2 ) )
            // InternalCimpl.g:2156:2: ( rule__Cardinality__UpperAssignment_2 )
            {
             before(grammarAccess.getCardinalityAccess().getUpperAssignment_2()); 
            // InternalCimpl.g:2157:2: ( rule__Cardinality__UpperAssignment_2 )
            // InternalCimpl.g:2157:3: rule__Cardinality__UpperAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__UpperAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getUpperAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__2__Impl"


    // $ANTLR start "rule__Element__Group__0"
    // InternalCimpl.g:2166:1: rule__Element__Group__0 : rule__Element__Group__0__Impl rule__Element__Group__1 ;
    public final void rule__Element__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2170:1: ( rule__Element__Group__0__Impl rule__Element__Group__1 )
            // InternalCimpl.g:2171:2: rule__Element__Group__0__Impl rule__Element__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Element__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__1();

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
    // $ANTLR end "rule__Element__Group__0"


    // $ANTLR start "rule__Element__Group__0__Impl"
    // InternalCimpl.g:2178:1: rule__Element__Group__0__Impl : ( '\\r\\nElement:' ) ;
    public final void rule__Element__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2182:1: ( ( '\\r\\nElement:' ) )
            // InternalCimpl.g:2183:1: ( '\\r\\nElement:' )
            {
            // InternalCimpl.g:2183:1: ( '\\r\\nElement:' )
            // InternalCimpl.g:2184:2: '\\r\\nElement:'
            {
             before(grammarAccess.getElementAccess().getElementKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__0__Impl"


    // $ANTLR start "rule__Element__Group__1"
    // InternalCimpl.g:2193:1: rule__Element__Group__1 : rule__Element__Group__1__Impl rule__Element__Group__2 ;
    public final void rule__Element__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2197:1: ( rule__Element__Group__1__Impl rule__Element__Group__2 )
            // InternalCimpl.g:2198:2: rule__Element__Group__1__Impl rule__Element__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Element__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__2();

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
    // $ANTLR end "rule__Element__Group__1"


    // $ANTLR start "rule__Element__Group__1__Impl"
    // InternalCimpl.g:2205:1: rule__Element__Group__1__Impl : ( ( rule__Element__NameAssignment_1 ) ) ;
    public final void rule__Element__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2209:1: ( ( ( rule__Element__NameAssignment_1 ) ) )
            // InternalCimpl.g:2210:1: ( ( rule__Element__NameAssignment_1 ) )
            {
            // InternalCimpl.g:2210:1: ( ( rule__Element__NameAssignment_1 ) )
            // InternalCimpl.g:2211:2: ( rule__Element__NameAssignment_1 )
            {
             before(grammarAccess.getElementAccess().getNameAssignment_1()); 
            // InternalCimpl.g:2212:2: ( rule__Element__NameAssignment_1 )
            // InternalCimpl.g:2212:3: rule__Element__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Element__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__1__Impl"


    // $ANTLR start "rule__Element__Group__2"
    // InternalCimpl.g:2220:1: rule__Element__Group__2 : rule__Element__Group__2__Impl rule__Element__Group__3 ;
    public final void rule__Element__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2224:1: ( rule__Element__Group__2__Impl rule__Element__Group__3 )
            // InternalCimpl.g:2225:2: rule__Element__Group__2__Impl rule__Element__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Element__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__3();

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
    // $ANTLR end "rule__Element__Group__2"


    // $ANTLR start "rule__Element__Group__2__Impl"
    // InternalCimpl.g:2232:1: rule__Element__Group__2__Impl : ( '\\r\\n' ) ;
    public final void rule__Element__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2236:1: ( ( '\\r\\n' ) )
            // InternalCimpl.g:2237:1: ( '\\r\\n' )
            {
            // InternalCimpl.g:2237:1: ( '\\r\\n' )
            // InternalCimpl.g:2238:2: '\\r\\n'
            {
             before(grammarAccess.getElementAccess().getControl000dControl000aKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getControl000dControl000aKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__2__Impl"


    // $ANTLR start "rule__Element__Group__3"
    // InternalCimpl.g:2247:1: rule__Element__Group__3 : rule__Element__Group__3__Impl rule__Element__Group__4 ;
    public final void rule__Element__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2251:1: ( rule__Element__Group__3__Impl rule__Element__Group__4 )
            // InternalCimpl.g:2252:2: rule__Element__Group__3__Impl rule__Element__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Element__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__4();

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
    // $ANTLR end "rule__Element__Group__3"


    // $ANTLR start "rule__Element__Group__3__Impl"
    // InternalCimpl.g:2259:1: rule__Element__Group__3__Impl : ( ( rule__Element__Group_3__0 )? ) ;
    public final void rule__Element__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2263:1: ( ( ( rule__Element__Group_3__0 )? ) )
            // InternalCimpl.g:2264:1: ( ( rule__Element__Group_3__0 )? )
            {
            // InternalCimpl.g:2264:1: ( ( rule__Element__Group_3__0 )? )
            // InternalCimpl.g:2265:2: ( rule__Element__Group_3__0 )?
            {
             before(grammarAccess.getElementAccess().getGroup_3()); 
            // InternalCimpl.g:2266:2: ( rule__Element__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCimpl.g:2266:3: rule__Element__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__3__Impl"


    // $ANTLR start "rule__Element__Group__4"
    // InternalCimpl.g:2274:1: rule__Element__Group__4 : rule__Element__Group__4__Impl rule__Element__Group__5 ;
    public final void rule__Element__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2278:1: ( rule__Element__Group__4__Impl rule__Element__Group__5 )
            // InternalCimpl.g:2279:2: rule__Element__Group__4__Impl rule__Element__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Element__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__5();

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
    // $ANTLR end "rule__Element__Group__4"


    // $ANTLR start "rule__Element__Group__4__Impl"
    // InternalCimpl.g:2286:1: rule__Element__Group__4__Impl : ( 'Concept:' ) ;
    public final void rule__Element__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2290:1: ( ( 'Concept:' ) )
            // InternalCimpl.g:2291:1: ( 'Concept:' )
            {
            // InternalCimpl.g:2291:1: ( 'Concept:' )
            // InternalCimpl.g:2292:2: 'Concept:'
            {
             before(grammarAccess.getElementAccess().getConceptKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getConceptKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__4__Impl"


    // $ANTLR start "rule__Element__Group__5"
    // InternalCimpl.g:2301:1: rule__Element__Group__5 : rule__Element__Group__5__Impl rule__Element__Group__6 ;
    public final void rule__Element__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2305:1: ( rule__Element__Group__5__Impl rule__Element__Group__6 )
            // InternalCimpl.g:2306:2: rule__Element__Group__5__Impl rule__Element__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Element__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__6();

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
    // $ANTLR end "rule__Element__Group__5"


    // $ANTLR start "rule__Element__Group__5__Impl"
    // InternalCimpl.g:2313:1: rule__Element__Group__5__Impl : ( ( rule__Element__ConceptAssignment_5 ) ) ;
    public final void rule__Element__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2317:1: ( ( ( rule__Element__ConceptAssignment_5 ) ) )
            // InternalCimpl.g:2318:1: ( ( rule__Element__ConceptAssignment_5 ) )
            {
            // InternalCimpl.g:2318:1: ( ( rule__Element__ConceptAssignment_5 ) )
            // InternalCimpl.g:2319:2: ( rule__Element__ConceptAssignment_5 )
            {
             before(grammarAccess.getElementAccess().getConceptAssignment_5()); 
            // InternalCimpl.g:2320:2: ( rule__Element__ConceptAssignment_5 )
            // InternalCimpl.g:2320:3: rule__Element__ConceptAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Element__ConceptAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getConceptAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__5__Impl"


    // $ANTLR start "rule__Element__Group__6"
    // InternalCimpl.g:2328:1: rule__Element__Group__6 : rule__Element__Group__6__Impl rule__Element__Group__7 ;
    public final void rule__Element__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2332:1: ( rule__Element__Group__6__Impl rule__Element__Group__7 )
            // InternalCimpl.g:2333:2: rule__Element__Group__6__Impl rule__Element__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Element__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__7();

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
    // $ANTLR end "rule__Element__Group__6"


    // $ANTLR start "rule__Element__Group__6__Impl"
    // InternalCimpl.g:2340:1: rule__Element__Group__6__Impl : ( '\\r\\n' ) ;
    public final void rule__Element__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2344:1: ( ( '\\r\\n' ) )
            // InternalCimpl.g:2345:1: ( '\\r\\n' )
            {
            // InternalCimpl.g:2345:1: ( '\\r\\n' )
            // InternalCimpl.g:2346:2: '\\r\\n'
            {
             before(grammarAccess.getElementAccess().getControl000dControl000aKeyword_6()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getControl000dControl000aKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__6__Impl"


    // $ANTLR start "rule__Element__Group__7"
    // InternalCimpl.g:2355:1: rule__Element__Group__7 : rule__Element__Group__7__Impl rule__Element__Group__8 ;
    public final void rule__Element__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2359:1: ( rule__Element__Group__7__Impl rule__Element__Group__8 )
            // InternalCimpl.g:2360:2: rule__Element__Group__7__Impl rule__Element__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Element__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__8();

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
    // $ANTLR end "rule__Element__Group__7"


    // $ANTLR start "rule__Element__Group__7__Impl"
    // InternalCimpl.g:2367:1: rule__Element__Group__7__Impl : ( 'Description:' ) ;
    public final void rule__Element__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2371:1: ( ( 'Description:' ) )
            // InternalCimpl.g:2372:1: ( 'Description:' )
            {
            // InternalCimpl.g:2372:1: ( 'Description:' )
            // InternalCimpl.g:2373:2: 'Description:'
            {
             before(grammarAccess.getElementAccess().getDescriptionKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getDescriptionKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__7__Impl"


    // $ANTLR start "rule__Element__Group__8"
    // InternalCimpl.g:2382:1: rule__Element__Group__8 : rule__Element__Group__8__Impl rule__Element__Group__9 ;
    public final void rule__Element__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2386:1: ( rule__Element__Group__8__Impl rule__Element__Group__9 )
            // InternalCimpl.g:2387:2: rule__Element__Group__8__Impl rule__Element__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Element__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__9();

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
    // $ANTLR end "rule__Element__Group__8"


    // $ANTLR start "rule__Element__Group__8__Impl"
    // InternalCimpl.g:2394:1: rule__Element__Group__8__Impl : ( ( rule__Element__DescriptionAssignment_8 ) ) ;
    public final void rule__Element__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2398:1: ( ( ( rule__Element__DescriptionAssignment_8 ) ) )
            // InternalCimpl.g:2399:1: ( ( rule__Element__DescriptionAssignment_8 ) )
            {
            // InternalCimpl.g:2399:1: ( ( rule__Element__DescriptionAssignment_8 ) )
            // InternalCimpl.g:2400:2: ( rule__Element__DescriptionAssignment_8 )
            {
             before(grammarAccess.getElementAccess().getDescriptionAssignment_8()); 
            // InternalCimpl.g:2401:2: ( rule__Element__DescriptionAssignment_8 )
            // InternalCimpl.g:2401:3: rule__Element__DescriptionAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Element__DescriptionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getDescriptionAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__8__Impl"


    // $ANTLR start "rule__Element__Group__9"
    // InternalCimpl.g:2409:1: rule__Element__Group__9 : rule__Element__Group__9__Impl rule__Element__Group__10 ;
    public final void rule__Element__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2413:1: ( rule__Element__Group__9__Impl rule__Element__Group__10 )
            // InternalCimpl.g:2414:2: rule__Element__Group__9__Impl rule__Element__Group__10
            {
            pushFollow(FOLLOW_23);
            rule__Element__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__10();

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
    // $ANTLR end "rule__Element__Group__9"


    // $ANTLR start "rule__Element__Group__9__Impl"
    // InternalCimpl.g:2421:1: rule__Element__Group__9__Impl : ( '\\r\\n' ) ;
    public final void rule__Element__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2425:1: ( ( '\\r\\n' ) )
            // InternalCimpl.g:2426:1: ( '\\r\\n' )
            {
            // InternalCimpl.g:2426:1: ( '\\r\\n' )
            // InternalCimpl.g:2427:2: '\\r\\n'
            {
             before(grammarAccess.getElementAccess().getControl000dControl000aKeyword_9()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getControl000dControl000aKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__9__Impl"


    // $ANTLR start "rule__Element__Group__10"
    // InternalCimpl.g:2436:1: rule__Element__Group__10 : rule__Element__Group__10__Impl rule__Element__Group__11 ;
    public final void rule__Element__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2440:1: ( rule__Element__Group__10__Impl rule__Element__Group__11 )
            // InternalCimpl.g:2441:2: rule__Element__Group__10__Impl rule__Element__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__Element__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__11();

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
    // $ANTLR end "rule__Element__Group__10"


    // $ANTLR start "rule__Element__Group__10__Impl"
    // InternalCimpl.g:2448:1: rule__Element__Group__10__Impl : ( 'Value:' ) ;
    public final void rule__Element__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2452:1: ( ( 'Value:' ) )
            // InternalCimpl.g:2453:1: ( 'Value:' )
            {
            // InternalCimpl.g:2453:1: ( 'Value:' )
            // InternalCimpl.g:2454:2: 'Value:'
            {
             before(grammarAccess.getElementAccess().getValueKeyword_10()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getValueKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__10__Impl"


    // $ANTLR start "rule__Element__Group__11"
    // InternalCimpl.g:2463:1: rule__Element__Group__11 : rule__Element__Group__11__Impl rule__Element__Group__12 ;
    public final void rule__Element__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2467:1: ( rule__Element__Group__11__Impl rule__Element__Group__12 )
            // InternalCimpl.g:2468:2: rule__Element__Group__11__Impl rule__Element__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__Element__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__12();

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
    // $ANTLR end "rule__Element__Group__11"


    // $ANTLR start "rule__Element__Group__11__Impl"
    // InternalCimpl.g:2475:1: rule__Element__Group__11__Impl : ( ( rule__Element__ValueAssignment_11 ) ) ;
    public final void rule__Element__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2479:1: ( ( ( rule__Element__ValueAssignment_11 ) ) )
            // InternalCimpl.g:2480:1: ( ( rule__Element__ValueAssignment_11 ) )
            {
            // InternalCimpl.g:2480:1: ( ( rule__Element__ValueAssignment_11 ) )
            // InternalCimpl.g:2481:2: ( rule__Element__ValueAssignment_11 )
            {
             before(grammarAccess.getElementAccess().getValueAssignment_11()); 
            // InternalCimpl.g:2482:2: ( rule__Element__ValueAssignment_11 )
            // InternalCimpl.g:2482:3: rule__Element__ValueAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Element__ValueAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getValueAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__11__Impl"


    // $ANTLR start "rule__Element__Group__12"
    // InternalCimpl.g:2490:1: rule__Element__Group__12 : rule__Element__Group__12__Impl ;
    public final void rule__Element__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2494:1: ( rule__Element__Group__12__Impl )
            // InternalCimpl.g:2495:2: rule__Element__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group__12__Impl();

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
    // $ANTLR end "rule__Element__Group__12"


    // $ANTLR start "rule__Element__Group__12__Impl"
    // InternalCimpl.g:2501:1: rule__Element__Group__12__Impl : ( '\\r\\n' ) ;
    public final void rule__Element__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2505:1: ( ( '\\r\\n' ) )
            // InternalCimpl.g:2506:1: ( '\\r\\n' )
            {
            // InternalCimpl.g:2506:1: ( '\\r\\n' )
            // InternalCimpl.g:2507:2: '\\r\\n'
            {
             before(grammarAccess.getElementAccess().getControl000dControl000aKeyword_12()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getControl000dControl000aKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__12__Impl"


    // $ANTLR start "rule__Element__Group_3__0"
    // InternalCimpl.g:2517:1: rule__Element__Group_3__0 : rule__Element__Group_3__0__Impl rule__Element__Group_3__1 ;
    public final void rule__Element__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2521:1: ( rule__Element__Group_3__0__Impl rule__Element__Group_3__1 )
            // InternalCimpl.g:2522:2: rule__Element__Group_3__0__Impl rule__Element__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Element__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group_3__1();

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
    // $ANTLR end "rule__Element__Group_3__0"


    // $ANTLR start "rule__Element__Group_3__0__Impl"
    // InternalCimpl.g:2529:1: rule__Element__Group_3__0__Impl : ( 'Based on:' ) ;
    public final void rule__Element__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2533:1: ( ( 'Based on:' ) )
            // InternalCimpl.g:2534:1: ( 'Based on:' )
            {
            // InternalCimpl.g:2534:1: ( 'Based on:' )
            // InternalCimpl.g:2535:2: 'Based on:'
            {
             before(grammarAccess.getElementAccess().getBasedOnKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getBasedOnKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_3__0__Impl"


    // $ANTLR start "rule__Element__Group_3__1"
    // InternalCimpl.g:2544:1: rule__Element__Group_3__1 : rule__Element__Group_3__1__Impl rule__Element__Group_3__2 ;
    public final void rule__Element__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2548:1: ( rule__Element__Group_3__1__Impl rule__Element__Group_3__2 )
            // InternalCimpl.g:2549:2: rule__Element__Group_3__1__Impl rule__Element__Group_3__2
            {
            pushFollow(FOLLOW_11);
            rule__Element__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group_3__2();

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
    // $ANTLR end "rule__Element__Group_3__1"


    // $ANTLR start "rule__Element__Group_3__1__Impl"
    // InternalCimpl.g:2556:1: rule__Element__Group_3__1__Impl : ( ( rule__Element__BasedOnAssignment_3_1 ) ) ;
    public final void rule__Element__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2560:1: ( ( ( rule__Element__BasedOnAssignment_3_1 ) ) )
            // InternalCimpl.g:2561:1: ( ( rule__Element__BasedOnAssignment_3_1 ) )
            {
            // InternalCimpl.g:2561:1: ( ( rule__Element__BasedOnAssignment_3_1 ) )
            // InternalCimpl.g:2562:2: ( rule__Element__BasedOnAssignment_3_1 )
            {
             before(grammarAccess.getElementAccess().getBasedOnAssignment_3_1()); 
            // InternalCimpl.g:2563:2: ( rule__Element__BasedOnAssignment_3_1 )
            // InternalCimpl.g:2563:3: rule__Element__BasedOnAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Element__BasedOnAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getBasedOnAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_3__1__Impl"


    // $ANTLR start "rule__Element__Group_3__2"
    // InternalCimpl.g:2571:1: rule__Element__Group_3__2 : rule__Element__Group_3__2__Impl ;
    public final void rule__Element__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2575:1: ( rule__Element__Group_3__2__Impl )
            // InternalCimpl.g:2576:2: rule__Element__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group_3__2__Impl();

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
    // $ANTLR end "rule__Element__Group_3__2"


    // $ANTLR start "rule__Element__Group_3__2__Impl"
    // InternalCimpl.g:2582:1: rule__Element__Group_3__2__Impl : ( '\\r\\n' ) ;
    public final void rule__Element__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2586:1: ( ( '\\r\\n' ) )
            // InternalCimpl.g:2587:1: ( '\\r\\n' )
            {
            // InternalCimpl.g:2587:1: ( '\\r\\n' )
            // InternalCimpl.g:2588:2: '\\r\\n'
            {
             before(grammarAccess.getElementAccess().getControl000dControl000aKeyword_3_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getControl000dControl000aKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group_3__2__Impl"


    // $ANTLR start "rule__CodeableConcept__Group__0"
    // InternalCimpl.g:2598:1: rule__CodeableConcept__Group__0 : rule__CodeableConcept__Group__0__Impl rule__CodeableConcept__Group__1 ;
    public final void rule__CodeableConcept__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2602:1: ( rule__CodeableConcept__Group__0__Impl rule__CodeableConcept__Group__1 )
            // InternalCimpl.g:2603:2: rule__CodeableConcept__Group__0__Impl rule__CodeableConcept__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__CodeableConcept__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CodeableConcept__Group__1();

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
    // $ANTLR end "rule__CodeableConcept__Group__0"


    // $ANTLR start "rule__CodeableConcept__Group__0__Impl"
    // InternalCimpl.g:2610:1: rule__CodeableConcept__Group__0__Impl : ( 'CodeableConcept from' ) ;
    public final void rule__CodeableConcept__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2614:1: ( ( 'CodeableConcept from' ) )
            // InternalCimpl.g:2615:1: ( 'CodeableConcept from' )
            {
            // InternalCimpl.g:2615:1: ( 'CodeableConcept from' )
            // InternalCimpl.g:2616:2: 'CodeableConcept from'
            {
             before(grammarAccess.getCodeableConceptAccess().getCodeableConceptFromKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getCodeableConceptAccess().getCodeableConceptFromKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeableConcept__Group__0__Impl"


    // $ANTLR start "rule__CodeableConcept__Group__1"
    // InternalCimpl.g:2625:1: rule__CodeableConcept__Group__1 : rule__CodeableConcept__Group__1__Impl ;
    public final void rule__CodeableConcept__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2629:1: ( rule__CodeableConcept__Group__1__Impl )
            // InternalCimpl.g:2630:2: rule__CodeableConcept__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CodeableConcept__Group__1__Impl();

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
    // $ANTLR end "rule__CodeableConcept__Group__1"


    // $ANTLR start "rule__CodeableConcept__Group__1__Impl"
    // InternalCimpl.g:2636:1: rule__CodeableConcept__Group__1__Impl : ( ( rule__CodeableConcept__ValueSetURLAssignment_1 ) ) ;
    public final void rule__CodeableConcept__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2640:1: ( ( ( rule__CodeableConcept__ValueSetURLAssignment_1 ) ) )
            // InternalCimpl.g:2641:1: ( ( rule__CodeableConcept__ValueSetURLAssignment_1 ) )
            {
            // InternalCimpl.g:2641:1: ( ( rule__CodeableConcept__ValueSetURLAssignment_1 ) )
            // InternalCimpl.g:2642:2: ( rule__CodeableConcept__ValueSetURLAssignment_1 )
            {
             before(grammarAccess.getCodeableConceptAccess().getValueSetURLAssignment_1()); 
            // InternalCimpl.g:2643:2: ( rule__CodeableConcept__ValueSetURLAssignment_1 )
            // InternalCimpl.g:2643:3: rule__CodeableConcept__ValueSetURLAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CodeableConcept__ValueSetURLAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCodeableConceptAccess().getValueSetURLAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeableConcept__Group__1__Impl"


    // $ANTLR start "rule__Quantity__Group__0"
    // InternalCimpl.g:2652:1: rule__Quantity__Group__0 : rule__Quantity__Group__0__Impl rule__Quantity__Group__1 ;
    public final void rule__Quantity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2656:1: ( rule__Quantity__Group__0__Impl rule__Quantity__Group__1 )
            // InternalCimpl.g:2657:2: rule__Quantity__Group__0__Impl rule__Quantity__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Quantity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quantity__Group__1();

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
    // $ANTLR end "rule__Quantity__Group__0"


    // $ANTLR start "rule__Quantity__Group__0__Impl"
    // InternalCimpl.g:2664:1: rule__Quantity__Group__0__Impl : ( 'Quantity with units' ) ;
    public final void rule__Quantity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2668:1: ( ( 'Quantity with units' ) )
            // InternalCimpl.g:2669:1: ( 'Quantity with units' )
            {
            // InternalCimpl.g:2669:1: ( 'Quantity with units' )
            // InternalCimpl.g:2670:2: 'Quantity with units'
            {
             before(grammarAccess.getQuantityAccess().getQuantityWithUnitsKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getQuantityAccess().getQuantityWithUnitsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantity__Group__0__Impl"


    // $ANTLR start "rule__Quantity__Group__1"
    // InternalCimpl.g:2679:1: rule__Quantity__Group__1 : rule__Quantity__Group__1__Impl ;
    public final void rule__Quantity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2683:1: ( rule__Quantity__Group__1__Impl )
            // InternalCimpl.g:2684:2: rule__Quantity__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Quantity__Group__1__Impl();

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
    // $ANTLR end "rule__Quantity__Group__1"


    // $ANTLR start "rule__Quantity__Group__1__Impl"
    // InternalCimpl.g:2690:1: rule__Quantity__Group__1__Impl : ( ( rule__Quantity__UnitsAssignment_1 ) ) ;
    public final void rule__Quantity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2694:1: ( ( ( rule__Quantity__UnitsAssignment_1 ) ) )
            // InternalCimpl.g:2695:1: ( ( rule__Quantity__UnitsAssignment_1 ) )
            {
            // InternalCimpl.g:2695:1: ( ( rule__Quantity__UnitsAssignment_1 ) )
            // InternalCimpl.g:2696:2: ( rule__Quantity__UnitsAssignment_1 )
            {
             before(grammarAccess.getQuantityAccess().getUnitsAssignment_1()); 
            // InternalCimpl.g:2697:2: ( rule__Quantity__UnitsAssignment_1 )
            // InternalCimpl.g:2697:3: rule__Quantity__UnitsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Quantity__UnitsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuantityAccess().getUnitsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantity__Group__1__Impl"


    // $ANTLR start "rule__Profile__HeaderAssignment_0"
    // InternalCimpl.g:2706:1: rule__Profile__HeaderAssignment_0 : ( ruleHeader ) ;
    public final void rule__Profile__HeaderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2710:1: ( ( ruleHeader ) )
            // InternalCimpl.g:2711:2: ( ruleHeader )
            {
            // InternalCimpl.g:2711:2: ( ruleHeader )
            // InternalCimpl.g:2712:3: ruleHeader
            {
             before(grammarAccess.getProfileAccess().getHeaderHeaderParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getProfileAccess().getHeaderHeaderParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__HeaderAssignment_0"


    // $ANTLR start "rule__Profile__DescriptionAssignment_1"
    // InternalCimpl.g:2721:1: rule__Profile__DescriptionAssignment_1 : ( ruleDescription ) ;
    public final void rule__Profile__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2725:1: ( ( ruleDescription ) )
            // InternalCimpl.g:2726:2: ( ruleDescription )
            {
            // InternalCimpl.g:2726:2: ( ruleDescription )
            // InternalCimpl.g:2727:3: ruleDescription
            {
             before(grammarAccess.getProfileAccess().getDescriptionDescriptionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getProfileAccess().getDescriptionDescriptionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__DescriptionAssignment_1"


    // $ANTLR start "rule__Profile__UsesAssignment_2"
    // InternalCimpl.g:2736:1: rule__Profile__UsesAssignment_2 : ( ruleUsesStatement ) ;
    public final void rule__Profile__UsesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2740:1: ( ( ruleUsesStatement ) )
            // InternalCimpl.g:2741:2: ( ruleUsesStatement )
            {
            // InternalCimpl.g:2741:2: ( ruleUsesStatement )
            // InternalCimpl.g:2742:3: ruleUsesStatement
            {
             before(grammarAccess.getProfileAccess().getUsesUsesStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUsesStatement();

            state._fsp--;

             after(grammarAccess.getProfileAccess().getUsesUsesStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__UsesAssignment_2"


    // $ANTLR start "rule__Profile__CodeSystemsAssignment_3"
    // InternalCimpl.g:2751:1: rule__Profile__CodeSystemsAssignment_3 : ( ruleCodeSystem ) ;
    public final void rule__Profile__CodeSystemsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2755:1: ( ( ruleCodeSystem ) )
            // InternalCimpl.g:2756:2: ( ruleCodeSystem )
            {
            // InternalCimpl.g:2756:2: ( ruleCodeSystem )
            // InternalCimpl.g:2757:3: ruleCodeSystem
            {
             before(grammarAccess.getProfileAccess().getCodeSystemsCodeSystemParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCodeSystem();

            state._fsp--;

             after(grammarAccess.getProfileAccess().getCodeSystemsCodeSystemParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__CodeSystemsAssignment_3"


    // $ANTLR start "rule__Profile__EntriesAssignment_4"
    // InternalCimpl.g:2766:1: rule__Profile__EntriesAssignment_4 : ( ruleEntryElement ) ;
    public final void rule__Profile__EntriesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2770:1: ( ( ruleEntryElement ) )
            // InternalCimpl.g:2771:2: ( ruleEntryElement )
            {
            // InternalCimpl.g:2771:2: ( ruleEntryElement )
            // InternalCimpl.g:2772:3: ruleEntryElement
            {
             before(grammarAccess.getProfileAccess().getEntriesEntryElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEntryElement();

            state._fsp--;

             after(grammarAccess.getProfileAccess().getEntriesEntryElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__EntriesAssignment_4"


    // $ANTLR start "rule__Profile__ElementsAssignment_5"
    // InternalCimpl.g:2781:1: rule__Profile__ElementsAssignment_5 : ( ruleElement ) ;
    public final void rule__Profile__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2785:1: ( ( ruleElement ) )
            // InternalCimpl.g:2786:2: ( ruleElement )
            {
            // InternalCimpl.g:2786:2: ( ruleElement )
            // InternalCimpl.g:2787:3: ruleElement
            {
             before(grammarAccess.getProfileAccess().getElementsElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getProfileAccess().getElementsElementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Profile__ElementsAssignment_5"


    // $ANTLR start "rule__Description__DescriptionAssignment_1"
    // InternalCimpl.g:2796:1: rule__Description__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Description__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2800:1: ( ( RULE_STRING ) )
            // InternalCimpl.g:2801:2: ( RULE_STRING )
            {
            // InternalCimpl.g:2801:2: ( RULE_STRING )
            // InternalCimpl.g:2802:3: RULE_STRING
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__DescriptionAssignment_1"


    // $ANTLR start "rule__Header__VersionAssignment_1"
    // InternalCimpl.g:2811:1: rule__Header__VersionAssignment_1 : ( ruleCIMPLSTRING ) ;
    public final void rule__Header__VersionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2815:1: ( ( ruleCIMPLSTRING ) )
            // InternalCimpl.g:2816:2: ( ruleCIMPLSTRING )
            {
            // InternalCimpl.g:2816:2: ( ruleCIMPLSTRING )
            // InternalCimpl.g:2817:3: ruleCIMPLSTRING
            {
             before(grammarAccess.getHeaderAccess().getVersionCIMPLSTRINGParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCIMPLSTRING();

            state._fsp--;

             after(grammarAccess.getHeaderAccess().getVersionCIMPLSTRINGParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__VersionAssignment_1"


    // $ANTLR start "rule__Header__NamespaceAssignment_4"
    // InternalCimpl.g:2826:1: rule__Header__NamespaceAssignment_4 : ( ruleCIMPLSTRING ) ;
    public final void rule__Header__NamespaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2830:1: ( ( ruleCIMPLSTRING ) )
            // InternalCimpl.g:2831:2: ( ruleCIMPLSTRING )
            {
            // InternalCimpl.g:2831:2: ( ruleCIMPLSTRING )
            // InternalCimpl.g:2832:3: ruleCIMPLSTRING
            {
             before(grammarAccess.getHeaderAccess().getNamespaceCIMPLSTRINGParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCIMPLSTRING();

            state._fsp--;

             after(grammarAccess.getHeaderAccess().getNamespaceCIMPLSTRINGParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__NamespaceAssignment_4"


    // $ANTLR start "rule__UsesStatement__NamespaceAssignment_1"
    // InternalCimpl.g:2841:1: rule__UsesStatement__NamespaceAssignment_1 : ( ruleCIMPLSTRING ) ;
    public final void rule__UsesStatement__NamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2845:1: ( ( ruleCIMPLSTRING ) )
            // InternalCimpl.g:2846:2: ( ruleCIMPLSTRING )
            {
            // InternalCimpl.g:2846:2: ( ruleCIMPLSTRING )
            // InternalCimpl.g:2847:3: ruleCIMPLSTRING
            {
             before(grammarAccess.getUsesStatementAccess().getNamespaceCIMPLSTRINGParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCIMPLSTRING();

            state._fsp--;

             after(grammarAccess.getUsesStatementAccess().getNamespaceCIMPLSTRINGParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsesStatement__NamespaceAssignment_1"


    // $ANTLR start "rule__UsesStatement__NamespaceAssignment_2_1"
    // InternalCimpl.g:2856:1: rule__UsesStatement__NamespaceAssignment_2_1 : ( ruleCIMPLSTRING ) ;
    public final void rule__UsesStatement__NamespaceAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2860:1: ( ( ruleCIMPLSTRING ) )
            // InternalCimpl.g:2861:2: ( ruleCIMPLSTRING )
            {
            // InternalCimpl.g:2861:2: ( ruleCIMPLSTRING )
            // InternalCimpl.g:2862:3: ruleCIMPLSTRING
            {
             before(grammarAccess.getUsesStatementAccess().getNamespaceCIMPLSTRINGParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCIMPLSTRING();

            state._fsp--;

             after(grammarAccess.getUsesStatementAccess().getNamespaceCIMPLSTRINGParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UsesStatement__NamespaceAssignment_2_1"


    // $ANTLR start "rule__CodeSystem__NamespaceAssignment_1"
    // InternalCimpl.g:2871:1: rule__CodeSystem__NamespaceAssignment_1 : ( ruleCIMPLSTRING ) ;
    public final void rule__CodeSystem__NamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2875:1: ( ( ruleCIMPLSTRING ) )
            // InternalCimpl.g:2876:2: ( ruleCIMPLSTRING )
            {
            // InternalCimpl.g:2876:2: ( ruleCIMPLSTRING )
            // InternalCimpl.g:2877:3: ruleCIMPLSTRING
            {
             before(grammarAccess.getCodeSystemAccess().getNamespaceCIMPLSTRINGParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCIMPLSTRING();

            state._fsp--;

             after(grammarAccess.getCodeSystemAccess().getNamespaceCIMPLSTRINGParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeSystem__NamespaceAssignment_1"


    // $ANTLR start "rule__EntryElement__NameAssignment_1"
    // InternalCimpl.g:2886:1: rule__EntryElement__NameAssignment_1 : ( ruleCIMPLSTRING ) ;
    public final void rule__EntryElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2890:1: ( ( ruleCIMPLSTRING ) )
            // InternalCimpl.g:2891:2: ( ruleCIMPLSTRING )
            {
            // InternalCimpl.g:2891:2: ( ruleCIMPLSTRING )
            // InternalCimpl.g:2892:3: ruleCIMPLSTRING
            {
             before(grammarAccess.getEntryElementAccess().getNameCIMPLSTRINGParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCIMPLSTRING();

            state._fsp--;

             after(grammarAccess.getEntryElementAccess().getNameCIMPLSTRINGParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__NameAssignment_1"


    // $ANTLR start "rule__EntryElement__BasedOnAssignment_3_1"
    // InternalCimpl.g:2901:1: rule__EntryElement__BasedOnAssignment_3_1 : ( ruleCIMPLSTRING ) ;
    public final void rule__EntryElement__BasedOnAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2905:1: ( ( ruleCIMPLSTRING ) )
            // InternalCimpl.g:2906:2: ( ruleCIMPLSTRING )
            {
            // InternalCimpl.g:2906:2: ( ruleCIMPLSTRING )
            // InternalCimpl.g:2907:3: ruleCIMPLSTRING
            {
             before(grammarAccess.getEntryElementAccess().getBasedOnCIMPLSTRINGParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCIMPLSTRING();

            state._fsp--;

             after(grammarAccess.getEntryElementAccess().getBasedOnCIMPLSTRINGParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__BasedOnAssignment_3_1"


    // $ANTLR start "rule__EntryElement__ConceptAssignment_5"
    // InternalCimpl.g:2916:1: rule__EntryElement__ConceptAssignment_5 : ( ruleCIMPLSTRING ) ;
    public final void rule__EntryElement__ConceptAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2920:1: ( ( ruleCIMPLSTRING ) )
            // InternalCimpl.g:2921:2: ( ruleCIMPLSTRING )
            {
            // InternalCimpl.g:2921:2: ( ruleCIMPLSTRING )
            // InternalCimpl.g:2922:3: ruleCIMPLSTRING
            {
             before(grammarAccess.getEntryElementAccess().getConceptCIMPLSTRINGParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCIMPLSTRING();

            state._fsp--;

             after(grammarAccess.getEntryElementAccess().getConceptCIMPLSTRINGParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__ConceptAssignment_5"


    // $ANTLR start "rule__EntryElement__ConceptDescriptionAssignment_6"
    // InternalCimpl.g:2931:1: rule__EntryElement__ConceptDescriptionAssignment_6 : ( RULE_STRING ) ;
    public final void rule__EntryElement__ConceptDescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2935:1: ( ( RULE_STRING ) )
            // InternalCimpl.g:2936:2: ( RULE_STRING )
            {
            // InternalCimpl.g:2936:2: ( RULE_STRING )
            // InternalCimpl.g:2937:3: RULE_STRING
            {
             before(grammarAccess.getEntryElementAccess().getConceptDescriptionSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getConceptDescriptionSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__ConceptDescriptionAssignment_6"


    // $ANTLR start "rule__EntryElement__DescriptionAssignment_9"
    // InternalCimpl.g:2946:1: rule__EntryElement__DescriptionAssignment_9 : ( RULE_STRING ) ;
    public final void rule__EntryElement__DescriptionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2950:1: ( ( RULE_STRING ) )
            // InternalCimpl.g:2951:2: ( RULE_STRING )
            {
            // InternalCimpl.g:2951:2: ( RULE_STRING )
            // InternalCimpl.g:2952:3: RULE_STRING
            {
             before(grammarAccess.getEntryElementAccess().getDescriptionSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getDescriptionSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__DescriptionAssignment_9"


    // $ANTLR start "rule__EntryElement__RedefinitionsAssignment_11_0"
    // InternalCimpl.g:2961:1: rule__EntryElement__RedefinitionsAssignment_11_0 : ( ruleRedefinition ) ;
    public final void rule__EntryElement__RedefinitionsAssignment_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2965:1: ( ( ruleRedefinition ) )
            // InternalCimpl.g:2966:2: ( ruleRedefinition )
            {
            // InternalCimpl.g:2966:2: ( ruleRedefinition )
            // InternalCimpl.g:2967:3: ruleRedefinition
            {
             before(grammarAccess.getEntryElementAccess().getRedefinitionsRedefinitionParserRuleCall_11_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRedefinition();

            state._fsp--;

             after(grammarAccess.getEntryElementAccess().getRedefinitionsRedefinitionParserRuleCall_11_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__RedefinitionsAssignment_11_0"


    // $ANTLR start "rule__EntryElement__RedefinitionsAssignment_11_1_1"
    // InternalCimpl.g:2976:1: rule__EntryElement__RedefinitionsAssignment_11_1_1 : ( ruleRedefinition ) ;
    public final void rule__EntryElement__RedefinitionsAssignment_11_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2980:1: ( ( ruleRedefinition ) )
            // InternalCimpl.g:2981:2: ( ruleRedefinition )
            {
            // InternalCimpl.g:2981:2: ( ruleRedefinition )
            // InternalCimpl.g:2982:3: ruleRedefinition
            {
             before(grammarAccess.getEntryElementAccess().getRedefinitionsRedefinitionParserRuleCall_11_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRedefinition();

            state._fsp--;

             after(grammarAccess.getEntryElementAccess().getRedefinitionsRedefinitionParserRuleCall_11_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__RedefinitionsAssignment_11_1_1"


    // $ANTLR start "rule__EntryElement__SubsetsAssignment_12"
    // InternalCimpl.g:2991:1: rule__EntryElement__SubsetsAssignment_12 : ( ruleSubsets ) ;
    public final void rule__EntryElement__SubsetsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:2995:1: ( ( ruleSubsets ) )
            // InternalCimpl.g:2996:2: ( ruleSubsets )
            {
            // InternalCimpl.g:2996:2: ( ruleSubsets )
            // InternalCimpl.g:2997:3: ruleSubsets
            {
             before(grammarAccess.getEntryElementAccess().getSubsetsSubsetsParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleSubsets();

            state._fsp--;

             after(grammarAccess.getEntryElementAccess().getSubsetsSubsetsParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__SubsetsAssignment_12"


    // $ANTLR start "rule__Subsets__NameAssignment_0"
    // InternalCimpl.g:3006:1: rule__Subsets__NameAssignment_0 : ( ruleCIMPLSTRING ) ;
    public final void rule__Subsets__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:3010:1: ( ( ruleCIMPLSTRING ) )
            // InternalCimpl.g:3011:2: ( ruleCIMPLSTRING )
            {
            // InternalCimpl.g:3011:2: ( ruleCIMPLSTRING )
            // InternalCimpl.g:3012:3: ruleCIMPLSTRING
            {
             before(grammarAccess.getSubsetsAccess().getNameCIMPLSTRINGParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCIMPLSTRING();

            state._fsp--;

             after(grammarAccess.getSubsetsAccess().getNameCIMPLSTRINGParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsets__NameAssignment_0"


    // $ANTLR start "rule__Subsets__SubsetsAssignment_2"
    // InternalCimpl.g:3021:1: rule__Subsets__SubsetsAssignment_2 : ( ruleSubset ) ;
    public final void rule__Subsets__SubsetsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:3025:1: ( ( ruleSubset ) )
            // InternalCimpl.g:3026:2: ( ruleSubset )
            {
            // InternalCimpl.g:3026:2: ( ruleSubset )
            // InternalCimpl.g:3027:3: ruleSubset
            {
             before(grammarAccess.getSubsetsAccess().getSubsetsSubsetParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSubset();

            state._fsp--;

             after(grammarAccess.getSubsetsAccess().getSubsetsSubsetParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsets__SubsetsAssignment_2"


    // $ANTLR start "rule__Subsets__SubsetsAssignment_3_1"
    // InternalCimpl.g:3036:1: rule__Subsets__SubsetsAssignment_3_1 : ( ruleSubset ) ;
    public final void rule__Subsets__SubsetsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:3040:1: ( ( ruleSubset ) )
            // InternalCimpl.g:3041:2: ( ruleSubset )
            {
            // InternalCimpl.g:3041:2: ( ruleSubset )
            // InternalCimpl.g:3042:3: ruleSubset
            {
             before(grammarAccess.getSubsetsAccess().getSubsetsSubsetParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSubset();

            state._fsp--;

             after(grammarAccess.getSubsetsAccess().getSubsetsSubsetParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsets__SubsetsAssignment_3_1"


    // $ANTLR start "rule__Subset__CardinalityAssignment_1"
    // InternalCimpl.g:3051:1: rule__Subset__CardinalityAssignment_1 : ( ruleCardinality ) ;
    public final void rule__Subset__CardinalityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:3055:1: ( ( ruleCardinality ) )
            // InternalCimpl.g:3056:2: ( ruleCardinality )
            {
            // InternalCimpl.g:3056:2: ( ruleCardinality )
            // InternalCimpl.g:3057:3: ruleCardinality
            {
             before(grammarAccess.getSubsetAccess().getCardinalityCardinalityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getSubsetAccess().getCardinalityCardinalityParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subset__CardinalityAssignment_1"


    // $ANTLR start "rule__Subset__TypeNameAssignment_2"
    // InternalCimpl.g:3066:1: rule__Subset__TypeNameAssignment_2 : ( ruleCIMPLSTRING ) ;
    public final void rule__Subset__TypeNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:3070:1: ( ( ruleCIMPLSTRING ) )
            // InternalCimpl.g:3071:2: ( ruleCIMPLSTRING )
            {
            // InternalCimpl.g:3071:2: ( ruleCIMPLSTRING )
            // InternalCimpl.g:3072:3: ruleCIMPLSTRING
            {
             before(grammarAccess.getSubsetAccess().getTypeNameCIMPLSTRINGParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCIMPLSTRING();

            state._fsp--;

             after(grammarAccess.getSubsetAccess().getTypeNameCIMPLSTRINGParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subset__TypeNameAssignment_2"


    // $ANTLR start "rule__Redefinition__CardinalityAssignment_0"
    // InternalCimpl.g:3081:1: rule__Redefinition__CardinalityAssignment_0 : ( ruleCardinality ) ;
    public final void rule__Redefinition__CardinalityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:3085:1: ( ( ruleCardinality ) )
            // InternalCimpl.g:3086:2: ( ruleCardinality )
            {
            // InternalCimpl.g:3086:2: ( ruleCardinality )
            // InternalCimpl.g:3087:3: ruleCardinality
            {
             before(grammarAccess.getRedefinitionAccess().getCardinalityCardinalityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getRedefinitionAccess().getCardinalityCardinalityParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redefinition__CardinalityAssignment_0"


    // $ANTLR start "rule__Redefinition__NameAssignment_1"
    // InternalCimpl.g:3096:1: rule__Redefinition__NameAssignment_1 : ( ruleCIMPLSTRING ) ;
    public final void rule__Redefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:3100:1: ( ( ruleCIMPLSTRING ) )
            // InternalCimpl.g:3101:2: ( ruleCIMPLSTRING )
            {
            // InternalCimpl.g:3101:2: ( ruleCIMPLSTRING )
            // InternalCimpl.g:3102:3: ruleCIMPLSTRING
            {
             before(grammarAccess.getRedefinitionAccess().getNameCIMPLSTRINGParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCIMPLSTRING();

            state._fsp--;

             after(grammarAccess.getRedefinitionAccess().getNameCIMPLSTRINGParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Redefinition__NameAssignment_1"


    // $ANTLR start "rule__Cardinality__LowerAssignment_0"
    // InternalCimpl.g:3111:1: rule__Cardinality__LowerAssignment_0 : ( RULE_INT ) ;
    public final void rule__Cardinality__LowerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:3115:1: ( ( RULE_INT ) )
            // InternalCimpl.g:3116:2: ( RULE_INT )
            {
            // InternalCimpl.g:3116:2: ( RULE_INT )
            // InternalCimpl.g:3117:3: RULE_INT
            {
             before(grammarAccess.getCardinalityAccess().getLowerINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCardinalityAccess().getLowerINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__LowerAssignment_0"


    // $ANTLR start "rule__Cardinality__UpperAssignment_2"
    // InternalCimpl.g:3126:1: rule__Cardinality__UpperAssignment_2 : ( RULE_INT ) ;
    public final void rule__Cardinality__UpperAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:3130:1: ( ( RULE_INT ) )
            // InternalCimpl.g:3131:2: ( RULE_INT )
            {
            // InternalCimpl.g:3131:2: ( RULE_INT )
            // InternalCimpl.g:3132:3: RULE_INT
            {
             before(grammarAccess.getCardinalityAccess().getUpperINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCardinalityAccess().getUpperINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__UpperAssignment_2"


    // $ANTLR start "rule__Element__NameAssignment_1"
    // InternalCimpl.g:3141:1: rule__Element__NameAssignment_1 : ( ruleCIMPLSTRING ) ;
    public final void rule__Element__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:3145:1: ( ( ruleCIMPLSTRING ) )
            // InternalCimpl.g:3146:2: ( ruleCIMPLSTRING )
            {
            // InternalCimpl.g:3146:2: ( ruleCIMPLSTRING )
            // InternalCimpl.g:3147:3: ruleCIMPLSTRING
            {
             before(grammarAccess.getElementAccess().getNameCIMPLSTRINGParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCIMPLSTRING();

            state._fsp--;

             after(grammarAccess.getElementAccess().getNameCIMPLSTRINGParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__NameAssignment_1"


    // $ANTLR start "rule__Element__BasedOnAssignment_3_1"
    // InternalCimpl.g:3156:1: rule__Element__BasedOnAssignment_3_1 : ( ruleCIMPLSTRING ) ;
    public final void rule__Element__BasedOnAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:3160:1: ( ( ruleCIMPLSTRING ) )
            // InternalCimpl.g:3161:2: ( ruleCIMPLSTRING )
            {
            // InternalCimpl.g:3161:2: ( ruleCIMPLSTRING )
            // InternalCimpl.g:3162:3: ruleCIMPLSTRING
            {
             before(grammarAccess.getElementAccess().getBasedOnCIMPLSTRINGParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCIMPLSTRING();

            state._fsp--;

             after(grammarAccess.getElementAccess().getBasedOnCIMPLSTRINGParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__BasedOnAssignment_3_1"


    // $ANTLR start "rule__Element__ConceptAssignment_5"
    // InternalCimpl.g:3171:1: rule__Element__ConceptAssignment_5 : ( ruleCIMPLSTRING ) ;
    public final void rule__Element__ConceptAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:3175:1: ( ( ruleCIMPLSTRING ) )
            // InternalCimpl.g:3176:2: ( ruleCIMPLSTRING )
            {
            // InternalCimpl.g:3176:2: ( ruleCIMPLSTRING )
            // InternalCimpl.g:3177:3: ruleCIMPLSTRING
            {
             before(grammarAccess.getElementAccess().getConceptCIMPLSTRINGParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCIMPLSTRING();

            state._fsp--;

             after(grammarAccess.getElementAccess().getConceptCIMPLSTRINGParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__ConceptAssignment_5"


    // $ANTLR start "rule__Element__DescriptionAssignment_8"
    // InternalCimpl.g:3186:1: rule__Element__DescriptionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Element__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:3190:1: ( ( RULE_STRING ) )
            // InternalCimpl.g:3191:2: ( RULE_STRING )
            {
            // InternalCimpl.g:3191:2: ( RULE_STRING )
            // InternalCimpl.g:3192:3: RULE_STRING
            {
             before(grammarAccess.getElementAccess().getDescriptionSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getDescriptionSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__DescriptionAssignment_8"


    // $ANTLR start "rule__Element__ValueAssignment_11"
    // InternalCimpl.g:3201:1: rule__Element__ValueAssignment_11 : ( ruleCIMPLSTRING ) ;
    public final void rule__Element__ValueAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:3205:1: ( ( ruleCIMPLSTRING ) )
            // InternalCimpl.g:3206:2: ( ruleCIMPLSTRING )
            {
            // InternalCimpl.g:3206:2: ( ruleCIMPLSTRING )
            // InternalCimpl.g:3207:3: ruleCIMPLSTRING
            {
             before(grammarAccess.getElementAccess().getValueCIMPLSTRINGParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleCIMPLSTRING();

            state._fsp--;

             after(grammarAccess.getElementAccess().getValueCIMPLSTRINGParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__ValueAssignment_11"


    // $ANTLR start "rule__CodeableConcept__ValueSetURLAssignment_1"
    // InternalCimpl.g:3216:1: rule__CodeableConcept__ValueSetURLAssignment_1 : ( ruleCIMPLSTRING ) ;
    public final void rule__CodeableConcept__ValueSetURLAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:3220:1: ( ( ruleCIMPLSTRING ) )
            // InternalCimpl.g:3221:2: ( ruleCIMPLSTRING )
            {
            // InternalCimpl.g:3221:2: ( ruleCIMPLSTRING )
            // InternalCimpl.g:3222:3: ruleCIMPLSTRING
            {
             before(grammarAccess.getCodeableConceptAccess().getValueSetURLCIMPLSTRINGParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCIMPLSTRING();

            state._fsp--;

             after(grammarAccess.getCodeableConceptAccess().getValueSetURLCIMPLSTRINGParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeableConcept__ValueSetURLAssignment_1"


    // $ANTLR start "rule__Quantity__UnitsAssignment_1"
    // InternalCimpl.g:3231:1: rule__Quantity__UnitsAssignment_1 : ( ruleCIMPLSTRING ) ;
    public final void rule__Quantity__UnitsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:3235:1: ( ( ruleCIMPLSTRING ) )
            // InternalCimpl.g:3236:2: ( ruleCIMPLSTRING )
            {
            // InternalCimpl.g:3236:2: ( ruleCIMPLSTRING )
            // InternalCimpl.g:3237:3: ruleCIMPLSTRING
            {
             before(grammarAccess.getQuantityAccess().getUnitsCIMPLSTRINGParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCIMPLSTRING();

            state._fsp--;

             after(grammarAccess.getQuantityAccess().getUnitsCIMPLSTRINGParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantity__UnitsAssignment_1"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\27\uffff";
    static final String dfa_2s = "\1\uffff\1\25\24\uffff\1\2";
    static final String dfa_3s = "\1\41\1\5\1\uffff\22\41\1\uffff\1\5";
    static final String dfa_4s = "\1\41\1\52\1\uffff\22\41\1\uffff\1\52";
    static final String dfa_5s = "\2\uffff\1\1\22\uffff\1\2\1\uffff";
    static final String dfa_6s = "\27\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2\6\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\7\uffff\1\25\4\uffff\1\25",
            "",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\26",
            "",
            "\1\2\6\uffff\22\2\3\uffff\1\25\3\uffff\1\2\2\uffff\1\25\1\uffff\1\2"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 1672:2: ( rule__EntryElement__Group_11_1__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000043800000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000003FFFF000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000023FFFF020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000003FFFF020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000000000L});

}