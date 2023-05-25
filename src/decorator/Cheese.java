package decorator;

public class Cheese extends PizzaDecorator {

	public Cheese(Pizza decoratedPizza) {
		super(decoratedPizza);
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + ", Cheese";
	}
	
	@Override
	public double getCost() {
		return super.getCost() + 2.0;
	}
	
	@Override
	public String toString() {
		String desc = "Description: " + this.getDescription();
		String cost = "Cost: $" + this.getCost();
		return desc + '\n' + cost;
	}

}
