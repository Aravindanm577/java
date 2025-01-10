public class patternAdd {
    public static void main(String[] args) {
        int n=5,i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(j==(n+1)/2||i==(n+1)/2)
                System.out.print("* ");
                else
                System.out.print("  ");
            } 
        System.out.println();
        }
    }  
}
