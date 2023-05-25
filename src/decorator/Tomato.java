package decorator;

public class Tomato extends PizzaDecorator {

	public Tomato(Pizza decoratedPizza) {
		super(decoratedPizza);
	}
	
	@Override
	public String getDescription() {
		return super.getDescription() + ", Tomato";
	}
	
	@Override
	public double getCost() {
		return super.getCost() + 1.5;
	}
	
	@Override
	public String toString() {
		String desc = "Description: " + this.getDescription();
		String cost = "Cost: $" + this.getCost();
		return desc + '\n' + cost;
	}

}
