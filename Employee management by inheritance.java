

class Employee
{				//{super class,parent class,base class} 
  private String name;
  private double salary;
    Employee ()
  {
    name = " ";
    salary = 0.0;
  }

  Employee (String n, double s)
  {
    name = n;
    salary = s;
  }

  String getName ()
  {
    return name;
  }

  void setName (String n)
  {
    name = n;
  }

  double getSalary ()
  {
    return salary;
  }
  void raiseSalary (double percent)
  {
    salary = salary + (salary * percent / 100);
  }
}

class Manager extends Employee
{				//{derived class,sub class,child class}

  double bonus;

    Manager (String n, double s, double b)
  {
    super (n, s);
    bonus = b;
  }
  void setBonous (double b)
  {
    bonus = b;

  }
}

public class Main
{
  public static void main (String[]args)
  {
    Employee e1 = new Employee ("Guru", 60000);	// object creation for super class
    Manager m1 = new Manager ("john", 80000.0, 0.0);
      m1.setBonous (2000);
      System.out.println (m1.bonus);
      // Manager is an Employee concept
      Employee e2 =new Manager("siva",58628.4,729.4);
      //creating object Array
      Employee[] employees = new Employee[4];
      employees[0]=new Employee("praveen",76483.0);
      employees[1]=new Employee("sathish",43323.0);
      employees[2]=new Employee("sankar",42323.0);
      employees[3]=m1;
      // using for loop
      for( Employee e:employees){
          System.out.println(e.getName() + " "+ e.getSalary());
      }
  }
}
