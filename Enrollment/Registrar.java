package com.ciit.Alupit;
public class Registrar extends User{
	private String RegistrarID;
	private String Role;
	public Registrar() {
		this.RegistrarID = (RandomNumber.nextInt(99)+1) + "-" + (RandomNumber.nextInt(9999)+1);
		this.Role = null;
	}	
	public void ChangeRole(String Role) {
		this.Role = Role;
	}
	
	public void RegistrarDisplayInfo() {
		System.out.println("Registrar ID: " + RegistrarID);
		System.out.println("Role: " + Role);
	}
	public String DisplayRegistrarID() {
		return RegistrarID;
	}
	public String DisplayRole() {
		return Role;
	}
}
	

