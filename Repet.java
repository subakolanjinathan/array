public class Repet
{
public static void main(String args[])
{
int a[]={7,5,4,6,2,7};
abc:for(int i=0; i<a.length; i=i+1)
{
for(int j=i+1; j<a.length; j=j+1)
{
if(a[i]==a[j])
{
System.out.println(a[i]);
break abc;
}
}
}
}
}



