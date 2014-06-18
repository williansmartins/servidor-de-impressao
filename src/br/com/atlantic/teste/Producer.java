package br.com.atlantic.teste;

public class Producer implements Runnable
{
    private final Queue queue;
    private final String name;
    private int quantidade = 1;

    public Producer( String name, Queue queue )
    {
	this.queue = queue;
	this.name = name;
    }

    public String getProducerName( )
    {
	return this.name;
    }

    public void run( )
    {
	synchronized ( queue )
	{
	    
        	while( quantidade <=5 )
        	{
        	    
        	    try
        	    {
        		//montando o job
        		PrintJob job = new PrintJob(  this.name + "-job-" + quantidade, quantidade * 2 );
        		System.out.println( "#" + this.name + "#: " + "Produzindo arquivo: '" + job.getJobName() + "', número de páginas: " + job.getNumberOfPages());
        		
        		queue.notify();
        		if ( !queue.isFull() )
        		{
        
        		    // add job na fila
        		    queue.addBack( job );
        		    quantidade++;
        		    System.out.println( "Add item na lista" );
        		    System.out.println( "Quantidade >> " + queue.size() );
        
        		    // aguardando alguns segundos para adicionar mais jobs
        		    Thread.sleep( job.getNumberOfPages() * 1000 );
        
        		} else
        		{
        		    System.out.println( "FILA cheia" );
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