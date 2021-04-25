package Abf;

public class BConF implements BFruitAndVegetables{

	@Override
	public Fruit CreatF() {
		// TODO Auto-generated method stub
		Fruit apple = new Apple();
		return apple;
	}

	@Override
	public Vegetables CreateV() {
		// TODO Auto-generated method stub
		return null;
	}
	


}
