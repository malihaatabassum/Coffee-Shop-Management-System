package classes;
import java.lang.*;
import interfaces.*;

public class MembershipCard extends Payment implements OnlinePayment
{
	public String memCardName;
	public int memCardNumber;
	public double amount;
	public int pinNumber;
	public MembershipCard(String memCardName, int memCardNumber, int amount, int pinNumber)
	{
		super("Membership Card");
		this.memCardName = memCardName;
		this.memCardNumber = memCardNumber;
		this.amount = amount;
		this.pinNumber = pinNumber;
	}
	public void setMemberCardName(String memCardName)
	{
		this.memCardName = memCardName;
	}
	public String getMemberCardName()
	{
		return memCardName;
	}
	public void setMemberCardNumber(int memCardNumber)
	{
		this.memCardNumber = memCardNumber;
	}
	public int getMemberCardNumber()
	{
		return memCardNumber;
	}
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	public double getAmount()
	{
		return amount;
	}
	public void setPinNumber(int pinNumber)
	{
		this.pinNumber = pinNumber;
	}
	public int getPinNumber()
	{
		return pinNumber;
	}
	public void paymentValidity()
	{
		System.out.println("This payment type is valid at this time");
	}
	public double PayAmount()
	{
		System.out.println("Payment is done with 5% of discount & the amount is "+amount);
	}
}