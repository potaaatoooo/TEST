package vo;
import java.math.BigDecimal;


public class Book {
	private String bookId; // ͼ���
	private String bookName; // ����
	private String author; // ����
	private String publisher; // ������
	private BigDecimal price; // ͼ�鵥��
	private int bookNum; // ͼ������

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
