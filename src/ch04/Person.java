package ch04;

public class Person {
	public int height;
	public int weight;
	public String name;
	public int age;
	
	public void showPersonInfo(){
		System.out.println("키가" + height + "이고, 몸무게가" + weight + "kg인 남성이 있습니다." + "이름은" + name + "이고, 나이는" + age + "세 입니다.");
	}
}
