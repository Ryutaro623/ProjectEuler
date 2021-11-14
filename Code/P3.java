package Code;

public class P3 {
    public static void main(String[] args) {
        P3 h = new P3();
       System.out.println(h.largestprimenumber(600851475143L));
       


    }
    public long largestprimenumber(long n){
        while (n!=smallestfactor(n)) {
                n/=smallestfactor(n);
            }
            

            
        
        return n;

    }
    public static int smallestfactor(long number){
        boolean i=true;
        int x = 2;
        while(i){
            if(number%x==0){
                i = false;

            } else{
                x++;
            }
            
        }
        return x;

    }
    
}
