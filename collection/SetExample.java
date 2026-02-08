package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        // HashSet Example - No order guarantee, unique elements
        System.out.println("--- HashSet Example ---");
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Charlie");
        uniqueNames.add("Alice"); // Duplicate, will be ignored

        System.out.println("Unique Names (HashSet): " + uniqueNames);

        // TreeSet Example - Sorted order, unique elements
        System.out.println("\n--- TreeSet Example ---");
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(50); // Duplicate ignored

        System.out.println("Sorted Numbers (TreeSet): " + numbers);
    }
}
