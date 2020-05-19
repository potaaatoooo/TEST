package dao;

import java.util.List;
import java.util.Date;
import vo.Details;

public interface IDetailsDAO {
	//�����¼��Ų��Ҽ�¼
		public Details get(String eventCode);
		//����ͼ��Ų���
		public List<Details> query(Details details);
		//����һ����¼
		public boolean insert(Details details);
		//�޸�
		public boolean update(Details details);
		//ɾ��ָ���¼��ŵļ�¼
		public boolean delete(String eventCode);
		

}
