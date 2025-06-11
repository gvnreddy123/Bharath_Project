package com.infosys.health.collects;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.*;

public class VectorEx {
    public static void main(String[] args) {

       /* Set<String> objTreeSet = new LinkedHashSet();
        objTreeSet.add(100);
        objTreeSet.add("Test");
        objTreeSet.add(300);
        objTreeSet.add(null);
        objTreeSet.add(100);
        objTreeSet.add(200);
        objTreeSet.add(null);
        objTreeSet.add(300);
        System.out.println(objTreeSet);*/

        List employeeList= new ArrayList<>();
        TreeMapEx treeMapEx= new TreeMapEx();
        Employee employee1 = new Employee();
        employee1.setEmployeeName("Suresh");
        employee1.setEmployeeId(199);
        employeeList.add(employee1);
        employeeList.add(treeMapEx);
        Employee employee2 = new Employee();
        employee2.setEmployeeName("Mahesh");
        employee2.setEmployeeId(200);
        employeeList.add(employee2);
       // employeeList.stream().forEach(employee -> System.out.println(employee.getEmployeeId()+":"+employee.getEmployeeName()));



    }
}
