package SocketTest;
import java.net.*;
import java.io.*;
/**
 *
 * @author tobiaslana
 */
public class KleinerServer {
    static final    int         PORT            = 1234;
    static final    String      MULTICAST_GROUP = "255.255.255.255";
    static final    InetAddress GROUP_ADDRESS;
    static {
        try {
            GROUP_ADDRESS = InetAddress.getByName(MULTICAST_GROUP);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

    //ServerSocket server = new ServerSocket(1234);

    public KleinerServer() throws IOException{
        while (true) {
            MulticastSocket multicastSocket;
            multicastSocket = new MulticastSocket(PORT);
            multicastSocket.joinGroup(GROUP_ADDRESS);
            byte[] buf = new byte[1000];
            DatagramPacket recv = new DatagramPacket(buf, buf.length);
            multicastSocket.receive(recv);
            System.out.println(recv);
        }
    }
    public static void main (String[] args) {
        try {
            KleinerServer server = new KleinerServer();
        } catch (IOException e) {
            System.out.print(e);
        }
    }

}
