public class Replacedig
{
public static void main(String args[])
{
int a[]={5,2,8,9,1};
int b=8;
int c=0;
for(int i=0;i<a.length;i++)
{
if(a[i]==b)
{
a[i]=c;
}
System.out.println(a[i]);
}

}
}
