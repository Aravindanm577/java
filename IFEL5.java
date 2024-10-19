import java.util.Scanner;
class IFEL5 {
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter your salary:");
        int salary=s.nextInt();
        System.out.println("entre your age:");
        int age=s.nextInt();
        if(salary>=20000||age<25)
        {
            System.out.println("eligible for loan");
            System.out.println("enter your loan:");
            int loan=s.nextInt();        
            if(loan<=50000)
            {
                System.out.println("loan available");
            }
        else{
            System.out.println("not available");
        }    
        }
    }
    
}
