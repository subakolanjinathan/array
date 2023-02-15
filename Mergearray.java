public class Mergearray
{
public static void main(String args[])
{
int a[]={7,3};
int b[]={1,4,9};
int x[]=new int[a.length+b.length];
for(int i=0;i<a.length;i++)
{
a[i]=x[i];
}
for(int i=0;i<b.length;i++)
{
x[a.length+1]=b[i];
}
for(int i=0;i<x.length;i++)
{
System.out.println(x[i]);
}
}
}


