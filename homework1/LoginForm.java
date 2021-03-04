package ex1;

// Service层
public class LoginForm {
	UserDAO usedao = new UserDAO();
	public void init() {
		System.out.println("init方法");
	}
	public void display() {
		System.out.println("display方法");
	}

	public void validate() {
		usedao.findUser("username", "password");
		System.out.println("validate方法");
	}
}
