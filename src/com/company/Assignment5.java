package com.company;

public class Assignment5 {
    public static void main(String[] args) {
//        (isPalindrome("Was it a car or a cat I saw?"));
//        (isPalindrome("Madam, in Eden, I’m Adam."));
//        (isPalindrome("Yo, banana boy!"));
        if (isPalindrome("Mom")) {
            System.out.println("Sentence is Palindrome.");
        } else {
            System.out.println("Sentence isn't Palindrome.");
        }

    }

    public static boolean isPalindrome(String sentence) {
        String newSentence = sentence.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int i = 0, j = newSentence.length() - 1;
        while (i < j) {
            if (newSentence.charAt(i) != newSentence.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;

    }

}

