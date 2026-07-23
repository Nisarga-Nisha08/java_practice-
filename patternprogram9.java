public class patternprogram9 {
     public static void main(String [] args)
    {

        int i;
        int j;
        int n=5;
        for(i=1;i<=n;i++){
            {
                
                for(j=1;j<=n;j++){
                    if(i*j<=9){
                    System.out.print("0");
                }
                    System.out.print(j*i+ " ");

                }
                System.out.println();
            }

        }
    }
    
    
}
