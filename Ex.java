class Exp
{
public static void main(String ar[])
{
int a[][]=new int[3][];
a[0]=new int[2];
a[1]=new int[5];
a[2]=new int[3];
int i,j,k=1;
for(i=0;i<3;i++)
{
for(j=0;j<a[i].length;j++)
{
a[i][j]=k++;
}
}
System.out.println("Values are");
for(i=0;i<3;i++)
{
for(j=0;j<a[i].length;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
}
}