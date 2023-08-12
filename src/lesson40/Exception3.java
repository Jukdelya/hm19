package lesson40;

import java.io.IOException;
import java.text.ParseException;

public class Exception3 {
    public static void main(String[] args){
        try{
            run();
        } catch (IOException | ParseException e){
            e.printStackTrace();
        }
    }
        public static void run() throws IOException, IllegalArgumentException, ParseException{
    }
}
