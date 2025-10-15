import java.util.*;
import java.util.stream.*;

// STREAM → processes data like a water pipeline (does not store elements)
public class Main {
    public static void main(String[] args) {

        // 1️⃣ Create a list collection
        // ❌ You wrote "Array.asList" → should be "Arrays.asList" (with 's')
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6);
        // here we use asList for short — fixed-size list, quick way to create

        // 2️⃣ Create a Stream from the list
        Stream<Integer> numberStream = l.stream();

        // 3️⃣ First stream use — this works fine ✅
        List<Integer> even = numberStream
                .filter(n -> n % 2 == 0)         // keep even numbers only
                .collect(Collectors.toList());   // terminal operation (collect)
        System.out.println("Even numbers: " + even);

        // 4️⃣ Second use of the same stream ❌ — causes IllegalStateException
        // Because the previous collect() already consumed the stream.
        List<Integer> squaredNumbers = numberStream
                .map(n -> n * n)                 // square numbers
                .collect(Collectors.toList());   // ❌ IllegalStateException
        System.out.println("Squared numbers: " + squaredNumbers);
    }
}
