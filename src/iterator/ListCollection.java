package iterator;

import java.util.List;
import java.util.ArrayList;

public class ListCollection<T> implements IterableCollection<T> {
	private List<T> collection;
	
	public ListCollection() {
		this.collection = new ArrayList<>();
	}
	
	public void addItem(T item) {
		collection.add(item);
	}
	
	@Override
	public Iterator<T> createIterator() {
		return new ListIterator<>(collection);
	}

}
