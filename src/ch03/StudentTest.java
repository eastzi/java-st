package ch03;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();

		studentLee.studentId = 1234;
		studentLee.setStudentName("lee");
		studentLee.address = "서울 강남";

		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		
		studentKim.studentId = 123213;
		studentKim.studentName = "kim";
		studentKim.address = "busan";
		
		studentKim.showStudentInfo();
	
		System.out.println(studentKim);
		System.out.println(studentLee);
		
	}

}
