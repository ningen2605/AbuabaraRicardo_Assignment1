package Password;

public class WeakPasswordException extends PasswordException {
	public WeakPasswordException() {
		System.out.print("The password MUST contain 6 or more ");
	}
	
	public WeakPasswordException(String Exceptionmsg) {
		super(Exceptionmsg);
	}
}
