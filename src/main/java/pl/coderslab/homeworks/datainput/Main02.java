package pl.coderslab.homeworks.datainput;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortedArray()));
    }

    public static int[] sortedArray(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("write number");
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Only numbers");
        }

        int res = scanner.nextInt();
        int [] arr = new int[res];

        for(int i=0; i<arr.length;i++){
            arr[i]=random.nextInt(101);
        }
        Arrays.sort(arr);
        return arr;
    }

}
