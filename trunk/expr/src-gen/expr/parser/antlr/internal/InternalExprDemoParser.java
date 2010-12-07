package expr.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import expr.services.ExprDemoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExprDemoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'tested'", "'model'", "'using'", "'.'", "'*'", "'function'", "'('", "','", "')'", "'{'", "'}'", "'return'", "';'", "'assert'", "'is'", "':'", "'enum'", "'var'", "'='", "'array'", "'['", "']'", "'int'", "'bool'", "'float'", "'string'", "'calc'", "'=='", "'+'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_NUMBER=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalExprDemoParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g"; }



     	private ExprDemoGrammarAccess grammarAccess;
     	
        public InternalExprDemoParser(TokenStream input, IAstFactory factory, ExprDemoGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("expr/parser/antlr/internal/InternalExprDemo.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ExprDemoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleModel
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:77:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:78:2: (iv_ruleModel= ruleModel EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:79:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();
            _fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:86:1: ruleModel returns [EObject current=null] : ( ( (lv_isTested_0_0= 'tested' ) )? 'model' ( (lv_name_2_0= RULE_ID ) ) ( (lv_usings_3_0= ruleUsing ) )* ( ( (lv_elements_4_0= ruleElement ) ) | ( (lv_functions_5_0= ruleFunctionDeclaration ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_isTested_0_0=null;
        Token lv_name_2_0=null;
        EObject lv_usings_3_0 = null;

        EObject lv_elements_4_0 = null;

        EObject lv_functions_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:91:6: ( ( ( (lv_isTested_0_0= 'tested' ) )? 'model' ( (lv_name_2_0= RULE_ID ) ) ( (lv_usings_3_0= ruleUsing ) )* ( ( (lv_elements_4_0= ruleElement ) ) | ( (lv_functions_5_0= ruleFunctionDeclaration ) ) )* ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:92:1: ( ( (lv_isTested_0_0= 'tested' ) )? 'model' ( (lv_name_2_0= RULE_ID ) ) ( (lv_usings_3_0= ruleUsing ) )* ( ( (lv_elements_4_0= ruleElement ) ) | ( (lv_functions_5_0= ruleFunctionDeclaration ) ) )* )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:92:1: ( ( (lv_isTested_0_0= 'tested' ) )? 'model' ( (lv_name_2_0= RULE_ID ) ) ( (lv_usings_3_0= ruleUsing ) )* ( ( (lv_elements_4_0= ruleElement ) ) | ( (lv_functions_5_0= ruleFunctionDeclaration ) ) )* )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:92:2: ( (lv_isTested_0_0= 'tested' ) )? 'model' ( (lv_name_2_0= RULE_ID ) ) ( (lv_usings_3_0= ruleUsing ) )* ( ( (lv_elements_4_0= ruleElement ) ) | ( (lv_functions_5_0= ruleFunctionDeclaration ) ) )*
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:92:2: ( (lv_isTested_0_0= 'tested' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:93:1: (lv_isTested_0_0= 'tested' )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:93:1: (lv_isTested_0_0= 'tested' )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:94:3: lv_isTested_0_0= 'tested'
                    {
                    lv_isTested_0_0=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleModel128); 

                            createLeafNode(grammarAccess.getModelAccess().getIsTestedTestedKeyword_0_0(), "isTested"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "isTested", true, "tested", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_ruleModel152); 

                    createLeafNode(grammarAccess.getModelAccess().getModelKeyword_1(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:117:1: ( (lv_name_2_0= RULE_ID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:118:1: (lv_name_2_0= RULE_ID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:118:1: (lv_name_2_0= RULE_ID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:119:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel169); 

            			createLeafNode(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:141:2: ( (lv_usings_3_0= ruleUsing ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:142:1: (lv_usings_3_0= ruleUsing )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:142:1: (lv_usings_3_0= ruleUsing )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:143:3: lv_usings_3_0= ruleUsing
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getUsingsUsingParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleUsing_in_ruleModel195);
            	    lv_usings_3_0=ruleUsing();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"usings",
            	    	        		lv_usings_3_0, 
            	    	        		"Using", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:165:3: ( ( (lv_elements_4_0= ruleElement ) ) | ( (lv_functions_5_0= ruleFunctionDeclaration ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23||LA3_0==25||(LA3_0>=28 && LA3_0<=29)||LA3_0==38) ) {
                    alt3=1;
                }
                else if ( (LA3_0==17) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:165:4: ( (lv_elements_4_0= ruleElement ) )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:165:4: ( (lv_elements_4_0= ruleElement ) )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:166:1: (lv_elements_4_0= ruleElement )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:166:1: (lv_elements_4_0= ruleElement )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:167:3: lv_elements_4_0= ruleElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_4_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleElement_in_ruleModel218);
            	    lv_elements_4_0=ruleElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"elements",
            	    	        		lv_elements_4_0, 
            	    	        		"Element", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:190:6: ( (lv_functions_5_0= ruleFunctionDeclaration ) )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:190:6: ( (lv_functions_5_0= ruleFunctionDeclaration ) )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:191:1: (lv_functions_5_0= ruleFunctionDeclaration )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:191:1: (lv_functions_5_0= ruleFunctionDeclaration )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:192:3: lv_functions_5_0= ruleFunctionDeclaration
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getFunctionsFunctionDeclarationParserRuleCall_4_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionDeclaration_in_ruleModel245);
            	    lv_functions_5_0=ruleFunctionDeclaration();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"functions",
            	    	        		lv_functions_5_0, 
            	    	        		"FunctionDeclaration", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleUsing
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:222:1: entryRuleUsing returns [EObject current=null] : iv_ruleUsing= ruleUsing EOF ;
    public final EObject entryRuleUsing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsing = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:223:2: (iv_ruleUsing= ruleUsing EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:224:2: iv_ruleUsing= ruleUsing EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUsingRule(), currentNode); 
            pushFollow(FOLLOW_ruleUsing_in_entryRuleUsing283);
            iv_ruleUsing=ruleUsing();
            _fsp--;

             current =iv_ruleUsing; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsing293); 

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
    // $ANTLR end entryRuleUsing


    // $ANTLR start ruleUsing
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:231:1: ruleUsing returns [EObject current=null] : ( 'using' ( (lv_importedNamespace_1_0= ruleImportID ) ) ) ;
    public final EObject ruleUsing() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:236:6: ( ( 'using' ( (lv_importedNamespace_1_0= ruleImportID ) ) ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:237:1: ( 'using' ( (lv_importedNamespace_1_0= ruleImportID ) ) )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:237:1: ( 'using' ( (lv_importedNamespace_1_0= ruleImportID ) ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:237:3: 'using' ( (lv_importedNamespace_1_0= ruleImportID ) )
            {
            match(input,14,FOLLOW_14_in_ruleUsing328); 

                    createLeafNode(grammarAccess.getUsingAccess().getUsingKeyword_0(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:241:1: ( (lv_importedNamespace_1_0= ruleImportID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:242:1: (lv_importedNamespace_1_0= ruleImportID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:242:1: (lv_importedNamespace_1_0= ruleImportID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:243:3: lv_importedNamespace_1_0= ruleImportID
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getUsingAccess().getImportedNamespaceImportIDParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleImportID_in_ruleUsing349);
            lv_importedNamespace_1_0=ruleImportID();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUsingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"importedNamespace",
            	        		lv_importedNamespace_1_0, 
            	        		"ImportID", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUsing


    // $ANTLR start entryRuleImportID
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:273:1: entryRuleImportID returns [String current=null] : iv_ruleImportID= ruleImportID EOF ;
    public final String entryRuleImportID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportID = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:274:2: (iv_ruleImportID= ruleImportID EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:275:2: iv_ruleImportID= ruleImportID EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportIDRule(), currentNode); 
            pushFollow(FOLLOW_ruleImportID_in_entryRuleImportID386);
            iv_ruleImportID=ruleImportID();
            _fsp--;

             current =iv_ruleImportID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportID397); 

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
    // $ANTLR end entryRuleImportID


    // $ANTLR start ruleImportID
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:282:1: ruleImportID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' kw= '*' ) ) ;
    public final AntlrDatatypeRuleToken ruleImportID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:287:6: ( (this_ID_0= RULE_ID (kw= '.' kw= '*' ) ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:288:1: (this_ID_0= RULE_ID (kw= '.' kw= '*' ) )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:288:1: (this_ID_0= RULE_ID (kw= '.' kw= '*' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:288:6: this_ID_0= RULE_ID (kw= '.' kw= '*' )
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImportID437); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getImportIDAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:295:1: (kw= '.' kw= '*' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:296:2: kw= '.' kw= '*'
            {
            kw=(Token)input.LT(1);
            match(input,15,FOLLOW_15_in_ruleImportID456); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getImportIDAccess().getFullStopKeyword_1_0(), null); 
                
            kw=(Token)input.LT(1);
            match(input,16,FOLLOW_16_in_ruleImportID469); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getImportIDAccess().getAsteriskKeyword_1_1(), null); 
                

            }


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleImportID


    // $ANTLR start entryRuleElement
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:315:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:316:2: (iv_ruleElement= ruleElement EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:317:2: iv_ruleElement= ruleElement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getElementRule(), currentNode); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement510);
            iv_ruleElement=ruleElement();
            _fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement520); 

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
    // $ANTLR end entryRuleElement


    // $ANTLR start ruleElement
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:324:1: ruleElement returns [EObject current=null] : (this_VarDecl_0= ruleVarDecl | this_Formula_1= ruleFormula | this_EnumDecl_2= ruleEnumDecl | this_Assert_3= ruleAssert | this_Return_4= ruleReturn ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_VarDecl_0 = null;

        EObject this_Formula_1 = null;

        EObject this_EnumDecl_2 = null;

        EObject this_Assert_3 = null;

        EObject this_Return_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:329:6: ( (this_VarDecl_0= ruleVarDecl | this_Formula_1= ruleFormula | this_EnumDecl_2= ruleEnumDecl | this_Assert_3= ruleAssert | this_Return_4= ruleReturn ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:330:1: (this_VarDecl_0= ruleVarDecl | this_Formula_1= ruleFormula | this_EnumDecl_2= ruleEnumDecl | this_Assert_3= ruleAssert | this_Return_4= ruleReturn )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:330:1: (this_VarDecl_0= ruleVarDecl | this_Formula_1= ruleFormula | this_EnumDecl_2= ruleEnumDecl | this_Assert_3= ruleAssert | this_Return_4= ruleReturn )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt4=1;
                }
                break;
            case 38:
                {
                alt4=2;
                }
                break;
            case 28:
                {
                alt4=3;
                }
                break;
            case 25:
                {
                alt4=4;
                }
                break;
            case 23:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("330:1: (this_VarDecl_0= ruleVarDecl | this_Formula_1= ruleFormula | this_EnumDecl_2= ruleEnumDecl | this_Assert_3= ruleAssert | this_Return_4= ruleReturn )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:331:5: this_VarDecl_0= ruleVarDecl
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getElementAccess().getVarDeclParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVarDecl_in_ruleElement567);
                    this_VarDecl_0=ruleVarDecl();
                    _fsp--;

                     
                            current = this_VarDecl_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:341:5: this_Formula_1= ruleFormula
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getElementAccess().getFormulaParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFormula_in_ruleElement594);
                    this_Formula_1=ruleFormula();
                    _fsp--;

                     
                            current = this_Formula_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:351:5: this_EnumDecl_2= ruleEnumDecl
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getElementAccess().getEnumDeclParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumDecl_in_ruleElement621);
                    this_EnumDecl_2=ruleEnumDecl();
                    _fsp--;

                     
                            current = this_EnumDecl_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:361:5: this_Assert_3= ruleAssert
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getElementAccess().getAssertParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAssert_in_ruleElement648);
                    this_Assert_3=ruleAssert();
                    _fsp--;

                     
                            current = this_Assert_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:371:5: this_Return_4= ruleReturn
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getElementAccess().getReturnParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleReturn_in_ruleElement675);
                    this_Return_4=ruleReturn();
                    _fsp--;

                     
                            current = this_Return_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleElement


    // $ANTLR start entryRuleFunctionDeclaration
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:387:1: entryRuleFunctionDeclaration returns [EObject current=null] : iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF ;
    public final EObject entryRuleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDeclaration = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:388:2: (iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:389:2: iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration710);
            iv_ruleFunctionDeclaration=ruleFunctionDeclaration();
            _fsp--;

             current =iv_ruleFunctionDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDeclaration720); 

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
    // $ANTLR end entryRuleFunctionDeclaration


    // $ANTLR start ruleFunctionDeclaration
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:396:1: ruleFunctionDeclaration returns [EObject current=null] : ( () 'function' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) '(' ( ( (lv_params_5_0= ruleParameter ) ) ( ',' ( (lv_params_7_0= ruleParameter ) ) )* )? ')' '{' ( (lv_elements_10_0= ruleElement ) )* '}' ) ;
    public final EObject ruleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        EObject lv_type_2_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_params_7_0 = null;

        EObject lv_elements_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:401:6: ( ( () 'function' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) '(' ( ( (lv_params_5_0= ruleParameter ) ) ( ',' ( (lv_params_7_0= ruleParameter ) ) )* )? ')' '{' ( (lv_elements_10_0= ruleElement ) )* '}' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:402:1: ( () 'function' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) '(' ( ( (lv_params_5_0= ruleParameter ) ) ( ',' ( (lv_params_7_0= ruleParameter ) ) )* )? ')' '{' ( (lv_elements_10_0= ruleElement ) )* '}' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:402:1: ( () 'function' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) '(' ( ( (lv_params_5_0= ruleParameter ) ) ( ',' ( (lv_params_7_0= ruleParameter ) ) )* )? ')' '{' ( (lv_elements_10_0= ruleElement ) )* '}' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:402:2: () 'function' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) '(' ( ( (lv_params_5_0= ruleParameter ) ) ( ',' ( (lv_params_7_0= ruleParameter ) ) )* )? ')' '{' ( (lv_elements_10_0= ruleElement ) )* '}'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:402:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:403:5: 
            {
             
                    temp=factory.create(grammarAccess.getFunctionDeclarationAccess().getFunctionDeclarationAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getFunctionDeclarationAccess().getFunctionDeclarationAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,17,FOLLOW_17_in_ruleFunctionDeclaration764); 

                    createLeafNode(grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_1(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:417:1: ( (lv_type_2_0= ruleType ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:418:1: (lv_type_2_0= ruleType )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:418:1: (lv_type_2_0= ruleType )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:419:3: lv_type_2_0= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFunctionDeclarationAccess().getTypeTypeParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleFunctionDeclaration785);
            lv_type_2_0=ruleType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionDeclarationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_2_0, 
            	        		"Type", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:441:2: ( (lv_name_3_0= RULE_ID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:442:1: (lv_name_3_0= RULE_ID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:442:1: (lv_name_3_0= RULE_ID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:443:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionDeclaration802); 

            			createLeafNode(grammarAccess.getFunctionDeclarationAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionDeclarationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_3_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,18,FOLLOW_18_in_ruleFunctionDeclaration817); 

                    createLeafNode(grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_4(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:469:1: ( ( (lv_params_5_0= ruleParameter ) ) ( ',' ( (lv_params_7_0= ruleParameter ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||LA6_0==31||(LA6_0>=34 && LA6_0<=37)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:469:2: ( (lv_params_5_0= ruleParameter ) ) ( ',' ( (lv_params_7_0= ruleParameter ) ) )*
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:469:2: ( (lv_params_5_0= ruleParameter ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:470:1: (lv_params_5_0= ruleParameter )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:470:1: (lv_params_5_0= ruleParameter )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:471:3: lv_params_5_0= ruleParameter
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParamsParameterParserRuleCall_5_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleFunctionDeclaration839);
                    lv_params_5_0=ruleParameter();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionDeclarationRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"params",
                    	        		lv_params_5_0, 
                    	        		"Parameter", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:493:2: ( ',' ( (lv_params_7_0= ruleParameter ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==19) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:493:4: ',' ( (lv_params_7_0= ruleParameter ) )
                    	    {
                    	    match(input,19,FOLLOW_19_in_ruleFunctionDeclaration850); 

                    	            createLeafNode(grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_5_1_0(), null); 
                    	        
                    	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:497:1: ( (lv_params_7_0= ruleParameter ) )
                    	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:498:1: (lv_params_7_0= ruleParameter )
                    	    {
                    	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:498:1: (lv_params_7_0= ruleParameter )
                    	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:499:3: lv_params_7_0= ruleParameter
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParamsParameterParserRuleCall_5_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleFunctionDeclaration871);
                    	    lv_params_7_0=ruleParameter();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getFunctionDeclarationRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"params",
                    	    	        		lv_params_7_0, 
                    	    	        		"Parameter", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,20,FOLLOW_20_in_ruleFunctionDeclaration885); 

                    createLeafNode(grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_6(), null); 
                
            match(input,21,FOLLOW_21_in_ruleFunctionDeclaration895); 

                    createLeafNode(grammarAccess.getFunctionDeclarationAccess().getLeftCurlyBracketKeyword_7(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:529:1: ( (lv_elements_10_0= ruleElement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23||LA7_0==25||(LA7_0>=28 && LA7_0<=29)||LA7_0==38) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:530:1: (lv_elements_10_0= ruleElement )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:530:1: (lv_elements_10_0= ruleElement )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:531:3: lv_elements_10_0= ruleElement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFunctionDeclarationAccess().getElementsElementParserRuleCall_8_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleElement_in_ruleFunctionDeclaration916);
            	    lv_elements_10_0=ruleElement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFunctionDeclarationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"elements",
            	    	        		lv_elements_10_0, 
            	    	        		"Element", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,22,FOLLOW_22_in_ruleFunctionDeclaration927); 

                    createLeafNode(grammarAccess.getFunctionDeclarationAccess().getRightCurlyBracketKeyword_9(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFunctionDeclaration


    // $ANTLR start entryRuleReturn
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:565:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:566:2: (iv_ruleReturn= ruleReturn EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:567:2: iv_ruleReturn= ruleReturn EOF
            {
             currentNode = createCompositeNode(grammarAccess.getReturnRule(), currentNode); 
            pushFollow(FOLLOW_ruleReturn_in_entryRuleReturn963);
            iv_ruleReturn=ruleReturn();
            _fsp--;

             current =iv_ruleReturn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturn973); 

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
    // $ANTLR end entryRuleReturn


    // $ANTLR start ruleReturn
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:574:1: ruleReturn returns [EObject current=null] : ( 'return' ( (lv_expr_1_0= ruleExpr ) ) ';' ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:579:6: ( ( 'return' ( (lv_expr_1_0= ruleExpr ) ) ';' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:580:1: ( 'return' ( (lv_expr_1_0= ruleExpr ) ) ';' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:580:1: ( 'return' ( (lv_expr_1_0= ruleExpr ) ) ';' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:580:3: 'return' ( (lv_expr_1_0= ruleExpr ) ) ';'
            {
            match(input,23,FOLLOW_23_in_ruleReturn1008); 

                    createLeafNode(grammarAccess.getReturnAccess().getReturnKeyword_0(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:584:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:585:1: (lv_expr_1_0= ruleExpr )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:585:1: (lv_expr_1_0= ruleExpr )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:586:3: lv_expr_1_0= ruleExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getReturnAccess().getExprExprParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleReturn1029);
            lv_expr_1_0=ruleExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getReturnRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"expr",
            	        		lv_expr_1_0, 
            	        		"Expr", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,24,FOLLOW_24_in_ruleReturn1039); 

                    createLeafNode(grammarAccess.getReturnAccess().getSemicolonKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleReturn


    // $ANTLR start entryRuleParameter
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:620:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:621:2: (iv_ruleParameter= ruleParameter EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:622:2: iv_ruleParameter= ruleParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1075);
            iv_ruleParameter=ruleParameter();
            _fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1085); 

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
    // $ANTLR end entryRuleParameter


    // $ANTLR start ruleParameter
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:629:1: ruleParameter returns [EObject current=null] : ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_type_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:634:6: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:635:1: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:635:1: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:635:2: () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:635:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:636:5: 
            {
             
                    temp=factory.create(grammarAccess.getParameterAccess().getParameterAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getParameterAccess().getParameterAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:646:2: ( (lv_type_1_0= ruleType ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:647:1: (lv_type_1_0= ruleType )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:647:1: (lv_type_1_0= ruleType )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:648:3: lv_type_1_0= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleParameter1140);
            lv_type_1_0=ruleType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_1_0, 
            	        		"Type", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:670:2: ( (lv_name_2_0= RULE_ID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:671:1: (lv_name_2_0= RULE_ID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:671:1: (lv_name_2_0= RULE_ID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:672:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1157); 

            			createLeafNode(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParameterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParameter


    // $ANTLR start entryRuleAssert
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:702:1: entryRuleAssert returns [EObject current=null] : iv_ruleAssert= ruleAssert EOF ;
    public final EObject entryRuleAssert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssert = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:703:2: (iv_ruleAssert= ruleAssert EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:704:2: iv_ruleAssert= ruleAssert EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssertRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssert_in_entryRuleAssert1198);
            iv_ruleAssert=ruleAssert();
            _fsp--;

             current =iv_ruleAssert; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssert1208); 

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
    // $ANTLR end entryRuleAssert


    // $ANTLR start ruleAssert
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:711:1: ruleAssert returns [EObject current=null] : ( 'assert' ( (lv_actual_1_0= ruleExpr ) ) 'is' ( (lv_expected_3_0= ruleExpr ) ) ( ':' ( (lv_msg_5_0= ruleExpr ) ) )? ) ;
    public final EObject ruleAssert() throws RecognitionException {
        EObject current = null;

        EObject lv_actual_1_0 = null;

        EObject lv_expected_3_0 = null;

        EObject lv_msg_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:716:6: ( ( 'assert' ( (lv_actual_1_0= ruleExpr ) ) 'is' ( (lv_expected_3_0= ruleExpr ) ) ( ':' ( (lv_msg_5_0= ruleExpr ) ) )? ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:717:1: ( 'assert' ( (lv_actual_1_0= ruleExpr ) ) 'is' ( (lv_expected_3_0= ruleExpr ) ) ( ':' ( (lv_msg_5_0= ruleExpr ) ) )? )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:717:1: ( 'assert' ( (lv_actual_1_0= ruleExpr ) ) 'is' ( (lv_expected_3_0= ruleExpr ) ) ( ':' ( (lv_msg_5_0= ruleExpr ) ) )? )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:717:3: 'assert' ( (lv_actual_1_0= ruleExpr ) ) 'is' ( (lv_expected_3_0= ruleExpr ) ) ( ':' ( (lv_msg_5_0= ruleExpr ) ) )?
            {
            match(input,25,FOLLOW_25_in_ruleAssert1243); 

                    createLeafNode(grammarAccess.getAssertAccess().getAssertKeyword_0(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:721:1: ( (lv_actual_1_0= ruleExpr ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:722:1: (lv_actual_1_0= ruleExpr )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:722:1: (lv_actual_1_0= ruleExpr )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:723:3: lv_actual_1_0= ruleExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssertAccess().getActualExprParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleAssert1264);
            lv_actual_1_0=ruleExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssertRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"actual",
            	        		lv_actual_1_0, 
            	        		"Expr", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,26,FOLLOW_26_in_ruleAssert1274); 

                    createLeafNode(grammarAccess.getAssertAccess().getIsKeyword_2(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:749:1: ( (lv_expected_3_0= ruleExpr ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:750:1: (lv_expected_3_0= ruleExpr )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:750:1: (lv_expected_3_0= ruleExpr )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:751:3: lv_expected_3_0= ruleExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssertAccess().getExpectedExprParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleAssert1295);
            lv_expected_3_0=ruleExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssertRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"expected",
            	        		lv_expected_3_0, 
            	        		"Expr", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:773:2: ( ':' ( (lv_msg_5_0= ruleExpr ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:773:4: ':' ( (lv_msg_5_0= ruleExpr ) )
                    {
                    match(input,27,FOLLOW_27_in_ruleAssert1306); 

                            createLeafNode(grammarAccess.getAssertAccess().getColonKeyword_4_0(), null); 
                        
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:777:1: ( (lv_msg_5_0= ruleExpr ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:778:1: (lv_msg_5_0= ruleExpr )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:778:1: (lv_msg_5_0= ruleExpr )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:779:3: lv_msg_5_0= ruleExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssertAccess().getMsgExprParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleAssert1327);
                    lv_msg_5_0=ruleExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssertRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"msg",
                    	        		lv_msg_5_0, 
                    	        		"Expr", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAssert


    // $ANTLR start entryRuleEnumDecl
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:809:1: entryRuleEnumDecl returns [EObject current=null] : iv_ruleEnumDecl= ruleEnumDecl EOF ;
    public final EObject entryRuleEnumDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDecl = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:810:2: (iv_ruleEnumDecl= ruleEnumDecl EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:811:2: iv_ruleEnumDecl= ruleEnumDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumDecl_in_entryRuleEnumDecl1365);
            iv_ruleEnumDecl=ruleEnumDecl();
            _fsp--;

             current =iv_ruleEnumDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDecl1375); 

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
    // $ANTLR end entryRuleEnumDecl


    // $ANTLR start ruleEnumDecl
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:818:1: ruleEnumDecl returns [EObject current=null] : ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_literals_3_0= ruleEnumLiteral ) )* '}' ) ;
    public final EObject ruleEnumDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_literals_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:823:6: ( ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_literals_3_0= ruleEnumLiteral ) )* '}' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:824:1: ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_literals_3_0= ruleEnumLiteral ) )* '}' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:824:1: ( 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_literals_3_0= ruleEnumLiteral ) )* '}' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:824:3: 'enum' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_literals_3_0= ruleEnumLiteral ) )* '}'
            {
            match(input,28,FOLLOW_28_in_ruleEnumDecl1410); 

                    createLeafNode(grammarAccess.getEnumDeclAccess().getEnumKeyword_0(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:828:1: ( (lv_name_1_0= RULE_ID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:829:1: (lv_name_1_0= RULE_ID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:829:1: (lv_name_1_0= RULE_ID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:830:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDecl1427); 

            			createLeafNode(grammarAccess.getEnumDeclAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,21,FOLLOW_21_in_ruleEnumDecl1442); 

                    createLeafNode(grammarAccess.getEnumDeclAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:856:1: ( (lv_literals_3_0= ruleEnumLiteral ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:857:1: (lv_literals_3_0= ruleEnumLiteral )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:857:1: (lv_literals_3_0= ruleEnumLiteral )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:858:3: lv_literals_3_0= ruleEnumLiteral
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEnumDeclAccess().getLiteralsEnumLiteralParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumLiteral_in_ruleEnumDecl1463);
            	    lv_literals_3_0=ruleEnumLiteral();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEnumDeclRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"literals",
            	    	        		lv_literals_3_0, 
            	    	        		"EnumLiteral", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(input,22,FOLLOW_22_in_ruleEnumDecl1474); 

                    createLeafNode(grammarAccess.getEnumDeclAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnumDecl


    // $ANTLR start entryRuleEnumLiteral
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:892:1: entryRuleEnumLiteral returns [EObject current=null] : iv_ruleEnumLiteral= ruleEnumLiteral EOF ;
    public final EObject entryRuleEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumLiteral = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:893:2: (iv_ruleEnumLiteral= ruleEnumLiteral EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:894:2: iv_ruleEnumLiteral= ruleEnumLiteral EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumLiteralRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral1510);
            iv_ruleEnumLiteral=ruleEnumLiteral();
            _fsp--;

             current =iv_ruleEnumLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumLiteral1520); 

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
    // $ANTLR end entryRuleEnumLiteral


    // $ANTLR start ruleEnumLiteral
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:901:1: ruleEnumLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:906:6: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:907:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:907:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:907:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:907:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:908:5: 
            {
             
                    temp=factory.create(grammarAccess.getEnumLiteralAccess().getEnumLiteralAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getEnumLiteralAccess().getEnumLiteralAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:918:2: ( (lv_name_1_0= RULE_ID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:919:1: (lv_name_1_0= RULE_ID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:919:1: (lv_name_1_0= RULE_ID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:920:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumLiteral1571); 

            			createLeafNode(grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEnumLiteralRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnumLiteral


    // $ANTLR start entryRuleVarDecl
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:950:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:951:2: (iv_ruleVarDecl= ruleVarDecl EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:952:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVarDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleVarDecl_in_entryRuleVarDecl1612);
            iv_ruleVarDecl=ruleVarDecl();
            _fsp--;

             current =iv_ruleVarDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDecl1622); 

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
    // $ANTLR end entryRuleVarDecl


    // $ANTLR start ruleVarDecl
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:959:1: ruleVarDecl returns [EObject current=null] : ( () 'var' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) ( '=' ( (lv_init_5_0= ruleExpr ) ) )? ';' ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        EObject lv_type_2_0 = null;

        EObject lv_init_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:964:6: ( ( () 'var' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) ( '=' ( (lv_init_5_0= ruleExpr ) ) )? ';' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:965:1: ( () 'var' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) ( '=' ( (lv_init_5_0= ruleExpr ) ) )? ';' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:965:1: ( () 'var' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) ( '=' ( (lv_init_5_0= ruleExpr ) ) )? ';' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:965:2: () 'var' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) ( '=' ( (lv_init_5_0= ruleExpr ) ) )? ';'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:965:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:966:5: 
            {
             
                    temp=factory.create(grammarAccess.getVarDeclAccess().getVarDeclAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getVarDeclAccess().getVarDeclAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,29,FOLLOW_29_in_ruleVarDecl1666); 

                    createLeafNode(grammarAccess.getVarDeclAccess().getVarKeyword_1(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:980:1: ( (lv_type_2_0= ruleType ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:981:1: (lv_type_2_0= ruleType )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:981:1: (lv_type_2_0= ruleType )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:982:3: lv_type_2_0= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getVarDeclAccess().getTypeTypeParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleVarDecl1687);
            lv_type_2_0=ruleType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVarDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_2_0, 
            	        		"Type", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1004:2: ( (lv_name_3_0= RULE_ID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1005:1: (lv_name_3_0= RULE_ID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1005:1: (lv_name_3_0= RULE_ID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1006:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarDecl1704); 

            			createLeafNode(grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVarDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_3_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1028:2: ( '=' ( (lv_init_5_0= ruleExpr ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1028:4: '=' ( (lv_init_5_0= ruleExpr ) )
                    {
                    match(input,30,FOLLOW_30_in_ruleVarDecl1720); 

                            createLeafNode(grammarAccess.getVarDeclAccess().getEqualsSignKeyword_4_0(), null); 
                        
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1032:1: ( (lv_init_5_0= ruleExpr ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1033:1: (lv_init_5_0= ruleExpr )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1033:1: (lv_init_5_0= ruleExpr )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1034:3: lv_init_5_0= ruleExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getVarDeclAccess().getInitExprParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleVarDecl1741);
                    lv_init_5_0=ruleExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getVarDeclRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"init",
                    	        		lv_init_5_0, 
                    	        		"Expr", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,24,FOLLOW_24_in_ruleVarDecl1753); 

                    createLeafNode(grammarAccess.getVarDeclAccess().getSemicolonKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVarDecl


    // $ANTLR start entryRuleType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1068:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1069:2: (iv_ruleType= ruleType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1070:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1789);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1799); 

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
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1077:1: ruleType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_ArrayType_1= ruleArrayType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_ArrayType_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1082:6: ( (this_PrimitiveType_0= rulePrimitiveType | this_ArrayType_1= ruleArrayType ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1083:1: (this_PrimitiveType_0= rulePrimitiveType | this_ArrayType_1= ruleArrayType )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1083:1: (this_PrimitiveType_0= rulePrimitiveType | this_ArrayType_1= ruleArrayType )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||(LA11_0>=34 && LA11_0<=37)) ) {
                alt11=1;
            }
            else if ( (LA11_0==31) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1083:1: (this_PrimitiveType_0= rulePrimitiveType | this_ArrayType_1= ruleArrayType )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1084:5: this_PrimitiveType_0= rulePrimitiveType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrimitiveType_in_ruleType1846);
                    this_PrimitiveType_0=rulePrimitiveType();
                    _fsp--;

                     
                            current = this_PrimitiveType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1094:5: this_ArrayType_1= ruleArrayType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getArrayTypeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleArrayType_in_ruleType1873);
                    this_ArrayType_1=ruleArrayType();
                    _fsp--;

                     
                            current = this_ArrayType_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRulePrimitiveType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1110:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1111:2: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1112:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimitiveTypeRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType1908);
            iv_rulePrimitiveType=rulePrimitiveType();
            _fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType1918); 

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
    // $ANTLR end entryRulePrimitiveType


    // $ANTLR start rulePrimitiveType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1119:1: rulePrimitiveType returns [EObject current=null] : (this_IntType_0= ruleIntType | this_BoolType_1= ruleBoolType | this_FloatType_2= ruleFloatType | this_EnumType_3= ruleEnumType | this_StringType_4= ruleStringType ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject this_IntType_0 = null;

        EObject this_BoolType_1 = null;

        EObject this_FloatType_2 = null;

        EObject this_EnumType_3 = null;

        EObject this_StringType_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1124:6: ( (this_IntType_0= ruleIntType | this_BoolType_1= ruleBoolType | this_FloatType_2= ruleFloatType | this_EnumType_3= ruleEnumType | this_StringType_4= ruleStringType ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1125:1: (this_IntType_0= ruleIntType | this_BoolType_1= ruleBoolType | this_FloatType_2= ruleFloatType | this_EnumType_3= ruleEnumType | this_StringType_4= ruleStringType )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1125:1: (this_IntType_0= ruleIntType | this_BoolType_1= ruleBoolType | this_FloatType_2= ruleFloatType | this_EnumType_3= ruleEnumType | this_StringType_4= ruleStringType )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt12=1;
                }
                break;
            case 35:
                {
                alt12=2;
                }
                break;
            case 36:
                {
                alt12=3;
                }
                break;
            case RULE_ID:
                {
                alt12=4;
                }
                break;
            case 37:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1125:1: (this_IntType_0= ruleIntType | this_BoolType_1= ruleBoolType | this_FloatType_2= ruleFloatType | this_EnumType_3= ruleEnumType | this_StringType_4= ruleStringType )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1126:5: this_IntType_0= ruleIntType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveTypeAccess().getIntTypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIntType_in_rulePrimitiveType1965);
                    this_IntType_0=ruleIntType();
                    _fsp--;

                     
                            current = this_IntType_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1136:5: this_BoolType_1= ruleBoolType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveTypeAccess().getBoolTypeParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBoolType_in_rulePrimitiveType1992);
                    this_BoolType_1=ruleBoolType();
                    _fsp--;

                     
                            current = this_BoolType_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1146:5: this_FloatType_2= ruleFloatType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveTypeAccess().getFloatTypeParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFloatType_in_rulePrimitiveType2019);
                    this_FloatType_2=ruleFloatType();
                    _fsp--;

                     
                            current = this_FloatType_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1156:5: this_EnumType_3= ruleEnumType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveTypeAccess().getEnumTypeParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEnumType_in_rulePrimitiveType2046);
                    this_EnumType_3=ruleEnumType();
                    _fsp--;

                     
                            current = this_EnumType_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1166:5: this_StringType_4= ruleStringType
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimitiveTypeAccess().getStringTypeParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleStringType_in_rulePrimitiveType2073);
                    this_StringType_4=ruleStringType();
                    _fsp--;

                     
                            current = this_StringType_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePrimitiveType


    // $ANTLR start entryRuleArrayType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1182:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1183:2: (iv_ruleArrayType= ruleArrayType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1184:2: iv_ruleArrayType= ruleArrayType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getArrayTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleArrayType_in_entryRuleArrayType2108);
            iv_ruleArrayType=ruleArrayType();
            _fsp--;

             current =iv_ruleArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayType2118); 

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
    // $ANTLR end entryRuleArrayType


    // $ANTLR start ruleArrayType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1191:1: ruleArrayType returns [EObject current=null] : ( () 'array' '[' ( (lv_baseType_3_0= ruleType ) ) ']' ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        EObject lv_baseType_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1196:6: ( ( () 'array' '[' ( (lv_baseType_3_0= ruleType ) ) ']' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1197:1: ( () 'array' '[' ( (lv_baseType_3_0= ruleType ) ) ']' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1197:1: ( () 'array' '[' ( (lv_baseType_3_0= ruleType ) ) ']' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1197:2: () 'array' '[' ( (lv_baseType_3_0= ruleType ) ) ']'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1197:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1198:5: 
            {
             
                    temp=factory.create(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,31,FOLLOW_31_in_ruleArrayType2162); 

                    createLeafNode(grammarAccess.getArrayTypeAccess().getArrayKeyword_1(), null); 
                
            match(input,32,FOLLOW_32_in_ruleArrayType2172); 

                    createLeafNode(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_2(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1216:1: ( (lv_baseType_3_0= ruleType ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1217:1: (lv_baseType_3_0= ruleType )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1217:1: (lv_baseType_3_0= ruleType )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1218:3: lv_baseType_3_0= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getArrayTypeAccess().getBaseTypeTypeParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleArrayType2193);
            lv_baseType_3_0=ruleType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getArrayTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"baseType",
            	        		lv_baseType_3_0, 
            	        		"Type", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,33,FOLLOW_33_in_ruleArrayType2203); 

                    createLeafNode(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleArrayType


    // $ANTLR start entryRuleEnumType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1252:1: entryRuleEnumType returns [EObject current=null] : iv_ruleEnumType= ruleEnumType EOF ;
    public final EObject entryRuleEnumType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1253:2: (iv_ruleEnumType= ruleEnumType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1254:2: iv_ruleEnumType= ruleEnumType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEnumTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleEnumType_in_entryRuleEnumType2239);
            iv_ruleEnumType=ruleEnumType();
            _fsp--;

             current =iv_ruleEnumType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumType2249); 

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
    // $ANTLR end entryRuleEnumType


    // $ANTLR start ruleEnumType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1261:1: ruleEnumType returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleEnumType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1266:6: ( ( ( RULE_ID ) ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1267:1: ( ( RULE_ID ) )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1267:1: ( ( RULE_ID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1268:1: ( RULE_ID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1268:1: ( RULE_ID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1269:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getEnumTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumType2291); 

            		createLeafNode(grammarAccess.getEnumTypeAccess().getEnumRefEnumDeclCrossReference_0(), "enumRef"); 
            	

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEnumType


    // $ANTLR start entryRuleIntType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1289:1: entryRuleIntType returns [EObject current=null] : iv_ruleIntType= ruleIntType EOF ;
    public final EObject entryRuleIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1290:2: (iv_ruleIntType= ruleIntType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1291:2: iv_ruleIntType= ruleIntType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIntTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleIntType_in_entryRuleIntType2326);
            iv_ruleIntType=ruleIntType();
            _fsp--;

             current =iv_ruleIntType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntType2336); 

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
    // $ANTLR end entryRuleIntType


    // $ANTLR start ruleIntType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1298:1: ruleIntType returns [EObject current=null] : ( () 'int' ) ;
    public final EObject ruleIntType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1303:6: ( ( () 'int' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1304:1: ( () 'int' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1304:1: ( () 'int' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1304:2: () 'int'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1304:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1305:5: 
            {
             
                    temp=factory.create(grammarAccess.getIntTypeAccess().getIntTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getIntTypeAccess().getIntTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,34,FOLLOW_34_in_ruleIntType2380); 

                    createLeafNode(grammarAccess.getIntTypeAccess().getIntKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIntType


    // $ANTLR start entryRuleBoolType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1327:1: entryRuleBoolType returns [EObject current=null] : iv_ruleBoolType= ruleBoolType EOF ;
    public final EObject entryRuleBoolType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1328:2: (iv_ruleBoolType= ruleBoolType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1329:2: iv_ruleBoolType= ruleBoolType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBoolTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleBoolType_in_entryRuleBoolType2416);
            iv_ruleBoolType=ruleBoolType();
            _fsp--;

             current =iv_ruleBoolType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolType2426); 

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
    // $ANTLR end entryRuleBoolType


    // $ANTLR start ruleBoolType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1336:1: ruleBoolType returns [EObject current=null] : ( () 'bool' ) ;
    public final EObject ruleBoolType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1341:6: ( ( () 'bool' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1342:1: ( () 'bool' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1342:1: ( () 'bool' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1342:2: () 'bool'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1342:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1343:5: 
            {
             
                    temp=factory.create(grammarAccess.getBoolTypeAccess().getBoolTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getBoolTypeAccess().getBoolTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,35,FOLLOW_35_in_ruleBoolType2470); 

                    createLeafNode(grammarAccess.getBoolTypeAccess().getBoolKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBoolType


    // $ANTLR start entryRuleFloatType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1365:1: entryRuleFloatType returns [EObject current=null] : iv_ruleFloatType= ruleFloatType EOF ;
    public final EObject entryRuleFloatType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1366:2: (iv_ruleFloatType= ruleFloatType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1367:2: iv_ruleFloatType= ruleFloatType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFloatTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleFloatType_in_entryRuleFloatType2506);
            iv_ruleFloatType=ruleFloatType();
            _fsp--;

             current =iv_ruleFloatType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatType2516); 

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
    // $ANTLR end entryRuleFloatType


    // $ANTLR start ruleFloatType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1374:1: ruleFloatType returns [EObject current=null] : ( () 'float' ) ;
    public final EObject ruleFloatType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1379:6: ( ( () 'float' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1380:1: ( () 'float' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1380:1: ( () 'float' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1380:2: () 'float'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1380:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1381:5: 
            {
             
                    temp=factory.create(grammarAccess.getFloatTypeAccess().getFloatTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getFloatTypeAccess().getFloatTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,36,FOLLOW_36_in_ruleFloatType2560); 

                    createLeafNode(grammarAccess.getFloatTypeAccess().getFloatKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFloatType


    // $ANTLR start entryRuleStringType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1403:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1404:2: (iv_ruleStringType= ruleStringType EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1405:2: iv_ruleStringType= ruleStringType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStringTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType2596);
            iv_ruleStringType=ruleStringType();
            _fsp--;

             current =iv_ruleStringType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType2606); 

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
    // $ANTLR end entryRuleStringType


    // $ANTLR start ruleStringType
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1412:1: ruleStringType returns [EObject current=null] : ( () 'string' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1417:6: ( ( () 'string' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1418:1: ( () 'string' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1418:1: ( () 'string' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1418:2: () 'string'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1418:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1419:5: 
            {
             
                    temp=factory.create(grammarAccess.getStringTypeAccess().getStringTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getStringTypeAccess().getStringTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,37,FOLLOW_37_in_ruleStringType2650); 

                    createLeafNode(grammarAccess.getStringTypeAccess().getStringKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStringType


    // $ANTLR start entryRuleFormula
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1441:1: entryRuleFormula returns [EObject current=null] : iv_ruleFormula= ruleFormula EOF ;
    public final EObject entryRuleFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormula = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1442:2: (iv_ruleFormula= ruleFormula EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1443:2: iv_ruleFormula= ruleFormula EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFormulaRule(), currentNode); 
            pushFollow(FOLLOW_ruleFormula_in_entryRuleFormula2686);
            iv_ruleFormula=ruleFormula();
            _fsp--;

             current =iv_ruleFormula; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormula2696); 

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
    // $ANTLR end entryRuleFormula


    // $ANTLR start ruleFormula
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1450:1: ruleFormula returns [EObject current=null] : ( () 'calc' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) '=' ( (lv_expr_5_0= ruleExpr ) ) ';' ) ;
    public final EObject ruleFormula() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        EObject lv_type_2_0 = null;

        EObject lv_expr_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1455:6: ( ( () 'calc' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) '=' ( (lv_expr_5_0= ruleExpr ) ) ';' ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1456:1: ( () 'calc' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) '=' ( (lv_expr_5_0= ruleExpr ) ) ';' )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1456:1: ( () 'calc' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) '=' ( (lv_expr_5_0= ruleExpr ) ) ';' )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1456:2: () 'calc' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) '=' ( (lv_expr_5_0= ruleExpr ) ) ';'
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1456:2: ()
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1457:5: 
            {
             
                    temp=factory.create(grammarAccess.getFormulaAccess().getFormulaAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getFormulaAccess().getFormulaAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,38,FOLLOW_38_in_ruleFormula2740); 

                    createLeafNode(grammarAccess.getFormulaAccess().getCalcKeyword_1(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1471:1: ( (lv_type_2_0= ruleType ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1472:1: (lv_type_2_0= ruleType )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1472:1: (lv_type_2_0= ruleType )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1473:3: lv_type_2_0= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFormulaAccess().getTypeTypeParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleFormula2761);
            lv_type_2_0=ruleType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFormulaRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"type",
            	        		lv_type_2_0, 
            	        		"Type", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1495:2: ( (lv_name_3_0= RULE_ID ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1496:1: (lv_name_3_0= RULE_ID )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1496:1: (lv_name_3_0= RULE_ID )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1497:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormula2778); 

            			createLeafNode(grammarAccess.getFormulaAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFormulaRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_3_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,30,FOLLOW_30_in_ruleFormula2793); 

                    createLeafNode(grammarAccess.getFormulaAccess().getEqualsSignKeyword_4(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1523:1: ( (lv_expr_5_0= ruleExpr ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1524:1: (lv_expr_5_0= ruleExpr )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1524:1: (lv_expr_5_0= ruleExpr )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1525:3: lv_expr_5_0= ruleExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFormulaAccess().getExprExprParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleFormula2814);
            lv_expr_5_0=ruleExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFormulaRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"expr",
            	        		lv_expr_5_0, 
            	        		"Expr", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,24,FOLLOW_24_in_ruleFormula2824); 

                    createLeafNode(grammarAccess.getFormulaAccess().getSemicolonKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFormula


    // $ANTLR start entryRuleExpr
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1559:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1560:2: (iv_ruleExpr= ruleExpr EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1561:2: iv_ruleExpr= ruleExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr2860);
            iv_ruleExpr=ruleExpr();
            _fsp--;

             current =iv_ruleExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr2870); 

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
    // $ANTLR end entryRuleExpr


    // $ANTLR start ruleExpr
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1568:1: ruleExpr returns [EObject current=null] : this_Comparison_0= ruleComparison ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1573:6: (this_Comparison_0= ruleComparison )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1575:5: this_Comparison_0= ruleComparison
            {
             
                    currentNode=createCompositeNode(grammarAccess.getExprAccess().getComparisonParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleComparison_in_ruleExpr2916);
            this_Comparison_0=ruleComparison();
            _fsp--;

             
                    current = this_Comparison_0; 
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExpr


    // $ANTLR start entryRuleComparison
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1591:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1592:2: (iv_ruleComparison= ruleComparison EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1593:2: iv_ruleComparison= ruleComparison EOF
            {
             currentNode = createCompositeNode(grammarAccess.getComparisonRule(), currentNode); 
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison2950);
            iv_ruleComparison=ruleComparison();
            _fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison2960); 

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
    // $ANTLR end entryRuleComparison


    // $ANTLR start ruleComparison
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1600:1: ruleComparison returns [EObject current=null] : (this_Addition_0= ruleAddition ( () '==' ( (lv_right_3_0= ruleAddition ) ) )? ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1605:6: ( (this_Addition_0= ruleAddition ( () '==' ( (lv_right_3_0= ruleAddition ) ) )? ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1606:1: (this_Addition_0= ruleAddition ( () '==' ( (lv_right_3_0= ruleAddition ) ) )? )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1606:1: (this_Addition_0= ruleAddition ( () '==' ( (lv_right_3_0= ruleAddition ) ) )? )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1607:5: this_Addition_0= ruleAddition ( () '==' ( (lv_right_3_0= ruleAddition ) ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getComparisonAccess().getAdditionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleAddition_in_ruleComparison3007);
            this_Addition_0=ruleAddition();
            _fsp--;

             
                    current = this_Addition_0; 
                    currentNode = currentNode.getParent();
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1615:1: ( () '==' ( (lv_right_3_0= ruleAddition ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==39) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1615:2: () '==' ( (lv_right_3_0= ruleAddition ) )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1615:2: ()
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1616:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0().getType().getClassifier());
                            try {
                            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                            } catch(ValueConverterException vce) {
                            	handleValueConverterException(vce);
                            }
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,39,FOLLOW_39_in_ruleComparison3026); 

                            createLeafNode(grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_1(), null); 
                        
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1635:1: ( (lv_right_3_0= ruleAddition ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1636:1: (lv_right_3_0= ruleAddition )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1636:1: (lv_right_3_0= ruleAddition )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1637:3: lv_right_3_0= ruleAddition
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getComparisonAccess().getRightAdditionParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAddition_in_ruleComparison3047);
                    lv_right_3_0=ruleAddition();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getComparisonRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"right",
                    	        		lv_right_3_0, 
                    	        		"Addition", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleComparison


    // $ANTLR start entryRuleAddition
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1667:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1668:2: (iv_ruleAddition= ruleAddition EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1669:2: iv_ruleAddition= ruleAddition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAdditionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition3085);
            iv_ruleAddition=ruleAddition();
            _fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition3095); 

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
    // $ANTLR end entryRuleAddition


    // $ANTLR start ruleAddition
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1676:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () '+' ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1681:6: ( (this_Multiplication_0= ruleMultiplication ( () '+' ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1682:1: (this_Multiplication_0= ruleMultiplication ( () '+' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1682:1: (this_Multiplication_0= ruleMultiplication ( () '+' ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1683:5: this_Multiplication_0= ruleMultiplication ( () '+' ( (lv_right_3_0= ruleMultiplication ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition3142);
            this_Multiplication_0=ruleMultiplication();
            _fsp--;

             
                    current = this_Multiplication_0; 
                    currentNode = currentNode.getParent();
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1691:1: ( () '+' ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==40) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1691:2: () '+' ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1691:2: ()
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1692:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,40,FOLLOW_40_in_ruleAddition3161); 

            	            createLeafNode(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1(), null); 
            	        
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1711:1: ( (lv_right_3_0= ruleMultiplication ) )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1712:1: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1712:1: (lv_right_3_0= ruleMultiplication )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1713:3: lv_right_3_0= ruleMultiplication
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition3182);
            	    lv_right_3_0=ruleMultiplication();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAdditionRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"right",
            	    	        		lv_right_3_0, 
            	    	        		"Multiplication", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAddition


    // $ANTLR start entryRuleMultiplication
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1743:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1744:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1745:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMultiplicationRule(), currentNode); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication3220);
            iv_ruleMultiplication=ruleMultiplication();
            _fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication3230); 

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
    // $ANTLR end entryRuleMultiplication


    // $ANTLR start ruleMultiplication
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1752:1: ruleMultiplication returns [EObject current=null] : (this_PostfixOperators_0= rulePostfixOperators ( () '*' ( (lv_right_3_0= rulePostfixOperators ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject this_PostfixOperators_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1757:6: ( (this_PostfixOperators_0= rulePostfixOperators ( () '*' ( (lv_right_3_0= rulePostfixOperators ) ) )* ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1758:1: (this_PostfixOperators_0= rulePostfixOperators ( () '*' ( (lv_right_3_0= rulePostfixOperators ) ) )* )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1758:1: (this_PostfixOperators_0= rulePostfixOperators ( () '*' ( (lv_right_3_0= rulePostfixOperators ) ) )* )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1759:5: this_PostfixOperators_0= rulePostfixOperators ( () '*' ( (lv_right_3_0= rulePostfixOperators ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getMultiplicationAccess().getPostfixOperatorsParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_rulePostfixOperators_in_ruleMultiplication3277);
            this_PostfixOperators_0=rulePostfixOperators();
            _fsp--;

             
                    current = this_PostfixOperators_0; 
                    currentNode = currentNode.getParent();
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1767:1: ( () '*' ( (lv_right_3_0= rulePostfixOperators ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1767:2: () '*' ( (lv_right_3_0= rulePostfixOperators ) )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1767:2: ()
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1768:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,16,FOLLOW_16_in_ruleMultiplication3296); 

            	            createLeafNode(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1(), null); 
            	        
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1787:1: ( (lv_right_3_0= rulePostfixOperators ) )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1788:1: (lv_right_3_0= rulePostfixOperators )
            	    {
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1788:1: (lv_right_3_0= rulePostfixOperators )
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1789:3: lv_right_3_0= rulePostfixOperators
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMultiplicationAccess().getRightPostfixOperatorsParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePostfixOperators_in_ruleMultiplication3317);
            	    lv_right_3_0=rulePostfixOperators();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getMultiplicationRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		set(
            	    	       			current, 
            	    	       			"right",
            	    	        		lv_right_3_0, 
            	    	        		"PostfixOperators", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMultiplication


    // $ANTLR start entryRulePostfixOperators
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1819:1: entryRulePostfixOperators returns [EObject current=null] : iv_rulePostfixOperators= rulePostfixOperators EOF ;
    public final EObject entryRulePostfixOperators() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixOperators = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1820:2: (iv_rulePostfixOperators= rulePostfixOperators EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1821:2: iv_rulePostfixOperators= rulePostfixOperators EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPostfixOperatorsRule(), currentNode); 
            pushFollow(FOLLOW_rulePostfixOperators_in_entryRulePostfixOperators3355);
            iv_rulePostfixOperators=rulePostfixOperators();
            _fsp--;

             current =iv_rulePostfixOperators; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePostfixOperators3365); 

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
    // $ANTLR end entryRulePostfixOperators


    // $ANTLR start rulePostfixOperators
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1828:1: rulePostfixOperators returns [EObject current=null] : (this_Atomic_0= ruleAtomic ( () '[' ( (lv_index_3_0= ruleExpr ) ) ']' )? ) ;
    public final EObject rulePostfixOperators() throws RecognitionException {
        EObject current = null;

        EObject this_Atomic_0 = null;

        EObject lv_index_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1833:6: ( (this_Atomic_0= ruleAtomic ( () '[' ( (lv_index_3_0= ruleExpr ) ) ']' )? ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1834:1: (this_Atomic_0= ruleAtomic ( () '[' ( (lv_index_3_0= ruleExpr ) ) ']' )? )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1834:1: (this_Atomic_0= ruleAtomic ( () '[' ( (lv_index_3_0= ruleExpr ) ) ']' )? )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1835:5: this_Atomic_0= ruleAtomic ( () '[' ( (lv_index_3_0= ruleExpr ) ) ']' )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getPostfixOperatorsAccess().getAtomicParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleAtomic_in_rulePostfixOperators3412);
            this_Atomic_0=ruleAtomic();
            _fsp--;

             
                    current = this_Atomic_0; 
                    currentNode = currentNode.getParent();
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1843:1: ( () '[' ( (lv_index_3_0= ruleExpr ) ) ']' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1843:2: () '[' ( (lv_index_3_0= ruleExpr ) ) ']'
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1843:2: ()
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1844:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getPostfixOperatorsAccess().getArrayAccessExprAction_1_0().getType().getClassifier());
                            try {
                            	factory.set(temp, "expr", current, null /*ParserRule*/, currentNode);
                            } catch(ValueConverterException vce) {
                            	handleValueConverterException(vce);
                            }
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getPostfixOperatorsAccess().getArrayAccessExprAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,32,FOLLOW_32_in_rulePostfixOperators3431); 

                            createLeafNode(grammarAccess.getPostfixOperatorsAccess().getLeftSquareBracketKeyword_1_1(), null); 
                        
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1863:1: ( (lv_index_3_0= ruleExpr ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1864:1: (lv_index_3_0= ruleExpr )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1864:1: (lv_index_3_0= ruleExpr )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1865:3: lv_index_3_0= ruleExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPostfixOperatorsAccess().getIndexExprParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_rulePostfixOperators3452);
                    lv_index_3_0=ruleExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPostfixOperatorsRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"index",
                    	        		lv_index_3_0, 
                    	        		"Expr", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,33,FOLLOW_33_in_rulePostfixOperators3462); 

                            createLeafNode(grammarAccess.getPostfixOperatorsAccess().getRightSquareBracketKeyword_1_3(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePostfixOperators


    // $ANTLR start entryRuleAtomic
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1899:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1900:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1901:2: iv_ruleAtomic= ruleAtomic EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAtomicRule(), currentNode); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic3500);
            iv_ruleAtomic=ruleAtomic();
            _fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic3510); 

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
    // $ANTLR end entryRuleAtomic


    // $ANTLR start ruleAtomic
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1908:1: ruleAtomic returns [EObject current=null] : ( ( () ( ( ruleQID ) ) ( '(' ( (lv_actuals_3_0= ruleExpr ) )? ( ',' ( (lv_actuals_5_0= ruleExpr ) ) )* ')' )? ) | ( () ( (lv_value_8_0= RULE_NUMBER ) ) ) | ( () ( (lv_value_10_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_8_0=null;
        Token lv_value_10_0=null;
        EObject lv_actuals_3_0 = null;

        EObject lv_actuals_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1913:6: ( ( ( () ( ( ruleQID ) ) ( '(' ( (lv_actuals_3_0= ruleExpr ) )? ( ',' ( (lv_actuals_5_0= ruleExpr ) ) )* ')' )? ) | ( () ( (lv_value_8_0= RULE_NUMBER ) ) ) | ( () ( (lv_value_10_0= RULE_STRING ) ) ) ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1914:1: ( ( () ( ( ruleQID ) ) ( '(' ( (lv_actuals_3_0= ruleExpr ) )? ( ',' ( (lv_actuals_5_0= ruleExpr ) ) )* ')' )? ) | ( () ( (lv_value_8_0= RULE_NUMBER ) ) ) | ( () ( (lv_value_10_0= RULE_STRING ) ) ) )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1914:1: ( ( () ( ( ruleQID ) ) ( '(' ( (lv_actuals_3_0= ruleExpr ) )? ( ',' ( (lv_actuals_5_0= ruleExpr ) ) )* ')' )? ) | ( () ( (lv_value_8_0= RULE_NUMBER ) ) ) | ( () ( (lv_value_10_0= RULE_STRING ) ) ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt20=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt20=2;
                }
                break;
            case RULE_STRING:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1914:1: ( ( () ( ( ruleQID ) ) ( '(' ( (lv_actuals_3_0= ruleExpr ) )? ( ',' ( (lv_actuals_5_0= ruleExpr ) ) )* ')' )? ) | ( () ( (lv_value_8_0= RULE_NUMBER ) ) ) | ( () ( (lv_value_10_0= RULE_STRING ) ) ) )", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1914:2: ( () ( ( ruleQID ) ) ( '(' ( (lv_actuals_3_0= ruleExpr ) )? ( ',' ( (lv_actuals_5_0= ruleExpr ) ) )* ')' )? )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1914:2: ( () ( ( ruleQID ) ) ( '(' ( (lv_actuals_3_0= ruleExpr ) )? ( ',' ( (lv_actuals_5_0= ruleExpr ) ) )* ')' )? )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1914:3: () ( ( ruleQID ) ) ( '(' ( (lv_actuals_3_0= ruleExpr ) )? ( ',' ( (lv_actuals_5_0= ruleExpr ) ) )* ')' )?
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1914:3: ()
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1915:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getAtomicAccess().getSymbolRefAction_0_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getAtomicAccess().getSymbolRefAction_0_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1925:2: ( ( ruleQID ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1926:1: ( ruleQID )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1926:1: ( ruleQID )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1927:3: ruleQID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getAtomicRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAtomicAccess().getSymbolSymbolCrossReference_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQID_in_ruleAtomic3568);
                    ruleQID();
                    _fsp--;

                     
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1941:2: ( '(' ( (lv_actuals_3_0= ruleExpr ) )? ( ',' ( (lv_actuals_5_0= ruleExpr ) ) )* ')' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==18) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1941:4: '(' ( (lv_actuals_3_0= ruleExpr ) )? ( ',' ( (lv_actuals_5_0= ruleExpr ) ) )* ')'
                            {
                            match(input,18,FOLLOW_18_in_ruleAtomic3579); 

                                    createLeafNode(grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_2_0(), null); 
                                
                            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1945:1: ( (lv_actuals_3_0= ruleExpr ) )?
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_STRING)) ) {
                                alt17=1;
                            }
                            switch (alt17) {
                                case 1 :
                                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1946:1: (lv_actuals_3_0= ruleExpr )
                                    {
                                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1946:1: (lv_actuals_3_0= ruleExpr )
                                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1947:3: lv_actuals_3_0= ruleExpr
                                    {
                                     
                                    	        currentNode=createCompositeNode(grammarAccess.getAtomicAccess().getActualsExprParserRuleCall_0_2_1_0(), currentNode); 
                                    	    
                                    pushFollow(FOLLOW_ruleExpr_in_ruleAtomic3600);
                                    lv_actuals_3_0=ruleExpr();
                                    _fsp--;


                                    	        if (current==null) {
                                    	            current = factory.create(grammarAccess.getAtomicRule().getType().getClassifier());
                                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                                    	        }
                                    	        try {
                                    	       		add(
                                    	       			current, 
                                    	       			"actuals",
                                    	        		lv_actuals_3_0, 
                                    	        		"Expr", 
                                    	        		currentNode);
                                    	        } catch (ValueConverterException vce) {
                                    				handleValueConverterException(vce);
                                    	        }
                                    	        currentNode = currentNode.getParent();
                                    	    

                                    }


                                    }
                                    break;

                            }

                            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1969:3: ( ',' ( (lv_actuals_5_0= ruleExpr ) ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==19) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1969:5: ',' ( (lv_actuals_5_0= ruleExpr ) )
                            	    {
                            	    match(input,19,FOLLOW_19_in_ruleAtomic3612); 

                            	            createLeafNode(grammarAccess.getAtomicAccess().getCommaKeyword_0_2_2_0(), null); 
                            	        
                            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1973:1: ( (lv_actuals_5_0= ruleExpr ) )
                            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1974:1: (lv_actuals_5_0= ruleExpr )
                            	    {
                            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1974:1: (lv_actuals_5_0= ruleExpr )
                            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:1975:3: lv_actuals_5_0= ruleExpr
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getAtomicAccess().getActualsExprParserRuleCall_0_2_2_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleExpr_in_ruleAtomic3633);
                            	    lv_actuals_5_0=ruleExpr();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getAtomicRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        try {
                            	    	       		add(
                            	    	       			current, 
                            	    	       			"actuals",
                            	    	        		lv_actuals_5_0, 
                            	    	        		"Expr", 
                            	    	        		currentNode);
                            	    	        } catch (ValueConverterException vce) {
                            	    				handleValueConverterException(vce);
                            	    	        }
                            	    	        currentNode = currentNode.getParent();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop18;
                                }
                            } while (true);

                            match(input,20,FOLLOW_20_in_ruleAtomic3645); 

                                    createLeafNode(grammarAccess.getAtomicAccess().getRightParenthesisKeyword_0_2_3(), null); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2002:6: ( () ( (lv_value_8_0= RULE_NUMBER ) ) )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2002:6: ( () ( (lv_value_8_0= RULE_NUMBER ) ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2002:7: () ( (lv_value_8_0= RULE_NUMBER ) )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2002:7: ()
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2003:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getAtomicAccess().getNumberLiteralAction_1_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getAtomicAccess().getNumberLiteralAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2013:2: ( (lv_value_8_0= RULE_NUMBER ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2014:1: (lv_value_8_0= RULE_NUMBER )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2014:1: (lv_value_8_0= RULE_NUMBER )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2015:3: lv_value_8_0= RULE_NUMBER
                    {
                    lv_value_8_0=(Token)input.LT(1);
                    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleAtomic3681); 

                    			createLeafNode(grammarAccess.getAtomicAccess().getValueNUMBERTerminalRuleCall_1_1_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAtomicRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_8_0, 
                    	        		"NUMBER", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2038:6: ( () ( (lv_value_10_0= RULE_STRING ) ) )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2038:6: ( () ( (lv_value_10_0= RULE_STRING ) ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2038:7: () ( (lv_value_10_0= RULE_STRING ) )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2038:7: ()
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2039:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getAtomicAccess().getStringLiteralAction_2_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getAtomicAccess().getStringLiteralAction_2_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2049:2: ( (lv_value_10_0= RULE_STRING ) )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2050:1: (lv_value_10_0= RULE_STRING )
                    {
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2050:1: (lv_value_10_0= RULE_STRING )
                    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2051:3: lv_value_10_0= RULE_STRING
                    {
                    lv_value_10_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomic3720); 

                    			createLeafNode(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAtomicRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_10_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAtomic


    // $ANTLR start entryRuleQID
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2081:1: entryRuleQID returns [String current=null] : iv_ruleQID= ruleQID EOF ;
    public final String entryRuleQID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQID = null;


        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2082:2: (iv_ruleQID= ruleQID EOF )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2083:2: iv_ruleQID= ruleQID EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQIDRule(), currentNode); 
            pushFollow(FOLLOW_ruleQID_in_entryRuleQID3763);
            iv_ruleQID=ruleQID();
            _fsp--;

             current =iv_ruleQID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQID3774); 

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
    // $ANTLR end entryRuleQID


    // $ANTLR start ruleQID
    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2090:1: ruleQID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2095:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2096:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2096:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2096:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQID3814); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getQIDAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2103:1: (kw= '.' this_ID_2= RULE_ID )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==15) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../expr/src-gen/expr/parser/antlr/internal/InternalExprDemo.g:2104:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,15,FOLLOW_15_in_ruleQID3833); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getQIDAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQID3848); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getQIDAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleQID


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleModel128 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModel152 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel169 = new BitSet(new long[]{0x0000004032824002L});
    public static final BitSet FOLLOW_ruleUsing_in_ruleModel195 = new BitSet(new long[]{0x0000004032824002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleModel218 = new BitSet(new long[]{0x0000004032820002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_ruleModel245 = new BitSet(new long[]{0x0000004032820002L});
    public static final BitSet FOLLOW_ruleUsing_in_entryRuleUsing283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsing293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleUsing328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleImportID_in_ruleUsing349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportID_in_entryRuleImportID386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportID397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImportID437 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleImportID456 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleImportID469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_ruleElement567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormula_in_ruleElement594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDecl_in_ruleElement621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssert_in_ruleElement648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_ruleElement675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclaration720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleFunctionDeclaration764 = new BitSet(new long[]{0x0000003C80000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleFunctionDeclaration785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionDeclaration802 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionDeclaration817 = new BitSet(new long[]{0x0000003C80100010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionDeclaration839 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionDeclaration850 = new BitSet(new long[]{0x0000003C80000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionDeclaration871 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionDeclaration885 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionDeclaration895 = new BitSet(new long[]{0x0000004032C00000L});
    public static final BitSet FOLLOW_ruleElement_in_ruleFunctionDeclaration916 = new BitSet(new long[]{0x0000004032C00000L});
    public static final BitSet FOLLOW_22_in_ruleFunctionDeclaration927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_entryRuleReturn963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturn973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleReturn1008 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleReturn1029 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleReturn1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameter1140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssert_in_entryRuleAssert1198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssert1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleAssert1243 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAssert1264 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAssert1274 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAssert1295 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleAssert1306 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAssert1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDecl_in_entryRuleEnumDecl1365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDecl1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleEnumDecl1410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDecl1427 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleEnumDecl1442 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_ruleEnumDecl1463 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_ruleEnumDecl1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumLiteral_in_entryRuleEnumLiteral1510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumLiteral1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumLiteral1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl1612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleVarDecl1666 = new BitSet(new long[]{0x0000003C80000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleVarDecl1687 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarDecl1704 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_30_in_ruleVarDecl1720 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleVarDecl1741 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleVarDecl1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleType1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_ruleType1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType1908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_rulePrimitiveType1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolType_in_rulePrimitiveType1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_rulePrimitiveType2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rulePrimitiveType2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_rulePrimitiveType2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_entryRuleArrayType2108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayType2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleArrayType2162 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleArrayType2172 = new BitSet(new long[]{0x0000003C80000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleArrayType2193 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleArrayType2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_entryRuleEnumType2239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumType2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumType2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_entryRuleIntType2326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntType2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleIntType2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolType_in_entryRuleBoolType2416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolType2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleBoolType2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatType_in_entryRuleFloatType2506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatType2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleFloatType2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType2596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleStringType2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormula_in_entryRuleFormula2686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormula2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleFormula2740 = new BitSet(new long[]{0x0000003C80000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleFormula2761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormula2778 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleFormula2793 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleFormula2814 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleFormula2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr2860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleExpr2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison2950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleComparison3007 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleComparison3026 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleComparison3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition3085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition3142 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleAddition3161 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition3182 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication3220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixOperators_in_ruleMultiplication3277 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleMultiplication3296 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulePostfixOperators_in_ruleMultiplication3317 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rulePostfixOperators_in_entryRulePostfixOperators3355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostfixOperators3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rulePostfixOperators3412 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_rulePostfixOperators3431 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleExpr_in_rulePostfixOperators3452 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_rulePostfixOperators3462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic3500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQID_in_ruleAtomic3568 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleAtomic3579 = new BitSet(new long[]{0x0000000000180070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomic3600 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleAtomic3612 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtomic3633 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_ruleAtomic3645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleAtomic3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomic3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQID_in_entryRuleQID3763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQID3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQID3814 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQID3833 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQID3848 = new BitSet(new long[]{0x0000000000008002L});

}