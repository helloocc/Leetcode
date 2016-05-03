package leetcode;

import java.math.BigInteger;

public class MultiplyString {
	public String multiply(String num1, String num2) {
		BigInteger a = BigInteger.valueOf(Long.valueOf(num1));
		BigInteger b = BigInteger.valueOf(Long.valueOf(num2));

		return String.valueOf(a.multiply(b));

	}
}
