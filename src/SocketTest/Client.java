package SocketTest;

import java.io.*;
import java.net.*;

/**
 *
 * @author Volkan Gökkaya
 */
public class Client {

    public Client() throws IOException {

        MulticastSocket multiSocket = new MulticastSocket(1234);
        InetAddress group = InetAddress.getByName("255.255.255.255");
        multiSocket.joinGroup(group);
        String msg = "Hello";
        DatagramPacket hi = new DatagramPacket(msg.getBytes(), msg.length(), group, 6789);
        multiSocket.send(hi);
//        Socket server = new Socket("134.96.212.18", 1234);
//        InputStream input = server.getInputStream();
//        OutputStream output = server.getOutputStream();
//        output.write(5);
//        output.write(10);
//        output.flush();
//        System.out.println(input.read());
//        server.close();
//        input.close();
//        output.close();
    }

    public static void main(String[] args) {

        try {
            Client client = new Client();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
