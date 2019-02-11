/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author jcarrero
 */
public class Lectura {
    public static void main(String[] args) 
            throws FileNotFoundException {
        Scanner input = new Scanner(new File("lect"));
        /*int cont = 0;
        while(input.hasNext()){
            String word = input.next();
            System.out.println(word);               para leer datos de un archivo
            cont++;
        }
        System.out.println(cont);*/
        
        
       /* PrintStream out = new PrintStream("lect");     para escribir datos sobre un archivo
        out.println("asda");*/
       
        /*double sum=0;
        for(int i=0; i<5; i++){
            double num=0;
            num=input.nextDouble();
            sum=sum+num;
        }
        System.out.println(sum);*/
        
    
        Scanner in = new Scanner(new File("Empleados"));
        
        int cont = 0;
        int c=0;
        double suma=0.0;
        while (input.hasNext()){
            String word = input.next();
            while (input.hasNextDouble()){
                double sum=0.0;
                sum=input.nextDouble();
                suma+=sum;
                c++;
            }
            System.out.println(word + suma);
            cont++;
        }
    
    }
    



//Leer enteros
//Almacenarlos en archivos
//Pedir datos por consola y preguntar si los quiere guardar
// Cargar el archivo