package classes;
import java.lang.*;
import interfaces.*;

public class CreditCard extends Payment implements OnlinePayment
{
	public String cardName;
	public int cardNumber;
	public int amount;
	public int pinNumber;
	public CreditCard(String cardName, int cardNumber, int amount, int pinNumber)
	{
		super("Credit Card");
		this.cardName = cardName;
		this.cardNumber = cardNumber;
		this.amount = amount;
		this.pinNumber = pinNumber;
	}
	public void setCardName(String cardName)
	{
		this.cardName = cardName;
	}
	public String getCardName()
	{
		return cardName;
	}
	public void setCardNumber(int cardNumber)
	{
		this.cardNumber = cardNumber;
	}
	public int getCardNumber()
	{
		return cardNumber;
	}
	public void setAmount(int amount)
	{
		this.amount = amount;
	}
	public int getAmount()
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
	public void PayAmount()
	{
		System.out.println("Payment is done & the amount is "+amount);
	}
}