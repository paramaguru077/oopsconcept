/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
abstract class Shape{
    abstract public double area();
}
class Square extends Shape{
      int size;
    public Square (int size){
        this.size=size;
    }
    public double area(){
        return size*4;
    }
}
class Triangle  extends Shape{
     int size;
    public Triangle (int size){
        this.size=size;
    }
    public double area(){
        return size*4;
    }
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	//	Square s1= new Square(3);
	//	Triangle t1=new Triangle(5);
		Shape[] s=new Shape[4];
		s[0]=new Square(5);
		s[1]=new Triangle(7);
		s[2]=new Square(8);
		s[3]=new Triangle(9);
		for(Shape s2:s){
		  System.out.println(s2.area());
		}
		
	}
}
