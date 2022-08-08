package telran.stream.controller;

import java.util.*;
import java.util.stream.Collectors;

public class WordsFreqApplStream {
    public static void main(String[] args) {
        String[] words = {"abc", "ab", "limn", "limn", "ab", "limn", "a"};
        printWordsFrequency(words);
    }

    private static void printWordsFrequency(String... words) {
        Arrays.stream(words)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream().sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                .forEach(System.out::println);
    }


}
