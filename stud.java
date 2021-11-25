/*create a class “Student” that would contain enrollment No, name, and gender andmarks as instance variables and count as static variable which stores the count of theobjects; constructors and display(). Implement constructors to initialize instance variables. Also demonstrate constructor chaining.Create objects of class “Student” and displays all values of objects*/

class Student
{
	private String name,eno,gender;
	private int[] marks;
	private static int count=0;
	Student(){this("","","",new int[]{0,0});
		
}
Student(String eno,String name,String gender,int[] marks)
{
		this.eno=eno;
		this.name=name;
		this.gender=gender;
		this.marks=marks;
		count++;
}
	
public void display()
{
		System.out.println("Enrollment no. -->"+eno);
		System.out.println("Name           -->"+name);
		System.out.println("Gender         -->"+gender);
		for(int mark: marks)
		{
			System.out.println("Marks          -->"+mark);
		}
		System.out.println("Total Students -->"+count);
	}
}
public class stud
{
	public static void main(String a[])
	{
			Student s= new Student();
			s.display();
			Student s2= new Student("E001","Smit","Male",new int[]{100,90,80});
			s2.display();
			Student s3= new Student("E002","Jenish","Male",new int[]{80,70,76});
			s3.display();
		
	}
}
