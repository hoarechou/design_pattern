public class Main{

	public static void main(String args[]){
		PizzaStore store = new PizzaStore(new SimplePizzaFactory());
		store.orderPizza("Cheese");
		store.orderPizza("Clam");
	}
}
