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

    

    public MessageTester() throws IOException {
        Message msg = new Message("ichsende", "dorthin", "diesenText");
        MessageSender msgsender = new MessageSender();
        msgsender.sendMsg(msg);
    }
    
}
