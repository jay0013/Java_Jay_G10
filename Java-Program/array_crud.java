import java.util.Scanner;

public class array_crud {
    static Scanner scanner = new Scanner(System.in);
    static final int MAX_SIZE = 10;

    static void displayArray(int[] arr, int size) {
        System.out.println("Array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " "); // Changed println to print to format output correctly
        }
        System.out.println(); // Added to print a newline after array elements
    }

    static void insertElement(int[] arr, int size, int index, int element) {
        if (size == MAX_SIZE) {
            System.out.println("Array is full, cannot insert element");
            return;
        }
        if (index < 0 || index > size) {
            System.out.println("Invalid index, cannot insert element");
            return; // Added return to exit method after invalid index message
        }
        for (int i = size - 1; i >= index; i--) { // Fixed loop syntax (changed i== to i--)
            arr[i + 1] = arr[i];
        }
        arr[index] = element;
        System.out.println("Element inserted successfully");
    }

    static void deleteElement(int[] arr, int size, int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index, cannot delete element");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = 0; // Set last element to 0 or default value after deletion
        System.out.println("Element deleted successfully");
    }

    static int searchByElement(int[] arr, int size, int searchElement) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == searchElement) {
                return i;
            }
        }
        return -1; // Return -1 if element not found
    }

    public static void main(String[] args) {
        int[] arr = new int[MAX_SIZE];
        int size = 0;
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display Array");
            System.out.println("2. Search by element");
            System.out.println("3. Insert element");
            System.out.println("4. Delete element");
            System.out.println("5. Update element");
            System.out.println("0. Exit");

            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayArray(arr, size);
                    break;
                case 2:
                    System.out.println("Enter element to search:");
                    int searchElement = scanner.nextInt();
                    int elementIndex = searchByElement(arr, size, searchElement);
                    if (elementIndex != -1) {
                        System.out.println("Element found at index " + elementIndex);
                    } else {
                        System.out.println("Element not found in the array");
                    }
                    break;
                case 3:
                    System.out.println("Enter index to insert element:");
                    int insertIndex = scanner.nextInt();
                    System.out.println("Enter element to insert:");
                    int insertElement = scanner.nextInt();
                    insertElement(arr, size, insertIndex, insertElement);
                    size++;
                    break;
                case 4:
                    System.out.println("Enter index to delete element:");
                    int deleteIndex = scanner.nextInt();
                    deleteElement(arr, size, deleteIndex);
                    size--;
                    break;
                case 5:
                    System.out.println("Update element functionality is not implemented yet.");
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid menu option.");
                    break;
            }
        } while (choice != 0);

        scanner.close(); // Closing the scanner object
    }
}
