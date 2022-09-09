package Password;

public class UnmatchedException extends PasswordException {
	
	public UnmatchedException() {
		System.out.print("The passwords do not match");
	}
	
	public UnmatchedException(String exceptionMsg) {
		super(exceptionMsg);
	}
}
