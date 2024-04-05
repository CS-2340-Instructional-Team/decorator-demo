package starbuzz;

public class StarbuzzCoffee {

	public static void main(String args[]) {
		// Espresso
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());

		
		//Dark Roast Grande Double Mocha Whip
		Beverage beverage2 = new DarkRoast();
		beverage2.setSize(beverage2.size.GRANDE);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

		// House Blend Venti Soy Mocha Whip
		Beverage beverage3 = new HouseBlend();
		beverage3.setSize(beverage3.size.VENTI);
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
	}

}

