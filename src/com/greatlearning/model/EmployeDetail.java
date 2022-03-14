package com.greatlearning.model;
import java.util.Scanner;

public class EmployeDetail {
	
	String firstName,lastName;
	EmployeDetail()
	{}
	
	public EmployeDetail(String fname , String lname) {
		this.firstName = fname;
		this.lastName = lname;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname,lname,email="";
		int choice;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your First Name :- ");
		fname = sc.next();
		System.out.println("Enter Your Last Name :- ");
		lname = sc.next();
		
		System.out.println("--------------------------------------------------");
		System.out.println("Pleae Enter the Department from the Following :-");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("3. Legal");
		System.out.println("--------------------------------------------------");
		
		choice = sc.nextInt();
		
		EmployeDetail emp = new EmployeDetail(fname,lname);
		CredentialService cs = new CredentialService();
		String password =  new String(cs.generatePassword());
		
		switch(choice) {
		
		case 1:
			email = cs.generateEmail("tech",fname,lname);
			break;
			
		case 2:
			email = cs.generateEmail("admin",fname,lname);
			break;
			
		case 3:
			email = cs.generateEmail("hr",fname,lname);
			break;
			
		case 4:
			email = cs.generateEmail("legal",fname,lname);
			break;
			
		default:
			System.out.println("Please Provide a valid choice number");
			break;
		}
		
		System.out.println("Dear " + fname + " your your generated credentials are as follows \n");
		System.out.println("Email -->"+ email +" \n");
		System.out.println("Password -->" + password+"  \n");
		
		
		
	}

}
