package FirstApplication;

public class Main {

	public static void main(String[] args) {

		
		Burger burger=new Burger("King","veg",20,"Thin Crust");
		
		
burger.BurgerItemizer();	

burger.Addition1(10, "tomato ketchup");
burger.Addition2(20, "cock");
burger.Addition3(40, "fries");
burger.Addition4(50, "tikki");

System.out.println("The total price of your order is "+burger.BurgerItemizer()+"\n");	

SpecialBurger specialburger=new SpecialBurger("chicken",100);

specialburger.Addition1(20, "drinks");

//specialburger.BurgerItemizer();		

specialburger.specialAddition1("alcohole", 200);
specialburger.SpecialAddition2("wine", 400);

System.out.println("The total price of your order is "+specialburger.BurgerItemizer()+"\n\n");	


SuperBurger Super=new  SuperBurger();

System.out.println("the total bill is "+Super.BurgerItemizer());


Super.Addition1(21, "s");

	}

}
