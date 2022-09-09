package Password;

public class NoDigitException extends PasswordException {
	
	public NoDigitException() {
		System.out.print("The password must contain at least one digit");
	}
	
	public NoDigitException(String exceptionMsg) {
		super(exceptionMsg);
	}
}
