package Code;
/**Problem 7
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
 * we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
public class P7 {
    public static void main(String[] args){
        P7 p = new P7();
        System.out.println(p.nth_primenumber(10001));

    }
    public int nth_primenumber(int k){
        int i = 0;
        int ni = 2;
        while(i<k){
            if(largestprimenumber(ni)==ni){
                i++;
                
            }
            ni++;


        }System.out.println(i);
        return ni-1;
    }
    public int largestprimenumber(int n){
        while (n!=smallestfactor(n)) {
                n/=smallestfactor(n);
            }
            

            
        
        return n;

    }
    public int smallestfactor(long number){
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
