// Generated from Sql.g4 by ANTLR 4.7.2

package com.vince.xq.antrl4;
 
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SqlParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SqlParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#begin_end_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_end_block(SqlParser.Begin_end_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#single_block_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_block_stmt(SqlParser.Single_block_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#block_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_end(SqlParser.Block_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#proc_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_block(SqlParser.Proc_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(SqlParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon_stmt(SqlParser.Semicolon_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#exception_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_block(SqlParser.Exception_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#exception_block_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_block_item(SqlParser.Exception_block_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#null_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_stmt(SqlParser.Null_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(SqlParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt(SqlParser.Assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_item(SqlParser.Assignment_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_single_item(SqlParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_multiple_item(SqlParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_select_item(SqlParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#allocate_cursor_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocate_cursor_stmt(SqlParser.Allocate_cursor_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#associate_locator_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociate_locator_stmt(SqlParser.Associate_locator_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#begin_transaction_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_transaction_stmt(SqlParser.Begin_transaction_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(SqlParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#call_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_stmt(SqlParser.Call_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#declare_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stmt(SqlParser.Declare_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#declare_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_block(SqlParser.Declare_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_block_inplace(SqlParser.Declare_block_inplaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stmt_item(SqlParser.Declare_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#declare_var_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_var_item(SqlParser.Declare_var_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#declare_condition_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_condition_item(SqlParser.Declare_condition_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#declare_cursor_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_cursor_item(SqlParser.Declare_cursor_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cursor_with_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_with_return(SqlParser.Cursor_with_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cursor_without_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_without_return(SqlParser.Cursor_without_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#declare_handler_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_handler_item(SqlParser.Declare_handler_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#declare_temporary_table_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_temporary_table_item(SqlParser.Declare_temporary_table_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(SqlParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_local_temp_table_stmt(SqlParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_table_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_definition(SqlParser.Create_table_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_table_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_columns(SqlParser.Create_table_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_columns_item(SqlParser.Create_table_columns_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_comment(SqlParser.Column_commentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SqlParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_column_inline_cons(SqlParser.Create_table_column_inline_consContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_column_cons(SqlParser.Create_table_column_consContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_fk_action(SqlParser.Create_table_fk_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions(SqlParser.Create_table_preoptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions_item(SqlParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions_td_item(SqlParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_table_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options(SqlParser.Create_table_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_table_options_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_item(SqlParser.Create_table_options_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_ora_item(SqlParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_db2_item(SqlParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_td_item(SqlParser.Create_table_options_td_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_hive_item(SqlParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_hive_row_format(SqlParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_hive_row_format_fields(SqlParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_mssql_item(SqlParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_mysql_item(SqlParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(SqlParser.Alter_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_table_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_item(SqlParser.Alter_table_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add_constraint(SqlParser.Alter_table_add_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#alter_table_add_constraint_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add_constraint_item(SqlParser.Alter_table_add_constraint_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype(SqlParser.DtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dtype_len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_len(SqlParser.Dtype_lenContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dtype_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_attr(SqlParser.Dtype_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dtype_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_default(SqlParser.Dtype_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_database_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_stmt(SqlParser.Create_database_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_database_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_option(SqlParser.Create_database_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_function_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_stmt(SqlParser.Create_function_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_function_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_return(SqlParser.Create_function_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_package_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_stmt(SqlParser.Create_package_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#package_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_spec(SqlParser.Package_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#package_spec_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_spec_item(SqlParser.Package_spec_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_body_stmt(SqlParser.Create_package_body_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#package_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body(SqlParser.Package_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#package_body_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body_item(SqlParser.Package_body_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_procedure_stmt(SqlParser.Create_procedure_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_routine_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_params(SqlParser.Create_routine_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_param_item(SqlParser.Create_routine_param_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_routine_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_options(SqlParser.Create_routine_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_routine_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_option(SqlParser.Create_routine_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#drop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_stmt(SqlParser.Drop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#end_transaction_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_transaction_stmt(SqlParser.End_transaction_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#exec_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_stmt(SqlParser.Exec_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(SqlParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_plsql_stmt(SqlParser.If_plsql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_tsql_stmt(SqlParser.If_tsql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_bteq_stmt(SqlParser.If_bteq_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#elseif_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_block(SqlParser.Elseif_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(SqlParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#include_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude_stmt(SqlParser.Include_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(SqlParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insert_stmt_cols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt_cols(SqlParser.Insert_stmt_colsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insert_stmt_rows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt_rows(SqlParser.Insert_stmt_rowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insert_stmt_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt_row(SqlParser.Insert_stmt_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#insert_directory_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_directory_stmt(SqlParser.Insert_directory_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#exit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_stmt(SqlParser.Exit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#get_diag_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt(SqlParser.Get_diag_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#get_diag_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt_item(SqlParser.Get_diag_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#get_diag_stmt_exception_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt_exception_item(SqlParser.Get_diag_stmt_exception_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#get_diag_stmt_rowcount_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt_rowcount_item(SqlParser.Get_diag_stmt_rowcount_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#grant_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_stmt(SqlParser.Grant_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#grant_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_stmt_item(SqlParser.Grant_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#leave_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeave_stmt(SqlParser.Leave_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#map_object_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_object_stmt(SqlParser.Map_object_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#open_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_stmt(SqlParser.Open_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fetch_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_stmt(SqlParser.Fetch_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#collect_stats_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollect_stats_stmt(SqlParser.Collect_stats_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#collect_stats_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollect_stats_clause(SqlParser.Collect_stats_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#close_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_stmt(SqlParser.Close_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cmp_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp_stmt(SqlParser.Cmp_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cmp_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp_source(SqlParser.Cmp_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_from_local_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_from_local_stmt(SqlParser.Copy_from_local_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_stmt(SqlParser.Copy_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_source(SqlParser.Copy_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_target(SqlParser.Copy_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_option(SqlParser.Copy_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#copy_file_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_file_option(SqlParser.Copy_file_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#commit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_stmt(SqlParser.Commit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_stmt(SqlParser.Create_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#create_index_col}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_col(SqlParser.Create_index_colContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#index_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_storage_clause(SqlParser.Index_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#index_mssql_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_mssql_storage_clause(SqlParser.Index_mssql_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(SqlParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#quit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuit_stmt(SqlParser.Quit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#raise_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_stmt(SqlParser.Raise_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#resignal_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResignal_stmt(SqlParser.Resignal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(SqlParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#rollback_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_stmt(SqlParser.Rollback_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#set_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_session_option(SqlParser.Set_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#set_current_schema_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_current_schema_option(SqlParser.Set_current_schema_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#set_mssql_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_mssql_session_option(SqlParser.Set_mssql_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#set_teradata_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_teradata_session_option(SqlParser.Set_teradata_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#signal_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal_stmt(SqlParser.Signal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#summary_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummary_stmt(SqlParser.Summary_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#truncate_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncate_stmt(SqlParser.Truncate_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#use_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_stmt(SqlParser.Use_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#values_into_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_into_stmt(SqlParser.Values_into_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(SqlParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#for_cursor_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_cursor_stmt(SqlParser.For_cursor_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#for_range_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_range_stmt(SqlParser.For_range_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(SqlParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#using_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_clause(SqlParser.Using_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(SqlParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_stmt(SqlParser.Cte_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_stmt_item(SqlParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#cte_select_cols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_cols(SqlParser.Cte_select_colsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_stmt(SqlParser.Fullselect_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_stmt_item(SqlParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_set_clause(SqlParser.Fullselect_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#subselect_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubselect_stmt(SqlParser.Subselect_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(SqlParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_list_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_set(SqlParser.Select_list_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_list_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_limit(SqlParser.Select_list_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_item(SqlParser.Select_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_list_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_alias(SqlParser.Select_list_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_asterisk(SqlParser.Select_list_asteriskContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause(SqlParser.Into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(SqlParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#from_table_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_clause(SqlParser.From_table_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_name_clause(SqlParser.From_table_name_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_subselect_clause(SqlParser.From_subselect_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#from_join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_join_clause(SqlParser.From_join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_join_type_clause(SqlParser.From_join_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_values_clause(SqlParser.From_table_values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#from_table_values_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_values_row(SqlParser.From_table_values_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#from_alias_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_alias_clause(SqlParser.From_alias_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(SqlParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(SqlParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_clause(SqlParser.Group_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(SqlParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#qualify_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualify_clause(SqlParser.Qualify_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(SqlParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_options(SqlParser.Select_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select_options_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_options_item(SqlParser.Select_options_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(SqlParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#update_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_assignment(SqlParser.Update_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#update_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_table(SqlParser.Update_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#update_upsert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_upsert(SqlParser.Update_upsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#merge_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_stmt(SqlParser.Merge_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#merge_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_table(SqlParser.Merge_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#merge_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_condition(SqlParser.Merge_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#merge_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_action(SqlParser.Merge_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(SqlParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#delete_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_alias(SqlParser.Delete_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#describe_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_stmt(SqlParser.Describe_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(SqlParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_atom(SqlParser.Bool_expr_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_unary(SqlParser.Bool_expr_unaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_single_in(SqlParser.Bool_expr_single_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_multi_in(SqlParser.Bool_expr_multi_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_binary(SqlParser.Bool_expr_binaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_logical_operator(SqlParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_binary_operator(SqlParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SqlParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expr_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_atom(SqlParser.Expr_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expr_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_interval(SqlParser.Expr_intervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#interval_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_item(SqlParser.Interval_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expr_concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concat(SqlParser.Expr_concatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expr_concat_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concat_item(SqlParser.Expr_concat_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expr_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case(SqlParser.Expr_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expr_case_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case_simple(SqlParser.Expr_case_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expr_case_searched}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case_searched(SqlParser.Expr_case_searchedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_cursor_attribute(SqlParser.Expr_cursor_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_agg_window_func(SqlParser.Expr_agg_window_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_all_distinct(SqlParser.Expr_func_all_distinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_over_clause(SqlParser.Expr_func_over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_partition_by_clause(SqlParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expr_spec_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_spec_func(SqlParser.Expr_spec_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expr_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func(SqlParser.Expr_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expr_func_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_params(SqlParser.Expr_func_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#func_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_param(SqlParser.Func_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expr_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_select(SqlParser.Expr_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expr_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_file(SqlParser.Expr_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#hive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHive(SqlParser.HiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#hive_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHive_item(SqlParser.Hive_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#host}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost(SqlParser.HostContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#host_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost_cmd(SqlParser.Host_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#host_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost_stmt(SqlParser.Host_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_name(SqlParser.File_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#date_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_literal(SqlParser.Date_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#timestamp_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp_literal(SqlParser.Timestamp_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(SqlParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link SqlParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_quotedString(SqlParser.Single_quotedStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link SqlParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_quotedString(SqlParser.Double_quotedStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#int_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_number(SqlParser.Int_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#dec_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_number(SqlParser.Dec_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(SqlParser.Bool_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#null_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_const(SqlParser.Null_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#non_reserved_words}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_reserved_words(SqlParser.Non_reserved_wordsContext ctx);
}