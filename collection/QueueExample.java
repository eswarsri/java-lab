package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // PriorityQueue Example - Natural ordering (or via Comparator)
        System.out.println("--- PriorityQueue Example ---");
        Queue<Integer> tasks = new PriorityQueue<>();
        tasks.add(30);
        tasks.add(10);
        tasks.add(20);
        tasks.add(5);

        System.out.println("PriorityQueue: " + tasks);

        // Polling elements (retrieves and removes head of queue)
        System.out.println("Poll (Head): " + tasks.poll());
        System.out.println("After Poll: " + tasks);
        System.out.println("Poll (Head): " + tasks.poll());
        System.out.println("After Poll: " + tasks);
    }
}
