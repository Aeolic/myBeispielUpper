package de.Aeolic;

//Testkommentar


import java.util.*;
public class App 
{
	
	/**
	 * Dies ist ein Testcomment im Doc Format au�erhalb der main
	 */
    public static void main( String[] args )
    {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.println("Gib etwas ein: ");
	String eingabe = sc.next();
	eingabe = eingabe.toUpperCase();
	System.out.println("Alles Gro�: " + eingabe);
	
	/**
	 * Dies ist ein Testcomment im Doc Format innerhalb der main
	 */
	
	
    }
}
