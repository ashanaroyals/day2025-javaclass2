import java.util.Scanner;
class Strongnumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int original=n;
int sum=0;
while(n!=0)
   {
     int  d=n%10;
      sum+=factorial(d);
      n/=10;
    }
if(sum==original)
   {
      System.out.println("strong number");
     }
else
   {
     System.out.println("not strong number");
  }
}
static int factorial (int  n)
   {
      int fact=1;
      for(int i=1;i<=n;i++)
      {
           fact*=i;
       }
       return  fact ;
   }


}