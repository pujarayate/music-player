package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SongDriver
{
	static ArrayList<Song> total=new ArrayList<>();
	static ArrayList<Song> playlist=new ArrayList<>();
	//private static ArrayList<Song> playlist;
	
	public static void main(String[] args) {
		
		List<Song>sad=new ArrayList<>();
		sad.add(new Song("kolavari di","Dhanush","sad","3","Aniruth"));
		sad.add(new Song("moye moye","Teya Teya","sad","STR Factory","-"));
		sad.add(new Song("Bewafa","Imran khan","sad","-","Imran khan"));
		sad.add(new Song("Jag suna suna","rahat fatech ali khan","sad","om shanti om","kummar"));
		sad.add(new Song("Tadap Tadap","kk","sad","hum dil de chuke sanam","mehboob"));
		sad.add(new Song("phir bhi tumko chahunga","Arjit singh","sad","Half girlfrieng","manoj muntashir"));
		
		List<Song> happy=new ArrayList<>();
		
		happy.add(new Song("zingat","Ajay Atul","Happy","sairat","Ajay Atul"));
		happy.add(new Song("Dolby waliya","Ajay Atul","Happy","jau dya na balasaheb","Ajay Atul"));
		happy.add(new Song("bolo tarara","Dilher Mehndi","Happy","five Tara","Dilher Mehndi"));
		happy.add(new Song("chandra","shreya ghoshal","happy","chanramukhi","guru thakur"));
		happy.add(new Song("Rinkiya ke papa","manoj tiwary","happy","mobilewali","manoj tiwary"));
		happy.add(new Song("wajle ki bara","Bela shende","happy","shimna","anand shinde"));
		
		List<Song> moti=new ArrayList<>();
		
		moti.add(new Song("shiv tandav stotrm","shankar mahadevan","motivational","-","ravan"));
		moti.add(new Song("hanuman chalisa","gulshan kumar","motivational","-","tulsi das"));
		moti.add(new Song("ram raksha","sadhana sargam","motivational","-","budha kaushik"));
		moti.add(new Song("kar har maidan fateh","shreya ghoshal","motivational","sanju","vikram"));
		moti.add(new Song("Brother Anthem","AjayAtul","motivational","Brothers","vishal dadlani"));
		moti.add(new Song("chale chalo","A R Rehman","motivational","lagan","javed akhatar"));
		
		total.addAll(happy);
		total.addAll(sad);
		total.addAll(moti);
		removeDupSong();
		
		//searchByName("abc");
		//searchByType("motivational");
		
		searchByName("chandra");
		searchBySinger("Ajay Atul");
		addSongToPlayList("chale chalo");
		addSongToPlayList("kesariya");
		
		
}
	public static void removeDupSong()
	{
		HashSet<Song> hs=new HashSet<>(total);
		total=new ArrayList<>(hs);
		
	}
	public static void searchByName(String name)
	{
		for(Song Song:total)
		{
			if(Song.name.equalsIgnoreCase(name))
			{
				System.out.println(("Song Found"));
				System.out.println(Song);
				return;
			}
		}
		System.out.println("Song not found");
	}
	
	public static void searchBySinger(String singer)
	{
		for(Song Song:total)
		{
			if(Song.singer.equalsIgnoreCase(singer))
			{
				System.out.println(("Song Found"));
				System.out.println(Song);
				return;
			}
		}
		System.out.println("Song not found");
	}
	
	public static void searchByType(String type)
	{
		boolean flag=false;
		for(Song Song:total)
		{
			if(Song.type.equalsIgnoreCase(type))
			{
				System.out.println(Song);
				flag=true;
			}
		}
		if(!flag)
		{
			System.out.println("Song not found!");
		}
	}
	public static void addSongToPlayList(String name)
	{
		for(Song Song:total)
		{
			if(Song .name.equalsIgnoreCase(name))
			{
				if (!(Collections.frequency(playlist, Song)>=0)) {
					playlist.add(Song);
					System.out.println("Song added");
					System.out.println(playlist);
					
				}
			
				else
				{
					System.out.println("song already present in the playlist !");
				}
				return;
			}
			
			
			
		}
		System.out.println("song not found in db");
		Collections.shuffle(playlist);
		System.out.println(playlist);
		
		
	}
	
	

}
