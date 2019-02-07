package FirstApplication;

public class SpecialBurger extends Burger {

	private String Special1name;
	private int Special1Price;
	
	  							  //here we are declaring the two extra items we want to add in the SpecialBurger 
	private String Special2name;
	private int Special2Price;
	
	
		
	
	
	public SpecialBurger( String meat, int price) {
		super("special", meat, price, "brown brad");  //meat ane price are declared in the Parent calss ie Burger class. 
	}


	public void specialAddition1(String name,int price) {
		
		this.Special1name=name;
		this.Special1Price=price;   				//creating the methods  Addition1 of the initalizing the variables using this keywords.
	}
	
	
	public void SpecialAddition2(String name,int price) {
		
		this.Special2name=name;
		this.Special2Price=price;					//creating the methods  Addition1 of the initalizing the variables using this keywords.
	}


	@Override
	public double BurgerItemizer() {
		double specialburgerprice= super.BurgerItemizer();//overriding the method from super class which can help to call the method firstly 
																//in this class without calling the methid in the super class
		
		if(Special1name!=null) {
			specialburgerprice+=this.Special1Price;
			System.out.println("added the extra " +this.Special1name+" of Rs "+this.Special1Price );
			
	
		}
		if(Special2name!=null) {
			specialburgerprice+=this.Special2Price;
			System.out.println("added the extra " +this.Special2name+" of Rs "+this.Special2Price );
			
		
		}
	
		return specialburgerprice;
	}
	
	
	

}
