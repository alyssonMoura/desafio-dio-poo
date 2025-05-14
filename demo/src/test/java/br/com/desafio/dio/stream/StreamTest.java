package br.com.desafio.dio.stream;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class StreamTest {
    
    // @Before
    // public static void setup() {
    //     List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    // }

    @Test
    public void isListOrdered() {
        List<Integer> numbers = Arrays.asList(1, 2, 5, 4, 3);
        List<Integer> numbersOrder = Stream.orderedList(numbers);
        assertEquals(numbersOrder, Arrays.asList(1, 2, 3, 4,5));
    }
    
    @Test
    public void isListNumbersEven() {
        List<Integer> numbers = Arrays.asList(1, 2, 5, 4, 3);
        List<Integer> numbersEven = Stream.evenNumbers(numbers);
        assertEquals(numbersEven, Arrays.asList(2, 4));
    }

    @Test
    public void isListNumbersOdd() {
        List<Integer> numbers = Arrays.asList(1, 2, 5, 4, 3);
        List<Integer> numbersOdd = Stream.oddNumbers(numbers);
        assertEquals(numbersOdd, Arrays.asList(1, 5, 3));
    }

    @Test
    public void isListNumbersPositive() {
        List<Integer> numbers = Arrays.asList(1, 2, 5, -4, 3);
        List<Integer> numbersPositive = Stream.positiveNumbers(numbers);
        assertEquals(numbersPositive, Arrays.asList(1, 2, 5, 3));
    }

    @Test
    public void isSumEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 5, 4, 3);
        Integer sumEvenNumbers = Stream.sumEvenNumbers(numbers);
        assertEquals(sumEvenNumbers.longValue(), 6L);
    }
}