import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    HashMap<String,String> mp=new HashMap<String,String>();
	    mp.put("Sitanshu","Good");
	    mp.put("Aman","Good");
		System.out.println(mp.get("Aman"));
		System.out.println(mp.size());
		for(String i:mp.keySet())
		{
		    System.out.println(i);
		}
		for(String i:mp.values())
		{
		    System.out.println(i);
		}
		for(String i:mp.keySet())
		{
		    System.out.println("Key: "+i+" Values: "+mp.get(i));
		}
		mp.remove("Aman");
		mp.clear();
	}
}
