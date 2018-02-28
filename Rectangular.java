public class Rectangular extends Shape{
	
	private double w;
	private double h;

	public Rectangular(String name,double w,double h)
	{
		super(name);
		this.w = w;
		this.h = h;
	}

	public double getArea()
	{
		return w*h;
	}
}