package vo;

import java.util.Date;

public class User {

	private String userId; // �û���
	private String chrName; // ������
	private String password; // ����
	private String role; // ��ɫ

	public User() {
		super();
	}

	public User(String userId, String chrName, String password, String role) {
		this.userId = userId;
		this.chrName = chrName;
		this.password = password;
		this.role = role;
	}

	public void setuserId(String userId) {
		this.userId = userId;
	}

	public String getuserId() {
		return userId;
	}

	public void setchrName(String chrName) {
		this.chrName = chrName;
	}

	public String getchrName() {
		return chrName;
	}

	public void setpassword(String password) {
		this.password = password;
	}

	public String getpassword() {
		return password;
	}

	public void setrole(String role) {
		this.role = role;
	}

	public String getrole() {
		return role;
	}

	public String toString() {
		return "User[userId=" + userId + ",chrName=" + chrName + ",password=" + password + ",role=" + role + "]";
	}
}
