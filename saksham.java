class employee
{
	int id;
	int salary;
	String name;
public void printdetails()
{
	System.out.println("My id is"+id);
	System.out.println("My name is"+name);
}
public int getsalary()
{
	return salary;
}
}
public class saksham
{
	public static void main(String[] args)
{
	System.out.println("This is our custom class");

employee harry = new employee();
employee john = new employee();
harry.id=12;
harry.salary=34;
harry.name="codewithharry";
john.id=74;
john.salary=741;
john.name="PAPA";
			harry.printdetails();
			john.printdetails();
int salary =  john.getsalary();
	System.out.println(salary);
}}