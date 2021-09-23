package pl.coderslab.homeworks.arrays;


import java.util.Arrays;

public class Main01 {

    public static void main(String[] args) {
        int[] arr = {333, 333, 1, 1, 2};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(onlyUniqueElements(arr)));
    }

    public static int[] onlyUniqueElements(int[] arr) {
        Arrays.sort(arr);
        int lastI = arr[0];
        int counter = 1;
        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];
            if (lastI != num) {
                lastI = num;
                arr[counter++] = num;
            }
        }
        return Arrays.copyOf(arr, counter);
    }
}
