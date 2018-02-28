public classs ScoreBoard{
	
	private Counter teamL,teamR;
	private Arrow arrow;

	public ScoreBoard()
	{
		teamL= new Counter(0);
		teamR = new Counter(0);
		arrow = new Arrow();
		arrow.turnOnLeft();
		arrow.turnOnRight();
	}

	public void scoreLeft()
	{
		teamL.increase();
		arrowChange();
	}

	public void scoreRight()
	{
		teamR.increase();
		arrowChange();
	}

	public void reset()
	{
		teamR.reset();
		teamL.reset();
		arrow.turnOffAll();
	}

	private static void arrowChange()
	{
		if(teamL.getCurrent()>teamR.getCurrent())
		{
			arrow.turnOffAll();
			arrow.turnOnLeft();
		}
		else
		{
			if(teamL.getCurrent()<teamR.getCurrent())
			{
				arrow.turnOffAll();
				arrow.turnOnRight();
			}
			else
			{
				arrow.turnOnLeft();
				arrow.turnOnRight();
			}
		}
	}

}