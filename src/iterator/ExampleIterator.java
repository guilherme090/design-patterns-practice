package iterator;

public class ExampleIterator {
	public static void main(String[] args) {
		ListCollection<String> collection = new ListCollection<>();
		collection.addItem("Item 1");
		collection.addItem("Item 2");
		collection.addItem("Item 3");
		
		Iterator<String> iterator = collection.createIterator();
		
		while (iterator.hasNext()) {
			String item = iterator.next();
			System.out.println("Item: " + item);
		}
	}
}
