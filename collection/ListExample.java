package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // ArrayList Example
        System.out.println("--- ArrayList Example ---");
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicates allowed

        System.out.println("Fruits List: " + fruits);
        System.out.println("Element at index 1: " + fruits.get(1));

        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // LinkedList Example
        System.out.println("\n--- LinkedList Example ---");
        List<String> cities = new LinkedList<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");

        System.out.println("Cities List: " + cities);
        cities.add(1, "Paris");
        System.out.println("After adding Paris at index 1: " + cities);
    }
}
