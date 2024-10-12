package quiz_1;

public class Q13ComputerAccount {
	private String realName;
	private String userName;
	private String password;
	
	//Constructor to create a computer account
	public Q13ComputerAccount(String realName, String userName,String password) {
		this.realName = realName;
		this.userName = userName;
		this.password = password;
		
	}
	
	//Methods to print the real name
	public void printRealName() {
		System.out.println("Real name :" + realName);
	}
	
	//Methods to print the user name
	public void printUserName() {
		System.out.println("User name:" + userName);
		
	}
	
	//Methods to print the password
	public void printPassword() {
		System.out.println("Password:" + password);
	}
	
	//To changed the password
	public void changePassword(String newPassword) {
		this.password = newPassword;
	}
}
