public class Main {

	public static void main(String[] s) {
		Admin a = new Admin();
		a.name = "Rubel Patwary";

		String customerState = "Dhaka";
		String customerCity = "Mirpur";
		String customerCountry =  "Bangladesh";
		System.out.println(a);

		Address address1=new Address(customerCity, customerState, customerCountry);
		Customer c = new Customer("Rubel Patwary (171442607)", address1);

		System.out.println(c);
	}
}
