package classes;

public abstract class Payment
{
	private String paymentType;

	public Payment(String paymentType)
	{
		this.paymentType = paymentType;
	}
	public abstract void paymentValidity();
    public void Type()
    {
        System.out.println("Payment type is - "+paymentType);
    }
}