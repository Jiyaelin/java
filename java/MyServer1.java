import java.io.*;
import java.net.*;

public class MyServer1 {
    public static void main(String[] args) throws IOException {
        DatagramSocket dSocket = new DatagramSocket(9000);
        byte[] buf = new byte[256];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        dSocket.receive(packet);
        String response = new String(packet.getData());
        System.out.println("Server:" + response);
        dSocket.close();
    }
}
