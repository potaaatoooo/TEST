package vo;
import java.math.BigDecimal;


public class Book {
	private String bookId; // 图书号
	private String bookName; // 书名
	private String author; // 作者
	private String publisher; // 出版社
	private BigDecimal price; // 图书单价
	private int bookNum; // 图书数量

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	
	

	

	

}
