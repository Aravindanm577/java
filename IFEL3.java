import java.util.Scanner;
class IFEL3 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int n3=s.nextInt();
        int n4=s.nextInt();
        int n5=s.nextInt();

        int total=n1+n2+n3+n4+n5;

        int avg=total/5;
        if(avg<35)
        { System.out.println("addition class");}
        else{
            System.out.println("good job");
        }

    }
    
}
