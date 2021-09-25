package pl.coderslab.homeworks.multiarrays;


import java.util.Arrays;

public class Main02 {

    public static void main(String[] args) {

        int [][] arr = {
                {1,2,3},
                {6,5,4},
                {8,7,9}
        };

        System.out.println(Arrays.toString(minimum(arr)));

    }

    public static int[] minimum(int[][] arr){
        int [] res = new int[arr.length];
        int counter = 0;
        int max = Integer.MAX_VALUE;
        for (int i=0; i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j] <max){
                    max = arr[i][j];
                }

            }
            res[counter]=max;
            counter++;
            max = Integer.MAX_VALUE;
        }

        return res;

    }

}
