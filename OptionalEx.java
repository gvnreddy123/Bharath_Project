package com.infosys.health.collects;

import java.sql.SQLOutput;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        LocalTime start = LocalTime.now();
        System.out.println("Start Time"+start);
        Optional<Integer> optionalInt = Optional.ofNullable(null);
        String result = optionalInt
                .filter(value -> value > 5)
                .map(value -> value * 2)
                .map(value -> "The value is " + value)
                .orElse("No value found");
        System.out.println(result);
    }
}
