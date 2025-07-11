package com.java.workshop.streams;

import java.util.ArrayList;
import java.util.List;

public class Namestartwithscount {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Kobiga");
        names.add("Suguna");
        names.add("Ajeetha");
        names.add("Vinupriya");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
        names.add("Shahana");
        names.add("Madhuja");
        long nameCount=names.stream()
        .filter(name ->name.startsWith("S")).count();
        System.out.println(nameCount);
    }

}
