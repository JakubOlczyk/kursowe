package com.example.basics.control_flow_statements;

public class ForEach {
    public static void main(String[] args) {

        String strArr[] = { "John", "Jessie", "Sam", "Courtney" };

        for(String str : strArr) {
            System.out.println(str);
        }

    }
}
