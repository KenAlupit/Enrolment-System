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
	protected void ChangeName(String Name){
		this.Name = Name;
	}
	protected void ChangeBirthDate(String BirthDate) {
		this.BirthDate = BirthDate;
	}
	protected String DisplayName() {
		return this.Name;
	}
	protected String DisplayBirthDate() {
		return this.BirthDate;
	}
	protected String DisplayUserCreationDate() {
		return this.UserCreationDate;
	}
	protected void DisplayUserInfo() {
		System.out.println("Name: " + this.DisplayName());
		System.out.println("BirthDate: " + this.DisplayBirthDate());
		System.out.println("Account Created: " + this.DisplayUserCreationDate());
	}
	}

