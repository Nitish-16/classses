import java.util.Scanner;
class LargestNumber
{
  public static void main(String args[])
  {
    int i,l1,l2;
    Scanner sc=new Scanner(System.in);
    int ar[]=new int[5];
    System.out.println("enter the elements");
    for(i=0;i<ar.length;i++)
    {
      ar[i]=sc.nextInt();
    }
    l1=ar[0];
    for(i=0;i<ar.length;i++)
    {
      if(ar[i]>l1)
      {
        l1=ar[i];
      }
    }
    l2=ar[0];
    for(i=1;i<ar.length;i++)
    {
      if(ar[i]>l2 && ar[i] < l1)
      {
        l2=ar[i];
      }
    }
    System.out.println("sec largest no in array " +l2);
  }
}