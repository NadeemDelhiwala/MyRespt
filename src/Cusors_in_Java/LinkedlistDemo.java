/**
 * 
 */
package Cusors_in_Java;

import java.util.LinkedList;

/**
 * @author Lenovo
 *
 */
public class LinkedlistDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	  	// TODO Auto-generated method stub
      LinkedList ls=new LinkedList();
       ls.add("A");
       ls.add(30);
       ls.add("Durga");
       System.out.println(ls);
       ls.set(0,"Software");
       System.out.println("After replacing"+ls);
       ls.add(0,"Nadeem");
       System.out.println("After Adding {0}"+ls);
       ls.removeLast();
       System.out.println("After removal"+ls);
       ls.addFirst("Tested");
       System.out.println("After Adding First:"+ls);
       System.out.println("Finally"+ls);
	}

}
