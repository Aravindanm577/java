import java.util.Scanner;
class IFEL2 {
    public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    if(num<50)
    {
        System.out.println("you need to improve");
    }
    else if(num>=50 && num<=70)
    {
        System.out.println("Good job!");
    }
    else 
    {
        System.out.println("Excellent");
    }
}   }
