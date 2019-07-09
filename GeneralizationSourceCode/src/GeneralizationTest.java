public class GeneralizationTest {

	public static void main(String[] s) {
		Admin adminInstance = new Admin();
		adminInstance.setName("Rubel Patwary");

		System.out.println(adminInstance);

		Customer c = new Customer("171442607", "Mirpur, Dhaka, Bangladesh");
		System.out.println(c);
	}
}
