package driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.IUserDAO;
import dao.IBookDAO;
import dao.IDetailsDAO;
import vo.User;
import vo.Book;
import vo.Details;

import java.util.Date;
import java.math.BigDecimal;

public class Driver {

	public static void main(String[] args) throws Exception {
	
		User user = new User();
		Book book = new Book();
		
		int choice = menu();
		while(choice!=5)
		{
			switch(choice) {
			case 1:
				/*
				 * boolean insert = IUserDAO.insert(user);
				if(insert) {
					System.out.println("ѧ����Ϣ���ӳɹ���");
				}else {
					System.out.println("ѧ����Ϣ����ʧ�ܣ�");
				}
				break;//��
				 */
				stuList = stuDAO.query(stu);
				break;//��
			case 2:
				boolean delete =stuDAO.delete(stu);
				if(delete) {
					System.out.println("ѧ����Ϣɾ���ɹ���");
				}else {
					System.out.println("ѧ����Ϣɾ��ʧ�ܣ�");
				}
				break;//ɾ
			case 3:
				boolean update =stuDAO.update(stu);;
				if(update) {
					System.out.println("ѧ����Ϣ�޸ĳɹ���");
				}else {
					System.out.println("ѧ����Ϣ�޸�ʧ�ܣ�");
				}
				break;//��
			case 4:
				stuList = stuDAO.query(stu);
				break;//��
			case 5:
				break;//�˳�
			default:
				System.out.println("������Ч��ֻ������1-7�����������룡");
				break;
			}
			choice=menu();
			
		}
		
		
		
	}
	
	public static int menu() {
		System.out.println();
		System.out.println("---------ͼ���ϵͳ-----------");
        System.out.println("1.��ѯͼ��");
        System.out.println("2.����ͼ��");
        System.out.println("3.�黹ͼ��");
        System.out.println("4.��ѯ���ļ�¼");
        System.out.println("5.���ڹ���");
        System.out.println("6.�޸�����");
        System.out.println("7.�˳�");
        System.out.println("----------------------------------");
        System.out.print("��ѡ��1-7����");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
		return choice;
		
	}

}

