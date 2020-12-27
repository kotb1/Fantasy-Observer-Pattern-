package Assignment;

import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;
import java.util.ArrayList;

public class main 
{
	//public static int i=0;
	//public static int j=0;
	private static BufferedReader br1;
	private static BufferedReader br2;
	private static BufferedReader br3;
	private static BufferedReader br4;
	private static BufferedReader br5;
	private static BufferedReader br6;
	public static int i=0;
	public static int j=0;
	public static ArrayList  <user> users =new ArrayList ();
	public static ArrayList  <player> Players =new ArrayList ();
	public static Register_Login2 p;
	public static void main (String[] args) throws IOException {
		
		//users=new user[5];
		br1 = new BufferedReader(new FileReader("usernames.txt"));
		 String[] line1=new String[8];
		 while ((line1[i] = br1.readLine()) != null) 
		 {
			 i++;
		 }
		 br2 = new BufferedReader(new FileReader("pass.txt"));
		 String[] line2=new String[8];
		 while ((line2[j] = br2.readLine()) != null) 
		 {
			 users.add(new user(line1[j],line2[j]));
			 j++;
		 }
		br3 = new BufferedReader(new FileReader("Striker.txt"));
		br4 = new BufferedReader(new FileReader("Goal_Keeper.txt"));
		br5 = new BufferedReader(new FileReader("Mid_Fielder.txt"));
		br6 = new BufferedReader(new FileReader("Defender.txt"));
		 String[] line3=new String[50];
		 while ((line3[i] = br3.readLine()) != null) 
		 {
			 String [] k = new String[4];
			 k=line3[i].split("  ");
			 Players.add(new striker(k[0],k[1],k[2],k[3],k[4])); 
			 i++;
		 }
		 String[] line4=new String[50];
		 while ((line4[i] = br4.readLine()) != null) 
		 {
			 String [] k = new String[4];
			 k=line4[i].split("  ");
			 Players.add(new goalkeeper(k[0],k[1],k[2],k[3],k[4])); 
			 i++;
		 }
		 String[] line5=new String[50];
		 while ((line5[i] = br5.readLine()) != null) 
		 {
			 String [] k = new String[4];
			 k=line5[i].split("  ");
			 Players.add(new midfielder(k[0],k[1],k[2],k[3],k[4])); 
			 i++;
		 }
		 String[] line6=new String[50];
		 while ((line6[i] = br6.readLine()) != null) 
		 {
			 String [] k = new String[4];
			 k=line6[i].split("  ");
			 Players.add(new defender(k[0],k[1],k[2],k[3],k[4])); 
			 i++;
		 }
		p=new Register_Login2(users);
		Scanner in = new Scanner(System.in);
		boolean x = true;
		String u="";
		String pa="";
		while(x==true) 
		{
			System.out.println("Login/Register");
			String y = in.nextLine();
			if(y.equals("Login"))
			{
				System.out.println("Please enter username");
				u=in.nextLine();
				System.out.println("Please enter Password");
				pa=in.nextLine();
				p.login(u, pa);
				boolean t=true;
				while(t==true)
				{
					player p1;
					System.out.println("Do u want to add a NEW Player OR Add a Squad OR Retrive a Player Info by name");
					String choice2= in.nextLine();
					if(choice2.equals("Player")) 
					{
						System.out.print("Please Enter the Name: ");
						String p2=in.nextLine();
						System.out.print("Please Enter the Position: ");
						String p3=in.nextLine();
						System.out.print("Please Enter the Club: ");
						String club1=in.nextLine();
						System.out.print("Please Enter the Nationality: ");
						String nationality1=in.nextLine();
						System.out.print("Please Enter the Price: ");
						String price1=in.nextLine();
						if(p3.equals("Defender")) 
						{
							p1=new defender(p2,p3,club1,nationality1,price1);
							p1.Add_player();
						}
						else if(p3.equals("Striker")) 
						{
							p1=new striker(p2,p3,club1,nationality1,price1);
							p1.Add_player();
						}
						else if(p3.equals("MidFielder")) 
						{
							p1=new midfielder(p2,p3,club1,nationality1,price1);
							p1.Add_player();
						}
						else if(p3.equals("GoalKeeper")) 
						{
							p1=new goalkeeper(p2,p3,club1,nationality1,price1);
							p1.Add_player();
						}
					}
					else if(choice2.equals("Squad")) 
					{
						Squad s = new Squad();
						boolean q=true;
						while(q==true)
						{
							while(s.totalprice<100.0 && s.noofplayers<15) 
							{
								System.out.println("Please Enter the name of the Player u want to add");
								String player4=in.nextLine();
								s.add(player4);
							}
							if(s.totalprice<100.0 && s.noofplayers==14) 
							{
								q=false;
								System.out.println("Your Squad has been built");
							}
							else 
							{
								System.out.println("Build your squad again u have exceeded the limits");
								s.clear();
							}	
						}
						for(int i =0;i<s.players2.length;i++) 
						{
							System.out.println(s.players2[i].name+"  "+s.players2[i].position);
						}
					}
					else if(choice2.equals("Log-out")) 
					{
						t=false;
					}
					else if(choice2.equals("Retrive")) 
					{
						System.out.println("Please enter the name of the Player");
						String key = in.nextLine();
						//player t1 = new player("","","","","");
						//t1.retrive(key);
						for(int i =0;i<Players.size();i++) 
						{
							if(Players.get(i).name.contains(key)) 
							{
								System.out.println(Players.get(i).name+"  "+Players.get(i).position+"  "+Players.get(i).club+"  "+Players.get(i).nationality+"  "+Players.get(i).price);
							}
						}
					}
				}
			}
			else if(y.equals("Register"))
			{
				System.out.println("Please enter username");
				u=in.nextLine();
				System.out.println("Please enter Password");
				pa=in.nextLine();
				p.Register(u, pa);
				
			}
			else if(y.equals("quit")) 
			{
				x=false;
			}
			
		}
	}
}