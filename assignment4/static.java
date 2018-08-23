class StaticBlock{
static int num;
static String str;
static{
num = 15;
str = "hello there";
}
public static void main(String args[])
{
System.out.println("Value of num: "+num);
System.out.println("Value of mystr: "+str);
}
}