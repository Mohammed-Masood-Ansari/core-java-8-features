package core_java.features8.lambda;

public class ToCheckGivenInputContainsStringByLambda {

	
	public static boolean isStringContainsOnlyAlphabets(String input) {
		
		return (
				(input!=null)&&(!input.equals(""))&&(input.chars().allMatch(Character::isLetter))
				);
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String str = "gfgfhgku";
		
		boolean b=isStringContainsOnlyAlphabets(str);
		
		if(b) {
			System.out.println(str+" is contains alphabets");
		}else {
			System.out.println(str+" is not contains alphabets");
		}
	}
}
