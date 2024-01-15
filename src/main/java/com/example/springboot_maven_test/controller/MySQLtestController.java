package com.example.springboot_maven_test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

@RestController
public class MySQLtestController {

    @Autowired
    private DataSource dataSource; // 注入数据源

    @GetMapping("/getUser")
    public List<String> getInittestData() {
        List<String> result = new ArrayList<>();
        try (Connection connection = dataSource.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM inittest");
            while (resultSet.next()) {
                result.add(resultSet.getString("column_name")); // 替换成你需要获取的列名
            }
        } catch (Exception e) {
            // 处理异常
        }
        return result;
    }
}
