package classes;
import java.lang.*;

public class CoffeeShop
{
	private int shopID;
	private String shopName;
	private String phoneNumber;
	private String shopAddress;
	private Manager m;
	private Waiter w;
	private Customer c;

	public CoffeeShop()
	{}
	public CoffeeShop(int shopID, String shopName, String phoneNumber, String shopAddress, Manager m, Waiter w, Customer c)
	{
		this.shopID = shopID;
		this.shopName = shopName;
		this.phoneNumber = phoneNumber;
		this.shopAddress = shopAddress;
		this.m = m;
		this.w = w;
		this.c = c;
	}
	public void setShopID(int shopID)
	{
		this.shopID = shopID;
	}
	public void setShopName(String shopName)
	{
		this.shopName = shopName;
	}
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	public void setShopAddress(String shopAddress)
	{
		this.shopAddress = shopAddress;
	}
	public void setManager(Manager m)
	{
		this.m = m;
	}
	public void setWaiter(Waiter w)
	{
		this.w = w;
	}
	public void setCustomer(Customer c)
	{
		this.c = c;
	}
	public int getShopID()
	{
		return shopID;
	}
	public String getShopName()
	{
		return shopName;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	public String getShopAddress()
	{
		return shopAddress;
	}
	public Manager getManager()
	{
		return m;
	}
	public Waiter getWaiter()
	{
		return w;
	}
	public Customer getCustomer()
	{
		return c;
	}
}