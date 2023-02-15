public class Multiarray
{
public static void main(String args[])
{
int a[]={7,5,4,6,2,3};
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;i++)
{
if(a[i]*a[j]==20)
{
System.out.println(a[i]+     +a[j]);
}
}
}
}
}
