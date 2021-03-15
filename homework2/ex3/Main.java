package ex3;

public class Main {
	public static void main(String args[]) {
		
	AbstractSource source = new TextSource();  //这里用new模拟 XML解析以及反射生成具体类
    AbstractTransforme XMLt = new XMLTransforme(); //这里用new模拟 XML解析以及反射生成具体类
    
	source.change();
	XMLt.change();
	
	}
}
