public class Findmode
{
public static void main(String args[])
{
int a[]={9,3,1,8,3,6};
for(int i=0; i<a.length; i++)
{
for(int j=i+1; j<a.length; j++)
{
if(a[i]==a[j])
{
System.out.println("mode is:"+a[j]);
}
}
}
}
}


