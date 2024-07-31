package com.example.myapp;

import java.util.*;

@FunctionalInterface
interface MySam {
    void show();
}

class A extends Object implements MySam {

    @Override
    public void show() {
    	
    }
}

public class program{
    public static void main(String[] args) {
        MySam m = () -> System.out.println("hi kanishkar");
        m.show();
    }
}
