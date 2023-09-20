package frameworks;

import java.util.*;

public class Frameworks {
    public static void main(String[] args) {
        // List example
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add(1, "orange");
        System.out.println("List example: " + list);
        System.out.println("Element at index 0: " + list.get(0));
        list.remove(0);
        System.out.println("List after removing element at index 0: " + list);
        // Set example
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2); // Duplicate element won&#39;t be added
        set2.add(4);
        set2.add(11);
        set2.add(6);
        System.out.println("Set example 1: " + set);
        System.out.println("Set example 2: " + set2);
        set.addAll(set2);
        System.out.println("Set 1 after adding Set 2: " + set);
        set.remove(4);
        System.out.println("Set 1 after removing element 4: " + set);
        set.retainAll(set2);
        System.out.println("Set 1 after retaining set 2: " + set);
        // Queue example
        Queue<String> queue = new LinkedList<>();
        queue.add("one");
        queue.add("two");
        queue.add("three");
        System.out.println("Queue example: " + queue);
        System.out.println("Size of queue: " + queue.size());
        System.out.println("Head of queue: " + queue.poll());
        System.out.println("Queue after removing head: " + queue);

        // Deque
        Deque<Integer> deque = new ArrayDeque<Integer>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        System.out.println("Deque example: " + deque);
        System.out.println("Polling first element: " + deque.pollFirst());
        System.out.println("Polling last element: " + deque.pollLast());
        System.out.println("Deque after polling: " + deque);

        // Linked List example
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("dog");
        linkedList.add("cat");
        linkedList.add("fish");
        System.out.println("Linked List example: " + linkedList);
        linkedList.addFirst("horse");
        System.out.println("Adding element to the front of list: " + linkedList);
        System.out.println("Index of element 'fish': " + linkedList.indexOf("fish"));
        // Hash Set example
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(2);
        System.out.println("Hash Set example: " + hashSet);
        System.out.println("Element 6 is present?: " + hashSet.contains(6));
        HashSet<Integer> cloneHashSet = (HashSet)hashSet.clone();
        System.out.println("Clone of hashSet: " + cloneHashSet);
        // LinkedHashSet example
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(4);
        System.out.println("Linked Hash Set example: " + linkedHashSet);
        System.out.println("Element 2 is present?: " + linkedHashSet.contains(2));
        linkedHashSet.removeAll(hashSet);
        System.out.println("Elements after removing elements from hashSet: " + linkedHashSet);
        // Tree Set example
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(5);
        System.out.println("Tree Set example: " + treeSet);
        System.out.println("Reverse Order Set: " + treeSet.descendingSet());
        System.out.println("Smallest element greater than 2: " + treeSet.higher(2));
        System.out.println("Largest element smaller than 2: " + treeSet.lower(2));
    }
}