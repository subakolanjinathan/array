public class Nonrep
{
public static void main(String args[])
{
int a[]={5,6,7,8,7,6,5};
abc:for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]!=a[j])
{
System.out.println(a[i]);
break abc;
}
}
}
}
}
