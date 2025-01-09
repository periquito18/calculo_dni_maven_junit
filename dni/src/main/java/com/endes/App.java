package com.endes;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner (System.in);
        int dniNum;
        
        do {
        	System.out.println("Intrduzca los 8 números de tu dni: ");
        	dniNum = sc.nextInt();
        } while (dniNum < 10000000 || dniNum > 99999999);
        
        System.out.println("Número del DNI: " + dniNum);
    }
}
