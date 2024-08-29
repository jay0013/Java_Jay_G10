/*
This is Array program
Name: Jay Chavda
Date:12-March-2024
*/

/*
public class TwelveMarch
{
    public static void main(String[] args) 
	{
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3};
        int[] c = {1, 2};
        int[] d = {1};

        System.out.println("Address of the Array b: " + b);
        System.out.println("Address of the Array a: " + a);
        System.out.println("Address of the Array c: " + c);
        System.out.println("Address of the Array d: " + d);
       

        System.out.println("Elements of array a:");
        for (int i = 0; i < a.length; i++) 
		{
            System.out.println(a[i]);
        }

        System.out.println("Elements of array b:");
        for (int i = 0; i < b.length; i++) 
		{
            System.out.println(b[i]);
        }

        System.out.println("Elements of array c:");
        for (int i = 0; i < c.length; i++) 
		{
            System.out.println(c[i]);
        }

        System.out.println("Elements of array d:");
        for (int i = 0; i < d.length; i++) 
		{
            System.out.println(d[i]);
        }
    }
}

import java.util.Scanner;

public class TwelveMarch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of arrays: ");
        int numArrays = scanner.nextInt();

        int[][] arrays = new int[numArrays][];

        for (int i = 0; i < numArrays; i++) {
            System.out.println("Enter the length of array " + (i + 1) + ": ");
            int length = scanner.nextInt();

            arrays[i] = new int[length];

            System.out.println("Enter the elements of array " + (i + 1) + ": ");
            for (int j = 0; j < length; j++) {
                arrays[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < numArrays; i++) {
            System.out.println("Elements of array " + (i + 1) + ":");
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.println(arrays[i][j]);
            }
        }
    }
}





Write a program to store run of five overs
write a program to store marks of five subjects of 5 students
write a program to store multiplication of two matrix



import java.util.InputMismatchException;
import java.util.Scanner;

public class TwelveMarch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nSelect an option:");
            System.out.println("1. Store and display runs of five overs");
            System.out.println("2. Store and display marks of five subjects for five students");
            System.out.println("3. Multiply two matrices of order 2x2");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        // Store and display runs of five overs
                        int[] runs = new int[5];
                        System.out.println("Enter the runs scored in five overs:");
                        for (int i = 0; i < 5; i++) {
                            runs[i] = scanner.nextInt();
                        }
                        System.out.println("Runs scored in five overs:");
                        for (int run : runs) {
                            System.out.println(run);
                        }
                        break;
                    case 2:
                        // Store and display marks of five subjects for five students
                        int[][] marks = new int[5][5];
                        System.out.println("Enter the marks of five subjects for five students:");
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < 5; j++) {
                                marks[i][j] = scanner.nextInt();
                            }
                        }
                        System.out.println("Marks of five subjects for five students:");
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < 5; j++) {
                                System.out.print(marks[i][j] + " ");
                            }
                            System.out.println();
                        }
                        break;
                    case 3:
                        // Multiply two matrices of order 2x2
                        int[][] matrix1 = new int[2][2];
                        int[][] matrix2 = new int[2][2];
                        int[][] result = new int[2][2];

                        System.out.println("Enter the elements of the first matrix:");
                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 2; j++) {
                                matrix1[i][j] = scanner.nextInt();
                            }
                        }

                        System.out.println("Enter the elements of the second matrix:");
                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 2; j++) {
                                matrix2[i][j] = scanner.nextInt();
                            }
                        }

                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 2; j++) {
                                for (int k = 0; k < 2; k++) {
                                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                                }
                            }
                        }

                        System.out.println("Product of the two matrices:");
                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 2; j++) {
                                System.out.print(result[i][j] + " ");
                            }
                            System.out.println();
                        }
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine(); // Clear the input buffer
                choice = 0; // Reset choice to force re-entering the choice
            }

        } while (choice != 4);

        scanner.close();
    }
}



import java.util.Scanner;

public class TwelveMarch 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        // Input for the first matrix
        System.out.println("Enter the elements of the first 3x3 matrix:");
        int[][] matrix1 = readMatrix(scanner);

        // Input for the second matrix
        System.out.println("Enter the elements of the second 3x3 matrix:");
        int[][] matrix2 = readMatrix(scanner);

        // Perform matrix addition
        int[][] result = addMatrices(matrix1, matrix2);

        // Display the result
        System.out.println("The sum of the two matrices is:");
        displayMatrix(result);

        scanner.close();
    }

    // Method to read a 3x3 matrix from user input
    private static int[][] readMatrix(Scanner scanner) 
	{
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) 
		{
            for (int j = 0; j < 3; j++) 
			{
                System.out.print("Enter element at position [" + (i+1) + "][" + (j+1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Method to add two matrices
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2)
	{
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) 
		{
            for (int j = 0; j < 3; j++) 
			{
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to display a 3x3 matrix
    private static void displayMatrix(int[][] matrix) 
	{
        for (int i = 0; i < 3; i++) 
		{
            for (int j = 0; j < 3; j++) 
			{
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}




import java.util.Scanner;

public class TwelveMarch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first matrix
        System.out.println("Enter the elements of the first 3x3 matrix:");
        int[][] matrix1 = readMatrix(scanner);

        // Input for the second matrix
        System.out.println("Enter the elements of the second 3x3 matrix:");
        int[][] matrix2 = readMatrix(scanner);

        // Perform matrix addition
        int[][] result = addMatrices(matrix1, matrix2);

        // Display the result
        displaySum(matrix1, matrix2, result);

        scanner.close();
    }

    // Method to read a 3x3 matrix from user input
    private static int[][] readMatrix(Scanner scanner) {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element at position [" + (i+1) + "][" + (j+1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Method to add two matrices
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to display the matrices and their sum
    private static void displaySum(int[][] matrix1, int[][] matrix2, int[][] result) {
        System.out.println("Sum of the matrices:");
        displayMatrix(matrix1);
        System.out.println("+");
        displayMatrix(matrix2);
        System.out.println("=");
        displayMatrix(result);
    }

    // Method to display a 3x3 matrix
    private static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrix[i][j] + "] ");
            }
            System.out.println();
        }
    }
}

*/

