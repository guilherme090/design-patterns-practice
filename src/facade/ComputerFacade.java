package facade;

// façade

public class ComputerFacade {
	private CPU cpu;
	private Memory memory;
	private HardDrive hardDrive;
	
	public ComputerFacade() {
		this.cpu = new CPU();
		this.memory = new Memory();
		this.hardDrive = new HardDrive();
	}
	
	public void startComputer() {
		System.out.println("Iniciando o computador...");
		cpu.start();
		memory.load();
		hardDrive.read();
		System.out.println("Computador iniciado com sucesso!");
	}
	
	public void shutdownComputer() {
		cpu.shutdown();
		memory.free();
		hardDrive.write();
		System.out.println("Computador desligado com sucesso!");
	}
}
