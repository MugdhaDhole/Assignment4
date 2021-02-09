package encapsulationAndInheritance;

public class Book {
	private int bookno;
	private String title;
	private String author;
	private float price;

	public void setBookno(int bookno) {
		this.bookno = bookno;
	}
	
	public int getBookno() {
		return bookno;
	}	
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}

	public float getPrice() {
		return price;
	}	

}
