package iterator;

import java.util.List;

public class ListIterator<T> implements Iterator<T> {
	private List<T> collection;
	private int position;
	
	public ListIterator(List<T> collection) {
		this.collection = collection;
		this.position = 0;
	}

	@Override
	public boolean hasNext() {
		return position < collection.size();
	}

	@Override
	public T next() {
		if (hasNext()) {
			T item = collection.get(position);
			position++;
			return item;
		}
		throw new IndexOutOfBoundsException("No elements to iterate");
	}
}
