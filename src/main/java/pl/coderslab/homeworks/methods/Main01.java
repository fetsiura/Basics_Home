package pl.coderslab.homeworks.methods;


public class Main01 {

    public static void main(String[] args) {
        System.out.println(dogAge(5));
        System.out.println(dogAge(1.5));

    }

    public static double dogAge(double dogAge){
        double age  =0;

        if(dogAge>2) {
            age = 2*10.5 + ((dogAge-2)*4);
        }
        if(dogAge<2){
            age = dogAge*10.5;
        }

        return age;
    }

}
