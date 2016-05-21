
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Please enter radius of a circle:");
		double Radius = input.nextDouble();

		double P = (2 * 3.14 * Radius);
		System.out.println("Circumference = " + P);

		double S = (3.14 * (Radius * Radius));
		System.out.println("Circle area = " + S);

		input.close();

	}

}