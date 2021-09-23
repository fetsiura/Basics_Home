package pl.coderslab.homeworks.arrays;


public class Main03 {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};

//        int check = 1;
        int check = 5;

        System.out.println(contains(arr,check));


    }
    public static boolean contains(int[] arr, int element){


        for(int i=0;i<arr.length;i++){
            if(element==arr[i]){
                return true;
            }
        }
        return false;
    }
}
