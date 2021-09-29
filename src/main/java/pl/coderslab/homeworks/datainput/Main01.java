package pl.coderslab.homeworks.datainput;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main01 {
    public static String [] arr = new String[0];
    public static void main(String[] args) {
        getPhra();

        System.out.println(Arrays.toString(arr));


    }

    public static void  getPhra() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write surname");
        String surname = scanner.nextLine();
        System.out.println("Write name");
        String name = scanner.nextLine();

        System.out.println("Write year of birth");

        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("only number");
        }
        int year = scanner.nextInt();

        String gender = "";
        System.out.println("Write gender  -  only k or m");
        do {
            gender = scanner.nextLine();

        } while (!(gender.equals("k") || gender.equals("m")));

        String input ="";

        do {
            input = scanner.nextLine();
            if(!input.equals("quit")){
                System.out.println(input);
            }

        } while (!input.equals("quit"));
        String res = String.join(" ", surname,name,String.valueOf(year),gender);

        arr = Arrays.copyOf(arr,arr.length+1);
        arr[arr.length-1] = res;
    }

}
