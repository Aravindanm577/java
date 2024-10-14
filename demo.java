import java.util.Scanner;
    class demo {
    public static void main(String args[]){
 
    Scanner scan=new Scanner(System.in);
    int num1=scan.nextInt();
    int num2=scan.nextInt();
    boolean equal=num1==num2;
    if(equal)
    {
        System.out.println("yes");
    }
    else{
        System.out.println("no");
    }
}
}
