package com.example.basics.control_flow_statements;

public class CodeBlock {
    public static void main(String[] args) {

        int b = 12;
        int num = 100;

       {
          // long num = 1000; powoduje błąd //ta sama nazwa co wyżej
           long num2 = 1000; //nie powoduje błędu
            int a = 5;
            System.out.println(a);
           System.out.println(b);
          // System.out.println(c); powoduje błąd
        }

        int c = 7;

        int a = 99; // nie ma konfliktu nazw z zmienną a w bloku

        {
            int value = 9;
            {
                int volume = 100;
                {
                    System.out.println(value);
                    System.out.println(volume);
                    System.out.println(a); //99
                }

            }
        }

    }
}
