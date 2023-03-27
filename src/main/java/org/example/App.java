package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        Cliente cliente = new Cliente(1, "André");

        System.out.println(cliente.getNome());
        System.out.println(cliente);
    }
}
