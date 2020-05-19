package dao;

import java.util.List;

import vo.Book;

public interface IBookDAO {
	//�����������Ҽ�¼
		public Book get(String bookId);
		//������������,��ѯ������װ��user�����У���user�����ĳ����Ա����ֵΪnull�����ʾ��ѯʱ���Ը��ֶβ�ѯ����
		public List<Book> query(Book book);
		//����һ��ͼ����Ϣ
		public boolean insert(Book book);
		//�޸�һ��ͼ����Ϣ
		public boolean update(Book book);
		//ɾ���ƶ�ͼ��ŵ�ͼ��
		public boolean delete(String bookId);
		//��������ɾ����¼
		//public int deleteBatch(Book book);

}
