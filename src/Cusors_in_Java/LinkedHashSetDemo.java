package Cusors_in_Java;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo 
{
  public static void main(String[] args) 
  {
	     LinkedHashSet hs=new LinkedHashSet();
         hs.add("A");
         hs.add("B");
         hs.add(null);
         hs.add("C");
         hs.add("D");
         hs.add("E");
         System.out.println("Added new object :"+hs.add("S"));
         System.out.println(hs);

	
}
}
