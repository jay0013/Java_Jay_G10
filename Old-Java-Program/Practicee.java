import java.util.Scanner;

public class Practicee {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        if (size < 2) {
            System.out.println("The array must contain at least two distinct numbers.");
            return;
        }

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the maximum number
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Find the second maximum number
        int secondMax = Integer.MIN_VALUE;
        int secondMaxCount = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == max) {
            } else if (arr[i] > secondMax) {
                secondMax = arr[i];
                secondMaxCount = 1;
            } else if (arr[i] == secondMax) {
                secondMaxCount++;
            }
        }

        if (secondMaxCount == 0) {
            System.out.println("There is no second maximum element in the array.");
        } else {
            System.out.println("The second maximum number in the array is: " + secondMax);
        }

        scanner.close();
    }
}