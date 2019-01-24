package Chapter07;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program to get the numbers to be read, display the contents of the array, and
 * to print the average.
 *
 * @author Arrian Taton
 */
public class P7 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will be read: ");
        int numbers = input.nextInt();
        ArrayList<Integer> x = new ArrayList<>(numbers);

        fillArrayList(x, input, numbers);
        System.out.println("The average is " + average(x));
        displayArray(x);
    }

    /**
     * Method to get the elements of an ArrayList
     *
     * @param x
     * @param input
     * @param numbers
     */
    public static void fillArrayList(ArrayList<Integer> x, Scanner input, int numbers) {
        System.out.print("Enter " + numbers + " elements: ");
        for (int i = 0; i < numbers; i++) {
            x.add(input.nextInt());
        }
    }

    /**
     * Get the average of the ArrayList
     *
     * @param x
     * @return
     */
    public static double average(ArrayList<Integer> x) {
        double sum = 0;

        for (int i = 0; i < x.size(); i++) {
            sum = sum + x.get(i);
        }

        return sum / x.size();
    }

    /**
     * Display the ArrayList
     *
     * @param x
     */
    public static void displayArray(ArrayList<Integer> x) {
        System.out.println("The contents of the array: " + x);
    }
}
