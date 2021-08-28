package com.ciit.Alupit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader (input);
		
		LinkedList<String> Name= new LinkedList<String>();
		LinkedList<String> BirthDate= new LinkedList<String>();
		LinkedList<String> UserCreationDate= new LinkedList<String>();
		LinkedList<String> StudentID= new LinkedList<String>();
		LinkedList<String> Course= new LinkedList<String>();
		LinkedList<String> YearLevel= new LinkedList<String>();
		LinkedList<String> TeacherID= new LinkedList<String>();
		LinkedList<String> Department= new LinkedList<String>();
		LinkedList<String> RegistrarID= new LinkedList<String>();
		LinkedList<String> Role= new LinkedList<String>();
		User User = new User();
		Student Student = new Student();
		Teacher Teacher = new Teacher();
		Registrar Registrar = new Registrar();
		char Selection;
		
do {
		System.out.println("CIIT Senior High School Enrolment System");
		System.out.println("[E] - Enroll/Register");
		System.out.println("[S] - Show Info");
		System.out.println("[Q] - Quit Program");
		Selection = reader.readLine().charAt(0);
		switch(Selection) {
		case 'E':
		case 'e':
			System.out.println("Please select an option below:");
			System.out.println("[S] - Student");
			System.out.println("[T] - Teacher");
			System.out.println("[R] - Registrar");
			Selection = reader.readLine().charAt(0);
			switch (Selection ) {
			case 'S':
			case 's':
				System.out.println("Name:");
				User.ChangeName(reader.readLine());
				System.out.println("Birthdate:");
				User.ChangeBirthDate(reader.readLine());
				System.out.println("Fill out the information below");
				System.out.println("Course:");
				System.out.println("[A] - Animation[Tech-voc]");
				System.out.println("[M] - Multimedia arts[Arts and Design]");
				System.out.println("[P] - programming [Tech-voc]");
				Selection = reader.readLine().charAt(0);
				switch (Selection) {
				case 'A':
				case 'a':
					Student.ChangeCourse("Animation[Tech-voc]");
					break;
				case 'M':
				case 'm':
					Student.ChangeCourse("Multimedia arts[Arts and Design]");
					break;
				case 'P':
				case 'p':
					Student.ChangeCourse("programming [Tech-voc]");
					break;
				}
				System.out.println("Year level:");
				System.out.println("[A] - Grade 11");
				System.out.println("[B] - Grade 12");
				Selection = reader.readLine().charAt(0);
				switch (Selection) {
				case 'a':
				case 'A':
					Student.ChangeYearLevel("Grade 11");
					break;
				case 'b':
				case 'B':
					Student.ChangeYearLevel("Grade 12");
					break;
				}
				Name.add(User.DisplayName());
				BirthDate.add(User.DisplayBirthDate());
				UserCreationDate.add(User.DisplayUserCreationDate());
				StudentID.add(Student.DisplayStudentID());
				Course.add(Student.DisplayCourse());
				YearLevel.add(Student.DisplayYearLevel());
				User.DisplayUserInfo();
				Student.studentdisplayinfo();
				break;
			case 'T':
			case 't':
				System.out.println("Name:");
				User.ChangeName(reader.readLine());
				System.out.println("Birthdate:");
				User.ChangeBirthDate(reader.readLine());
				System.out.println("Department");
				System.out.println("[A] - Core Program");
				System.out.println("[S] - Specialization Program");
				System.out.println("[G] - General Education Program");
				Selection = reader.readLine().charAt(0);
				switch (Selection) {
				case 'a':
				case 'A':
					Teacher.ChangeDepartment("Core Program");
					break;
				case 's':
				case 'S':
					Teacher.ChangeDepartment("Specialization Program");
					break;
				case 'g':
				case 'G':
					Teacher.ChangeDepartment("General Education Program");
					break;
				}
				Name.add(User.DisplayName());
				BirthDate.add(User.DisplayBirthDate());
				UserCreationDate.add(User.DisplayUserCreationDate());
				TeacherID.add(Teacher.DisplayTeacherID());
				Department.add(Teacher.DisplayDepartment());
				User.DisplayUserInfo();
				Teacher.TeacherDisplayInfo();
				break;
				
			case 'R':
			case 'r':
				System.out.println("Name:");
				User.ChangeName(reader.readLine());
				System.out.println("Birthdate:");
				User.ChangeBirthDate(reader.readLine());
				System.out.println("Role:");
				System.out.println("[C] - Cashier");
				System.out.println("[R] - Records");
				System.out.println("[M] - Manager");
				Selection = reader.readLine().charAt(0);
				switch (Selection) {
				case 'C':
				case 'c':
					Registrar.ChangeRole("Cashier");
					break;
				case 'R':
				case 'r':
					Registrar.ChangeRole("Records");
					break;
				case 'M':
				case 'm':
					Registrar.ChangeRole("Manager");
					break;
				}
				RegistrarID.add(Registrar.DisplayRegistrarID());
				Role.add(Registrar.DisplayRole());
				User.DisplayUserInfo();
				Registrar.RegistrarDisplayInfo();
				break;
			}
			break;
		case 'S':
		case 's':
			System.out.println("Please select an option below:");
			System.out.println("[S] - Student");
			System.out.println("[T] - Teacher");
			System.out.println("[R] - Registrar");
			Selection = reader.readLine().charAt(0);
			switch (Selection ) {
			case 'S':
			case 's':
				System.out.println("What is your Student ID?");
				String InputID = reader.readLine();
				if(StudentID.contains(InputID)) {
					int Index = StudentID.indexOf(InputID);
					System.out.println("Name: " + Name.get(Index));
					System.out.println("Student ID: " + InputID);
					System.out.println("Birthdate: " + BirthDate.get(Index));
					System.out.println("Account Created: " + UserCreationDate.get(Index));
					System.out.println("Course: " + Course.get(Index));
					System.out.println("Year Level: " + YearLevel.get(Index));
					}
				else {
					System.out.println("Invalid Input/User does not exist");
				}
				break;
			case 'T':
			case 't':
				System.out.println("What is your Teacher ID?");
				InputID = reader.readLine();
				if(TeacherID.contains(InputID)) {
					int Index = TeacherID.indexOf(InputID);
					System.out.println("Name: " + Name.get(Index));
					System.out.println("Teacher ID: " + InputID);
					System.out.println("Birthdate: " + BirthDate.get(Index));
					System.out.println("Account Created: " + UserCreationDate.get(Index));
					System.out.println("Department: " + Department.get(Index));
					}
				else {
					System.out.println("Invalid Input/User does not exist");
				}
				break;
			case 'R':
			case 'r':
				System.out.println("What is your Registrar ID?");
				InputID = reader.readLine();
				if(RegistrarID.contains(InputID)) {
					int Index = RegistrarID.indexOf(InputID);
					System.out.println("Name: " + Name.get(Index));
					System.out.println("Registrar ID: " + InputID);
					System.out.println("Birthdate: " + BirthDate.get(Index));
					System.out.println("Account Created: " + UserCreationDate.get(Index));
					System.out.println("Role: " + Role.get(Index));
					}
				else {
					System.out.println("Invalid Input/User does not exist");
				}
				break;
				}
			break;
		}
	}while(Selection != 'q');
				System.out.println("Thank you for using my program!");	
			}
}
