package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("My jdbc is connecting ...............");
        

        ApplicationContext context = new ClassPathXmlApplicationContext("org/example/config.xml");
        System.out.println("file is getitng");
//        JdbcTemplate template= context.getBean("jdbcTemplate", JdbcTemplate.class);
//        //Insert query
//        String sql = "INSERT INTO Emp VALUES(?,?)";
////fire query
//        int result =  template.update(sql,"durgesh","Durgesh@gmail");
//        System.out.println("Number of record inserted.. "+result);
    }
}

