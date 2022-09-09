package Password;

public class NoSpecialCharacterException extends PasswordException {
	public NoSpecialCharacterException() {
		System.out.print("The password must contain at least one special character such as (!@#$%^&*()-=_+`~[]\\{};:'\",<.>/?|)");
	}

	
	public NoSpecialCharacterException(String Exceptionmsg ) {
		super(Exceptionmsg);
	}
}
