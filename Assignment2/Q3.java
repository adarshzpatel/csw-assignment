package Assignment2;

import java.util.Stack;

public class Q3 {
	
	public static void decimalToBinary(int n) {
		Stack<Integer> result = new Stack();
		while(n>0) {
			result.push(n%2);
			n = n / 2;
		}
		while(!result.isEmpty()) {
			System.out.print(result.pop());
		}
	}
	
	public static void main(String[] args) {
		decimalToBinary(369);

	}

}
