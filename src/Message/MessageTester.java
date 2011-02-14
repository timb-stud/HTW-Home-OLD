/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Message;

import java.io.IOException;

/**
 *
 * @author tobiaslana
 */
public class MessageTester {

    

    public MessageTester() throws IOException, ClassNotFoundException {
        // Server
        MessageReceiver msgr = new MessageReceiver();
        // Client
//        Message msg = new Message("ichsende", "dorthin", "diesenText");
//        MessageSender msgsender = new MessageSender();
//        msgsender.sendMsg(msg);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        MessageTester test = new MessageTester();
    }
    
}
