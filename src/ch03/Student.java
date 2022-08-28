package ch03;

public class Student {
	
	public int studentId;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println(studentId + "학번 학생의 이름은" + studentName + "이고, 주소는" + address + "입니다.");
	}
	
	//studentName 이름을 가져가는 함수
	public String getStudentName() {
		return studentName;
	}
	
	//studentName 이름을 지정하는 함수
	public void setStudentName(String name) {
		studentName = name;
	}
}
