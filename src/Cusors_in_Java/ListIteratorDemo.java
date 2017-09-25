/**
 * 
 */
package Cusors_in_Java;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author Lenovo
 *
 */
public class ListIteratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     LinkedList llst=new LinkedList();
     llst.add("Sachin");
     llst.add("Soraubh");
     llst.add("Rahul");
     llst.add("VVS");
     System.out.println("Added object are:"+llst);
     ListIterator lltr=llst.listIterator();
     while (lltr.hasNext()) {
		String object = (String) lltr.next();
		if (object.equals("Rahul"))
		{
			System.out.println("Found"+object);
		  lltr.remove();	
		}
		else if(object.equals("Sachin"))
		{
			System.out.println("Found"+object);
			lltr.add("Nadeem");
			
		}
		else if(object.equals("VVS"))
		{
            lltr.set("Kiran");			
		}
		
	}
  System.out.println("Found reframed"+llst);
	}

	

}
