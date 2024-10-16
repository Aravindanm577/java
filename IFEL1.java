import java.util.Scanner;
class IFEL1{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        if(num>=18)
        {
            System.out.println("eligible");
        }
        else{
            System.out.println("not eligible");
        }
    }
}