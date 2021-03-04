package ex1;

//Dao层
public class UserDAO {
	
	DBUtil dbUtil = new DBUtil();
	public boolean findUser(String username,String userPassword) {
		dbUtil.getConnection();
		System.out.println("用户验证成功");
		return true;
		
	}

}
