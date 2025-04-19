package br.com.desafio.dio.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    public static List<Integer> orderedList(List<Integer> numbers) {
        return numbers.stream()
        .sorted()
        .collect(Collectors.toList());
    }

    public static List<Integer> evenNumbers(List<Integer> numbers) {
        return numbers.stream()
        .filter(number -> number % 2 == 0)
        .collect(Collectors.toList());
    }

    public static List<Integer> oddNumbers(List<Integer> numbers) {
        return numbers.stream()
        .filter(number -> number % 2 != 0)
        .collect(Collectors.toList());
    }

    public static List<Integer> positiveNumbers(List<Integer> numbers) {
        return numbers.stream()
        .filter(number -> number > 0)
        .collect(Collectors.toList());
    }
    public static Integer sumEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
        .filter(number -> number % 2 == 0)
        .reduce(0, (acc, number) -> acc + number);
    }
    
    

}
