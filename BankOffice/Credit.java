package BankOffice;

public class Credit extends BankAccounts {
	
	
	private double owed;
	private double monthlyFee;
	private double availability;

	public Credit(String name, int interest) {
		super(name, interest);
		
	}

	public void initMonthlyFee () {
		
		monthlyFee = (owed+owed*this.getInterest()/100) /this.getPeriod();
	}

	public double getMonthlyFee() {
		return monthlyFee;
	}

	@Override
	public void setAvailability(double amount) {
		this.availability = amount;
		this.owed = amount;
	}
	
	public void info () {
		System.out.println("Credit name: " + this.name);
		System.out.println("       remaining payment: " + this.availability);
		System.out.println("       period: " + this.period + " months");
		System.out.println("       monthly fee: " + this.monthlyFee);
	}

	public double getAvailability() {
		return availability;
	}
	
	

}
