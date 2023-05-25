package decorator;

public class PlainPizza implements Pizza {

	@Override
	public String getDescription() {
		return "Pizza";
	}

	@Override
	public double getCost() {
		return 10.0;
	}
	
	@Override
	public String toString() {
		String desc = "Description: " + this.getDescription();
		String cost = "Cost: $" + this.getCost();
		return desc + '\n' + cost;
	}
}
