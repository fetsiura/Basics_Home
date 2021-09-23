package pl.coderslab.homeworks.methods;


public class Main02 {

    public static void main(String[] args) {
        System.out.println(divisibleBy(4,2));
        System.out.println(divisibleBy(1,2));

    }
    public static boolean divisibleBy(int a, int b ){
        if(a%b == 0){
            return  true;
        } else {
            return false;
        }
    }
}
