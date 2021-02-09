package assignmentPackage;

class Address {
	private String addressline;
	private String city;

	public Address(String addressline, String city) {

		this.addressline = addressline;
		this.city = city;
	}

	public String getAddressline() {
		return addressline;
	}

	public void setAddressline(String addressline) {
		this.addressline = addressline;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddressDetails() {
		return addressline + " " + city; // returns a String with address details
	}
}

class Customer {
	private String name;
	private Address address;
	private Address officialaddress;

	public Customer() { // ?
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, Address address, Address officialaddress) {
		this.name = name;
		this.address = address;
		this.officialaddress = officialaddress;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address.getAddressline() + " " + address.getCity();
	}

	// getters and setters for officialAddress
	public Address getOfficialAddress() {
		return officialaddress;
	}

	public void setOfficialAddress(Address officialAddress) {
		this.officialaddress = officialAddress;
	}

	public String getCustomerDetails() {

		return "Customer : " + name + " \nResidential Address : " + address.getAddressDetails()
				+ " \nOfficial Address : " + officialaddress.getAddressDetails();
	}

}

public class TestCustomer {

	public static void main(String[] args) {

		Address address = new Address("Ist Main HSR Layout,", "Bangalore");
		Address officialaddress = new Address("Ist Main Electronics city,", "Bangalore");

		Customer customer = new Customer("Tom", address, officialaddress);

		// Use of setters to assign values
		customer.setName("Tom");
		customer.setAddress(address);

		// Use of getters to display values
		System.out.println("Customer : " + customer.getName());
		System.out.println("Residential Address : " + customer.getAddress());

		System.out.println(customer.getCustomerDetails()); // Display values using getAddressDetails() method

	}

}
