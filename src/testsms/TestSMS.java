/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testsms;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author m0072
 */
public class TestSMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int hilo=0;
        ArrayList<EmailBean> eb = new ArrayList<EmailBean>();
        ArrayList<EnviarEmail> tt = new ArrayList<EnviarEmail>();

        // Cargamos el ArrayList con un Bean por cada e-mail a enviar
        eb=CargaArrayEmailBean(eb);
        
        // Recorremos el ArrayList generando un hilo (Thread) por cada Bean
        Iterator it = eb.iterator();
        while(it.hasNext()){
            // Creamos el hilo
            EmailBean x = (EmailBean)it.next();
            tt.add(new EnviarEmail(x));
            // Lo arrancamos
            tt.get(hilo).start();
            hilo++;
        }
        
    }
    
    private static ArrayList<EmailBean> CargaArrayEmailBean(ArrayList<EmailBean> eb){
        
        EmailBean temp= new EmailBean();
        temp.id="1";
        temp.to="santiago.pastor@aviva.es";
        temp.from="santiago.pastor@aviva.es";
        temp.asunto="asunto1";
        temp.cuerpo="cuerpo1";
        temp.pausa=60000;
        
        eb.add(temp);

        temp= new EmailBean();
        temp.id="2";
        temp.to="santiago.pastor@aviva.es";
        temp.from="santiago.pastor@aviva.es";
        temp.asunto="asunto2";
        temp.cuerpo="cuerpo2";
        temp.pausa=90000;
        
        eb.add(temp);
        
        return eb;
        
    }
    
}


