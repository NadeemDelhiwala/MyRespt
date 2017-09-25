/**
 * 
 */
package Cusors_in_Java;

import java.util.Stack;

/**
 * @author Lenovo
 *
 */
public class StackDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	  	// TODO Auto-generated method stub
          Stack sk=new Stack();
          sk.push("A");
          sk.push("B");
          sk.push("C");
          System.out.println("Found objects are:"+sk);
          System.out.println(sk.search("C"));
          System.out.println(sk.search("P"));
	}

}
