package leetcode;

public class JumpGame {
	public boolean canJump(int[] nums) {
		int position = 0;

		for (int i = 0; i < nums.length; i++) {
			if (position < i) {
				return false;
			}
			position = Math.max(position, i + nums[i]);

		}
		return true;

	}

	public static void main(String[] args) {
		int[] a = { 3, 2, 1, 0, 4 };
		System.out.println(new JumpGame().canJump(a));

	}

	public int compareVersion(String version1, String version2) {
		String[] v1 = version1.split(".");
		String[] v2 = version2.split(".");
		if (Integer.valueOf(v1[0]) > Integer.valueOf(v2[0])) {
			return 1;
		} else if (Integer.valueOf(v1[0]) < Integer.valueOf(v2[0])) {
			return -1;
		} else {
			if (Integer.valueOf(v1[1]) > Integer.valueOf(v2[1])) {
				return 1;
			} else if (Integer.valueOf(v1[1]) < Integer.valueOf(v2[1])) {
				return -1;
			} else {
				return 0;
			}
		}
	}
}