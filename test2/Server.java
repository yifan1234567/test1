package test2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1000);
        Socket socket = ss.accept();
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        int b;
        while ((b=isr.read())!=-1)
        {
            System.out.print((char) b);
        }


        //写回数据
        OutputStream os = socket.getOutputStream();
        os.write("有多高兴？".getBytes());

        socket.close();
        ss.close();
    }
}
