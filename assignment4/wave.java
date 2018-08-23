import java.util.Scanner;
class Waveform
{
  public static void main(String args[])
  {
    int i,j,n=10,t;
    int ar[]=new int[10];
    System.out.println("enter elements");
    Scanner sc=new Scanner(System.in);
    for(i=0;i<n;i++)
    {
      ar[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
      for(j=0;j<n-i-1;j++)
      {
        if(ar[j]>ar[j+1])
        {
          t=ar[j];
          ar[j]=ar[j+1];
          ar[j+1]=t;
        }
      }
    }
    i=0;
    while(i<n)
    {
      t=ar[i];
      ar[i]=ar[i+1];
      ar[i+1]=t;
      i=i+2;
    }
    System.out.println("elements in waveform are");
  for(i=0;i<n;i++)
  {
    System.out.print(ar[i]+ " ");
  }
  }
}