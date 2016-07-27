public class SimplePizzaFactory{

	public Pizza createPizza(String type){
		if(type.equals("Cheese"))
			return new CheesePizza();
		else	
			return new ClamPizza();
	}

}
