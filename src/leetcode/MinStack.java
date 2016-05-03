package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MinStack {
	List<Integer> statck = new ArrayList<Integer>();
	int min;

	public void push(int x) {
		statck.add(x);
	}

	public void pop() {
		statck.remove(statck.size() - 1);
	}

	public int top() {
		return statck.get(statck.size() - 1);

	}

	public int getMin() {
		int min = 0;
		if (statck.isEmpty() == false) {
			min = statck.get(0);
			for (Integer integer : statck) {
				if (integer < min) {
					min = integer;
				}
			}
		}
		return min;

	}
}
