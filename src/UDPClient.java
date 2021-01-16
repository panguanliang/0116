import java.io.IOException;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        String message="欢迎";
        byte[] m=message.getBytes();
        DatagramPacket dp=new DatagramPacket(m,m.length);
        dp.setAddress(InetAddress.getByName("MS-ROXLAUHLEYFQ"));
        dp.setPort(8848);
        DatagramSocket ds=new DatagramSocket();
        ds.send(dp);






    }


}
