/**
 * 
 */
package Serizable;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Lenovo
 *
 */
public class Serializable {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		// TODO Auto-generated method stub
      Save objsave=new Save();
      objsave.i=12;
      objsave.name="Nadeem";
      Save objsave1=new Save();
     // objsave1.i=5;
      //objsave1=objsave;
       File f=new File("D:\\ITELEARN\\selenium1.txt");
       FileOutputStream fos=new FileOutputStream(f);
       ObjectOutputStream dos=new ObjectOutputStream(fos);
       dos.writeObject(objsave);
       	System.out.println("Object Written successfully...!!");
       FileInputStream fis=new FileInputStream(f);
       ObjectInputStream objfis=new ObjectInputStream(fis);
        Save objsavein=(Save)objfis.readObject();
        System.out.println("Value of object 1:"+objsavein.i);
        System.out.println("Value of object 1:"+objsavein.name);
	}

}

class Save implements java.io.Serializable
{
	int i;
	String name;
}
