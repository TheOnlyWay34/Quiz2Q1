package pkgMain;

import java.util.Scanner;

public class cMain {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Please input tuition cost for first year: ");
		double tuition = scan.nextDouble();
		double total = tuition;
		double interest = 0;
		for (double year = 2;year<5;year += 1){
			System.out.printf("Please input tuition percentage increase for year %.0f: \n",year);
			interest = scan.nextDouble();
			tuition *= ((interest/100)+1);
			total += tuition;
		}
		System.out.printf("Total cost over four years is $%.2f",total);
	}

}
