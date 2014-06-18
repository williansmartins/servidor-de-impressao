package br.com.atlantic.teste;

public interface Queue
{
    // retorna o tamanho da fila
    public int size( );

    // retorna se a fila está vazia
    public boolean isEmpty( );

    // retorna se a fila está cheia
    public boolean isFull( );

    // inserir itens na fila
    public void addBack( PrintJob job ) throws QueueException;

    // remover item da fila
    public PrintJob removeFront( ) throws QueueException;

    // retorna o numero de Jobs
    public int getNumberOfJobs( );

}
