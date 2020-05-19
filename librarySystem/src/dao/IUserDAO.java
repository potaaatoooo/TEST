package dao;
import java.util.Date;
import java.util.List;
import vo.User;

public interface IUserDAO{
	//根据用户号查找记录
	public User get(String userId) throws Exception;
	//根据条件查找,查询条件封装在user对象中，若user对象的某个成员变量值为null，则表示查询时忽略该字段查询条件
	public List<User> query(User user) throws Exception;
	//增加一条用户信息
	public boolean insert(User user) throws Exception;
	//修改一条用户信息
	public boolean update(User user) throws Exception;
	//删除指定用户号的记录
	public boolean delete(String userId) throws Exception;
	//根据条件删除记录
	//public int deleteBatch(User user) throws Exception;
}
