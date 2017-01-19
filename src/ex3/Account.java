package ex3;

public class Account {
	private String name = "DEFAULT";
	private double balance;
	//Constructor
	public Account(String name, double balance){
		this.name = name;
		if(balance > 0.0){
			this.balance = balance;	
		}
	}
	public double getBalance(){
		return balance;
	}
	
	//setter
	public void setName(String NewName){
		this.name = NewName;
	}
	
	//Getter
	public String getName(){
		return name;
	}
	
	public void deposit(double depositAmount){
		if(depositAmount > 0.0){
			balance = balance + depositAmount;
		}
	}
}
