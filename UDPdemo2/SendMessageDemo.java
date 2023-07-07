package UDPdemo2;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;
/*

UDP通信练习：聊天室
UDP发送数据：循环发送数据，数据来自键盘录入，直到输入的数据是886，发送数据结束
UDP接收数据：采用死循环接收数据(需要不断地接收和解析数据包)
 */
public class SendMessageDemo {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket();

        Scanner scan = new Scanner(System.in);
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port=10086;


        while (true) {
            System.out.println("请输入您要说的话:");
            String str = scan.nextLine();
            if("886".equals(str)){break;}
            byte[] bytes = str.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);//打包数据
            ds.send(dp);
        }


        ds.close();
    }
}
