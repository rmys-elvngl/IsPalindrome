package main;
import java.util.Scanner;
public class IsPalindrome {
	
	static boolean IsPalindrome(String text) {
		int i=0;
		int j=text.length() -1;
		while(i<j) {
			if(text.charAt(i) == text.charAt(j)) 
				return true;
			i++;
			j--;
			
			
		}
		return false;
	}
	
	public static void main(String[] args) {
		String text;
		String request;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value ");
		text = input.nextLine();
		
		System.out.println(IsPalindrome(text));
	}

}
