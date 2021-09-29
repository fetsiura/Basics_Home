package pl.coderslab.homeworks.exceptions;


public class Main03 {

    public static void main(String[] args) {
        getLength("Jaro");
        getLength(null);

    }
    public static void getLength(String str){

        try {
          int  res=str.length();
            System.out.println(res);
        }catch (NullPointerException e){
            System.out.println("null");
        }
    }

}
