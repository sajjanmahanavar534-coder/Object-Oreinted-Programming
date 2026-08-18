package bank;


public class ATM {
	
	public static void displaybalance(int balance) {
		System.out.println("current balance :" + balance);
	}
	
	
	public static int amountwithdrawing(int balance,int withdrawamount) {
	   System.out.println("\nwithdrawing amount :" + withdrawamount);
	   
	   if (balance >= withdrawamount) {
		   balance = balance - withdrawamount;
		   System.out.println("please collect your money and card." );
		   displaybalance(balance);
	   } else {
		   System.out.println("sorry! insufficient funds");
		   System.out.println();
	   }
	   
	   return balance;
	}
	
	public static int amountdepositing(int balance,int depositamount) {
		System.out.println("\ndepositring amount : + depositamount");
		
		balance = balance + depositamount;
		System.out.println("deposit sucessful.");
		displaybalance(balance);
		
		return balance;
	}
	
	public static void main(String args[]) {
		int balance = 10000;
		int withdrawamount = 10000;
		int depositamount = 20000;
		
		displaybalance(balance);
		balance=amountwithdrawing(balance,withdrawamount);
		balance= amountdepositing(balance,depositamount);
		
	}
		
	
	   
	   
	   
	   
	    
	   
	   
	   
	
		
		
	
}