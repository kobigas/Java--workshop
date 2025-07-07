package src.sec.com.java.workshop;

public class Wordcount {
    public static void main(String[] args) {
        String sentence="This program show how can we split a string into multiple strings.we need to find sentence word and letter count";
                
                
        String words[]=sentence.split(" ");
        int wordcount = words.length;
        System.out.println(wordcount);
        String sen[]=sentence.split("");
        System.out.println(sen.length);
        String dot[]=sentence.split("\\.");
        System.out.println(dot.length);


       }
}
