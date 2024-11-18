import java.util.Scanner;

public class Task5 {

    private static final Scanner scanner = new Scanner(System.in);  // Create Scanner object here

    public static String getNonZeroLenString(String prompt) {
        String retVal = "";

        do {
            System.out.print(prompt + ": ");
            retVal = scanner.nextLine();

        } while (retVal.isEmpty());
        System.out.println("You must enter at least 1 character");

        return retVal;
    }

    public static int getInt(String prompt) {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + " ");
            if (scanner.hasNextInt()) {
                retVal = scanner.nextInt();
                scanner.nextLine();
                done = true;
            } else {
                trash = scanner.nextLine();
                System.out.println("Please enter a valid number, not " + trash);
            }

        } while (!done);
        return retVal;
    }

    public static int getRangedInt(String prompt, int low, int high) {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (scanner.hasNextInt()) {
                retVal = scanner.nextInt();
                scanner.nextLine();
                if (retVal >= low && retVal <= high) {
                    done = true;
                } else {
                    System.out.println("Please enter a value between " + low + " and " + high + ".");
                }
            } else {
                trash = scanner.nextLine();
                System.out.println("You must enter a valid number, not " + trash);
            }
        } while (!done);
        return retVal;
    }
}
