package vo;

import java.util.Date;

public class Details {

	private String eventCode; // �¼���
	private String userId; // �û���
	private String bookId; // ͼ���
	private int bookNum; // ͼ������
	private Date eventTime; // �¼�ʱ��

	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Details(String eventCode, String userId, String bookId, int bookNum, Date eventTime) {
		super();
		this.eventCode = eventCode;
		this.userId = userId;
		this.bookId = bookId;
		this.bookNum = bookNum;
		this.eventTime = eventTime;
	}

	public String getEventCode() {
		return eventCode;
	}

	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public Date getEventTime() {
		return eventTime;
	}

	public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
	}

}
