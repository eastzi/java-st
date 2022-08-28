package ch02;

public class FunctionTest {

	//매개변수 int 2가지를 받아서 결과값을 반환한다.
	public static int addNum(int num1, int num2) {
		int result; 
		result = num1 + num2; 
		return result;
	}
	
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	public static int calcSum() {
		int sum = 0;
		int i = 0;
		
		for(i = 0; i <= 100; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20; 

		int total = addNum(n1, n2);
		System.out.println(total);
		
		sayHello("안녕하세요");
		int num = calcSum(); 
		
		System.out.println(total);
		System.out.println(num);
	}

}
