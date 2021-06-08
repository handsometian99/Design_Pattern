package Proxy;

public class ProxyPatternDemo {
	
	public static void main(String[] args) {
		// 从磁盘中加载
		Image image = new ProxyImage("logo.jpg");
		image.display();
		System.out.println("------------------------");
		// 不从磁盘中加载
		image.display();
	}

}
