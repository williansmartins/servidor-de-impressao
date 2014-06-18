package br.com.atlantic.teste;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class PrinterApp
{

    public static void main( String[] args )
    {
	//Criar a fila de impressão
	Queue queue = new CircularQueue( 5 );
	
	//Criação do produtor
	ExecutorService executor1 = Executors.newCachedThreadPool();
	ExecutorService executor2 = Executors.newCachedThreadPool();
	ExecutorService consumidor = Executors.newCachedThreadPool();
	
	//Execução do produtor
	executor1.execute( new Producer( "produtor1", queue ) );
	executor2.execute( new Producer( "produtor2", queue ) );
	
	//Execução do consumidor
	consumidor.execute( new Printer( "printer", queue ) );

    }

}
