package Password;

public class PasswordException extends Exception {


	public PasswordException() {
		System.out.print("There was an error with the password!!!");
	}
	public PasswordException(String exceptionMsg) {
		super(exceptionMsg);
	}
	
}