package Assignment;

public class Events 
{
	Squad o = new Squad();
	
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
	public void Event2(player l) 
	{
		
	}
	public void Event3(player l) 
	{
		
	}
	
	/*interface EventAction {
        void Action();
    }*/
}
