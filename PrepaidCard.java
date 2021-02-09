package inheritanceAndAbstraction;

public abstract class PrepaidCard {

	int cardno=5678;
	double availablebalance=80000;
	double swipelimit=50000;
	
	abstract boolean swipeCard(int amount);

	@Override
	public String toString() {
		return "Card No.=" + cardno + "\nAvailable Balance=" + availablebalance + "\nSwipe"
				+ "Limit=" + swipelimit;
	}
	
	public void rechargeCard(int amount)
	{
		availablebalance=availablebalance+amount;
		System.out.println("Available Balance : "+availablebalance);
	}
}
