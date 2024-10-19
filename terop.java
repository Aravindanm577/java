import java.util.Scanner;
class terop {
    public static void main(String args[])
    {Scanner s=new Scanner(System.in);
        System.out.println("Enter A value:");
        int a=s.nextInt();
        System.out.println("Enter B value:");
        int b=s.nextInt();
        
        String result=a<b?"b is greater":"a is greater";
        System.out.println("result:"+result);
    }
    
}
