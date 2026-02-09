package abstraction;
public abstract class Account {
	double balance;
	public Account() {
		super();
		System.out.println("Account Created");
	}
	public Account(double balance) {
		super();
		this.balance = balance;
		System.out.println("Account Created");
	}
	public abstract void withdraw(double amt);
	public abstract String accType();
	public void deposit(double amt) {
		if(amt>0) {
			balance+=amt;
			System.out.println("Deposited "+amt);
			checkBal();
		}else {
			System.out.println("Invalid Transaction");
		}
	}
	public void checkBal() {
		System.out.println("Account Balance : "+balance);
	}
}
*****************************************************************************************************

package abstraction;
public class Current extends Account{
	public Current() {
		super();
		System.out.println("Current Type.");
	}
	public Current(double balance) {
		super(balance);
		System.out.println("Current Type.");
	}
	@Override
	public void withdraw(double amt) {
		if(amt>0 && balance-amt>=2000) {
			balance-=amt;
			System.out.println("Withdrawn : "+amt);
			checkBal();
		}else {
			System.out.println("Invalid Transaction");
		}
	}
	@Override
	public String accType() {
		return "Current Account";
	}
}
***************************************************************************************************

package abstraction;
public class Savings extends Account{
	public Savings() {
		super();
		System.out.println("Savings Type.");
	}
	public Savings(double balance) {
		super(balance);
		System.out.println("Savings Type.");
	}
	@Override
	public void withdraw(double amt) {
		if(amt>0 && amt<=balance) {
			balance-=amt;
			System.out.println("Withdrawn : "+amt);
			checkBal();
		}else {
			System.out.println("Invalid Transaction");
		}
	}
	@Override
	public String accType() {
		return "Savings Account";
	}
}

**********************************************************************************

package abstraction;
import java.util.Scanner;
public class Driver {
	public static Account accountFactory1(int i, double amt) {
		if (i == 1) return new Savings(amt);
		else if (i == 2) return new Current(amt);
		else {
			System.out.println("Choose proper Account Type");
			return null;
		}
	}
	public static void main(String[] args) {
		System.out.println("***Welcome to Chennai Bank***\nChoose your Account type");
		System.out.println("Enter 1 for Savings Account\nEnter 2 for Current Account");
		System.out.print("Enter your choice : ");
		Scanner sc = new Scanner(System.in);
		int type = sc.nextInt();
		System.out.print("Enter initial amount : ");
		double initAmt = sc.nextDouble();
		Account acc = accountFactory1(type, initAmt);
		String opt;
		do {
			System.out.println("***Select your Operation***");
			System.out.println("Enter 1 for deposit\nEnter 2 for Withdraw\nEnter 3 for Check Balance");
			System.out.print("Enter your operation : ");
			int opr = sc.nextInt();
			if (opr == 1) {
				System.out.print("Enter Amount to Deposit : ");
				acc.deposit(sc.nextDouble());
			} else if (opr == 2) {
				System.out.print("Enter Amount to Withdraw : ");
				acc.withdraw(sc.nextDouble());
			} else if (opr == 3) {
				acc.checkBal();
			}
			System.out.println("Do you want to stop ?");
			System.out.print("Enter Yes or No : ");
			sc.nextLine();
			opt = sc.nextLine();

		} while (opt.equalsIgnoreCase("no"));
		System.out.println("****Thankyou****");
	}
}
