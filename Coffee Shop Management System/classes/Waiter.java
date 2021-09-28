package classes;
import java.lang.*;

public class Waiter
{
	private int waiterID;
	private String waiterName;
	private String waiterPhoneNumber;
	private String waiterAddress;

	public Waiter()
	{

	}
	public Waiter(int waiterID, String waiterName, String waiterPhoneNumber, String waiterAddress)
	{
		this.waiterID = waiterID;
		this.waiterName = waiterName;
		this.waiterPhoneNumber = waiterPhoneNumber;
		this.waiterAddress = waiterAddress;
	}
	public void setWaiterID(int waiterID)
	{
		this.waiterID = waiterID;
	}
	public void setWaiterName(String waiterName)
	{
		this.waiterName = waiterName;
	}
	public void setWaiterPhoneNumber(String waiterPhoneNumber)
	{
		this.waiterPhoneNumber = waiterPhoneNumber;
	}
	public void setWaiterAddress(String waiterAddress)
	{
		this.waiterAddress = waiterAddress;
	}
	public int getWaiterID()
	{
		return waiterID;
	}
	public String getWaiterName()
	{
		return waiterName;
	}
	public String getWaiterPhoneNumber()
	{
		return waiterPhoneNumber;
	}
	public String getWaiterAddress()
	{
		return waiterAddress;
	}
	public void takeOrder()
	{
		System.out.println("Waiter take order from the customers.");
	}
}