package UDPdemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ReceiveMessageDemo {
    public static void main(String[] args) throws IOException {

        //1.创建DatagramSocket对象
        DatagramSocket ds = new DatagramSocket(10086);//创建DatagramSocket对象的时候要绑定端口号，该端口号与发送的端口保持一致

        //2.接收数据包
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        System.out.println("111");
        ds.receive(dp);
        //3.解析数据包

        byte[] data = dp.getData();//获取接收到的数据
        int length = dp.getLength();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();
        System.out.println("收到数据"+new String(data,0,length));
        System.out.println("该数据是从"+address+"这台电脑中的"+port+"这个端口号发出的");


        //4.释放资源
        ds.close();

    }
}
