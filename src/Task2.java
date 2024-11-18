import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random random = new Random();

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100) + 1;
        }

        // Optionally print the array to verify the result
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.println("dataPoints[" + i + "] = " + dataPoints[i]);
        }
    }
}