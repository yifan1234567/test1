package UDPdemo;

import java.io.IOException;
import java.net.*;

/*

UDP通信练习
单播给具体ip和端口号发送数据
 */
public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        //1.创建DatagramSocket对象
        DatagramSocket ds = new DatagramSocket();//随机绑定一个端口号使用来发送数据

        //2.打包数据
        String str="你好！";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port=10086;

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);//要确定发送数据到哪个ip和端口号


        //3.发送数据

        ds.send(dp);
        //4.释放资源
        ds.close();


    }
}
