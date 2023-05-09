// Generated from Sql.g4 by ANTLR 4.7.2

package com.vince.xq.antrl4;
 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlParser}.
 */
public interface SqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SqlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SqlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SqlParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SqlParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#begin_end_block}.
	 * @param ctx the parse tree
	 */
	void enterBegin_end_block(SqlParser.Begin_end_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#begin_end_block}.
	 * @param ctx the parse tree
	 */
	void exitBegin_end_block(SqlParser.Begin_end_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#single_block_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSingle_block_stmt(SqlParser.Single_block_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#single_block_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSingle_block_stmt(SqlParser.Single_block_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#block_end}.
	 * @param ctx the parse tree
	 */
	void enterBlock_end(SqlParser.Block_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#block_end}.
	 * @param ctx the parse tree
	 */
	void exitBlock_end(SqlParser.Block_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#proc_block}.
	 * @param ctx the parse tree
	 */
	void enterProc_block(SqlParser.Proc_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#proc_block}.
	 * @param ctx the parse tree
	 */
	void exitProc_block(SqlParser.Proc_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SqlParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SqlParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon_stmt(SqlParser.Semicolon_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon_stmt(SqlParser.Semicolon_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#exception_block}.
	 * @param ctx the parse tree
	 */
	void enterException_block(SqlParser.Exception_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#exception_block}.
	 * @param ctx the parse tree
	 */
	void exitException_block(SqlParser.Exception_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#exception_block_item}.
	 * @param ctx the parse tree
	 */
	void enterException_block_item(SqlParser.Exception_block_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#exception_block_item}.
	 * @param ctx the parse tree
	 */
	void exitException_block_item(SqlParser.Exception_block_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#null_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNull_stmt(SqlParser.Null_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#null_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNull_stmt(SqlParser.Null_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(SqlParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(SqlParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt(SqlParser.Assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt(SqlParser.Assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_item(SqlParser.Assignment_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_item(SqlParser.Assignment_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_single_item(SqlParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_single_item(SqlParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_multiple_item(SqlParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_multiple_item(SqlParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_select_item(SqlParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_select_item(SqlParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#allocate_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAllocate_cursor_stmt(SqlParser.Allocate_cursor_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#allocate_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAllocate_cursor_stmt(SqlParser.Allocate_cursor_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#associate_locator_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssociate_locator_stmt(SqlParser.Associate_locator_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#associate_locator_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssociate_locator_stmt(SqlParser.Associate_locator_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#begin_transaction_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBegin_transaction_stmt(SqlParser.Begin_transaction_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#begin_transaction_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBegin_transaction_stmt(SqlParser.Begin_transaction_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(SqlParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(SqlParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCall_stmt(SqlParser.Call_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCall_stmt(SqlParser.Call_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#declare_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_stmt(SqlParser.Declare_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#declare_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_stmt(SqlParser.Declare_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_block(SqlParser.Declare_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_block(SqlParser.Declare_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_block_inplace(SqlParser.Declare_block_inplaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_block_inplace(SqlParser.Declare_block_inplaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_stmt_item(SqlParser.Declare_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_stmt_item(SqlParser.Declare_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#declare_var_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_var_item(SqlParser.Declare_var_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#declare_var_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_var_item(SqlParser.Declare_var_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#declare_condition_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_condition_item(SqlParser.Declare_condition_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#declare_condition_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_condition_item(SqlParser.Declare_condition_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#declare_cursor_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_cursor_item(SqlParser.Declare_cursor_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#declare_cursor_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_cursor_item(SqlParser.Declare_cursor_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#cursor_with_return}.
	 * @param ctx the parse tree
	 */
	void enterCursor_with_return(SqlParser.Cursor_with_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cursor_with_return}.
	 * @param ctx the parse tree
	 */
	void exitCursor_with_return(SqlParser.Cursor_with_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#cursor_without_return}.
	 * @param ctx the parse tree
	 */
	void enterCursor_without_return(SqlParser.Cursor_without_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cursor_without_return}.
	 * @param ctx the parse tree
	 */
	void exitCursor_without_return(SqlParser.Cursor_without_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#declare_handler_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_handler_item(SqlParser.Declare_handler_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#declare_handler_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_handler_item(SqlParser.Declare_handler_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#declare_temporary_table_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_temporary_table_item(SqlParser.Declare_temporary_table_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#declare_temporary_table_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_temporary_table_item(SqlParser.Declare_temporary_table_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(SqlParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(SqlParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_local_temp_table_stmt(SqlParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_local_temp_table_stmt(SqlParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_table_definition}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_definition(SqlParser.Create_table_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_table_definition}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_definition(SqlParser.Create_table_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_table_columns}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_columns(SqlParser.Create_table_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_table_columns}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_columns(SqlParser.Create_table_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_columns_item(SqlParser.Create_table_columns_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_columns_item(SqlParser.Create_table_columns_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_comment}.
	 * @param ctx the parse tree
	 */
	void enterColumn_comment(SqlParser.Column_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_comment}.
	 * @param ctx the parse tree
	 */
	void exitColumn_comment(SqlParser.Column_commentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(SqlParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(SqlParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_column_inline_cons(SqlParser.Create_table_column_inline_consContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_column_inline_cons(SqlParser.Create_table_column_inline_consContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_column_cons(SqlParser.Create_table_column_consContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_column_cons(SqlParser.Create_table_column_consContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_fk_action(SqlParser.Create_table_fk_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_fk_action(SqlParser.Create_table_fk_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preoptions(SqlParser.Create_table_preoptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preoptions(SqlParser.Create_table_preoptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preoptions_item(SqlParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preoptions_item(SqlParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preoptions_td_item(SqlParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preoptions_td_item(SqlParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_table_options}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options(SqlParser.Create_table_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_table_options}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options(SqlParser.Create_table_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_table_options_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_item(SqlParser.Create_table_options_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_table_options_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_item(SqlParser.Create_table_options_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_ora_item(SqlParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_ora_item(SqlParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_db2_item(SqlParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_db2_item(SqlParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_td_item(SqlParser.Create_table_options_td_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_td_item(SqlParser.Create_table_options_td_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_hive_item(SqlParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_hive_item(SqlParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_hive_row_format(SqlParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_hive_row_format(SqlParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_hive_row_format_fields(SqlParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_hive_row_format_fields(SqlParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_mssql_item(SqlParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_mssql_item(SqlParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_mysql_item(SqlParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_mysql_item(SqlParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(SqlParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(SqlParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_table_item}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_item(SqlParser.Alter_table_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_table_item}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_item(SqlParser.Alter_table_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add_constraint(SqlParser.Alter_table_add_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add_constraint(SqlParser.Alter_table_add_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alter_table_add_constraint_item}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add_constraint_item(SqlParser.Alter_table_add_constraint_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alter_table_add_constraint_item}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add_constraint_item(SqlParser.Alter_table_add_constraint_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dtype}.
	 * @param ctx the parse tree
	 */
	void enterDtype(SqlParser.DtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dtype}.
	 * @param ctx the parse tree
	 */
	void exitDtype(SqlParser.DtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dtype_len}.
	 * @param ctx the parse tree
	 */
	void enterDtype_len(SqlParser.Dtype_lenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dtype_len}.
	 * @param ctx the parse tree
	 */
	void exitDtype_len(SqlParser.Dtype_lenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dtype_attr}.
	 * @param ctx the parse tree
	 */
	void enterDtype_attr(SqlParser.Dtype_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dtype_attr}.
	 * @param ctx the parse tree
	 */
	void exitDtype_attr(SqlParser.Dtype_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dtype_default}.
	 * @param ctx the parse tree
	 */
	void enterDtype_default(SqlParser.Dtype_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dtype_default}.
	 * @param ctx the parse tree
	 */
	void exitDtype_default(SqlParser.Dtype_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_database_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_stmt(SqlParser.Create_database_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_database_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_stmt(SqlParser.Create_database_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_option(SqlParser.Create_database_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_option(SqlParser.Create_database_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_function_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_stmt(SqlParser.Create_function_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_function_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_stmt(SqlParser.Create_function_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_function_return}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_return(SqlParser.Create_function_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_function_return}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_return(SqlParser.Create_function_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_package_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package_stmt(SqlParser.Create_package_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_package_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package_stmt(SqlParser.Create_package_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void enterPackage_spec(SqlParser.Package_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void exitPackage_spec(SqlParser.Package_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#package_spec_item}.
	 * @param ctx the parse tree
	 */
	void enterPackage_spec_item(SqlParser.Package_spec_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#package_spec_item}.
	 * @param ctx the parse tree
	 */
	void exitPackage_spec_item(SqlParser.Package_spec_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package_body_stmt(SqlParser.Create_package_body_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package_body_stmt(SqlParser.Create_package_body_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#package_body}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body(SqlParser.Package_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#package_body}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body(SqlParser.Package_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#package_body_item}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body_item(SqlParser.Package_body_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#package_body_item}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body_item(SqlParser.Package_body_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_procedure_stmt(SqlParser.Create_procedure_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_procedure_stmt(SqlParser.Create_procedure_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_routine_params}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_params(SqlParser.Create_routine_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_routine_params}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_params(SqlParser.Create_routine_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_param_item(SqlParser.Create_routine_param_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_param_item(SqlParser.Create_routine_param_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_routine_options}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_options(SqlParser.Create_routine_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_routine_options}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_options(SqlParser.Create_routine_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_routine_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_option(SqlParser.Create_routine_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_routine_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_option(SqlParser.Create_routine_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_stmt(SqlParser.Drop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_stmt(SqlParser.Drop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#end_transaction_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEnd_transaction_stmt(SqlParser.End_transaction_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#end_transaction_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEnd_transaction_stmt(SqlParser.End_transaction_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#exec_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExec_stmt(SqlParser.Exec_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#exec_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExec_stmt(SqlParser.Exec_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(SqlParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(SqlParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_plsql_stmt(SqlParser.If_plsql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_plsql_stmt(SqlParser.If_plsql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_tsql_stmt(SqlParser.If_tsql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_tsql_stmt(SqlParser.If_tsql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_bteq_stmt(SqlParser.If_bteq_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_bteq_stmt(SqlParser.If_bteq_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#elseif_block}.
	 * @param ctx the parse tree
	 */
	void enterElseif_block(SqlParser.Elseif_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#elseif_block}.
	 * @param ctx the parse tree
	 */
	void exitElseif_block(SqlParser.Elseif_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(SqlParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(SqlParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#include_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInclude_stmt(SqlParser.Include_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#include_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInclude_stmt(SqlParser.Include_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(SqlParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(SqlParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insert_stmt_cols}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt_cols(SqlParser.Insert_stmt_colsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insert_stmt_cols}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt_cols(SqlParser.Insert_stmt_colsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insert_stmt_rows}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt_rows(SqlParser.Insert_stmt_rowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insert_stmt_rows}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt_rows(SqlParser.Insert_stmt_rowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insert_stmt_row}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt_row(SqlParser.Insert_stmt_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insert_stmt_row}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt_row(SqlParser.Insert_stmt_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#insert_directory_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_directory_stmt(SqlParser.Insert_directory_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#insert_directory_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_directory_stmt(SqlParser.Insert_directory_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExit_stmt(SqlParser.Exit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExit_stmt(SqlParser.Exit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#get_diag_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGet_diag_stmt(SqlParser.Get_diag_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#get_diag_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGet_diag_stmt(SqlParser.Get_diag_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#get_diag_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterGet_diag_stmt_item(SqlParser.Get_diag_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#get_diag_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitGet_diag_stmt_item(SqlParser.Get_diag_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#get_diag_stmt_exception_item}.
	 * @param ctx the parse tree
	 */
	void enterGet_diag_stmt_exception_item(SqlParser.Get_diag_stmt_exception_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#get_diag_stmt_exception_item}.
	 * @param ctx the parse tree
	 */
	void exitGet_diag_stmt_exception_item(SqlParser.Get_diag_stmt_exception_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#get_diag_stmt_rowcount_item}.
	 * @param ctx the parse tree
	 */
	void enterGet_diag_stmt_rowcount_item(SqlParser.Get_diag_stmt_rowcount_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#get_diag_stmt_rowcount_item}.
	 * @param ctx the parse tree
	 */
	void exitGet_diag_stmt_rowcount_item(SqlParser.Get_diag_stmt_rowcount_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#grant_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGrant_stmt(SqlParser.Grant_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#grant_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGrant_stmt(SqlParser.Grant_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#grant_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterGrant_stmt_item(SqlParser.Grant_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#grant_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitGrant_stmt_item(SqlParser.Grant_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#leave_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLeave_stmt(SqlParser.Leave_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#leave_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLeave_stmt(SqlParser.Leave_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#map_object_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMap_object_stmt(SqlParser.Map_object_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#map_object_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMap_object_stmt(SqlParser.Map_object_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#open_stmt}.
	 * @param ctx the parse tree
	 */
	void enterOpen_stmt(SqlParser.Open_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#open_stmt}.
	 * @param ctx the parse tree
	 */
	void exitOpen_stmt(SqlParser.Open_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fetch_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFetch_stmt(SqlParser.Fetch_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fetch_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFetch_stmt(SqlParser.Fetch_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#collect_stats_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCollect_stats_stmt(SqlParser.Collect_stats_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#collect_stats_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCollect_stats_stmt(SqlParser.Collect_stats_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#collect_stats_clause}.
	 * @param ctx the parse tree
	 */
	void enterCollect_stats_clause(SqlParser.Collect_stats_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#collect_stats_clause}.
	 * @param ctx the parse tree
	 */
	void exitCollect_stats_clause(SqlParser.Collect_stats_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#close_stmt}.
	 * @param ctx the parse tree
	 */
	void enterClose_stmt(SqlParser.Close_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#close_stmt}.
	 * @param ctx the parse tree
	 */
	void exitClose_stmt(SqlParser.Close_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#cmp_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCmp_stmt(SqlParser.Cmp_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cmp_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCmp_stmt(SqlParser.Cmp_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#cmp_source}.
	 * @param ctx the parse tree
	 */
	void enterCmp_source(SqlParser.Cmp_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cmp_source}.
	 * @param ctx the parse tree
	 */
	void exitCmp_source(SqlParser.Cmp_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#copy_from_local_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCopy_from_local_stmt(SqlParser.Copy_from_local_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#copy_from_local_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCopy_from_local_stmt(SqlParser.Copy_from_local_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#copy_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCopy_stmt(SqlParser.Copy_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#copy_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCopy_stmt(SqlParser.Copy_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#copy_source}.
	 * @param ctx the parse tree
	 */
	void enterCopy_source(SqlParser.Copy_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#copy_source}.
	 * @param ctx the parse tree
	 */
	void exitCopy_source(SqlParser.Copy_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#copy_target}.
	 * @param ctx the parse tree
	 */
	void enterCopy_target(SqlParser.Copy_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#copy_target}.
	 * @param ctx the parse tree
	 */
	void exitCopy_target(SqlParser.Copy_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#copy_option}.
	 * @param ctx the parse tree
	 */
	void enterCopy_option(SqlParser.Copy_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#copy_option}.
	 * @param ctx the parse tree
	 */
	void exitCopy_option(SqlParser.Copy_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#copy_file_option}.
	 * @param ctx the parse tree
	 */
	void enterCopy_file_option(SqlParser.Copy_file_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#copy_file_option}.
	 * @param ctx the parse tree
	 */
	void exitCopy_file_option(SqlParser.Copy_file_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommit_stmt(SqlParser.Commit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommit_stmt(SqlParser.Commit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(SqlParser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(SqlParser.Create_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#create_index_col}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_col(SqlParser.Create_index_colContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#create_index_col}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_col(SqlParser.Create_index_colContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#index_storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterIndex_storage_clause(SqlParser.Index_storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#index_storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitIndex_storage_clause(SqlParser.Index_storage_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#index_mssql_storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterIndex_mssql_storage_clause(SqlParser.Index_mssql_storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#index_mssql_storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitIndex_mssql_storage_clause(SqlParser.Index_mssql_storage_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(SqlParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(SqlParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#quit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterQuit_stmt(SqlParser.Quit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#quit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitQuit_stmt(SqlParser.Quit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaise_stmt(SqlParser.Raise_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaise_stmt(SqlParser.Raise_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#resignal_stmt}.
	 * @param ctx the parse tree
	 */
	void enterResignal_stmt(SqlParser.Resignal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#resignal_stmt}.
	 * @param ctx the parse tree
	 */
	void exitResignal_stmt(SqlParser.Resignal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(SqlParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(SqlParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRollback_stmt(SqlParser.Rollback_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRollback_stmt(SqlParser.Rollback_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#set_session_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_session_option(SqlParser.Set_session_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#set_session_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_session_option(SqlParser.Set_session_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#set_current_schema_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_current_schema_option(SqlParser.Set_current_schema_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#set_current_schema_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_current_schema_option(SqlParser.Set_current_schema_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#set_mssql_session_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_mssql_session_option(SqlParser.Set_mssql_session_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#set_mssql_session_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_mssql_session_option(SqlParser.Set_mssql_session_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#set_teradata_session_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_teradata_session_option(SqlParser.Set_teradata_session_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#set_teradata_session_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_teradata_session_option(SqlParser.Set_teradata_session_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#signal_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSignal_stmt(SqlParser.Signal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#signal_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSignal_stmt(SqlParser.Signal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#summary_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSummary_stmt(SqlParser.Summary_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#summary_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSummary_stmt(SqlParser.Summary_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#truncate_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTruncate_stmt(SqlParser.Truncate_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#truncate_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTruncate_stmt(SqlParser.Truncate_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#use_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUse_stmt(SqlParser.Use_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#use_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUse_stmt(SqlParser.Use_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#values_into_stmt}.
	 * @param ctx the parse tree
	 */
	void enterValues_into_stmt(SqlParser.Values_into_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#values_into_stmt}.
	 * @param ctx the parse tree
	 */
	void exitValues_into_stmt(SqlParser.Values_into_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(SqlParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(SqlParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#for_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_cursor_stmt(SqlParser.For_cursor_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#for_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_cursor_stmt(SqlParser.For_cursor_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#for_range_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_range_stmt(SqlParser.For_range_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#for_range_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_range_stmt(SqlParser.For_range_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(SqlParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(SqlParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void enterUsing_clause(SqlParser.Using_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void exitUsing_clause(SqlParser.Using_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(SqlParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(SqlParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCte_select_stmt(SqlParser.Cte_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCte_select_stmt(SqlParser.Cte_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterCte_select_stmt_item(SqlParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitCte_select_stmt_item(SqlParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#cte_select_cols}.
	 * @param ctx the parse tree
	 */
	void enterCte_select_cols(SqlParser.Cte_select_colsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#cte_select_cols}.
	 * @param ctx the parse tree
	 */
	void exitCte_select_cols(SqlParser.Cte_select_colsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_stmt(SqlParser.Fullselect_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_stmt(SqlParser.Fullselect_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_stmt_item(SqlParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_stmt_item(SqlParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_set_clause(SqlParser.Fullselect_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_set_clause(SqlParser.Fullselect_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#subselect_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSubselect_stmt(SqlParser.Subselect_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#subselect_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSubselect_stmt(SqlParser.Subselect_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(SqlParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(SqlParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_list_set}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_set(SqlParser.Select_list_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_list_set}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_set(SqlParser.Select_list_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_list_limit}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_limit(SqlParser.Select_list_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_list_limit}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_limit(SqlParser.Select_list_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_list_item}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_item(SqlParser.Select_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_list_item}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_item(SqlParser.Select_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_list_alias}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_alias(SqlParser.Select_list_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_list_alias}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_alias(SqlParser.Select_list_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_asterisk(SqlParser.Select_list_asteriskContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_asterisk(SqlParser.Select_list_asteriskContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause(SqlParser.Into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause(SqlParser.Into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(SqlParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(SqlParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#from_table_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_clause(SqlParser.From_table_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#from_table_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_clause(SqlParser.From_table_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_name_clause(SqlParser.From_table_name_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_name_clause(SqlParser.From_table_name_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_subselect_clause(SqlParser.From_subselect_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_subselect_clause(SqlParser.From_subselect_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#from_join_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_join_clause(SqlParser.From_join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#from_join_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_join_clause(SqlParser.From_join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_join_type_clause(SqlParser.From_join_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_join_type_clause(SqlParser.From_join_type_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_values_clause(SqlParser.From_table_values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_values_clause(SqlParser.From_table_values_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#from_table_values_row}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_values_row(SqlParser.From_table_values_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#from_table_values_row}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_values_row(SqlParser.From_table_values_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#from_alias_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_alias_clause(SqlParser.From_alias_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#from_alias_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_alias_clause(SqlParser.From_alias_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(SqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(SqlParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(SqlParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(SqlParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_clause(SqlParser.Group_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_clause(SqlParser.Group_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(SqlParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(SqlParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#qualify_clause}.
	 * @param ctx the parse tree
	 */
	void enterQualify_clause(SqlParser.Qualify_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#qualify_clause}.
	 * @param ctx the parse tree
	 */
	void exitQualify_clause(SqlParser.Qualify_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(SqlParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(SqlParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_options}.
	 * @param ctx the parse tree
	 */
	void enterSelect_options(SqlParser.Select_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_options}.
	 * @param ctx the parse tree
	 */
	void exitSelect_options(SqlParser.Select_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_options_item}.
	 * @param ctx the parse tree
	 */
	void enterSelect_options_item(SqlParser.Select_options_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_options_item}.
	 * @param ctx the parse tree
	 */
	void exitSelect_options_item(SqlParser.Select_options_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(SqlParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(SqlParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#update_assignment}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_assignment(SqlParser.Update_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#update_assignment}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_assignment(SqlParser.Update_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#update_table}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_table(SqlParser.Update_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#update_table}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_table(SqlParser.Update_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#update_upsert}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_upsert(SqlParser.Update_upsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#update_upsert}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_upsert(SqlParser.Update_upsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#merge_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMerge_stmt(SqlParser.Merge_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#merge_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMerge_stmt(SqlParser.Merge_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#merge_table}.
	 * @param ctx the parse tree
	 */
	void enterMerge_table(SqlParser.Merge_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#merge_table}.
	 * @param ctx the parse tree
	 */
	void exitMerge_table(SqlParser.Merge_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#merge_condition}.
	 * @param ctx the parse tree
	 */
	void enterMerge_condition(SqlParser.Merge_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#merge_condition}.
	 * @param ctx the parse tree
	 */
	void exitMerge_condition(SqlParser.Merge_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#merge_action}.
	 * @param ctx the parse tree
	 */
	void enterMerge_action(SqlParser.Merge_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#merge_action}.
	 * @param ctx the parse tree
	 */
	void exitMerge_action(SqlParser.Merge_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(SqlParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(SqlParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#delete_alias}.
	 * @param ctx the parse tree
	 */
	void enterDelete_alias(SqlParser.Delete_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#delete_alias}.
	 * @param ctx the parse tree
	 */
	void exitDelete_alias(SqlParser.Delete_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#describe_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_stmt(SqlParser.Describe_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#describe_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_stmt(SqlParser.Describe_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(SqlParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(SqlParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_atom(SqlParser.Bool_expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_atom(SqlParser.Bool_expr_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_unary(SqlParser.Bool_expr_unaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_unary(SqlParser.Bool_expr_unaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_single_in(SqlParser.Bool_expr_single_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_single_in(SqlParser.Bool_expr_single_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_multi_in(SqlParser.Bool_expr_multi_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_multi_in(SqlParser.Bool_expr_multi_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_binary(SqlParser.Bool_expr_binaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_binary(SqlParser.Bool_expr_binaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_logical_operator(SqlParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_logical_operator(SqlParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_binary_operator(SqlParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_binary_operator(SqlParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SqlParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SqlParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterExpr_atom(SqlParser.Expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitExpr_atom(SqlParser.Expr_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expr_interval}.
	 * @param ctx the parse tree
	 */
	void enterExpr_interval(SqlParser.Expr_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr_interval}.
	 * @param ctx the parse tree
	 */
	void exitExpr_interval(SqlParser.Expr_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#interval_item}.
	 * @param ctx the parse tree
	 */
	void enterInterval_item(SqlParser.Interval_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#interval_item}.
	 * @param ctx the parse tree
	 */
	void exitInterval_item(SqlParser.Interval_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expr_concat}.
	 * @param ctx the parse tree
	 */
	void enterExpr_concat(SqlParser.Expr_concatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr_concat}.
	 * @param ctx the parse tree
	 */
	void exitExpr_concat(SqlParser.Expr_concatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expr_concat_item}.
	 * @param ctx the parse tree
	 */
	void enterExpr_concat_item(SqlParser.Expr_concat_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr_concat_item}.
	 * @param ctx the parse tree
	 */
	void exitExpr_concat_item(SqlParser.Expr_concat_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expr_case}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case(SqlParser.Expr_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr_case}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case(SqlParser.Expr_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expr_case_simple}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case_simple(SqlParser.Expr_case_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr_case_simple}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case_simple(SqlParser.Expr_case_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expr_case_searched}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case_searched(SqlParser.Expr_case_searchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr_case_searched}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case_searched(SqlParser.Expr_case_searchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 */
	void enterExpr_cursor_attribute(SqlParser.Expr_cursor_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 */
	void exitExpr_cursor_attribute(SqlParser.Expr_cursor_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_agg_window_func(SqlParser.Expr_agg_window_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_agg_window_func(SqlParser.Expr_agg_window_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_all_distinct(SqlParser.Expr_func_all_distinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_all_distinct(SqlParser.Expr_func_all_distinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_over_clause(SqlParser.Expr_func_over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_over_clause(SqlParser.Expr_func_over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_partition_by_clause(SqlParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_partition_by_clause(SqlParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expr_spec_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_spec_func(SqlParser.Expr_spec_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr_spec_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_spec_func(SqlParser.Expr_spec_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expr_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func(SqlParser.Expr_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func(SqlParser.Expr_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expr_func_params}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_params(SqlParser.Expr_func_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr_func_params}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_params(SqlParser.Expr_func_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#func_param}.
	 * @param ctx the parse tree
	 */
	void enterFunc_param(SqlParser.Func_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#func_param}.
	 * @param ctx the parse tree
	 */
	void exitFunc_param(SqlParser.Func_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expr_select}.
	 * @param ctx the parse tree
	 */
	void enterExpr_select(SqlParser.Expr_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr_select}.
	 * @param ctx the parse tree
	 */
	void exitExpr_select(SqlParser.Expr_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expr_file}.
	 * @param ctx the parse tree
	 */
	void enterExpr_file(SqlParser.Expr_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expr_file}.
	 * @param ctx the parse tree
	 */
	void exitExpr_file(SqlParser.Expr_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#hive}.
	 * @param ctx the parse tree
	 */
	void enterHive(SqlParser.HiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#hive}.
	 * @param ctx the parse tree
	 */
	void exitHive(SqlParser.HiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#hive_item}.
	 * @param ctx the parse tree
	 */
	void enterHive_item(SqlParser.Hive_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#hive_item}.
	 * @param ctx the parse tree
	 */
	void exitHive_item(SqlParser.Hive_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#host}.
	 * @param ctx the parse tree
	 */
	void enterHost(SqlParser.HostContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#host}.
	 * @param ctx the parse tree
	 */
	void exitHost(SqlParser.HostContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#host_cmd}.
	 * @param ctx the parse tree
	 */
	void enterHost_cmd(SqlParser.Host_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#host_cmd}.
	 * @param ctx the parse tree
	 */
	void exitHost_cmd(SqlParser.Host_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#host_stmt}.
	 * @param ctx the parse tree
	 */
	void enterHost_stmt(SqlParser.Host_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#host_stmt}.
	 * @param ctx the parse tree
	 */
	void exitHost_stmt(SqlParser.Host_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#file_name}.
	 * @param ctx the parse tree
	 */
	void enterFile_name(SqlParser.File_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#file_name}.
	 * @param ctx the parse tree
	 */
	void exitFile_name(SqlParser.File_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void enterDate_literal(SqlParser.Date_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void exitDate_literal(SqlParser.Date_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#timestamp_literal}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp_literal(SqlParser.Timestamp_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#timestamp_literal}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp_literal(SqlParser.Timestamp_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(SqlParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(SqlParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link SqlParser#string}.
	 * @param ctx the parse tree
	 */
	void enterSingle_quotedString(SqlParser.Single_quotedStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link SqlParser#string}.
	 * @param ctx the parse tree
	 */
	void exitSingle_quotedString(SqlParser.Single_quotedStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link SqlParser#string}.
	 * @param ctx the parse tree
	 */
	void enterDouble_quotedString(SqlParser.Double_quotedStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link SqlParser#string}.
	 * @param ctx the parse tree
	 */
	void exitDouble_quotedString(SqlParser.Double_quotedStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#int_number}.
	 * @param ctx the parse tree
	 */
	void enterInt_number(SqlParser.Int_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#int_number}.
	 * @param ctx the parse tree
	 */
	void exitInt_number(SqlParser.Int_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#dec_number}.
	 * @param ctx the parse tree
	 */
	void enterDec_number(SqlParser.Dec_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#dec_number}.
	 * @param ctx the parse tree
	 */
	void exitDec_number(SqlParser.Dec_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(SqlParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(SqlParser.Bool_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#null_const}.
	 * @param ctx the parse tree
	 */
	void enterNull_const(SqlParser.Null_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#null_const}.
	 * @param ctx the parse tree
	 */
	void exitNull_const(SqlParser.Null_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#non_reserved_words}.
	 * @param ctx the parse tree
	 */
	void enterNon_reserved_words(SqlParser.Non_reserved_wordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#non_reserved_words}.
	 * @param ctx the parse tree
	 */
	void exitNon_reserved_words(SqlParser.Non_reserved_wordsContext ctx);
}