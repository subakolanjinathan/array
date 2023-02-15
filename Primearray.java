public class Primearray
{
public static void main(String args[])
{
int a[]={28,30,29,6,38,50};
for(int i=0;i<a.length;i++)
{
boolean flag = false;
for(int j=2;j<a[i];j++)
{
if(a[i]%j==0)
{
flag=true;
}
}
if(flag)
{
System.out.println("not prime "+a[i]);
}
else
{
System.out.println("  prime   "+a[i]);
}
}
}
}
