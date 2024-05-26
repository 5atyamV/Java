public class pattren15 {

    public static void charprymid(int n ){
        
        for(int i =0; i<n; i++){
            //num
            for(char ch = 'A'; ch<='A'+(n-i-1);ch++){
            System.out.print(ch);
            
            
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        charprymid(5);
    }
    
}
