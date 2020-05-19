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
					System.out.println("学生信息增加成功！");
				}else {
					System.out.println("学生信息增加失败！");
				}
				break;//增
				 */
				stuList = stuDAO.query(stu);
				break;//查
			case 2:
				boolean delete =stuDAO.delete(stu);
				if(delete) {
					System.out.println("学生信息删除成功！");
				}else {
					System.out.println("学生信息删除失败！");
				}
				break;//删
			case 3:
				boolean update =stuDAO.update(stu);;
				if(update) {
					System.out.println("学生信息修改成功！");
				}else {
					System.out.println("学生信息修改失败！");
				}
				break;//改
			case 4:
				stuList = stuDAO.query(stu);
				break;//查
			case 5:
				break;//退出
			default:
				System.out.println("输入无效，只能输入1-7，请重新输入！");
				break;
			}
			choice=menu();
			
		}
		
		
		
	}
	
	public static int menu() {
		System.out.println();
		System.out.println("---------图书馆系统-----------");
        System.out.println("1.查询图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("4.查询借阅记录");
        System.out.println("5.馆内管理");
        System.out.println("6.修改密码");
        System.out.println("7.退出");
        System.out.println("----------------------------------");
        System.out.print("请选择（1-7）：");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
		return choice;
		
	}

}

