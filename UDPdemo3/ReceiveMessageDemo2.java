package UDPdemo3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;

public class ReceiveMessageDemo2 {
    public static void main(String[] args) throws IOException {
        MulticastSocket ms = new MulticastSocket(1000);
        InetAddress address = InetAddress.getByName("224.0.0.1");
        InetSocketAddress in = new InetSocketAddress("224.0.0.2", 1000);
        ms.joinGroup(in,null);

        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        ms.receive(dp);

        byte[] data = dp.getData();
        int length = dp.getLength();
        String ip = dp.getAddress().getHostAddress();
        String name = dp.getAddress().getHostName();
        System.out.println(ip+name+new String(data,0,length));
        ms.close();

    }
}
