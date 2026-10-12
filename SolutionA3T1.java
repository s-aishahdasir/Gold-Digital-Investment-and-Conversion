import java.util.Scanner;
import java.text.DecimalFormat;

public class SolutionA3T1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("#,##0.00");
		
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter amount of gold purchased (in grams): ");
		double GoldPurchased = sc.nextDouble();
		
		System.out.println("Enter holding period (in months): ");
		int HoldingPeriod = sc.nextInt();
		
		int durationYear = HoldingPeriod / 12;
		int durationMonths = HoldingPeriod % 12;
		
		int Bars = (int) (GoldPurchased / 10);
		double LooseGrams = (GoldPurchased % 10);
		
		double GOLD_PRICE_PER_GRAM = 385.50;
		double BAR_WEIGHT = 10; //grams per bar
		double MINTING_FEE_PER_BAR = 45.00;
		double YEARLY_VAULT_FEE = 15.00;
		
		double GoldValue = GOLD_PRICE_PER_GRAM * GoldPurchased;
		double MintingFee = MINTING_FEE_PER_BAR * Bars;
		double VaultFee = YEARLY_VAULT_FEE * durationYear;
		
		double TotalCost = GoldValue + MintingFee + VaultFee;
		
		System.out.println("--- YOUR SUMMARY ---");
		System.out.println("Name: "+ name);
		System.out.println("Duration: " + durationYear + " Years, " + durationMonths + " Months");
		System.out.println("Gold: "+ df.format(GoldPurchased) + " grams");
		System.out.println();
		System.out.println("10g Bars: " + Bars);
		System.out.println("Loose Grams: " + df.format(LooseGrams));
		System.out.println();
		
		System.out.println("Gold Value: RM "+ df.format(GoldValue));
		System.out.println("Minting fee: RM " + df.format(MintingFee));
		System.out.println("Vault Fee: RM " + df.format(VaultFee));
		System.out.println("------------------------");
		System.out.println("Total Cost: RM " + df.format(TotalCost));
		System.out.println("------------------------");
		
		
	

	}

}
