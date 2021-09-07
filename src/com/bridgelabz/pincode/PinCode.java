package com.bridgelabz.pincode;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class PinCode
{
	public static boolean pinCodeChecker(String pincode) 
	{
		Pattern pattern = Pattern.compile("(^[0-9]{3})([\s]?)([0-9]{3}$)");
		Matcher matcher = pattern.matcher(pincode);
		return matcher.matches();
	
	}
	public static void main(String[] args) {
		
		System.out.println("Enter a pin code");
		Scanner sc = new Scanner(System.in);
		String pincode = sc.nextLine();
		
		if(pinCodeChecker(pincode))System.out.println("It is a valid pincode");
		else System.out.println("It is an invalid pincode");
		sc.close();
	}
	
}
