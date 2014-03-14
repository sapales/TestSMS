/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testsms;

/**
 *
 * @author m0072
 */
public class TestThread extends Thread{
    
    String idHilo;
    long lEspera=1000;
    
    // Constructor
    public TestThread(String idHilo, long lPausa){
        this.idHilo=idHilo;
        this.lEspera=lPausa;
    }
    
    public void run(){
        
        try{
            while(!Thread.interrupted() && true){
                System.out.println("Hilo: [" + idHilo + "] - En ejecución");
                Thread.sleep(lEspera);
            }
        }
        catch(Exception e){
            System.out.println("Hilo: [" + idHilo + "] - " + e.getMessage());
        }

    }
    
}
