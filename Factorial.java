import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int number = 1;
		System.out.println("--- Factorial ---");
		System.out.println("Enter a number: ");
		try (Scanner scanner = new Scanner(System.in)) {
			try {
				number = scanner.nextInt();
				System.out.printf(number + " factorial : %.0f", factorialNumber(number));
			} catch (InputMismatchException e) {
				System.out.println("Is not a number");
			}
		}
	}

	public static double factorialNumber(int number) {
		double factorial = number;
		for (int j = number - 1; j > 0; j--) {
			factorial = factorial * j;
		}
		return factorial;
	}
}
