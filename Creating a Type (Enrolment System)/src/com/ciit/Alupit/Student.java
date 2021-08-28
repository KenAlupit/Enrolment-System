package com.ciit.Alupit;
public class Student extends User{
	private String StudentID;
	private String Course;
	private String YearLevel;
	public Student(){
		this.StudentID = (RandomNumber.nextInt(99)+1) + "-" + (RandomNumber.nextInt(9999)+1);
		this.Course = null;
		this.YearLevel= null;
	}
	public void ChangeCourse(String Course){
		this.Course = Course;
	}
	public void ChangeYearLevel(String YearLevel){
		this.YearLevel = YearLevel;
	}
	public void studentdisplayinfo() {
		System.out.println("Student ID: " + StudentID);
		System.out.println("Course: " + Course);
		System.out.println("Year Level: " + YearLevel);
	}
	public String DisplayStudentID() {
		return StudentID;
	}
	public String DisplayCourse() {
		return Course;
	}
	public String DisplayYearLevel() {
		return YearLevel;
	}
}
