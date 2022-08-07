package telran.stream.controller;

import java.util.*;

public class WordsFreqAppl {
    public static void main(String[] args) {
        String[] words = { "abc", "ab", "limn", "limn", "ab", "limn", "a" };
        printWordsfrequency(words);
    }

    private static void printWordsfrequency(String... words) {
        Map<String, Integer> res = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
//			if (res.containsKey(words[i])) {
//				res.put(words[i], res.get(words[i]) + 1);
//			} else {
//				res.put(words[i], 1);
//			}

//			Java 8 forever

//			if(res.putIfAbsent(words[i], 1) != null) {
//				res.put(words[i], res.get(words[i]) + 1);
//			}

//			res.computeIfPresent(words[i], (k, v) -> v + 1);
//			res.computeIfAbsent(words[i], k - > 1);

            res.merge(words[i], 1, (oldValue, value) -> oldValue + value);
        }
        System.out.println("===== Unsorted =====");
        res.keySet().forEach(k -> System.out.println(k + " -> " + res.get(k)));
        System.out.println("===== Sorted =====");


        Set<Map.Entry<String, Integer>> entries = res.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(entries);
        list.sort((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()));
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry);
        }
    }

}
