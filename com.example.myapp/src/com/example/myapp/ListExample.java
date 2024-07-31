package com.example.myapp;

import java.util.ArrayList;
import java.util.List;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }

    @Override
    public String toString() {
        return "Student id=" + id + ", name='" + name + "'";
    }
}

public class ListExample {
    public static void main(String[] args) {
        List<Student> li = new ArrayList<Student>();
        li.add(new Student(11, "Kani"));
        li.add(new Student(12, "Ravi"));
        li.add(new Student(13, "Pragadesh"));
        li.forEach(s -> System.out.println(s)); // corrected here
    }
}
