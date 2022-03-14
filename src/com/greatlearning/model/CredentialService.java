package com.greatlearning.model;

import java.util.Random;

public class CredentialService {
	 private String department,fname,lname;
	
	public char[] generatePassword() {
	      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[8];

	     
	      for(int i = 0; i< 8 ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	     
	      return password;
	   }
	
	public String generateEmail(String dept, String firstName, String lastName) {
		
		this.fname = firstName.toLowerCase();
		this.lname = lastName.toLowerCase();
		this.department = dept;
		
		String email = this.fname+this.lname+"@"+this.department+".abc.com";
		
		return email;
	}

}
