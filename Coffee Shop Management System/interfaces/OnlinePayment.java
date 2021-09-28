package interfaces;
import java.lang.*;
import classes.*;
public interface OnlinePayment
{
	public void setAmount(int amount);
	public int getAmount();
	public void setPinNumber(int pinNumber);
	public int getPinNumber();
}