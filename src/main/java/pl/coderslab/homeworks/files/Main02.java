package pl.coderslab.homeworks.files;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {

        System.out.println(count("file1.txt"));

    }

    public static int count(String fileName){
        File file =new File(fileName);
        int counter =0;
        try(Scanner scanner = new Scanner(file)){

            while (scanner.hasNextLine()){
                String [] res = scanner.nextLine().split(" ");
                for (String val : res){
                    counter++;
                }
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }


        return counter;
    }

}
