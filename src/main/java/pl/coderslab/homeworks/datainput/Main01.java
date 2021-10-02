package pl.coderslab.homeworks.datainput;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main01 {
    public static String [] arr = new String[0];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz: Imię Nazwisko Rok Urodzenia i Płeć");
        String [] people= new String[0];


        while (!scanner.hasNext("quit")){
            people = Arrays.copyOf(people,people.length+1);
            people[people.length-1]=scanner.nextLine();
        }
        System.out.println(Arrays.toString(people));

        System.out.println("osoby do emerytury");

        String[] retirement = new String[0];

        for(int i=0;i<people.length;i++){

            String [] re = people[i].split(" ");

            if(re[3].equals("K") && Integer.parseInt(re[2]) <= 1960){
                retirement=Arrays.copyOf(retirement,retirement.length+1);
                retirement[retirement.length-1]=people[i];
            }
            if(re[3].equals("M") && Integer.parseInt(re[2]) <= 1955){
                retirement=Arrays.copyOf(retirement,retirement.length+1);
                retirement[retirement.length-1]=people[i];
            }

        }

        System.out.println(Arrays.toString(retirement));

    }

}
