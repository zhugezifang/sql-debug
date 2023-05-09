package com.vince.xq;

import com.alibaba.fastjson.JSONObject;
import com.vince.xq.antrl4.SqlLexer;
import com.vince.xq.antrl4.SqlParser;
import com.vince.xq.parser.SqlSplitVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;


/**
 * (1)complex sql split
 * (2)create table
 * (3)log or debug
 * (4)delete table

 create database IF NOT EXISTS xq_test_db;
 use xq_test_db;
 create table tmp_api_call select * from dataService.api_call;

 * @throws Exception
 */

public class SqlDebug {
    public static void main(String[] args) {
        String name = "test_tag";

        String sql = "select * from (\n" +
                "select name,`age` from test_db.user_info_01\n" +
                "union ALL\n" +
                "select name,`age` from test_db.user_info_02\n" +
                "union ALL\n" +
                "select name,`age` from test_db.user_info_03\n" +
                ")t group by name,`age`";


        CharStream input = CharStreams.fromString(sql);
        SqlLexer lexer = new SqlLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SqlParser parser = new SqlParser(tokenStream);
        SqlSplitVisitor visitor = new SqlSplitVisitor(sql);
        visitor.visit(parser.program());
        List<String> list = visitor.getSplitSQL();

        LinkedHashMap<String, String> tableMap = new LinkedHashMap<>();
        List<String> createTableList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String tableName = "tmp_zeppelin_paragraph_1683297437359_1950110405_" + i;
            String createSql = "CREATE DATABASE IF NOT EXISTS test_zeppelin; use test_zeppelin;create table " + tableName + " as " + list.get(i);
            System.out.println("======createSql==========");
            System.out.println(createSql);
            System.out.println("======createSql==========");
            tableMap.put(tableName, createSql);
            createTableList.add(createSql);
        }
        System.out.println(JSONObject.toJSONString(tableMap));
    }
}
