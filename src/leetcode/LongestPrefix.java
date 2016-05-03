package leetcode;

public class LongestPrefix {

	public String longestCommonPrefix(String[] strs) {
		StringBuffer sb = new StringBuffer();
		if (strs.length > 0) {
			for (int i = 0; i < strs[0].length(); i++) {
				for (String string : strs) {
					if (i >= string.length() || string.charAt(i) != strs[0].charAt(i)) {
						return sb.toString();
					}
				}
				sb.append(strs[0].charAt(i));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String[] s = { "ab" };
		System.out.println(new LongestPrefix().longestCommonPrefix(s));
	}
}
