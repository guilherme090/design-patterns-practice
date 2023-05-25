package strategy;

public class ExampleStrategy {
	public static void main(String[] args) {
		int[] array = {5, 2, 8, 1, 9};
		
		Sorter sorter = new Sorter();
		
		sorter.setSortingStrategy(new BubbleSortStrategy());
		sorter.sortArray(array);
		
		System.out.println("-----------------------------");
		
		sorter.setSortingStrategy(new QuickSortStrategy());
		sorter.sortArray(array);
	}
}
