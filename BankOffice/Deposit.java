package BankOffice;

public class Deposit extends BankAccounts {
	
	private double monthlyPayment; 
	double availability;


	public Deposit(String name, int interest, int period) {
		super(name, interest);
		this.setPeriod(period);
		
	}


	public double initMonthlyPayment() {
		monthlyPayment = (this.getAvailability()*this.getInterest()/100)/this.getPeriod();
		return monthlyPayment;
	}
	
	public void info () {
		System.out.println("Dep name: " + this.name);
		System.out.println("Dep availability: " + this.availability);
		System.out.println("Dep monthly payment: " + this.monthlyPayment);
	}


	public double getAvailability() {
		return availability;
	}

	public void setAvailability(double amount) {
		this.availability = amount;
		
	}


	public double getMonthlyPayment() {
		return monthlyPayment;
	}
	
	
	
	
	
}
