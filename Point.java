public class Point{
	int x;
	int y;

	public Point(int argX,int argY)
	{
		x = argX;
		y = argY;
	}

	public static void func(Point arg1,Point arg2)
	{
		arg1.x = 100;
		arg1.y = 100;
		Point temp = arg1;
		arg1 = arg2;
		arg2 = temp;
		System.out.println("1X: " + temp.x + " Y: " + temp.y);
		System.out.println("2X: " + arg1.x + " Y: " + arg1.y);
		System.out.println("3X: " + arg2.x + " Y: " + arg2.y);
	}

	public static void f(Point arg)
	{
		arg = new Point(599,234);
	}

	public static void main(String[] args)
	{
		Point pnt1 = new Point(0,0);
		Point pnt2 = new Point(0,0);
		System.out.println("X: " + pnt1.x + " Y: " + pnt1.y);
		System.out.println("X: " + pnt2.x + " Y: " + pnt2.y);
		System.out.println(" ");
		func(pnt1,pnt2);
		System.out.println("X: " + pnt1.x + " Y: " + pnt1.y);
		System.out.println("X: " + pnt2.x + " Y: " + pnt2.y);
	}
}