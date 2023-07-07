package TCPdemo1;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(1000);//要确定客户端的端口号

        Socket socket = ss.accept();//要监听客户端的连接

        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        int b;
        while ((b=isr.read())!=-1)
        {
            System.out.print((char)b);
        }
        socket.close();
        ss.close();

    }
}
