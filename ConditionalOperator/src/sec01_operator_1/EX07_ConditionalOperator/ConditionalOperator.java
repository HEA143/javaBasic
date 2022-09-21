package sec01_operator_1.EX07_ConditionalOperator;

public class ConditionalOperator {
	public static void main(String[] args) {
		//
		int value1 = (3 > 5) ? 6 : 9;
		System.out.println(value1);
		
		int value2 = (5 > 3) ? 10 : 20;
		System.out.println(value2);
		
		int value3 = 3;
		System.out.println((value3 % 2 == 0) ? "Â¦¼ö" : "È¦¼ö");
		
		//
		if(value3 % 2 == 0) {
			System.out.println("Â¦¼ö");
		} else {
			System.out.println("È¦¼ö");
		}
	}
}
