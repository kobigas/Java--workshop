package src.sec.com.java.workshop;

public class Append {
    public static void main(String[] args) {
        StringBuilder sentence = new StringBuilder();
        sentence.append(" Java");
        sentence.append(" is");
        sentence.append(" the");
        sentence.append(" most");
        sentence.append(" used");
        sentence.append(" language");
        sentence.append(" for");
        sentence.append(" Enterprise");
        sentence.append(" Applications");
        System.out.println(sentence.toString());
    }

}
