// FundTrade class Implementation
public class FundTrade extends Trade{
	private final double percentage;

	public FundTrade(String ID, String symbol, int quantity, double price, double percentage){
		super(ID, symbol, quantity, price);
		this.percentage = percentage;
	}

	public double calcDividend(){
		return percentage * getPrice();
	}
}
