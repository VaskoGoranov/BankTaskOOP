package BankOffice;

public abstract class BankAccounts {
	
	String name;
	int interest;
	int period;
	
	
	
	
	public BankAccounts(String name, int interest) {
		//TODO validation
		this.name = name;
		this.interest = interest;
	}
	public int getInterest() {
		return interest;
	}
	
	public void setPeriod(int period) {
		this.period = period;
	}
	public int getPeriod() {
		return period;
	}
	
	public abstract void setAvailability(double amount);
	
		
	

}
