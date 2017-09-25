/**
 * 
 */
package Cusors_in_Java;

import java.util.Vector;

/**
 * @author Lenovo
 *
 */
public class VectorDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	 	// TODO Auto-generated method stub
            Vector _vector=new Vector(25);
            System.out.println("Default initial capacity is :"+_vector.capacity());
            for (int i = 0; i <=10; i++)
            {
				System.out.println(i);
				_vector.addElement(i);
			}
            _vector.addElement("text");
            System.out.println("Adding after intial completion capacity:"+_vector.capacity());
            System.out.println(_vector);
	}

}
