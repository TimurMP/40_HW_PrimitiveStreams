package telran.stream.controller;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class DigitsFreqAppl {

    private static Random random = new Random();
    private final static int N_NUMBERS = 1_000_000;

    public static void main(String[] args) {//
//        Map<String, Long> ress =
//        List<String> aaa =
                new Random().ints(0, Integer.MAX_VALUE)
                        .limit(N_NUMBERS)
                        .mapToObj(i -> Integer.toString(i).split(""))
                        .flatMap(Arrays::stream)
                        .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                        .entrySet().stream()
                        .sorted((e1,e2) ->Long.compare(e2.getValue(), e1.getValue()))
                        .collect(Collectors.toList()).forEach(s -> System.out.println(s.getKey() + " --> " + s.getValue()));

//        for (Map.Entry<String, Long> entry : ress.entrySet()) {
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//
//        }

    }
}
