package com.ciit.Alupit;
public class Teacher extends User{
	private String TeacherID;
	private String Department;
	public Teacher() {
		this.TeacherID = (RandomNumber.nextInt(99)+1) + "-" + (RandomNumber.nextInt(9999)+1);
		this.Department = null;
	}
	public void ChangeDepartment(String Department) {
		this.Department = Department;
	}
	public void TeacherDisplayInfo() {
		System.out.println("Teacher ID: " + TeacherID);
		System.out.println("Department: " + Department);
	}
	public String DisplayTeacherID() {
		return TeacherID;
	}
	public String DisplayDepartment() {
		return Department;
	}
}
