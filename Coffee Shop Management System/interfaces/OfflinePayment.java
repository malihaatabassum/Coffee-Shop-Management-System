package interfaces;
import java.lang.*;
import classes.*;
public interface OfflinePayment
{
	public void setAmount(int amount);
	public int getAmount();
	public void setReceiptNo(int receiptNo);
	public int getReceiptNo();
}