public class Aunionbc
{
public static void main(String args[])
{
int a[]={10,6,4,5,9};
int b[]={8,1,3,7,2};
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
for(int j=i+1;j<x.length;j++)
{
if(x[i]==x[j])
{
x[i]=0;
}
}
}
for(int i=0;i<x.length;i++)
{
if(x[i]!=0)
{
System.out.print(x[i]+" ");
}
}
}
}
