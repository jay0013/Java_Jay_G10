/*
import java.util.*;
class SevenMarch
{
	public static int add(int a,int b){
		return a+b;
	}
	public static int sub(int a,int b){
		return a-b;
	}	
	public static int mul(int a,int b){
		return a*b;
	}
	public static int div(int a,int b){
		return a/b;
	}
	public static void Menu()
	{
		System.out.println("Prees 1 to Addition");
		System.out.println("Prees 2 to Subtarion");
		System.out.println("Prees 3 to Multiplication");
		System.out.println("Prees 4 to Division");
		System.out.println("Prees 5 to Exit");
	}
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		Menu();
		System.out.println("Option");
		int opt = sc.nextInt();
		
		while(true)
		{
			if(opt == 5)
			{
				System.out.println("Exiting...");
				break;
			}
			System.out.println("Enter a ");
			int a = sc.nextInt();
			System.out.println("Enter b ");
			int b = sc.nextInt();
			
			switch(opt)
			{
				case 1:
					System.out.println("Addition  of Two Number is "+add(a,b));
				break;
				
				case 2:
					System.out.println("Subtraion  of Two Number is "+sub(a,b));
				break;
			
				case 3:
					System.out.println("Multiply of Two Number is "+mul(a,b));
				break;
			
				case 4:
					System.out.println("Multiply of Two Number is "+div(a,b));
				break;
				default:
					System.out.println("Select Right choice");
					break;
			}
			System.out.println("Option");
			opt = sc.nextInt();
		}
	}
}

*/
import java.util.Scanner;

public class SevenMarch 
{
    static Scanner scanner = new Scanner(System.in);
    static final int MAX_SIZE = 10;

    static void displayArray(int[] arr, int size) {
        System.out.println("Array elements :");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int searchByElement(int[] arr, int size, int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    static int searchByValue(int[] arr, int size, int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    static void insertElement(int[] arr, int size, int index, int element) {
        if (size == MAX_SIZE) {
            System.out.println("Array is full, cannot insert element");
            return;
        }
        if (index < 0 || index > size) {
            System.out.println("Invalid index, cannot insert element");
            return;
        }
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = element;
        System.out.println("Element inserted successfully");
    }

    static void deleteElement(int[] arr, int size, int index) {
        if (size == 0) {
            System.out.println("Array is empty, nothing to delete");
            return;
        }
        if (index < 0 || index >= size) {
            System.out.println("Invalid index, cannot delete element");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        System.out.println("Element deleted successfully");
    }

    static void updateElement(int[] arr, int size, int index, int newValue) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index, cannot update element");
            return;
        }
        arr[index] = newValue;
        System.out.println("Element updated successfully");
    }

    public static void main(String args[]) {
        int[] arr = new int[MAX_SIZE];
        int size = 0;
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display Array");
            System.out.println("2. Search By Elements");
            System.out.println("3. Search By Value");
            System.out.println("4. Insert Elements");
            System.out.println("5. Update Elements");
            System.out.println("6. Delete Elements");
            System.out.println("0. Exit");

            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayArray(arr, size);
                    break;
                case 2:
                    System.out.println("Enter element to search :");
                    int searchElement = scanner.nextInt();
                    int elementIndex = searchByElement(arr, size, searchElement);
                    if (elementIndex != -1) {
                        System.out.println("Element found at index " + elementIndex);
                    } else {
                        System.out.println("Element not found in the array");
                    }
                    break;
                case 3:
                    System.out.println("Enter value to search :");
                    int searchValue = scanner.nextInt();
                    int valueIndex = searchByValue(arr, size, searchValue);
                    if (valueIndex != -1) {
                        System.out.println("Value found at index " + valueIndex);
                    } else {
                        System.out.println("Value not found in the array");
                    }
                    break;
                case 4:
                    System.out.println("Enter Index to insert element:");
                    int insertIndex = scanner.nextInt();
                    System.out.println("Enter element to insert :");
                    int insertElement = scanner.nextInt();
                    insertElement(arr, size, insertIndex, insertElement);
                    size++;
                    break;
                case 5:
                    System.out.println("Enter index to update element :");
                    int updateIndex = scanner.nextInt();
                    System.out.println("Enter new value :");
                    int newValue = scanner.nextInt();
                    updateElement(arr, size, updateIndex, newValue);
                    break;
                case 6:
                    System.out.println("Enter index to delete element :");
                    int deleteIndex = scanner.nextInt();
                    deleteElement(arr, size, deleteIndex);
                    size--;
                    break;
            }
        } while (choice != 0);
    }
}