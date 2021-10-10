package pl.coderslab.homeworks.files;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {
        System.out.println(count("file1.txt"));

    }

    public static int count(String fileName){
        File file =new File(fileName);
        int counter =0;
        try(Scanner scanner = new Scanner(file)){

            while (scanner.hasNextLine()){
                for (char res : scanner.nextLine().toCharArray()){
                    counter++;
                }
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }


        return counter;
    }

}
