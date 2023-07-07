package test2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
/*

TCP练习
客户端：发送数据，接收服务器发送的数据并打印
服务器端：接受客户端的数据，发送一条数据
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 1000);

        OutputStream os = socket.getOutputStream();

        os.write("见到你很高兴".getBytes());


        socket.shutdownOutput();//必须写出一个输出流结束标记

        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        int b;
        while ((b= isr.read())!=-1){
            System.out.print((char) b);
        }

        socket.close();

    }
}
