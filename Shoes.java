public class Shoes
{
	public static void main(String[]args){

		Customer customer1, customer2;
		Buy buy1, buy2;

		customer1 = new Customer();
		customer1.setName("Drenny Cordero");

		customer2 = new Customer();
		customer2.setName("Mitch Sinangote");

		buy1 = new Buy();
		buy1.setBuy("Converse");
		buy1.setcustomerName(customer1);

		buy2 = new Buy();
		buy2.setBuy("Nike");
		buy2.setcustomerName(customer2);

		System.out.println(buy1.toString());
		System.out.println(buy2.toString());
	}
}
