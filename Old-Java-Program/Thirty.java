/*import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Thirty {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("ELEMENT 1");
        myList.add("ELEMENT 2");
        myList.add("ELEMENT 3");

        // Using List interface methods
        System.out.println("Using List interface methods: ");
        System.out.println("Size of the list: " + myList.size());
        System.out.println("Element at index 1: " + myList.get(1));

        // Creating a Stack to demonstrate Stack interface
        Stack<String> myStack = new Stack<String>();

        // Pushing elements onto the stack
        myStack.push("Stack Element 1");
        myStack.push("Stack Element 2");
        myStack.push("Stack Element 3");

        // Popping elements from the stack
        System.out.println("\nPopping elements from the stack: ");
        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }

        // Using Iterator to display elements from ArrayList
        System.out.println("\nUsing Iterator to display elements from ArrayList: ");
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Creating a Vector to demonstrate Vector interface
        Vector<String> myVector = new Vector<String>();

        // Adding elements to the Vector
        myVector.add("Vector Element 1");
        myVector.add("Vector Element 2");
        myVector.add("Vector Element 3");

        // Displaying elements using Enumeration (vector-specific)
        System.out.println("\nUsing Enumeration to display elements from Vector: ");
        Enumeration<String> enumeration = myVector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Thirty {

    public static void main(String[] args) {
        // Creating an ArrayList
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        myList.add("Grapes");

        // Sorting the list using Collections.sort()
        Collections.sort(myList);

        System.out.println("Original List: " + myList);
        System.out.println("Sorted List: " + myList);

        // Shuffling the list using Collections.shuffle()
        Collections.shuffle(myList);
        System.out.println("Shuffled List: " + myList);

        // Reversing the list using Collections.reverse()
        Collections.reverse(myList);
        System.out.println("Reversed List: " + myList);

        // Searching for an element using Collections.binarySearch()
        int index = Collections.binarySearch(myList, "Banana");
        System.out.println("Index of Banana: " + index);
    }
}

*/


import java.util.ArrayList;
import java.util.Scanner;

public class Thirty{

    public static void main(String[] args) {
        ArrayList<String> itemList = new ArrayList<>();
        itemList.add("Apple 1");
        itemList.add("Banana 2");
        itemList.add("Orange 3");

        int choice;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n1. View items");
            System.out.println("2. Update item");
            System.out.println("3. Delete item");
            System.out.println("4. Search item");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewItems(itemList);
                    break;

                case 2:
                    updateItem(itemList);
                    break;

                case 3:
                    deleteItem(itemList);
                    break;

                case 4:
                    searchItem(itemList);
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);
    }

    private static void viewItems(ArrayList<String> itemList) {
        if (itemList.isEmpty()) {
            System.out.println("No items to display.");
            System.out.println("Items in the list:");
        } else {
            for (String item : itemList) {
                System.out.println(item);
            }
        }
    }

    private static void updateItem(ArrayList<String> itemList) {
        if (itemList.isEmpty()) {
            System.out.println("No items to update.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index to update: ");
        int updateIndex = scanner.nextInt();

        if (updateIndex >= 0 && updateIndex < itemList.size()) {
            System.out.print("Enter new value: ");
            String newValue = scanner.next();
            itemList.set(updateIndex, newValue);
            System.out.println("Item updated successfully!");
        } else {
            System.out.println("Invalid index!");
        }
    }

    private static void deleteItem(ArrayList<String> itemList) {
        if (itemList.isEmpty()) {
            System.out.println("No items to delete.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index to delete: ");
        int deleteIndex = scanner.nextInt();

        if (deleteIndex >= 0 && deleteIndex < itemList.size()) {
            itemList.remove(deleteIndex);
            System.out.println("Item deleted successfully!");
        } else {
            System.out.println("Invalid index!");
        }
    }

    private static void searchItem(ArrayList<String> itemList) {
        if (itemList.isEmpty()) {
            System.out.println("No items to search.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter item to search: ");
        String searchItem = scanner.next();

        if (itemList.contains(searchItem)) {
            System.out.println("Item found!");
        } else {
            System.out.println("Item not found!");
        }
    }
}