package BankOffice;

import java.util.ArrayList;
import java.util.Random;

public class Demo {
	
	public static void main(String[] args) {
		
		Bank allianz = new Bank("Allianz Bank", "Sofia", 2000, 10000);
		
		Client vasko = new Client("Vasil Goranov", "Sofia", 6000, 1000);
		Client pesho = new Client("Petyr Marinov", "Plovdiv", 2000, 750);
		Client eli = new Client("Elitza Todorova", "Varna", 1000, 800);
		Client kiril = new Client("Kiril Yordanov", "Sofia", 20000, 2000);
		Client diana = new Client("Diana Stoqnova", "Sofia", 4400, 1750);
		Client marin = new Client("Marin Vasilev", "Sofia", 350, 400);
		Client ivan = new Client("Ivan Zahariev", "Dobrich", 3000, 1300);
		Client todor = new Client("Todor Georgiev", "Veliko Tyrnovo", 5000, 1430);
		Client gosho = new Client("Georgi Vasilev", "Sofia", 5500, 1800);
		Client milena = new Client("Milena Slavova", "Sofia", 60000, 4000);
		
		ArrayList<Client> klienti = new ArrayList<>();
		klienti.add(vasko);
		klienti.add(pesho);
		klienti.add(eli);
		klienti.add(kiril);
		klienti.add(diana);
		klienti.add(marin);
		klienti.add(ivan);
		klienti.add(todor);
		klienti.add(gosho);
		klienti.add(milena);
		
		Deposit shortDep = new Deposit("Short Deposit", 3, 3);
		Deposit longDep = new Deposit("Long Deposit", 5, 12);
		// Koliu e MEGA pich
				
		for (Client e : klienti) {
			Random r = new Random();
			boolean type = r.nextBoolean();
			if (type){
				allianz.takeDeposit(e, new Deposit("Short Deposit", 3, 3), e.getMoney()*((r.nextInt(20)+80))/100);
			} else {
				allianz.takeDeposit(e, new Deposit("Long Deposit", 5, 12), e.getMoney()*((r.nextInt(20)+80))/100);
			}
		}
		
		for (Client e : klienti) {
			Random r = new Random();
			boolean type = r.nextBoolean();
			if (type){
				allianz.takeDeposit(e, new Deposit("Short Deposit", 3, 3), e.getMoney()*((r.nextInt(20)+80))/100);
			} else {
				allianz.takeDeposit(e, new Deposit("Long Deposit", 5, 12), e.getMoney()*((r.nextInt(20)+80))/100);
			}
		}
		System.out.println("========================================");
		allianz.bankInfo();
		
		
		Credit homeCredit = new Credit("Home Credit", 6);
		Credit consumerCredit =  new Credit("Consumer Credit", 10);
		//TODO add credits for all clients
		
	}

}

