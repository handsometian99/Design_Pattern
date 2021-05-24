package Decorator;

//实现了 Shape 接口的抽象装饰类
public abstract class ShapeDecorator {
	protected Shape decoratedShape;
	 
	public ShapeDecorator(Shape decoratedShape){
	    this.decoratedShape = decoratedShape;
	 }
	 
	public void draw(){
	    decoratedShape.draw();
	 }  

}
