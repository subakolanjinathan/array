public class Ainterbc
{
public static void main(String args[])
{
int a[]={7,5,1,5,9};
int b[]={8,1,2,6,3};
int c[]={0,5,9,4,1};
for(int i=0;i<a.length;i++)
{
for(int j=0;j<b.length;j++)
{
for(int k=0;k<c.length;k++)
{
if(a[i]==b[j])
{
if(b[j]==c[k])
{
System.out.println(a[i]);
}
}
}
}
}
}
}
