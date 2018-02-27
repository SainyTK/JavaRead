import java.util.*;
import java.io.*;

public class Prob4
{

	public static String in()
	{
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}

	public static void main(String[] args)
	{
		String s;
		ArrayList<String> sList = new ArrayList<String>();
		do
		{
			s = in();
			if(s.equals("-1"))
				break;
			if(!sList.contains(s))
				sList.add(s);
		}while(true);

		for(String st:sList)
			System.out.print(st + " ");
	}
}