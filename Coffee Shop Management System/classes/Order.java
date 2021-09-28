package classes;
import java.lang.*;

public class Order
{
	private int orderID;
	private String itemName;
	private int itemQuantity;

	public Order()
	{

	}

	public void setOrderID(int orderID)
	{
		this.orderID = orderID;
	}
	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}
	public void setItemQuantity(int itemQuantity)
	{
		this.itemQuantity = itemQuantity;
	}
	public int getOrderID()
	{
		return orderID;
	}
	public String getItemName()
	{
		return itemName;
	}
	public int getItemQuantity()
	{
		return itemQuantity;
	}

}