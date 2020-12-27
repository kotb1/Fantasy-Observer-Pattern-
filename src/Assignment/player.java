package Assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public  class player 
{
	public String name;
	public String nationality;
	public String club;
	public String position;
	public String price;
	//private static BufferedReader br3;
	//private static BufferedReader br4;
	//private static BufferedReader br5;
	//private static BufferedReader br6;
	//public static ArrayList  <player> Players =new ArrayList ();
	
	public void Add_player() throws IOException{};
	public player(String nam1,String typ,String clu,String nati,String pri) throws IOException
	{
		name=nam1;
		position=typ;
		club=clu;
		nationality=nati;
		price=pri;
		/*br3 = new BufferedReader(new FileReader("Striker.txt"));
		br4 = new BufferedReader(new FileReader("Goal_Keeper.txt"));
		br5 = new BufferedReader(new FileReader("Mid_Fielder.txt"));
		br6 = new BufferedReader(new FileReader("Defender.txt"));
		 String[] line3=new String[50];
		 int i=0;
		 while ((line3[i] = br3.readLine()) != null) 
		 {
			 String [] k = new String[4];
			 k=line3[i].split("  ");
			 Players.add(new player(k[0],k[1],k[2],k[3],k[4])); 
			 i++;
		 }
		 String[] line4=new String[50];
		 while ((line4[i] = br4.readLine()) != null) 
		 {
			 String [] k = new String[4];
			 k=line4[i].split("  ");
			 Players.add(new player(k[0],k[1],k[2],k[3],k[4])); 
			 i++;
		 }
		 String[] line5=new String[50];
		 while ((line5[i] = br5.readLine()) != null) 
		 {
			 String [] k = new String[4];
			 k=line5[i].split("  ");
			 Players.add(new player(k[0],k[1],k[2],k[3],k[4])); 
			 i++;
		 }
		 String[] line6=new String[50];
		 while ((line6[i] = br6.readLine()) != null) 
		 {
			 String [] k = new String[4];
			 k=line6[i].split("  ");
			 Players.add(new player(k[0],k[1],k[2],k[3],k[4])); 
			 i++;
		 }*/
	}
	public String retrive(String Name) throws IOException 
	{
		 /*for(int j =0;j<Players.size();j++) 
			{
				if(Players.get(j).name.contains(Name)) 
				{
					return (Players.get(j).name+"  "+Players.get(j).position+"  "+Players.get(j).club+"  "+Players.get(j).nationality+"  "+Players.get(j).price);
				}
			}*/
		return Name;
	}
}