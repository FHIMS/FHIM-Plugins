package org.standardhealh.cimpl.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.standardhealh.cimpl.dsl.services.CimplGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCimplParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_BASEDON", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Description:'", "'\\r'", "'Grammar:\\tDataElement'", "'\\r\\n'", "'Namespace:'", "'Uses:'", "','", "'CodeSystem:'", "'\\r\\nEntryElement:'", "'Based on:'", "'Concept:'", "'includes'", "'..'", "'\\r\\nElement:'", "'Value:'", "'CodeableConcept from'", "'Quantity with units'", "' '", "'/'", "';'", "'!'", "'\\u00A7'", "'%'", "'&'", "'('", "')'", "'?'", "'*'", "'+'", "'.'", "'-'", "'|'", "'['", "']'"
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

        public InternalCimplParser(TokenStream input, CimplGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Profile";
       	}

       	@Override
       	protected CimplGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProfile"
    // InternalCimpl.g:64:1: entryRuleProfile returns [EObject current=null] : iv_ruleProfile= ruleProfile EOF ;
    public final EObject entryRuleProfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProfile = null;


        try {
            // InternalCimpl.g:64:48: (iv_ruleProfile= ruleProfile EOF )
            // InternalCimpl.g:65:2: iv_ruleProfile= ruleProfile EOF
            {
             newCompositeNode(grammarAccess.getProfileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProfile=ruleProfile();

            state._fsp--;

             current =iv_ruleProfile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProfile"


    // $ANTLR start "ruleProfile"
    // InternalCimpl.g:71:1: ruleProfile returns [EObject current=null] : ( ( (lv_header_0_0= ruleHeader ) ) ( (lv_description_1_0= ruleDescription ) ) ( (lv_uses_2_0= ruleUsesStatement ) )? ( (lv_codeSystems_3_0= ruleCodeSystem ) )* ( (lv_entries_4_0= ruleEntryElement ) )* ( (lv_elements_5_0= ruleElement ) )* ) ;
    public final EObject ruleProfile() throws RecognitionException {
        EObject current = null;

        EObject lv_header_0_0 = null;

        EObject lv_description_1_0 = null;

        EObject lv_uses_2_0 = null;

        EObject lv_codeSystems_3_0 = null;

        EObject lv_entries_4_0 = null;

        EObject lv_elements_5_0 = null;



        	enterRule();

        try {
            // InternalCimpl.g:77:2: ( ( ( (lv_header_0_0= ruleHeader ) ) ( (lv_description_1_0= ruleDescription ) ) ( (lv_uses_2_0= ruleUsesStatement ) )? ( (lv_codeSystems_3_0= ruleCodeSystem ) )* ( (lv_entries_4_0= ruleEntryElement ) )* ( (lv_elements_5_0= ruleElement ) )* ) )
            // InternalCimpl.g:78:2: ( ( (lv_header_0_0= ruleHeader ) ) ( (lv_description_1_0= ruleDescription ) ) ( (lv_uses_2_0= ruleUsesStatement ) )? ( (lv_codeSystems_3_0= ruleCodeSystem ) )* ( (lv_entries_4_0= ruleEntryElement ) )* ( (lv_elements_5_0= ruleElement ) )* )
            {
            // InternalCimpl.g:78:2: ( ( (lv_header_0_0= ruleHeader ) ) ( (lv_description_1_0= ruleDescription ) ) ( (lv_uses_2_0= ruleUsesStatement ) )? ( (lv_codeSystems_3_0= ruleCodeSystem ) )* ( (lv_entries_4_0= ruleEntryElement ) )* ( (lv_elements_5_0= ruleElement ) )* )
            // InternalCimpl.g:79:3: ( (lv_header_0_0= ruleHeader ) ) ( (lv_description_1_0= ruleDescription ) ) ( (lv_uses_2_0= ruleUsesStatement ) )? ( (lv_codeSystems_3_0= ruleCodeSystem ) )* ( (lv_entries_4_0= ruleEntryElement ) )* ( (lv_elements_5_0= ruleElement ) )*
            {
            // InternalCimpl.g:79:3: ( (lv_header_0_0= ruleHeader ) )
            // InternalCimpl.g:80:4: (lv_header_0_0= ruleHeader )
            {
            // InternalCimpl.g:80:4: (lv_header_0_0= ruleHeader )
            // InternalCimpl.g:81:5: lv_header_0_0= ruleHeader
            {

            					newCompositeNode(grammarAccess.getProfileAccess().getHeaderHeaderParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_header_0_0=ruleHeader();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProfileRule());
            					}
            					set(
            						current,
            						"header",
            						lv_header_0_0,
            						"org.standardhealh.cimpl.dsl.Cimpl.Header");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCimpl.g:98:3: ( (lv_description_1_0= ruleDescription ) )
            // InternalCimpl.g:99:4: (lv_description_1_0= ruleDescription )
            {
            // InternalCimpl.g:99:4: (lv_description_1_0= ruleDescription )
            // InternalCimpl.g:100:5: lv_description_1_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getProfileAccess().getDescriptionDescriptionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_description_1_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProfileRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_1_0,
            						"org.standardhealh.cimpl.dsl.Cimpl.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCimpl.g:117:3: ( (lv_uses_2_0= ruleUsesStatement ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCimpl.g:118:4: (lv_uses_2_0= ruleUsesStatement )
                    {
                    // InternalCimpl.g:118:4: (lv_uses_2_0= ruleUsesStatement )
                    // InternalCimpl.g:119:5: lv_uses_2_0= ruleUsesStatement
                    {

                    					newCompositeNode(grammarAccess.getProfileAccess().getUsesUsesStatementParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_uses_2_0=ruleUsesStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProfileRule());
                    					}
                    					set(
                    						current,
                    						"uses",
                    						lv_uses_2_0,
                    						"org.standardhealh.cimpl.dsl.Cimpl.UsesStatement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCimpl.g:136:3: ( (lv_codeSystems_3_0= ruleCodeSystem ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCimpl.g:137:4: (lv_codeSystems_3_0= ruleCodeSystem )
            	    {
            	    // InternalCimpl.g:137:4: (lv_codeSystems_3_0= ruleCodeSystem )
            	    // InternalCimpl.g:138:5: lv_codeSystems_3_0= ruleCodeSystem
            	    {

            	    					newCompositeNode(grammarAccess.getProfileAccess().getCodeSystemsCodeSystemParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_codeSystems_3_0=ruleCodeSystem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProfileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"codeSystems",
            	    						lv_codeSystems_3_0,
            	    						"org.standardhealh.cimpl.dsl.Cimpl.CodeSystem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalCimpl.g:155:3: ( (lv_entries_4_0= ruleEntryElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCimpl.g:156:4: (lv_entries_4_0= ruleEntryElement )
            	    {
            	    // InternalCimpl.g:156:4: (lv_entries_4_0= ruleEntryElement )
            	    // InternalCimpl.g:157:5: lv_entries_4_0= ruleEntryElement
            	    {

            	    					newCompositeNode(grammarAccess.getProfileAccess().getEntriesEntryElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_entries_4_0=ruleEntryElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProfileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entries",
            	    						lv_entries_4_0,
            	    						"org.standardhealh.cimpl.dsl.Cimpl.EntryElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalCimpl.g:174:3: ( (lv_elements_5_0= ruleElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCimpl.g:175:4: (lv_elements_5_0= ruleElement )
            	    {
            	    // InternalCimpl.g:175:4: (lv_elements_5_0= ruleElement )
            	    // InternalCimpl.g:176:5: lv_elements_5_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getProfileAccess().getElementsElementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_elements_5_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProfileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_5_0,
            	    						"org.standardhealh.cimpl.dsl.Cimpl.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProfile"


    // $ANTLR start "entryRuleDescription"
    // InternalCimpl.g:197:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalCimpl.g:197:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalCimpl.g:198:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalCimpl.g:204:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'Description:' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= '\\r' ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCimpl.g:210:2: ( (otherlv_0= 'Description:' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= '\\r' ) )
            // InternalCimpl.g:211:2: (otherlv_0= 'Description:' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= '\\r' )
            {
            // InternalCimpl.g:211:2: (otherlv_0= 'Description:' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= '\\r' )
            // InternalCimpl.g:212:3: otherlv_0= 'Description:' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= '\\r'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
            		
            // InternalCimpl.g:216:3: ( (lv_description_1_0= RULE_STRING ) )
            // InternalCimpl.g:217:4: (lv_description_1_0= RULE_STRING )
            {
            // InternalCimpl.g:217:4: (lv_description_1_0= RULE_STRING )
            // InternalCimpl.g:218:5: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_description_1_0, grammarAccess.getDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDescriptionAccess().getCarriageReturnKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleHeader"
    // InternalCimpl.g:242:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalCimpl.g:242:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalCimpl.g:243:2: iv_ruleHeader= ruleHeader EOF
            {
             newCompositeNode(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeader=ruleHeader();

            state._fsp--;

             current =iv_ruleHeader; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalCimpl.g:249:1: ruleHeader returns [EObject current=null] : (otherlv_0= 'Grammar:\\tDataElement' ( (lv_version_1_0= ruleCIMPLSTRING ) ) otherlv_2= '\\r\\n' otherlv_3= 'Namespace:' ( (lv_namespace_4_0= ruleCIMPLSTRING ) ) otherlv_5= '\\r' ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_version_1_0 = null;

        AntlrDatatypeRuleToken lv_namespace_4_0 = null;



        	enterRule();

        try {
            // InternalCimpl.g:255:2: ( (otherlv_0= 'Grammar:\\tDataElement' ( (lv_version_1_0= ruleCIMPLSTRING ) ) otherlv_2= '\\r\\n' otherlv_3= 'Namespace:' ( (lv_namespace_4_0= ruleCIMPLSTRING ) ) otherlv_5= '\\r' ) )
            // InternalCimpl.g:256:2: (otherlv_0= 'Grammar:\\tDataElement' ( (lv_version_1_0= ruleCIMPLSTRING ) ) otherlv_2= '\\r\\n' otherlv_3= 'Namespace:' ( (lv_namespace_4_0= ruleCIMPLSTRING ) ) otherlv_5= '\\r' )
            {
            // InternalCimpl.g:256:2: (otherlv_0= 'Grammar:\\tDataElement' ( (lv_version_1_0= ruleCIMPLSTRING ) ) otherlv_2= '\\r\\n' otherlv_3= 'Namespace:' ( (lv_namespace_4_0= ruleCIMPLSTRING ) ) otherlv_5= '\\r' )
            // InternalCimpl.g:257:3: otherlv_0= 'Grammar:\\tDataElement' ( (lv_version_1_0= ruleCIMPLSTRING ) ) otherlv_2= '\\r\\n' otherlv_3= 'Namespace:' ( (lv_namespace_4_0= ruleCIMPLSTRING ) ) otherlv_5= '\\r'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getHeaderAccess().getGrammarDataElementKeyword_0());
            		
            // InternalCimpl.g:261:3: ( (lv_version_1_0= ruleCIMPLSTRING ) )
            // InternalCimpl.g:262:4: (lv_version_1_0= ruleCIMPLSTRING )
            {
            // InternalCimpl.g:262:4: (lv_version_1_0= ruleCIMPLSTRING )
            // InternalCimpl.g:263:5: lv_version_1_0= ruleCIMPLSTRING
            {

            					newCompositeNode(grammarAccess.getHeaderAccess().getVersionCIMPLSTRINGParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_version_1_0=ruleCIMPLSTRING();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeaderRule());
            					}
            					set(
            						current,
            						"version",
            						lv_version_1_0,
            						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getHeaderAccess().getControl000dControl000aKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getHeaderAccess().getNamespaceKeyword_3());
            		
            // InternalCimpl.g:288:3: ( (lv_namespace_4_0= ruleCIMPLSTRING ) )
            // InternalCimpl.g:289:4: (lv_namespace_4_0= ruleCIMPLSTRING )
            {
            // InternalCimpl.g:289:4: (lv_namespace_4_0= ruleCIMPLSTRING )
            // InternalCimpl.g:290:5: lv_namespace_4_0= ruleCIMPLSTRING
            {

            					newCompositeNode(grammarAccess.getHeaderAccess().getNamespaceCIMPLSTRINGParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_namespace_4_0=ruleCIMPLSTRING();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeaderRule());
            					}
            					set(
            						current,
            						"namespace",
            						lv_namespace_4_0,
            						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getHeaderAccess().getCarriageReturnKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleUsesStatement"
    // InternalCimpl.g:315:1: entryRuleUsesStatement returns [EObject current=null] : iv_ruleUsesStatement= ruleUsesStatement EOF ;
    public final EObject entryRuleUsesStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsesStatement = null;


        try {
            // InternalCimpl.g:315:54: (iv_ruleUsesStatement= ruleUsesStatement EOF )
            // InternalCimpl.g:316:2: iv_ruleUsesStatement= ruleUsesStatement EOF
            {
             newCompositeNode(grammarAccess.getUsesStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUsesStatement=ruleUsesStatement();

            state._fsp--;

             current =iv_ruleUsesStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUsesStatement"


    // $ANTLR start "ruleUsesStatement"
    // InternalCimpl.g:322:1: ruleUsesStatement returns [EObject current=null] : (otherlv_0= 'Uses:' ( (lv_namespace_1_0= ruleCIMPLSTRING ) ) (otherlv_2= ',' ( (lv_namespace_3_0= ruleCIMPLSTRING ) ) )* otherlv_4= '\\r' otherlv_5= '\\r' ) ;
    public final EObject ruleUsesStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_namespace_1_0 = null;

        AntlrDatatypeRuleToken lv_namespace_3_0 = null;



        	enterRule();

        try {
            // InternalCimpl.g:328:2: ( (otherlv_0= 'Uses:' ( (lv_namespace_1_0= ruleCIMPLSTRING ) ) (otherlv_2= ',' ( (lv_namespace_3_0= ruleCIMPLSTRING ) ) )* otherlv_4= '\\r' otherlv_5= '\\r' ) )
            // InternalCimpl.g:329:2: (otherlv_0= 'Uses:' ( (lv_namespace_1_0= ruleCIMPLSTRING ) ) (otherlv_2= ',' ( (lv_namespace_3_0= ruleCIMPLSTRING ) ) )* otherlv_4= '\\r' otherlv_5= '\\r' )
            {
            // InternalCimpl.g:329:2: (otherlv_0= 'Uses:' ( (lv_namespace_1_0= ruleCIMPLSTRING ) ) (otherlv_2= ',' ( (lv_namespace_3_0= ruleCIMPLSTRING ) ) )* otherlv_4= '\\r' otherlv_5= '\\r' )
            // InternalCimpl.g:330:3: otherlv_0= 'Uses:' ( (lv_namespace_1_0= ruleCIMPLSTRING ) ) (otherlv_2= ',' ( (lv_namespace_3_0= ruleCIMPLSTRING ) ) )* otherlv_4= '\\r' otherlv_5= '\\r'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getUsesStatementAccess().getUsesKeyword_0());
            		
            // InternalCimpl.g:334:3: ( (lv_namespace_1_0= ruleCIMPLSTRING ) )
            // InternalCimpl.g:335:4: (lv_namespace_1_0= ruleCIMPLSTRING )
            {
            // InternalCimpl.g:335:4: (lv_namespace_1_0= ruleCIMPLSTRING )
            // InternalCimpl.g:336:5: lv_namespace_1_0= ruleCIMPLSTRING
            {

            					newCompositeNode(grammarAccess.getUsesStatementAccess().getNamespaceCIMPLSTRINGParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_namespace_1_0=ruleCIMPLSTRING();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUsesStatementRule());
            					}
            					add(
            						current,
            						"namespace",
            						lv_namespace_1_0,
            						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCimpl.g:353:3: (otherlv_2= ',' ( (lv_namespace_3_0= ruleCIMPLSTRING ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCimpl.g:354:4: otherlv_2= ',' ( (lv_namespace_3_0= ruleCIMPLSTRING ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getUsesStatementAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalCimpl.g:358:4: ( (lv_namespace_3_0= ruleCIMPLSTRING ) )
            	    // InternalCimpl.g:359:5: (lv_namespace_3_0= ruleCIMPLSTRING )
            	    {
            	    // InternalCimpl.g:359:5: (lv_namespace_3_0= ruleCIMPLSTRING )
            	    // InternalCimpl.g:360:6: lv_namespace_3_0= ruleCIMPLSTRING
            	    {

            	    						newCompositeNode(grammarAccess.getUsesStatementAccess().getNamespaceCIMPLSTRINGParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_namespace_3_0=ruleCIMPLSTRING();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUsesStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"namespace",
            	    							lv_namespace_3_0,
            	    							"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getUsesStatementAccess().getCarriageReturnKeyword_3());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getUsesStatementAccess().getCarriageReturnKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUsesStatement"


    // $ANTLR start "entryRuleCodeSystem"
    // InternalCimpl.g:390:1: entryRuleCodeSystem returns [EObject current=null] : iv_ruleCodeSystem= ruleCodeSystem EOF ;
    public final EObject entryRuleCodeSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeSystem = null;


        try {
            // InternalCimpl.g:390:51: (iv_ruleCodeSystem= ruleCodeSystem EOF )
            // InternalCimpl.g:391:2: iv_ruleCodeSystem= ruleCodeSystem EOF
            {
             newCompositeNode(grammarAccess.getCodeSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodeSystem=ruleCodeSystem();

            state._fsp--;

             current =iv_ruleCodeSystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCodeSystem"


    // $ANTLR start "ruleCodeSystem"
    // InternalCimpl.g:397:1: ruleCodeSystem returns [EObject current=null] : (otherlv_0= 'CodeSystem:' ( (lv_namespace_1_0= ruleCIMPLSTRING ) ) otherlv_2= '\\r' ) ;
    public final EObject ruleCodeSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_namespace_1_0 = null;



        	enterRule();

        try {
            // InternalCimpl.g:403:2: ( (otherlv_0= 'CodeSystem:' ( (lv_namespace_1_0= ruleCIMPLSTRING ) ) otherlv_2= '\\r' ) )
            // InternalCimpl.g:404:2: (otherlv_0= 'CodeSystem:' ( (lv_namespace_1_0= ruleCIMPLSTRING ) ) otherlv_2= '\\r' )
            {
            // InternalCimpl.g:404:2: (otherlv_0= 'CodeSystem:' ( (lv_namespace_1_0= ruleCIMPLSTRING ) ) otherlv_2= '\\r' )
            // InternalCimpl.g:405:3: otherlv_0= 'CodeSystem:' ( (lv_namespace_1_0= ruleCIMPLSTRING ) ) otherlv_2= '\\r'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCodeSystemAccess().getCodeSystemKeyword_0());
            		
            // InternalCimpl.g:409:3: ( (lv_namespace_1_0= ruleCIMPLSTRING ) )
            // InternalCimpl.g:410:4: (lv_namespace_1_0= ruleCIMPLSTRING )
            {
            // InternalCimpl.g:410:4: (lv_namespace_1_0= ruleCIMPLSTRING )
            // InternalCimpl.g:411:5: lv_namespace_1_0= ruleCIMPLSTRING
            {

            					newCompositeNode(grammarAccess.getCodeSystemAccess().getNamespaceCIMPLSTRINGParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_namespace_1_0=ruleCIMPLSTRING();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCodeSystemRule());
            					}
            					set(
            						current,
            						"namespace",
            						lv_namespace_1_0,
            						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCodeSystemAccess().getCarriageReturnKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCodeSystem"


    // $ANTLR start "entryRuleEntryElement"
    // InternalCimpl.g:436:1: entryRuleEntryElement returns [EObject current=null] : iv_ruleEntryElement= ruleEntryElement EOF ;
    public final EObject entryRuleEntryElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryElement = null;


        try {
            // InternalCimpl.g:436:53: (iv_ruleEntryElement= ruleEntryElement EOF )
            // InternalCimpl.g:437:2: iv_ruleEntryElement= ruleEntryElement EOF
            {
             newCompositeNode(grammarAccess.getEntryElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntryElement=ruleEntryElement();

            state._fsp--;

             current =iv_ruleEntryElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntryElement"


    // $ANTLR start "ruleEntryElement"
    // InternalCimpl.g:443:1: ruleEntryElement returns [EObject current=null] : (otherlv_0= '\\r\\nEntryElement:' ( (lv_name_1_0= ruleCIMPLSTRING ) ) otherlv_2= '\\r\\n' (otherlv_3= 'Based on:' ( (lv_basedOn_4_0= ruleCIMPLSTRING ) ) otherlv_5= '\\r\\n' )? otherlv_6= 'Concept:' ( (lv_concept_7_0= ruleCIMPLSTRING ) ) ( (lv_conceptDescription_8_0= RULE_STRING ) ) otherlv_9= '\\r\\n' otherlv_10= 'Description:' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= '\\r\\n' ( ( (lv_redefinitions_13_0= ruleRedefinition ) )? (otherlv_14= '\\r\\n' ( (lv_redefinitions_15_0= ruleRedefinition ) ) )* otherlv_16= '\\r\\n' ) ( (lv_subsets_17_0= ruleSubsets ) )? ) ;
    public final EObject ruleEntryElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_conceptDescription_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_description_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_basedOn_4_0 = null;

        AntlrDatatypeRuleToken lv_concept_7_0 = null;

        EObject lv_redefinitions_13_0 = null;

        EObject lv_redefinitions_15_0 = null;

        EObject lv_subsets_17_0 = null;



        	enterRule();

        try {
            // InternalCimpl.g:449:2: ( (otherlv_0= '\\r\\nEntryElement:' ( (lv_name_1_0= ruleCIMPLSTRING ) ) otherlv_2= '\\r\\n' (otherlv_3= 'Based on:' ( (lv_basedOn_4_0= ruleCIMPLSTRING ) ) otherlv_5= '\\r\\n' )? otherlv_6= 'Concept:' ( (lv_concept_7_0= ruleCIMPLSTRING ) ) ( (lv_conceptDescription_8_0= RULE_STRING ) ) otherlv_9= '\\r\\n' otherlv_10= 'Description:' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= '\\r\\n' ( ( (lv_redefinitions_13_0= ruleRedefinition ) )? (otherlv_14= '\\r\\n' ( (lv_redefinitions_15_0= ruleRedefinition ) ) )* otherlv_16= '\\r\\n' ) ( (lv_subsets_17_0= ruleSubsets ) )? ) )
            // InternalCimpl.g:450:2: (otherlv_0= '\\r\\nEntryElement:' ( (lv_name_1_0= ruleCIMPLSTRING ) ) otherlv_2= '\\r\\n' (otherlv_3= 'Based on:' ( (lv_basedOn_4_0= ruleCIMPLSTRING ) ) otherlv_5= '\\r\\n' )? otherlv_6= 'Concept:' ( (lv_concept_7_0= ruleCIMPLSTRING ) ) ( (lv_conceptDescription_8_0= RULE_STRING ) ) otherlv_9= '\\r\\n' otherlv_10= 'Description:' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= '\\r\\n' ( ( (lv_redefinitions_13_0= ruleRedefinition ) )? (otherlv_14= '\\r\\n' ( (lv_redefinitions_15_0= ruleRedefinition ) ) )* otherlv_16= '\\r\\n' ) ( (lv_subsets_17_0= ruleSubsets ) )? )
            {
            // InternalCimpl.g:450:2: (otherlv_0= '\\r\\nEntryElement:' ( (lv_name_1_0= ruleCIMPLSTRING ) ) otherlv_2= '\\r\\n' (otherlv_3= 'Based on:' ( (lv_basedOn_4_0= ruleCIMPLSTRING ) ) otherlv_5= '\\r\\n' )? otherlv_6= 'Concept:' ( (lv_concept_7_0= ruleCIMPLSTRING ) ) ( (lv_conceptDescription_8_0= RULE_STRING ) ) otherlv_9= '\\r\\n' otherlv_10= 'Description:' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= '\\r\\n' ( ( (lv_redefinitions_13_0= ruleRedefinition ) )? (otherlv_14= '\\r\\n' ( (lv_redefinitions_15_0= ruleRedefinition ) ) )* otherlv_16= '\\r\\n' ) ( (lv_subsets_17_0= ruleSubsets ) )? )
            // InternalCimpl.g:451:3: otherlv_0= '\\r\\nEntryElement:' ( (lv_name_1_0= ruleCIMPLSTRING ) ) otherlv_2= '\\r\\n' (otherlv_3= 'Based on:' ( (lv_basedOn_4_0= ruleCIMPLSTRING ) ) otherlv_5= '\\r\\n' )? otherlv_6= 'Concept:' ( (lv_concept_7_0= ruleCIMPLSTRING ) ) ( (lv_conceptDescription_8_0= RULE_STRING ) ) otherlv_9= '\\r\\n' otherlv_10= 'Description:' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= '\\r\\n' ( ( (lv_redefinitions_13_0= ruleRedefinition ) )? (otherlv_14= '\\r\\n' ( (lv_redefinitions_15_0= ruleRedefinition ) ) )* otherlv_16= '\\r\\n' ) ( (lv_subsets_17_0= ruleSubsets ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEntryElementAccess().getEntryElementKeyword_0());
            		
            // InternalCimpl.g:455:3: ( (lv_name_1_0= ruleCIMPLSTRING ) )
            // InternalCimpl.g:456:4: (lv_name_1_0= ruleCIMPLSTRING )
            {
            // InternalCimpl.g:456:4: (lv_name_1_0= ruleCIMPLSTRING )
            // InternalCimpl.g:457:5: lv_name_1_0= ruleCIMPLSTRING
            {

            					newCompositeNode(grammarAccess.getEntryElementAccess().getNameCIMPLSTRINGParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleCIMPLSTRING();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntryElementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_2());
            		
            // InternalCimpl.g:478:3: (otherlv_3= 'Based on:' ( (lv_basedOn_4_0= ruleCIMPLSTRING ) ) otherlv_5= '\\r\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCimpl.g:479:4: otherlv_3= 'Based on:' ( (lv_basedOn_4_0= ruleCIMPLSTRING ) ) otherlv_5= '\\r\\n'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntryElementAccess().getBasedOnKeyword_3_0());
                    			
                    // InternalCimpl.g:483:4: ( (lv_basedOn_4_0= ruleCIMPLSTRING ) )
                    // InternalCimpl.g:484:5: (lv_basedOn_4_0= ruleCIMPLSTRING )
                    {
                    // InternalCimpl.g:484:5: (lv_basedOn_4_0= ruleCIMPLSTRING )
                    // InternalCimpl.g:485:6: lv_basedOn_4_0= ruleCIMPLSTRING
                    {

                    						newCompositeNode(grammarAccess.getEntryElementAccess().getBasedOnCIMPLSTRINGParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_basedOn_4_0=ruleCIMPLSTRING();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntryElementRule());
                    						}
                    						set(
                    							current,
                    							"basedOn",
                    							lv_basedOn_4_0,
                    							"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_3_2());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getEntryElementAccess().getConceptKeyword_4());
            		
            // InternalCimpl.g:511:3: ( (lv_concept_7_0= ruleCIMPLSTRING ) )
            // InternalCimpl.g:512:4: (lv_concept_7_0= ruleCIMPLSTRING )
            {
            // InternalCimpl.g:512:4: (lv_concept_7_0= ruleCIMPLSTRING )
            // InternalCimpl.g:513:5: lv_concept_7_0= ruleCIMPLSTRING
            {

            					newCompositeNode(grammarAccess.getEntryElementAccess().getConceptCIMPLSTRINGParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_concept_7_0=ruleCIMPLSTRING();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntryElementRule());
            					}
            					set(
            						current,
            						"concept",
            						lv_concept_7_0,
            						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCimpl.g:530:3: ( (lv_conceptDescription_8_0= RULE_STRING ) )
            // InternalCimpl.g:531:4: (lv_conceptDescription_8_0= RULE_STRING )
            {
            // InternalCimpl.g:531:4: (lv_conceptDescription_8_0= RULE_STRING )
            // InternalCimpl.g:532:5: lv_conceptDescription_8_0= RULE_STRING
            {
            lv_conceptDescription_8_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_conceptDescription_8_0, grammarAccess.getEntryElementAccess().getConceptDescriptionSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntryElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"conceptDescription",
            						lv_conceptDescription_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_7());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_10, grammarAccess.getEntryElementAccess().getDescriptionKeyword_8());
            		
            // InternalCimpl.g:556:3: ( (lv_description_11_0= RULE_STRING ) )
            // InternalCimpl.g:557:4: (lv_description_11_0= RULE_STRING )
            {
            // InternalCimpl.g:557:4: (lv_description_11_0= RULE_STRING )
            // InternalCimpl.g:558:5: lv_description_11_0= RULE_STRING
            {
            lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_description_11_0, grammarAccess.getEntryElementAccess().getDescriptionSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntryElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_12=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_12, grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_10());
            		
            // InternalCimpl.g:578:3: ( ( (lv_redefinitions_13_0= ruleRedefinition ) )? (otherlv_14= '\\r\\n' ( (lv_redefinitions_15_0= ruleRedefinition ) ) )* otherlv_16= '\\r\\n' )
            // InternalCimpl.g:579:4: ( (lv_redefinitions_13_0= ruleRedefinition ) )? (otherlv_14= '\\r\\n' ( (lv_redefinitions_15_0= ruleRedefinition ) ) )* otherlv_16= '\\r\\n'
            {
            // InternalCimpl.g:579:4: ( (lv_redefinitions_13_0= ruleRedefinition ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT||LA7_0==18||(LA7_0>=29 && LA7_0<=45)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCimpl.g:580:5: (lv_redefinitions_13_0= ruleRedefinition )
                    {
                    // InternalCimpl.g:580:5: (lv_redefinitions_13_0= ruleRedefinition )
                    // InternalCimpl.g:581:6: lv_redefinitions_13_0= ruleRedefinition
                    {

                    						newCompositeNode(grammarAccess.getEntryElementAccess().getRedefinitionsRedefinitionParserRuleCall_11_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_redefinitions_13_0=ruleRedefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntryElementRule());
                    						}
                    						add(
                    							current,
                    							"redefinitions",
                    							lv_redefinitions_13_0,
                    							"org.standardhealh.cimpl.dsl.Cimpl.Redefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;

            }

            // InternalCimpl.g:598:4: (otherlv_14= '\\r\\n' ( (lv_redefinitions_15_0= ruleRedefinition ) ) )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // InternalCimpl.g:599:5: otherlv_14= '\\r\\n' ( (lv_redefinitions_15_0= ruleRedefinition ) )
            	    {
            	    otherlv_14=(Token)match(input,15,FOLLOW_17); 

            	    					newLeafNode(otherlv_14, grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_11_1_0());
            	    				
            	    // InternalCimpl.g:603:5: ( (lv_redefinitions_15_0= ruleRedefinition ) )
            	    // InternalCimpl.g:604:6: (lv_redefinitions_15_0= ruleRedefinition )
            	    {
            	    // InternalCimpl.g:604:6: (lv_redefinitions_15_0= ruleRedefinition )
            	    // InternalCimpl.g:605:7: lv_redefinitions_15_0= ruleRedefinition
            	    {

            	    							newCompositeNode(grammarAccess.getEntryElementAccess().getRedefinitionsRedefinitionParserRuleCall_11_1_1_0());
            	    						
            	    pushFollow(FOLLOW_11);
            	    lv_redefinitions_15_0=ruleRedefinition();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getEntryElementRule());
            	    							}
            	    							add(
            	    								current,
            	    								"redefinitions",
            	    								lv_redefinitions_15_0,
            	    								"org.standardhealh.cimpl.dsl.Cimpl.Redefinition");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_16=(Token)match(input,15,FOLLOW_18); 

            				newLeafNode(otherlv_16, grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_11_2());
            			

            }

            // InternalCimpl.g:628:3: ( (lv_subsets_17_0= ruleSubsets ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18||(LA9_0>=29 && LA9_0<=45)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCimpl.g:629:4: (lv_subsets_17_0= ruleSubsets )
                    {
                    // InternalCimpl.g:629:4: (lv_subsets_17_0= ruleSubsets )
                    // InternalCimpl.g:630:5: lv_subsets_17_0= ruleSubsets
                    {

                    					newCompositeNode(grammarAccess.getEntryElementAccess().getSubsetsSubsetsParserRuleCall_12_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_subsets_17_0=ruleSubsets();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntryElementRule());
                    					}
                    					add(
                    						current,
                    						"subsets",
                    						lv_subsets_17_0,
                    						"org.standardhealh.cimpl.dsl.Cimpl.Subsets");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntryElement"


    // $ANTLR start "entryRuleSubsets"
    // InternalCimpl.g:651:1: entryRuleSubsets returns [EObject current=null] : iv_ruleSubsets= ruleSubsets EOF ;
    public final EObject entryRuleSubsets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubsets = null;


        try {
            // InternalCimpl.g:651:48: (iv_ruleSubsets= ruleSubsets EOF )
            // InternalCimpl.g:652:2: iv_ruleSubsets= ruleSubsets EOF
            {
             newCompositeNode(grammarAccess.getSubsetsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubsets=ruleSubsets();

            state._fsp--;

             current =iv_ruleSubsets; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubsets"


    // $ANTLR start "ruleSubsets"
    // InternalCimpl.g:658:1: ruleSubsets returns [EObject current=null] : ( ( (lv_name_0_0= ruleCIMPLSTRING ) ) otherlv_1= '\\r\\n' ( (lv_subsets_2_0= ruleSubset ) )? (otherlv_3= '\\r\\n' ( (lv_subsets_4_0= ruleSubset ) ) )* otherlv_5= '\\r\\n' ) ;
    public final EObject ruleSubsets() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_subsets_2_0 = null;

        EObject lv_subsets_4_0 = null;



        	enterRule();

        try {
            // InternalCimpl.g:664:2: ( ( ( (lv_name_0_0= ruleCIMPLSTRING ) ) otherlv_1= '\\r\\n' ( (lv_subsets_2_0= ruleSubset ) )? (otherlv_3= '\\r\\n' ( (lv_subsets_4_0= ruleSubset ) ) )* otherlv_5= '\\r\\n' ) )
            // InternalCimpl.g:665:2: ( ( (lv_name_0_0= ruleCIMPLSTRING ) ) otherlv_1= '\\r\\n' ( (lv_subsets_2_0= ruleSubset ) )? (otherlv_3= '\\r\\n' ( (lv_subsets_4_0= ruleSubset ) ) )* otherlv_5= '\\r\\n' )
            {
            // InternalCimpl.g:665:2: ( ( (lv_name_0_0= ruleCIMPLSTRING ) ) otherlv_1= '\\r\\n' ( (lv_subsets_2_0= ruleSubset ) )? (otherlv_3= '\\r\\n' ( (lv_subsets_4_0= ruleSubset ) ) )* otherlv_5= '\\r\\n' )
            // InternalCimpl.g:666:3: ( (lv_name_0_0= ruleCIMPLSTRING ) ) otherlv_1= '\\r\\n' ( (lv_subsets_2_0= ruleSubset ) )? (otherlv_3= '\\r\\n' ( (lv_subsets_4_0= ruleSubset ) ) )* otherlv_5= '\\r\\n'
            {
            // InternalCimpl.g:666:3: ( (lv_name_0_0= ruleCIMPLSTRING ) )
            // InternalCimpl.g:667:4: (lv_name_0_0= ruleCIMPLSTRING )
            {
            // InternalCimpl.g:667:4: (lv_name_0_0= ruleCIMPLSTRING )
            // InternalCimpl.g:668:5: lv_name_0_0= ruleCIMPLSTRING
            {

            					newCompositeNode(grammarAccess.getSubsetsAccess().getNameCIMPLSTRINGParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_0_0=ruleCIMPLSTRING();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubsetsRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getSubsetsAccess().getControl000dControl000aKeyword_1());
            		
            // InternalCimpl.g:689:3: ( (lv_subsets_2_0= ruleSubset ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCimpl.g:690:4: (lv_subsets_2_0= ruleSubset )
                    {
                    // InternalCimpl.g:690:4: (lv_subsets_2_0= ruleSubset )
                    // InternalCimpl.g:691:5: lv_subsets_2_0= ruleSubset
                    {

                    					newCompositeNode(grammarAccess.getSubsetsAccess().getSubsetsSubsetParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_subsets_2_0=ruleSubset();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSubsetsRule());
                    					}
                    					add(
                    						current,
                    						"subsets",
                    						lv_subsets_2_0,
                    						"org.standardhealh.cimpl.dsl.Cimpl.Subset");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCimpl.g:708:3: (otherlv_3= '\\r\\n' ( (lv_subsets_4_0= ruleSubset ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==23) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalCimpl.g:709:4: otherlv_3= '\\r\\n' ( (lv_subsets_4_0= ruleSubset ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_20); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSubsetsAccess().getControl000dControl000aKeyword_3_0());
            	    			
            	    // InternalCimpl.g:713:4: ( (lv_subsets_4_0= ruleSubset ) )
            	    // InternalCimpl.g:714:5: (lv_subsets_4_0= ruleSubset )
            	    {
            	    // InternalCimpl.g:714:5: (lv_subsets_4_0= ruleSubset )
            	    // InternalCimpl.g:715:6: lv_subsets_4_0= ruleSubset
            	    {

            	    						newCompositeNode(grammarAccess.getSubsetsAccess().getSubsetsSubsetParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_subsets_4_0=ruleSubset();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubsetsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"subsets",
            	    							lv_subsets_4_0,
            	    							"org.standardhealh.cimpl.dsl.Cimpl.Subset");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSubsetsAccess().getControl000dControl000aKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubsets"


    // $ANTLR start "entryRuleSubset"
    // InternalCimpl.g:741:1: entryRuleSubset returns [EObject current=null] : iv_ruleSubset= ruleSubset EOF ;
    public final EObject entryRuleSubset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubset = null;


        try {
            // InternalCimpl.g:741:47: (iv_ruleSubset= ruleSubset EOF )
            // InternalCimpl.g:742:2: iv_ruleSubset= ruleSubset EOF
            {
             newCompositeNode(grammarAccess.getSubsetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubset=ruleSubset();

            state._fsp--;

             current =iv_ruleSubset; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubset"


    // $ANTLR start "ruleSubset"
    // InternalCimpl.g:748:1: ruleSubset returns [EObject current=null] : (otherlv_0= 'includes' ( (lv_cardinality_1_0= ruleCardinality ) ) ( (lv_typeName_2_0= ruleCIMPLSTRING ) ) ) ;
    public final EObject ruleSubset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_cardinality_1_0 = null;

        AntlrDatatypeRuleToken lv_typeName_2_0 = null;



        	enterRule();

        try {
            // InternalCimpl.g:754:2: ( (otherlv_0= 'includes' ( (lv_cardinality_1_0= ruleCardinality ) ) ( (lv_typeName_2_0= ruleCIMPLSTRING ) ) ) )
            // InternalCimpl.g:755:2: (otherlv_0= 'includes' ( (lv_cardinality_1_0= ruleCardinality ) ) ( (lv_typeName_2_0= ruleCIMPLSTRING ) ) )
            {
            // InternalCimpl.g:755:2: (otherlv_0= 'includes' ( (lv_cardinality_1_0= ruleCardinality ) ) ( (lv_typeName_2_0= ruleCIMPLSTRING ) ) )
            // InternalCimpl.g:756:3: otherlv_0= 'includes' ( (lv_cardinality_1_0= ruleCardinality ) ) ( (lv_typeName_2_0= ruleCIMPLSTRING ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getSubsetAccess().getIncludesKeyword_0());
            		
            // InternalCimpl.g:760:3: ( (lv_cardinality_1_0= ruleCardinality ) )
            // InternalCimpl.g:761:4: (lv_cardinality_1_0= ruleCardinality )
            {
            // InternalCimpl.g:761:4: (lv_cardinality_1_0= ruleCardinality )
            // InternalCimpl.g:762:5: lv_cardinality_1_0= ruleCardinality
            {

            					newCompositeNode(grammarAccess.getSubsetAccess().getCardinalityCardinalityParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_cardinality_1_0=ruleCardinality();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubsetRule());
            					}
            					set(
            						current,
            						"cardinality",
            						lv_cardinality_1_0,
            						"org.standardhealh.cimpl.dsl.Cimpl.Cardinality");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCimpl.g:779:3: ( (lv_typeName_2_0= ruleCIMPLSTRING ) )
            // InternalCimpl.g:780:4: (lv_typeName_2_0= ruleCIMPLSTRING )
            {
            // InternalCimpl.g:780:4: (lv_typeName_2_0= ruleCIMPLSTRING )
            // InternalCimpl.g:781:5: lv_typeName_2_0= ruleCIMPLSTRING
            {

            					newCompositeNode(grammarAccess.getSubsetAccess().getTypeNameCIMPLSTRINGParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_typeName_2_0=ruleCIMPLSTRING();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubsetRule());
            					}
            					set(
            						current,
            						"typeName",
            						lv_typeName_2_0,
            						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubset"


    // $ANTLR start "entryRuleRedefinition"
    // InternalCimpl.g:802:1: entryRuleRedefinition returns [EObject current=null] : iv_ruleRedefinition= ruleRedefinition EOF ;
    public final EObject entryRuleRedefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedefinition = null;


        try {
            // InternalCimpl.g:802:53: (iv_ruleRedefinition= ruleRedefinition EOF )
            // InternalCimpl.g:803:2: iv_ruleRedefinition= ruleRedefinition EOF
            {
             newCompositeNode(grammarAccess.getRedefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRedefinition=ruleRedefinition();

            state._fsp--;

             current =iv_ruleRedefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRedefinition"


    // $ANTLR start "ruleRedefinition"
    // InternalCimpl.g:809:1: ruleRedefinition returns [EObject current=null] : ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_name_1_0= ruleCIMPLSTRING ) ) ) ;
    public final EObject ruleRedefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_cardinality_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCimpl.g:815:2: ( ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_name_1_0= ruleCIMPLSTRING ) ) ) )
            // InternalCimpl.g:816:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_name_1_0= ruleCIMPLSTRING ) ) )
            {
            // InternalCimpl.g:816:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_name_1_0= ruleCIMPLSTRING ) ) )
            // InternalCimpl.g:817:3: ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_name_1_0= ruleCIMPLSTRING ) )
            {
            // InternalCimpl.g:817:3: ( (lv_cardinality_0_0= ruleCardinality ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCimpl.g:818:4: (lv_cardinality_0_0= ruleCardinality )
                    {
                    // InternalCimpl.g:818:4: (lv_cardinality_0_0= ruleCardinality )
                    // InternalCimpl.g:819:5: lv_cardinality_0_0= ruleCardinality
                    {

                    					newCompositeNode(grammarAccess.getRedefinitionAccess().getCardinalityCardinalityParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_cardinality_0_0=ruleCardinality();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRedefinitionRule());
                    					}
                    					set(
                    						current,
                    						"cardinality",
                    						lv_cardinality_0_0,
                    						"org.standardhealh.cimpl.dsl.Cimpl.Cardinality");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCimpl.g:836:3: ( (lv_name_1_0= ruleCIMPLSTRING ) )
            // InternalCimpl.g:837:4: (lv_name_1_0= ruleCIMPLSTRING )
            {
            // InternalCimpl.g:837:4: (lv_name_1_0= ruleCIMPLSTRING )
            // InternalCimpl.g:838:5: lv_name_1_0= ruleCIMPLSTRING
            {

            					newCompositeNode(grammarAccess.getRedefinitionAccess().getNameCIMPLSTRINGParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleCIMPLSTRING();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRedefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRedefinition"


    // $ANTLR start "entryRuleCardinality"
    // InternalCimpl.g:859:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalCimpl.g:859:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalCimpl.g:860:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalCimpl.g:866:1: ruleCardinality returns [EObject current=null] : ( ( (lv_lower_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upper_2_0= RULE_INT ) ) ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token lv_lower_0_0=null;
        Token otherlv_1=null;
        Token lv_upper_2_0=null;


        	enterRule();

        try {
            // InternalCimpl.g:872:2: ( ( ( (lv_lower_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upper_2_0= RULE_INT ) ) ) )
            // InternalCimpl.g:873:2: ( ( (lv_lower_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upper_2_0= RULE_INT ) ) )
            {
            // InternalCimpl.g:873:2: ( ( (lv_lower_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upper_2_0= RULE_INT ) ) )
            // InternalCimpl.g:874:3: ( (lv_lower_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upper_2_0= RULE_INT ) )
            {
            // InternalCimpl.g:874:3: ( (lv_lower_0_0= RULE_INT ) )
            // InternalCimpl.g:875:4: (lv_lower_0_0= RULE_INT )
            {
            // InternalCimpl.g:875:4: (lv_lower_0_0= RULE_INT )
            // InternalCimpl.g:876:5: lv_lower_0_0= RULE_INT
            {
            lv_lower_0_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_lower_0_0, grammarAccess.getCardinalityAccess().getLowerINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCardinalityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lower",
            						lv_lower_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1());
            		
            // InternalCimpl.g:896:3: ( (lv_upper_2_0= RULE_INT ) )
            // InternalCimpl.g:897:4: (lv_upper_2_0= RULE_INT )
            {
            // InternalCimpl.g:897:4: (lv_upper_2_0= RULE_INT )
            // InternalCimpl.g:898:5: lv_upper_2_0= RULE_INT
            {
            lv_upper_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_upper_2_0, grammarAccess.getCardinalityAccess().getUpperINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCardinalityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"upper",
            						lv_upper_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleElement"
    // InternalCimpl.g:918:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalCimpl.g:918:48: (iv_ruleElement= ruleElement EOF )
            // InternalCimpl.g:919:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalCimpl.g:925:1: ruleElement returns [EObject current=null] : (otherlv_0= '\\r\\nElement:' ( (lv_name_1_0= ruleCIMPLSTRING ) ) otherlv_2= '\\r\\n' (otherlv_3= 'Based on:' ( (lv_basedOn_4_0= ruleCIMPLSTRING ) ) otherlv_5= '\\r\\n' )? otherlv_6= 'Concept:' ( (lv_concept_7_0= ruleCIMPLSTRING ) ) otherlv_8= '\\r\\n' otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= '\\r\\n' otherlv_12= 'Value:' ( (lv_value_13_0= ruleCIMPLSTRING ) ) otherlv_14= '\\r\\n' ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_description_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_basedOn_4_0 = null;

        AntlrDatatypeRuleToken lv_concept_7_0 = null;

        AntlrDatatypeRuleToken lv_value_13_0 = null;



        	enterRule();

        try {
            // InternalCimpl.g:931:2: ( (otherlv_0= '\\r\\nElement:' ( (lv_name_1_0= ruleCIMPLSTRING ) ) otherlv_2= '\\r\\n' (otherlv_3= 'Based on:' ( (lv_basedOn_4_0= ruleCIMPLSTRING ) ) otherlv_5= '\\r\\n' )? otherlv_6= 'Concept:' ( (lv_concept_7_0= ruleCIMPLSTRING ) ) otherlv_8= '\\r\\n' otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= '\\r\\n' otherlv_12= 'Value:' ( (lv_value_13_0= ruleCIMPLSTRING ) ) otherlv_14= '\\r\\n' ) )
            // InternalCimpl.g:932:2: (otherlv_0= '\\r\\nElement:' ( (lv_name_1_0= ruleCIMPLSTRING ) ) otherlv_2= '\\r\\n' (otherlv_3= 'Based on:' ( (lv_basedOn_4_0= ruleCIMPLSTRING ) ) otherlv_5= '\\r\\n' )? otherlv_6= 'Concept:' ( (lv_concept_7_0= ruleCIMPLSTRING ) ) otherlv_8= '\\r\\n' otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= '\\r\\n' otherlv_12= 'Value:' ( (lv_value_13_0= ruleCIMPLSTRING ) ) otherlv_14= '\\r\\n' )
            {
            // InternalCimpl.g:932:2: (otherlv_0= '\\r\\nElement:' ( (lv_name_1_0= ruleCIMPLSTRING ) ) otherlv_2= '\\r\\n' (otherlv_3= 'Based on:' ( (lv_basedOn_4_0= ruleCIMPLSTRING ) ) otherlv_5= '\\r\\n' )? otherlv_6= 'Concept:' ( (lv_concept_7_0= ruleCIMPLSTRING ) ) otherlv_8= '\\r\\n' otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= '\\r\\n' otherlv_12= 'Value:' ( (lv_value_13_0= ruleCIMPLSTRING ) ) otherlv_14= '\\r\\n' )
            // InternalCimpl.g:933:3: otherlv_0= '\\r\\nElement:' ( (lv_name_1_0= ruleCIMPLSTRING ) ) otherlv_2= '\\r\\n' (otherlv_3= 'Based on:' ( (lv_basedOn_4_0= ruleCIMPLSTRING ) ) otherlv_5= '\\r\\n' )? otherlv_6= 'Concept:' ( (lv_concept_7_0= ruleCIMPLSTRING ) ) otherlv_8= '\\r\\n' otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= '\\r\\n' otherlv_12= 'Value:' ( (lv_value_13_0= ruleCIMPLSTRING ) ) otherlv_14= '\\r\\n'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getElementAccess().getElementKeyword_0());
            		
            // InternalCimpl.g:937:3: ( (lv_name_1_0= ruleCIMPLSTRING ) )
            // InternalCimpl.g:938:4: (lv_name_1_0= ruleCIMPLSTRING )
            {
            // InternalCimpl.g:938:4: (lv_name_1_0= ruleCIMPLSTRING )
            // InternalCimpl.g:939:5: lv_name_1_0= ruleCIMPLSTRING
            {

            					newCompositeNode(grammarAccess.getElementAccess().getNameCIMPLSTRINGParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleCIMPLSTRING();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getElementAccess().getControl000dControl000aKeyword_2());
            		
            // InternalCimpl.g:960:3: (otherlv_3= 'Based on:' ( (lv_basedOn_4_0= ruleCIMPLSTRING ) ) otherlv_5= '\\r\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCimpl.g:961:4: otherlv_3= 'Based on:' ( (lv_basedOn_4_0= ruleCIMPLSTRING ) ) otherlv_5= '\\r\\n'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getElementAccess().getBasedOnKeyword_3_0());
                    			
                    // InternalCimpl.g:965:4: ( (lv_basedOn_4_0= ruleCIMPLSTRING ) )
                    // InternalCimpl.g:966:5: (lv_basedOn_4_0= ruleCIMPLSTRING )
                    {
                    // InternalCimpl.g:966:5: (lv_basedOn_4_0= ruleCIMPLSTRING )
                    // InternalCimpl.g:967:6: lv_basedOn_4_0= ruleCIMPLSTRING
                    {

                    						newCompositeNode(grammarAccess.getElementAccess().getBasedOnCIMPLSTRINGParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_basedOn_4_0=ruleCIMPLSTRING();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementRule());
                    						}
                    						set(
                    							current,
                    							"basedOn",
                    							lv_basedOn_4_0,
                    							"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getElementAccess().getControl000dControl000aKeyword_3_2());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getElementAccess().getConceptKeyword_4());
            		
            // InternalCimpl.g:993:3: ( (lv_concept_7_0= ruleCIMPLSTRING ) )
            // InternalCimpl.g:994:4: (lv_concept_7_0= ruleCIMPLSTRING )
            {
            // InternalCimpl.g:994:4: (lv_concept_7_0= ruleCIMPLSTRING )
            // InternalCimpl.g:995:5: lv_concept_7_0= ruleCIMPLSTRING
            {

            					newCompositeNode(grammarAccess.getElementAccess().getConceptCIMPLSTRINGParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_concept_7_0=ruleCIMPLSTRING();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementRule());
            					}
            					set(
            						current,
            						"concept",
            						lv_concept_7_0,
            						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getElementAccess().getControl000dControl000aKeyword_6());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getElementAccess().getDescriptionKeyword_7());
            		
            // InternalCimpl.g:1020:3: ( (lv_description_10_0= RULE_STRING ) )
            // InternalCimpl.g:1021:4: (lv_description_10_0= RULE_STRING )
            {
            // InternalCimpl.g:1021:4: (lv_description_10_0= RULE_STRING )
            // InternalCimpl.g:1022:5: lv_description_10_0= RULE_STRING
            {
            lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_description_10_0, grammarAccess.getElementAccess().getDescriptionSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_23); 

            			newLeafNode(otherlv_11, grammarAccess.getElementAccess().getControl000dControl000aKeyword_9());
            		
            otherlv_12=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_12, grammarAccess.getElementAccess().getValueKeyword_10());
            		
            // InternalCimpl.g:1046:3: ( (lv_value_13_0= ruleCIMPLSTRING ) )
            // InternalCimpl.g:1047:4: (lv_value_13_0= ruleCIMPLSTRING )
            {
            // InternalCimpl.g:1047:4: (lv_value_13_0= ruleCIMPLSTRING )
            // InternalCimpl.g:1048:5: lv_value_13_0= ruleCIMPLSTRING
            {

            					newCompositeNode(grammarAccess.getElementAccess().getValueCIMPLSTRINGParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_11);
            lv_value_13_0=ruleCIMPLSTRING();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_13_0,
            						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getElementAccess().getControl000dControl000aKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleCodeableConcept"
    // InternalCimpl.g:1073:1: entryRuleCodeableConcept returns [EObject current=null] : iv_ruleCodeableConcept= ruleCodeableConcept EOF ;
    public final EObject entryRuleCodeableConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeableConcept = null;


        try {
            // InternalCimpl.g:1073:56: (iv_ruleCodeableConcept= ruleCodeableConcept EOF )
            // InternalCimpl.g:1074:2: iv_ruleCodeableConcept= ruleCodeableConcept EOF
            {
             newCompositeNode(grammarAccess.getCodeableConceptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodeableConcept=ruleCodeableConcept();

            state._fsp--;

             current =iv_ruleCodeableConcept; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCodeableConcept"


    // $ANTLR start "ruleCodeableConcept"
    // InternalCimpl.g:1080:1: ruleCodeableConcept returns [EObject current=null] : (otherlv_0= 'CodeableConcept from' ( (lv_valueSetURL_1_0= ruleCIMPLSTRING ) ) ) ;
    public final EObject ruleCodeableConcept() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_valueSetURL_1_0 = null;



        	enterRule();

        try {
            // InternalCimpl.g:1086:2: ( (otherlv_0= 'CodeableConcept from' ( (lv_valueSetURL_1_0= ruleCIMPLSTRING ) ) ) )
            // InternalCimpl.g:1087:2: (otherlv_0= 'CodeableConcept from' ( (lv_valueSetURL_1_0= ruleCIMPLSTRING ) ) )
            {
            // InternalCimpl.g:1087:2: (otherlv_0= 'CodeableConcept from' ( (lv_valueSetURL_1_0= ruleCIMPLSTRING ) ) )
            // InternalCimpl.g:1088:3: otherlv_0= 'CodeableConcept from' ( (lv_valueSetURL_1_0= ruleCIMPLSTRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCodeableConceptAccess().getCodeableConceptFromKeyword_0());
            		
            // InternalCimpl.g:1092:3: ( (lv_valueSetURL_1_0= ruleCIMPLSTRING ) )
            // InternalCimpl.g:1093:4: (lv_valueSetURL_1_0= ruleCIMPLSTRING )
            {
            // InternalCimpl.g:1093:4: (lv_valueSetURL_1_0= ruleCIMPLSTRING )
            // InternalCimpl.g:1094:5: lv_valueSetURL_1_0= ruleCIMPLSTRING
            {

            					newCompositeNode(grammarAccess.getCodeableConceptAccess().getValueSetURLCIMPLSTRINGParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_valueSetURL_1_0=ruleCIMPLSTRING();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCodeableConceptRule());
            					}
            					set(
            						current,
            						"valueSetURL",
            						lv_valueSetURL_1_0,
            						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCodeableConcept"


    // $ANTLR start "entryRuleQuantity"
    // InternalCimpl.g:1115:1: entryRuleQuantity returns [EObject current=null] : iv_ruleQuantity= ruleQuantity EOF ;
    public final EObject entryRuleQuantity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantity = null;


        try {
            // InternalCimpl.g:1115:49: (iv_ruleQuantity= ruleQuantity EOF )
            // InternalCimpl.g:1116:2: iv_ruleQuantity= ruleQuantity EOF
            {
             newCompositeNode(grammarAccess.getQuantityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuantity=ruleQuantity();

            state._fsp--;

             current =iv_ruleQuantity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuantity"


    // $ANTLR start "ruleQuantity"
    // InternalCimpl.g:1122:1: ruleQuantity returns [EObject current=null] : (otherlv_0= 'Quantity with units' ( (lv_units_1_0= ruleCIMPLSTRING ) ) ) ;
    public final EObject ruleQuantity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_units_1_0 = null;



        	enterRule();

        try {
            // InternalCimpl.g:1128:2: ( (otherlv_0= 'Quantity with units' ( (lv_units_1_0= ruleCIMPLSTRING ) ) ) )
            // InternalCimpl.g:1129:2: (otherlv_0= 'Quantity with units' ( (lv_units_1_0= ruleCIMPLSTRING ) ) )
            {
            // InternalCimpl.g:1129:2: (otherlv_0= 'Quantity with units' ( (lv_units_1_0= ruleCIMPLSTRING ) ) )
            // InternalCimpl.g:1130:3: otherlv_0= 'Quantity with units' ( (lv_units_1_0= ruleCIMPLSTRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getQuantityAccess().getQuantityWithUnitsKeyword_0());
            		
            // InternalCimpl.g:1134:3: ( (lv_units_1_0= ruleCIMPLSTRING ) )
            // InternalCimpl.g:1135:4: (lv_units_1_0= ruleCIMPLSTRING )
            {
            // InternalCimpl.g:1135:4: (lv_units_1_0= ruleCIMPLSTRING )
            // InternalCimpl.g:1136:5: lv_units_1_0= ruleCIMPLSTRING
            {

            					newCompositeNode(grammarAccess.getQuantityAccess().getUnitsCIMPLSTRINGParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_units_1_0=ruleCIMPLSTRING();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuantityRule());
            					}
            					set(
            						current,
            						"units",
            						lv_units_1_0,
            						"org.standardhealh.cimpl.dsl.Cimpl.CIMPLSTRING");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuantity"


    // $ANTLR start "entryRuleCIMPLSTRING"
    // InternalCimpl.g:1157:1: entryRuleCIMPLSTRING returns [String current=null] : iv_ruleCIMPLSTRING= ruleCIMPLSTRING EOF ;
    public final String entryRuleCIMPLSTRING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCIMPLSTRING = null;


        try {
            // InternalCimpl.g:1157:51: (iv_ruleCIMPLSTRING= ruleCIMPLSTRING EOF )
            // InternalCimpl.g:1158:2: iv_ruleCIMPLSTRING= ruleCIMPLSTRING EOF
            {
             newCompositeNode(grammarAccess.getCIMPLSTRINGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCIMPLSTRING=ruleCIMPLSTRING();

            state._fsp--;

             current =iv_ruleCIMPLSTRING.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCIMPLSTRING"


    // $ANTLR start "ruleCIMPLSTRING"
    // InternalCimpl.g:1164:1: ruleCIMPLSTRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ' ' | kw= '/' | kw= ';' | kw= ',' | kw= '!' | kw= '\\u00A7' | kw= '%' | kw= '&' | kw= '(' | kw= ')' | kw= '?' | kw= '*' | kw= '+' | kw= '.' | kw= '-' | kw= '|' | kw= '[' | kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleCIMPLSTRING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalCimpl.g:1170:2: ( (kw= ' ' | kw= '/' | kw= ';' | kw= ',' | kw= '!' | kw= '\\u00A7' | kw= '%' | kw= '&' | kw= '(' | kw= ')' | kw= '?' | kw= '*' | kw= '+' | kw= '.' | kw= '-' | kw= '|' | kw= '[' | kw= ']' ) )
            // InternalCimpl.g:1171:2: (kw= ' ' | kw= '/' | kw= ';' | kw= ',' | kw= '!' | kw= '\\u00A7' | kw= '%' | kw= '&' | kw= '(' | kw= ')' | kw= '?' | kw= '*' | kw= '+' | kw= '.' | kw= '-' | kw= '|' | kw= '[' | kw= ']' )
            {
            // InternalCimpl.g:1171:2: (kw= ' ' | kw= '/' | kw= ';' | kw= ',' | kw= '!' | kw= '\\u00A7' | kw= '%' | kw= '&' | kw= '(' | kw= ')' | kw= '?' | kw= '*' | kw= '+' | kw= '.' | kw= '-' | kw= '|' | kw= '[' | kw= ']' )
            int alt14=18;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt14=1;
                }
                break;
            case 30:
                {
                alt14=2;
                }
                break;
            case 31:
                {
                alt14=3;
                }
                break;
            case 18:
                {
                alt14=4;
                }
                break;
            case 32:
                {
                alt14=5;
                }
                break;
            case 33:
                {
                alt14=6;
                }
                break;
            case 34:
                {
                alt14=7;
                }
                break;
            case 35:
                {
                alt14=8;
                }
                break;
            case 36:
                {
                alt14=9;
                }
                break;
            case 37:
                {
                alt14=10;
                }
                break;
            case 38:
                {
                alt14=11;
                }
                break;
            case 39:
                {
                alt14=12;
                }
                break;
            case 40:
                {
                alt14=13;
                }
                break;
            case 41:
                {
                alt14=14;
                }
                break;
            case 42:
                {
                alt14=15;
                }
                break;
            case 43:
                {
                alt14=16;
                }
                break;
            case 44:
                {
                alt14=17;
                }
                break;
            case 45:
                {
                alt14=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalCimpl.g:1172:3: kw= ' '
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getSpaceKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCimpl.g:1178:3: kw= '/'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getSolidusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalCimpl.g:1184:3: kw= ';'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getSemicolonKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalCimpl.g:1190:3: kw= ','
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getCommaKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalCimpl.g:1196:3: kw= '!'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getExclamationMarkKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalCimpl.g:1202:3: kw= '\\u00A7'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getSectionSignKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalCimpl.g:1208:3: kw= '%'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getPercentSignKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalCimpl.g:1214:3: kw= '&'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getAmpersandKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalCimpl.g:1220:3: kw= '('
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getLeftParenthesisKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalCimpl.g:1226:3: kw= ')'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getRightParenthesisKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalCimpl.g:1232:3: kw= '?'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getQuestionMarkKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalCimpl.g:1238:3: kw= '*'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getAsteriskKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalCimpl.g:1244:3: kw= '+'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getPlusSignKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalCimpl.g:1250:3: kw= '.'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getFullStopKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalCimpl.g:1256:3: kw= '-'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getHyphenMinusKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalCimpl.g:1262:3: kw= '|'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getVerticalLineKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalCimpl.g:1268:3: kw= '['
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getLeftSquareBracketKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalCimpl.g:1274:3: kw= ']'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getCIMPLSTRINGAccess().getRightSquareBracketKeyword_17());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCIMPLSTRING"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\27\uffff";
    static final String dfa_2s = "\1\uffff\1\25\24\uffff\1\2";
    static final String dfa_3s = "\1\17\1\5\1\uffff\22\17\1\uffff\1\5";
    static final String dfa_4s = "\1\17\1\55\1\uffff\22\17\1\uffff\1\55";
    static final String dfa_5s = "\2\uffff\1\1\22\uffff\1\2\1\uffff";
    static final String dfa_6s = "\27\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2\14\uffff\1\6\1\uffff\1\25\4\uffff\1\25\3\uffff\1\3\1\4\1\5\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24",
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
            "\1\2\11\uffff\1\25\2\uffff\1\2\1\uffff\1\2\2\uffff\1\25\1\uffff\1\2\3\uffff\21\2"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 598:4: (otherlv_14= '\\r\\n' ( (lv_redefinitions_15_0= ruleRedefinition ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000021A0002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002180002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002100002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00003FFFE0040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00003FFFE0048020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00003FFFE0040020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00003FFFE0040002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});

}