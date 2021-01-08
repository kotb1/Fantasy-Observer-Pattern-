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
	public String points;
	public void Add_player() throws IOException{};
	public player(String nam1,String typ,String clu,String nati,String pri) throws IOException
	{
		name=nam1;
		position=typ;
		club=clu;
		nationality=nati;
		price=pri;
	}
	public player(String nam1,String typ,String clu,String nati,String pri,String point)
	{
		name=nam1;
		position=typ;
		club=clu;
		nationality=nati;
		price=pri;
		points = point;
	}
	public String retrive(String Name) throws IOException 
	{
		return Name;
	}
}