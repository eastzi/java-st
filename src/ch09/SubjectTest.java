package ch09;

public class SubjectTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "lee");
		studentLee.setKoreaSubject("korea", 100);
		studentLee.setMathSubject("math", 60);
		
		Student studentKim = new Student(100, "kim");
		studentKim.setKoreaSubject("korea", 50);
		studentKim.setMathSubject("math", 30);
		
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();

	}

}
