/*
 * generated by Xtext
 */
package org.xtext.java.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.java.java.Arg_List;
import org.xtext.java.java.Bit_Expression;
import org.xtext.java.java.Cast_Expression;
import org.xtext.java.java.Class_declaration;
import org.xtext.java.java.Compilation_unit;
import org.xtext.java.java.Constructor_declaration;
import org.xtext.java.java.Creating_Expression;
import org.xtext.java.java.Do_Statement;
import org.xtext.java.java.Expression;
import org.xtext.java.java.Expression_aux;
import org.xtext.java.java.Field_declaration;
import org.xtext.java.java.Float_Literal;
import org.xtext.java.java.For_Statement;
import org.xtext.java.java.Head;
import org.xtext.java.java.If_Statement;
import org.xtext.java.java.Import_statement;
import org.xtext.java.java.Interface_declaration;
import org.xtext.java.java.JavaPackage;
import org.xtext.java.java.Literal_Expression;
import org.xtext.java.java.Logical_Expression;
import org.xtext.java.java.Method_declaration;
import org.xtext.java.java.Numeric_Expression;
import org.xtext.java.java.Package_statement;
import org.xtext.java.java.Parameter;
import org.xtext.java.java.Parameter_list;
import org.xtext.java.java.Statement;
import org.xtext.java.java.Statement_block;
import org.xtext.java.java.Static_initializer;
import org.xtext.java.java.Switch_Statement;
import org.xtext.java.java.Try_statement;
import org.xtext.java.java.Type;
import org.xtext.java.java.Type_declaration;
import org.xtext.java.java.Variable_declaration;
import org.xtext.java.java.Variable_declarator;
import org.xtext.java.java.Variable_initializer;
import org.xtext.java.java.While_Statement;
import org.xtext.java.services.JavaGrammarAccess;

