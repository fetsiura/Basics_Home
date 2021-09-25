package pl.coderslab.homeworks.multiarrays;


public class Main01 {

    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6}};
        System.out.println(oddSum(arr));

    }

    public static int oddSum(int[][] arr){
        int res =0;
        for (int i=0;i<arr.length;i++){
            for (int j =0;j<arr[i].length;j++){
                if(arr[i][j]%2 !=0){
                    res+=arr[i][j];
                }
            }
        }

            return res;
    }

}
