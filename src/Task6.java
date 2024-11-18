import java.util.Random;
import java.util.Scanner;

public class Task6 {
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

        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }

        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);

        int userValue = SafeInput.getRangedInt(scanner, "Enter a number between 1 and 100: ", 1, 100);
        System.out.println("You entered: " + userValue);

        int count = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("The value " + userValue + " was found " + count + " time(s) in the dataPoints array.");
        } else {
            System.out.println("The value " + userValue + " was not found in the dataPoints array.");
        }

        scanner.close();
    }
}
