package com.vince.xq.parser;

import com.vince.xq.antrl4.SqlBaseVisitor;
import com.vince.xq.antrl4.SqlParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SqlSplitVisitor extends SqlBaseVisitor {
    private List<String> list = new ArrayList<String>();
    private boolean flag = true;

    private String sourceSQL;

    public SqlSplitVisitor(String sql) {
        this.sourceSQL = sql;
    }

    @Override
    public Object visitSelect_stmt(SqlParser.Select_stmtContext ctx) {

        if (ctx.fullselect_stmt() != null) {
            int size = ctx.fullselect_stmt().fullselect_stmt_item().size();
            for (int i = 0; i < size; i++) {
                int start = ctx.fullselect_stmt().fullselect_stmt_item().get(i).subselect_stmt().getStart().getStartIndex();
                int end = ctx.fullselect_stmt().fullselect_stmt_item().get(i).subselect_stmt().getStop().getStopIndex();
                System.out.println("=====================");
                System.out.println(sourceSQL.substring(start, end + 1));
                list.add(sourceSQL.substring(start, end + 1));
                System.out.println("=====================");
            }
        }
        return super.visitSelect_stmt(ctx);
    }

    public List<String> getSplitSQL() {
        return list;
    }
}
