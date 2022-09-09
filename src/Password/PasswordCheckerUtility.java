package Password;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCheckerUtility {
	/**
	 * 
	 * @author Ricardo Abuabara
	 *
	 */
public static boolean isValidPassword(String passwordString) 
	throws LengthException,
    NoDigitException,
    NoUpperAlphaException,
    NoLowerAlphaException,
    InvalidSequenceException,
    NoSpecialCharacterException
{
	//Regex: Check for digits, uppercase, lowercase, duplicates, special characters
if (passwordString.length() < 6) 
{
throw new LengthException("INVALID: Password length is less than 6 characters");


}else if (!(passwordString.matches(".*[A-Z].*"))) 
{
throw new NoUpperAlphaException("INVALID: Password has no uppercase");

}else if (!(passwordString.matches(".*\\d.*"))) 
{
throw new NoDigitException("INVALID: Password has no digits");


}else if (!(passwordString.matches(".*[a-z].*"))) 
{
throw new NoLowerAlphaException("INVALID: Password has no lowercase");


}else if (duplicateChars(passwordString)) 
{
throw new InvalidSequenceException("INVALID: Password has Duplicate Characters");


}else if (!(passwordString.matches(".*[$&+,:;=\\\\?@#|/'<>.^*()%!-].*"))) 
{
throw new NoSpecialCharacterException("INVALID: Password has no Special Characters");

}else 
{
return true;
}
}
  //method  to find duplicate characters in the array
public static boolean duplicateChars(String password) 
{

	
	char[] chars = password.toCharArray();
	
	for (int i = 0; i < chars.length; i++) 
	{
		int duplicate = 0;
		for (int j = 0; j < chars.length; j++) 
		{
			if (chars[i] == chars[j] && i != j ) 
			{
				duplicate++;
			}
		}
		if (duplicate >= 2) 
		{
			return true;
		}
	}
	return false;
	
}
//method arraylist that finds invalid passwords in a list.
public static ArrayList<String> getInvalidPasswords(ArrayList<String> passwords){
	ArrayList<String> invalidPasswords = new ArrayList<>();
	for(String password : passwords)
	
		try {
			isValidPassword(password);
		} catch (PasswordException e) {
			invalidPasswords.add(password + " " + e.getMessage());
		}
	
	invalidPasswords.add("");
	return invalidPasswords;
}

//method who works only for provided classes by assignment
public static boolean isWeakPassword(String passwordString) {
	if(passwordString.length() >= 6 && passwordString.length() <= 9)
	{
		return true;
	}
	else return false;
}


//more methods for classes outside of the provided ones
public static boolean comparePasswordsWithReturn(String passwordString, String passwordAString) throws UnmatchedException {

	if(passwordString.equals(passwordAString))
	{
		return true;
	}
	else return false;
}

public static boolean comparePasswords(String password, String passwordConfirm) {
	
	if(password.equals(passwordConfirm))
	{
		return true;
	}
	else return false;
}

public static boolean hasUpperAlpha(String password) throws NoUpperAlphaException {
	boolean var = false;
	for(int i = 0; i < password.length();i++)
	{
		if((password.matches(".*[A-Z].*")))
			{
	var = true;
			}
		else var = false;
	
	}
	return var;
}

public static boolean isValidLength(String password) throws LengthException {
	if(password.length() >= 6 && password.length() <= 9)
	{
		return true;
	}
	else return false;
	
}





}
