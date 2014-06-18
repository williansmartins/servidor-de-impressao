package br.com.atlantic.junit;

import org.junit.Test;

import br.com.atlantic.teste.CircularQueue;
import br.com.atlantic.teste.PrintJob;
import br.com.atlantic.teste.Queue;
import br.com.atlantic.teste.QueueException;

public class TesteProvisorio
{
    @Test (expected=QueueException.class) 
    public void inserirMaisDoQuePode() throws QueueException
    {
	Queue queue = new CircularQueue(  );

	try
	{
	    queue.addBack( new PrintJob( "job1", 1 ) );
	    queue.addBack( new PrintJob( "job2", 2 ) );
	    queue.addBack( new PrintJob( "job3", 3 ) );
	    queue.addBack( new PrintJob( "job4", 4 ) );
	    queue.addBack( new PrintJob( "job5", 5 ) );
//	queue.addBack( new PrintJob( "job6", 6 ) );
//	queue.addBack( new PrintJob( "job6", 7 ) );
	    
	} catch ( QueueException e )
	{
	    System.err.println(">>" + "deu erro");
	    throw e;
	}
    }
    
    @Test (expected=QueueException.class) 
    public void removerMaisDoQuePode() throws QueueException
    {
	Queue queue = new CircularQueue( 5 );
	
	queue.addBack( new PrintJob( "job1", 1 ) );
	queue.addBack( new PrintJob( "job2", 2 ) );
	queue.addBack( new PrintJob( "job3", 3 ) );
	queue.addBack( new PrintJob( "job4", 4 ) );
	queue.addBack( new PrintJob( "job5", 5 ) );
	
	queue.removeFront();
	queue.removeFront();
	queue.removeFront();
	queue.removeFront();
	queue.removeFront();
	queue.removeFront();
    }
}
