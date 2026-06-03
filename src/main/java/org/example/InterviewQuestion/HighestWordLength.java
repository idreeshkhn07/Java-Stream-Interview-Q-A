package org.example.InterviewQuestion;

import java.util.Arrays;
import java.util.Comparator;

public class HighestWordLength {
    public static void main(String[] args) {


        // Given a Sentence, find the word that has the highest length
        // I/P: String s= " I am learning Streams API in Java"
        // O/P: learning

        String s = " I am learning Streams API in Java";

        String ans = Arrays.stream(s.split(" "))
                .max(Comparator.comparing(String::length)).get();
        System.out.println(ans);

    }
}
