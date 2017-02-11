package BankOffice;

import java.util.ArrayList;
import java.util.HashSet;

public class Bank {
	
	private String name;
	private String address;
	//private HashSet<BankAccounts> products = new HashSet<>();
	private double vault;
	private double cash; 
	private ArrayList<Credit> allCredits = new ArrayList<>();
	private ArrayList<Deposit> allDeposits = new ArrayList<>();
	private HashSet<Client> clients = new HashSet<>();
	
	public Bank(String name, String address, double vault, double cash) {
		//TODO validation
		this.name = name;
		this.address = address;
		this.vault = vault;
		this.cash = cash;
	}
	
	public void takeDeposit (Client client, Deposit type, double amount) {
		if (client.openDeposit(type,amount) > 0){
			this.cash += amount*0.9;
			this.vault += amount*0.1;
			type.setAvailability(amount);
			type.initMonthlyPayment();
			client.addDeposit(type);
			clients.add(client);
		} else {
			System.out.println("The client does not have enough money!");
		}
	}
	
	public void payDividend () {
		
		for (Client e : clients) {
			for (Deposit dep : e.getDeposits()){
				dep.setAvailability(dep.getAvailability()+dep.getMonthlyPayment());
			}
		}
		
	}
	
	public void collectCredits () {
		
		for (Client e : clients) {
			for (Credit cred : e.getCredits()) {
				this.cash += cred.getMonthlyFee();
				cred.setAvailability(cred.getAvailability()-cred.getMonthlyFee());
			}
		}
	}
	
	public void approveCredit (Client client, Credit type, double amount, int period) {
		if(period>0) {
			if(this.cash-amount>=vault && client.applyForCredit(this, type, amount, period)) {
				this.cash -= amount;
				client.setMoney(client.getMoney()+amount);
				type.setAvailability(amount);
				type.setPeriod(period);
				type.initMonthlyFee();
				client.addCredit(type);
				clients.add(client);
				
			}
		}
	}

	public void bankInfo () {
		System.out.println("Bank Name: " + this.name);
		System.out.println("Available cash: " + this.cash);
		System.out.println("Vault status: " + this.vault);
		System.out.println("===============================================");
		System.out.println("Client info: ");
		for (Client client : this.clients) {
			client.clientInfo();
			System.out.println("===============================================");
		}
	}

	public double getVault() {
		return vault;
	}

	public HashSet<Client> getClients() {
		return clients;
	}
	
	

}
