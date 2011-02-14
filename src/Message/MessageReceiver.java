package Message;

import java.net.*;
import java.io.*;
/**
 *
 * @author tobiaslana
 */
public class MessageReceiver {

    static final int    PORT = 1234;
    ServerSocket server = new ServerSocket(PORT);

    public MessageReceiver() throws IOException, ClassNotFoundException{
        while (true) {
            Socket client = server.accept();
            ObjectInputStream input = new ObjectInputStream(client.getInputStream());
            Message msg = (Message)input.readObject();
            System.out.println(msg.getSender());
            input.close();
        }
    }
    
    

}
