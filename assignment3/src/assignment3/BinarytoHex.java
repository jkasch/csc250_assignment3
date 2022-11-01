package assignment3;

import java.util.Scanner;

public class BinarytoHex 
{	
	public static void main (String[] args)
	{
		//ask user input and switch from string to int
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a binary number and this program will display the hexadecimal equivalent:");
		String s = input.nextLine();
		int x = Integer.parseInt(s,2); //2 is the radix specifies base to be used
		
		//print results
		System.out.println("The hexadecimal equivalent of " + s + " is: ");
		Hexadecimal(x);
	}
	static void Hexadecimal(int x)
	{
		System.out.println(Integer.toHexString(x).toUpperCase());
	}  
}
