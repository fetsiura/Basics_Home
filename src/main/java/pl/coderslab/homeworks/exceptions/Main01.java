package pl.coderslab.homeworks.exceptions;


import java.util.IllegalFormatException;

public class Main01 {

    public static void main(String[] args) {
    average("10","2");
    average("10","re");
    average("10","0");

    }

    public static void average(String a, String b){

        try {
            int res = Integer.parseInt(a)/Integer.parseInt(b);
            System.out.println(res);
        }catch (ArithmeticException e){
            e.printStackTrace();
        } finally {
            System.out.println("Always");
        }
    }

}
