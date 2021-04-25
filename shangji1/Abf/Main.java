package Abf;

public class Main {
	
	public static void main(String[] args) {
		BFruitAndVegetables foctory = new BConV();
		BFruitAndVegetables foctory2 = new BConF();
		
		
		Vegetables vegetables = foctory.CreateV();
		Fruit fruit = foctory2.CreatF();
		
		vegetables.eat();
		fruit.eat();
	}

}
