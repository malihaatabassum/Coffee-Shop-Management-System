import java.lang.*;
import classes.*;
import interfaces.*;
import java.util.*;
import fileio.*;

public class Main
{
        public static void main(String[] args)
        {
                Manager m1 = new Manager(2121,"farhana ","0192899767","f@gmail.com","uttara,Dhaka");
                Waiter w1 = new Waiter(738372,"yeasmin ","01928900838","uttara,Dhaka");
                Customer c1 = new Customer();
                Order o1 = new Order();
                CoffeeShop s1 = new CoffeeShop(1234,"FMkoffee","01476299245","Dhaka", m1 , w1 , c1 );
                System.out.println("Shop Information : ");
                System.out.println("Shop ID: "+s1.getShopID());
                System.out.println("Shop Name: "+s1.getShopName());
                System.out.println("Shop Address: "+s1.getShopAddress());
                System.out.println("Shop's Phone Number: "+s1.getPhoneNumber());
                System.out.println();

                System.out.println("Manager Information : ");
                System.out.println("Manager ID: "+s1.getManager().getManagerID());
                System.out.println("Manager Name: "+s1.getManager().getManagerName());
                System.out.println("Manager's Phone Number: "+s1.getManager().getManagerPhoneNumber());
                System.out.println("Manager' Email: "+s1.getManager().getManagerEmail());
                System.out.println("Manager Address: "+s1.getManager().getManagerAddress());
                s1.getManager().bookOrder();
                s1.getManager().checkOrderAvailability();
                s1.getManager().printInvoice();
                System.out.println();


                
                Scanner n1 = new Scanner(System.in);
                Scanner n2 = new Scanner(System.in);
                System.out.println("Customer details Input : ID -> Name -> Phone Number -> Email -> Address ");
                int id= n1.nextInt();
                String name= n2.nextLine();
                String phoneNo= n2.nextLine();
                String email= n2.nextLine();
                String address= n2.nextLine();
                

                c1.setCustomerID(id);
                c1.setCustomerName(name);
                c1.setCustomerPhoneNumber(phoneNo);
                c1.setCustomerEmail(email);
                c1.setCustomerAddress(address);
                FileReadWriteDemo frwd = new FileReadWriteDemo();
                frwd.writeInFile(name,id,phoneNo,email,address);
                System.out.println("Customer Information : ");
                System.out.println("Customer ID: "+c1.getCustomerID());
                System.out.println("Customer Name: "+c1.getCustomerName());
                System.out.println("Customer' Phone Number: "+c1.getCustomerPhoneNumber());
                System.out.println("Customer' Email: "+c1.getCustomerEmail());
                System.out.println("Customer Address: "+c1.getCustomerAddress());
                System.out.println();

                System.out.println("Order details Input: Order ID -> Item Name -> Item Quantity " );
                int orderID= n1.nextInt();
                String itemName= n2.nextLine();
                int itemQuantity= n1.nextInt();
                
                o1.setOrderID(orderID);
                o1.setItemName(itemName);
                o1.setItemQuantity(itemQuantity);
                System.out.println("Order Information : ");
                System.out.println("Order ID: "+o1.getOrderID());
                System.out.println("Item Name: "+o1.getItemName());
                System.out.println("Item Quantity: "+o1.getItemQuantity()); 
                System.out.println();


                System.out.println("There are 2 types of payment option: "  );
                System.out.println("1. Credit Card ");
                System.out.println("2. Cash ");

                System.out.print("\nPress your desire Payment option :");
                int ch= n1.nextInt();

                switch(ch)  
                {  
                  case 1:
                    System.out.println("Card details Input: Card Name -> Card Number -> Pin Number ->  Amount" );
                    String cardName= n2.nextLine();
                    int cardNum= n1.nextInt();
                    int pin1= n1.nextInt();
                    int amount1 = n1.nextInt();  
                    CreditCard crd = new CreditCard(cardName,cardNum,amount1,pin1);
                    System.out.println("Card Payment Information : ");
                    System.out.println("Card name : "+crd.getCardName()); 
                    System.out.println("Card number : "+crd.getCardNumber()); 
                    System.out.println("Card pin number : : "+crd.getPinNumber());
                    System.out.println("Ammount : "+crd.getAmount());
                  
                  break;
              
                  case 2:
                    System.out.println("Cash details Input: Receipt No -> Amount" );
                    int receiptNo= n1.nextInt();
                    int amount2 = n1.nextInt(); 
                    Cash csh = new Cash(amount2,receiptNo);
                    System.out.println("Cash Payment Information : ");
                    System.out.println("Receipt number : "+csh.getReceiptNo());
                    System.out.println("Ammount : "+csh.getAmount());

                  break;

                  default:   
                    System.out.println("You input the wrong number");  
                } 
                System.out.println();
                System.out.println("Waiter Information : ");
                System.out.println("Waiter ID: "+s1.getWaiter().getWaiterID());
                System.out.println("Waiter Name: "+s1.getWaiter().getWaiterName());
                System.out.println("Waiter Phone Number: "+s1.getWaiter().getWaiterPhoneNumber());
                System.out.println("Waiter Address: "+s1.getWaiter().getWaiterAddress());
                s1.getWaiter().takeOrder();
                System.out.println();


        }
}