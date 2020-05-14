import java.util.LinkedList;
import java.util.Collections;

public class ListNode {

    public static void main(String[] args) {

        LinkedList<String> packingList = new LinkedList<>();

        LinkedList<String> packing2 = new LinkedList<>();

        // 1
        System.out.println(isItEmpty(packingList));
        // 2
        addNode(packingList, "Testing second method");
        System.out.println(packingList);
        // 3
        System.out.println(makeEmpty(packingList));
        addNode(packingList, "Just another node");
        addNode(packingList, "And another");
        addNode(packingList, "One more");
        addNode(packing2, "From 2nd list");
        // 4
        printList(packingList);
        // 5
        removeNode(packingList, 1);
        System.out.println(packingList);
        // 6
        searchRemove(packingList, "now");
        searchRemove(packingList, "One more");
        System.out.println(packingList);
        // 7
        addBegin(packingList, "new");
        System.out.println(packingList);
        // 8
        addAfter(packingList, 0, "new after");
        System.out.println(packingList);

        // 10
        reverse(packingList);

    }

    // 1. Create a new method that uses isEmpty() to test if a LinkedList is empty,
    // return a boolean value.

    public static boolean isItEmpty(LinkedList<String> list) {
        if (list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    // 2. Create a new method that uses add() to add a new node to a given
    // LinkedList, no return needed.

    public static void addNode(LinkedList<String> list, String nodeData) {
        list.add(nodeData);
        System.out.println("2. Added " + nodeData + " to the list: " + list);
    }

    // 3. Create a new method that tests if a list is empty. If it is, return a
    // string explaining, if it isn't empty use clear() and return a string
    // explaining.

    public static String makeEmpty(LinkedList<String> list) {
        if (isItEmpty(list)) {
            return "3. List is already empty";
        } else {
            list.clear();
            return "3.The list is now empty";
        }
    }

    // 4. Create a new method that prints each node in a given LinkedList on its own
    // line.

    public static void printList(LinkedList<String> list) {

        System.out.println("4. Here is each item in the linked list");
        for (int i = 0; i < list.size(); i++) {
            if (list.size() != 0) {
                System.out.println(list.get(i));
            }
        }
    }

    // 5. Create a new method with a list and an index as its arguements, use
    // remove() to delete a node at that specific index.

    public static void removeNode(LinkedList<String> list, int index) {
        list.remove(index);
        System.out.println("5. We have removed " + list.get(index) + "from the list. Here is the list : " + list);
    }

    // 6. Create a method that searches a list for the given data value and remove
    // each occurance of it.

    public static void searchRemove(LinkedList<String> list, String search) {
        if (list.contains(search)) {
            list.remove(search);
            System.out.println("6.We have searched for and removed " + search);
        } else {
            System.out.println("6.The list does not have an instance of " + search);
        }
    }

    // 7. Create a new method that adds a new node to the beginning (head) of a
    // given LinkedList.

    public static void addBegin(LinkedList<String> list, String newNode) {
        list.addFirst(newNode);
        System.out.println("7.We have added " + newNode + " to the front of the list. Here's the list: " + list);
    }

    // 8. Create a new method that adds a new node after a given index in a given
    // list.

    public static void addAfter(LinkedList<String> list, int index, String newNode) {
        list.add(index + 1, newNode);
        System.out.println("8. We have added " + newNode + " after  the index " + index);
    }

    // 9. Create a new method that appends the contents of one given list to the end
    // of another given list. (List2 = List2 + List1)
    public static void appendList(LinkedList<String> list1, LinkedList<String> list2) {
        list1.addAll(list2);
        System.out.println("9. Appending list2 to list1: " + list1);
    }

    // 10. Create a new method that prints the contents of a given list in reverse
    // order.
    public static void reverse(LinkedList<String> list) {
        System.out.println("The list in reverse: ");
        Collections.reverse(list);
        System.out.println(list);
    }

}