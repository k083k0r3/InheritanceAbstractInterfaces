// Bond Trade class implementation

public class BondTrade extends Trade{

	private final double dividend;


	public BondTrade(String ID, String symbol, int quantity, double price, double dividend){
		super(ID, symbol,quantity,price);
		this.dividend = dividend;
	}

	@Override
	public double calcDividend(){
		return dividend;
	}

}


