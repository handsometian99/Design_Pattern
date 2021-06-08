package Proxy;

public class ProxyImage implements Image{
	private RealImage realImage;
	private String fileName;
	
	public ProxyImage(String fileName) {
		// TODO Auto-generated constructor stub
		this.fileName = fileName;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		if(realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
		
	}
	

}