@SuppressWarnings("all")
public class JavaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private JavaGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == JavaPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case JavaPackage.ARG_LIST:
				sequence_Arg_List(context, (Arg_List) semanticObject); 
				return; 
			case JavaPackage.BIT_EXPRESSION:
				sequence_Bit_Expression(context, (Bit_Expression) semanticObject); 
				return; 
			case JavaPackage.CAST_EXPRESSION:
				sequence_Cast_Expression(context, (Cast_Expression) semanticObject); 
				return; 
			case JavaPackage.CLASS_DECLARATION:
				sequence_Class_declaration(context, (Class_declaration) semanticObject); 
				return; 
			case JavaPackage.COMPILATION_UNIT:
				sequence_Compilation_unit(context, (Compilation_unit) semanticObject); 
				return; 
			case JavaPackage.CONSTRUCTOR_DECLARATION:
				sequence_Constructor_declaration(context, (Constructor_declaration) semanticObject); 
				return; 
			case JavaPackage.CREATING_EXPRESSION:
				sequence_Creating_Expression(context, (Creating_Expression) semanticObject); 
				return; 
			case JavaPackage.DO_STATEMENT:
				sequence_Do_Statement(context, (Do_Statement) semanticObject); 
				return; 
			case JavaPackage.EXPRESSION:
				sequence_Expression(context, (Expression) semanticObject); 
				return; 
			case JavaPackage.EXPRESSION_AUX:
				sequence_Expression_aux(context, (Expression_aux) semanticObject); 
				return; 
			case JavaPackage.FIELD_DECLARATION:
				sequence_Field_declaration(context, (Field_declaration) semanticObject); 
				return; 
			case JavaPackage.FLOAT_LITERAL:
				sequence_Float_Literal(context, (Float_Literal) semanticObject); 
				return; 
			case JavaPackage.FOR_STATEMENT:
				sequence_For_Statement(context, (For_Statement) semanticObject); 
				return; 
			case JavaPackage.HEAD:
				sequence_Head(context, (Head) semanticObject); 
				return; 
			case JavaPackage.IF_STATEMENT:
				sequence_If_Statement(context, (If_Statement) semanticObject); 
				return; 
			case JavaPackage.IMPORT_STATEMENT:
				sequence_Import_statement(context, (Import_statement) semanticObject); 
				return; 
			case JavaPackage.INTERFACE_DECLARATION:
				sequence_Interface_declaration(context, (Interface_declaration) semanticObject); 
				return; 
			case JavaPackage.LITERAL_EXPRESSION:
				sequence_Literal_Expression(context, (Literal_Expression) semanticObject); 
				return; 
			case JavaPackage.LOGICAL_EXPRESSION:
				sequence_Logical_Expression(context, (Logical_Expression) semanticObject); 
				return; 
			case JavaPackage.METHOD_DECLARATION:
				sequence_Method_declaration(context, (Method_declaration) semanticObject); 
				return; 
			case JavaPackage.NUMERIC_EXPRESSION:
				sequence_Numeric_Expression(context, (Numeric_Expression) semanticObject); 
				return; 
			case JavaPackage.PACKAGE_STATEMENT:
				sequence_Package_statement(context, (Package_statement) semanticObject); 
				return; 
			case JavaPackage.PARAMETER:
				sequence_Parameter(context, (Parameter) semanticObject); 
				return; 
			case JavaPackage.PARAMETER_LIST:
				sequence_Parameter_list(context, (Parameter_list) semanticObject); 
				return; 
			case JavaPackage.STATEMENT:
				sequence_Statement(context, (Statement) semanticObject); 
				return; 
			case JavaPackage.STATEMENT_BLOCK:
				sequence_Statement_block(context, (Statement_block) semanticObject); 
				return; 
			case JavaPackage.STATIC_INITIALIZER:
				sequence_Static_initializer(context, (Static_initializer) semanticObject); 
				return; 
			case JavaPackage.SWITCH_STATEMENT:
				sequence_Switch_Statement(context, (Switch_Statement) semanticObject); 
				return; 
			case JavaPackage.TRY_STATEMENT:
				sequence_Try_statement(context, (Try_statement) semanticObject); 
				return; 
			case JavaPackage.TYPE:
				sequence_Type(context, (Type) semanticObject); 
				return; 
			case JavaPackage.TYPE_DECLARATION:
				sequence_Type_declaration(context, (Type_declaration) semanticObject); 
				return; 
			case JavaPackage.VARIABLE_DECLARATION:
				sequence_Variable_declaration(context, (Variable_declaration) semanticObject); 
				return; 
			case JavaPackage.VARIABLE_DECLARATOR:
				sequence_Variable_declarator(context, (Variable_declarator) semanticObject); 
				return; 
			case JavaPackage.VARIABLE_INITIALIZER:
				sequence_Variable_initializer(context, (Variable_initializer) semanticObject); 
				return; 
			case JavaPackage.WHILE_STATEMENT:
				sequence_While_Statement(context, (While_Statement) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (expression=Expression expressions+=Expression*)
	 */
	protected void sequence_Arg_List(EObject context, Arg_List semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_Bit_Expression(EObject context, Bit_Expression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JavaPackage.Literals.BIT_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaPackage.Literals.BIT_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBit_ExpressionAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type expression=Expression)
	 */
	protected void sequence_Cast_Expression(EObject context, Cast_Expression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JavaPackage.Literals.CAST_EXPRESSION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaPackage.Literals.CAST_EXPRESSION__TYPE));
			if(transientValues.isValueTransient(semanticObject, JavaPackage.Literals.CAST_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaPackage.Literals.CAST_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCast_ExpressionAccess().getTypeTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getCast_ExpressionAccess().getExpressionExpressionParserRuleCall_3_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (modifiers+=Modifier* className=ID extend=Class_name? (implement=Interface_name implements+=Interface_name*)? fields+=Field_declaration*)
	 */
	protected void sequence_Class_declaration(EObject context, Class_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (package=Package_statement? imports+=Import_statement* type_declarations+=Type_declaration*)
	 */
	protected void sequence_Compilation_unit(EObject context, Compilation_unit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifiers+=Modifier* name=ID parameters=Parameter_list? statement=Statement_block)
	 */
	protected void sequence_Constructor_declaration(EObject context, Constructor_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((className=Class_name argList=Arg_List) | (typeSpecifier=Type_specifier expression=Expression?) | expression=Expression)
	 */
	protected void sequence_Creating_Expression(EObject context, Creating_Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statement=Statement expression=Expression)
	 */
	protected void sequence_Do_Statement(EObject context, Do_Statement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JavaPackage.Literals.DO_STATEMENT__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaPackage.Literals.DO_STATEMENT__STATEMENT));
			if(transientValues.isValueTransient(semanticObject, JavaPackage.Literals.DO_STATEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaPackage.Literals.DO_STATEMENT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDo_StatementAccess().getStatementStatementParserRuleCall_1_0(), semanticObject.getStatement());
		feeder.accept(grammarAccess.getDo_StatementAccess().getExpressionExpressionParserRuleCall_4_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (numericExpression=Numeric_Expression aux=Expression_aux) | 
	 *         (logicalExpression=Logical_Expression aux=Expression_aux) | 
	 *         (bitExpression=Bit_Expression aux=Expression_aux) | 
	 *         (castExpression=Cast_Expression aux=Expression_aux) | 
	 *         (creatingExpression=Creating_Expression aux=Expression_aux) | 
	 *         (literalExpression=Literal_Expression aux=Expression_aux) | 
	 *         (null='null' aux=Expression_aux) | 
	 *         (super='super' aux=Expression_aux) | 
	 *         (this='this' aux=Expression_aux) | 
	 *         (name=ID aux=Expression_aux)
	 *     )
	 */
	protected void sequence_Expression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Expression_aux}
	 */
	protected void sequence_Expression_aux(EObject context, Expression_aux semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((doc=DOC_COMMENT? (name=Variable_declaration | name=Constructor_declaration | name=Method_declaration)) | name=Static_initializer | debug=';')
	 */
	protected void sequence_Field_declaration(EObject context, Field_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (decimalDigits1=DECIMAL_DIGITS decimalDigits2=DECIMAL_DIGITS? exp=EXPOENT_PART? floatTypeSufix=FLOAT_TYPE_SUFIX?)
	 */
	protected void sequence_Float_Literal(EObject context, Float_Literal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((variable=Variable_declaration | pv=';' | expression=Expression) expression2=Expression? expression3=Expression? statement=Statement)
	 */
	protected void sequence_For_Statement(EObject context, For_Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     elements+=Compilation_unit
	 */
	protected void sequence_Head(EObject context, Head semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression statement=Statement elseStatement=Statement?)
	 */
	protected void sequence_If_Statement(EObject context, If_Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (classname=Class_name | packagename=Package_name)
	 */
	protected void sequence_Import_statement(EObject context, Import_statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifiers+=Modifier* interfaceName=ID (extend=Interface_name extends+=Interface_name*)?)
	 */
	protected void sequence_Interface_declaration(EObject context, Interface_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (exp=HEXA | exp1=DECIMAL_DIGITS | exp2=Float_Literal | string=STRING | char=CHAR)
	 */
	protected void sequence_Literal_Expression(EObject context, Literal_Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression | true=TRUE | false=FALSE)
	 */
	protected void sequence_Logical_Expression(EObject context, Logical_Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifiers+=Modifier* type=Type name=ID parameter=Parameter_list? (statement=Statement_block | debug=';'))
	 */
	protected void sequence_Method_declaration(EObject context, Method_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((sinal=MINUS | sinal=INCREMENT | sinal=DECREMENT) expression=Expression)
	 */
	protected void sequence_Numeric_Expression(EObject context, Numeric_Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=Package_name
	 */
	protected void sequence_Package_statement(EObject context, Package_statement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JavaPackage.Literals.PACKAGE_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaPackage.Literals.PACKAGE_STATEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPackage_statementAccess().getNamePackage_nameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type name=ID)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JavaPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaPackage.Literals.PARAMETER__TYPE));
			if(transientValues.isValueTransient(semanticObject, JavaPackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaPackage.Literals.PARAMETER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (parameter=Parameter parameters+=Parameter*)
	 */
	protected void sequence_Parameter_list(EObject context, Parameter_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((expression=Expression?) | (name=ID?) | (name=ID?))
	 */
	protected void sequence_Statement(EObject context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statements+=Statement*)
	 */
	protected void sequence_Statement_block(EObject context, Statement_block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (static=STATIC name=Statement_block)
	 */
	protected void sequence_Static_initializer(EObject context, Static_initializer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JavaPackage.Literals.STATIC_INITIALIZER__STATIC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaPackage.Literals.STATIC_INITIALIZER__STATIC));
			if(transientValues.isValueTransient(semanticObject, JavaPackage.Literals.STATIC_INITIALIZER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaPackage.Literals.STATIC_INITIALIZER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStatic_initializerAccess().getStaticSTATICTerminalRuleCall_0_0(), semanticObject.getStatic());
		feeder.accept(grammarAccess.getStatic_initializerAccess().getNameStatement_blockParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression (expressions+=Expression | statements+=Statement)*)
	 */
	protected void sequence_Switch_Statement(EObject context, Switch_Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (try=TRY tryStatement=Statement (catchs+=CATCH parameters+=Parameter catchStatements+=Statement)* (finally=FINALLY finallyStatement=Statement)?)
	 */
	protected void sequence_Try_statement(EObject context, Try_statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=Type_specifier
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JavaPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeAccess().getNameType_specifierParserRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (doc=DOC_COMMENT? (name=Class_declaration | name=Interface_declaration))
	 */
	protected void sequence_Type_declaration(EObject context, Type_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifiers+=Modifier* type=Type name=Variable_declarator names+=Variable_declarator*)
	 */
	protected void sequence_Variable_declaration(EObject context, Variable_declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID initializer=Variable_initializer?)
	 */
	protected void sequence_Variable_declarator(EObject context, Variable_declarator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_Variable_initializer(EObject context, Variable_initializer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JavaPackage.Literals.VARIABLE_INITIALIZER__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaPackage.Literals.VARIABLE_INITIALIZER__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariable_initializerAccess().getExpressionExpressionParserRuleCall_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression statement=Statement)
	 */
	protected void sequence_While_Statement(EObject context, While_Statement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JavaPackage.Literals.WHILE_STATEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaPackage.Literals.WHILE_STATEMENT__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, JavaPackage.Literals.WHILE_STATEMENT__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaPackage.Literals.WHILE_STATEMENT__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWhile_StatementAccess().getExpressionExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getWhile_StatementAccess().getStatementStatementParserRuleCall_4_0(), semanticObject.getStatement());
		feeder.finish();
	}
}
