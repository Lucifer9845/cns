import java.util.*;
import java.io.*;
import java.math.*;

class RSA
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int p, q, n, z, d=0, e;

		System.out.println("Enter the no to be encrypted and decrypted");
		int msg = sc.nextInt();

		double c;
		BigInteger msgback;

		System.out.println("Enter 2 prime numbers");
		p = sc.nextInt();
		q = sc.nextInt();

		n = p*q;
		z = (p-1)*(q-1);
		System.out.println("the value of z is " + z);
		for(e = 2; e<z;e++)
			if(gcd(e,z) == 1)
				break;

		System.out.println("value of e = " + e);
		for(int i = 1;i<=9;i++)
		{
			int x = 1+(i*z);
			if(x%e == 0)
			{
				d = x/e;
				break;
			}
		}

		System.out.println("the value of d is " + d);
		c = (Math.pow(msg, e))%n;
		System.out.println("encrypted message is \n" +c);

		BigInteger N = BigInteger.valueOf(n);

		BigInteger C = BigDecimal.valueOf(c).toBigInteger();

		msgback = (C.pow(d)).mod(N);

		System.out.println("decrypted message is \n "+msgback);
	}

	static int gcd(int e, int z)
	{
		if(e == 0)
			return z;
		else
			return gcd(z%e, e);
	}
}
