class patternSq {
    public static void main(String[] args) {
        int n=5,i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(j==1||i==1||i==n||j==n)
                System.out.print("* ");
                else
                System.out.print("  ");
            } 
        System.out.println();
        }
    } 
}
