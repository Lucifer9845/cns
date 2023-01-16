import java.net.*;

public class DGreciever
{
    public static void main(String[] args) throws IOException
    {
        byte buf[] = new bye[1024];

        System.out.println("Reciever");
        DatagramSocket ds = new DatagramSocket(3000);

        while(true)
        {
            DatagramPacket dp = new DatagramPacket(buf, 1024);

            ds.reciever(dp);
            String msg = new String(ds.getdata(), 0, dp.getlength());
            SYstem.out.println(msg);
        }
    }
}
