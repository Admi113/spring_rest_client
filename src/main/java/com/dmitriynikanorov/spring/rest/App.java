package com.dmitriynikanorov.spring.rest;

import com.dmitriynikanorov.spring.rest.configuration.Config;
import com.dmitriynikanorov.spring.rest.entity.Employee;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        Communication communication = context.getBean("communication",Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee emp = communication.getEmployees(5);
//        System.out.println(emp);

//        Employee employee = new Employee("Sveta","Sokolova","HR"
//                ,200);
//        employee.setId(66);
//        communication.seveEmployee(employee);

        communication.deleteEmployee(5);

    }
}
