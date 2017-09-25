package Cusors_in_Java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo 
{
  public static void main(String[] args) 
  {
	ArrayList l=new ArrayList();
	for (int i = 0; i <=10; i++) 
	{
	 l.add(i);	
	}
	System.out.println(l);
	Iterator itr=l.iterator();
	while (itr.hasNext())
	{
		Integer j = (Integer) itr.next();
		if (j%2==0)
		{
		  System.out.println("Value is"+j);	
		} else 
		{
			  System.out.println("Value is being removed"+j);
			  itr.remove();
		}
	}
	System.out.println(l);
	  
  }
}
