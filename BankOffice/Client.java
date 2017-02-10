package BankOffice;

import java.util.ArrayList;

public class Client {
	
	private String name;
	private String address;
	private double money;
	private double salary;
	private ArrayList<Deposit> deposits = new ArrayList<>();
	private ArrayList<Credit> credits = new ArrayList<>();
	
	public Client(String name, String address, double money, double salary) {
		//TODO validations
		this.name = name;
		this.address = address;
		this.money = money;
		this.salary = salary;
	}
	
	public void applyForCredit (Bank bank, Credit type, double amount, int period) {
		bank.approveCredit(this, type, amount, period);
	}
	
	public void addCredit (Credit credit) {
		this.credits.add(credit);
	}
	
	public double openDeposit (Deposit deposit, double sum) {
		if (this.money >= sum) {
			this.money -= sum;
			return sum;
		}
		return -1;
	}
	
	public void addDeposit (Deposit deposit) {
		deposits.add(deposit);
	}
	
	public void receiveSalary () {
		this.money += this.salary;
	}
	
	public ArrayList<Deposit> getDeposits() {
		return deposits;
	}

	public ArrayList<Credit> getCredits() {
		return credits;
	}
	
	

	public String getName() {
		return name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public void payOffCredit (BankAccounts credit, double sum) {
		
	}
	
	public void clientInfo () {
		System.out.println("Name: " + this.name);
		System.out.println("Available money : " + this.money);
		System.out.println("Salary : " + this.salary);
		System.out.println("Deposit list: ");
		for (Deposit dep : this.deposits) {
			System.out.println("----------------------------------");
			dep.info();
		}
//		for (Credit cred : this.credits) {
//			cred.info();
//		}
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", address=" + address + ", money=" + money + ", salary=" + salary
				+ ", deposits=" + deposits + ", credits=" + credits + "]";
	}

	
	
}
