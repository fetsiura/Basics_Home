package pl.coderslab.homeworks.arrays;


import java.util.Arrays;

public class Main02 {

    public static void main(String[] args) {
        int [] arr = {1,2,3};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(append(arr)));


    }
    public static int[] append(int[] arr){
        int [] ret = new int[arr.length*2];
        int counter= 0;
        for (int i=0;i<arr.length;i++){

            ret[counter] = arr[i];
            counter++;
            if (counter==arr.length){
                for (int j = arr.length-1;j>=0;j--){
                    ret[counter] = arr[j];
                    counter++;
                }
            }
        }
        return ret;
    }
}
