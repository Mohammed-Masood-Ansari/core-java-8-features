package core_java.features8.lambda;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckWhetherStringContainsAlphabetsOrNot {
	
	public static boolean isStringValidOrNot(String str) {
		Matcher matcher=Pattern.compile("[a-zA-Z]").matcher(str);
		return matcher.find()?true:false;
	}
	
	public static void main(String[] args) {
		
		boolean b=isStringValidOrNot("5646");
		
		if(b) {
			System.out.println("Only Contains Alphabets");
		}else {
			System.out.println("Not contains only alphabets");
		}
	}
}
