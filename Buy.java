public class Buy
{
	private Customer owner;
	private String Buy;

	public String getBuy(){
		return Buy;
	}
	public String getCustomerName(){
		return owner.getName();
	}
	public void setBuy(String customerBuy){
		Buy = customerBuy;
	}
	public void CustomerName(Customer customer){
		owner = customer;
	}
	public String toString(){
		return "Customer Name:" + owner.getName() + "\n" + "Buy:" + Buy;
	}
}
