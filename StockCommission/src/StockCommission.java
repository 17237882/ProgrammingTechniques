import java.util.Scanner;

public class StockCommission {

	public static void main(String[] args) {
		//Static Variables		
		Scanner kb = new Scanner(System.in);
		double commission = 0.02;
		
		//Input Variables
		int numStocksBought = 0;
		double stockUnitPrice = 0.0;
		
		//Calculated Variables
		double totalCost;
		double totalCommission;
		double totalCostAndCommission;
		
		System.out.print("How many stocks did you buy?: ");
		numStocksBought = kb.nextInt();
		
		System.out.print("How much did each stock cost (No $ sign)?: ");
		stockUnitPrice = kb.nextDouble();
		
		totalCost = (double)numStocksBought * stockUnitPrice;
		
		totalCommission = totalCost * commission;
		
		totalCostAndCommission = totalCommission + totalCost;
		
		System.out.println("As you have bought " + numStocksBought + " stocks at $" + stockUnitPrice + " each, you have paid:");
		System.out.println("\u2022 $" + totalCost + " for the stock in total.");
		System.out.println("\u2022 $" + totalCommission + " for the stock-broker commission.");
		System.out.println("\u2022 $" + totalCostAndCommission + " combined.");
		
		kb.close();
	}

}
