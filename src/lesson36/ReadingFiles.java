package lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "C:" + separator + "Users" + separator + "asus"
        + separator + "IdeaProjects" + separator + "homework19" + separator + "src" +separator + "Basic File";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }
}
