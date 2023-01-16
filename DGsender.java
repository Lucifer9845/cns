import java.net.*;
import java.util.*;

public class DGsender
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Sender");

        DatagramSocket ds = new DatagramSocket();

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the message")
        while(true)
        {
            String msg = sc.nextLine();

            InetAddress ip = InetAddress getByname("127,0,0,1");
            DatagramPacket dp = new DatagramPacket(msg.getByte, msg.length(), pi, 3000);
            ds.send(dp);
        }
    }
}
