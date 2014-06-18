package br.com.atlantic.teste;

public class PrintJob
{
    private String jobName;
    private int numberOfPages;
    
    //Construtor
    public PrintJob( String jobName, int numberOfPages )
    {
	super();
	this.jobName = jobName;
	this.numberOfPages = numberOfPages;
    }
    
    //Getters e Setters
    public String getJobName( )
    {
        return jobName;
    }
    public void setJobName( String jobName )
    {
        this.jobName = jobName;
    }
    public int getNumberOfPages( )
    {
        return numberOfPages;
    }
    public void setNumberOfPages( int numberOfPages )
    {
        this.numberOfPages = numberOfPages;
    }
    
    
}
