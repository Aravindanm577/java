public class Funct {
    static double bankBalance=25000;
    public static void deposit(double amt)
    {
        bankBalance+=amt;
        System.out.println("Amount deposited");
        System.out.println("Current Balance"+bankBalance);
    }
    public static void Withdraw(double amt)
    {
        bankBalance-=amt;
        System.out.println("Amount withdraw");
        System.out.println("Current Balance:"+bankBalance);
    }
    public static void fundTransfer(double amt)
    {
        bankBalance-=amt;
        System.out.println("Amount fundTransfered");
        System.out.println("Current Balance"+bankBalance);
    }
    public static double checkBalance()
    {
        return bankBalance;
        
    }
}
