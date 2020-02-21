package testwork;

public class parseFunction {
	
	
	public String parseString;
	
	
	public String[] longWordAndLength(String input) {
		
		parseString = input;
		
		String[] indv = input.split(" ");
		
		String lw = indv[0];
		int lw_length = 0;

		
		if(indv.length > 0) {
			for (String word : indv) {
				if(lw_length < word.length()) {
					lw_length = word.length();
					lw = word;
				}
			}
		}
	
		return new String[] {lw, Integer.toString(lw_length)};
	}

}
