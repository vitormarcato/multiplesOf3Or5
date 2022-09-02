package multiples3or5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiplesOf3Or5 {

	public static void main(String[] args) {

		int number = 0;
		int sum = 0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter a positive natual number: ");
		number = Integer.parseInt(sc.nextLine());
		sc.close();
		
		List<Integer> list = new ArrayList<>();

		if (number > 0) {
			int multipleOfThree = number / 3;
			int multipleOfFive = number / 5;
			for (int i = 1; i <= multipleOfThree; i++) {
				int multiple = i * 3;
				list.add(multiple);
			}

			for (int i = 1; i <= multipleOfFive; i++) {
				int multiple = i * 5;
				list.add(multiple);
			}

			// removing duplicates
			List<Integer> newList = new ArrayList<Integer>();
			for (Integer element : list) {

				if (!newList.contains(element)) {

					newList.add(element);
				}

			}

			for (Integer numberOfNewList : newList) {
				sum += numberOfNewList;
			}

			System.out.println(sum);

		} else {
			System.out.println(0);
		}
	}
}

