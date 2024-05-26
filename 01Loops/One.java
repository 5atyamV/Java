/**
 * One
 */
public class One {

    public static void sqaure(int n){
        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                System.out.print("*");
        }
        System.out.println();
    }
    }

    public static void halfTriangle(int x){
        for(int i =1; i<=x; i++){
            for(int j =1; j<=i; j++){
                System.out.print("*");
        }
        System.out.println();
    }
}

    public static void NumberTriangle(int x){
        for(int i =1; i<=x; i++){
            for(int j =1; j<=i; j++){
                System.out.print(j);
        }
        System.out.println();
    }

    }

    
    public static void NumberTriangleTwo(int x){
        for(int i =1; i<=x; i++){
            for(int j =1; j<=i; j++){
                System.out.print(i);
        }
        System.out.println();
    }

    }

    public static void traiangle(int n){
        for(int i =0; i<n; i++){
            for(int j=1; j<n-i+1; j++){
                System.out.print("*_");

            }
            System.out.println();
        }
    }

    public static void prymid(int n){
        for(int i =0; i<n; i++){
            
            for(int j=0; j<n-i-1; j++){
                System.out.print("_");
            }

            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            for(int j=0; j<n-i-1; j++){
                System.out.print("_");
            }

            System.out.println();
    }

}




    public static void main(String[] args) {
        int s = 5;
        //sqaure(s);
       // halfTriangle(s);
       //NumberTriangle(s);
       //NumberTriangleTwo(s);
      // traiangle(s);
      //prymid(s);
       

       
     
    }
}