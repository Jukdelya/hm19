package lesson37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args){
        File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("после сканера");
        } catch (FileNotFoundException e){
            System.out.println("Файл не был найден");
        }
        System.out.println("После блока try catch");
    }
}
