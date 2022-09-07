package multiples3or5;

import java.util.Scanner;

public class MultiplesOf3Or5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter a positive natural number: ");
		int number = Integer.parseInt(sc.nextLine());
		sc.close();

		if (number > 0) {

			int sumThreeOrFive = 0;
			
			for (int i = 0; i <= number; i ++) {
				if(i %3 == 0 || i %5 == 0){
				sumThreeOrFive += i;
				}
			}
			
			System.out.println(sumThreeOrFive);

		} else {
			System.out.println(0);
		}
	}
}

