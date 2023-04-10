package com.vince.xq;

import com.alibaba.fastjson.JSONObject;
import com.vince.xq.antrl4.HiveSqlLexer;
import com.vince.xq.antrl4.HiveSqlParser;
import com.vince.xq.parser.HiveSplitVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class SqlDebug {
    public static void main(String[] args) {
        String name = "test_tag";

        String sql = "select main_device,\n" +
                "       related_device,\n" +
                "       platform\n" +
                "from\n" +
                "  (select main_device,\n" +
                "          related_device,\n" +
                "          passport_id,\n" +
                "          platform,\n" +
                "          row_number() over (partition by main_device\n" +
                "                             order by main_date, related_date desc) as rn\n" +
                "   from\n" +
                "     (select a.user_id as main_device,\n" +
                "             max (a.passport_id) as passport_id,\n" +
                "                 b.user_id as related_device,\n" +
                "                 max(a.last_login_date) as main_date,\n" +
                "                 max(b.last_login_date) as related_date,\n" +
                "                 b.platform\n" +
                "      from\n" +
                "        (select user_id,\n" +
                "                passport_id,\n" +
                "                max(dt) as last_login_date\n" +
                "         from test.table1\n" +
                "         where dt > '2023-03-28'\n" +
                "           and dt <= '2023-04-06'\n" +
                "           and platform in ('tv')\n" +
                "           and length(user_id) > 30\n" +
                "           and length(user_id) <=70\n" +
                "           and passport_id is not null\n" +
                "           and user_id regexp '^tv_[0-9a-z]{32}_[0-9]+(_[0-9]+)?$'\n" +
                "         group by user_id,\n" +
                "                  passport_id) a\n" +
                "      join\n" +
                "        (select user_id,\n" +
                "                passport_id,\n" +
                "                max(dt) as last_login_date,\n" +
                "                case\n" +
                "                    when platform in ('android',\n" +
                "                                      'ios') then 'mobile'\n" +
                "                    else platform\n" +
                "                end as platform\n" +
                "         from test.table1\n" +
                "         where dt > '2023-03-28'\n" +
                "           and dt <= '2023-04-06'\n" +
                "           and passport_id is not null\n" +
                "         group by user_id,\n" +
                "                  passport_id,\n" +
                "                  case\n" +
                "                      when platform in ('android',\n" +
                "                                        'ios') then 'mobile'\n" +
                "                      else platform\n" +
                "                  end) b on a.passport_id = b.passport_id where a.user_id != b.user_id\n" +
                "      group by a.user_id,\n" +
                "               b.user_id,\n" +
                "               b.platform) c) d\n" +
                "where rn <= 10";
        CharStream input = CharStreams.fromString(sql);
        HiveSqlLexer lexer = new HiveSqlLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        HiveSqlParser parser = new HiveSqlParser(tokenStream);
        HiveSplitVisitor visitor = new HiveSplitVisitor(sql);
        visitor.visit(parser.program());
        List<String> list = visitor.getSplitSQL();

        LinkedHashMap<String, String> tableMap = new LinkedHashMap<>();
        List<String> createTableList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String tableName = "test.tmp_" + name + "_" + i;
            String createSql = "use test;create table " + tableName + " as " + list.get(i);
            System.out.println("======createSql==========");
            System.out.println(createSql);
            System.out.println("======createSql==========");
            tableMap.put(tableName, createSql);
            createTableList.add(createSql);
        }
        System.out.println(JSONObject.toJSONString(tableMap));
    }
}
