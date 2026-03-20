package ex02_variableExchange;

public class Ex02_variableExchange {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		int c = 0;
		
		c = x;
		x = y;
		y = c;
		
		System.out.println("x = " + x + "\ny = " + y);

	}

}
