public class patternAdd1 {
    public static void main(String[] args) {
        int n=5,i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if((i==(n+1)/2||(j==(n+1)/2&&i==1)||(j==(n+1)/2&& i==n)))
                System.out.print("* ");
                else
                System.out.print("  ");
            } 
        System.out.println();
        }
    } 
}
