package pl.coderslab.homeworks.datainput;


import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {
        printTriangle();

    }

    public static void printTriangle(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("write number");
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Only numbers");
        }
        int value = scanner.nextInt();

        for(int i =0;i<value;i++){
            String res ="";

            String row = "";//zmienna która jest zerowana na początku każdej iteracji, przechowująca gwiazdki z wiersza

            for (int j = 0; j < value; j++) {
                if (j>i) {
                    row += " ";}
                else { row += "X ";}
            }
            System.out.print(row + "\n");

        }
    }

}
