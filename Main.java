// Main class for testing
public class Main{
	public static void main(String[] args){
		System.out.println("BondTrade Test: ");
		BondTrade newBondTrade = new BondTrade("trd1", "GOOGL", 12, 30.00, 55.5);
		System.out.println(newBondTrade.calcDividend());

		System.out.println("FundTrade Test: ");
		FundTrade newFundTrade = new FundTrade("trd2", "AAPL", 15, 70.00, 0.05);
		System.out.println(newFundTrade.calcDividend());
	}
}
