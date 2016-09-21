package exception;

public class MyException extends Exception {

	private static final long serialVersionUID = -869;
	public MyException()
	{
		super( "MyException Occurs" );
	}
	
	public MyException( String message )
	{
		super( message );
	}
}
