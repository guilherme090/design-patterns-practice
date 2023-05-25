package decorator;

public class ExampleDecorator {
	public static void main(String[] args) {
		Pizza pizzaSimples = new PlainPizza();
		System.out.println(pizzaSimples);
		
		Pizza pizzaComQueijo = new Cheese(new PlainPizza());
		System.out.println(pizzaComQueijo);
		
		Pizza pizzaComQueijoDuplo = new Cheese(pizzaComQueijo);
		System.out.println(pizzaComQueijoDuplo);
		
		Pizza pizzaCompleta = new Cheese(new Tomato((new PlainPizza())));
		System.out.println(pizzaCompleta);
	}
}
