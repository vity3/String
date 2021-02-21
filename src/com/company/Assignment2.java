package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment2 {
    public static void main(String[] args) {
        String message = "Climb mountains not so the world can see you, but so you can see the world";
        System.out.println("Sentence contains " + countWords(message) + " words.");
        System.out.println("Sentence contains " + countThe(message) + " THE words.");
        System.out.println("Sentence contains " + countS(message) + " words with letter S.");
        equalWords(message);
        replaceAllYou(message);
    }

    private static int countWords(String message) {
        String trim = message.trim();
        if (trim.isEmpty())
            return 0;
        return trim.split("\\s+").length;
    }

    private static int countThe(String message) {
        int count = 0;
        Pattern minePattern = Pattern.compile("\\bthe\\b");
        Matcher mineMatcher = minePattern.matcher(message);
        while(mineMatcher.find()){
            count++;
        }
        return count;
    }

    private static int countS (String message) {
        int count = 0;
        Pattern minePattern = Pattern.compile("\\Ds\\D");
        Matcher mineMatcher = minePattern.matcher(message);
        while(mineMatcher.find()){
            count++;
        }
        return count;
    }

    private static void equalWords(String message) {
        String words[] = message.split(" ");
        int count = 0;
        System.out.println("Words that are repeated in the sentence multiple times: ");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            if (count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }
    }
    private static void replaceAllYou (String message) {
        String newMessage = message.replaceAll("you", "You");
        System.out.println(newMessage);
    }
}


