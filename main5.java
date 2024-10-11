import java.util.Scanner;

class main5 {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String n=s.nextLine();
        double sco=s.nextDouble();
        s.nextLine();
        String dep=s.nextLine();
        System.out.println("name:"+n);
        System.out.println("score:"+sco/10);
        System.out.println("department:"+dep);

    }
}
