import java.io.*;
import java.util.*;

public class TestShape
{
	public static void main(String[] args)
	{
		ArrayList<Shape> shapes = new ArrayList<Shape>(); 
		shapes.add(new Rectangular("A", 11.0, 10.0)); 
		shapes.add(new Circle ("B", 3.0)); 
		shapes.add(new Circle ("C", 4.0));
		Circle c = new Circle("D",3.0);
		System.out.println("Name" + c.getName());
		System.out.println("Biggest = " + findBiggest(shapes).getName());
	}

	private static Shape findBiggest(ArrayList<Shape> shapes)
	{
		Shape biggest = shapes.get(0);
		for(Shape s:shapes)
		{
			if(s.getArea()>=biggest.getArea())
				biggest = s;
		}
		return biggest;
	}
}