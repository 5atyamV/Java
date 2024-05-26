public class abcpattern {
    
    public static void charprymid(int n ){
       
        for(int i =0; i<n; i++){
            //num
            for(char j ='A'; j<='A'+i; j++){
            System.out.print(j);
            
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        charprymid(5);
    }
}
