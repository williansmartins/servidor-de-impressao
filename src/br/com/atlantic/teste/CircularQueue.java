package br.com.atlantic.teste;

public class CircularQueue implements Queue
{

    private static final int std_capacity = 5;
    private final int capacity; // capacity
    private int front = 0;
    private int rear = 0;
    private PrintJob[] jobs;

    public CircularQueue(){
        this(std_capacity);
    }
    
    public CircularQueue( int valor )
    {
	capacity = valor;
	jobs = new PrintJob[capacity];
    }

    @Override
    public int size( )
    {
	if ( rear > front )
	    return rear - front;
	return capacity - front + rear;
    }

    @Override
    public boolean isEmpty( )
    {
	return ( rear == front ) ? true : false;
    }

    @Override
    public boolean isFull( )
    {
	int diff = rear - front;
	if ( diff == -1 || diff == (capacity-1) )
	    return true;
	return false;
    }

    @Override
    public void addBack( PrintJob job ) throws QueueException
    {
	if ( isFull() )
	{
	    throw new QueueException( "Queue is Full." );
	} else
	{
	    System.out.println(">>pos_array:" + rear);
	    jobs[rear] = job;
	    rear = (rear + 1) % capacity;
	}
    }

    @Override
    public PrintJob removeFront( ) throws QueueException
    {
	PrintJob job;
	if ( isEmpty() )
	{
	    throw new QueueException();
	} else
	{
	    job = jobs[front];
	    jobs[front] = null;
	    front = (front + 1) % capacity;
	}
	return job;
    }

    @Override
    public int getNumberOfJobs( )
    {
	return jobs.length;
    }

}
