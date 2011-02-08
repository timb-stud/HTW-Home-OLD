

package SocketTest;

import htwhome.Main;
import java.io.*;
import java.net.*;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Volkan Gökkaya
 */
public class Client {


    public Client() throws IOException {
        Socket server = new Socket("localhost", 1234);
        InputStream input = server.getInputStream();
        OutputStream output = server.getOutputStream();
        output.write(5);
        output.write(10);
        output.flush();
        System.out.println(input.read());
        server.close();
        input.close();
        output.close();
    }

    public static void main(String[] args){

        try{
            Client client = new Client();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
