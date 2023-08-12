package lesson38;

import java.io.IOException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int a = Integer.parseInt(scanner.nextLine());
            if(a != 0){
                try {
                    throw new IOException();
                } catch (IOException e){
                    System.out.println("Почему не ноль");
                }
            }
        }
    }
}