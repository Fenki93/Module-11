import random.RandomGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Ivan", "Dimon", "Timon", "Baron", "Anton", "Karton"));

        MethodsForList mfl = new MethodsForList();

        //Task1
        mfl.getOddStringFromList(names);

        //Task2
        for (String el : mfl.getReversedSortedList(names)) {
            System.out.println("Task 2, Sorted UpperCase: " + el);
        }

        //Task3
        String[] array = {"1, 2, 0", "4, 5"};
        mfl.getSortedListAndAddCommas(array);

        //Task4
        Stream<Long> random = new RandomGenerator().generateRandomStream(1L);
        random.limit(5).forEach(System.out::println);

        //Task5
        Stream<String> first = Stream.of("Ivan", "Dimon", "Timon", "Baron", "Anton", "Karton");
        Stream<String> second = Stream.of("1", "2", "3", "4", "5");
        MethodsForList.zip(first, second).forEach(System.out::println);

    }
}