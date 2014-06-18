package br.com.atlantic.teste;

public class QueueException extends Exception
{

    private static final long serialVersionUID = 1L;

    public QueueException()
    {
	super();
    }

    public QueueException( String message )
    {
	super( message );
    }

    public QueueException( String message, Throwable cause )
    {
	super( message, cause );
    }

}
