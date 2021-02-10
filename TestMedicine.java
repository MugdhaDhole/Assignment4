package assignmentPackage;

public class TestMedicine {

	public static void main(String[] args) {

		double randomnumber = 1 + Math.random() * 3; // Generate 1,2 and 3
		int r = (int) randomnumber;
		System.out.println("Number : " + r);

		switch (r) {
		case 1:
			Medicine tablet = new Tablet();
			System.out.println("Tablets");
			tablet.getDetails(80, "01 Jan 2022");
			tablet.displayLabel();
			break;
		case 2:
			Medicine Syrup = new Syrup();
			System.out.println("Syrup");
			Syrup.getDetails(200, "Best before 12 months after packaging");
			Syrup.displayLabel();
			break;
		case 3:
			Medicine ointment = new Ointment();
			System.out.println("Ointment");
			ointment.getDetails(50, "Best before 12 months after packaging");
			ointment.displayLabel();
			break;
		default:
			System.out.println("Invalid Value");
		}
	}
}
