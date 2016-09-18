class Student
{
	int sno;
	String sname;
	float marks;
	static String crse;
	static 
	{
		System.out.println("Static Block Called");
		crse="JAVA";

	}
    Student(int sno,String sname,float marks)
	{
		/*System.out.println("Static Block Called");
		System.out.println("Static Block Called");
		System.out.println("Static Block Called");
		System.out.println("Static Block Called");
		System.out.println("Static Block Called");*/
		System.out.println("sno="+sno+"   "+"sname="+sname+"  "+"marks="+marks+"  "+"crse="+crse);
	}



}
class StuInfo 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World0
		Student s1=new Student(1,"Priyanka",89.65f);
		Student s2=new Student(2,"Nashra",99.65f);
		Student s3=new Student(3,"Mayank",89.65f);
    }
}
