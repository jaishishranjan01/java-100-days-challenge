package SequencedCollection;

import java.util.*;

public class SequencedCollectionExample {
    public static void main(String[] args) {
        List<String> nameList = new LinkedList<>();
        Set<String> nameSet = new HashSet<>();
        nameList.addLast("Jayshish");


        SequencedCollection<String> orderQueue = new LinkedList<String>();

        orderQueue.addLast("Order#1001");
        orderQueue.addLast("Order#1002");
        orderQueue.addLast("Order#1003");

        System.out.println("First Order to Process: " + orderQueue.getFirst());
        System.out.println("Last Order in Queue: " + orderQueue.getLast());

        String processed = orderQueue.removeFirst();
        System.out.println("Processed: " + processed);
        System.out.println("Remaining Orders: " + orderQueue);
    }
}
