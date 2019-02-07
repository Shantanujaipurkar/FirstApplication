package FirstApplication;

public class SuperBurger extends Burger {

	public SuperBurger() {
		super("super","vegiterian", 400, "white");

	super.Addition1(300, "chipes");
	super.Addition2(100, "coldDrinks");  //here we are adding the item at a time of creating the object .
		
	}

	@Override
	public void Addition1(int price, String name) {
System.out.println("can not add additional items to super Burger");
}

	@Override
	public void Addition2(int price, String name) {
		System.out.println("can not add additional items to super Burger");
	}
																					//this are the the methods which are override from the  Burger clss
	@Override 
	public void Addition3(int price, String name) {
		System.out.println("can not add additional items to super Burger");
	}

	@Override
	public void Addition4(int price, String name) {
		System.out.println("can not add additional items to super Burger");
	}
	
	
	
	
	
	

}
