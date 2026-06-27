package org.example.StreamCodePeriodExample;

import java.util.Arrays;
import java.util.Comparator;

public class WordWithHighestLength {
    public static void main(String[] args) {


        // Given a sentence, find the word that has the 2nd highest word
        // I/P : String s = " I am learning Stream Api in Java"
        // O/P : Streams

        String s = "I am learning Stream Api in Java";

        String res = Arrays.stream(s.split(" "))
                .sorted(Comparator.comparing(String::length)
                        .reversed())
                .skip(1)
                .findAny().get();

        System.out.println(res);

        // Example 2
        // Given a sentence, find the word that has the 2nd highest LENGTH
        // I/P : String s = " I am learning Stream Api in Java"
        // O/P : 7


        Integer highestLength = Arrays.stream(s.split(" "))
                .map(x -> x.length())
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(highestLength);

    }
}
