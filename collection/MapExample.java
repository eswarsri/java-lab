package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        // HashMap Example - Key-Value pair, no order guarantee
        System.out.println("--- HashMap Example ---");
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 35);
        ages.put("Alice", 26); // Updates value for key "Alice"

        System.out.println("Ages (HashMap): " + ages);
        System.out.println("Age of Bob: " + ages.get("Bob"));

        // TreeMap Example - Sorted by Keys
        System.out.println("\n--- TreeMap Example ---");
        Map<String, Integer> scores = new TreeMap<>();
        scores.put("Math", 90);
        scores.put("Science", 85);
        scores.put("English", 88);

        System.out.println("Scores (TreeMap - Sorted by Subject): " + scores);
    }
}
