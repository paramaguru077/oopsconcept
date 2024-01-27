/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Knowing{
    private String name;
    private int age;
    private String qulification;
    
    public Knowing(String n,int a,String q){
        name=n;
        age=a;
        qulification=q;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getQulification(){
        return qulification;
    }
    
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Knowing obj=new Knowing("guru",23,"B.E Cse");
		System.out.println(obj.getName());
	}
}
