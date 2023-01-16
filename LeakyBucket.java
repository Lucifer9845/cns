import util.*;
public class LeakyBucket
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bucker size");

        int n = sc.nextInt();
        int a[] = new int[a];

        System.out.println("enter the number of packets");
        int num = sc.nextInt();

        System.out.println("Enter the data output rate");
        int out = sc.nextInt();

        for(int i =0;i<num;i++)
        {
            if(a[i]>n)
                System.out.println("Bucket overflow "+ a[i]);
            else
            {
                if(a[i]==out)
                    SYstem.out.println("Packet transimitted " + a[i]);
                else if (a[i]>out)
                {
                    while(a[i] !=0 && a[i]>out)
                    {
                        System.out.println("packet transimitted " + a[i])
                        a[i] = a[i] - out;
                    }
                    SYstem.out.println("packet transimitted " + a[i]);
                }
            }
        }
    }
}
