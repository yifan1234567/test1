package TCPdemo1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
/*

TCP通信练习
客户端发送数据，服务器端接收数据
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //要先运行服务器端，要不然找不到
        Socket socket = new Socket("127.0.0.1", 1000);//TCP协议发送数据的时候要确定ip和端口号

        OutputStream os = socket.getOutputStream();

        os.write("你好呀".getBytes());

        socket.close();
    }
}
