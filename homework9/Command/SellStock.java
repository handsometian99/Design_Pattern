package Command;

public class SellStock implements Order{
	private Stock abcStock;

	public SellStock(Stock abcStock) {
		// TODO Auto-generated constructor stub
		this.abcStock = abcStock;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		abcStock.sell();
	}
	

}
