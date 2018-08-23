import java.util.Scanner;
class ComplexNumber
{
  public 
  int r,i;
  Scanner sc=new Scanner(System.in);
  public void input()
  {
    System.out.println("enter the value of r");
  r=sc.nextInt();
  System.out.println("enter the value of i");
i=sc.nextInt();
  }
  public void display()
  {
    System.out.println("out");
    System.out.println(r+"+"+i+"i");
  }
}
class Complex
{
  public static void main(String[] args)
  {
    ComplexNumber a=new ComplexNumber();
    a.input();
    a.display();
  }
}