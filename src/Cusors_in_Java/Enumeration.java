/**
 * 
 */
package Cusors_in_Java;

import java.util.Vector;
import java.util.concurrent.SynchronousQueue;

/**
 * @author Lenovo
 *
 */
public class Enumeration {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
          Vector e=new Vector();
          for (int i = 0; i <=10; i++)
          {
			 System.out.println(i);
			 e.addElement(i);
		  }
          System.out.println(e);
          java.util.Enumeration num=e.elements();
          while (num.hasMoreElements()) {
			Integer j = (Integer) num.nextElement();
			//System.out.println( j);
			if (j%2==0) 
			{
			 System.out.println("Inside Cusor"+j);	
			}
			System.out.println("Object found at cusor:"+e);
		}
	}

}
