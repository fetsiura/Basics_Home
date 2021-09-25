package pl.coderslab.homeworks.multiarrays;


import java.util.Arrays;

public class Main03 {

    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {6,5,4},
                {8,7,9}
        };

        System.out.println(Arrays.toString(lessMore(arr)));

    }

    public static int[] lessMore(int[][] arr){
        int [] res = new int[2];

        int more = 0;
        int less =0;

        int sum =0;
        double quantity = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
                quantity++;
            }
        }

        double ave = sum/quantity;
        System.out.println(ave);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] < ave){
                    less++;
                } if(arr[i][j] > ave){
                    more++;
                }

            }
        }
        res[0] = less;
        res[1] = more;

        return res;
    }

}
