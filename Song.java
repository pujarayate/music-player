package collection;

public class Song 
{
	String name;
	String singer;
	String type;
	String movie;
	String writer;
	public Song()
	{
		
	}
public Song(String name,String singer,String type,String movie,String writer)
{
	super();
	this.name=name;
	this.singer=singer;
	this.type=type;
	this.movie=movie;
	this.writer=writer;
	
}
public String toString()
{
	return"[name="+name+",singer="+singer+",type="+type+",movie="+movie+",writer="+writer+"]";
}
public boolean equals(Object o)
{
	Song s=(Song)o;
	if(this.name==s.name && this.singer==s.singer && this.type==s.type && this.movie==s.movie && this.writer==s.writer)
	{
		return true;
	}
	return false;
}
public int hashcode()
{
	return name.hashCode()+singer.hashCode()+type.hashCode()+movie.hashCode()+writer.hashCode();
}
}
