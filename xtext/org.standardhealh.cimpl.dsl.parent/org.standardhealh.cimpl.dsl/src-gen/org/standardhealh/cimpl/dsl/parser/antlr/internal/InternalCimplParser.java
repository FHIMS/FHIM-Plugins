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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Grammar:'", "'DataElement'", "'\\r\\n'", "'Namespace:'", "'\\r'", "'Uses:'", "','", "'EntryElement'", "'Based On:'", "'Concept:'", "'Description:'", "'\\t'", "'Value:'", "'..'"
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

        public InternalCimplParser(TokenStream input, CimplGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected CimplGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalCimpl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalCimpl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalCimpl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalCimpl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleDoc ) )? ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalCimpl.g:77:2: ( ( (lv_elements_0_0= ruleDoc ) )? )
            // InternalCimpl.g:78:2: ( (lv_elements_0_0= ruleDoc ) )?
            {
            // InternalCimpl.g:78:2: ( (lv_elements_0_0= ruleDoc ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCimpl.g:79:3: (lv_elements_0_0= ruleDoc )
                    {
                    // InternalCimpl.g:79:3: (lv_elements_0_0= ruleDoc )
                    // InternalCimpl.g:80:4: lv_elements_0_0= ruleDoc
                    {

                    				newCompositeNode(grammarAccess.getModelAccess().getElementsDocParserRuleCall_0());
                    			
                    pushFollow(FOLLOW_2);
                    lv_elements_0_0=ruleDoc();

                    state._fsp--;


                    				if (current==null) {
                    					current = createModelElementForParent(grammarAccess.getModelRule());
                    				}
                    				set(
                    					current,
                    					"elements",
                    					lv_elements_0_0,
                    					"org.standardhealh.cimpl.dsl.Cimpl.Doc");
                    				afterParserOrEnumRuleCall();
                    			

                    }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDoc"
    // InternalCimpl.g:100:1: entryRuleDoc returns [EObject current=null] : iv_ruleDoc= ruleDoc EOF ;
    public final EObject entryRuleDoc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoc = null;


        try {
            // InternalCimpl.g:100:44: (iv_ruleDoc= ruleDoc EOF )
            // InternalCimpl.g:101:2: iv_ruleDoc= ruleDoc EOF
            {
             newCompositeNode(grammarAccess.getDocRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoc=ruleDoc();

            state._fsp--;

             current =iv_ruleDoc; 
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
    // $ANTLR end "entryRuleDoc"


    // $ANTLR start "ruleDoc"
    // InternalCimpl.g:107:1: ruleDoc returns [EObject current=null] : ( ( (lv_header_0_0= ruleDocHeader ) ) ( (lv_uses_1_0= ruleUsesStatement ) ) ( (lv_entries_2_0= ruleEntryElement ) )* ) ;
    public final EObject ruleDoc() throws RecognitionException {
        EObject current = null;

        EObject lv_header_0_0 = null;

        EObject lv_uses_1_0 = null;

        EObject lv_entries_2_0 = null;



        	enterRule();

        try {
            // InternalCimpl.g:113:2: ( ( ( (lv_header_0_0= ruleDocHeader ) ) ( (lv_uses_1_0= ruleUsesStatement ) ) ( (lv_entries_2_0= ruleEntryElement ) )* ) )
            // InternalCimpl.g:114:2: ( ( (lv_header_0_0= ruleDocHeader ) ) ( (lv_uses_1_0= ruleUsesStatement ) ) ( (lv_entries_2_0= ruleEntryElement ) )* )
            {
            // InternalCimpl.g:114:2: ( ( (lv_header_0_0= ruleDocHeader ) ) ( (lv_uses_1_0= ruleUsesStatement ) ) ( (lv_entries_2_0= ruleEntryElement ) )* )
            // InternalCimpl.g:115:3: ( (lv_header_0_0= ruleDocHeader ) ) ( (lv_uses_1_0= ruleUsesStatement ) ) ( (lv_entries_2_0= ruleEntryElement ) )*
            {
            // InternalCimpl.g:115:3: ( (lv_header_0_0= ruleDocHeader ) )
            // InternalCimpl.g:116:4: (lv_header_0_0= ruleDocHeader )
            {
            // InternalCimpl.g:116:4: (lv_header_0_0= ruleDocHeader )
            // InternalCimpl.g:117:5: lv_header_0_0= ruleDocHeader
            {

            					newCompositeNode(grammarAccess.getDocAccess().getHeaderDocHeaderParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_header_0_0=ruleDocHeader();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDocRule());
            					}
            					set(
            						current,
            						"header",
            						lv_header_0_0,
            						"org.standardhealh.cimpl.dsl.Cimpl.DocHeader");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCimpl.g:134:3: ( (lv_uses_1_0= ruleUsesStatement ) )
            // InternalCimpl.g:135:4: (lv_uses_1_0= ruleUsesStatement )
            {
            // InternalCimpl.g:135:4: (lv_uses_1_0= ruleUsesStatement )
            // InternalCimpl.g:136:5: lv_uses_1_0= ruleUsesStatement
            {

            					newCompositeNode(grammarAccess.getDocAccess().getUsesUsesStatementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_uses_1_0=ruleUsesStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDocRule());
            					}
            					set(
            						current,
            						"uses",
            						lv_uses_1_0,
            						"org.standardhealh.cimpl.dsl.Cimpl.UsesStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCimpl.g:153:3: ( (lv_entries_2_0= ruleEntryElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCimpl.g:154:4: (lv_entries_2_0= ruleEntryElement )
            	    {
            	    // InternalCimpl.g:154:4: (lv_entries_2_0= ruleEntryElement )
            	    // InternalCimpl.g:155:5: lv_entries_2_0= ruleEntryElement
            	    {

            	    					newCompositeNode(grammarAccess.getDocAccess().getEntriesEntryElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_entries_2_0=ruleEntryElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDocRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entries",
            	    						lv_entries_2_0,
            	    						"org.standardhealh.cimpl.dsl.Cimpl.EntryElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleDoc"


    // $ANTLR start "entryRuleDocHeader"
    // InternalCimpl.g:176:1: entryRuleDocHeader returns [EObject current=null] : iv_ruleDocHeader= ruleDocHeader EOF ;
    public final EObject entryRuleDocHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocHeader = null;


        try {
            // InternalCimpl.g:176:50: (iv_ruleDocHeader= ruleDocHeader EOF )
            // InternalCimpl.g:177:2: iv_ruleDocHeader= ruleDocHeader EOF
            {
             newCompositeNode(grammarAccess.getDocHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocHeader=ruleDocHeader();

            state._fsp--;

             current =iv_ruleDocHeader; 
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
    // $ANTLR end "entryRuleDocHeader"


    // $ANTLR start "ruleDocHeader"
    // InternalCimpl.g:183:1: ruleDocHeader returns [EObject current=null] : (otherlv_0= 'Grammar:' otherlv_1= 'DataElement' ( (lv_version_2_0= RULE_STRING ) ) otherlv_3= '\\r\\n' otherlv_4= 'Namespace:' ( (lv_namespace_5_0= RULE_STRING ) ) otherlv_6= '\\r' otherlv_7= '\\r' ) ;
    public final EObject ruleDocHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_version_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_namespace_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalCimpl.g:189:2: ( (otherlv_0= 'Grammar:' otherlv_1= 'DataElement' ( (lv_version_2_0= RULE_STRING ) ) otherlv_3= '\\r\\n' otherlv_4= 'Namespace:' ( (lv_namespace_5_0= RULE_STRING ) ) otherlv_6= '\\r' otherlv_7= '\\r' ) )
            // InternalCimpl.g:190:2: (otherlv_0= 'Grammar:' otherlv_1= 'DataElement' ( (lv_version_2_0= RULE_STRING ) ) otherlv_3= '\\r\\n' otherlv_4= 'Namespace:' ( (lv_namespace_5_0= RULE_STRING ) ) otherlv_6= '\\r' otherlv_7= '\\r' )
            {
            // InternalCimpl.g:190:2: (otherlv_0= 'Grammar:' otherlv_1= 'DataElement' ( (lv_version_2_0= RULE_STRING ) ) otherlv_3= '\\r\\n' otherlv_4= 'Namespace:' ( (lv_namespace_5_0= RULE_STRING ) ) otherlv_6= '\\r' otherlv_7= '\\r' )
            // InternalCimpl.g:191:3: otherlv_0= 'Grammar:' otherlv_1= 'DataElement' ( (lv_version_2_0= RULE_STRING ) ) otherlv_3= '\\r\\n' otherlv_4= 'Namespace:' ( (lv_namespace_5_0= RULE_STRING ) ) otherlv_6= '\\r' otherlv_7= '\\r'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDocHeaderAccess().getGrammarKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDocHeaderAccess().getDataElementKeyword_1());
            		
            // InternalCimpl.g:199:3: ( (lv_version_2_0= RULE_STRING ) )
            // InternalCimpl.g:200:4: (lv_version_2_0= RULE_STRING )
            {
            // InternalCimpl.g:200:4: (lv_version_2_0= RULE_STRING )
            // InternalCimpl.g:201:5: lv_version_2_0= RULE_STRING
            {
            lv_version_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_version_2_0, grammarAccess.getDocHeaderAccess().getVersionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDocHeaderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"version",
            						lv_version_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getDocHeaderAccess().getControl000dControl000aKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getDocHeaderAccess().getNamespaceKeyword_4());
            		
            // InternalCimpl.g:225:3: ( (lv_namespace_5_0= RULE_STRING ) )
            // InternalCimpl.g:226:4: (lv_namespace_5_0= RULE_STRING )
            {
            // InternalCimpl.g:226:4: (lv_namespace_5_0= RULE_STRING )
            // InternalCimpl.g:227:5: lv_namespace_5_0= RULE_STRING
            {
            lv_namespace_5_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_namespace_5_0, grammarAccess.getDocHeaderAccess().getNamespaceSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDocHeaderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"namespace",
            						lv_namespace_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getDocHeaderAccess().getControl000dKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDocHeaderAccess().getControl000dKeyword_7());
            		

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
    // $ANTLR end "ruleDocHeader"


    // $ANTLR start "entryRuleUsesStatement"
    // InternalCimpl.g:255:1: entryRuleUsesStatement returns [EObject current=null] : iv_ruleUsesStatement= ruleUsesStatement EOF ;
    public final EObject entryRuleUsesStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsesStatement = null;


        try {
            // InternalCimpl.g:255:54: (iv_ruleUsesStatement= ruleUsesStatement EOF )
            // InternalCimpl.g:256:2: iv_ruleUsesStatement= ruleUsesStatement EOF
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
    // InternalCimpl.g:262:1: ruleUsesStatement returns [EObject current=null] : (otherlv_0= 'Uses:' ( (lv_namespace_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_namespace_3_0= RULE_STRING ) ) )* otherlv_4= '\\r' otherlv_5= '\\r' ) ;
    public final EObject ruleUsesStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_namespace_1_0=null;
        Token otherlv_2=null;
        Token lv_namespace_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalCimpl.g:268:2: ( (otherlv_0= 'Uses:' ( (lv_namespace_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_namespace_3_0= RULE_STRING ) ) )* otherlv_4= '\\r' otherlv_5= '\\r' ) )
            // InternalCimpl.g:269:2: (otherlv_0= 'Uses:' ( (lv_namespace_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_namespace_3_0= RULE_STRING ) ) )* otherlv_4= '\\r' otherlv_5= '\\r' )
            {
            // InternalCimpl.g:269:2: (otherlv_0= 'Uses:' ( (lv_namespace_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_namespace_3_0= RULE_STRING ) ) )* otherlv_4= '\\r' otherlv_5= '\\r' )
            // InternalCimpl.g:270:3: otherlv_0= 'Uses:' ( (lv_namespace_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_namespace_3_0= RULE_STRING ) ) )* otherlv_4= '\\r' otherlv_5= '\\r'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getUsesStatementAccess().getUsesKeyword_0());
            		
            // InternalCimpl.g:274:3: ( (lv_namespace_1_0= RULE_STRING ) )
            // InternalCimpl.g:275:4: (lv_namespace_1_0= RULE_STRING )
            {
            // InternalCimpl.g:275:4: (lv_namespace_1_0= RULE_STRING )
            // InternalCimpl.g:276:5: lv_namespace_1_0= RULE_STRING
            {
            lv_namespace_1_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_namespace_1_0, grammarAccess.getUsesStatementAccess().getNamespaceSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUsesStatementRule());
            					}
            					addWithLastConsumed(
            						current,
            						"namespace",
            						lv_namespace_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalCimpl.g:292:3: (otherlv_2= ',' ( (lv_namespace_3_0= RULE_STRING ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCimpl.g:293:4: otherlv_2= ',' ( (lv_namespace_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getUsesStatementAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalCimpl.g:297:4: ( (lv_namespace_3_0= RULE_STRING ) )
            	    // InternalCimpl.g:298:5: (lv_namespace_3_0= RULE_STRING )
            	    {
            	    // InternalCimpl.g:298:5: (lv_namespace_3_0= RULE_STRING )
            	    // InternalCimpl.g:299:6: lv_namespace_3_0= RULE_STRING
            	    {
            	    lv_namespace_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    						newLeafNode(lv_namespace_3_0, grammarAccess.getUsesStatementAccess().getNamespaceSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getUsesStatementRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"namespace",
            	    							lv_namespace_3_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getUsesStatementAccess().getControl000dKeyword_3());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getUsesStatementAccess().getControl000dKeyword_4());
            		

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


    // $ANTLR start "entryRuleEntryElement"
    // InternalCimpl.g:328:1: entryRuleEntryElement returns [EObject current=null] : iv_ruleEntryElement= ruleEntryElement EOF ;
    public final EObject entryRuleEntryElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryElement = null;


        try {
            // InternalCimpl.g:328:53: (iv_ruleEntryElement= ruleEntryElement EOF )
            // InternalCimpl.g:329:2: iv_ruleEntryElement= ruleEntryElement EOF
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
    // InternalCimpl.g:335:1: ruleEntryElement returns [EObject current=null] : (otherlv_0= 'EntryElement' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '\\r\\n' otherlv_3= 'Based On:' ( (lv_basedOn_4_0= RULE_STRING ) ) otherlv_5= '\\r\\n' otherlv_6= 'Concept:' ( (lv_concept_7_0= RULE_STRING ) ) otherlv_8= '\\r\\n' otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= '\\r\\n' ( (lv_elements_12_0= ruleElement ) )? (otherlv_13= '\\r\\n' ( (lv_elements_14_0= ruleElement ) ) )* otherlv_15= '\\r\\n' (otherlv_16= '\\t' ( (lv_subelements_17_0= ruleEntryElement ) ) )* otherlv_18= 'Value:' ( (lv_value_19_0= RULE_STRING ) )? otherlv_20= '\\r\\n' ) ;
    public final EObject ruleEntryElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_basedOn_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_concept_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_description_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token lv_value_19_0=null;
        Token otherlv_20=null;
        EObject lv_elements_12_0 = null;

        EObject lv_elements_14_0 = null;

        EObject lv_subelements_17_0 = null;



        	enterRule();

        try {
            // InternalCimpl.g:341:2: ( (otherlv_0= 'EntryElement' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '\\r\\n' otherlv_3= 'Based On:' ( (lv_basedOn_4_0= RULE_STRING ) ) otherlv_5= '\\r\\n' otherlv_6= 'Concept:' ( (lv_concept_7_0= RULE_STRING ) ) otherlv_8= '\\r\\n' otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= '\\r\\n' ( (lv_elements_12_0= ruleElement ) )? (otherlv_13= '\\r\\n' ( (lv_elements_14_0= ruleElement ) ) )* otherlv_15= '\\r\\n' (otherlv_16= '\\t' ( (lv_subelements_17_0= ruleEntryElement ) ) )* otherlv_18= 'Value:' ( (lv_value_19_0= RULE_STRING ) )? otherlv_20= '\\r\\n' ) )
            // InternalCimpl.g:342:2: (otherlv_0= 'EntryElement' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '\\r\\n' otherlv_3= 'Based On:' ( (lv_basedOn_4_0= RULE_STRING ) ) otherlv_5= '\\r\\n' otherlv_6= 'Concept:' ( (lv_concept_7_0= RULE_STRING ) ) otherlv_8= '\\r\\n' otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= '\\r\\n' ( (lv_elements_12_0= ruleElement ) )? (otherlv_13= '\\r\\n' ( (lv_elements_14_0= ruleElement ) ) )* otherlv_15= '\\r\\n' (otherlv_16= '\\t' ( (lv_subelements_17_0= ruleEntryElement ) ) )* otherlv_18= 'Value:' ( (lv_value_19_0= RULE_STRING ) )? otherlv_20= '\\r\\n' )
            {
            // InternalCimpl.g:342:2: (otherlv_0= 'EntryElement' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '\\r\\n' otherlv_3= 'Based On:' ( (lv_basedOn_4_0= RULE_STRING ) ) otherlv_5= '\\r\\n' otherlv_6= 'Concept:' ( (lv_concept_7_0= RULE_STRING ) ) otherlv_8= '\\r\\n' otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= '\\r\\n' ( (lv_elements_12_0= ruleElement ) )? (otherlv_13= '\\r\\n' ( (lv_elements_14_0= ruleElement ) ) )* otherlv_15= '\\r\\n' (otherlv_16= '\\t' ( (lv_subelements_17_0= ruleEntryElement ) ) )* otherlv_18= 'Value:' ( (lv_value_19_0= RULE_STRING ) )? otherlv_20= '\\r\\n' )
            // InternalCimpl.g:343:3: otherlv_0= 'EntryElement' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '\\r\\n' otherlv_3= 'Based On:' ( (lv_basedOn_4_0= RULE_STRING ) ) otherlv_5= '\\r\\n' otherlv_6= 'Concept:' ( (lv_concept_7_0= RULE_STRING ) ) otherlv_8= '\\r\\n' otherlv_9= 'Description:' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= '\\r\\n' ( (lv_elements_12_0= ruleElement ) )? (otherlv_13= '\\r\\n' ( (lv_elements_14_0= ruleElement ) ) )* otherlv_15= '\\r\\n' (otherlv_16= '\\t' ( (lv_subelements_17_0= ruleEntryElement ) ) )* otherlv_18= 'Value:' ( (lv_value_19_0= RULE_STRING ) )? otherlv_20= '\\r\\n'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEntryElementAccess().getEntryElementKeyword_0());
            		
            // InternalCimpl.g:347:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalCimpl.g:348:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalCimpl.g:348:4: (lv_name_1_0= RULE_STRING )
            // InternalCimpl.g:349:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntryElementAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntryElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getEntryElementAccess().getBasedOnKeyword_3());
            		
            // InternalCimpl.g:373:3: ( (lv_basedOn_4_0= RULE_STRING ) )
            // InternalCimpl.g:374:4: (lv_basedOn_4_0= RULE_STRING )
            {
            // InternalCimpl.g:374:4: (lv_basedOn_4_0= RULE_STRING )
            // InternalCimpl.g:375:5: lv_basedOn_4_0= RULE_STRING
            {
            lv_basedOn_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_basedOn_4_0, grammarAccess.getEntryElementAccess().getBasedOnSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntryElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"basedOn",
            						lv_basedOn_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_5());
            		
            otherlv_6=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getEntryElementAccess().getConceptKeyword_6());
            		
            // InternalCimpl.g:399:3: ( (lv_concept_7_0= RULE_STRING ) )
            // InternalCimpl.g:400:4: (lv_concept_7_0= RULE_STRING )
            {
            // InternalCimpl.g:400:4: (lv_concept_7_0= RULE_STRING )
            // InternalCimpl.g:401:5: lv_concept_7_0= RULE_STRING
            {
            lv_concept_7_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_concept_7_0, grammarAccess.getEntryElementAccess().getConceptSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntryElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"concept",
            						lv_concept_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_8());
            		
            otherlv_9=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getEntryElementAccess().getDescriptionKeyword_9());
            		
            // InternalCimpl.g:425:3: ( (lv_description_10_0= RULE_STRING ) )
            // InternalCimpl.g:426:4: (lv_description_10_0= RULE_STRING )
            {
            // InternalCimpl.g:426:4: (lv_description_10_0= RULE_STRING )
            // InternalCimpl.g:427:5: lv_description_10_0= RULE_STRING
            {
            lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_description_10_0, grammarAccess.getEntryElementAccess().getDescriptionSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntryElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_11, grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_11());
            		
            // InternalCimpl.g:447:3: ( (lv_elements_12_0= ruleElement ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCimpl.g:448:4: (lv_elements_12_0= ruleElement )
                    {
                    // InternalCimpl.g:448:4: (lv_elements_12_0= ruleElement )
                    // InternalCimpl.g:449:5: lv_elements_12_0= ruleElement
                    {

                    					newCompositeNode(grammarAccess.getEntryElementAccess().getElementsElementParserRuleCall_12_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_elements_12_0=ruleElement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEntryElementRule());
                    					}
                    					add(
                    						current,
                    						"elements",
                    						lv_elements_12_0,
                    						"org.standardhealh.cimpl.dsl.Cimpl.Element");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCimpl.g:466:3: (otherlv_13= '\\r\\n' ( (lv_elements_14_0= ruleElement ) ) )*
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
            	    // InternalCimpl.g:467:4: otherlv_13= '\\r\\n' ( (lv_elements_14_0= ruleElement ) )
            	    {
            	    otherlv_13=(Token)match(input,13,FOLLOW_15); 

            	    				newLeafNode(otherlv_13, grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_13_0());
            	    			
            	    // InternalCimpl.g:471:4: ( (lv_elements_14_0= ruleElement ) )
            	    // InternalCimpl.g:472:5: (lv_elements_14_0= ruleElement )
            	    {
            	    // InternalCimpl.g:472:5: (lv_elements_14_0= ruleElement )
            	    // InternalCimpl.g:473:6: lv_elements_14_0= ruleElement
            	    {

            	    						newCompositeNode(grammarAccess.getEntryElementAccess().getElementsElementParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_elements_14_0=ruleElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEntryElementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_14_0,
            	    							"org.standardhealh.cimpl.dsl.Cimpl.Element");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_15=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_15, grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_14());
            		
            // InternalCimpl.g:495:3: (otherlv_16= '\\t' ( (lv_subelements_17_0= ruleEntryElement ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCimpl.g:496:4: otherlv_16= '\\t' ( (lv_subelements_17_0= ruleEntryElement ) )
            	    {
            	    otherlv_16=(Token)match(input,22,FOLLOW_17); 

            	    				newLeafNode(otherlv_16, grammarAccess.getEntryElementAccess().getControl0009Keyword_15_0());
            	    			
            	    // InternalCimpl.g:500:4: ( (lv_subelements_17_0= ruleEntryElement ) )
            	    // InternalCimpl.g:501:5: (lv_subelements_17_0= ruleEntryElement )
            	    {
            	    // InternalCimpl.g:501:5: (lv_subelements_17_0= ruleEntryElement )
            	    // InternalCimpl.g:502:6: lv_subelements_17_0= ruleEntryElement
            	    {

            	    						newCompositeNode(grammarAccess.getEntryElementAccess().getSubelementsEntryElementParserRuleCall_15_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_subelements_17_0=ruleEntryElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEntryElementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"subelements",
            	    							lv_subelements_17_0,
            	    							"org.standardhealh.cimpl.dsl.Cimpl.EntryElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_18=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_18, grammarAccess.getEntryElementAccess().getValueKeyword_16());
            		
            // InternalCimpl.g:524:3: ( (lv_value_19_0= RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCimpl.g:525:4: (lv_value_19_0= RULE_STRING )
                    {
                    // InternalCimpl.g:525:4: (lv_value_19_0= RULE_STRING )
                    // InternalCimpl.g:526:5: lv_value_19_0= RULE_STRING
                    {
                    lv_value_19_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    					newLeafNode(lv_value_19_0, grammarAccess.getEntryElementAccess().getValueSTRINGTerminalRuleCall_17_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEntryElementRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_19_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getEntryElementAccess().getControl000dControl000aKeyword_18());
            		

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


    // $ANTLR start "entryRuleElement"
    // InternalCimpl.g:550:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalCimpl.g:550:48: (iv_ruleElement= ruleElement EOF )
            // InternalCimpl.g:551:2: iv_ruleElement= ruleElement EOF
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
    // InternalCimpl.g:557:1: ruleElement returns [EObject current=null] : ( ( (lv_lower_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upper_2_0= RULE_INT ) ) ( (lv_name_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token lv_lower_0_0=null;
        Token otherlv_1=null;
        Token lv_upper_2_0=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalCimpl.g:563:2: ( ( ( (lv_lower_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upper_2_0= RULE_INT ) ) ( (lv_name_3_0= RULE_STRING ) ) ) )
            // InternalCimpl.g:564:2: ( ( (lv_lower_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upper_2_0= RULE_INT ) ) ( (lv_name_3_0= RULE_STRING ) ) )
            {
            // InternalCimpl.g:564:2: ( ( (lv_lower_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upper_2_0= RULE_INT ) ) ( (lv_name_3_0= RULE_STRING ) ) )
            // InternalCimpl.g:565:3: ( (lv_lower_0_0= RULE_INT ) ) otherlv_1= '..' ( (lv_upper_2_0= RULE_INT ) ) ( (lv_name_3_0= RULE_STRING ) )
            {
            // InternalCimpl.g:565:3: ( (lv_lower_0_0= RULE_INT ) )
            // InternalCimpl.g:566:4: (lv_lower_0_0= RULE_INT )
            {
            // InternalCimpl.g:566:4: (lv_lower_0_0= RULE_INT )
            // InternalCimpl.g:567:5: lv_lower_0_0= RULE_INT
            {
            lv_lower_0_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_lower_0_0, grammarAccess.getElementAccess().getLowerINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lower",
            						lv_lower_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getElementAccess().getFullStopFullStopKeyword_1());
            		
            // InternalCimpl.g:587:3: ( (lv_upper_2_0= RULE_INT ) )
            // InternalCimpl.g:588:4: (lv_upper_2_0= RULE_INT )
            {
            // InternalCimpl.g:588:4: (lv_upper_2_0= RULE_INT )
            // InternalCimpl.g:589:5: lv_upper_2_0= RULE_INT
            {
            lv_upper_2_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_upper_2_0, grammarAccess.getElementAccess().getUpperINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"upper",
            						lv_upper_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalCimpl.g:605:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalCimpl.g:606:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalCimpl.g:606:4: (lv_name_3_0= RULE_STRING )
            // InternalCimpl.g:607:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getElementAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleElement"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});

}