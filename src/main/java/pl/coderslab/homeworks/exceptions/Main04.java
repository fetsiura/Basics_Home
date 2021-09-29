package pl.coderslab.homeworks.exceptions;


public class Main04 {

    public static void main(String[] args) {

        System.out.println(toInt("123"));
        System.out.println(toInt("greg"));
    }

    public static int toInt(String str){
        int res=0;
        try {
            res = Integer.parseInt(str);
        }catch (NumberFormatException e){
            e.printStackTrace();
            System.exit(0);
        }

        return res;
    }

}
