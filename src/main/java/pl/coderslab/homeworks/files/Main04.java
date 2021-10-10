package pl.coderslab.homeworks.files;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {

        rewrite();
    }
    public static void rewrite(){
        System.out.println("write filename");

        Scanner scanner = new Scanner(System.in);

        Path path = Paths.get(scanner.nextLine());

        if(Files.exists(path)){

            Path path2 = Paths.get(path.toString().substring(0,path.toString().lastIndexOf('.'))+"_2"+".txt");
            try{
                List<String> list = new ArrayList<>();
                Files.createFile(path2);
                for (String line : Files.readAllLines(path)) {
                    list.add(line);
                }
                for (String line : Files.readAllLines(path)) {
                    list.add(line);
                }
                Files.write(path2,list);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
