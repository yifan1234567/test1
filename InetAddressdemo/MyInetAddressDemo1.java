package InetAddressdemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyInetAddressDemo1 {
    public static void main(String[] args) throws UnknownHostException {


        InetAddress address = InetAddress.getByName("DESKTOP-D1ISSHO");
        System.out.println(address);
        InetAddress address1 = InetAddress.getByName("127.0.0.1");
        System.out.println(address1);


        String hostName = address1.getHostName();//获取此IP地址的主机名
        String ip = address1.getHostAddress(); //返回文本显示中的IP地址字符串
        System.out.println(hostName);
        System.out.println(ip);

    }
}
