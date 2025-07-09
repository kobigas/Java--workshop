package com.java.workshop;
import java.time.LocalDate;
import java.util.Scanner;

public class DOB {
    public static void main(String[] args) {
    Scanner inputScanner = new Scanner(System.in);
    System.out.println("Enter your Date of birth(YYY-MM-DD):");
    String DateOfBirth=inputScanner.nextLine();
    LocalDate birthDate=LocalDate.parse(DateOfBirth);
    int YearOfBirth=birthDate.getYear();
    int currentYear=LocalDate.now().getYear();
    int age=currentYear-YearOfBirth;
    System.out.println("Your age is:"+age);
    }
}
