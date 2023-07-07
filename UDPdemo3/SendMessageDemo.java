package UDPdemo3;

import java.io.IOException;
import java.net.*;


/*

UDP组播和广播练习

 */
public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        MulticastSocket ms = new MulticastSocket();//组播要创建MulticastSocket对象
        String str="你好123";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("255.255.255.255");
        int port=1000;
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);
        ms.send(dp);
        ms.close();

    }
}
