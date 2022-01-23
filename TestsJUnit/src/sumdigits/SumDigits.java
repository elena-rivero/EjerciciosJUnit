package sumdigits;

public class SumDigits {
	public int sum(int num) {
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		return sum;
	}
	
}
