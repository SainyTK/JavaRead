public class Coin
{
	private int face;

	public Coin()
	{
		this.face = (int)(Math.random()*2);
	}

	public void spin()
	{
		this.face = (int)(Math.random()*2);
	}

	public int getFace()
	{
		return this.face;
	}

	public void flip()
	{
		if(this.face == 0)
			this.face = 1;
		else
			this.face = 0;
	}
}