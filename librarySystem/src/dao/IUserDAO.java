package dao;
import java.util.Date;
import java.util.List;
import vo.User;

public interface IUserDAO{
	//�����û��Ų��Ҽ�¼
	public User get(String userId) throws Exception;
	//������������,��ѯ������װ��user�����У���user�����ĳ����Ա����ֵΪnull�����ʾ��ѯʱ���Ը��ֶβ�ѯ����
	public List<User> query(User user) throws Exception;
	//����һ���û���Ϣ
	public boolean insert(User user) throws Exception;
	//�޸�һ���û���Ϣ
	public boolean update(User user) throws Exception;
	//ɾ��ָ���û��ŵļ�¼
	public boolean delete(String userId) throws Exception;
	//��������ɾ����¼
	//public int deleteBatch(User user) throws Exception;
}
