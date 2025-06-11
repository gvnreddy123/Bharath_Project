package com.infosys.health.collects;


import com.infosys.health.Student;

import java.io.*;

public class StudentMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("test.ser"));
        Student student = new Student();
        student.setStudentId(1001);
        student.setStudentName("Bharath");
        objectOutputStream.writeObject(student);

        ObjectInputStream objectInputStream1= new ObjectInputStream(new FileInputStream("test.ser"));
        Student student1=(Student)objectInputStream1.readObject();
        System.out.println("StudentId is::"+student1.getStudentId()+"      StudentName is::"+student1.getStudentName());
    }
}
