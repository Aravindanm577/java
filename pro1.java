import java.util.Scanner;
class pro1 {
    public static void main(String args[])
    {Scanner s=new Scanner(System.in);
        System.out.println("Enter A value:");
        char d=s.next().charAt(0);
       
        if(d>='a' && d<='z')
        {
            System.out.println("Alpa");
          }
        
        else if(d>='0' && d<='9')
        {
            System.out.println("digit");  
        }
        else{
            System.out.println("charect");
        }
    }
    
}

