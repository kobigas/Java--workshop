package com.java.workshop.collections;

import java.util.ArrayList;
import java.util.List;


public class ListExample {
      public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("kobiga");
        names.add("suguna");
        names.add("ajeetha");
        names.add("vinupriya");
        names.add("shahana");
        names.add("madhuja");
        System.out.println("Name List:"+names);
        for(String name:names){
            System.out.println("Names:"+name);
        }
        for (int i=0;i<names.size();i++){
            System.out.println("Name at index"+ i +"."+ names.get(i));
        }
    }
}
        
