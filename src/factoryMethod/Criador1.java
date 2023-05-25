package factoryMethod;

public class Criador1 implements Criador{

	@Override
	public Produto factoryMethod() {
		return new Produto1();
	}

}
