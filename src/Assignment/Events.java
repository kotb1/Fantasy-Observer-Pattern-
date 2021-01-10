package Assignment;

public class Events 
{
	//Squad o = new Squad();
	
	public void Event1(player l) //goal
	{
		
		if(l.position.equals("MidFielder")) 
		{
			int q = Integer.parseInt(l.points);
			q+=5;
			l.points=Integer.toString(q);
		}
		else if(l.position.equals("Striker")) 
		{
			int q = Integer.parseInt(l.points);
			q+=4;
			l.points=Integer.toString(q);
		}
		else
		{
			int q = Integer.parseInt(l.points);
			q+=6;
			l.points=Integer.toString(q);
		}
	}
	public void Event2(player l)//For each penalty miss
	{
		int q = Integer.parseInt(l.points);
		q-=2;
		l.points=Integer.toString(q);
	}
	public void Event3(player l)//For every 3 shot saves by a goalkeeper
	{
		if(l.position.equals("GoalKeeper")) 
		{
			int q = Integer.parseInt(l.points);
			q+=3;
			l.points=Integer.toString(q);
		}
		else
			System.out.println("This player is not a GoalKeeper to save");
	}
}
