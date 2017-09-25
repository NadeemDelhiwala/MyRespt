/**
 * 
 */
package EncapsulateDemo;

/**
 * @author Lenovo
 *
 */
//In Encapsulation we are binding methods with variable
//we want to keep our values as private
public class TestEncapsulation {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       Emp e=new Emp();
       e.setEmpid(1);
       e.setEmpname("Nadeem");
       System.out.println(e.getEmpid());
       System.out.println(e.getEmpname().toString());
	}
	

}
 class Emp
{
   private int empid;
   private String empname;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
   
}
