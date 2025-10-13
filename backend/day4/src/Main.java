import java.util.*;

// Main class
public class Main {

    // =========================
    // 1️⃣ Generic Class
    // =========================
    static class Box<T> {
        private T value; // can store any type
        public void set(T value) { this.value = value; } // setter
        public T get() { return value; }                 // getter
    }

    // =========================
    // 2️⃣ Generic Method
    // =========================
    public static <T> void printArray(T[] arr) {
        for (T element : arr) System.out.print(element + " ");
        System.out.println();
    }

    public static <K, V> void printPair(K key, V value) {
        System.out.println("Key: " + key + ", Value: " + value);
    }

    // =========================
    // 3️⃣ Bounded Type Parameter
    // =========================
    public static <T extends Number> double addNumbers(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    // =========================
    // 4️⃣ Wildcards - Upper Bound (? extends)
    // =========================
    public static void printNumbers(List<? extends Number> list) {
        for (Number n : list) System.out.print(n + " ");
        System.out.println();
    }

    // =========================
    // 5️⃣ Wildcards - Lower Bound (? super)
    // =========================
    public static void addIntegers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        System.out.println("Lower Bound List: " + list);
    }

    // =========================
    // 6️⃣ Generic Interface
    // =========================
    interface PairInterface<K, V> {
        K getKey();
        V getValue();
    }

    static class KeyValue<K, V> implements PairInterface<K, V> {
        private K key;
        private V value;
        KeyValue(K key, V value) {
            this.key = key;
            this.value = value;
        }
        public K getKey() { return key; }
        public V getValue() { return value; }
    }

    // =========================
    // 7️⃣ Swap Method for Arrays
    // =========================
    public static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // =========================
    // 8️⃣ Generic Map Example
    // =========================
    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // =========================
    // 9️⃣ Enums
    // =========================

    // Basic enum
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    // Enum with fields and constructor
    enum Size {
        SMALL(1), MEDIUM(2), LARGE(3);
        private int code;
        Size(int code) { this.code = code; }
        public int getCode() { return code; }
    }

    // Enum with abstract method
    enum Operation {
        ADD {
            public double apply(double x, double y) { return x + y; }
        },
        SUBTRACT {
            public double apply(double x, double y) { return x - y; }
        },
        MULTIPLY {
            public double apply(double x, double y) { return x * y; }
        },
        DIVIDE {
            public double apply(double x, double y) { return x / y; }
        };
        public abstract double apply(double x, double y);
    }

    // EnumSet and EnumMap Example
    public static void enumCollectionsExample() {
        EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
        System.out.println("Weekend days: " + weekend);

        EnumMap<Day, String> activities = new EnumMap<>(Day.class);
        activities.put(Day.MONDAY, "Gym");
        activities.put(Day.FRIDAY, "Movie Night");
        System.out.println("Day activities:");
        activities.forEach((k, v) -> System.out.println(k + " -> " + v));
    }

    // =========================
    // 10️⃣ Main Method
    // =========================
    public static void main(String[] args) {

        System.out.println("=== Generic Class ===");
        Box<String> strBox = new Box<>();
        strBox.set("Hello Generics");
        System.out.println("Box contains: " + strBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        System.out.println("Box contains: " + intBox.get());

        System.out.println("\n=== Generic Method ===");
        String[] words = {"Java", "Spring", "Boot"};
        Integer[] numbers = {1, 2, 3, 4};
        printArray(words);
        printArray(numbers);

        System.out.println("\n=== Generic Method with Multiple Types ===");
        printPair(1, "One");
        printPair("Key", 99);

        System.out.println("\n=== Bounded Type Parameter ===");
        System.out.println("Add Numbers: " + addNumbers(5, 3.5));

        System.out.println("\n=== Wildcard Upper Bound ===");
        List<Double> doubles = Arrays.asList(1.1, 2.2, 3.3);
        printNumbers(doubles);

        System.out.println("\n=== Wildcard Lower Bound ===");
        List<Number> numList = new ArrayList<>();
        addIntegers(numList);

        System.out.println("\n=== Generic Interface ===");
        PairInterface<Integer, String> pair = new KeyValue<>(1, "Java");
        System.out.println("Pair: " + pair.getKey() + " -> " + pair.getValue());

        System.out.println("\n=== Swap Array Elements ===");
        System.out.println("Before Swap: " + Arrays.toString(numbers));
        swap(numbers, 0, 3);
        System.out.println("After Swap: " + Arrays.toString(numbers));

        System.out.println("\n=== Generic Map ===");
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        printMap(map);

        System.out.println("\n=== Type Erasure Demo ===");
        List<String> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        System.out.println("Type Erasure: " + (list1.getClass() == list2.getClass()));

        System.out.println("\n=== Enums ===");
        System.out.println("All Days:");
        for (Day d : Day.values()) System.out.print(d + " ");
        System.out.println();

        System.out.println("Size Codes:");
        for (Size s : Size.values()) System.out.println(s + " -> " + s.getCode());

        System.out.println("Operation Examples:");
        double x = 10, y = 5;
        for (Operation op : Operation.values()) {
            System.out.println(op + ": " + op.apply(x, y));
        }

        System.out.println("\nEnumSet and EnumMap Example:");
        enumCollectionsExample();

        System.out.println("\nEnum Methods Demo:");
        System.out.println("Compare MONDAY and FRIDAY: " + Day.MONDAY.compareTo(Day.FRIDAY));
        System.out.println("ValueOf Example: " + Day.valueOf("WEDNESDAY"));
        System.out.println("Ordinal Example: " + Day.FRIDAY.ordinal());
    }
}
