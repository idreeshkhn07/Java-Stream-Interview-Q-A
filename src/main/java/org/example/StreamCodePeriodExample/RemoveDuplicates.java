package org.example.StreamCodePeriodExample;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {

        // Remove duplicates from the string and return in the same order
        // I/P : String s = "dabcadefoa"

        String s = "dabcadefoa";

//        s.chars().distinct().mapToObj(x -> (char)x).forEach(System.out::print);

        Arrays.stream(s.split("")).distinct().forEach(System.out::println);


        // Example 2 :

//        "Remove duplicates from a string using Streams and return the result as a String, not print it."

        String res = Arrays.stream(s.split("")).distinct().collect(Collectors.joining());
        System.out.println(res);

        Arrays.stream(s.split("")).distinct().collect(Collectors.groupingBy(String::toLowerCase));
    }
}
