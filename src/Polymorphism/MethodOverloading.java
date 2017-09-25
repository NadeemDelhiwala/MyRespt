package Polymorphism;

public class MethodOverloading {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      A obj=new A();
      obj.show();
      obj.show(2);
      obj.show(12.955);
     // System.out.println("Tested"+ob2.show(2));
	}

}
 class A
{
	 public void show()
	 {
		 System.out.println("Testing show  without pararmeters");
	 }
	 public void show(int i)
	 {
		 System.out.println("Testing show with one parameters with int datatype " +i);
	 }
	 public void show(double i)
	 {
		 System.out.println("Testing show with one parameters with double datatype " +i);
	 }
	  
}
