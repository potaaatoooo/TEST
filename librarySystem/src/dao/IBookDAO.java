package dao;

import java.util.List;

import vo.Book;

public interface IBookDAO {
	//根据主键查找记录
		public Book get(String bookId);
		//根据条件查找,查询条件封装在user对象中，若user对象的某个成员变量值为null，则表示查询时忽略该字段查询条件
		public List<Book> query(Book book);
		//增加一种图书信息
		public boolean insert(Book book);
		//修改一种图书信息
		public boolean update(Book book);
		//删除制定图书号的图书
		public boolean delete(String bookId);
		//根据条件删除记录
		//public int deleteBatch(Book book);

}
