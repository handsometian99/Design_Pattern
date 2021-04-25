package Abf;

public class AConF implements AFruitAndVegetables{

	@Override
	public Fruit CreatF() {
		// TODO Auto-generated method stub
		Fruit banana = new Banana();
		return banana;
	}

	@Override
	public Vegetables CreateV() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
