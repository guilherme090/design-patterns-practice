package decorator;

public class PizzaDecorator implements Pizza {
	protected Pizza decoratedPizza;
	
	public PizzaDecorator(Pizza decoratedPizza) {
		this.decoratedPizza = decoratedPizza;
	}
	
	@Override
	public String getDescription() {
		return decoratedPizza.getDescription();
	}

	@Override
	public double getCost() {
		return decoratedPizza.getCost();
	}
	
	@Override
	public String toString() {
		return decoratedPizza.toString();
	}

}
