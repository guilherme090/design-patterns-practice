package abstractFactoryMethod;

public class TestAbstractFactory {
	public static void main(String[] args) {
		AbstractFactory factory = new ConcreteFactory();
		Client client = new Client(factory);
		client.doSomethingWithProducts();
	}
}
