package com.java.workshop.streams;

import java.util.Arrays;
import java.util.List;

public class Listofmarks {
    public static void main(String[] args) {
         List<Integer> marks = Arrays.asList(10,12,14,16,18,16,33);
         List<Integer> sortmarks = marks.stream()
         .sorted()
         .toList();
         System.out.println("Sorted marks:"+sortmarks);
         List<Integer> reverseDec=marks.stream().sorted((a,b) ->b.compareTo(a)).toList();
         System.out.println("Reverse Sorted Marks:"+reverseDec);

    }

}
