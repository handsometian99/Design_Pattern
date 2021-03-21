package ex4;

public abstract class Image {
	protected ImageImp img;
	
	public void setImageImp(ImageImp imp) {
		imp.doPaint(new Matrix());
	}
	public void parseFile(String fileName) {
		
	}

}
