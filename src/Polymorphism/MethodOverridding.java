package Polymorphism;

public class MethodOverridding {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     D obj=new D();
     obj.show();
     obj.show(12);
     obj.show(12.955);
//     obj.show();
    
	}

}
 class C
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
class D extends C
{
	public void show()
	{
		System.out.println("Showing Method from D");
	}
}