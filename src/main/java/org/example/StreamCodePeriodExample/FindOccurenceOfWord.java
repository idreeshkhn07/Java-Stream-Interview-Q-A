package org.example.StreamCodePeriodExample;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccurenceOfWord {
    public static void main(String[] args) {

        // Given a sentence, find the occurrence of each word
        // I/P: String s = "I am learning Stream API API in Java Java"

        String s = "I am learning Stream API API in Java Java";

        Map<String, Long> collect = Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        System.out.println(collect);
    }
}
