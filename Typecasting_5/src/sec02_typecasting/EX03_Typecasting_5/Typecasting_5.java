package sec02_typecasting.EX03_Typecasting_5;



class A {}
class B extends A {}

public class Typecasting_5 {
	public static void main(String[] args) {
		
		A aa = new A();
		B ab = new B();
		
		System.out.println(aa instanceof A);
		System.out.println(ab instanceof A);
		
		System.out.println(aa instanceof B);
		System.out.println(ab instanceof B);
		
		if(aa instanceof B) {
			B b = (B) aa;
			System.out.println("aa�� B�� ĳ�����߽��ϴ�.");
		} else {
			System.out.println("aa�� B Ÿ������ ĳ������ �Ұ���!!!");
		}
		if(ab instanceof B) {
			B b = (B) ab;
			System.out.println("aa�� B�� ĳ�����߽��ϴ�.");
		} else {
			System.out.println("ab�� B Ÿ������ ĳ������ ����!!!");
		}
		if("�ȳ�" instanceof String) {
			System.out.println("\"�ȳ�\"�� String Ŭ�����Դϴ�.");
		}		
	}
}