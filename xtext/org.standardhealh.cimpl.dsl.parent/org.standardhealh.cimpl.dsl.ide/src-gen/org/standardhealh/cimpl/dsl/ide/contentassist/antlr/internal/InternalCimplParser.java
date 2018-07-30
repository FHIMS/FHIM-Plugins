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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Grammar:'", "'DataElement'", "'\\r\\n'", "'Namespace:'", "'\\r'", "'Uses:'", "','", "'EntryElement'", "'Based On:'", "'Concept:'", "'Description:'", "'Value:'", "'\\t'", "'..'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

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



    // $ANTLR start "entryRuleModel"
    // InternalCimpl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalCimpl.g:54:1: ( ruleModel EOF )
            // InternalCimpl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalCimpl.g:62:1: ruleModel : ( ( rule__Model__ElementsAssignment )? ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:66:2: ( ( ( rule__Model__ElementsAssignment )? ) )
            // InternalCimpl.g:67:2: ( ( rule__Model__ElementsAssignment )? )
            {
            // InternalCimpl.g:67:2: ( ( rule__Model__ElementsAssignment )? )
            // InternalCimpl.g:68:3: ( rule__Model__ElementsAssignment )?
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // InternalCimpl.g:69:3: ( rule__Model__ElementsAssignment )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCimpl.g:69:4: rule__Model__ElementsAssignment
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ElementsAssignment();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDoc"
    // InternalCimpl.g:78:1: entryRuleDoc : ruleDoc EOF ;
    public final void entryRuleDoc() throws RecognitionException {
        try {
            // InternalCimpl.g:79:1: ( ruleDoc EOF )
            // InternalCimpl.g:80:1: ruleDoc EOF
            {
             before(grammarAccess.getDocRule()); 
            pushFollow(FOLLOW_1);
            ruleDoc();

            state._fsp--;

             after(grammarAccess.getDocRule()); 
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
    // $ANTLR end "entryRuleDoc"


    // $ANTLR start "ruleDoc"
    // InternalCimpl.g:87:1: ruleDoc : ( ( rule__Doc__Group__0 ) ) ;
    public final void ruleDoc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:91:2: ( ( ( rule__Doc__Group__0 ) ) )
            // InternalCimpl.g:92:2: ( ( rule__Doc__Group__0 ) )
            {
            // InternalCimpl.g:92:2: ( ( rule__Doc__Group__0 ) )
            // InternalCimpl.g:93:3: ( rule__Doc__Group__0 )
            {
             before(grammarAccess.getDocAccess().getGroup()); 
            // InternalCimpl.g:94:3: ( rule__Doc__Group__0 )
            // InternalCimpl.g:94:4: rule__Doc__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Doc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoc"


    // $ANTLR start "entryRuleDocHeader"
    // InternalCimpl.g:103:1: entryRuleDocHeader : ruleDocHeader EOF ;
    public final void entryRuleDocHeader() throws RecognitionException {
        try {
            // InternalCimpl.g:104:1: ( ruleDocHeader EOF )
            // InternalCimpl.g:105:1: ruleDocHeader EOF
            {
             before(grammarAccess.getDocHeaderRule()); 
            pushFollow(FOLLOW_1);
            ruleDocHeader();

            state._fsp--;

             after(grammarAccess.getDocHeaderRule()); 
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
    // $ANTLR end "entryRuleDocHeader"


    // $ANTLR start "ruleDocHeader"
    // InternalCimpl.g:112:1: ruleDocHeader : ( ( rule__DocHeader__Group__0 ) ) ;
    public final void ruleDocHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:116:2: ( ( ( rule__DocHeader__Group__0 ) ) )
            // InternalCimpl.g:117:2: ( ( rule__DocHeader__Group__0 ) )
            {
            // InternalCimpl.g:117:2: ( ( rule__DocHeader__Group__0 ) )
            // InternalCimpl.g:118:3: ( rule__DocHeader__Group__0 )
            {
             before(grammarAccess.getDocHeaderAccess().getGroup()); 
            // InternalCimpl.g:119:3: ( rule__DocHeader__Group__0 )
            // InternalCimpl.g:119:4: rule__DocHeader__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DocHeader__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocHeaderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocHeader"


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


    // $ANTLR start "entryRuleEntryElement"
    // InternalCimpl.g:153:1: entryRuleEntryElement : ruleEntryElement EOF ;
    public final void entryRuleEntryElement() throws RecognitionException {
        try {
            // InternalCimpl.g:154:1: ( ruleEntryElement EOF )
            // InternalCimpl.g:155:1: ruleEntryElement EOF
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
    // InternalCimpl.g:162:1: ruleEntryElement : ( ( rule__EntryElement__Group__0 ) ) ;
    public final void ruleEntryElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:166:2: ( ( ( rule__EntryElement__Group__0 ) ) )
            // InternalCimpl.g:167:2: ( ( rule__EntryElement__Group__0 ) )
            {
            // InternalCimpl.g:167:2: ( ( rule__EntryElement__Group__0 ) )
            // InternalCimpl.g:168:3: ( rule__EntryElement__Group__0 )
            {
             before(grammarAccess.getEntryElementAccess().getGroup()); 
            // InternalCimpl.g:169:3: ( rule__EntryElement__Group__0 )
            // InternalCimpl.g:169:4: rule__EntryElement__Group__0
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


    // $ANTLR start "entryRuleElement"
    // InternalCimpl.g:178:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalCimpl.g:179:1: ( ruleElement EOF )
            // InternalCimpl.g:180:1: ruleElement EOF
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
    // InternalCimpl.g:187:1: ruleElement : ( ( rule__Element__Group__0 ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:191:2: ( ( ( rule__Element__Group__0 ) ) )
            // InternalCimpl.g:192:2: ( ( rule__Element__Group__0 ) )
            {
            // InternalCimpl.g:192:2: ( ( rule__Element__Group__0 ) )
            // InternalCimpl.g:193:3: ( rule__Element__Group__0 )
            {
             before(grammarAccess.getElementAccess().getGroup()); 
            // InternalCimpl.g:194:3: ( rule__Element__Group__0 )
            // InternalCimpl.g:194:4: rule__Element__Group__0
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


    // $ANTLR start "rule__Doc__Group__0"
    // InternalCimpl.g:202:1: rule__Doc__Group__0 : rule__Doc__Group__0__Impl rule__Doc__Group__1 ;
    public final void rule__Doc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:206:1: ( rule__Doc__Group__0__Impl rule__Doc__Group__1 )
            // InternalCimpl.g:207:2: rule__Doc__Group__0__Impl rule__Doc__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Doc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Doc__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doc__Group__0"


    // $ANTLR start "rule__Doc__Group__0__Impl"
    // InternalCimpl.g:214:1: rule__Doc__Group__0__Impl : ( ( rule__Doc__HeaderAssignment_0 ) ) ;
    public final void rule__Doc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:218:1: ( ( ( rule__Doc__HeaderAssignment_0 ) ) )
            // InternalCimpl.g:219:1: ( ( rule__Doc__HeaderAssignment_0 ) )
            {
            // InternalCimpl.g:219:1: ( ( rule__Doc__HeaderAssignment_0 ) )
            // InternalCimpl.g:220:2: ( rule__Doc__HeaderAssignment_0 )
            {
             before(grammarAccess.getDocAccess().getHeaderAssignment_0()); 
            // InternalCimpl.g:221:2: ( rule__Doc__HeaderAssignment_0 )
            // InternalCimpl.g:221:3: rule__Doc__HeaderAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Doc__HeaderAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDocAccess().getHeaderAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doc__Group__0__Impl"


    // $ANTLR start "rule__Doc__Group__1"
    // InternalCimpl.g:229:1: rule__Doc__Group__1 : rule__Doc__Group__1__Impl rule__Doc__Group__2 ;
    public final void rule__Doc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:233:1: ( rule__Doc__Group__1__Impl rule__Doc__Group__2 )
            // InternalCimpl.g:234:2: rule__Doc__Group__1__Impl rule__Doc__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Doc__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Doc__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doc__Group__1"


    // $ANTLR start "rule__Doc__Group__1__Impl"
    // InternalCimpl.g:241:1: rule__Doc__Group__1__Impl : ( ( rule__Doc__UsesAssignment_1 ) ) ;
    public final void rule__Doc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:245:1: ( ( ( rule__Doc__UsesAssignment_1 ) ) )
            // InternalCimpl.g:246:1: ( ( rule__Doc__UsesAssignment_1 ) )
            {
            // InternalCimpl.g:246:1: ( ( rule__Doc__UsesAssignment_1 ) )
            // InternalCimpl.g:247:2: ( rule__Doc__UsesAssignment_1 )
            {
             before(grammarAccess.getDocAccess().getUsesAssignment_1()); 
            // InternalCimpl.g:248:2: ( rule__Doc__UsesAssignment_1 )
            // InternalCimpl.g:248:3: rule__Doc__UsesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Doc__UsesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDocAccess().getUsesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doc__Group__1__Impl"


    // $ANTLR start "rule__Doc__Group__2"
    // InternalCimpl.g:256:1: rule__Doc__Group__2 : rule__Doc__Group__2__Impl ;
    public final void rule__Doc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:260:1: ( rule__Doc__Group__2__Impl )
            // InternalCimpl.g:261:2: rule__Doc__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Doc__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doc__Group__2"


    // $ANTLR start "rule__Doc__Group__2__Impl"
    // InternalCimpl.g:267:1: rule__Doc__Group__2__Impl : ( ( rule__Doc__EntriesAssignment_2 )* ) ;
    public final void rule__Doc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:271:1: ( ( ( rule__Doc__EntriesAssignment_2 )* ) )
            // InternalCimpl.g:272:1: ( ( rule__Doc__EntriesAssignment_2 )* )
            {
            // InternalCimpl.g:272:1: ( ( rule__Doc__EntriesAssignment_2 )* )
            // InternalCimpl.g:273:2: ( rule__Doc__EntriesAssignment_2 )*
            {
             before(grammarAccess.getDocAccess().getEntriesAssignment_2()); 
            // InternalCimpl.g:274:2: ( rule__Doc__EntriesAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCimpl.g:274:3: rule__Doc__EntriesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Doc__EntriesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getDocAccess().getEntriesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doc__Group__2__Impl"


    // $ANTLR start "rule__DocHeader__Group__0"
    // InternalCimpl.g:283:1: rule__DocHeader__Group__0 : rule__DocHeader__Group__0__Impl rule__DocHeader__Group__1 ;
    public final void rule__DocHeader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:287:1: ( rule__DocHeader__Group__0__Impl rule__DocHeader__Group__1 )
            // InternalCimpl.g:288:2: rule__DocHeader__Group__0__Impl rule__DocHeader__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__DocHeader__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocHeader__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocHeader__Group__0"


    // $ANTLR start "rule__DocHeader__Group__0__Impl"
    // InternalCimpl.g:295:1: rule__DocHeader__Group__0__Impl : ( 'Grammar:' ) ;
    public final void rule__DocHeader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:299:1: ( ( 'Grammar:' ) )
            // InternalCimpl.g:300:1: ( 'Grammar:' )
            {
            // InternalCimpl.g:300:1: ( 'Grammar:' )
            // InternalCimpl.g:301:2: 'Grammar:'
            {
             before(grammarAccess.getDocHeaderAccess().getGrammarKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getDocHeaderAccess().getGrammarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocHeader__Group__0__Impl"


    // $ANTLR start "rule__DocHeader__Group__1"
    // InternalCimpl.g:310:1: rule__DocHeader__Group__1 : rule__DocHeader__Group__1__Impl rule__DocHeader__Group__2 ;
    public final void rule__DocHeader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:314:1: ( rule__DocHeader__Group__1__Impl rule__DocHeader__Group__2 )
            // InternalCimpl.g:315:2: rule__DocHeader__Group__1__Impl rule__DocHeader__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__DocHeader__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocHeader__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocHeader__Group__1"


    // $ANTLR start "rule__DocHeader__Group__1__Impl"
    // InternalCimpl.g:322:1: rule__DocHeader__Group__1__Impl : ( 'DataElement' ) ;
    public final void rule__DocHeader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:326:1: ( ( 'DataElement' ) )
            // InternalCimpl.g:327:1: ( 'DataElement' )
            {
            // InternalCimpl.g:327:1: ( 'DataElement' )
            // InternalCimpl.g:328:2: 'DataElement'
            {
             before(grammarAccess.getDocHeaderAccess().getDataElementKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDocHeaderAccess().getDataElementKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocHeader__Group__1__Impl"


    // $ANTLR start "rule__DocHeader__Group__2"
    // InternalCimpl.g:337:1: rule__DocHeader__Group__2 : rule__DocHeader__Group__2__Impl rule__DocHeader__Group__3 ;
    public final void rule__DocHeader__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:341:1: ( rule__DocHeader__Group__2__Impl rule__DocHeader__Group__3 )
            // InternalCimpl.g:342:2: rule__DocHeader__Group__2__Impl rule__DocHeader__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__DocHeader__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocHeader__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocHeader__Group__2"


    // $ANTLR start "rule__DocHeader__Group__2__Impl"
    // InternalCimpl.g:349:1: rule__DocHeader__Group__2__Impl : ( ( rule__DocHeader__VersionAssignment_2 ) ) ;
    public final void rule__DocHeader__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:353:1: ( ( ( rule__DocHeader__VersionAssignment_2 ) ) )
            // InternalCimpl.g:354:1: ( ( rule__DocHeader__VersionAssignment_2 ) )
            {
            // InternalCimpl.g:354:1: ( ( rule__DocHeader__VersionAssignment_2 ) )
            // InternalCimpl.g:355:2: ( rule__DocHeader__VersionAssignment_2 )
            {
             before(grammarAccess.getDocHeaderAccess().getVersionAssignment_2()); 
            // InternalCimpl.g:356:2: ( rule__DocHeader__VersionAssignment_2 )
            // InternalCimpl.g:356:3: rule__DocHeader__VersionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DocHeader__VersionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDocHeaderAccess().getVersionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocHeader__Group__2__Impl"


    // $ANTLR start "rule__DocHeader__Group__3"
    // InternalCimpl.g:364:1: rule__DocHeader__Group__3 : rule__DocHeader__Group__3__Impl rule__DocHeader__Group__4 ;
    public final void rule__DocHeader__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:368:1: ( rule__DocHeader__Group__3__Impl rule__DocHeader__Group__4 )
            // InternalCimpl.g:369:2: rule__DocHeader__Group__3__Impl rule__DocHeader__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__DocHeader__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocHeader__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocHeader__Group__3"


    // $ANTLR start "rule__DocHeader__Group__3__Impl"
    // InternalCimpl.g:376:1: rule__DocHeader__Group__3__Impl : ( '\\r\\n' ) ;
    public final void rule__DocHeader__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:380:1: ( ( '\\r\\n' ) )
            // InternalCimpl.g:381:1: ( '\\r\\n' )
            {
            // InternalCimpl.g:381:1: ( '\\r\\n' )
            // InternalCimpl.g:382:2: '\\r\\n'
            {
             before(grammarAccess.getDocHeaderAccess().getControl000dControl000aKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDocHeaderAccess().getControl000dControl000aKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocHeader__Group__3__Impl"


    // $ANTLR start "rule__DocHeader__Group__4"
    // InternalCimpl.g:391:1: rule__DocHeader__Group__4 : rule__DocHeader__Group__4__Impl rule__DocHeader__Group__5 ;
    public final void rule__DocHeader__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:395:1: ( rule__DocHeader__Group__4__Impl rule__DocHeader__Group__5 )
            // InternalCimpl.g:396:2: rule__DocHeader__Group__4__Impl rule__DocHeader__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__DocHeader__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocHeader__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocHeader__Group__4"


    // $ANTLR start "rule__DocHeader__Group__4__Impl"
    // InternalCimpl.g:403:1: rule__DocHeader__Group__4__Impl : ( 'Namespace:' ) ;
    public final void rule__DocHeader__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:407:1: ( ( 'Namespace:' ) )
            // InternalCimpl.g:408:1: ( 'Namespace:' )
            {
            // InternalCimpl.g:408:1: ( 'Namespace:' )
            // InternalCimpl.g:409:2: 'Namespace:'
            {
             before(grammarAccess.getDocHeaderAccess().getNamespaceKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDocHeaderAccess().getNamespaceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocHeader__Group__4__Impl"


    // $ANTLR start "rule__DocHeader__Group__5"
    // InternalCimpl.g:418:1: rule__DocHeader__Group__5 : rule__DocHeader__Group__5__Impl rule__DocHeader__Group__6 ;
    public final void rule__DocHeader__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:422:1: ( rule__DocHeader__Group__5__Impl rule__DocHeader__Group__6 )
            // InternalCimpl.g:423:2: rule__DocHeader__Group__5__Impl rule__DocHeader__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__DocHeader__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocHeader__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocHeader__Group__5"


    // $ANTLR start "rule__DocHeader__Group__5__Impl"
    // InternalCimpl.g:430:1: rule__DocHeader__Group__5__Impl : ( ( rule__DocHeader__NamespaceAssignment_5 ) ) ;
    public final void rule__DocHeader__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:434:1: ( ( ( rule__DocHeader__NamespaceAssignment_5 ) ) )
            // InternalCimpl.g:435:1: ( ( rule__DocHeader__NamespaceAssignment_5 ) )
            {
            // InternalCimpl.g:435:1: ( ( rule__DocHeader__NamespaceAssignment_5 ) )
            // InternalCimpl.g:436:2: ( rule__DocHeader__NamespaceAssignment_5 )
            {
             before(grammarAccess.getDocHeaderAccess().getNamespaceAssignment_5()); 
            // InternalCimpl.g:437:2: ( rule__DocHeader__NamespaceAssignment_5 )
            // InternalCimpl.g:437:3: rule__DocHeader__NamespaceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DocHeader__NamespaceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDocHeaderAccess().getNamespaceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocHeader__Group__5__Impl"


    // $ANTLR start "rule__DocHeader__Group__6"
    // InternalCimpl.g:445:1: rule__DocHeader__Group__6 : rule__DocHeader__Group__6__Impl rule__DocHeader__Group__7 ;
    public final void rule__DocHeader__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:449:1: ( rule__DocHeader__Group__6__Impl rule__DocHeader__Group__7 )
            // InternalCimpl.g:450:2: rule__DocHeader__Group__6__Impl rule__DocHeader__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__DocHeader__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocHeader__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocHeader__Group__6"


    // $ANTLR start "rule__DocHeader__Group__6__Impl"
    // InternalCimpl.g:457:1: rule__DocHeader__Group__6__Impl : ( '\\r' ) ;
    public final void rule__DocHeader__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:461:1: ( ( '\\r' ) )
            // InternalCimpl.g:462:1: ( '\\r' )
            {
            // InternalCimpl.g:462:1: ( '\\r' )
            // InternalCimpl.g:463:2: '\\r'
            {
             before(grammarAccess.getDocHeaderAccess().getControl000dKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDocHeaderAccess().getControl000dKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocHeader__Group__6__Impl"


    // $ANTLR start "rule__DocHeader__Group__7"
    // InternalCimpl.g:472:1: rule__DocHeader__Group__7 : rule__DocHeader__Group__7__Impl ;
    public final void rule__DocHeader__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:476:1: ( rule__DocHeader__Group__7__Impl )
            // InternalCimpl.g:477:2: rule__DocHeader__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DocHeader__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocHeader__Group__7"


    // $ANTLR start "rule__DocHeader__Group__7__Impl"
    // InternalCimpl.g:483:1: rule__DocHeader__Group__7__Impl : ( '\\r' ) ;
    public final void rule__DocHeader__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:487:1: ( ( '\\r' ) )
            // InternalCimpl.g:488:1: ( '\\r' )
            {
            // InternalCimpl.g:488:1: ( '\\r' )
            // InternalCimpl.g:489:2: '\\r'
            {
             before(grammarAccess.getDocHeaderAccess().getControl000dKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDocHeaderAccess().getControl000dKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocHeader__Group__7__Impl"


    // $ANTLR start "rule__UsesStatement__Group__0"
    // InternalCimpl.g:499:1: rule__UsesStatement__Group__0 : rule__UsesStatement__Group__0__Impl rule__UsesStatement__Group__1 ;
    public final void rule__UsesStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:503:1: ( rule__UsesStatement__Group__0__Impl rule__UsesStatement__Group__1 )
            // InternalCimpl.g:504:2: rule__UsesStatement__Group__0__Impl rule__UsesStatement__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCimpl.g:511:1: rule__UsesStatement__Group__0__Impl : ( 'Uses:' ) ;
    public final void rule__UsesStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:515:1: ( ( 'Uses:' ) )
            // InternalCimpl.g:516:1: ( 'Uses:' )
            {
            // InternalCimpl.g:516:1: ( 'Uses:' )
            // InternalCimpl.g:517:2: 'Uses:'
            {
             before(grammarAccess.getUsesStatementAccess().getUsesKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalCimpl.g:526:1: rule__UsesStatement__Group__1 : rule__UsesStatement__Group__1__Impl rule__UsesStatement__Group__2 ;
    public final void rule__UsesStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:530:1: ( rule__UsesStatement__Group__1__Impl rule__UsesStatement__Group__2 )
            // InternalCimpl.g:531:2: rule__UsesStatement__Group__1__Impl rule__UsesStatement__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalCimpl.g:538:1: rule__UsesStatement__Group__1__Impl : ( ( rule__UsesStatement__NamespaceAssignment_1 ) ) ;
    public final void rule__UsesStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:542:1: ( ( ( rule__UsesStatement__NamespaceAssignment_1 ) ) )
            // InternalCimpl.g:543:1: ( ( rule__UsesStatement__NamespaceAssignment_1 ) )
            {
            // InternalCimpl.g:543:1: ( ( rule__UsesStatement__NamespaceAssignment_1 ) )
            // InternalCimpl.g:544:2: ( rule__UsesStatement__NamespaceAssignment_1 )
            {
             before(grammarAccess.getUsesStatementAccess().getNamespaceAssignment_1()); 
            // InternalCimpl.g:545:2: ( rule__UsesStatement__NamespaceAssignment_1 )
            // InternalCimpl.g:545:3: rule__UsesStatement__NamespaceAssignment_1
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
    // InternalCimpl.g:553:1: rule__UsesStatement__Group__2 : rule__UsesStatement__Group__2__Impl rule__UsesStatement__Group__3 ;
    public final void rule__UsesStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:557:1: ( rule__UsesStatement__Group__2__Impl rule__UsesStatement__Group__3 )
            // InternalCimpl.g:558:2: rule__UsesStatement__Group__2__Impl rule__UsesStatement__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalCimpl.g:565:1: rule__UsesStatement__Group__2__Impl : ( ( rule__UsesStatement__Group_2__0 )* ) ;
    public final void rule__UsesStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:569:1: ( ( ( rule__UsesStatement__Group_2__0 )* ) )
            // InternalCimpl.g:570:1: ( ( rule__UsesStatement__Group_2__0 )* )
            {
            // InternalCimpl.g:570:1: ( ( rule__UsesStatement__Group_2__0 )* )
            // InternalCimpl.g:571:2: ( rule__UsesStatement__Group_2__0 )*
            {
             before(grammarAccess.getUsesStatementAccess().getGroup_2()); 
            // InternalCimpl.g:572:2: ( rule__UsesStatement__Group_2__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCimpl.g:572:3: rule__UsesStatement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__UsesStatement__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalCimpl.g:580:1: rule__UsesStatement__Group__3 : rule__UsesStatement__Group__3__Impl rule__UsesStatement__Group__4 ;
    public final void rule__UsesStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:584:1: ( rule__UsesStatement__Group__3__Impl rule__UsesStatement__Group__4 )
            // InternalCimpl.g:585:2: rule__UsesStatement__Group__3__Impl rule__UsesStatement__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalCimpl.g:592:1: rule__UsesStatement__Group__3__Impl : ( '\\r' ) ;
    public final void rule__UsesStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:596:1: ( ( '\\r' ) )
            // InternalCimpl.g:597:1: ( '\\r' )
            {
            // InternalCimpl.g:597:1: ( '\\r' )
            // InternalCimpl.g:598:2: '\\r'
            {
             before(grammarAccess.getUsesStatementAccess().getControl000dKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getUsesStatementAccess().getControl000dKeyword_3()); 

            }


            }

        }
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
    // InternalCimpl.g:607:1: rule__UsesStatement__Group__4 : rule__UsesStatement__Group__4__Impl ;
    public final void rule__UsesStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:611:1: ( rule__UsesStatement__Group__4__Impl )
            // InternalCimpl.g:612:2: rule__UsesStatement__Group__4__Impl
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
    // InternalCimpl.g:618:1: rule__UsesStatement__Group__4__Impl : ( '\\r' ) ;
    public final void rule__UsesStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:622:1: ( ( '\\r' ) )
            // InternalCimpl.g:623:1: ( '\\r' )
            {
            // InternalCimpl.g:623:1: ( '\\r' )
            // InternalCimpl.g:624:2: '\\r'
            {
             before(grammarAccess.getUsesStatementAccess().getControl000dKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getUsesStatementAccess().getControl000dKeyword_4()); 

            }


            }

        }
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
    // InternalCimpl.g:634:1: rule__UsesStatement__Group_2__0 : rule__UsesStatement__Group_2__0__Impl rule__UsesStatement__Group_2__1 ;
    public final void rule__UsesStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:638:1: ( rule__UsesStatement__Group_2__0__Impl rule__UsesStatement__Group_2__1 )
            // InternalCimpl.g:639:2: rule__UsesStatement__Group_2__0__Impl rule__UsesStatement__Group_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCimpl.g:646:1: rule__UsesStatement__Group_2__0__Impl : ( ',' ) ;
    public final void rule__UsesStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:650:1: ( ( ',' ) )
            // InternalCimpl.g:651:1: ( ',' )
            {
            // InternalCimpl.g:651:1: ( ',' )
            // InternalCimpl.g:652:2: ','
            {
             before(grammarAccess.getUsesStatementAccess().getCommaKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalCimpl.g:661:1: rule__UsesStatement__Group_2__1 : rule__UsesStatement__Group_2__1__Impl ;
    public final void rule__UsesStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:665:1: ( rule__UsesStatement__Group_2__1__Impl )
            // InternalCimpl.g:666:2: rule__UsesStatement__Group_2__1__Impl
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
    // InternalCimpl.g:672:1: rule__UsesStatement__Group_2__1__Impl : ( ( rule__UsesStatement__NamespaceAssignment_2_1 ) ) ;
    public final void rule__UsesStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:676:1: ( ( ( rule__UsesStatement__NamespaceAssignment_2_1 ) ) )
            // InternalCimpl.g:677:1: ( ( rule__UsesStatement__NamespaceAssignment_2_1 ) )
            {
            // InternalCimpl.g:677:1: ( ( rule__UsesStatement__NamespaceAssignment_2_1 ) )
            // InternalCimpl.g:678:2: ( rule__UsesStatement__NamespaceAssignment_2_1 )
            {
             before(grammarAccess.getUsesStatementAccess().getNamespaceAssignment_2_1()); 
            // InternalCimpl.g:679:2: ( rule__UsesStatement__NamespaceAssignment_2_1 )
            // InternalCimpl.g:679:3: rule__UsesStatement__NamespaceAssignment_2_1
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


    // $ANTLR start "rule__EntryElement__Group__0"
    // InternalCimpl.g:688:1: rule__EntryElement__Group__0 : rule__EntryElement__Group__0__Impl rule__EntryElement__Group__1 ;
    public final void rule__EntryElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:692:1: ( rule__EntryElement__Group__0__Impl rule__EntryElement__Group__1 )
            // InternalCimpl.g:693:2: rule__EntryElement__Group__0__Impl rule__EntryElement__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCimpl.g:700:1: rule__EntryElement__Group__0__Impl : ( 'EntryElement' ) ;
    public final void rule__EntryElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:704:1: ( ( 'EntryElement' ) )
            // InternalCimpl.g:705:1: ( 'EntryElement' )
            {
            // InternalCimpl.g:705:1: ( 'EntryElement' )
            // InternalCimpl.g:706:2: 'EntryElement'
            {
             before(grammarAccess.getEntryElementAccess().getEntryElementKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalCimpl.g:715:1: rule__EntryElement__Group__1 : rule__EntryElement__Group__1__Impl rule__EntryElement__Group__2 ;
    public final void rule__EntryElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:719:1: ( rule__EntryElement__Group__1__Impl rule__EntryElement__Group__2 )
            // InternalCimpl.g:720:2: rule__EntryElement__Group__1__Impl rule__EntryElement__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalCimpl.g:727:1: rule__EntryElement__Group__1__Impl : ( ( rule__EntryElement__NameAssignment_1 ) ) ;
    public final void rule__EntryElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:731:1: ( ( ( rule__EntryElement__NameAssignment_1 ) ) )
            // InternalCimpl.g:732:1: ( ( rule__EntryElement__NameAssignment_1 ) )
            {
            // InternalCimpl.g:732:1: ( ( rule__EntryElement__NameAssignment_1 ) )
            // InternalCimpl.g:733:2: ( rule__EntryElement__NameAssignment_1 )
            {
             before(grammarAccess.getEntryElementAccess().getNameAssignment_1()); 
            // InternalCimpl.g:734:2: ( rule__EntryElement__NameAssignment_1 )
            // InternalCimpl.g:734:3: rule__EntryElement__NameAssignment_1
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
    // InternalCimpl.g:742:1: rule__EntryElement__Group__2 : rule__EntryElement__Group__2__Impl rule__EntryElement__Group__3 ;
    public final void rule__EntryElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:746:1: ( rule__EntryElement__Group__2__Impl rule__EntryElement__Group__3 )
            // InternalCimpl.g:747:2: rule__EntryElement__Group__2__Impl rule__EntryElement__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalCimpl.g:754:1: rule__EntryElement__Group__2__Impl : ( '\\r\\n' ) ;
    public final void rule__EntryElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:758:1: ( ( '\\r\\n' ) )
            // InternalCimpl.g:759:1: ( '\\r\\n' )
            {
            // InternalCimpl.g:759:1: ( '\\r\\n' )
            // InternalCimpl.g:760:2: '\\r\\n'
            {
             before(grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_2()); 
            match(input,13,FOLLOW_2); 
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
    // InternalCimpl.g:769:1: rule__EntryElement__Group__3 : rule__EntryElement__Group__3__Impl rule__EntryElement__Group__4 ;
    public final void rule__EntryElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:773:1: ( rule__EntryElement__Group__3__Impl rule__EntryElement__Group__4 )
            // InternalCimpl.g:774:2: rule__EntryElement__Group__3__Impl rule__EntryElement__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalCimpl.g:781:1: rule__EntryElement__Group__3__Impl : ( 'Based On:' ) ;
    public final void rule__EntryElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:785:1: ( ( 'Based On:' ) )
            // InternalCimpl.g:786:1: ( 'Based On:' )
            {
            // InternalCimpl.g:786:1: ( 'Based On:' )
            // InternalCimpl.g:787:2: 'Based On:'
            {
             before(grammarAccess.getEntryElementAccess().getBasedOnKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getBasedOnKeyword_3()); 

            }


            }

        }
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
    // InternalCimpl.g:796:1: rule__EntryElement__Group__4 : rule__EntryElement__Group__4__Impl rule__EntryElement__Group__5 ;
    public final void rule__EntryElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:800:1: ( rule__EntryElement__Group__4__Impl rule__EntryElement__Group__5 )
            // InternalCimpl.g:801:2: rule__EntryElement__Group__4__Impl rule__EntryElement__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalCimpl.g:808:1: rule__EntryElement__Group__4__Impl : ( ( rule__EntryElement__BasedOnAssignment_4 ) ) ;
    public final void rule__EntryElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:812:1: ( ( ( rule__EntryElement__BasedOnAssignment_4 ) ) )
            // InternalCimpl.g:813:1: ( ( rule__EntryElement__BasedOnAssignment_4 ) )
            {
            // InternalCimpl.g:813:1: ( ( rule__EntryElement__BasedOnAssignment_4 ) )
            // InternalCimpl.g:814:2: ( rule__EntryElement__BasedOnAssignment_4 )
            {
             before(grammarAccess.getEntryElementAccess().getBasedOnAssignment_4()); 
            // InternalCimpl.g:815:2: ( rule__EntryElement__BasedOnAssignment_4 )
            // InternalCimpl.g:815:3: rule__EntryElement__BasedOnAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__EntryElement__BasedOnAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEntryElementAccess().getBasedOnAssignment_4()); 

            }


            }

        }
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
    // InternalCimpl.g:823:1: rule__EntryElement__Group__5 : rule__EntryElement__Group__5__Impl rule__EntryElement__Group__6 ;
    public final void rule__EntryElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:827:1: ( rule__EntryElement__Group__5__Impl rule__EntryElement__Group__6 )
            // InternalCimpl.g:828:2: rule__EntryElement__Group__5__Impl rule__EntryElement__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalCimpl.g:835:1: rule__EntryElement__Group__5__Impl : ( '\\r\\n' ) ;
    public final void rule__EntryElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:839:1: ( ( '\\r\\n' ) )
            // InternalCimpl.g:840:1: ( '\\r\\n' )
            {
            // InternalCimpl.g:840:1: ( '\\r\\n' )
            // InternalCimpl.g:841:2: '\\r\\n'
            {
             before(grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_5()); 

            }


            }

        }
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
    // InternalCimpl.g:850:1: rule__EntryElement__Group__6 : rule__EntryElement__Group__6__Impl rule__EntryElement__Group__7 ;
    public final void rule__EntryElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:854:1: ( rule__EntryElement__Group__6__Impl rule__EntryElement__Group__7 )
            // InternalCimpl.g:855:2: rule__EntryElement__Group__6__Impl rule__EntryElement__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalCimpl.g:862:1: rule__EntryElement__Group__6__Impl : ( 'Concept:' ) ;
    public final void rule__EntryElement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:866:1: ( ( 'Concept:' ) )
            // InternalCimpl.g:867:1: ( 'Concept:' )
            {
            // InternalCimpl.g:867:1: ( 'Concept:' )
            // InternalCimpl.g:868:2: 'Concept:'
            {
             before(grammarAccess.getEntryElementAccess().getConceptKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getConceptKeyword_6()); 

            }


            }

        }
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
    // InternalCimpl.g:877:1: rule__EntryElement__Group__7 : rule__EntryElement__Group__7__Impl rule__EntryElement__Group__8 ;
    public final void rule__EntryElement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:881:1: ( rule__EntryElement__Group__7__Impl rule__EntryElement__Group__8 )
            // InternalCimpl.g:882:2: rule__EntryElement__Group__7__Impl rule__EntryElement__Group__8
            {
            pushFollow(FOLLOW_8);
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
    // InternalCimpl.g:889:1: rule__EntryElement__Group__7__Impl : ( ( rule__EntryElement__ConceptAssignment_7 ) ) ;
    public final void rule__EntryElement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:893:1: ( ( ( rule__EntryElement__ConceptAssignment_7 ) ) )
            // InternalCimpl.g:894:1: ( ( rule__EntryElement__ConceptAssignment_7 ) )
            {
            // InternalCimpl.g:894:1: ( ( rule__EntryElement__ConceptAssignment_7 ) )
            // InternalCimpl.g:895:2: ( rule__EntryElement__ConceptAssignment_7 )
            {
             before(grammarAccess.getEntryElementAccess().getConceptAssignment_7()); 
            // InternalCimpl.g:896:2: ( rule__EntryElement__ConceptAssignment_7 )
            // InternalCimpl.g:896:3: rule__EntryElement__ConceptAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__EntryElement__ConceptAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getEntryElementAccess().getConceptAssignment_7()); 

            }


            }

        }
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
    // InternalCimpl.g:904:1: rule__EntryElement__Group__8 : rule__EntryElement__Group__8__Impl rule__EntryElement__Group__9 ;
    public final void rule__EntryElement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:908:1: ( rule__EntryElement__Group__8__Impl rule__EntryElement__Group__9 )
            // InternalCimpl.g:909:2: rule__EntryElement__Group__8__Impl rule__EntryElement__Group__9
            {
            pushFollow(FOLLOW_15);
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
    // InternalCimpl.g:916:1: rule__EntryElement__Group__8__Impl : ( '\\r\\n' ) ;
    public final void rule__EntryElement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:920:1: ( ( '\\r\\n' ) )
            // InternalCimpl.g:921:1: ( '\\r\\n' )
            {
            // InternalCimpl.g:921:1: ( '\\r\\n' )
            // InternalCimpl.g:922:2: '\\r\\n'
            {
             before(grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_8()); 

            }


            }

        }
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
    // InternalCimpl.g:931:1: rule__EntryElement__Group__9 : rule__EntryElement__Group__9__Impl rule__EntryElement__Group__10 ;
    public final void rule__EntryElement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:935:1: ( rule__EntryElement__Group__9__Impl rule__EntryElement__Group__10 )
            // InternalCimpl.g:936:2: rule__EntryElement__Group__9__Impl rule__EntryElement__Group__10
            {
            pushFollow(FOLLOW_7);
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
    // InternalCimpl.g:943:1: rule__EntryElement__Group__9__Impl : ( 'Description:' ) ;
    public final void rule__EntryElement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:947:1: ( ( 'Description:' ) )
            // InternalCimpl.g:948:1: ( 'Description:' )
            {
            // InternalCimpl.g:948:1: ( 'Description:' )
            // InternalCimpl.g:949:2: 'Description:'
            {
             before(grammarAccess.getEntryElementAccess().getDescriptionKeyword_9()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getDescriptionKeyword_9()); 

            }


            }

        }
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
    // InternalCimpl.g:958:1: rule__EntryElement__Group__10 : rule__EntryElement__Group__10__Impl rule__EntryElement__Group__11 ;
    public final void rule__EntryElement__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:962:1: ( rule__EntryElement__Group__10__Impl rule__EntryElement__Group__11 )
            // InternalCimpl.g:963:2: rule__EntryElement__Group__10__Impl rule__EntryElement__Group__11
            {
            pushFollow(FOLLOW_8);
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
    // InternalCimpl.g:970:1: rule__EntryElement__Group__10__Impl : ( ( rule__EntryElement__DescriptionAssignment_10 ) ) ;
    public final void rule__EntryElement__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:974:1: ( ( ( rule__EntryElement__DescriptionAssignment_10 ) ) )
            // InternalCimpl.g:975:1: ( ( rule__EntryElement__DescriptionAssignment_10 ) )
            {
            // InternalCimpl.g:975:1: ( ( rule__EntryElement__DescriptionAssignment_10 ) )
            // InternalCimpl.g:976:2: ( rule__EntryElement__DescriptionAssignment_10 )
            {
             before(grammarAccess.getEntryElementAccess().getDescriptionAssignment_10()); 
            // InternalCimpl.g:977:2: ( rule__EntryElement__DescriptionAssignment_10 )
            // InternalCimpl.g:977:3: rule__EntryElement__DescriptionAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__EntryElement__DescriptionAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getEntryElementAccess().getDescriptionAssignment_10()); 

            }


            }

        }
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
    // InternalCimpl.g:985:1: rule__EntryElement__Group__11 : rule__EntryElement__Group__11__Impl rule__EntryElement__Group__12 ;
    public final void rule__EntryElement__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:989:1: ( rule__EntryElement__Group__11__Impl rule__EntryElement__Group__12 )
            // InternalCimpl.g:990:2: rule__EntryElement__Group__11__Impl rule__EntryElement__Group__12
            {
            pushFollow(FOLLOW_16);
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
    // InternalCimpl.g:997:1: rule__EntryElement__Group__11__Impl : ( '\\r\\n' ) ;
    public final void rule__EntryElement__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1001:1: ( ( '\\r\\n' ) )
            // InternalCimpl.g:1002:1: ( '\\r\\n' )
            {
            // InternalCimpl.g:1002:1: ( '\\r\\n' )
            // InternalCimpl.g:1003:2: '\\r\\n'
            {
             before(grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_11()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_11()); 

            }


            }

        }
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
    // InternalCimpl.g:1012:1: rule__EntryElement__Group__12 : rule__EntryElement__Group__12__Impl rule__EntryElement__Group__13 ;
    public final void rule__EntryElement__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1016:1: ( rule__EntryElement__Group__12__Impl rule__EntryElement__Group__13 )
            // InternalCimpl.g:1017:2: rule__EntryElement__Group__12__Impl rule__EntryElement__Group__13
            {
            pushFollow(FOLLOW_16);
            rule__EntryElement__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntryElement__Group__13();

            state._fsp--;


            }

        }
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
    // InternalCimpl.g:1024:1: rule__EntryElement__Group__12__Impl : ( ( rule__EntryElement__ElementsAssignment_12 )? ) ;
    public final void rule__EntryElement__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1028:1: ( ( ( rule__EntryElement__ElementsAssignment_12 )? ) )
            // InternalCimpl.g:1029:1: ( ( rule__EntryElement__ElementsAssignment_12 )? )
            {
            // InternalCimpl.g:1029:1: ( ( rule__EntryElement__ElementsAssignment_12 )? )
            // InternalCimpl.g:1030:2: ( rule__EntryElement__ElementsAssignment_12 )?
            {
             before(grammarAccess.getEntryElementAccess().getElementsAssignment_12()); 
            // InternalCimpl.g:1031:2: ( rule__EntryElement__ElementsAssignment_12 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCimpl.g:1031:3: rule__EntryElement__ElementsAssignment_12
                    {
                    pushFollow(FOLLOW_2);
                    rule__EntryElement__ElementsAssignment_12();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntryElementAccess().getElementsAssignment_12()); 

            }


            }

        }
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


    // $ANTLR start "rule__EntryElement__Group__13"
    // InternalCimpl.g:1039:1: rule__EntryElement__Group__13 : rule__EntryElement__Group__13__Impl rule__EntryElement__Group__14 ;
    public final void rule__EntryElement__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1043:1: ( rule__EntryElement__Group__13__Impl rule__EntryElement__Group__14 )
            // InternalCimpl.g:1044:2: rule__EntryElement__Group__13__Impl rule__EntryElement__Group__14
            {
            pushFollow(FOLLOW_16);
            rule__EntryElement__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntryElement__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group__13"


    // $ANTLR start "rule__EntryElement__Group__13__Impl"
    // InternalCimpl.g:1051:1: rule__EntryElement__Group__13__Impl : ( ( rule__EntryElement__Group_13__0 )* ) ;
    public final void rule__EntryElement__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1055:1: ( ( ( rule__EntryElement__Group_13__0 )* ) )
            // InternalCimpl.g:1056:1: ( ( rule__EntryElement__Group_13__0 )* )
            {
            // InternalCimpl.g:1056:1: ( ( rule__EntryElement__Group_13__0 )* )
            // InternalCimpl.g:1057:2: ( rule__EntryElement__Group_13__0 )*
            {
             before(grammarAccess.getEntryElementAccess().getGroup_13()); 
            // InternalCimpl.g:1058:2: ( rule__EntryElement__Group_13__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==RULE_INT) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalCimpl.g:1058:3: rule__EntryElement__Group_13__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__EntryElement__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getEntryElementAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group__13__Impl"


    // $ANTLR start "rule__EntryElement__Group__14"
    // InternalCimpl.g:1066:1: rule__EntryElement__Group__14 : rule__EntryElement__Group__14__Impl rule__EntryElement__Group__15 ;
    public final void rule__EntryElement__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1070:1: ( rule__EntryElement__Group__14__Impl rule__EntryElement__Group__15 )
            // InternalCimpl.g:1071:2: rule__EntryElement__Group__14__Impl rule__EntryElement__Group__15
            {
            pushFollow(FOLLOW_18);
            rule__EntryElement__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntryElement__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group__14"


    // $ANTLR start "rule__EntryElement__Group__14__Impl"
    // InternalCimpl.g:1078:1: rule__EntryElement__Group__14__Impl : ( '\\r\\n' ) ;
    public final void rule__EntryElement__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1082:1: ( ( '\\r\\n' ) )
            // InternalCimpl.g:1083:1: ( '\\r\\n' )
            {
            // InternalCimpl.g:1083:1: ( '\\r\\n' )
            // InternalCimpl.g:1084:2: '\\r\\n'
            {
             before(grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_14()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group__14__Impl"


    // $ANTLR start "rule__EntryElement__Group__15"
    // InternalCimpl.g:1093:1: rule__EntryElement__Group__15 : rule__EntryElement__Group__15__Impl rule__EntryElement__Group__16 ;
    public final void rule__EntryElement__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1097:1: ( rule__EntryElement__Group__15__Impl rule__EntryElement__Group__16 )
            // InternalCimpl.g:1098:2: rule__EntryElement__Group__15__Impl rule__EntryElement__Group__16
            {
            pushFollow(FOLLOW_18);
            rule__EntryElement__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntryElement__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group__15"


    // $ANTLR start "rule__EntryElement__Group__15__Impl"
    // InternalCimpl.g:1105:1: rule__EntryElement__Group__15__Impl : ( ( rule__EntryElement__Group_15__0 )* ) ;
    public final void rule__EntryElement__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1109:1: ( ( ( rule__EntryElement__Group_15__0 )* ) )
            // InternalCimpl.g:1110:1: ( ( rule__EntryElement__Group_15__0 )* )
            {
            // InternalCimpl.g:1110:1: ( ( rule__EntryElement__Group_15__0 )* )
            // InternalCimpl.g:1111:2: ( rule__EntryElement__Group_15__0 )*
            {
             before(grammarAccess.getEntryElementAccess().getGroup_15()); 
            // InternalCimpl.g:1112:2: ( rule__EntryElement__Group_15__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCimpl.g:1112:3: rule__EntryElement__Group_15__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__EntryElement__Group_15__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEntryElementAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group__15__Impl"


    // $ANTLR start "rule__EntryElement__Group__16"
    // InternalCimpl.g:1120:1: rule__EntryElement__Group__16 : rule__EntryElement__Group__16__Impl rule__EntryElement__Group__17 ;
    public final void rule__EntryElement__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1124:1: ( rule__EntryElement__Group__16__Impl rule__EntryElement__Group__17 )
            // InternalCimpl.g:1125:2: rule__EntryElement__Group__16__Impl rule__EntryElement__Group__17
            {
            pushFollow(FOLLOW_20);
            rule__EntryElement__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntryElement__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group__16"


    // $ANTLR start "rule__EntryElement__Group__16__Impl"
    // InternalCimpl.g:1132:1: rule__EntryElement__Group__16__Impl : ( 'Value:' ) ;
    public final void rule__EntryElement__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1136:1: ( ( 'Value:' ) )
            // InternalCimpl.g:1137:1: ( 'Value:' )
            {
            // InternalCimpl.g:1137:1: ( 'Value:' )
            // InternalCimpl.g:1138:2: 'Value:'
            {
             before(grammarAccess.getEntryElementAccess().getValueKeyword_16()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getValueKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group__16__Impl"


    // $ANTLR start "rule__EntryElement__Group__17"
    // InternalCimpl.g:1147:1: rule__EntryElement__Group__17 : rule__EntryElement__Group__17__Impl rule__EntryElement__Group__18 ;
    public final void rule__EntryElement__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1151:1: ( rule__EntryElement__Group__17__Impl rule__EntryElement__Group__18 )
            // InternalCimpl.g:1152:2: rule__EntryElement__Group__17__Impl rule__EntryElement__Group__18
            {
            pushFollow(FOLLOW_20);
            rule__EntryElement__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntryElement__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group__17"


    // $ANTLR start "rule__EntryElement__Group__17__Impl"
    // InternalCimpl.g:1159:1: rule__EntryElement__Group__17__Impl : ( ( rule__EntryElement__ValueAssignment_17 )? ) ;
    public final void rule__EntryElement__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1163:1: ( ( ( rule__EntryElement__ValueAssignment_17 )? ) )
            // InternalCimpl.g:1164:1: ( ( rule__EntryElement__ValueAssignment_17 )? )
            {
            // InternalCimpl.g:1164:1: ( ( rule__EntryElement__ValueAssignment_17 )? )
            // InternalCimpl.g:1165:2: ( rule__EntryElement__ValueAssignment_17 )?
            {
             before(grammarAccess.getEntryElementAccess().getValueAssignment_17()); 
            // InternalCimpl.g:1166:2: ( rule__EntryElement__ValueAssignment_17 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCimpl.g:1166:3: rule__EntryElement__ValueAssignment_17
                    {
                    pushFollow(FOLLOW_2);
                    rule__EntryElement__ValueAssignment_17();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntryElementAccess().getValueAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group__17__Impl"


    // $ANTLR start "rule__EntryElement__Group__18"
    // InternalCimpl.g:1174:1: rule__EntryElement__Group__18 : rule__EntryElement__Group__18__Impl ;
    public final void rule__EntryElement__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1178:1: ( rule__EntryElement__Group__18__Impl )
            // InternalCimpl.g:1179:2: rule__EntryElement__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntryElement__Group__18__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group__18"


    // $ANTLR start "rule__EntryElement__Group__18__Impl"
    // InternalCimpl.g:1185:1: rule__EntryElement__Group__18__Impl : ( '\\r\\n' ) ;
    public final void rule__EntryElement__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1189:1: ( ( '\\r\\n' ) )
            // InternalCimpl.g:1190:1: ( '\\r\\n' )
            {
            // InternalCimpl.g:1190:1: ( '\\r\\n' )
            // InternalCimpl.g:1191:2: '\\r\\n'
            {
             before(grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_18()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group__18__Impl"


    // $ANTLR start "rule__EntryElement__Group_13__0"
    // InternalCimpl.g:1201:1: rule__EntryElement__Group_13__0 : rule__EntryElement__Group_13__0__Impl rule__EntryElement__Group_13__1 ;
    public final void rule__EntryElement__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1205:1: ( rule__EntryElement__Group_13__0__Impl rule__EntryElement__Group_13__1 )
            // InternalCimpl.g:1206:2: rule__EntryElement__Group_13__0__Impl rule__EntryElement__Group_13__1
            {
            pushFollow(FOLLOW_21);
            rule__EntryElement__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntryElement__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group_13__0"


    // $ANTLR start "rule__EntryElement__Group_13__0__Impl"
    // InternalCimpl.g:1213:1: rule__EntryElement__Group_13__0__Impl : ( '\\r\\n' ) ;
    public final void rule__EntryElement__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1217:1: ( ( '\\r\\n' ) )
            // InternalCimpl.g:1218:1: ( '\\r\\n' )
            {
            // InternalCimpl.g:1218:1: ( '\\r\\n' )
            // InternalCimpl.g:1219:2: '\\r\\n'
            {
             before(grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_13_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group_13__0__Impl"


    // $ANTLR start "rule__EntryElement__Group_13__1"
    // InternalCimpl.g:1228:1: rule__EntryElement__Group_13__1 : rule__EntryElement__Group_13__1__Impl ;
    public final void rule__EntryElement__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1232:1: ( rule__EntryElement__Group_13__1__Impl )
            // InternalCimpl.g:1233:2: rule__EntryElement__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntryElement__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group_13__1"


    // $ANTLR start "rule__EntryElement__Group_13__1__Impl"
    // InternalCimpl.g:1239:1: rule__EntryElement__Group_13__1__Impl : ( ( rule__EntryElement__ElementsAssignment_13_1 ) ) ;
    public final void rule__EntryElement__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1243:1: ( ( ( rule__EntryElement__ElementsAssignment_13_1 ) ) )
            // InternalCimpl.g:1244:1: ( ( rule__EntryElement__ElementsAssignment_13_1 ) )
            {
            // InternalCimpl.g:1244:1: ( ( rule__EntryElement__ElementsAssignment_13_1 ) )
            // InternalCimpl.g:1245:2: ( rule__EntryElement__ElementsAssignment_13_1 )
            {
             before(grammarAccess.getEntryElementAccess().getElementsAssignment_13_1()); 
            // InternalCimpl.g:1246:2: ( rule__EntryElement__ElementsAssignment_13_1 )
            // InternalCimpl.g:1246:3: rule__EntryElement__ElementsAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__EntryElement__ElementsAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getEntryElementAccess().getElementsAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group_13__1__Impl"


    // $ANTLR start "rule__EntryElement__Group_15__0"
    // InternalCimpl.g:1255:1: rule__EntryElement__Group_15__0 : rule__EntryElement__Group_15__0__Impl rule__EntryElement__Group_15__1 ;
    public final void rule__EntryElement__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1259:1: ( rule__EntryElement__Group_15__0__Impl rule__EntryElement__Group_15__1 )
            // InternalCimpl.g:1260:2: rule__EntryElement__Group_15__0__Impl rule__EntryElement__Group_15__1
            {
            pushFollow(FOLLOW_4);
            rule__EntryElement__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntryElement__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group_15__0"


    // $ANTLR start "rule__EntryElement__Group_15__0__Impl"
    // InternalCimpl.g:1267:1: rule__EntryElement__Group_15__0__Impl : ( '\\t' ) ;
    public final void rule__EntryElement__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1271:1: ( ( '\\t' ) )
            // InternalCimpl.g:1272:1: ( '\\t' )
            {
            // InternalCimpl.g:1272:1: ( '\\t' )
            // InternalCimpl.g:1273:2: '\\t'
            {
             before(grammarAccess.getEntryElementAccess().getControl0009Keyword_15_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getControl0009Keyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group_15__0__Impl"


    // $ANTLR start "rule__EntryElement__Group_15__1"
    // InternalCimpl.g:1282:1: rule__EntryElement__Group_15__1 : rule__EntryElement__Group_15__1__Impl ;
    public final void rule__EntryElement__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1286:1: ( rule__EntryElement__Group_15__1__Impl )
            // InternalCimpl.g:1287:2: rule__EntryElement__Group_15__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntryElement__Group_15__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group_15__1"


    // $ANTLR start "rule__EntryElement__Group_15__1__Impl"
    // InternalCimpl.g:1293:1: rule__EntryElement__Group_15__1__Impl : ( ( rule__EntryElement__SubelementsAssignment_15_1 ) ) ;
    public final void rule__EntryElement__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1297:1: ( ( ( rule__EntryElement__SubelementsAssignment_15_1 ) ) )
            // InternalCimpl.g:1298:1: ( ( rule__EntryElement__SubelementsAssignment_15_1 ) )
            {
            // InternalCimpl.g:1298:1: ( ( rule__EntryElement__SubelementsAssignment_15_1 ) )
            // InternalCimpl.g:1299:2: ( rule__EntryElement__SubelementsAssignment_15_1 )
            {
             before(grammarAccess.getEntryElementAccess().getSubelementsAssignment_15_1()); 
            // InternalCimpl.g:1300:2: ( rule__EntryElement__SubelementsAssignment_15_1 )
            // InternalCimpl.g:1300:3: rule__EntryElement__SubelementsAssignment_15_1
            {
            pushFollow(FOLLOW_2);
            rule__EntryElement__SubelementsAssignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getEntryElementAccess().getSubelementsAssignment_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__Group_15__1__Impl"


    // $ANTLR start "rule__Element__Group__0"
    // InternalCimpl.g:1309:1: rule__Element__Group__0 : rule__Element__Group__0__Impl rule__Element__Group__1 ;
    public final void rule__Element__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1313:1: ( rule__Element__Group__0__Impl rule__Element__Group__1 )
            // InternalCimpl.g:1314:2: rule__Element__Group__0__Impl rule__Element__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalCimpl.g:1321:1: rule__Element__Group__0__Impl : ( ( rule__Element__LowerAssignment_0 ) ) ;
    public final void rule__Element__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1325:1: ( ( ( rule__Element__LowerAssignment_0 ) ) )
            // InternalCimpl.g:1326:1: ( ( rule__Element__LowerAssignment_0 ) )
            {
            // InternalCimpl.g:1326:1: ( ( rule__Element__LowerAssignment_0 ) )
            // InternalCimpl.g:1327:2: ( rule__Element__LowerAssignment_0 )
            {
             before(grammarAccess.getElementAccess().getLowerAssignment_0()); 
            // InternalCimpl.g:1328:2: ( rule__Element__LowerAssignment_0 )
            // InternalCimpl.g:1328:3: rule__Element__LowerAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Element__LowerAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getLowerAssignment_0()); 

            }


            }

        }
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
    // InternalCimpl.g:1336:1: rule__Element__Group__1 : rule__Element__Group__1__Impl rule__Element__Group__2 ;
    public final void rule__Element__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1340:1: ( rule__Element__Group__1__Impl rule__Element__Group__2 )
            // InternalCimpl.g:1341:2: rule__Element__Group__1__Impl rule__Element__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalCimpl.g:1348:1: rule__Element__Group__1__Impl : ( '..' ) ;
    public final void rule__Element__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1352:1: ( ( '..' ) )
            // InternalCimpl.g:1353:1: ( '..' )
            {
            // InternalCimpl.g:1353:1: ( '..' )
            // InternalCimpl.g:1354:2: '..'
            {
             before(grammarAccess.getElementAccess().getFullStopFullStopKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getFullStopFullStopKeyword_1()); 

            }


            }

        }
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
    // InternalCimpl.g:1363:1: rule__Element__Group__2 : rule__Element__Group__2__Impl rule__Element__Group__3 ;
    public final void rule__Element__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1367:1: ( rule__Element__Group__2__Impl rule__Element__Group__3 )
            // InternalCimpl.g:1368:2: rule__Element__Group__2__Impl rule__Element__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalCimpl.g:1375:1: rule__Element__Group__2__Impl : ( ( rule__Element__UpperAssignment_2 ) ) ;
    public final void rule__Element__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1379:1: ( ( ( rule__Element__UpperAssignment_2 ) ) )
            // InternalCimpl.g:1380:1: ( ( rule__Element__UpperAssignment_2 ) )
            {
            // InternalCimpl.g:1380:1: ( ( rule__Element__UpperAssignment_2 ) )
            // InternalCimpl.g:1381:2: ( rule__Element__UpperAssignment_2 )
            {
             before(grammarAccess.getElementAccess().getUpperAssignment_2()); 
            // InternalCimpl.g:1382:2: ( rule__Element__UpperAssignment_2 )
            // InternalCimpl.g:1382:3: rule__Element__UpperAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Element__UpperAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getUpperAssignment_2()); 

            }


            }

        }
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
    // InternalCimpl.g:1390:1: rule__Element__Group__3 : rule__Element__Group__3__Impl ;
    public final void rule__Element__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1394:1: ( rule__Element__Group__3__Impl )
            // InternalCimpl.g:1395:2: rule__Element__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalCimpl.g:1401:1: rule__Element__Group__3__Impl : ( ( rule__Element__NameAssignment_3 ) ) ;
    public final void rule__Element__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1405:1: ( ( ( rule__Element__NameAssignment_3 ) ) )
            // InternalCimpl.g:1406:1: ( ( rule__Element__NameAssignment_3 ) )
            {
            // InternalCimpl.g:1406:1: ( ( rule__Element__NameAssignment_3 ) )
            // InternalCimpl.g:1407:2: ( rule__Element__NameAssignment_3 )
            {
             before(grammarAccess.getElementAccess().getNameAssignment_3()); 
            // InternalCimpl.g:1408:2: ( rule__Element__NameAssignment_3 )
            // InternalCimpl.g:1408:3: rule__Element__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Element__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getNameAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalCimpl.g:1417:1: rule__Model__ElementsAssignment : ( ruleDoc ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1421:1: ( ( ruleDoc ) )
            // InternalCimpl.g:1422:2: ( ruleDoc )
            {
            // InternalCimpl.g:1422:2: ( ruleDoc )
            // InternalCimpl.g:1423:3: ruleDoc
            {
             before(grammarAccess.getModelAccess().getElementsDocParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDoc();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsDocParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__Doc__HeaderAssignment_0"
    // InternalCimpl.g:1432:1: rule__Doc__HeaderAssignment_0 : ( ruleDocHeader ) ;
    public final void rule__Doc__HeaderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1436:1: ( ( ruleDocHeader ) )
            // InternalCimpl.g:1437:2: ( ruleDocHeader )
            {
            // InternalCimpl.g:1437:2: ( ruleDocHeader )
            // InternalCimpl.g:1438:3: ruleDocHeader
            {
             before(grammarAccess.getDocAccess().getHeaderDocHeaderParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDocHeader();

            state._fsp--;

             after(grammarAccess.getDocAccess().getHeaderDocHeaderParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doc__HeaderAssignment_0"


    // $ANTLR start "rule__Doc__UsesAssignment_1"
    // InternalCimpl.g:1447:1: rule__Doc__UsesAssignment_1 : ( ruleUsesStatement ) ;
    public final void rule__Doc__UsesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1451:1: ( ( ruleUsesStatement ) )
            // InternalCimpl.g:1452:2: ( ruleUsesStatement )
            {
            // InternalCimpl.g:1452:2: ( ruleUsesStatement )
            // InternalCimpl.g:1453:3: ruleUsesStatement
            {
             before(grammarAccess.getDocAccess().getUsesUsesStatementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUsesStatement();

            state._fsp--;

             after(grammarAccess.getDocAccess().getUsesUsesStatementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doc__UsesAssignment_1"


    // $ANTLR start "rule__Doc__EntriesAssignment_2"
    // InternalCimpl.g:1462:1: rule__Doc__EntriesAssignment_2 : ( ruleEntryElement ) ;
    public final void rule__Doc__EntriesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1466:1: ( ( ruleEntryElement ) )
            // InternalCimpl.g:1467:2: ( ruleEntryElement )
            {
            // InternalCimpl.g:1467:2: ( ruleEntryElement )
            // InternalCimpl.g:1468:3: ruleEntryElement
            {
             before(grammarAccess.getDocAccess().getEntriesEntryElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEntryElement();

            state._fsp--;

             after(grammarAccess.getDocAccess().getEntriesEntryElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doc__EntriesAssignment_2"


    // $ANTLR start "rule__DocHeader__VersionAssignment_2"
    // InternalCimpl.g:1477:1: rule__DocHeader__VersionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__DocHeader__VersionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1481:1: ( ( RULE_STRING ) )
            // InternalCimpl.g:1482:2: ( RULE_STRING )
            {
            // InternalCimpl.g:1482:2: ( RULE_STRING )
            // InternalCimpl.g:1483:3: RULE_STRING
            {
             before(grammarAccess.getDocHeaderAccess().getVersionSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDocHeaderAccess().getVersionSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocHeader__VersionAssignment_2"


    // $ANTLR start "rule__DocHeader__NamespaceAssignment_5"
    // InternalCimpl.g:1492:1: rule__DocHeader__NamespaceAssignment_5 : ( RULE_STRING ) ;
    public final void rule__DocHeader__NamespaceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1496:1: ( ( RULE_STRING ) )
            // InternalCimpl.g:1497:2: ( RULE_STRING )
            {
            // InternalCimpl.g:1497:2: ( RULE_STRING )
            // InternalCimpl.g:1498:3: RULE_STRING
            {
             before(grammarAccess.getDocHeaderAccess().getNamespaceSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDocHeaderAccess().getNamespaceSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocHeader__NamespaceAssignment_5"


    // $ANTLR start "rule__UsesStatement__NamespaceAssignment_1"
    // InternalCimpl.g:1507:1: rule__UsesStatement__NamespaceAssignment_1 : ( RULE_STRING ) ;
    public final void rule__UsesStatement__NamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1511:1: ( ( RULE_STRING ) )
            // InternalCimpl.g:1512:2: ( RULE_STRING )
            {
            // InternalCimpl.g:1512:2: ( RULE_STRING )
            // InternalCimpl.g:1513:3: RULE_STRING
            {
             before(grammarAccess.getUsesStatementAccess().getNamespaceSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUsesStatementAccess().getNamespaceSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalCimpl.g:1522:1: rule__UsesStatement__NamespaceAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__UsesStatement__NamespaceAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1526:1: ( ( RULE_STRING ) )
            // InternalCimpl.g:1527:2: ( RULE_STRING )
            {
            // InternalCimpl.g:1527:2: ( RULE_STRING )
            // InternalCimpl.g:1528:3: RULE_STRING
            {
             before(grammarAccess.getUsesStatementAccess().getNamespaceSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUsesStatementAccess().getNamespaceSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__EntryElement__NameAssignment_1"
    // InternalCimpl.g:1537:1: rule__EntryElement__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__EntryElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1541:1: ( ( RULE_STRING ) )
            // InternalCimpl.g:1542:2: ( RULE_STRING )
            {
            // InternalCimpl.g:1542:2: ( RULE_STRING )
            // InternalCimpl.g:1543:3: RULE_STRING
            {
             before(grammarAccess.getEntryElementAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__EntryElement__BasedOnAssignment_4"
    // InternalCimpl.g:1552:1: rule__EntryElement__BasedOnAssignment_4 : ( RULE_STRING ) ;
    public final void rule__EntryElement__BasedOnAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1556:1: ( ( RULE_STRING ) )
            // InternalCimpl.g:1557:2: ( RULE_STRING )
            {
            // InternalCimpl.g:1557:2: ( RULE_STRING )
            // InternalCimpl.g:1558:3: RULE_STRING
            {
             before(grammarAccess.getEntryElementAccess().getBasedOnSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getBasedOnSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__BasedOnAssignment_4"


    // $ANTLR start "rule__EntryElement__ConceptAssignment_7"
    // InternalCimpl.g:1567:1: rule__EntryElement__ConceptAssignment_7 : ( RULE_STRING ) ;
    public final void rule__EntryElement__ConceptAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1571:1: ( ( RULE_STRING ) )
            // InternalCimpl.g:1572:2: ( RULE_STRING )
            {
            // InternalCimpl.g:1572:2: ( RULE_STRING )
            // InternalCimpl.g:1573:3: RULE_STRING
            {
             before(grammarAccess.getEntryElementAccess().getConceptSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getConceptSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__ConceptAssignment_7"


    // $ANTLR start "rule__EntryElement__DescriptionAssignment_10"
    // InternalCimpl.g:1582:1: rule__EntryElement__DescriptionAssignment_10 : ( RULE_STRING ) ;
    public final void rule__EntryElement__DescriptionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1586:1: ( ( RULE_STRING ) )
            // InternalCimpl.g:1587:2: ( RULE_STRING )
            {
            // InternalCimpl.g:1587:2: ( RULE_STRING )
            // InternalCimpl.g:1588:3: RULE_STRING
            {
             before(grammarAccess.getEntryElementAccess().getDescriptionSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getDescriptionSTRINGTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__DescriptionAssignment_10"


    // $ANTLR start "rule__EntryElement__ElementsAssignment_12"
    // InternalCimpl.g:1597:1: rule__EntryElement__ElementsAssignment_12 : ( ruleElement ) ;
    public final void rule__EntryElement__ElementsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1601:1: ( ( ruleElement ) )
            // InternalCimpl.g:1602:2: ( ruleElement )
            {
            // InternalCimpl.g:1602:2: ( ruleElement )
            // InternalCimpl.g:1603:3: ruleElement
            {
             before(grammarAccess.getEntryElementAccess().getElementsElementParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getEntryElementAccess().getElementsElementParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__ElementsAssignment_12"


    // $ANTLR start "rule__EntryElement__ElementsAssignment_13_1"
    // InternalCimpl.g:1612:1: rule__EntryElement__ElementsAssignment_13_1 : ( ruleElement ) ;
    public final void rule__EntryElement__ElementsAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1616:1: ( ( ruleElement ) )
            // InternalCimpl.g:1617:2: ( ruleElement )
            {
            // InternalCimpl.g:1617:2: ( ruleElement )
            // InternalCimpl.g:1618:3: ruleElement
            {
             before(grammarAccess.getEntryElementAccess().getElementsElementParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getEntryElementAccess().getElementsElementParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__ElementsAssignment_13_1"


    // $ANTLR start "rule__EntryElement__SubelementsAssignment_15_1"
    // InternalCimpl.g:1627:1: rule__EntryElement__SubelementsAssignment_15_1 : ( ruleEntryElement ) ;
    public final void rule__EntryElement__SubelementsAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1631:1: ( ( ruleEntryElement ) )
            // InternalCimpl.g:1632:2: ( ruleEntryElement )
            {
            // InternalCimpl.g:1632:2: ( ruleEntryElement )
            // InternalCimpl.g:1633:3: ruleEntryElement
            {
             before(grammarAccess.getEntryElementAccess().getSubelementsEntryElementParserRuleCall_15_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntryElement();

            state._fsp--;

             after(grammarAccess.getEntryElementAccess().getSubelementsEntryElementParserRuleCall_15_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__SubelementsAssignment_15_1"


    // $ANTLR start "rule__EntryElement__ValueAssignment_17"
    // InternalCimpl.g:1642:1: rule__EntryElement__ValueAssignment_17 : ( RULE_STRING ) ;
    public final void rule__EntryElement__ValueAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1646:1: ( ( RULE_STRING ) )
            // InternalCimpl.g:1647:2: ( RULE_STRING )
            {
            // InternalCimpl.g:1647:2: ( RULE_STRING )
            // InternalCimpl.g:1648:3: RULE_STRING
            {
             before(grammarAccess.getEntryElementAccess().getValueSTRINGTerminalRuleCall_17_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEntryElementAccess().getValueSTRINGTerminalRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntryElement__ValueAssignment_17"


    // $ANTLR start "rule__Element__LowerAssignment_0"
    // InternalCimpl.g:1657:1: rule__Element__LowerAssignment_0 : ( RULE_INT ) ;
    public final void rule__Element__LowerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1661:1: ( ( RULE_INT ) )
            // InternalCimpl.g:1662:2: ( RULE_INT )
            {
            // InternalCimpl.g:1662:2: ( RULE_INT )
            // InternalCimpl.g:1663:3: RULE_INT
            {
             before(grammarAccess.getElementAccess().getLowerINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getLowerINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__LowerAssignment_0"


    // $ANTLR start "rule__Element__UpperAssignment_2"
    // InternalCimpl.g:1672:1: rule__Element__UpperAssignment_2 : ( RULE_INT ) ;
    public final void rule__Element__UpperAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1676:1: ( ( RULE_INT ) )
            // InternalCimpl.g:1677:2: ( RULE_INT )
            {
            // InternalCimpl.g:1677:2: ( RULE_INT )
            // InternalCimpl.g:1678:3: RULE_INT
            {
             before(grammarAccess.getElementAccess().getUpperINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getUpperINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__UpperAssignment_2"


    // $ANTLR start "rule__Element__NameAssignment_3"
    // InternalCimpl.g:1687:1: rule__Element__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Element__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCimpl.g:1691:1: ( ( RULE_STRING ) )
            // InternalCimpl.g:1692:2: ( RULE_STRING )
            {
            // InternalCimpl.g:1692:2: ( RULE_STRING )
            // InternalCimpl.g:1693:3: RULE_STRING
            {
             before(grammarAccess.getElementAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__NameAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});

}