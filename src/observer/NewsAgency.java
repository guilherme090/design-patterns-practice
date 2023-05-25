package observer;

import java.util.List;
import java.util.ArrayList;

// Subject concreto 

public class NewsAgency implements Subject{
	private List<Observer> observers = new ArrayList<>();
	private String news;
	
	public void setNews(String news) {
		this.news = news;
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(news);
		}
	}
	
}
