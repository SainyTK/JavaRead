import java.io.*;
import java.util.*;

public class Foo
{
	public static ArrayList<String> parse(String input)
	{
		String[] sArr = input.split(", ");
		ArrayList<String> sList = new ArrayList<String>();
		for(int i=0;i<sArr.length;i++)
		{
			if(sArr[i].startsWith("A9"))
				sList.add(sArr[i].substring(2,4));
			else 
				{
					if(sArr[i].startsWith("B1"))
						sList.add(sArr[i].substring(sArr[i].length()-2,sArr[i].length()-1));
				}
		}
		return sList;
	}

	public static void main(String[] args)
	{
		ArrayList<String> s = parse("A9C1888, B13D66, B13455, B18211, A97663");
		for(String x:s)
			System.out.println(x);
	}
}