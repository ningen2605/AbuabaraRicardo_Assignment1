package Password;


	public class InvalidSequenceException extends PasswordException {
		
		public InvalidSequenceException() {
			System.out.print("The password cannot contain more than two of the same character in sequence.");
		}
		
		public InvalidSequenceException(String Exceptionmsg) {
			super(Exceptionmsg);
		}
}