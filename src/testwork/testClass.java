package testwork;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;


import java.io.*;
import java.lang.Object.*;
import java.util.regex.Matcher;

import org.junit.*;

public class testClass {

	private static parseFunction testObject; 
	
	
	@BeforeClass 
	//initializing private variable 
	public static void initialize() throws Exception {
		testObject = new parseFunction();
	}
	
	
	@Test
	@Ignore
	//Input string can be null 
	public void stringIsNull() {
	    
	    try {
	    	String[] result = testObject.longWordAndLength(null);
            fail("Expected an IOException to be thrown");
        } catch (Exception e) {
            assertThat(e.getMessage(), is("Input String cannot be null"));
        }
	 }
	
	
    @Test
    @Ignore
    //Input string can have longest word length with case sensitive charaters
    // Eg: longest word for chirra - Chirra, cHirra and many combinations 
    public void ignoreCase() {
   
        String[] result = testObject.longWordAndLength("My name is vivek Chirra");
        assertTrue(result[0].equalsIgnoreCase("vivek"));
        //assertThat(result[0], IsEqualIgnoringCase.equalToIgnoringCase("chirra"));
    }

	
    @Test
    @Ignore
    //Checking if longest word is dictionary or not
    public void stringInDictionary() {
    	//can create a HashSet<String> including all permitted words and check our ouput against hashset
    }
    
    @Test
    @Ignore
    //1
    //Checking if longest word is empty
    public void checkEmptyWord() {
    	String[] result = testObject.longWordAndLength(" ");
	    assertEquals(result[0]," ");
    }
    
    @Test
    //Checking if longest word contains delimiter, special characters and numbers - here the delimiter is /
    //Examples: 57, ch1rra, $$, ch$rra, 57$, ch1$rra
    public void wordContainsDelimiter() {
    	String[] result = testObject.longWordAndLength("My name is vivek c1hirra");
	    assertThat(result[0], anyOf(containsString("1")));
    }
}
