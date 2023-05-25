package factoryMethod;

public class Criador2 implements Criador{

	@Override
	public Produto factoryMethod() {
		return new Produto2();
	}

}
