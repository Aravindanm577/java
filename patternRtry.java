class patternRtry {
    public static void main(String[] args) {
        int n=5,i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(j+i==n+1||i+j<n+1)
                System.out.print("* ");
                else
                System.out.print("  ");
            } 
        System.out.println();
        }
    }  
}
