
import java.util.Scanner;
public class pro5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter name:");
        String name=s.nextLine();
        System.out.println("enter ph.no:");
        long num=s.nextLong();
        System.out.println("Enter email:");
        String email=s.next();
        System.out.println("Enter pan no:");
        String pan=s.next();
        System.out.println("Enter adhaar:");
        long adhaar=s.nextLong();
        System.out.println("Enter age:");
        byte age=s.nextByte();
        char ch;
        if(age>=18){
          System.out.println("Account no:"+7857878565486L);
          System.out.println("IFSC code:hfj8");
          System.out.println("EBranch:Natrampalli");
          System.out.println("*****************************************");
          do{
          System.out.println("1.Deposit");
          System.out.println("2.Withdraw");
          System.out.println("3.fund Transfer");
          System.out.println("4.chek Balance");
          System.out.println("enter case:");
          byte inp=s.nextByte();
          switch(inp){
            case 1:
            { 
              System.out.println("enter Amount");
              Funct.deposit(s.nextDouble());
              break;
            }
            case 2:
            {
              System.out.println("enter Amount");
              Funct.Withdraw(s.nextDouble());
              break;
            }
            case 3:
            {
             System.out.println("enter Amount");
              Funct.fundTransfer(s.nextDouble());
              break;
            }
            case 4:
            {
              System.out.println("your balance:"+Funct.checkBalance());
            }
          
           }
            System.out.println("process Again");
           System.out.println("press Y for continue or N for for Exit:");
            ch=s.next().charAt(0);}
        while(ch=='y'|| ch=='Y');}
        else{
          System.out.println("invalid");
        }
        }
    }