import java.util.Scanner;

public class TwelveMarch 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        // Input for the first matrix
        System.out.println("Enter the elements of the first 3x3 matrix:");
        int[][] matrix1 = readMatrix(scanner);

        // Input for the second matrix
        System.out.println("Enter the elements of the second 3x3 matrix:");
        int[][] matrix2 = readMatrix(scanner);

        // Perform matrix addition
        int[][] result = addMatrices(matrix1, matrix2);

        // Display the result
        displaySum(matrix1, matrix2, result);

        scanner.close();
    }

    // Method to read a 3x3 matrix from user input
    private static int[][] readMatrix(Scanner scanner) 
	{
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) 
		{
            for (int j = 0; j < 3; j++) 
			{
                System.out.print("Enter element at position [" + (i+1) + "][" + (j+1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Method to add two matrices
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) 
	{
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) 
		{
            for (int j = 0; j < 3; j++) 
			{
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to display the matrices and their sum
    private static void displaySum(int[][] matrix1, int[][] matrix2, int[][] result) 
	{
        System.out.println("Sum of the matrices:");
        for (int i = 0; i < 3; i++) 
		{
            // Display elements of the first matrix
            for (int j = 0; j < 3; j++) 
			{
                System.out.print("[" + matrix1[i][j] + "] ");
            }
            System.out.print(" + ");
            // Display elements of the second matrix
            for (int j = 0; j < 3; j++) 
			{
                System.out.print("[" + matrix2[i][j] + "] ");
            }
            System.out.print(" = ");
            // Display elements of the result matrix
            for (int j = 0; j < 3; j++) 
			{
                System.out.print("[" + result[i][j] + "] ");
            }
            System.out.println();
        }
    }
}

