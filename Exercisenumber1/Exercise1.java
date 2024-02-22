package Exercisenumber1;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter numbers(exit by enter non-integer value): ");

        int[] numbers = new int[1];
        int size = 0;

        while (input.hasNextInt()) {
            if (size == numbers.length) {

                int[] newArray = new int[numbers.length * 2];
                System.arraycopy(numbers, 0, newArray, 0, numbers.length);
                numbers = newArray;
            }
            numbers[size++] = input.nextInt();
        }

        System.out.println("The input numbers are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

        input.close();
    }
}