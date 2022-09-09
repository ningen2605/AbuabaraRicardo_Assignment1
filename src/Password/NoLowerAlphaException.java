package Password;

public class NoLowerAlphaException extends PasswordException {
	
	public NoLowerAlphaException() {
		System.out.print("The password MUST contain at least one lowercase alphabetic character");
	}
	
	public NoLowerAlphaException(String Exceptionmsg) {
		super(Exceptionmsg);
	}
}
