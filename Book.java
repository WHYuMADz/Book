
public class Book {

	private String title;
	private String author;
	private String publisher;
	private int copiesSold;
	
	public Book() {
		this.title = null;
		this.author = null;
		this.publisher = null;
		this.copiesSold = 0;
	}
	
	public void setTitle(String newTitle) {
		this.title = newTitle;
	}
	public String getTitle() {
		return this.title;
	}
	
	public void setAuthor(String newAuthor) {
		this.author = newAuthor;
	}
	public String getAuthor() {
		return this.author;
	}
	public void setPublisher(String newPublisher) {
		this.publisher = newPublisher;
	}
	public String getPublisher() {
		return this.publisher;
	}
	public void setCopies(int newCopies) {
		this.copiesSold = newCopies;
	}
	public int getCopies() {
		return this.copiesSold;
	}
	
	
	}
