/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testsms;

import java.util.ArrayList;

/**
 *
 * @author m0072
 */
public class Pruebas {
    
    public static void main(String args[]){
        
         ArrayList a = new ArrayList();

         a.add("Lenguaje");
         a.add(3);
         a.add('a');
         a.add(23.5);
        
         System.out.println("Printing...");
         for(int x=0; x<a.size(); x++){
             System.out.println(a.get(x).toString());             
         }

         System.out.println("Eliminando...");
         a.clear();

         a.add("Idioma");
         a.add(8);
         a.add('x');
         a.add(33.3);
        
         System.out.println("Printing...");
         for(int x=0; x<a.size(); x++){
             System.out.println(a.get(x).toString());             
         }
         
    }
    
    
}
