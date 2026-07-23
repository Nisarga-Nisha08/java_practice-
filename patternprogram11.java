public class patternprogram11 {
    public static void main(String [] args){
        int i,j;
        int n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i+j<=9){
                    System.out.print("0");
                }
                System.out.print(i+j+ " ");
            }
            System.out.println();
        }

    }
    
}
