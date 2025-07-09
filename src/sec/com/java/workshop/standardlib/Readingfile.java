package src.sec.com.java.workshop.standardlib; 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Readingfile {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("E:\\kobiga\\Java--workshop\\src\\sec\\com\\java\\workshop\\Append.java")))
        {
            String line;
            while((line = reader.readLine())!=null){
                System.out.println("line");
            }
        }catch(IOException e){
            System.out.println("An error occured while reading the file"+e.getMessage());
        }
    }

}
