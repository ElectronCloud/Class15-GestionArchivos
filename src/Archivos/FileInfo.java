/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.File;

/**
 *
 * @author jcarrero
 */
public class FileInfo {
    public static void main(String[] args) {
        File f = new File ("textos");
        System.out.println(f.exists());
        //System.out.println(f.canRead());
        //System.out.println(f.length());
        //System.out.println(f.getAbsoluteFile());
        //System.out.println(f.isDirectory());
        //System.out.println(f.list());
        if(f.isDirectory()){
            String lista[] = f.list();
            for(String nombre : lista){
                System.out.println(f.listFiles());
                System.out.println(nombre);
            }
        }
    }
}

//Listar todos los archivos qie tiene una carpeta, se dewbe buscar en la subcarpetas