package test1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
/*
TCP练习
客户端：多次发送数据
服务器：接受多次数据并打印
 */
public class Client {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1", 1000);
        Scanner scan =new Scanner(System.in);
        OutputStream os = socket.getOutputStream();


        while (true) {
            System.out.println("请输入你要输入的数据");
            String s = scan.nextLine();
            if("886".equals(s)){break;}

            os.write(s.getBytes());
        }

        socket.close();
    }
}
