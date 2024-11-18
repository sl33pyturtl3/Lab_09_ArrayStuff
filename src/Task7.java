import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100) + 1;
        }

        for (int i = 0; i < dataPoints.length; i++) {
            if (i < dataPoints.length - 1) {
                System.out.print(dataPoints[i] + " | ");
            } else {
                System.out.print(dataPoints[i]);
            }
        }

        System.out.println();

        int userValue = SafeInput.getRangedInt(scanner, "Enter a number between 1 and 100: ", 1, 100);
        System.out.println("You entered: " + userValue);

        boolean found = false;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                System.out.println("The value " + userValue + " was found at array index " + i + ".");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("The value " + userValue + " was not found in the dataPoints array.");
        }

        scanner.close();
    }
}
