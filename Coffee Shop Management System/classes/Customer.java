package classes;
import java.lang.*;

public class Customer
{
	private int customerID;
	private String customerName;
	private String customerPhoneNumber;
	private String customerEmail;
	private String customerAddress;
	private Payment pay;
	private Order odr;

	public Customer()
	{

	}
	/*public Customer(int customerID, String customerName, String customerPhoneNumber, String customerEmail, String customerAddress, Payment pay, Order odr)
	{
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerPhoneNumber = customerPhoneNumber;
		this.customerEmail = customerEmail;
		this.customerAddress = customerAddress;
		this.pay = pay;
		this.odr = odr;
	}*/
	public void setCustomerID(int customerID)
	{
		this.customerID = customerID;
	}
	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber)
	{
		this.customerPhoneNumber = customerPhoneNumber;
	}
	public void setCustomerEmail(String customerEmail)
	{
		this.customerEmail = customerEmail;
	}
	public void setCustomerAddress(String customerAddress)
	{
		this.customerAddress = customerAddress;
	}
	public void setPayment(Payment pay)
	{
		this.pay = pay;
	}
	public void setOrder(Order odr)
	{
		this.odr = odr;
	}
	public int getCustomerID()
	{
		return customerID;
	}
	public String getCustomerName()
	{
		return customerName;
	}
	public String getCustomerPhoneNumber()
	{
		return customerPhoneNumber;
	}
	public String getCustomerEmail()
	{
		return customerEmail;
	}
	public String getCustomerAddress()
	{
		return customerAddress;
	}
	public Payment getPayment()
	{
		return pay;
	}
	public Order getOrder()
	{
		return odr;
	}
}