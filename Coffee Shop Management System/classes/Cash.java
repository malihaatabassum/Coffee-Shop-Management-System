package classes;
import java.lang.*;
import interfaces.*;

public class Cash extends Payment implements OfflinePayment
{
	public int amount;
	public int receiptNo;
	public Cash(int amount, int receiptNo)
	{
		super("Cash");
		this.amount = amount;
		this.receiptNo = receiptNo;
	}
	public void setAmount(int amount)
	{
		this.amount = amount;
	}
	public void setReceiptNo(int receiptNo)
	{
		this.receiptNo = receiptNo;
	}
	public int getAmount()
	{
		return amount;
	}
	public int getReceiptNo()
	{
		return receiptNo;
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