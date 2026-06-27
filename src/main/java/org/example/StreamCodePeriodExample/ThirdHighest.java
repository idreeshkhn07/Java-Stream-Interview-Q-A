package org.example.StreamCodePeriodExample;

import java.util.Arrays;

public class ThirdHighest {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};

        Integer thirdHighest = Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted()
                .skip(2)
                .findFirst()
                .orElse(null);

        System.out.println(thirdHighest);
    }
}
