/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Message;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author tobiaslana
 */
public class MessageSender {

    public void sendMsg(Message msg) throws IOException{

        Socket server = new Socket("255.255.255.255", 1234);
        ObjectOutputStream output = new ObjectOutputStream(server.getOutputStream());
        output.writeObject(msg);
        server.close();
        output.close();
    }
}
