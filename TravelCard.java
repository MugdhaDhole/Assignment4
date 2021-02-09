package inheritanceAndAbstraction;

interface Rewardable {
	int calculateReward(int amount);
}

public class TravelCard extends PrepaidCard implements Rewardable {

	int rewardpoints;

	@Override
	boolean swipeCard(int amount) {
		if (amount > swipelimit && amount > availablebalance) {
			
			return false;
		} else
		{
			availablebalance -= (amount/100)*5;		//Processing charge of 5% of amount
			return true;
		}
	}

	@Override
	public int calculateReward(int amount) {
		if (amount > 100) {
			rewardpoints = rewardpoints + 5;	//5 Reward points are given for every 100 INR swiped
		}
		return rewardpoints;
	}

}
