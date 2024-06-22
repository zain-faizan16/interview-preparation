package streamPreparation;

import java.util.Arrays;
import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> listForStream = Arrays.asList(15, 52, 48, 74, 15);

        // Get a stream from the list
        listForStream.stream()
                .forEach(System.out::println);
        listForStream.parallelStream().forEach(System.out::println);
    }
}
