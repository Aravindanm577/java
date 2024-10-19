import java.util.Scanner;
class IFEL4 {
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);   
    String a=s.nextLine();
    if(a.equals("red")){
        System.out.println("stop");
    }
    else if(a.equals("yellow"))
    {
        System.out.println("get ready");
    }
    else if(a.equals("green"))
    {
        System.out.println("go");
    }}
}
