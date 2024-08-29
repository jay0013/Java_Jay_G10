import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        // if (button == 1) {
        //     System.out.println("Hello");
        // } else if (button == 2) {
        //     System.out.println("Namaste");
        // } else if (button == 3) {
        //     System.out.println("Chaman");
        // } else {
        //     System.out.println("Invalid Button");
        // }
        
        // Using switch statement
        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Chaman");
                break;
            default:
                System.out.println("Invalid Button");
                break;
        }

        // Close the scanner
        sc.close();
    }
}
