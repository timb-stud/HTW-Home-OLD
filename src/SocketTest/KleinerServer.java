package SocketTest;
import java.net.*;
import java.io.*;
/**
 *
 * @author tobiaslana
 */
public class KleinerServer {

    ServerSocket server = new ServerSocket(1234);

    public KleinerServer() throws IOException{
        while (true) {
            Socket client = server.accept();
            InputStream input = client.getInputStream();
            OutputStream output = client.getOutputStream();
            int zahl1 = input.read();
            int zahl2 = input.read();
            output.write(zahl1 + zahl2);
            output.flush();
            input.close();
            output.close();
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
