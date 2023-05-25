package factoryMethod;

public class TestFactoryMethod {
	public static void main (String[] args) {
		Criador criador1 = new Criador1();
		Produto produto1 = criador1.factoryMethod();
		produto1.operacao();
		
		Criador criador2 = new Criador2();
		Produto produto2 = criador2.factoryMethod();
		produto2.operacao();
	}
}
