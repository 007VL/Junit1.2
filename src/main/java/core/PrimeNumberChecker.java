package core;

public class PrimeNumberChecker {
	public Boolean validate(final int primeNumber) {
		for (int i = 2; i < primeNumber ; i++) {
			if (primeNumber % i == 0){
				return false;
				
			}
		}
		return true;
	}
}