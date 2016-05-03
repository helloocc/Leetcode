package leetcode;

import java.util.ArrayList;
import java.util.List;

public class compareVersionNumbers {
	public int compareVersion(String version1, String version2) {

		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		if (version1.contains(".")) {
			String[] v1 = version1.split("\\.");
			for (String string : v1) {
				list1.add(Integer.valueOf(string));
			}
		} else {
			list1.add(Integer.valueOf(version1));
		}

		if (version2.contains(".")) {
			String[] v2 = version2.split("\\.");
			for (String string : v2) {
				list2.add(Integer.valueOf(string));
			}
		} else {
			list2.add(Integer.valueOf(version2));
		}

		for (int i = 0; i < Math.min(list1.size(), list2.size()); i++) {
			if (list1.get(i) > list2.get(i)) {
				return 1;
			} else if (list1.get(i) < list2.get(i)) {
				return -1;
			}
		}
		if (list1.size() > list2.size() && list1.get(list1.size() - 1) != 0) {
			return 1;
		} else if (list1.size() < list2.size() && list2.get(list2.size() - 1) != 0) {
			return -1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println(new compareVersionNumbers().compareVersion("1.2.4.7", "1.2.4"));
	}
}