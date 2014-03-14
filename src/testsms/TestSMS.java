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
public class TestSMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ArrayList<EmailBean> eb = new ArrayList<EmailBean>();
        ArrayList<TestThread> tt = new ArrayList<TestThread>();
        
        eb=CargaArrayEmailBean(eb);
                
        tt.add(new TestThread("1", 1000));
        tt.add(new TestThread("2", 2000));
                
        tt.get(0).start();
        tt.get(1).start();
    }
    
    private static ArrayList<EmailBean> CargaArrayEmailBean(ArrayList<EmailBean> eb){
        
        EmailBean temp= new EmailBean();
        temp.id="1";
        temp.to="santiago.pastor@aviva.es";
        temp.from="santiago.pastor@aviva.es";
        temp.asunto="asunto1";
        temp.cuerpo="cuerpo1";
        temp.pausa=1000;
        
        eb.add(temp);

        temp= new EmailBean();
        temp.id="2";
        temp.to="santiago.pastor@aviva.es";
        temp.from="santiago.pastor@aviva.es";
        temp.asunto="asunto2";
        temp.cuerpo="cuerpo2";
        temp.pausa=2000;
        
        eb.add(temp);
        
        return eb;
        
    }
    
}


