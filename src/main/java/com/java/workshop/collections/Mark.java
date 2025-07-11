package com.java.workshop.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Mark {
    public static void main(String[] args) {
        List<Integer>marks = new ArrayList<>();
        marks.add(89);
        marks.add(65);
        marks.add(80);
        marks.add(99);
        marks.add(70);
        System.out.println("Marks:"+marks);
        marks.sort(Comparator.naturalOrder());
        System.out.println("Sorted marks:"+marks);
        marks.sort(Comparator.reverseOrder());
        System.out.println("Reverse sorted marks:"+marks);
        System.out.println("Hihgest marks:"+marks.get(0));  
          
    }

}
