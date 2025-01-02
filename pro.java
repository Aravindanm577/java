import java.util.Scanner;
class pro {
    public static void main(String args[])
    {Scanner s=new Scanner(System.in);
        System.out.println("Enter A value:");
        int a=s.nextInt();
       
        if(a>0)
        {
            System.out.println("posstive");
          }
        
        else if(a<0)
        {
            System.out.println("negative");  
        }
        else{
            System.out.println("0");
        }
    }
    
}

