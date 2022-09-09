package Password;

public class LengthException extends PasswordException {
	
	public LengthException() {
		System.out.print("The password should be at least 6 characters long");
	}
	
	public LengthException(String Exceptionmsg) {
		super(Exceptionmsg);
	}
}
