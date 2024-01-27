/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
 abstract class Member{
    private String name;
    abstract void welcomeMessage();
}
class Student extends Member{
    void welcomeMessage(){
        System.out.println("Hello Student");
    }
}
class Teacher extends Member{
    void welcomeMessage(){
        System.out.println("Hello Teacher");
    }
}
public class AbstractDemo
{
	public static void main(String[] args) {
		Student s1 =new Student();
		Teacher t1=new Teacher();
		Member m1= new Student(); // we cannot create object for abstract class
		Member[] m = new Member[4];
		m[0]=new Student();
		m[1]=new Student();
		m[2]=new Student();
		m[3]=new Teacher();
		for(Member m2:m ){
		    m2.welcomeMessage();
		}
	}
}
