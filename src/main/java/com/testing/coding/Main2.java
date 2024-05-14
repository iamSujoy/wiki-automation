package com.testing.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<String> values = Arrays.asList("Kolkata", "Bangalore", "Hyderabad");
        List<String> ans = values.stream().map(v->v.toUpperCase()).collect(Collectors.toList());
        System.out.println(ans);
    }
}
