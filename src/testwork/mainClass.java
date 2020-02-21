package testwork;

import java.util.Arrays;

public class mainClass {
	public static void main (String[] args) throws java.lang.Exception
	{
		String input = "My name is vivek chirra";
		
		parseFunction obj = new parseFunction();
		String[] result  = obj.longWordAndLength(input);
		
		System.out.println(Arrays.toString(result));
	
	}
}
