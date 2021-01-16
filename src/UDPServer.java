import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
    public static void main(String[] args) {
        try {
            byte buff[]=new byte[1024];
            DatagramPacket dp=new DatagramPacket(buff,200);
            DatagramSocket ds=new DatagramSocket(8848);
            ds.receive(dp);
            String str=new String(buff);
            System.out.println("UDP收到的消息:" + str);
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
