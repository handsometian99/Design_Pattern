package ex5;

public class Main {
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		LogFactory factory;
		Log log;
		factory = ProductFactory.Product("Console");
		log = factory.productLog();
		log.createLog();
	}

}
