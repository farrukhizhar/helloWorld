package org.studyeasy;

public class StringDemo {

	public static void main(String[] args) {
	String x = "Study";
	String y = "easy";
	String z = x.concat(y);
	
	z=z.replace("easy","Hello");
	
	System.out.println(z);
	
	}

}
