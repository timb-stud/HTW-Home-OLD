/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Message;

/**
 *
 * @author tobiaslana
 */
public class MessageTester {

    Message msg = new Message("ichsende", "dorthin", "diesenText");
    MessageSender msgs = new MessageSender();
    msgs.sendMsg(msg);
}
