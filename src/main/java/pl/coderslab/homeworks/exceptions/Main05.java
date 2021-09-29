package pl.coderslab.homeworks.exceptions;


import java.util.NoSuchElementException;

public class Main05 {

    public static void main(String[] args) {
        int [] arr = {1,2,3};
        System.out.println(indexOf(arr , 1));
        System.out.println(indexOf(arr , 10));

    }

    public static int indexOf(int[] elements, int value){
        int res =0;
        try {
            res = elements[value];
        }catch (NoSuchElementException e){
            e.printStackTrace();
            System.exit(0);
        }

         return res;
    }

}
