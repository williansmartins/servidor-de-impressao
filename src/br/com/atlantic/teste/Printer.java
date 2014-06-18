package br.com.atlantic.teste;

public class Printer implements Runnable
{

    private final Queue queue;
    private final String name;
    private boolean continuar = true;
    protected final long  MILLIS_PER_PAGE = 500; 

    public Printer( String name, Queue queue )
    {
	this.queue = queue;
	this.name = name;
    }
    
    public void halt(){
	continuar = false;
    }

    public void run( )
    {
	synchronized ( queue )
	{
	    while ( continuar )
	    {
		// removendo um item da fila
		System.out.println( "#" + this.name + "#: " );

		if ( !queue.isEmpty() )
		{
		    try
		    {
			PrintJob job = queue.removeFront();
			System.out.println("Imprimindo: " + job.getJobName());
			Thread.sleep(job.getNumberOfPages() * MILLIS_PER_PAGE);
			queue.notify();

			if ( queue.isEmpty() )
			{
			    System.out.println("Nao tenho mais nada para imprimir....");
			    queue.wait();
			}
		    } catch ( QueueException | InterruptedException e )
		    {
			System.out.println( "Houve uma exceção: " + e.getMessage() );
		    }
		}
	    }
	}
    }
}
