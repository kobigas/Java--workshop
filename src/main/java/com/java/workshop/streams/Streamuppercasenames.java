package com.java.workshop.streams;

import java.util.ArrayList;
import java.util.List;

public class Streamuppercasenames {
      public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Kobiga");
        names.add("Suguna");
        names.add("Ajeetha");
        names.add("Vinupriya"); 
        names.add("Shahana");
        names.add("Vinupriya"); 
        names.add("Madhuja");
        names.stream()
        .filter(name -> name.startsWith("S")||name.startsWith("s"))
        .distinct().map(String::toUpperCase).forEach(System.out::println);
}
}
