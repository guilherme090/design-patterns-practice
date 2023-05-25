package observer;

public class ExampleObserver {
	public static void main(String[] args) {
		NewsAgency newsAgency = new NewsAgency();
		
		Observer observer1 = new NewsChannel();
		Observer observer2 = new NewsChannel();
		
		newsAgency.registerObserver(observer1);
		newsAgency.registerObserver(observer2);
		
		newsAgency.setNews("Notícia importante!");
		
		newsAgency.removeObserver(observer2);
		
		newsAgency.setNews("Outra notícia interessante!");
	}
}
