package dao;

import java.util.List;
import java.util.Date;
import vo.Details;

public interface IDetailsDAO {
	//根据事件号查找记录
		public Details get(String eventCode);
		//根据图书号查找
		public List<Details> query(Details details);
		//增加一条记录
		public boolean insert(Details details);
		//修改
		public boolean update(Details details);
		//删除指定事件号的记录
		public boolean delete(String eventCode);
		

}
