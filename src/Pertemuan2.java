public class Pertemuan2 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1||j==n||i==j){
                System.out.print("x");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");{
            //int k=5;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i==1||i==n||j==1||i==(n/2)+1){
                    System.out.print("x");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
        }
        System.out.println(" ");{
            //int k=5;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i==1||j==(n/2)+1){
                    System.out.print("x");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
        }
        System.out.println(" ");{
            //int k=5;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i==1||i==(n/2)+1||j==1){
                    System.out.print("x");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
        }
        System.out.println(" ");{
            //int k=5;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i==n||j==1){
                    System.out.print("x");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
        }
        System.out.println(" ");{
            //int k=5;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(j==(n/2)+1){
                    System.out.print("x");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
        }
        System.out.println(" ");{
            //int k=5;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i==j||j==(n-i)+1){
                    System.out.print("x");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
        }
        System.out.println(" ");{
            //int k=5;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if((i <= n / 2 + 1 && (i==j||j==n-i+1)) || (i>n/2+1&&j==n/2+1)){
                    System.out.print("x");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
        }
        System.out.println(" ");{
            //int k=5;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i==j||j==(n-i)+1){
                        if(i<=n/2+1)
                            System.out.print("x");
                        else
                            System.out.print(" ");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
        }
        System.out.println(" ");{
            //int k=5;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(i==j||j==(n-i)+1){
                        if(i<=n/2+1)
                            System.out.print("x");
                        else
                            System.out.print(" ");
                    }
                    else if(j==n/2+1){
                        if(i>=n/2+1)
                            System.out.print("x");
                            else
                                System.out.print(" ");
                        
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
        }
    }
}
