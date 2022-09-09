package Password;

public class NoUpperAlphaException extends PasswordException {
	
	public NoUpperAlphaException() {
		System.out.print("The password MUST contain at least one uppercase alphabetic character");
	}
	
	public NoUpperAlphaException(String Exceptionmsg) {
		super(Exceptionmsg);
	}
}