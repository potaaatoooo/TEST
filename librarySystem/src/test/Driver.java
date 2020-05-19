package test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Driver {
	public static void main(String[] args) throws Exception {
		System.out.println("hi");
		
		// ָ��ȫ�������ļ�
		String resource = "mybatis-config.xml";
		// ��ȡ�����ļ�
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// ����sqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		// ��ȡsqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
	}

}
