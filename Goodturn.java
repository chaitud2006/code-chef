import java.util.*;
import java.lang.*;
import java.io.*;


class Goodturn
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
    		int x = sc.nextInt();
    		int y = sc.nextInt();
    		int dice=x+y;
    		if(dice>6)
    		{
    		    System.out.println("YES");
    		}
    		else
    		{
    		    System.out.println("NO");
    		}
    		
		}
		
	}
}