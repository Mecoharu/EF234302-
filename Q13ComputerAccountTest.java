package quiz_1;


public class Q13ComputerAccountTest {

	public static void main(String[] args) {
	//Create the computer account using the class Q13ComputerAccount
	Q13ComputerAccount computerAccount = new Q13ComputerAccount("Kinar","kinros","its2023");
	
	//Print the real name,user name and password
	computerAccount.printRealName();
	computerAccount.printUserName();
	computerAccount.printPassword();
	
	//change the password
	computerAccount.changePassword("informatika");
	
	//print the updated password
	computerAccount.printPassword();
	
	}

}
