import java.util.Scanner;
class pro3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter A:");
        double a=s.nextDouble();
        System.out.println("enter B:");
        double b=s.nextDouble();
        System.out.println("Enter cal:");
        int cal=s.nextInt();
        switch(cal){
            case 1:
            {
              System.out.println(a+b);
              break;  
            }
            case 2:
            {
              System.out.println(a-b);
              break;  
            }
            case 3:
            {
              System.out.println(a*b);
              break;  
            }
            case 4:
            {
              System.out.println(a/b);
              break;  
            }
            default:
            {

                  System.out.println("nooooo");
                  break;  
                }
            }
        }


    }
    

