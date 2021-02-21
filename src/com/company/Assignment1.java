package com.company;

public class Assignment1 {

    public static void main(String[] args) {
        String[] words = new String[]{"Computer", "Plate", "Chair", "Girl", "Boy", "Cat", "Dog", "Shirt", "Determination"};
        int countStartsWithC = 0;
        int countEndsWithE = 0;
        int countLength5 = 0;
        int countContainsE = 0;
        boolean hasSubString = false;
        for (String eachWord : words) {
            if (eachWord.startsWith("C")) {
                countStartsWithC++;
            }
            if (eachWord.endsWith("e")) {
                countEndsWithE++;
            }
            if (eachWord.length() == 5) {
                countLength5++;
            }
            if (eachWord.contains("e")) {
                countContainsE++;
            }
            if (eachWord.contains("te")) {
                hasSubString = true;
            }
        }
        System.out.format("Array contains %d " + (countStartsWithC == 1 ? "word" : "words") + " that starts with C and %d " + (countEndsWithE == 1 ? "word" : "words") + " that ends with e.", countStartsWithC, countEndsWithE);
        System.out.format("%nArray contains %d " + (countLength5 == 1 ? "word" : "words") + " with length 5.", countLength5);
        System.out.format("%nArray contains %d " + (countContainsE == 1 ? "word" : "words") + " that consist of the character e.", countContainsE);
        System.out.format("%nIf there are any words which consists of the subString “te”? Answer: " + hasSubString);
    }
}