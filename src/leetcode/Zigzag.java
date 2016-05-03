package leetcode;

public class Zigzag {

	public String convert(String s, int numRows) {
		char[] c = s.toCharArray();
		StringBuffer[] sb = new StringBuffer[numRows];

		for (int i = 0; i < numRows; i++) {
			sb[i] = new StringBuffer();
		}
		int n = 0;
		while (n < c.length) {
			for (int i = 0; i < numRows && n < c.length; i++) {
				sb[i].append(c[n]);
				n++;
			}
			for (int i = numRows - 2; (i > 0) && (n < c.length); i--) {
				sb[i].append(c[n]);
				n++;
			}
		}
		StringBuffer ss = new StringBuffer();
		for (int i = 0; i < numRows; i++) {

			ss.append(sb[i]);
		}
		return ss.toString();
	}

	public static void main(String[] args) {
		String a = "PAYPALISHIRING";

		System.out.println(new Zigzag().convert(a, 3));
	}

}
