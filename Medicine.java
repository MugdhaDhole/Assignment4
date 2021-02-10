package assignmentPackage;

public abstract class Medicine {

	int price;
	String expirydate;

	void getDetails(int price, String expirydate) { // Method with parameters
		this.price = price;
		this.expirydate = expirydate;

		System.out.println("Price : " + price);
		System.out.println("Expiry Date : " + expirydate);
	}

	abstract void displayLabel(); // abstract method

}
