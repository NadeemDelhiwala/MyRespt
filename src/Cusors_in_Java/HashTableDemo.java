/**
 * 
 */
package Cusors_in_Java;

import java.util.HashSet;

/**
 * @author Lenovo
 *
 */
public class HashTableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
           HashSet hs=new HashSet();
           hs.add("A");
           hs.add("B");
           hs.add(null);
           hs.add("C");
           hs.add("D");
           hs.add(null);
           System.out.println("Added new object :"+hs.add("S"));
           System.out.println(hs);
           
	}

}
