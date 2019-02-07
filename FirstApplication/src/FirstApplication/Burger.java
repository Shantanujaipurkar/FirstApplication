package FirstApplication;

public class Burger {
	
	private String name;
	private String meat;    
	private double price;
	private String rolltype;
	
	
	private int Additional1price;
	private String Additional1name;
	
	private int Additional2price;			//these are the varibles are the variables which are going to be addtional variables  other then the upper variables.
	private String Additional2name;
	
	private int Additional3price;
	private String Additional3name;
	
	private int Additional4price;
	private String Additional4name;
	
	
	public Burger (String name,String meat,double price,String rolltype){
	
		this.name=name;
		this.meat=meat;
		this.price=price;   		//initalizing the variabls wth this keyword.
		this.rolltype=rolltype;
		
		
		
	}
	
	
	public void Addition1(int price,String name){
		this.Additional1price=price;
		this.Additional1name=name;
	
	}
	
	public void Addition2(int price,String name){
		this.Additional2price=price;
		this.Additional2name=name;
	
	}

	public void Addition3(int price,String name){
		this.Additional3price=price;
		this.Additional3name=name;
	
	}
	public void Addition4(int price,String name){
		this.Additional4price=price;
		this.Additional4name=name;
	
	}

	public double BurgerItemizer() {
		
		double Burgerprice=this.price;
		
		System.out.println(this.name+" burger having " +this.meat+" meat with "+this.rolltype+" rolltype is ordered . Price is "+this.price +" .Rs");
		
		if(this.Additional1name!=null) { 
			//if the additional name in the addition 1 is equal to not null then the condition accepts the input and display the message and also print the result. 
			
			Burgerprice+=this.Additional1price;
			System.out.println("the extra order of "+this.Additional1name+" having cost of "+this.Additional1price+" is ordered");
			
			
		}
		if(this.Additional2name!=null) {
			Burgerprice+=this.Additional2price;
			System.out.println("the extra order of "+this.Additional2name+" having cost of "+this.Additional2price+" is ordered");
			
			
		}
		if(this.Additional3name!=null) {
			Burgerprice+=this.Additional3price;
			System.out.println("the extra order of "+this.Additional3name+" having cost of "+this.Additional3price+" is ordered");
			
			
		}
		if(this.Additional4name!=null) {
			Burgerprice+=this.Additional1price;
			System.out.println("the extra order of "+this.Additional4name+" having cost of "+this.Additional4price+" is ordered");
			
			
		}
	
		return Burgerprice;	
				
	}
	
	
	
	
}

