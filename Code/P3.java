package Code;
/**Problem 3
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
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
