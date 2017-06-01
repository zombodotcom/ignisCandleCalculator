import java.util.Scanner;

public class Candles {

	public static void main(String[] args) {
		String done1 = null;
		boolean done = true;
		System.out.println("Welcome to Ignis Candles Calculator");
		do {
			Scanner key = new Scanner(System.in);
			System.out.println("Enter container size in oz:");
			int cont = key.nextInt();
			System.out.println("enter amount of containers:");
			int quant = key.nextInt();
			double lbs = cont * quant;
			lbs = lbs / 16;
			double amount = (lbs * 16) * .06;
			System.out.println(lbs + " lbs of wax.");
			System.out.println(amount + " oz of Fragrance Oil");
			System.out.println("done? enter yes or no:");
			done1 = key.next();
			if (done1.contains("yes"))
				done = false;

		} while (done);
		System.out.println("Thanks for using the Ignis Candles Calculator!");
	}

}
