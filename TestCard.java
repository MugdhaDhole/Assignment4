package inheritanceAndAbstraction;

import java.util.Scanner;

public class TestCard {

	public static void main(String[] args) {
		
		TravelCard travelcard = new TravelCard();
		
		System.out.println(travelcard.toString());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter withdrawal amount : ");
		int amount = sc.nextInt();
		int convertamount = amount * 60;	// dollars is converted in to INR	

		if (travelcard.swipeCard(convertamount) == true) {
			System.out.println("You can withdraw amount");
			System.out.println(travelcard.toString());
			travelcard.calculateReward(convertamount);
			System.out.println("Reward Points : " + travelcard.rewardpoints);
		} else {
			System.out.println("You cannot withdraw amount");
		}
		sc.close();
	}

}
