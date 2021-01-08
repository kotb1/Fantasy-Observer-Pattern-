package Assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Squad 
{
	
	public int totalscore=0;
	private static BufferedReader br8;
	public player players2[]=new player[15];
	public float totalprice=0;
	public int noofplayers=0;
	public int noofgoalkeepers=1;
	public int noofdefenders=1;
	public int noofstrikers=1;
	public int noofmidfielders=1;
	public void saved_Squad(String File_name) throws IOException 
	{
	//	Squad p = new Squad();
		int i=0;
		String[] line3=new String[50];
		br8 = new BufferedReader(new FileReader(File_name));
		while ((line3[i] = br8.readLine()) != null) 
		 {
			 String [] k = new String[5];
			 k=line3[i].split("  ");
			players2[i]=(new player(k[0],k[1],k[2],k[3],k[4],k[5])); 
			 i++;
		 }
		
	}
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
		if(p==null) 
		{
			return;
		}
		else {
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
	public player search_squad(String playername) 
	{
		player x= null;
		for(int i = 0;i<15;i++)
		{
			if(players2[i].name.contains(playername)) 
			{
				x= players2[i];
			}
		}
		return x;
	}
}