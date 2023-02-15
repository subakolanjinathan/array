public class Aunion
{
public static void main(String args[])
{
int a[]={7,3,1,4,9};
int b[]={2,4,6,3,10};
int x[]=new int[a.length+b.length];
for(int i=0;i<a.length;i++)
{
x[i]=a[i];
}
for(int i=0;i<b.length;i++)
{
x[a.length+i]=b[i];
}
for(int i=0;i<x.length;i++)
{
for(int j=i+1;i<x.length;i++)
{
if(x[i]==x[j])
{
x[i]=0;
}
}
}
for(k=0;x.length;k++)
{
if(x[i]!=0)
{
System.out.println(x[i]);
}
}
}
}
