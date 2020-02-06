package eliza;

import java.util.Random;
import java.util.Scanner;

public class Eliza {

    static String sentence;
    static String searchMy = " my ";
    static String searchLove = " love ";
    static String searchHate = " hate ";
    static String searchNo = " no ";

    static String arr[]= {"\nPlease, go on.","\nContinue...","\nHmm, tell me more.","\nNvm, I don't care.", "\nWhat?"};

    public static void main(String[] args) {
//==============just once===============================
        boolean count = true;
        if (count == true) {
            System.out.println("Do you bleed? \u0028\u25C9 \u21C1 \u25C9\u0029-\u271f");
            count = false; }
//======================================================
        while (true) {
            Scanner keyboard = new Scanner(System.in);
            sentence = keyboard.nextLine();
            getResponse();
        }//<--- end of while statement
    }

    public static void getResponse() {
        Random random = new Random();
        if (sentence.toLowerCase().contains(searchMy.toLowerCase())) {
            String x = sentence.substring(sentence.indexOf("my") + 3, sentence.length());
            System.out.println("\nHmm, tell me about " + x);
        } else if (sentence.toLowerCase().contains(searchLove.toLowerCase())) {
            String y = sentence.substring(sentence.indexOf("love") + 5, sentence.length());
            System.out.println("\nHmmm, tell me why you love " + y+".");
        } else if (sentence.toLowerCase().contains(searchHate.toLowerCase())) {
            String h = sentence.substring(sentence.indexOf("hate") + 5, sentence.length());
            System.out.println("\nHmmm, tell me why you hate " + h + ".");
        } else if (sentence.toLowerCase().contains(searchNo.toLowerCase())) {
            System.out.println("*!* You Died! *!*\nTip: She doesn't like the word 'no'. DOn't use it.");
        } else{
            int x =random.nextInt(5);
            System.out.println(arr[x]);
        }

    }

}
