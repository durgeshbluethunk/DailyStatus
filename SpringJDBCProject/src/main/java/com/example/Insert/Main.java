package com.example.Insert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("My jdbc is connecting ...............");
        

       AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/example/insert/config.xml");
      
      JdbcTemplate template= context.getBean("jdbcTemplate", JdbcTemplate.class);
       System.out.println("file is getitng");
        //Insert query
        String sql = "INSERT INTO Emp VALUES(?,?,?,?,?)";
//fire query
        int result =  template.update(sql,232,"Durgesh","Durgesh@gmail","delhi","12/12/12");
        
        //int result =  template.update("INSERT INTO Emp (empName,empEmail) VALUES ('Durgesh1','Durgesh@gmail')");
        System.out.println("Number of record inserted.. "+result);
    }
}

