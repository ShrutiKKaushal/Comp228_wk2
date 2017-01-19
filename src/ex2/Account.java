package ex2;

public class Account {
	
	private String name = "DEFAULT";
	
	//Constructor
	public Account(String name){
		this.name = name;
	}
	
	//setter
	public void setName(String NewName){
		this.name = NewName;
	}
	
	//Getter
	public String getName(){
		return name;
	}
}
