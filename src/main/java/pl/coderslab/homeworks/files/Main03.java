package pl.coderslab.homeworks.files;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {

        System.out.println(checkFileExist());
    }

    public static boolean checkFileExist(){
        System.out.println("write filename");
        Scanner scanner = new Scanner(System.in);


        Path path = Paths.get(scanner.nextLine());
        return Files.exists(path);
    }

}
