/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testsms;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

/**
 *
 * @author m0072
 */
public class EnviarEmail extends Thread{
   
    final String host = "10.100.10.172";
    String id     = "";
    String from   = "";
    String to     = "";
    String asunto = "";
    String cuerpo = "";
    long pausa    = 1000;
    
    public EnviarEmail(EmailBean eb){
       
       this.id=eb.id;
       this.from=eb.from;
       this.to=eb.to;
       this.asunto=eb.asunto;
       this.cuerpo=eb.cuerpo;
       this.pausa=eb.pausa;
       
   }
   
   public void run(){
      
      // Get system properties
      Properties properties = System.getProperties();

      // Setup mail server
      properties.setProperty("mail.smtp.host", host);

      try{
         
         while(!Thread.interrupted() && true){

            // Get the default Session object.
            Session session = Session.getDefaultInstance(properties);
             
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO,
                                    new InternetAddress(to));

            // Set Subject: header field
            message.setSubject(asunto);

            // Now set the actual message
            message.setText(cuerpo);

            // Send message
            Transport.send(message);
            
            System.out.println("Enviado e-mail correctamente....");
            
            Thread.sleep(pausa);
            
         }
      }catch (InterruptedException ie){
         System.out.println(ie.getMessage()); 
      }catch (MessagingException mex) {
         System.out.println(mex.getMessage());
      }

    }

//   public static void main(String [] args)
//   {    
//      // Recipient's email ID needs to be mentioned.
//      String to = "santiago.pastor@aviva.es";
//
//      // Sender's email ID needs to be mentioned
//      String from = "santiago.pastor@aviva.es";
//
//      // Assuming you are sending email from localhost
//      String host = "10.100.10.172";
//
//      // Get system properties
//      Properties properties = System.getProperties();
//
//      // Setup mail server
//      properties.setProperty("mail.smtp.host", host);
//
//      // Get the default Session object.
//      Session session = Session.getDefaultInstance(properties);
//
//      try{
//         // Create a default MimeMessage object.
//         MimeMessage message = new MimeMessage(session);
//
//         // Set From: header field of the header.
//         message.setFrom(new InternetAddress(from));
//
//         // Set To: header field of the header.
//         message.addRecipient(Message.RecipientType.TO,
//                                  new InternetAddress(to));
//
//         // Set Subject: header field
//         message.setSubject("Asunto");
//
//         // Now set the actual message
//         message.setText("Cuerpo");
//
//         // Send message
//         Transport.send(message);
//         System.out.println("Enviado e-mail correctamente....");
//      }catch (MessagingException mex) {
//         mex.printStackTrace();
//      }
//   }
}
