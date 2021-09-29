package pl.coderslab.homeworks.exceptions;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Main02 {

    public static void main(String[] args) {
        String [] arr = {"1","2","g"};

        System.out.println(safeGet(arr,1));
        System.out.println(safeGet(arr,10));

    }
    public static String safeGet(String[] strTab, int index){
        String str = "";
        try {
            str = strTab[index];
        }catch (IndexOutOfBoundsException e){
            System.out.println("niema takiego");
        }

        return str;
    }
}
