package Assignment;

public class Squad 
{
	public player players2[]=new player[15];
	public float totalprice=0;
	public int noofplayers=0;
	public int noofgoalkeepers=1;
	public int noofdefenders=1;
	public int noofstrikers=1;
	public int noofmidfielders=1;
	public player Search(String Name)
	{
		player p=null;
		for(int i=0;i<main.Players.size();i++) 
		{
			if(main.Players.get(i).name.contains(Name)) 
			{
				p = main.Players.get(i);
			}
		}
		if(p==null) 
		{
			System.out.println("Player not found");
		}
		return p;
	}
	public void add(String Name) 
	{
		player p = Search(Name);
		if(p.position.equals("GoalKeeper")) 
		{
			if(noofgoalkeepers<3) 
			{
				players2[noofplayers]=p;
				totalprice+=Float.parseFloat(players2[noofplayers].price);
				noofplayers+=1;
				noofgoalkeepers+=1;
			}
			else
				System.out.println("You Exceeded the number of GoalKeepers");
		}
		else if(p.position.equals("Striker")) 
		{
			if(noofstrikers<4) 
			{
				players2[noofplayers]=p;
				totalprice+=Float.parseFloat(players2[noofplayers].price);
				noofplayers+=1;
				noofstrikers+=1;
			}
			else
				System.out.println("You Exceeded the number of Strikers");
		}
		else if(p.position.equals("MidFielder")) 
		{
			if(noofmidfielders<6) 
			{
				players2[noofplayers]=p;
				totalprice+=Float.parseFloat(players2[noofplayers].price);
				noofplayers+=1;
				noofmidfielders+=1;
			}
			else
				System.out.println("You Exceeded the number of MidFielders");
		}
		else if(p.position.equals("Defender")) 
		{
			if(noofdefenders<6) 
			{
				players2[noofplayers]=p;
				totalprice+=Float.parseFloat(players2[noofplayers].price);
				noofplayers+=1;
				noofdefenders+=1;
			}
			else
				System.out.println("You Exceeded the number of Defenders");
		}
	}
	public void clear()
	{
		for(int i=0;i<15;i++) 
		{
			players2[i]=null;
		}
		totalprice=0;
		noofplayers=0;
		noofgoalkeepers=1;
		noofdefenders=1;
		noofstrikers=1;
		noofmidfielders=1;
	}
	public void add_defender(String Name)
	{
		
		
	}
	public void add_striker(String Name)
	{
		
		
	}
	public void add_midfielder(String Name)
	{
		
		
	}
}