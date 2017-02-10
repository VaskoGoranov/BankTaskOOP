package BankOffice;

public class Credit extends BankAccounts {
	
	
	private final double owed;
	private double monthlyFee;
	double availability;

	public Credit(String name, int interest) {
		super(name, interest);
		owed = this.availability;
	}

	public double getMonthlyFee() {
		if (this.availability<0){
			monthlyFee = ((owed*-1)+(owed*(-1))*this.getInterest()/100)/this.getPeriod();
			return monthlyFee;
		}
		else {
			System.out.println("Credit is paid off!");
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Credit [owed=" + owed + ", monthlyFee=" + monthlyFee + "]";
	}

	@Override
	public void setAvailability(double amount) {
		this.availability = -amount;
		
	}
	
	

}
