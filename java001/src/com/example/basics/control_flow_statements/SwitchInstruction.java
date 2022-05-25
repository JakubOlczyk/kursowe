package com.example.basics.control_flow_statements;

public class SwitchInstruction {

    enum CarVariant {SEDAN, COMBI, SPORT};

    public static void main(String[] args) {

        int num = 10;

        switch (num) {
            case 1:
                System.out.println(1);
                System.out.println(" ok");
                break;
            case 3:
                System.out.println(3);
                System.out.println(" ok");
                break;
            case 10:
                System.out.println(10);
                break;
            case 11:
                System.out.println(11);
                break;
            default:
                System.out.println("default: " + num);
        }


        String str = "John";
        switch (str){
            case "Ola":
                System.out.println("Ola");
                break;
            case "John":
                System.out.println("John");
                break;
            case "Lila":
                System.out.println("Lila");
                break;
            case "Andrew":
                System.out.println("Andrew");
                break;
            default:
                System.out.println("default: " + str);
        }


        CarVariant car = CarVariant.COMBI;
        switch (car) {
            case SEDAN:
                System.out.println(CarVariant.SEDAN);
                break;
            case COMBI:
                System.out.println(CarVariant.COMBI);
                break;
            case SPORT:
                System.out.println(CarVariant.SPORT);
                break;
            default:
                System.out.println("CarVariant:" + car);
        }



    }
}
