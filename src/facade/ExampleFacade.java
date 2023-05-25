package facade;

public class ExampleFacade {
	public static void main(String[] args) {
		ComputerFacade computerFacade = new ComputerFacade();
		computerFacade.startComputer();
		System.out.println("--------------------------");
		computerFacade.shutdownComputer();
	}
}
