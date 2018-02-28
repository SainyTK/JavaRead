import java.util.*;

public class TestHashMap
{
	public static HashMap<String,Integer> process()
	{
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		String s;
		Scanner sc = new Scanner(System.in);
		while(!(s=sc.nextLine()).equals("."))
		{
			String key = s.substring(0,1);
			char sym = s.charAt(1);
			String vals = s.substring(2);

			if(!(hm.containsKey(key)))
				hm.put(key,0);

			Integer val = Integer.parseInt(vals);
			if(sym=='-')
				val = val*-1;

			hm.put(key,hm.get(key)+val);
		}
		return hm;
	}

	public static void main(String[] args)
	{
		HashMap<String,Integer> h = process();
		System.out.println("A : " + h.get("A"));
		System.out.println("B : " + h.get("B"));
		System.out.println("C : " + h.get("C"));
	}
}