package  com.java.workshop;
import java.time.LocalDate;
import java.util.Scanner;
public class Agecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentyear=sc.nextInt();
        int birthyear=LocalDate.now().getYear();
        int age=currentyear-birthyear;
        System.out.println("Your age is:"+age);
    }

}
