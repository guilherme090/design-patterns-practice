package facade;

// subsistema complexo 1

public class CPU {
	public void start() {
		System.out.println("CPU: Inicializando...");
	}
	
	public void execute() {
		System.out.println("CPU: Executando...");
	}
	
	public void shutdown() {
		System.out.println("CPU: Desligando...");
	}
}
