package com.ciit.Alupit;
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class User {
	protected InputStreamReader input = new InputStreamReader(System.in);
	protected BufferedReader reader = new BufferedReader (input);
	protected String Name;
	protected String BirthDate;
	protected Random RandomNumber = new Random();
	protected LocalDate CurrentDate = LocalDate.now();
	protected DateTimeFormatter FormattedDate= DateTimeFormatter.ofPattern("dd-MM-yyyy");
	protected String UserCreationDate = CurrentDate.format(FormattedDate);
	protected void ChangeStudentName(String Name){
		this.Name = Name;
	}
	protected void ChangeStudentBirthDate(String BirthDate) {
		this.BirthDate = BirthDate;
	}
	
	protected void ChangeTeacherName(String Name){
		this.Name = Name;
	}
	protected void ChangeTeacherBirthDate(String BirthDate) {
		this.BirthDate = BirthDate;
	}
	
	protected void ChangeRegistrarName(String Name){
		this.Name = Name;
	}
	protected void ChangeRegistrarBirthDate(String BirthDate) {
		this.BirthDate = BirthDate;
	}
	protected String DisplayStudentName() {
		return this.Name;
	}
	protected String DisplayStudentBirthDate() {
		return this.BirthDate;
	}
	protected String DisplayTeacherName() {
		return this.Name;
	}
	protected String DisplayTeacherBirthDate() {
		return this.BirthDate;
	}
	protected String DisplayRegistrarName() {
		return this.Name;
	}
	protected String DisplayRegistrarBirthDate() {
		return this.BirthDate;
	}
	protected String DisplayUserCreationDate() {
		return this.UserCreationDate;
	}
	protected void DisplayStudentUserInfo() {
		System.out.println("Name: " + this.DisplayStudentName());
		System.out.println("BirthDate: " + this.DisplayStudentBirthDate());
		System.out.println("Account Created: " + this.DisplayUserCreationDate());
	}
	protected void DisplayTeacherUserInfo() {
		System.out.println("Name: " + this.DisplayTeacherName());
		System.out.println("BirthDate: " + this.DisplayTeacherBirthDate());
		System.out.println("Account Created: " + this.DisplayUserCreationDate());
	}
	protected void DisplayRegistrarUserInfo() {
		System.out.println("Name: " + this.DisplayRegistrarName());
		System.out.println("BirthDate: " + this.DisplayRegistrarBirthDate());
		System.out.println("Account Created: " + this.DisplayUserCreationDate());
	}
	}

