import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodsForList {

    public void getOddStringFromList(List<String> list) {
        AtomicInteger i = new AtomicInteger(0);
        String result = list.stream()
                .map(e -> i.get() + ". " + e)
                .filter(s -> i.getAndIncrement() % 2 == 1)
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }

    public List<String> getReversedSortedList(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public void getSortedListAndAddCommas(String[] array) {
        String result = Arrays.stream(array)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        Stream.Builder<T> builder = Stream.builder();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            builder.accept(firstIterator.next());
            builder.accept(secondIterator.next());
        }

        return builder.build();
    }
}
