import java.util.*;

public class TestStringBuffer
{
	public static void main(String[] args)
	{
		String s = "Hello World";
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb);
		sb.setCharAt(0,'W');
		System.out.println(sb);
		s = sb.toString();
		System.out.println(s);
	}
}