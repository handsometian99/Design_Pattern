package ex4;

public class Main {
	
	public static void main(String[] args) {
		ImageImp imp = new WindowsImp();
		Image image = new PNGImage();
		image.parseFile("PNG");
		image.setImageImp(imp);
		
	}

}
