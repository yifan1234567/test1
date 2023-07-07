package test1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //TCP协议下的数据传输是通过流进行的，因此服务器端不需要循环拆包解析数据，直接通过输入流不断获取数据即可
        ServerSocket ss = new ServerSocket(1000);
        Socket socket = ss.accept();
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
