package exception;

import java.io.IOException;

public class MyClass {

	public void dangerousMethod() throws MyException, IOException
	{
		System.out.println( "normal... " );

		boolean isDanger = true;
		if( isDanger )
		{
			// ���ܻ�Ȳ�� �߻�
			// ex) network ����, io ����
			throw new IOException( "���ܻ�Ȳ �߻�" );
		}
		System.out.println( "normal... " );
	}
}
