import java.util.Scanner;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayList {
	public static void main(String[] args) {
		
		System.out.println("Give me five numbers!");
		Scanner sc = new Scanner(System.in);
	   
		String numStr = sc.nextLine();
		String[] splitStr = numStr.split ("");
		
		int[] numArr = new int[splitStr.length];
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = Integer.parseInt(splitStr[i]);
		}
		
		int sum = Arrays.stream(numArr).sum();
		
		int product = 1;
		for (int num: numArr) {
			product *= num;
		}
		
		int largest = numArr[0];
		for (int num: numArr) {
			if (num > largest) {
				largest = num;
			}
		}
		
		int smallest = numArr[0];
		for (int num: numArr) {
			if (num < smallest) {
				smallest = num;
			}
		}
		
		System.out.println(sum);
		System.out.println(product);
		System.out.println(largest);
		System.out.println(smallest);

		
		
		
		HashMap<String, String> dealer = new HashMap<String, String>();
		
		dealer.put("6", "Mazda");
		dealer.put("Forester", "Subaru");
		dealer.put("Mustang", "Ford");
		dealer.put("Corola", "Toyota");
		dealer.put("Pilot", "Honda");
		dealer.put("Corolla", "Toyota");
		dealer.put("Outback", "Subaru");
		
		System.out.println("What model of car are you looking for?");
		String model = sc.nextLine();
		System.out.printf("Oh, you're looking for a %s? Out %s selection is right over here...", model,dealer.get(model));
	


	}
	}
