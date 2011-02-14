/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Message;

/**
 *
 * @author tobiaslana
 */
public class Message {
    private String sender   = "";
    private String receiver = "";
    private String mesObject = "";

    public Message () {}
    
    public Message(String sender, String receiver, String mesObject) {
        this.sender = sender;
        this.receiver = receiver;
        this.mesObject = mesObject;
    }
    
    public void setSender(String sender) {
        this.sender = sender;
    }
    public String getSender() {
        return sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
    public String getReceiver() {
        return receiver;
    }

    public void setMesObject(String mesObject) {
        this.mesObject = mesObject;
    }
    public String getMesObject() {
        return mesObject;
    }

    
}
