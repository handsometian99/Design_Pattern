package Proxy;

// 实体类
public class RealImage implements Image {

	private String fileName;
	
	
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Displaying  "+fileName);
		
	}
	
	private void loadFromDisk(String filename) {
		System.out.println("Loading  "+filename);
		
	}
	

}
