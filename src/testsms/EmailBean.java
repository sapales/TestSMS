/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testsms;

/**
 *
 * @author m0072
 */
public class EmailBean {
    
    String id = "";
    String to   = "";
    String from = "";
    String asunto = "";
    String cuerpo = "";
    long pausa = 1000;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public long getPausa() {
        return pausa;
    }

    public void setPausa(long pausa) {
        this.pausa = pausa;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
    
}
