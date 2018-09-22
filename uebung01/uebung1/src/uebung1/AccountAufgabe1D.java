package uebung1;

import java.util.ArrayList;

public class AccountAufgabe1D {
	private ArrayList<Double> payins;
	
	public AccountAufgabe1D() {
		this.payins = new ArrayList<Double>();
	}
	
	public void payin(double amount) {
		System.out.println("I am paying in the amount: " + amount);
		this.payins.add(amount);
	}

	public double getAveragePayin() {
		double sum = 0;

		for (int index = 0; index < this.payins.size(); index++) {
			sum += this.payins.get(index);
		}

		return sum / this.payins.size();
	}
}
