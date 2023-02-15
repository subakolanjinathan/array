public class Countno
{
public static void main(String args[])
{
int a[]={7,5,3,5,9};
int search=5;
int count=0;
for(int i=0; i<a.length; i=i+1)
{
if(a[i]==search)
{
count=count+1;
}
}
System.out.println(search+"present in "+count+"times");
}
}
