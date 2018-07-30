package gov.us.fhim.xtext.cimi.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import gov.us.fhim.xtext.cimi.services.CIMIDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCIMIDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_MYSTRING", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'archetype'", "'('", "'adl_version='", "';'", "'rm_release='", "'generated'", "')\\r'", "'\\r'", "'language\\r'", "'description\\r'", "'definition\\r'", "'terminology\\r'", "'original_author'", "'='", "'<'", "'>'", "'details'", "'\"['", "']\"'", "'language'", "'<['", "']>'", "'use'", "'copyright'", "'other_details'", "'[\"lifecycle_state\"]'", "'[\"custodian_namespace\"]'", "'[\"custodian_organization\"]'", "'[\"license\"]'", "'[\"ip_acknowledgement_loinc\"]'", "'[\"ip_acknowledgement_snomed\"]'", "'[\"date\"]'", "'[\"organization\"]'", "'[\"name\"]'", "'[\"email\"]'", "'original_language'", "'['", "']'", "'matches'", "'{\\r'", "'}\\r'", "'term_definitions'", "'term_bindings'", "'text'", "'description'"
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

        public InternalCIMIDSLParser(TokenStream input, CIMIDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ArchetypeModel";
       	}

       	@Override
       	protected CIMIDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleArchetypeModel"
    // InternalCIMIDSL.g:64:1: entryRuleArchetypeModel returns [EObject current=null] : iv_ruleArchetypeModel= ruleArchetypeModel EOF ;
    public final EObject entryRuleArchetypeModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchetypeModel = null;


        try {
            // InternalCIMIDSL.g:64:55: (iv_ruleArchetypeModel= ruleArchetypeModel EOF )
            // InternalCIMIDSL.g:65:2: iv_ruleArchetypeModel= ruleArchetypeModel EOF
            {
             newCompositeNode(grammarAccess.getArchetypeModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArchetypeModel=ruleArchetypeModel();

            state._fsp--;

             current =iv_ruleArchetypeModel; 
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
    // $ANTLR end "entryRuleArchetypeModel"


    // $ANTLR start "ruleArchetypeModel"
    // InternalCIMIDSL.g:71:1: ruleArchetypeModel returns [EObject current=null] : ( (lv_elements_0_0= ruleArchetype ) )* ;
    public final EObject ruleArchetypeModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalCIMIDSL.g:77:2: ( ( (lv_elements_0_0= ruleArchetype ) )* )
            // InternalCIMIDSL.g:78:2: ( (lv_elements_0_0= ruleArchetype ) )*
            {
            // InternalCIMIDSL.g:78:2: ( (lv_elements_0_0= ruleArchetype ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCIMIDSL.g:79:3: (lv_elements_0_0= ruleArchetype )
            	    {
            	    // InternalCIMIDSL.g:79:3: (lv_elements_0_0= ruleArchetype )
            	    // InternalCIMIDSL.g:80:4: lv_elements_0_0= ruleArchetype
            	    {

            	    				newCompositeNode(grammarAccess.getArchetypeModelAccess().getElementsArchetypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleArchetype();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getArchetypeModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"gov.us.fhim.xtext.cimi.CIMIDSL.Archetype");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleArchetypeModel"


    // $ANTLR start "entryRuleArchetype"
    // InternalCIMIDSL.g:100:1: entryRuleArchetype returns [EObject current=null] : iv_ruleArchetype= ruleArchetype EOF ;
    public final EObject entryRuleArchetype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchetype = null;


        try {
            // InternalCIMIDSL.g:100:50: (iv_ruleArchetype= ruleArchetype EOF )
            // InternalCIMIDSL.g:101:2: iv_ruleArchetype= ruleArchetype EOF
            {
             newCompositeNode(grammarAccess.getArchetypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArchetype=ruleArchetype();

            state._fsp--;

             current =iv_ruleArchetype; 
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
    // $ANTLR end "entryRuleArchetype"


    // $ANTLR start "ruleArchetype"
    // InternalCIMIDSL.g:107:1: ruleArchetype returns [EObject current=null] : (otherlv_0= 'archetype' otherlv_1= '(' otherlv_2= 'adl_version=' ( (lv_adl_version_3_0= RULE_MYSTRING ) ) otherlv_4= ';' otherlv_5= 'rm_release=' ( (lv_rm_release_6_0= RULE_MYSTRING ) ) otherlv_7= ';' otherlv_8= 'generated' otherlv_9= ')\\r' ( (lv_name_10_0= RULE_MYSTRING ) ) otherlv_11= '\\r' otherlv_12= '\\r' otherlv_13= 'language\\r' ( (lv_language_14_0= ruleLanguge ) ) otherlv_15= '\\r' otherlv_16= '\\r' otherlv_17= 'description\\r' ( (lv_description_18_0= ruleDescription ) ) otherlv_19= '\\r' otherlv_20= '\\r' otherlv_21= 'definition\\r' ( (lv_definition_22_0= ruleMatches ) ) otherlv_23= '\\r' otherlv_24= '\\r' otherlv_25= 'terminology\\r' ( (lv_terminology_26_0= ruleTerminology ) ) otherlv_27= '\\r' otherlv_28= '\\r' ) ;
    public final EObject ruleArchetype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_adl_version_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_rm_release_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        EObject lv_language_14_0 = null;

        EObject lv_description_18_0 = null;

        EObject lv_definition_22_0 = null;

        EObject lv_terminology_26_0 = null;



        	enterRule();

        try {
            // InternalCIMIDSL.g:113:2: ( (otherlv_0= 'archetype' otherlv_1= '(' otherlv_2= 'adl_version=' ( (lv_adl_version_3_0= RULE_MYSTRING ) ) otherlv_4= ';' otherlv_5= 'rm_release=' ( (lv_rm_release_6_0= RULE_MYSTRING ) ) otherlv_7= ';' otherlv_8= 'generated' otherlv_9= ')\\r' ( (lv_name_10_0= RULE_MYSTRING ) ) otherlv_11= '\\r' otherlv_12= '\\r' otherlv_13= 'language\\r' ( (lv_language_14_0= ruleLanguge ) ) otherlv_15= '\\r' otherlv_16= '\\r' otherlv_17= 'description\\r' ( (lv_description_18_0= ruleDescription ) ) otherlv_19= '\\r' otherlv_20= '\\r' otherlv_21= 'definition\\r' ( (lv_definition_22_0= ruleMatches ) ) otherlv_23= '\\r' otherlv_24= '\\r' otherlv_25= 'terminology\\r' ( (lv_terminology_26_0= ruleTerminology ) ) otherlv_27= '\\r' otherlv_28= '\\r' ) )
            // InternalCIMIDSL.g:114:2: (otherlv_0= 'archetype' otherlv_1= '(' otherlv_2= 'adl_version=' ( (lv_adl_version_3_0= RULE_MYSTRING ) ) otherlv_4= ';' otherlv_5= 'rm_release=' ( (lv_rm_release_6_0= RULE_MYSTRING ) ) otherlv_7= ';' otherlv_8= 'generated' otherlv_9= ')\\r' ( (lv_name_10_0= RULE_MYSTRING ) ) otherlv_11= '\\r' otherlv_12= '\\r' otherlv_13= 'language\\r' ( (lv_language_14_0= ruleLanguge ) ) otherlv_15= '\\r' otherlv_16= '\\r' otherlv_17= 'description\\r' ( (lv_description_18_0= ruleDescription ) ) otherlv_19= '\\r' otherlv_20= '\\r' otherlv_21= 'definition\\r' ( (lv_definition_22_0= ruleMatches ) ) otherlv_23= '\\r' otherlv_24= '\\r' otherlv_25= 'terminology\\r' ( (lv_terminology_26_0= ruleTerminology ) ) otherlv_27= '\\r' otherlv_28= '\\r' )
            {
            // InternalCIMIDSL.g:114:2: (otherlv_0= 'archetype' otherlv_1= '(' otherlv_2= 'adl_version=' ( (lv_adl_version_3_0= RULE_MYSTRING ) ) otherlv_4= ';' otherlv_5= 'rm_release=' ( (lv_rm_release_6_0= RULE_MYSTRING ) ) otherlv_7= ';' otherlv_8= 'generated' otherlv_9= ')\\r' ( (lv_name_10_0= RULE_MYSTRING ) ) otherlv_11= '\\r' otherlv_12= '\\r' otherlv_13= 'language\\r' ( (lv_language_14_0= ruleLanguge ) ) otherlv_15= '\\r' otherlv_16= '\\r' otherlv_17= 'description\\r' ( (lv_description_18_0= ruleDescription ) ) otherlv_19= '\\r' otherlv_20= '\\r' otherlv_21= 'definition\\r' ( (lv_definition_22_0= ruleMatches ) ) otherlv_23= '\\r' otherlv_24= '\\r' otherlv_25= 'terminology\\r' ( (lv_terminology_26_0= ruleTerminology ) ) otherlv_27= '\\r' otherlv_28= '\\r' )
            // InternalCIMIDSL.g:115:3: otherlv_0= 'archetype' otherlv_1= '(' otherlv_2= 'adl_version=' ( (lv_adl_version_3_0= RULE_MYSTRING ) ) otherlv_4= ';' otherlv_5= 'rm_release=' ( (lv_rm_release_6_0= RULE_MYSTRING ) ) otherlv_7= ';' otherlv_8= 'generated' otherlv_9= ')\\r' ( (lv_name_10_0= RULE_MYSTRING ) ) otherlv_11= '\\r' otherlv_12= '\\r' otherlv_13= 'language\\r' ( (lv_language_14_0= ruleLanguge ) ) otherlv_15= '\\r' otherlv_16= '\\r' otherlv_17= 'description\\r' ( (lv_description_18_0= ruleDescription ) ) otherlv_19= '\\r' otherlv_20= '\\r' otherlv_21= 'definition\\r' ( (lv_definition_22_0= ruleMatches ) ) otherlv_23= '\\r' otherlv_24= '\\r' otherlv_25= 'terminology\\r' ( (lv_terminology_26_0= ruleTerminology ) ) otherlv_27= '\\r' otherlv_28= '\\r'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getArchetypeAccess().getArchetypeKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getArchetypeAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getArchetypeAccess().getAdl_versionKeyword_2());
            		
            // InternalCIMIDSL.g:127:3: ( (lv_adl_version_3_0= RULE_MYSTRING ) )
            // InternalCIMIDSL.g:128:4: (lv_adl_version_3_0= RULE_MYSTRING )
            {
            // InternalCIMIDSL.g:128:4: (lv_adl_version_3_0= RULE_MYSTRING )
            // InternalCIMIDSL.g:129:5: lv_adl_version_3_0= RULE_MYSTRING
            {
            lv_adl_version_3_0=(Token)match(input,RULE_MYSTRING,FOLLOW_7); 

            					newLeafNode(lv_adl_version_3_0, grammarAccess.getArchetypeAccess().getAdl_versionMYSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArchetypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"adl_version",
            						lv_adl_version_3_0,
            						"gov.us.fhim.xtext.cimi.CIMIDSL.MYSTRING");
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getArchetypeAccess().getSemicolonKeyword_4());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getArchetypeAccess().getRm_releaseKeyword_5());
            		
            // InternalCIMIDSL.g:153:3: ( (lv_rm_release_6_0= RULE_MYSTRING ) )
            // InternalCIMIDSL.g:154:4: (lv_rm_release_6_0= RULE_MYSTRING )
            {
            // InternalCIMIDSL.g:154:4: (lv_rm_release_6_0= RULE_MYSTRING )
            // InternalCIMIDSL.g:155:5: lv_rm_release_6_0= RULE_MYSTRING
            {
            lv_rm_release_6_0=(Token)match(input,RULE_MYSTRING,FOLLOW_7); 

            					newLeafNode(lv_rm_release_6_0, grammarAccess.getArchetypeAccess().getRm_releaseMYSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArchetypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rm_release",
            						lv_rm_release_6_0,
            						"gov.us.fhim.xtext.cimi.CIMIDSL.MYSTRING");
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getArchetypeAccess().getSemicolonKeyword_7());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getArchetypeAccess().getGeneratedKeyword_8());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getArchetypeAccess().getRightParenthesisControl000dKeyword_9());
            		
            // InternalCIMIDSL.g:183:3: ( (lv_name_10_0= RULE_MYSTRING ) )
            // InternalCIMIDSL.g:184:4: (lv_name_10_0= RULE_MYSTRING )
            {
            // InternalCIMIDSL.g:184:4: (lv_name_10_0= RULE_MYSTRING )
            // InternalCIMIDSL.g:185:5: lv_name_10_0= RULE_MYSTRING
            {
            lv_name_10_0=(Token)match(input,RULE_MYSTRING,FOLLOW_11); 

            					newLeafNode(lv_name_10_0, grammarAccess.getArchetypeAccess().getNameMYSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArchetypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_10_0,
            						"gov.us.fhim.xtext.cimi.CIMIDSL.MYSTRING");
            				

            }


            }

            otherlv_11=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getArchetypeAccess().getControl000dKeyword_11());
            		
            otherlv_12=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_12, grammarAccess.getArchetypeAccess().getControl000dKeyword_12());
            		
            otherlv_13=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_13, grammarAccess.getArchetypeAccess().getLanguageKeyword_13());
            		
            // InternalCIMIDSL.g:213:3: ( (lv_language_14_0= ruleLanguge ) )
            // InternalCIMIDSL.g:214:4: (lv_language_14_0= ruleLanguge )
            {
            // InternalCIMIDSL.g:214:4: (lv_language_14_0= ruleLanguge )
            // InternalCIMIDSL.g:215:5: lv_language_14_0= ruleLanguge
            {

            					newCompositeNode(grammarAccess.getArchetypeAccess().getLanguageLangugeParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_11);
            lv_language_14_0=ruleLanguge();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArchetypeRule());
            					}
            					set(
            						current,
            						"language",
            						lv_language_14_0,
            						"gov.us.fhim.xtext.cimi.CIMIDSL.Languge");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getArchetypeAccess().getControl000dKeyword_15());
            		
            otherlv_16=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_16, grammarAccess.getArchetypeAccess().getControl000dKeyword_16());
            		
            otherlv_17=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_17, grammarAccess.getArchetypeAccess().getDescriptionKeyword_17());
            		
            // InternalCIMIDSL.g:244:3: ( (lv_description_18_0= ruleDescription ) )
            // InternalCIMIDSL.g:245:4: (lv_description_18_0= ruleDescription )
            {
            // InternalCIMIDSL.g:245:4: (lv_description_18_0= ruleDescription )
            // InternalCIMIDSL.g:246:5: lv_description_18_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getArchetypeAccess().getDescriptionDescriptionParserRuleCall_18_0());
            				
            pushFollow(FOLLOW_11);
            lv_description_18_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArchetypeRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_18_0,
            						"gov.us.fhim.xtext.cimi.CIMIDSL.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_19, grammarAccess.getArchetypeAccess().getControl000dKeyword_19());
            		
            otherlv_20=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_20, grammarAccess.getArchetypeAccess().getControl000dKeyword_20());
            		
            otherlv_21=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_21, grammarAccess.getArchetypeAccess().getDefinitionKeyword_21());
            		
            // InternalCIMIDSL.g:275:3: ( (lv_definition_22_0= ruleMatches ) )
            // InternalCIMIDSL.g:276:4: (lv_definition_22_0= ruleMatches )
            {
            // InternalCIMIDSL.g:276:4: (lv_definition_22_0= ruleMatches )
            // InternalCIMIDSL.g:277:5: lv_definition_22_0= ruleMatches
            {

            					newCompositeNode(grammarAccess.getArchetypeAccess().getDefinitionMatchesParserRuleCall_22_0());
            				
            pushFollow(FOLLOW_11);
            lv_definition_22_0=ruleMatches();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArchetypeRule());
            					}
            					set(
            						current,
            						"definition",
            						lv_definition_22_0,
            						"gov.us.fhim.xtext.cimi.CIMIDSL.Matches");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_23=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_23, grammarAccess.getArchetypeAccess().getControl000dKeyword_23());
            		
            otherlv_24=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_24, grammarAccess.getArchetypeAccess().getControl000dKeyword_24());
            		
            otherlv_25=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_25, grammarAccess.getArchetypeAccess().getTerminologyKeyword_25());
            		
            // InternalCIMIDSL.g:306:3: ( (lv_terminology_26_0= ruleTerminology ) )
            // InternalCIMIDSL.g:307:4: (lv_terminology_26_0= ruleTerminology )
            {
            // InternalCIMIDSL.g:307:4: (lv_terminology_26_0= ruleTerminology )
            // InternalCIMIDSL.g:308:5: lv_terminology_26_0= ruleTerminology
            {

            					newCompositeNode(grammarAccess.getArchetypeAccess().getTerminologyTerminologyParserRuleCall_26_0());
            				
            pushFollow(FOLLOW_11);
            lv_terminology_26_0=ruleTerminology();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArchetypeRule());
            					}
            					set(
            						current,
            						"terminology",
            						lv_terminology_26_0,
            						"gov.us.fhim.xtext.cimi.CIMIDSL.Terminology");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_27=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_27, grammarAccess.getArchetypeAccess().getControl000dKeyword_27());
            		
            otherlv_28=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getArchetypeAccess().getControl000dKeyword_28());
            		

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
    // $ANTLR end "ruleArchetype"


    // $ANTLR start "entryRuleDescription"
    // InternalCIMIDSL.g:337:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalCIMIDSL.g:337:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalCIMIDSL.g:338:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalCIMIDSL.g:344:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'original_author' otherlv_1= '=' otherlv_2= '<' otherlv_3= '\\r' ( (lv_originalAuthor_4_0= ruleOriginalAuthor ) ) otherlv_5= '>' otherlv_6= '\\r' otherlv_7= 'details' otherlv_8= '=' otherlv_9= '<' otherlv_10= '\\r' ( (lv_details_11_0= ruleDetails ) ) otherlv_12= '>' otherlv_13= '\\r' ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_originalAuthor_4_0 = null;

        EObject lv_details_11_0 = null;



        	enterRule();

        try {
            // InternalCIMIDSL.g:350:2: ( (otherlv_0= 'original_author' otherlv_1= '=' otherlv_2= '<' otherlv_3= '\\r' ( (lv_originalAuthor_4_0= ruleOriginalAuthor ) ) otherlv_5= '>' otherlv_6= '\\r' otherlv_7= 'details' otherlv_8= '=' otherlv_9= '<' otherlv_10= '\\r' ( (lv_details_11_0= ruleDetails ) ) otherlv_12= '>' otherlv_13= '\\r' ) )
            // InternalCIMIDSL.g:351:2: (otherlv_0= 'original_author' otherlv_1= '=' otherlv_2= '<' otherlv_3= '\\r' ( (lv_originalAuthor_4_0= ruleOriginalAuthor ) ) otherlv_5= '>' otherlv_6= '\\r' otherlv_7= 'details' otherlv_8= '=' otherlv_9= '<' otherlv_10= '\\r' ( (lv_details_11_0= ruleDetails ) ) otherlv_12= '>' otherlv_13= '\\r' )
            {
            // InternalCIMIDSL.g:351:2: (otherlv_0= 'original_author' otherlv_1= '=' otherlv_2= '<' otherlv_3= '\\r' ( (lv_originalAuthor_4_0= ruleOriginalAuthor ) ) otherlv_5= '>' otherlv_6= '\\r' otherlv_7= 'details' otherlv_8= '=' otherlv_9= '<' otherlv_10= '\\r' ( (lv_details_11_0= ruleDetails ) ) otherlv_12= '>' otherlv_13= '\\r' )
            // InternalCIMIDSL.g:352:3: otherlv_0= 'original_author' otherlv_1= '=' otherlv_2= '<' otherlv_3= '\\r' ( (lv_originalAuthor_4_0= ruleOriginalAuthor ) ) otherlv_5= '>' otherlv_6= '\\r' otherlv_7= 'details' otherlv_8= '=' otherlv_9= '<' otherlv_10= '\\r' ( (lv_details_11_0= ruleDetails ) ) otherlv_12= '>' otherlv_13= '\\r'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getOriginal_authorKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getDescriptionAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getDescriptionAccess().getLessThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getDescriptionAccess().getControl000dKeyword_3());
            		
            // InternalCIMIDSL.g:368:3: ( (lv_originalAuthor_4_0= ruleOriginalAuthor ) )
            // InternalCIMIDSL.g:369:4: (lv_originalAuthor_4_0= ruleOriginalAuthor )
            {
            // InternalCIMIDSL.g:369:4: (lv_originalAuthor_4_0= ruleOriginalAuthor )
            // InternalCIMIDSL.g:370:5: lv_originalAuthor_4_0= ruleOriginalAuthor
            {

            					newCompositeNode(grammarAccess.getDescriptionAccess().getOriginalAuthorOriginalAuthorParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_originalAuthor_4_0=ruleOriginalAuthor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDescriptionRule());
            					}
            					set(
            						current,
            						"originalAuthor",
            						lv_originalAuthor_4_0,
            						"gov.us.fhim.xtext.cimi.CIMIDSL.OriginalAuthor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getDescriptionAccess().getGreaterThanSignKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getDescriptionAccess().getControl000dKeyword_6());
            		
            otherlv_7=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getDescriptionAccess().getDetailsKeyword_7());
            		
            otherlv_8=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getDescriptionAccess().getEqualsSignKeyword_8());
            		
            otherlv_9=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getDescriptionAccess().getLessThanSignKeyword_9());
            		
            otherlv_10=(Token)match(input,19,FOLLOW_24); 

            			newLeafNode(otherlv_10, grammarAccess.getDescriptionAccess().getControl000dKeyword_10());
            		
            // InternalCIMIDSL.g:411:3: ( (lv_details_11_0= ruleDetails ) )
            // InternalCIMIDSL.g:412:4: (lv_details_11_0= ruleDetails )
            {
            // InternalCIMIDSL.g:412:4: (lv_details_11_0= ruleDetails )
            // InternalCIMIDSL.g:413:5: lv_details_11_0= ruleDetails
            {

            					newCompositeNode(grammarAccess.getDescriptionAccess().getDetailsDetailsParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_22);
            lv_details_11_0=ruleDetails();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDescriptionRule());
            					}
            					set(
            						current,
            						"details",
            						lv_details_11_0,
            						"gov.us.fhim.xtext.cimi.CIMIDSL.Details");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_12, grammarAccess.getDescriptionAccess().getGreaterThanSignKeyword_12());
            		
            otherlv_13=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getDescriptionAccess().getControl000dKeyword_13());
            		

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


    // $ANTLR start "entryRuleDetails"
    // InternalCIMIDSL.g:442:1: entryRuleDetails returns [EObject current=null] : iv_ruleDetails= ruleDetails EOF ;
    public final EObject entryRuleDetails() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDetails = null;


        try {
            // InternalCIMIDSL.g:442:48: (iv_ruleDetails= ruleDetails EOF )
            // InternalCIMIDSL.g:443:2: iv_ruleDetails= ruleDetails EOF
            {
             newCompositeNode(grammarAccess.getDetailsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDetails=ruleDetails();

            state._fsp--;

             current =iv_ruleDetails; 
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
    // $ANTLR end "entryRuleDetails"


    // $ANTLR start "ruleDetails"
    // InternalCIMIDSL.g:449:1: ruleDetails returns [EObject current=null] : (otherlv_0= '\"[' ( (lv_name_1_0= RULE_MYSTRING ) ) otherlv_2= ']\"' otherlv_3= '=' otherlv_4= '\\r' otherlv_5= '<' otherlv_6= 'language' otherlv_7= '=' otherlv_8= '<[' ( (lv_language_9_0= RULE_MYSTRING ) ) otherlv_10= ']>' otherlv_11= '\\r' otherlv_12= 'use' otherlv_13= '=' otherlv_14= '<[' ( (lv_use_15_0= RULE_STRING ) ) otherlv_16= ']>' otherlv_17= '\\r' otherlv_18= 'copyright' otherlv_19= '=' otherlv_20= '<[' ( (lv_copyright_21_0= RULE_STRING ) ) otherlv_22= ']>' otherlv_23= '\\r' otherlv_24= 'other_details' otherlv_25= '=' otherlv_26= '<[' ( (lv_other_details_27_0= ruleOtherDetails ) ) otherlv_28= ']>' otherlv_29= '\\r' otherlv_30= '>' otherlv_31= '\\r' ) ;
    public final EObject ruleDetails() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_language_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_use_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_copyright_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        EObject lv_other_details_27_0 = null;



        	enterRule();

        try {
            // InternalCIMIDSL.g:455:2: ( (otherlv_0= '\"[' ( (lv_name_1_0= RULE_MYSTRING ) ) otherlv_2= ']\"' otherlv_3= '=' otherlv_4= '\\r' otherlv_5= '<' otherlv_6= 'language' otherlv_7= '=' otherlv_8= '<[' ( (lv_language_9_0= RULE_MYSTRING ) ) otherlv_10= ']>' otherlv_11= '\\r' otherlv_12= 'use' otherlv_13= '=' otherlv_14= '<[' ( (lv_use_15_0= RULE_STRING ) ) otherlv_16= ']>' otherlv_17= '\\r' otherlv_18= 'copyright' otherlv_19= '=' otherlv_20= '<[' ( (lv_copyright_21_0= RULE_STRING ) ) otherlv_22= ']>' otherlv_23= '\\r' otherlv_24= 'other_details' otherlv_25= '=' otherlv_26= '<[' ( (lv_other_details_27_0= ruleOtherDetails ) ) otherlv_28= ']>' otherlv_29= '\\r' otherlv_30= '>' otherlv_31= '\\r' ) )
            // InternalCIMIDSL.g:456:2: (otherlv_0= '\"[' ( (lv_name_1_0= RULE_MYSTRING ) ) otherlv_2= ']\"' otherlv_3= '=' otherlv_4= '\\r' otherlv_5= '<' otherlv_6= 'language' otherlv_7= '=' otherlv_8= '<[' ( (lv_language_9_0= RULE_MYSTRING ) ) otherlv_10= ']>' otherlv_11= '\\r' otherlv_12= 'use' otherlv_13= '=' otherlv_14= '<[' ( (lv_use_15_0= RULE_STRING ) ) otherlv_16= ']>' otherlv_17= '\\r' otherlv_18= 'copyright' otherlv_19= '=' otherlv_20= '<[' ( (lv_copyright_21_0= RULE_STRING ) ) otherlv_22= ']>' otherlv_23= '\\r' otherlv_24= 'other_details' otherlv_25= '=' otherlv_26= '<[' ( (lv_other_details_27_0= ruleOtherDetails ) ) otherlv_28= ']>' otherlv_29= '\\r' otherlv_30= '>' otherlv_31= '\\r' )
            {
            // InternalCIMIDSL.g:456:2: (otherlv_0= '\"[' ( (lv_name_1_0= RULE_MYSTRING ) ) otherlv_2= ']\"' otherlv_3= '=' otherlv_4= '\\r' otherlv_5= '<' otherlv_6= 'language' otherlv_7= '=' otherlv_8= '<[' ( (lv_language_9_0= RULE_MYSTRING ) ) otherlv_10= ']>' otherlv_11= '\\r' otherlv_12= 'use' otherlv_13= '=' otherlv_14= '<[' ( (lv_use_15_0= RULE_STRING ) ) otherlv_16= ']>' otherlv_17= '\\r' otherlv_18= 'copyright' otherlv_19= '=' otherlv_20= '<[' ( (lv_copyright_21_0= RULE_STRING ) ) otherlv_22= ']>' otherlv_23= '\\r' otherlv_24= 'other_details' otherlv_25= '=' otherlv_26= '<[' ( (lv_other_details_27_0= ruleOtherDetails ) ) otherlv_28= ']>' otherlv_29= '\\r' otherlv_30= '>' otherlv_31= '\\r' )
            // InternalCIMIDSL.g:457:3: otherlv_0= '\"[' ( (lv_name_1_0= RULE_MYSTRING ) ) otherlv_2= ']\"' otherlv_3= '=' otherlv_4= '\\r' otherlv_5= '<' otherlv_6= 'language' otherlv_7= '=' otherlv_8= '<[' ( (lv_language_9_0= RULE_MYSTRING ) ) otherlv_10= ']>' otherlv_11= '\\r' otherlv_12= 'use' otherlv_13= '=' otherlv_14= '<[' ( (lv_use_15_0= RULE_STRING ) ) otherlv_16= ']>' otherlv_17= '\\r' otherlv_18= 'copyright' otherlv_19= '=' otherlv_20= '<[' ( (lv_copyright_21_0= RULE_STRING ) ) otherlv_22= ']>' otherlv_23= '\\r' otherlv_24= 'other_details' otherlv_25= '=' otherlv_26= '<[' ( (lv_other_details_27_0= ruleOtherDetails ) ) otherlv_28= ']>' otherlv_29= '\\r' otherlv_30= '>' otherlv_31= '\\r'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDetailsAccess().getQuotationMarkLeftSquareBracketKeyword_0());
            		
            // InternalCIMIDSL.g:461:3: ( (lv_name_1_0= RULE_MYSTRING ) )
            // InternalCIMIDSL.g:462:4: (lv_name_1_0= RULE_MYSTRING )
            {
            // InternalCIMIDSL.g:462:4: (lv_name_1_0= RULE_MYSTRING )
            // InternalCIMIDSL.g:463:5: lv_name_1_0= RULE_MYSTRING
            {
            lv_name_1_0=(Token)match(input,RULE_MYSTRING,FOLLOW_25); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDetailsAccess().getNameMYSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDetailsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"gov.us.fhim.xtext.cimi.CIMIDSL.MYSTRING");
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getDetailsAccess().getRightSquareBracketQuotationMarkKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getDetailsAccess().getEqualsSignKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getDetailsAccess().getControl000dKeyword_4());
            		
            otherlv_5=(Token)match(input,26,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getDetailsAccess().getLessThanSignKeyword_5());
            		
            otherlv_6=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getDetailsAccess().getLanguageKeyword_6());
            		
            otherlv_7=(Token)match(input,25,FOLLOW_27); 

            			newLeafNode(otherlv_7, grammarAccess.getDetailsAccess().getEqualsSignKeyword_7());
            		
            otherlv_8=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getDetailsAccess().getLessThanSignLeftSquareBracketKeyword_8());
            		
            // InternalCIMIDSL.g:507:3: ( (lv_language_9_0= RULE_MYSTRING ) )
            // InternalCIMIDSL.g:508:4: (lv_language_9_0= RULE_MYSTRING )
            {
            // InternalCIMIDSL.g:508:4: (lv_language_9_0= RULE_MYSTRING )
            // InternalCIMIDSL.g:509:5: lv_language_9_0= RULE_MYSTRING
            {
            lv_language_9_0=(Token)match(input,RULE_MYSTRING,FOLLOW_28); 

            					newLeafNode(lv_language_9_0, grammarAccess.getDetailsAccess().getLanguageMYSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDetailsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"language",
            						lv_language_9_0,
            						"gov.us.fhim.xtext.cimi.CIMIDSL.MYSTRING");
            				

            }


            }

            otherlv_10=(Token)match(input,33,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getDetailsAccess().getRightSquareBracketGreaterThanSignKeyword_10());
            		
            otherlv_11=(Token)match(input,19,FOLLOW_29); 

            			newLeafNode(otherlv_11, grammarAccess.getDetailsAccess().getControl000dKeyword_11());
            		
            otherlv_12=(Token)match(input,34,FOLLOW_19); 

            			newLeafNode(otherlv_12, grammarAccess.getDetailsAccess().getUseKeyword_12());
            		
            otherlv_13=(Token)match(input,25,FOLLOW_27); 

            			newLeafNode(otherlv_13, grammarAccess.getDetailsAccess().getEqualsSignKeyword_13());
            		
            otherlv_14=(Token)match(input,32,FOLLOW_30); 

            			newLeafNode(otherlv_14, grammarAccess.getDetailsAccess().getLessThanSignLeftSquareBracketKeyword_14());
            		
            // InternalCIMIDSL.g:545:3: ( (lv_use_15_0= RULE_STRING ) )
            // InternalCIMIDSL.g:546:4: (lv_use_15_0= RULE_STRING )
            {
            // InternalCIMIDSL.g:546:4: (lv_use_15_0= RULE_STRING )
            // InternalCIMIDSL.g:547:5: lv_use_15_0= RULE_STRING
            {
            lv_use_15_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_use_15_0, grammarAccess.getDetailsAccess().getUseSTRINGTerminalRuleCall_15_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDetailsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"use",
            						lv_use_15_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_16=(Token)match(input,33,FOLLOW_11); 

            			newLeafNode(otherlv_16, grammarAccess.getDetailsAccess().getRightSquareBracketGreaterThanSignKeyword_16());
            		
            otherlv_17=(Token)match(input,19,FOLLOW_31); 

            			newLeafNode(otherlv_17, grammarAccess.getDetailsAccess().getControl000dKeyword_17());
            		
            otherlv_18=(Token)match(input,35,FOLLOW_19); 

            			newLeafNode(otherlv_18, grammarAccess.getDetailsAccess().getCopyrightKeyword_18());
            		
            otherlv_19=(Token)match(input,25,FOLLOW_27); 

            			newLeafNode(otherlv_19, grammarAccess.getDetailsAccess().getEqualsSignKeyword_19());
            		
            otherlv_20=(Token)match(input,32,FOLLOW_30); 

            			newLeafNode(otherlv_20, grammarAccess.getDetailsAccess().getLessThanSignLeftSquareBracketKeyword_20());
            		
            // InternalCIMIDSL.g:583:3: ( (lv_copyright_21_0= RULE_STRING ) )
            // InternalCIMIDSL.g:584:4: (lv_copyright_21_0= RULE_STRING )
            {
            // InternalCIMIDSL.g:584:4: (lv_copyright_21_0= RULE_STRING )
            // InternalCIMIDSL.g:585:5: lv_copyright_21_0= RULE_STRING
            {
            lv_copyright_21_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_copyright_21_0, grammarAccess.getDetailsAccess().getCopyrightSTRINGTerminalRuleCall_21_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDetailsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"copyright",
            						lv_copyright_21_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_22=(Token)match(input,33,FOLLOW_11); 

            			newLeafNode(otherlv_22, grammarAccess.getDetailsAccess().getRightSquareBracketGreaterThanSignKeyword_22());
            		
            otherlv_23=(Token)match(input,19,FOLLOW_32); 

            			newLeafNode(otherlv_23, grammarAccess.getDetailsAccess().getControl000dKeyword_23());
            		
            otherlv_24=(Token)match(input,36,FOLLOW_19); 

            			newLeafNode(otherlv_24, grammarAccess.getDetailsAccess().getOther_detailsKeyword_24());
            		
            otherlv_25=(Token)match(input,25,FOLLOW_27); 

            			newLeafNode(otherlv_25, grammarAccess.getDetailsAccess().getEqualsSignKeyword_25());
            		
            otherlv_26=(Token)match(input,32,FOLLOW_33); 

            			newLeafNode(otherlv_26, grammarAccess.getDetailsAccess().getLessThanSignLeftSquareBracketKeyword_26());
            		
            // InternalCIMIDSL.g:621:3: ( (lv_other_details_27_0= ruleOtherDetails ) )
            // InternalCIMIDSL.g:622:4: (lv_other_details_27_0= ruleOtherDetails )
            {
            // InternalCIMIDSL.g:622:4: (lv_other_details_27_0= ruleOtherDetails )
            // InternalCIMIDSL.g:623:5: lv_other_details_27_0= ruleOtherDetails
            {

            					newCompositeNode(grammarAccess.getDetailsAccess().getOther_detailsOtherDetailsParserRuleCall_27_0());
            				
            pushFollow(FOLLOW_28);
            lv_other_details_27_0=ruleOtherDetails();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDetailsRule());
            					}
            					set(
            						current,
            						"other_details",
            						lv_other_details_27_0,
            						"gov.us.fhim.xtext.cimi.CIMIDSL.OtherDetails");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_28=(Token)match(input,33,FOLLOW_11); 

            			newLeafNode(otherlv_28, grammarAccess.getDetailsAccess().getRightSquareBracketGreaterThanSignKeyword_28());
            		
            otherlv_29=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_29, grammarAccess.getDetailsAccess().getControl000dKeyword_29());
            		
            otherlv_30=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_30, grammarAccess.getDetailsAccess().getGreaterThanSignKeyword_30());
            		
            otherlv_31=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getDetailsAccess().getControl000dKeyword_31());
            		

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
    // $ANTLR end "ruleDetails"


    // $ANTLR start "entryRuleOtherDetails"
    // InternalCIMIDSL.g:660:1: entryRuleOtherDetails returns [EObject current=null] : iv_ruleOtherDetails= ruleOtherDetails EOF ;
    public final EObject entryRuleOtherDetails() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherDetails = null;


        try {
            // InternalCIMIDSL.g:660:53: (iv_ruleOtherDetails= ruleOtherDetails EOF )
            // InternalCIMIDSL.g:661:2: iv_ruleOtherDetails= ruleOtherDetails EOF
            {
             newCompositeNode(grammarAccess.getOtherDetailsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOtherDetails=ruleOtherDetails();

            state._fsp--;

             current =iv_ruleOtherDetails; 
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
    // $ANTLR end "entryRuleOtherDetails"


    // $ANTLR start "ruleOtherDetails"
    // InternalCIMIDSL.g:667:1: ruleOtherDetails returns [EObject current=null] : (otherlv_0= '[\"lifecycle_state\"]' otherlv_1= '=' otherlv_2= '<' ( (lv_lifecycle_state_3_0= RULE_STRING ) ) otherlv_4= '>' otherlv_5= '\\r' otherlv_6= '[\"custodian_namespace\"]' otherlv_7= '=' otherlv_8= '<' ( (lv_custodian_namespace_9_0= RULE_STRING ) ) otherlv_10= '>' otherlv_11= '\\r' otherlv_12= '[\"custodian_organization\"]' otherlv_13= '=' otherlv_14= '<' ( (lv_custodian_organization_15_0= RULE_STRING ) ) otherlv_16= '>' otherlv_17= '\\r' otherlv_18= '[\"license\"]' otherlv_19= '=' otherlv_20= '<' ( (lv_license_21_0= RULE_STRING ) ) otherlv_22= '>' otherlv_23= '\\r' otherlv_24= '[\"ip_acknowledgement_loinc\"]' otherlv_25= '=' otherlv_26= '<' ( (lv_ip_acknowledgement_loinc_27_0= RULE_STRING ) ) otherlv_28= '>' otherlv_29= '\\r' otherlv_30= '[\"ip_acknowledgement_snomed\"]' otherlv_31= '=' otherlv_32= '<' ( (lv_ip_acknowledgement_snomed_33_0= RULE_STRING ) ) otherlv_34= '>' otherlv_35= '\\r' ) ;
    public final EObject ruleOtherDetails() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_lifecycle_state_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_custodian_namespace_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_custodian_organization_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_license_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token lv_ip_acknowledgement_loinc_27_0=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token lv_ip_acknowledgement_snomed_33_0=null;
        Token otherlv_34=null;
        Token otherlv_35=null;


        	enterRule();

        try {
            // InternalCIMIDSL.g:673:2: ( (otherlv_0= '[\"lifecycle_state\"]' otherlv_1= '=' otherlv_2= '<' ( (lv_lifecycle_state_3_0= RULE_STRING ) ) otherlv_4= '>' otherlv_5= '\\r' otherlv_6= '[\"custodian_namespace\"]' otherlv_7= '=' otherlv_8= '<' ( (lv_custodian_namespace_9_0= RULE_STRING ) ) otherlv_10= '>' otherlv_11= '\\r' otherlv_12= '[\"custodian_organization\"]' otherlv_13= '=' otherlv_14= '<' ( (lv_custodian_organization_15_0= RULE_STRING ) ) otherlv_16= '>' otherlv_17= '\\r' otherlv_18= '[\"license\"]' otherlv_19= '=' otherlv_20= '<' ( (lv_license_21_0= RULE_STRING ) ) otherlv_22= '>' otherlv_23= '\\r' otherlv_24= '[\"ip_acknowledgement_loinc\"]' otherlv_25= '=' otherlv_26= '<' ( (lv_ip_acknowledgement_loinc_27_0= RULE_STRING ) ) otherlv_28= '>' otherlv_29= '\\r' otherlv_30= '[\"ip_acknowledgement_snomed\"]' otherlv_31= '=' otherlv_32= '<' ( (lv_ip_acknowledgement_snomed_33_0= RULE_STRING ) ) otherlv_34= '>' otherlv_35= '\\r' ) )
            // InternalCIMIDSL.g:674:2: (otherlv_0= '[\"lifecycle_state\"]' otherlv_1= '=' otherlv_2= '<' ( (lv_lifecycle_state_3_0= RULE_STRING ) ) otherlv_4= '>' otherlv_5= '\\r' otherlv_6= '[\"custodian_namespace\"]' otherlv_7= '=' otherlv_8= '<' ( (lv_custodian_namespace_9_0= RULE_STRING ) ) otherlv_10= '>' otherlv_11= '\\r' otherlv_12= '[\"custodian_organization\"]' otherlv_13= '=' otherlv_14= '<' ( (lv_custodian_organization_15_0= RULE_STRING ) ) otherlv_16= '>' otherlv_17= '\\r' otherlv_18= '[\"license\"]' otherlv_19= '=' otherlv_20= '<' ( (lv_license_21_0= RULE_STRING ) ) otherlv_22= '>' otherlv_23= '\\r' otherlv_24= '[\"ip_acknowledgement_loinc\"]' otherlv_25= '=' otherlv_26= '<' ( (lv_ip_acknowledgement_loinc_27_0= RULE_STRING ) ) otherlv_28= '>' otherlv_29= '\\r' otherlv_30= '[\"ip_acknowledgement_snomed\"]' otherlv_31= '=' otherlv_32= '<' ( (lv_ip_acknowledgement_snomed_33_0= RULE_STRING ) ) otherlv_34= '>' otherlv_35= '\\r' )
            {
            // InternalCIMIDSL.g:674:2: (otherlv_0= '[\"lifecycle_state\"]' otherlv_1= '=' otherlv_2= '<' ( (lv_lifecycle_state_3_0= RULE_STRING ) ) otherlv_4= '>' otherlv_5= '\\r' otherlv_6= '[\"custodian_namespace\"]' otherlv_7= '=' otherlv_8= '<' ( (lv_custodian_namespace_9_0= RULE_STRING ) ) otherlv_10= '>' otherlv_11= '\\r' otherlv_12= '[\"custodian_organization\"]' otherlv_13= '=' otherlv_14= '<' ( (lv_custodian_organization_15_0= RULE_STRING ) ) otherlv_16= '>' otherlv_17= '\\r' otherlv_18= '[\"license\"]' otherlv_19= '=' otherlv_20= '<' ( (lv_license_21_0= RULE_STRING ) ) otherlv_22= '>' otherlv_23= '\\r' otherlv_24= '[\"ip_acknowledgement_loinc\"]' otherlv_25= '=' otherlv_26= '<' ( (lv_ip_acknowledgement_loinc_27_0= RULE_STRING ) ) otherlv_28= '>' otherlv_29= '\\r' otherlv_30= '[\"ip_acknowledgement_snomed\"]' otherlv_31= '=' otherlv_32= '<' ( (lv_ip_acknowledgement_snomed_33_0= RULE_STRING ) ) otherlv_34= '>' otherlv_35= '\\r' )
            // InternalCIMIDSL.g:675:3: otherlv_0= '[\"lifecycle_state\"]' otherlv_1= '=' otherlv_2= '<' ( (lv_lifecycle_state_3_0= RULE_STRING ) ) otherlv_4= '>' otherlv_5= '\\r' otherlv_6= '[\"custodian_namespace\"]' otherlv_7= '=' otherlv_8= '<' ( (lv_custodian_namespace_9_0= RULE_STRING ) ) otherlv_10= '>' otherlv_11= '\\r' otherlv_12= '[\"custodian_organization\"]' otherlv_13= '=' otherlv_14= '<' ( (lv_custodian_organization_15_0= RULE_STRING ) ) otherlv_16= '>' otherlv_17= '\\r' otherlv_18= '[\"license\"]' otherlv_19= '=' otherlv_20= '<' ( (lv_license_21_0= RULE_STRING ) ) otherlv_22= '>' otherlv_23= '\\r' otherlv_24= '[\"ip_acknowledgement_loinc\"]' otherlv_25= '=' otherlv_26= '<' ( (lv_ip_acknowledgement_loinc_27_0= RULE_STRING ) ) otherlv_28= '>' otherlv_29= '\\r' otherlv_30= '[\"ip_acknowledgement_snomed\"]' otherlv_31= '=' otherlv_32= '<' ( (lv_ip_acknowledgement_snomed_33_0= RULE_STRING ) ) otherlv_34= '>' otherlv_35= '\\r'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getOtherDetailsAccess().getLifecycle_stateKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getOtherDetailsAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getOtherDetailsAccess().getLessThanSignKeyword_2());
            		
            // InternalCIMIDSL.g:687:3: ( (lv_lifecycle_state_3_0= RULE_STRING ) )
            // InternalCIMIDSL.g:688:4: (lv_lifecycle_state_3_0= RULE_STRING )
            {
            // InternalCIMIDSL.g:688:4: (lv_lifecycle_state_3_0= RULE_STRING )
            // InternalCIMIDSL.g:689:5: lv_lifecycle_state_3_0= RULE_STRING
            {
            lv_lifecycle_state_3_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_lifecycle_state_3_0, grammarAccess.getOtherDetailsAccess().getLifecycle_stateSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOtherDetailsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lifecycle_state",
            						lv_lifecycle_state_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getOtherDetailsAccess().getGreaterThanSignKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_34); 

            			newLeafNode(otherlv_5, grammarAccess.getOtherDetailsAccess().getControl000dKeyword_5());
            		
            otherlv_6=(Token)match(input,38,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getOtherDetailsAccess().getCustodian_namespaceKeyword_6());
            		
            otherlv_7=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getOtherDetailsAccess().getEqualsSignKeyword_7());
            		
            otherlv_8=(Token)match(input,26,FOLLOW_30); 

            			newLeafNode(otherlv_8, grammarAccess.getOtherDetailsAccess().getLessThanSignKeyword_8());
            		
            // InternalCIMIDSL.g:725:3: ( (lv_custodian_namespace_9_0= RULE_STRING ) )
            // InternalCIMIDSL.g:726:4: (lv_custodian_namespace_9_0= RULE_STRING )
            {
            // InternalCIMIDSL.g:726:4: (lv_custodian_namespace_9_0= RULE_STRING )
            // InternalCIMIDSL.g:727:5: lv_custodian_namespace_9_0= RULE_STRING
            {
            lv_custodian_namespace_9_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_custodian_namespace_9_0, grammarAccess.getOtherDetailsAccess().getCustodian_namespaceSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOtherDetailsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"custodian_namespace",
            						lv_custodian_namespace_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getOtherDetailsAccess().getGreaterThanSignKeyword_10());
            		
            otherlv_11=(Token)match(input,19,FOLLOW_35); 

            			newLeafNode(otherlv_11, grammarAccess.getOtherDetailsAccess().getControl000dKeyword_11());
            		
            otherlv_12=(Token)match(input,39,FOLLOW_19); 

            			newLeafNode(otherlv_12, grammarAccess.getOtherDetailsAccess().getCustodian_organizationKeyword_12());
            		
            otherlv_13=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_13, grammarAccess.getOtherDetailsAccess().getEqualsSignKeyword_13());
            		
            otherlv_14=(Token)match(input,26,FOLLOW_30); 

            			newLeafNode(otherlv_14, grammarAccess.getOtherDetailsAccess().getLessThanSignKeyword_14());
            		
            // InternalCIMIDSL.g:763:3: ( (lv_custodian_organization_15_0= RULE_STRING ) )
            // InternalCIMIDSL.g:764:4: (lv_custodian_organization_15_0= RULE_STRING )
            {
            // InternalCIMIDSL.g:764:4: (lv_custodian_organization_15_0= RULE_STRING )
            // InternalCIMIDSL.g:765:5: lv_custodian_organization_15_0= RULE_STRING
            {
            lv_custodian_organization_15_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_custodian_organization_15_0, grammarAccess.getOtherDetailsAccess().getCustodian_organizationSTRINGTerminalRuleCall_15_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOtherDetailsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"custodian_organization",
            						lv_custodian_organization_15_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_16=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_16, grammarAccess.getOtherDetailsAccess().getGreaterThanSignKeyword_16());
            		
            otherlv_17=(Token)match(input,19,FOLLOW_36); 

            			newLeafNode(otherlv_17, grammarAccess.getOtherDetailsAccess().getControl000dKeyword_17());
            		
            otherlv_18=(Token)match(input,40,FOLLOW_19); 

            			newLeafNode(otherlv_18, grammarAccess.getOtherDetailsAccess().getLicenseKeyword_18());
            		
            otherlv_19=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_19, grammarAccess.getOtherDetailsAccess().getEqualsSignKeyword_19());
            		
            otherlv_20=(Token)match(input,26,FOLLOW_30); 

            			newLeafNode(otherlv_20, grammarAccess.getOtherDetailsAccess().getLessThanSignKeyword_20());
            		
            // InternalCIMIDSL.g:801:3: ( (lv_license_21_0= RULE_STRING ) )
            // InternalCIMIDSL.g:802:4: (lv_license_21_0= RULE_STRING )
            {
            // InternalCIMIDSL.g:802:4: (lv_license_21_0= RULE_STRING )
            // InternalCIMIDSL.g:803:5: lv_license_21_0= RULE_STRING
            {
            lv_license_21_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_license_21_0, grammarAccess.getOtherDetailsAccess().getLicenseSTRINGTerminalRuleCall_21_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOtherDetailsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"license",
            						lv_license_21_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_22=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_22, grammarAccess.getOtherDetailsAccess().getGreaterThanSignKeyword_22());
            		
            otherlv_23=(Token)match(input,19,FOLLOW_37); 

            			newLeafNode(otherlv_23, grammarAccess.getOtherDetailsAccess().getControl000dKeyword_23());
            		
            otherlv_24=(Token)match(input,41,FOLLOW_19); 

            			newLeafNode(otherlv_24, grammarAccess.getOtherDetailsAccess().getIp_acknowledgement_loincKeyword_24());
            		
            otherlv_25=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_25, grammarAccess.getOtherDetailsAccess().getEqualsSignKeyword_25());
            		
            otherlv_26=(Token)match(input,26,FOLLOW_30); 

            			newLeafNode(otherlv_26, grammarAccess.getOtherDetailsAccess().getLessThanSignKeyword_26());
            		
            // InternalCIMIDSL.g:839:3: ( (lv_ip_acknowledgement_loinc_27_0= RULE_STRING ) )
            // InternalCIMIDSL.g:840:4: (lv_ip_acknowledgement_loinc_27_0= RULE_STRING )
            {
            // InternalCIMIDSL.g:840:4: (lv_ip_acknowledgement_loinc_27_0= RULE_STRING )
            // InternalCIMIDSL.g:841:5: lv_ip_acknowledgement_loinc_27_0= RULE_STRING
            {
            lv_ip_acknowledgement_loinc_27_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_ip_acknowledgement_loinc_27_0, grammarAccess.getOtherDetailsAccess().getIp_acknowledgement_loincSTRINGTerminalRuleCall_27_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOtherDetailsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ip_acknowledgement_loinc",
            						lv_ip_acknowledgement_loinc_27_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_28=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_28, grammarAccess.getOtherDetailsAccess().getGreaterThanSignKeyword_28());
            		
            otherlv_29=(Token)match(input,19,FOLLOW_38); 

            			newLeafNode(otherlv_29, grammarAccess.getOtherDetailsAccess().getControl000dKeyword_29());
            		
            otherlv_30=(Token)match(input,42,FOLLOW_19); 

            			newLeafNode(otherlv_30, grammarAccess.getOtherDetailsAccess().getIp_acknowledgement_snomedKeyword_30());
            		
            otherlv_31=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_31, grammarAccess.getOtherDetailsAccess().getEqualsSignKeyword_31());
            		
            otherlv_32=(Token)match(input,26,FOLLOW_30); 

            			newLeafNode(otherlv_32, grammarAccess.getOtherDetailsAccess().getLessThanSignKeyword_32());
            		
            // InternalCIMIDSL.g:877:3: ( (lv_ip_acknowledgement_snomed_33_0= RULE_STRING ) )
            // InternalCIMIDSL.g:878:4: (lv_ip_acknowledgement_snomed_33_0= RULE_STRING )
            {
            // InternalCIMIDSL.g:878:4: (lv_ip_acknowledgement_snomed_33_0= RULE_STRING )
            // InternalCIMIDSL.g:879:5: lv_ip_acknowledgement_snomed_33_0= RULE_STRING
            {
            lv_ip_acknowledgement_snomed_33_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_ip_acknowledgement_snomed_33_0, grammarAccess.getOtherDetailsAccess().getIp_acknowledgement_snomedSTRINGTerminalRuleCall_33_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOtherDetailsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ip_acknowledgement_snomed",
            						lv_ip_acknowledgement_snomed_33_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_34=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_34, grammarAccess.getOtherDetailsAccess().getGreaterThanSignKeyword_34());
            		
            otherlv_35=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_35, grammarAccess.getOtherDetailsAccess().getControl000dKeyword_35());
            		

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
    // $ANTLR end "ruleOtherDetails"


    // $ANTLR start "entryRuleOriginalAuthor"
    // InternalCIMIDSL.g:907:1: entryRuleOriginalAuthor returns [EObject current=null] : iv_ruleOriginalAuthor= ruleOriginalAuthor EOF ;
    public final EObject entryRuleOriginalAuthor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOriginalAuthor = null;


        try {
            // InternalCIMIDSL.g:907:55: (iv_ruleOriginalAuthor= ruleOriginalAuthor EOF )
            // InternalCIMIDSL.g:908:2: iv_ruleOriginalAuthor= ruleOriginalAuthor EOF
            {
             newCompositeNode(grammarAccess.getOriginalAuthorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOriginalAuthor=ruleOriginalAuthor();

            state._fsp--;

             current =iv_ruleOriginalAuthor; 
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
    // $ANTLR end "entryRuleOriginalAuthor"


    // $ANTLR start "ruleOriginalAuthor"
    // InternalCIMIDSL.g:914:1: ruleOriginalAuthor returns [EObject current=null] : (otherlv_0= '[\"date\"]' otherlv_1= '=' otherlv_2= '<' ( (lv_date_3_0= RULE_STRING ) ) otherlv_4= '>' otherlv_5= '\\r' otherlv_6= '[\"organization\"]' otherlv_7= '=' otherlv_8= '<' ( (lv_organization_9_0= RULE_STRING ) ) otherlv_10= '>' otherlv_11= '\\r' otherlv_12= '[\"name\"]' otherlv_13= '=' otherlv_14= '<' ( (lv_name_15_0= RULE_STRING ) ) otherlv_16= '>' otherlv_17= '\\r' otherlv_18= '[\"email\"]' otherlv_19= '=' otherlv_20= '<' ( (lv_email_21_0= RULE_STRING ) ) otherlv_22= '>' otherlv_23= '\\r' ) ;
    public final EObject ruleOriginalAuthor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_date_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_organization_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_name_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_email_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;


        	enterRule();

        try {
            // InternalCIMIDSL.g:920:2: ( (otherlv_0= '[\"date\"]' otherlv_1= '=' otherlv_2= '<' ( (lv_date_3_0= RULE_STRING ) ) otherlv_4= '>' otherlv_5= '\\r' otherlv_6= '[\"organization\"]' otherlv_7= '=' otherlv_8= '<' ( (lv_organization_9_0= RULE_STRING ) ) otherlv_10= '>' otherlv_11= '\\r' otherlv_12= '[\"name\"]' otherlv_13= '=' otherlv_14= '<' ( (lv_name_15_0= RULE_STRING ) ) otherlv_16= '>' otherlv_17= '\\r' otherlv_18= '[\"email\"]' otherlv_19= '=' otherlv_20= '<' ( (lv_email_21_0= RULE_STRING ) ) otherlv_22= '>' otherlv_23= '\\r' ) )
            // InternalCIMIDSL.g:921:2: (otherlv_0= '[\"date\"]' otherlv_1= '=' otherlv_2= '<' ( (lv_date_3_0= RULE_STRING ) ) otherlv_4= '>' otherlv_5= '\\r' otherlv_6= '[\"organization\"]' otherlv_7= '=' otherlv_8= '<' ( (lv_organization_9_0= RULE_STRING ) ) otherlv_10= '>' otherlv_11= '\\r' otherlv_12= '[\"name\"]' otherlv_13= '=' otherlv_14= '<' ( (lv_name_15_0= RULE_STRING ) ) otherlv_16= '>' otherlv_17= '\\r' otherlv_18= '[\"email\"]' otherlv_19= '=' otherlv_20= '<' ( (lv_email_21_0= RULE_STRING ) ) otherlv_22= '>' otherlv_23= '\\r' )
            {
            // InternalCIMIDSL.g:921:2: (otherlv_0= '[\"date\"]' otherlv_1= '=' otherlv_2= '<' ( (lv_date_3_0= RULE_STRING ) ) otherlv_4= '>' otherlv_5= '\\r' otherlv_6= '[\"organization\"]' otherlv_7= '=' otherlv_8= '<' ( (lv_organization_9_0= RULE_STRING ) ) otherlv_10= '>' otherlv_11= '\\r' otherlv_12= '[\"name\"]' otherlv_13= '=' otherlv_14= '<' ( (lv_name_15_0= RULE_STRING ) ) otherlv_16= '>' otherlv_17= '\\r' otherlv_18= '[\"email\"]' otherlv_19= '=' otherlv_20= '<' ( (lv_email_21_0= RULE_STRING ) ) otherlv_22= '>' otherlv_23= '\\r' )
            // InternalCIMIDSL.g:922:3: otherlv_0= '[\"date\"]' otherlv_1= '=' otherlv_2= '<' ( (lv_date_3_0= RULE_STRING ) ) otherlv_4= '>' otherlv_5= '\\r' otherlv_6= '[\"organization\"]' otherlv_7= '=' otherlv_8= '<' ( (lv_organization_9_0= RULE_STRING ) ) otherlv_10= '>' otherlv_11= '\\r' otherlv_12= '[\"name\"]' otherlv_13= '=' otherlv_14= '<' ( (lv_name_15_0= RULE_STRING ) ) otherlv_16= '>' otherlv_17= '\\r' otherlv_18= '[\"email\"]' otherlv_19= '=' otherlv_20= '<' ( (lv_email_21_0= RULE_STRING ) ) otherlv_22= '>' otherlv_23= '\\r'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getOriginalAuthorAccess().getDateKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getOriginalAuthorAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getOriginalAuthorAccess().getLessThanSignKeyword_2());
            		
            // InternalCIMIDSL.g:934:3: ( (lv_date_3_0= RULE_STRING ) )
            // InternalCIMIDSL.g:935:4: (lv_date_3_0= RULE_STRING )
            {
            // InternalCIMIDSL.g:935:4: (lv_date_3_0= RULE_STRING )
            // InternalCIMIDSL.g:936:5: lv_date_3_0= RULE_STRING
            {
            lv_date_3_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_date_3_0, grammarAccess.getOriginalAuthorAccess().getDateSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOriginalAuthorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"date",
            						lv_date_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getOriginalAuthorAccess().getGreaterThanSignKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_39); 

            			newLeafNode(otherlv_5, grammarAccess.getOriginalAuthorAccess().getControl000dKeyword_5());
            		
            otherlv_6=(Token)match(input,44,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getOriginalAuthorAccess().getOrganizationKeyword_6());
            		
            otherlv_7=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getOriginalAuthorAccess().getEqualsSignKeyword_7());
            		
            otherlv_8=(Token)match(input,26,FOLLOW_30); 

            			newLeafNode(otherlv_8, grammarAccess.getOriginalAuthorAccess().getLessThanSignKeyword_8());
            		
            // InternalCIMIDSL.g:972:3: ( (lv_organization_9_0= RULE_STRING ) )
            // InternalCIMIDSL.g:973:4: (lv_organization_9_0= RULE_STRING )
            {
            // InternalCIMIDSL.g:973:4: (lv_organization_9_0= RULE_STRING )
            // InternalCIMIDSL.g:974:5: lv_organization_9_0= RULE_STRING
            {
            lv_organization_9_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_organization_9_0, grammarAccess.getOriginalAuthorAccess().getOrganizationSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOriginalAuthorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"organization",
            						lv_organization_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getOriginalAuthorAccess().getGreaterThanSignKeyword_10());
            		
            otherlv_11=(Token)match(input,19,FOLLOW_40); 

            			newLeafNode(otherlv_11, grammarAccess.getOriginalAuthorAccess().getControl000dKeyword_11());
            		
            otherlv_12=(Token)match(input,45,FOLLOW_19); 

            			newLeafNode(otherlv_12, grammarAccess.getOriginalAuthorAccess().getNameKeyword_12());
            		
            otherlv_13=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_13, grammarAccess.getOriginalAuthorAccess().getEqualsSignKeyword_13());
            		
            otherlv_14=(Token)match(input,26,FOLLOW_30); 

            			newLeafNode(otherlv_14, grammarAccess.getOriginalAuthorAccess().getLessThanSignKeyword_14());
            		
            // InternalCIMIDSL.g:1010:3: ( (lv_name_15_0= RULE_STRING ) )
            // InternalCIMIDSL.g:1011:4: (lv_name_15_0= RULE_STRING )
            {
            // InternalCIMIDSL.g:1011:4: (lv_name_15_0= RULE_STRING )
            // InternalCIMIDSL.g:1012:5: lv_name_15_0= RULE_STRING
            {
            lv_name_15_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_name_15_0, grammarAccess.getOriginalAuthorAccess().getNameSTRINGTerminalRuleCall_15_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOriginalAuthorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_15_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_16=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_16, grammarAccess.getOriginalAuthorAccess().getGreaterThanSignKeyword_16());
            		
            otherlv_17=(Token)match(input,19,FOLLOW_41); 

            			newLeafNode(otherlv_17, grammarAccess.getOriginalAuthorAccess().getControl000dKeyword_17());
            		
            otherlv_18=(Token)match(input,46,FOLLOW_19); 

            			newLeafNode(otherlv_18, grammarAccess.getOriginalAuthorAccess().getEmailKeyword_18());
            		
            otherlv_19=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_19, grammarAccess.getOriginalAuthorAccess().getEqualsSignKeyword_19());
            		
            otherlv_20=(Token)match(input,26,FOLLOW_30); 

            			newLeafNode(otherlv_20, grammarAccess.getOriginalAuthorAccess().getLessThanSignKeyword_20());
            		
            // InternalCIMIDSL.g:1048:3: ( (lv_email_21_0= RULE_STRING ) )
            // InternalCIMIDSL.g:1049:4: (lv_email_21_0= RULE_STRING )
            {
            // InternalCIMIDSL.g:1049:4: (lv_email_21_0= RULE_STRING )
            // InternalCIMIDSL.g:1050:5: lv_email_21_0= RULE_STRING
            {
            lv_email_21_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_email_21_0, grammarAccess.getOriginalAuthorAccess().getEmailSTRINGTerminalRuleCall_21_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOriginalAuthorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"email",
            						lv_email_21_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_22=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_22, grammarAccess.getOriginalAuthorAccess().getGreaterThanSignKeyword_22());
            		
            otherlv_23=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getOriginalAuthorAccess().getControl000dKeyword_23());
            		

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
    // $ANTLR end "ruleOriginalAuthor"


    // $ANTLR start "entryRuleLanguge"
    // InternalCIMIDSL.g:1078:1: entryRuleLanguge returns [EObject current=null] : iv_ruleLanguge= ruleLanguge EOF ;
    public final EObject entryRuleLanguge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguge = null;


        try {
            // InternalCIMIDSL.g:1078:48: (iv_ruleLanguge= ruleLanguge EOF )
            // InternalCIMIDSL.g:1079:2: iv_ruleLanguge= ruleLanguge EOF
            {
             newCompositeNode(grammarAccess.getLangugeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLanguge=ruleLanguge();

            state._fsp--;

             current =iv_ruleLanguge; 
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
    // $ANTLR end "entryRuleLanguge"


    // $ANTLR start "ruleLanguge"
    // InternalCIMIDSL.g:1085:1: ruleLanguge returns [EObject current=null] : (otherlv_0= 'original_language' otherlv_1= '=' otherlv_2= '<[' ( (lv_name_3_0= RULE_MYSTRING ) ) otherlv_4= ']>' ) ;
    public final EObject ruleLanguge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalCIMIDSL.g:1091:2: ( (otherlv_0= 'original_language' otherlv_1= '=' otherlv_2= '<[' ( (lv_name_3_0= RULE_MYSTRING ) ) otherlv_4= ']>' ) )
            // InternalCIMIDSL.g:1092:2: (otherlv_0= 'original_language' otherlv_1= '=' otherlv_2= '<[' ( (lv_name_3_0= RULE_MYSTRING ) ) otherlv_4= ']>' )
            {
            // InternalCIMIDSL.g:1092:2: (otherlv_0= 'original_language' otherlv_1= '=' otherlv_2= '<[' ( (lv_name_3_0= RULE_MYSTRING ) ) otherlv_4= ']>' )
            // InternalCIMIDSL.g:1093:3: otherlv_0= 'original_language' otherlv_1= '=' otherlv_2= '<[' ( (lv_name_3_0= RULE_MYSTRING ) ) otherlv_4= ']>'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getLangugeAccess().getOriginal_languageKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getLangugeAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLangugeAccess().getLessThanSignLeftSquareBracketKeyword_2());
            		
            // InternalCIMIDSL.g:1105:3: ( (lv_name_3_0= RULE_MYSTRING ) )
            // InternalCIMIDSL.g:1106:4: (lv_name_3_0= RULE_MYSTRING )
            {
            // InternalCIMIDSL.g:1106:4: (lv_name_3_0= RULE_MYSTRING )
            // InternalCIMIDSL.g:1107:5: lv_name_3_0= RULE_MYSTRING
            {
            lv_name_3_0=(Token)match(input,RULE_MYSTRING,FOLLOW_28); 

            					newLeafNode(lv_name_3_0, grammarAccess.getLangugeAccess().getNameMYSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLangugeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"gov.us.fhim.xtext.cimi.CIMIDSL.MYSTRING");
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLangugeAccess().getRightSquareBracketGreaterThanSignKeyword_4());
            		

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
    // $ANTLR end "ruleLanguge"


    // $ANTLR start "entryRuleMatches"
    // InternalCIMIDSL.g:1131:1: entryRuleMatches returns [EObject current=null] : iv_ruleMatches= ruleMatches EOF ;
    public final EObject entryRuleMatches() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatches = null;


        try {
            // InternalCIMIDSL.g:1131:48: (iv_ruleMatches= ruleMatches EOF )
            // InternalCIMIDSL.g:1132:2: iv_ruleMatches= ruleMatches EOF
            {
             newCompositeNode(grammarAccess.getMatchesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatches=ruleMatches();

            state._fsp--;

             current =iv_ruleMatches; 
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
    // $ANTLR end "entryRuleMatches"


    // $ANTLR start "ruleMatches"
    // InternalCIMIDSL.g:1138:1: ruleMatches returns [EObject current=null] : ( ( (lv_name_0_0= RULE_MYSTRING ) ) (otherlv_1= '[' ( (lv_definition_2_0= RULE_MYSTRING ) ) otherlv_3= ']' )? otherlv_4= 'matches' otherlv_5= '{\\r' ( ( (lv_submatch_6_0= ruleMatches ) )* | ( ( (lv_value_7_0= RULE_MYSTRING ) )? otherlv_8= '[' ( (lv_valueDefinition_9_0= RULE_MYSTRING ) ) otherlv_10= ']' ) ) otherlv_11= '}\\r' ) ;
    public final EObject ruleMatches() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_definition_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_value_7_0=null;
        Token otherlv_8=null;
        Token lv_valueDefinition_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_submatch_6_0 = null;



        	enterRule();

        try {
            // InternalCIMIDSL.g:1144:2: ( ( ( (lv_name_0_0= RULE_MYSTRING ) ) (otherlv_1= '[' ( (lv_definition_2_0= RULE_MYSTRING ) ) otherlv_3= ']' )? otherlv_4= 'matches' otherlv_5= '{\\r' ( ( (lv_submatch_6_0= ruleMatches ) )* | ( ( (lv_value_7_0= RULE_MYSTRING ) )? otherlv_8= '[' ( (lv_valueDefinition_9_0= RULE_MYSTRING ) ) otherlv_10= ']' ) ) otherlv_11= '}\\r' ) )
            // InternalCIMIDSL.g:1145:2: ( ( (lv_name_0_0= RULE_MYSTRING ) ) (otherlv_1= '[' ( (lv_definition_2_0= RULE_MYSTRING ) ) otherlv_3= ']' )? otherlv_4= 'matches' otherlv_5= '{\\r' ( ( (lv_submatch_6_0= ruleMatches ) )* | ( ( (lv_value_7_0= RULE_MYSTRING ) )? otherlv_8= '[' ( (lv_valueDefinition_9_0= RULE_MYSTRING ) ) otherlv_10= ']' ) ) otherlv_11= '}\\r' )
            {
            // InternalCIMIDSL.g:1145:2: ( ( (lv_name_0_0= RULE_MYSTRING ) ) (otherlv_1= '[' ( (lv_definition_2_0= RULE_MYSTRING ) ) otherlv_3= ']' )? otherlv_4= 'matches' otherlv_5= '{\\r' ( ( (lv_submatch_6_0= ruleMatches ) )* | ( ( (lv_value_7_0= RULE_MYSTRING ) )? otherlv_8= '[' ( (lv_valueDefinition_9_0= RULE_MYSTRING ) ) otherlv_10= ']' ) ) otherlv_11= '}\\r' )
            // InternalCIMIDSL.g:1146:3: ( (lv_name_0_0= RULE_MYSTRING ) ) (otherlv_1= '[' ( (lv_definition_2_0= RULE_MYSTRING ) ) otherlv_3= ']' )? otherlv_4= 'matches' otherlv_5= '{\\r' ( ( (lv_submatch_6_0= ruleMatches ) )* | ( ( (lv_value_7_0= RULE_MYSTRING ) )? otherlv_8= '[' ( (lv_valueDefinition_9_0= RULE_MYSTRING ) ) otherlv_10= ']' ) ) otherlv_11= '}\\r'
            {
            // InternalCIMIDSL.g:1146:3: ( (lv_name_0_0= RULE_MYSTRING ) )
            // InternalCIMIDSL.g:1147:4: (lv_name_0_0= RULE_MYSTRING )
            {
            // InternalCIMIDSL.g:1147:4: (lv_name_0_0= RULE_MYSTRING )
            // InternalCIMIDSL.g:1148:5: lv_name_0_0= RULE_MYSTRING
            {
            lv_name_0_0=(Token)match(input,RULE_MYSTRING,FOLLOW_42); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMatchesAccess().getNameMYSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMatchesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"gov.us.fhim.xtext.cimi.CIMIDSL.MYSTRING");
            				

            }


            }

            // InternalCIMIDSL.g:1164:3: (otherlv_1= '[' ( (lv_definition_2_0= RULE_MYSTRING ) ) otherlv_3= ']' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==48) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCIMIDSL.g:1165:4: otherlv_1= '[' ( (lv_definition_2_0= RULE_MYSTRING ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,48,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getMatchesAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalCIMIDSL.g:1169:4: ( (lv_definition_2_0= RULE_MYSTRING ) )
                    // InternalCIMIDSL.g:1170:5: (lv_definition_2_0= RULE_MYSTRING )
                    {
                    // InternalCIMIDSL.g:1170:5: (lv_definition_2_0= RULE_MYSTRING )
                    // InternalCIMIDSL.g:1171:6: lv_definition_2_0= RULE_MYSTRING
                    {
                    lv_definition_2_0=(Token)match(input,RULE_MYSTRING,FOLLOW_43); 

                    						newLeafNode(lv_definition_2_0, grammarAccess.getMatchesAccess().getDefinitionMYSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMatchesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"definition",
                    							lv_definition_2_0,
                    							"gov.us.fhim.xtext.cimi.CIMIDSL.MYSTRING");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,49,FOLLOW_44); 

                    				newLeafNode(otherlv_3, grammarAccess.getMatchesAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,50,FOLLOW_45); 

            			newLeafNode(otherlv_4, grammarAccess.getMatchesAccess().getMatchesKeyword_2());
            		
            otherlv_5=(Token)match(input,51,FOLLOW_46); 

            			newLeafNode(otherlv_5, grammarAccess.getMatchesAccess().getLeftCurlyBracketControl000dKeyword_3());
            		
            // InternalCIMIDSL.g:1200:3: ( ( (lv_submatch_6_0= ruleMatches ) )* | ( ( (lv_value_7_0= RULE_MYSTRING ) )? otherlv_8= '[' ( (lv_valueDefinition_9_0= RULE_MYSTRING ) ) otherlv_10= ']' ) )
            int alt5=2;
            switch ( input.LA(1) ) {
            case RULE_MYSTRING:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==48) ) {
                    int LA5_4 = input.LA(3);

                    if ( (LA5_4==RULE_MYSTRING) ) {
                        int LA5_5 = input.LA(4);

                        if ( (LA5_5==49) ) {
                            int LA5_6 = input.LA(5);

                            if ( (LA5_6==52) ) {
                                alt5=2;
                            }
                            else if ( (LA5_6==50) ) {
                                alt5=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA5_1==50) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 52:
                {
                alt5=1;
                }
                break;
            case 48:
                {
                alt5=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalCIMIDSL.g:1201:4: ( (lv_submatch_6_0= ruleMatches ) )*
                    {
                    // InternalCIMIDSL.g:1201:4: ( (lv_submatch_6_0= ruleMatches ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_MYSTRING) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalCIMIDSL.g:1202:5: (lv_submatch_6_0= ruleMatches )
                    	    {
                    	    // InternalCIMIDSL.g:1202:5: (lv_submatch_6_0= ruleMatches )
                    	    // InternalCIMIDSL.g:1203:6: lv_submatch_6_0= ruleMatches
                    	    {

                    	    						newCompositeNode(grammarAccess.getMatchesAccess().getSubmatchMatchesParserRuleCall_4_0_0());
                    	    					
                    	    pushFollow(FOLLOW_47);
                    	    lv_submatch_6_0=ruleMatches();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMatchesRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"submatch",
                    	    							lv_submatch_6_0,
                    	    							"gov.us.fhim.xtext.cimi.CIMIDSL.Matches");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalCIMIDSL.g:1221:4: ( ( (lv_value_7_0= RULE_MYSTRING ) )? otherlv_8= '[' ( (lv_valueDefinition_9_0= RULE_MYSTRING ) ) otherlv_10= ']' )
                    {
                    // InternalCIMIDSL.g:1221:4: ( ( (lv_value_7_0= RULE_MYSTRING ) )? otherlv_8= '[' ( (lv_valueDefinition_9_0= RULE_MYSTRING ) ) otherlv_10= ']' )
                    // InternalCIMIDSL.g:1222:5: ( (lv_value_7_0= RULE_MYSTRING ) )? otherlv_8= '[' ( (lv_valueDefinition_9_0= RULE_MYSTRING ) ) otherlv_10= ']'
                    {
                    // InternalCIMIDSL.g:1222:5: ( (lv_value_7_0= RULE_MYSTRING ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_MYSTRING) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalCIMIDSL.g:1223:6: (lv_value_7_0= RULE_MYSTRING )
                            {
                            // InternalCIMIDSL.g:1223:6: (lv_value_7_0= RULE_MYSTRING )
                            // InternalCIMIDSL.g:1224:7: lv_value_7_0= RULE_MYSTRING
                            {
                            lv_value_7_0=(Token)match(input,RULE_MYSTRING,FOLLOW_48); 

                            							newLeafNode(lv_value_7_0, grammarAccess.getMatchesAccess().getValueMYSTRINGTerminalRuleCall_4_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMatchesRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"value",
                            								lv_value_7_0,
                            								"gov.us.fhim.xtext.cimi.CIMIDSL.MYSTRING");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,48,FOLLOW_6); 

                    					newLeafNode(otherlv_8, grammarAccess.getMatchesAccess().getLeftSquareBracketKeyword_4_1_1());
                    				
                    // InternalCIMIDSL.g:1244:5: ( (lv_valueDefinition_9_0= RULE_MYSTRING ) )
                    // InternalCIMIDSL.g:1245:6: (lv_valueDefinition_9_0= RULE_MYSTRING )
                    {
                    // InternalCIMIDSL.g:1245:6: (lv_valueDefinition_9_0= RULE_MYSTRING )
                    // InternalCIMIDSL.g:1246:7: lv_valueDefinition_9_0= RULE_MYSTRING
                    {
                    lv_valueDefinition_9_0=(Token)match(input,RULE_MYSTRING,FOLLOW_43); 

                    							newLeafNode(lv_valueDefinition_9_0, grammarAccess.getMatchesAccess().getValueDefinitionMYSTRINGTerminalRuleCall_4_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getMatchesRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"valueDefinition",
                    								lv_valueDefinition_9_0,
                    								"gov.us.fhim.xtext.cimi.CIMIDSL.MYSTRING");
                    						

                    }


                    }

                    otherlv_10=(Token)match(input,49,FOLLOW_49); 

                    					newLeafNode(otherlv_10, grammarAccess.getMatchesAccess().getRightSquareBracketKeyword_4_1_3());
                    				

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,52,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getMatchesAccess().getRightCurlyBracketControl000dKeyword_5());
            		

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
    // $ANTLR end "ruleMatches"


    // $ANTLR start "entryRuleTerminology"
    // InternalCIMIDSL.g:1276:1: entryRuleTerminology returns [EObject current=null] : iv_ruleTerminology= ruleTerminology EOF ;
    public final EObject entryRuleTerminology() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminology = null;


        try {
            // InternalCIMIDSL.g:1276:52: (iv_ruleTerminology= ruleTerminology EOF )
            // InternalCIMIDSL.g:1277:2: iv_ruleTerminology= ruleTerminology EOF
            {
             newCompositeNode(grammarAccess.getTerminologyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerminology=ruleTerminology();

            state._fsp--;

             current =iv_ruleTerminology; 
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
    // $ANTLR end "entryRuleTerminology"


    // $ANTLR start "ruleTerminology"
    // InternalCIMIDSL.g:1283:1: ruleTerminology returns [EObject current=null] : (otherlv_0= 'term_definitions' otherlv_1= '=' otherlv_2= '<' otherlv_3= '\\r' ( (lv_termDefinition_4_0= ruleTermDefinitions ) ) otherlv_5= '\\r' otherlv_6= '>' otherlv_7= '\\r' otherlv_8= 'term_bindings' otherlv_9= '=' otherlv_10= '<' otherlv_11= '\\r' ( (lv_termBinding_12_0= ruleTermBindings ) ) otherlv_13= '\\r' otherlv_14= '>' otherlv_15= '\\r' ) ;
    public final EObject ruleTerminology() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_termDefinition_4_0 = null;

        EObject lv_termBinding_12_0 = null;



        	enterRule();

        try {
            // InternalCIMIDSL.g:1289:2: ( (otherlv_0= 'term_definitions' otherlv_1= '=' otherlv_2= '<' otherlv_3= '\\r' ( (lv_termDefinition_4_0= ruleTermDefinitions ) ) otherlv_5= '\\r' otherlv_6= '>' otherlv_7= '\\r' otherlv_8= 'term_bindings' otherlv_9= '=' otherlv_10= '<' otherlv_11= '\\r' ( (lv_termBinding_12_0= ruleTermBindings ) ) otherlv_13= '\\r' otherlv_14= '>' otherlv_15= '\\r' ) )
            // InternalCIMIDSL.g:1290:2: (otherlv_0= 'term_definitions' otherlv_1= '=' otherlv_2= '<' otherlv_3= '\\r' ( (lv_termDefinition_4_0= ruleTermDefinitions ) ) otherlv_5= '\\r' otherlv_6= '>' otherlv_7= '\\r' otherlv_8= 'term_bindings' otherlv_9= '=' otherlv_10= '<' otherlv_11= '\\r' ( (lv_termBinding_12_0= ruleTermBindings ) ) otherlv_13= '\\r' otherlv_14= '>' otherlv_15= '\\r' )
            {
            // InternalCIMIDSL.g:1290:2: (otherlv_0= 'term_definitions' otherlv_1= '=' otherlv_2= '<' otherlv_3= '\\r' ( (lv_termDefinition_4_0= ruleTermDefinitions ) ) otherlv_5= '\\r' otherlv_6= '>' otherlv_7= '\\r' otherlv_8= 'term_bindings' otherlv_9= '=' otherlv_10= '<' otherlv_11= '\\r' ( (lv_termBinding_12_0= ruleTermBindings ) ) otherlv_13= '\\r' otherlv_14= '>' otherlv_15= '\\r' )
            // InternalCIMIDSL.g:1291:3: otherlv_0= 'term_definitions' otherlv_1= '=' otherlv_2= '<' otherlv_3= '\\r' ( (lv_termDefinition_4_0= ruleTermDefinitions ) ) otherlv_5= '\\r' otherlv_6= '>' otherlv_7= '\\r' otherlv_8= 'term_bindings' otherlv_9= '=' otherlv_10= '<' otherlv_11= '\\r' ( (lv_termBinding_12_0= ruleTermBindings ) ) otherlv_13= '\\r' otherlv_14= '>' otherlv_15= '\\r'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getTerminologyAccess().getTerm_definitionsKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getTerminologyAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getTerminologyAccess().getLessThanSignKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_48); 

            			newLeafNode(otherlv_3, grammarAccess.getTerminologyAccess().getControl000dKeyword_3());
            		
            // InternalCIMIDSL.g:1307:3: ( (lv_termDefinition_4_0= ruleTermDefinitions ) )
            // InternalCIMIDSL.g:1308:4: (lv_termDefinition_4_0= ruleTermDefinitions )
            {
            // InternalCIMIDSL.g:1308:4: (lv_termDefinition_4_0= ruleTermDefinitions )
            // InternalCIMIDSL.g:1309:5: lv_termDefinition_4_0= ruleTermDefinitions
            {

            					newCompositeNode(grammarAccess.getTerminologyAccess().getTermDefinitionTermDefinitionsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_termDefinition_4_0=ruleTermDefinitions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTerminologyRule());
            					}
            					set(
            						current,
            						"termDefinition",
            						lv_termDefinition_4_0,
            						"gov.us.fhim.xtext.cimi.CIMIDSL.TermDefinitions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getTerminologyAccess().getControl000dKeyword_5());
            		
            otherlv_6=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getTerminologyAccess().getGreaterThanSignKeyword_6());
            		
            otherlv_7=(Token)match(input,19,FOLLOW_50); 

            			newLeafNode(otherlv_7, grammarAccess.getTerminologyAccess().getControl000dKeyword_7());
            		
            otherlv_8=(Token)match(input,54,FOLLOW_19); 

            			newLeafNode(otherlv_8, grammarAccess.getTerminologyAccess().getTerm_bindingsKeyword_8());
            		
            otherlv_9=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_9, grammarAccess.getTerminologyAccess().getEqualsSignKeyword_9());
            		
            otherlv_10=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getTerminologyAccess().getLessThanSignKeyword_10());
            		
            otherlv_11=(Token)match(input,19,FOLLOW_48); 

            			newLeafNode(otherlv_11, grammarAccess.getTerminologyAccess().getControl000dKeyword_11());
            		
            // InternalCIMIDSL.g:1354:3: ( (lv_termBinding_12_0= ruleTermBindings ) )
            // InternalCIMIDSL.g:1355:4: (lv_termBinding_12_0= ruleTermBindings )
            {
            // InternalCIMIDSL.g:1355:4: (lv_termBinding_12_0= ruleTermBindings )
            // InternalCIMIDSL.g:1356:5: lv_termBinding_12_0= ruleTermBindings
            {

            					newCompositeNode(grammarAccess.getTerminologyAccess().getTermBindingTermBindingsParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_11);
            lv_termBinding_12_0=ruleTermBindings();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTerminologyRule());
            					}
            					set(
            						current,
            						"termBinding",
            						lv_termBinding_12_0,
            						"gov.us.fhim.xtext.cimi.CIMIDSL.TermBindings");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_13, grammarAccess.getTerminologyAccess().getControl000dKeyword_13());
            		
            otherlv_14=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_14, grammarAccess.getTerminologyAccess().getGreaterThanSignKeyword_14());
            		
            otherlv_15=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getTerminologyAccess().getControl000dKeyword_15());
            		

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
    // $ANTLR end "ruleTerminology"


    // $ANTLR start "entryRuleTermDefinitions"
    // InternalCIMIDSL.g:1389:1: entryRuleTermDefinitions returns [EObject current=null] : iv_ruleTermDefinitions= ruleTermDefinitions EOF ;
    public final EObject entryRuleTermDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermDefinitions = null;


        try {
            // InternalCIMIDSL.g:1389:56: (iv_ruleTermDefinitions= ruleTermDefinitions EOF )
            // InternalCIMIDSL.g:1390:2: iv_ruleTermDefinitions= ruleTermDefinitions EOF
            {
             newCompositeNode(grammarAccess.getTermDefinitionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTermDefinitions=ruleTermDefinitions();

            state._fsp--;

             current =iv_ruleTermDefinitions; 
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
    // $ANTLR end "entryRuleTermDefinitions"


    // $ANTLR start "ruleTermDefinitions"
    // InternalCIMIDSL.g:1396:1: ruleTermDefinitions returns [EObject current=null] : (otherlv_0= '[' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ']' otherlv_3= '=' otherlv_4= '\\r' otherlv_5= '<' otherlv_6= '\\r' ( (lv_elements_7_0= ruleTermDefinition ) )* otherlv_8= '\\r' otherlv_9= '>' otherlv_10= '\\r' ) ;
    public final EObject ruleTermDefinitions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalCIMIDSL.g:1402:2: ( (otherlv_0= '[' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ']' otherlv_3= '=' otherlv_4= '\\r' otherlv_5= '<' otherlv_6= '\\r' ( (lv_elements_7_0= ruleTermDefinition ) )* otherlv_8= '\\r' otherlv_9= '>' otherlv_10= '\\r' ) )
            // InternalCIMIDSL.g:1403:2: (otherlv_0= '[' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ']' otherlv_3= '=' otherlv_4= '\\r' otherlv_5= '<' otherlv_6= '\\r' ( (lv_elements_7_0= ruleTermDefinition ) )* otherlv_8= '\\r' otherlv_9= '>' otherlv_10= '\\r' )
            {
            // InternalCIMIDSL.g:1403:2: (otherlv_0= '[' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ']' otherlv_3= '=' otherlv_4= '\\r' otherlv_5= '<' otherlv_6= '\\r' ( (lv_elements_7_0= ruleTermDefinition ) )* otherlv_8= '\\r' otherlv_9= '>' otherlv_10= '\\r' )
            // InternalCIMIDSL.g:1404:3: otherlv_0= '[' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ']' otherlv_3= '=' otherlv_4= '\\r' otherlv_5= '<' otherlv_6= '\\r' ( (lv_elements_7_0= ruleTermDefinition ) )* otherlv_8= '\\r' otherlv_9= '>' otherlv_10= '\\r'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getTermDefinitionsAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalCIMIDSL.g:1408:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalCIMIDSL.g:1409:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalCIMIDSL.g:1409:4: (lv_name_1_0= RULE_STRING )
            // InternalCIMIDSL.g:1410:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTermDefinitionsAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTermDefinitionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,49,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getTermDefinitionsAccess().getRightSquareBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getTermDefinitionsAccess().getEqualsSignKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getTermDefinitionsAccess().getControl000dKeyword_4());
            		
            otherlv_5=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getTermDefinitionsAccess().getLessThanSignKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_51); 

            			newLeafNode(otherlv_6, grammarAccess.getTermDefinitionsAccess().getControl000dKeyword_6());
            		
            // InternalCIMIDSL.g:1446:3: ( (lv_elements_7_0= ruleTermDefinition ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==48) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCIMIDSL.g:1447:4: (lv_elements_7_0= ruleTermDefinition )
            	    {
            	    // InternalCIMIDSL.g:1447:4: (lv_elements_7_0= ruleTermDefinition )
            	    // InternalCIMIDSL.g:1448:5: lv_elements_7_0= ruleTermDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getTermDefinitionsAccess().getElementsTermDefinitionParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_51);
            	    lv_elements_7_0=ruleTermDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTermDefinitionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_7_0,
            	    						"gov.us.fhim.xtext.cimi.CIMIDSL.TermDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_8, grammarAccess.getTermDefinitionsAccess().getControl000dKeyword_8());
            		
            otherlv_9=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getTermDefinitionsAccess().getGreaterThanSignKeyword_9());
            		
            otherlv_10=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getTermDefinitionsAccess().getControl000dKeyword_10());
            		

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
    // $ANTLR end "ruleTermDefinitions"


    // $ANTLR start "entryRuleTermBindings"
    // InternalCIMIDSL.g:1481:1: entryRuleTermBindings returns [EObject current=null] : iv_ruleTermBindings= ruleTermBindings EOF ;
    public final EObject entryRuleTermBindings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermBindings = null;


        try {
            // InternalCIMIDSL.g:1481:53: (iv_ruleTermBindings= ruleTermBindings EOF )
            // InternalCIMIDSL.g:1482:2: iv_ruleTermBindings= ruleTermBindings EOF
            {
             newCompositeNode(grammarAccess.getTermBindingsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTermBindings=ruleTermBindings();

            state._fsp--;

             current =iv_ruleTermBindings; 
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
    // $ANTLR end "entryRuleTermBindings"


    // $ANTLR start "ruleTermBindings"
    // InternalCIMIDSL.g:1488:1: ruleTermBindings returns [EObject current=null] : (otherlv_0= '[' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ']' otherlv_3= '=' otherlv_4= '\\r' otherlv_5= '<' otherlv_6= '\\r' ( (lv_elements_7_0= ruleTermBinding ) )* otherlv_8= '\\r' otherlv_9= '>' otherlv_10= '\\r' ) ;
    public final EObject ruleTermBindings() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalCIMIDSL.g:1494:2: ( (otherlv_0= '[' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ']' otherlv_3= '=' otherlv_4= '\\r' otherlv_5= '<' otherlv_6= '\\r' ( (lv_elements_7_0= ruleTermBinding ) )* otherlv_8= '\\r' otherlv_9= '>' otherlv_10= '\\r' ) )
            // InternalCIMIDSL.g:1495:2: (otherlv_0= '[' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ']' otherlv_3= '=' otherlv_4= '\\r' otherlv_5= '<' otherlv_6= '\\r' ( (lv_elements_7_0= ruleTermBinding ) )* otherlv_8= '\\r' otherlv_9= '>' otherlv_10= '\\r' )
            {
            // InternalCIMIDSL.g:1495:2: (otherlv_0= '[' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ']' otherlv_3= '=' otherlv_4= '\\r' otherlv_5= '<' otherlv_6= '\\r' ( (lv_elements_7_0= ruleTermBinding ) )* otherlv_8= '\\r' otherlv_9= '>' otherlv_10= '\\r' )
            // InternalCIMIDSL.g:1496:3: otherlv_0= '[' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ']' otherlv_3= '=' otherlv_4= '\\r' otherlv_5= '<' otherlv_6= '\\r' ( (lv_elements_7_0= ruleTermBinding ) )* otherlv_8= '\\r' otherlv_9= '>' otherlv_10= '\\r'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getTermBindingsAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalCIMIDSL.g:1500:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalCIMIDSL.g:1501:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalCIMIDSL.g:1501:4: (lv_name_1_0= RULE_STRING )
            // InternalCIMIDSL.g:1502:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTermBindingsAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTermBindingsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,49,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getTermBindingsAccess().getRightSquareBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getTermBindingsAccess().getEqualsSignKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getTermBindingsAccess().getControl000dKeyword_4());
            		
            otherlv_5=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getTermBindingsAccess().getLessThanSignKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_51); 

            			newLeafNode(otherlv_6, grammarAccess.getTermBindingsAccess().getControl000dKeyword_6());
            		
            // InternalCIMIDSL.g:1538:3: ( (lv_elements_7_0= ruleTermBinding ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==48) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCIMIDSL.g:1539:4: (lv_elements_7_0= ruleTermBinding )
            	    {
            	    // InternalCIMIDSL.g:1539:4: (lv_elements_7_0= ruleTermBinding )
            	    // InternalCIMIDSL.g:1540:5: lv_elements_7_0= ruleTermBinding
            	    {

            	    					newCompositeNode(grammarAccess.getTermBindingsAccess().getElementsTermBindingParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_51);
            	    lv_elements_7_0=ruleTermBinding();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTermBindingsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_7_0,
            	    						"gov.us.fhim.xtext.cimi.CIMIDSL.TermBinding");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_8=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_8, grammarAccess.getTermBindingsAccess().getControl000dKeyword_8());
            		
            otherlv_9=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getTermBindingsAccess().getGreaterThanSignKeyword_9());
            		
            otherlv_10=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getTermBindingsAccess().getControl000dKeyword_10());
            		

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
    // $ANTLR end "ruleTermBindings"


    // $ANTLR start "entryRuleTermDefinition"
    // InternalCIMIDSL.g:1573:1: entryRuleTermDefinition returns [EObject current=null] : iv_ruleTermDefinition= ruleTermDefinition EOF ;
    public final EObject entryRuleTermDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermDefinition = null;


        try {
            // InternalCIMIDSL.g:1573:55: (iv_ruleTermDefinition= ruleTermDefinition EOF )
            // InternalCIMIDSL.g:1574:2: iv_ruleTermDefinition= ruleTermDefinition EOF
            {
             newCompositeNode(grammarAccess.getTermDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTermDefinition=ruleTermDefinition();

            state._fsp--;

             current =iv_ruleTermDefinition; 
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
    // $ANTLR end "entryRuleTermDefinition"


    // $ANTLR start "ruleTermDefinition"
    // InternalCIMIDSL.g:1580:1: ruleTermDefinition returns [EObject current=null] : (otherlv_0= '[' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ']' otherlv_3= '=' otherlv_4= '<' otherlv_5= '\\r' otherlv_6= 'text' otherlv_7= '=' otherlv_8= '<' ( (lv_text_9_0= RULE_MYSTRING ) ) otherlv_10= '>' otherlv_11= '\\r' otherlv_12= 'description' otherlv_13= '=' otherlv_14= '<' ( (lv_description_15_0= RULE_MYSTRING ) ) otherlv_16= '>' otherlv_17= '\\r' otherlv_18= '>' otherlv_19= '\\r' ) ;
    public final EObject ruleTermDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_text_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_description_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;


        	enterRule();

        try {
            // InternalCIMIDSL.g:1586:2: ( (otherlv_0= '[' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ']' otherlv_3= '=' otherlv_4= '<' otherlv_5= '\\r' otherlv_6= 'text' otherlv_7= '=' otherlv_8= '<' ( (lv_text_9_0= RULE_MYSTRING ) ) otherlv_10= '>' otherlv_11= '\\r' otherlv_12= 'description' otherlv_13= '=' otherlv_14= '<' ( (lv_description_15_0= RULE_MYSTRING ) ) otherlv_16= '>' otherlv_17= '\\r' otherlv_18= '>' otherlv_19= '\\r' ) )
            // InternalCIMIDSL.g:1587:2: (otherlv_0= '[' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ']' otherlv_3= '=' otherlv_4= '<' otherlv_5= '\\r' otherlv_6= 'text' otherlv_7= '=' otherlv_8= '<' ( (lv_text_9_0= RULE_MYSTRING ) ) otherlv_10= '>' otherlv_11= '\\r' otherlv_12= 'description' otherlv_13= '=' otherlv_14= '<' ( (lv_description_15_0= RULE_MYSTRING ) ) otherlv_16= '>' otherlv_17= '\\r' otherlv_18= '>' otherlv_19= '\\r' )
            {
            // InternalCIMIDSL.g:1587:2: (otherlv_0= '[' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ']' otherlv_3= '=' otherlv_4= '<' otherlv_5= '\\r' otherlv_6= 'text' otherlv_7= '=' otherlv_8= '<' ( (lv_text_9_0= RULE_MYSTRING ) ) otherlv_10= '>' otherlv_11= '\\r' otherlv_12= 'description' otherlv_13= '=' otherlv_14= '<' ( (lv_description_15_0= RULE_MYSTRING ) ) otherlv_16= '>' otherlv_17= '\\r' otherlv_18= '>' otherlv_19= '\\r' )
            // InternalCIMIDSL.g:1588:3: otherlv_0= '[' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ']' otherlv_3= '=' otherlv_4= '<' otherlv_5= '\\r' otherlv_6= 'text' otherlv_7= '=' otherlv_8= '<' ( (lv_text_9_0= RULE_MYSTRING ) ) otherlv_10= '>' otherlv_11= '\\r' otherlv_12= 'description' otherlv_13= '=' otherlv_14= '<' ( (lv_description_15_0= RULE_MYSTRING ) ) otherlv_16= '>' otherlv_17= '\\r' otherlv_18= '>' otherlv_19= '\\r'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getTermDefinitionAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalCIMIDSL.g:1592:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalCIMIDSL.g:1593:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalCIMIDSL.g:1593:4: (lv_name_1_0= RULE_STRING )
            // InternalCIMIDSL.g:1594:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTermDefinitionAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTermDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,49,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getTermDefinitionAccess().getRightSquareBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getTermDefinitionAccess().getEqualsSignKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getTermDefinitionAccess().getLessThanSignKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_52); 

            			newLeafNode(otherlv_5, grammarAccess.getTermDefinitionAccess().getControl000dKeyword_5());
            		
            otherlv_6=(Token)match(input,55,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getTermDefinitionAccess().getTextKeyword_6());
            		
            otherlv_7=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getTermDefinitionAccess().getEqualsSignKeyword_7());
            		
            otherlv_8=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getTermDefinitionAccess().getLessThanSignKeyword_8());
            		
            // InternalCIMIDSL.g:1638:3: ( (lv_text_9_0= RULE_MYSTRING ) )
            // InternalCIMIDSL.g:1639:4: (lv_text_9_0= RULE_MYSTRING )
            {
            // InternalCIMIDSL.g:1639:4: (lv_text_9_0= RULE_MYSTRING )
            // InternalCIMIDSL.g:1640:5: lv_text_9_0= RULE_MYSTRING
            {
            lv_text_9_0=(Token)match(input,RULE_MYSTRING,FOLLOW_22); 

            					newLeafNode(lv_text_9_0, grammarAccess.getTermDefinitionAccess().getTextMYSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTermDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_9_0,
            						"gov.us.fhim.xtext.cimi.CIMIDSL.MYSTRING");
            				

            }


            }

            otherlv_10=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getTermDefinitionAccess().getGreaterThanSignKeyword_10());
            		
            otherlv_11=(Token)match(input,19,FOLLOW_53); 

            			newLeafNode(otherlv_11, grammarAccess.getTermDefinitionAccess().getControl000dKeyword_11());
            		
            otherlv_12=(Token)match(input,56,FOLLOW_19); 

            			newLeafNode(otherlv_12, grammarAccess.getTermDefinitionAccess().getDescriptionKeyword_12());
            		
            otherlv_13=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_13, grammarAccess.getTermDefinitionAccess().getEqualsSignKeyword_13());
            		
            otherlv_14=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_14, grammarAccess.getTermDefinitionAccess().getLessThanSignKeyword_14());
            		
            // InternalCIMIDSL.g:1676:3: ( (lv_description_15_0= RULE_MYSTRING ) )
            // InternalCIMIDSL.g:1677:4: (lv_description_15_0= RULE_MYSTRING )
            {
            // InternalCIMIDSL.g:1677:4: (lv_description_15_0= RULE_MYSTRING )
            // InternalCIMIDSL.g:1678:5: lv_description_15_0= RULE_MYSTRING
            {
            lv_description_15_0=(Token)match(input,RULE_MYSTRING,FOLLOW_22); 

            					newLeafNode(lv_description_15_0, grammarAccess.getTermDefinitionAccess().getDescriptionMYSTRINGTerminalRuleCall_15_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTermDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_15_0,
            						"gov.us.fhim.xtext.cimi.CIMIDSL.MYSTRING");
            				

            }


            }

            otherlv_16=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_16, grammarAccess.getTermDefinitionAccess().getGreaterThanSignKeyword_16());
            		
            otherlv_17=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_17, grammarAccess.getTermDefinitionAccess().getControl000dKeyword_17());
            		
            otherlv_18=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_18, grammarAccess.getTermDefinitionAccess().getGreaterThanSignKeyword_18());
            		
            otherlv_19=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getTermDefinitionAccess().getControl000dKeyword_19());
            		

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
    // $ANTLR end "ruleTermDefinition"


    // $ANTLR start "entryRuleTermBinding"
    // InternalCIMIDSL.g:1714:1: entryRuleTermBinding returns [EObject current=null] : iv_ruleTermBinding= ruleTermBinding EOF ;
    public final EObject entryRuleTermBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermBinding = null;


        try {
            // InternalCIMIDSL.g:1714:52: (iv_ruleTermBinding= ruleTermBinding EOF )
            // InternalCIMIDSL.g:1715:2: iv_ruleTermBinding= ruleTermBinding EOF
            {
             newCompositeNode(grammarAccess.getTermBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTermBinding=ruleTermBinding();

            state._fsp--;

             current =iv_ruleTermBinding; 
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
    // $ANTLR end "entryRuleTermBinding"


    // $ANTLR start "ruleTermBinding"
    // InternalCIMIDSL.g:1721:1: ruleTermBinding returns [EObject current=null] : (otherlv_0= '[' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ']' otherlv_3= '=' otherlv_4= '<' ( (lv_binding_5_0= RULE_MYSTRING ) ) otherlv_6= '>' otherlv_7= '\\r' ) ;
    public final EObject ruleTermBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_binding_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalCIMIDSL.g:1727:2: ( (otherlv_0= '[' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ']' otherlv_3= '=' otherlv_4= '<' ( (lv_binding_5_0= RULE_MYSTRING ) ) otherlv_6= '>' otherlv_7= '\\r' ) )
            // InternalCIMIDSL.g:1728:2: (otherlv_0= '[' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ']' otherlv_3= '=' otherlv_4= '<' ( (lv_binding_5_0= RULE_MYSTRING ) ) otherlv_6= '>' otherlv_7= '\\r' )
            {
            // InternalCIMIDSL.g:1728:2: (otherlv_0= '[' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ']' otherlv_3= '=' otherlv_4= '<' ( (lv_binding_5_0= RULE_MYSTRING ) ) otherlv_6= '>' otherlv_7= '\\r' )
            // InternalCIMIDSL.g:1729:3: otherlv_0= '[' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ']' otherlv_3= '=' otherlv_4= '<' ( (lv_binding_5_0= RULE_MYSTRING ) ) otherlv_6= '>' otherlv_7= '\\r'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getTermBindingAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalCIMIDSL.g:1733:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalCIMIDSL.g:1734:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalCIMIDSL.g:1734:4: (lv_name_1_0= RULE_STRING )
            // InternalCIMIDSL.g:1735:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTermBindingAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTermBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,49,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getTermBindingAccess().getRightSquareBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getTermBindingAccess().getEqualsSignKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getTermBindingAccess().getLessThanSignKeyword_4());
            		
            // InternalCIMIDSL.g:1763:3: ( (lv_binding_5_0= RULE_MYSTRING ) )
            // InternalCIMIDSL.g:1764:4: (lv_binding_5_0= RULE_MYSTRING )
            {
            // InternalCIMIDSL.g:1764:4: (lv_binding_5_0= RULE_MYSTRING )
            // InternalCIMIDSL.g:1765:5: lv_binding_5_0= RULE_MYSTRING
            {
            lv_binding_5_0=(Token)match(input,RULE_MYSTRING,FOLLOW_22); 

            					newLeafNode(lv_binding_5_0, grammarAccess.getTermBindingAccess().getBindingMYSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTermBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"binding",
            						lv_binding_5_0,
            						"gov.us.fhim.xtext.cimi.CIMIDSL.MYSTRING");
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getTermBindingAccess().getGreaterThanSignKeyword_6());
            		
            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTermBindingAccess().getControl000dKeyword_7());
            		

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
    // $ANTLR end "ruleTermBinding"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0011000000000010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001000000080000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0100000000000000L});

}