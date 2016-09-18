class Student
{
	int sno;
	String sname;
	float marks;
	static String crse;
	static 
	{
		
		System.out.println("i love java coding ");
                System.out.println("hi this is mayank");
                System.out.println("hi this is mayank");
		System.out.println("yo baby how r you");
		crse="JAVA";

	}
    Student(int sno,String sname,float marks)
	{
		System.out.println("sno="+sno+"   "+"sname="+sname+"  "+"marks="+marks+"  "+"crse="+crse);
	}



}
class StuInfo 
{
	public static void main(String[] args) 
	{
		
		Student s1=new Student(1,"Priyanka",89.65f);
		Student s2=new Student(2,"Nashra",99.65f);
		Student s3=new Student(3,"Mayank",89.65f);
    }
}
