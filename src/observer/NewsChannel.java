package observer;

public class NewsChannel implements Observer {
	private String news;
	
	@Override
	public void update(String news) {
		this.news = news;
		displayNews();
	}
	
	public void displayNews() {
		System.out.println("News Channel: " + news);
	}
}
