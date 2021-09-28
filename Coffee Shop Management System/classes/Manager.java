package classes;
import java.lang.*;

public class Manager
{
	private int managerID;
	private String managerName;
	private String managerPhoneNumber;
	private String managerEmail;
	private String managerAddress;

	public Manager()
	{

	}
	public Manager(int managerID, String managerName, String managerPhoneNumber, String managerEmail, String managerAddress)
	{
		this.managerID = managerID;
		this.managerName = managerName;
		this.managerPhoneNumber = managerPhoneNumber;
		this.managerEmail = managerEmail;
		this.managerAddress = managerAddress;
	}
	public void setManagerID(int managerID)
	{
		this.managerID = managerID;
	}
	public void setManagerName(String managerName)
	{
		this.managerName = managerName;
	}
	public void setManagerPhoneNumber(String managerPhoneNumber)
	{
		this.managerPhoneNumber = managerPhoneNumber;
	}
	public void setManagerEmail(String managerEmail)
	{
		this.managerEmail = managerEmail;
	}
	public void setManagerAddress(String managerAddress)
	{
		this.managerAddress = managerAddress;
	}
	public int getManagerID()
	{
		return managerID;
	}
	public String getManagerName()
	{
		return managerName;
	}
	public String getManagerPhoneNumber()
	{
		return managerPhoneNumber;
	}
	public String getManagerEmail()
	{
		return managerEmail;
	}
	public String getManagerAddress()
	{
		return managerAddress;
	}
	public void bookOrder()
	{
		System.out.println("Manager book the orders");
	}
	public void checkOrderAvailability()
	{
		System.out.println("Manager check the list that the ordered food available or not!");
	}
	public void printInvoice()
	{
		System.out.println("After payment manager print a invoice");
	}
}