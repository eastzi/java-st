package ch09;

public class Student {
	int studentId;
	String studentName;
	
	//참조자료형을 멤버변수로 사용 
	Subject korea;
	Subject math;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName; 
		
		//객체 생성 
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaSubject (String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject (String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showStudentScore()	{
		int total = korea.score + math.score;
		System.out.println(studentName + "학생의 총점은" + total + "점 입니다.");
	}
}
