package uebung1;

public class InterestService {
	public static double calculateCapitalAfterInterest(double startCapital, double interestRate, int noOfPeriods) {
		double capitalAfterInterest = startCapital * Math.pow(1 + interestRate, noOfPeriods);
		
		return capitalAfterInterest;
	}

	public static void calculateAndDisplayCapitalAfterInterestYearByYear(double startCapital, double interestRateInPercent, int noOfPeriods) {
		double capitalAfterInterest = startCapital;
		
		for (int index = 0; index <= noOfPeriods; index++) {
			double interest = capitalAfterInterest * (interestRateInPercent / 100);
			double capitalAtTheEndOfYear = capitalAfterInterest + interest;
			
			System.out.println("Jahr:" + index + ", Anfangsbetrag: " + capitalAfterInterest + ", Zinsen: " + interest + ", Endbetrag: " + capitalAtTheEndOfYear);

			capitalAfterInterest = capitalAtTheEndOfYear;
		}
	}
}
