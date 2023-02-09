package Code;
/**Problem 7
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
 * we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
public class P7 {
    public static void main(String[] args){
        P7 p = new P7();
        System.out.println(p.getnthprime(10));

    }
    public long getnthprime(int n){
        int i=1;
        int h=2;
        while(i<=n){
            if(largestprimenumber(h)==h){
                i++;
            }
            h++;

        }
        return h-1;
    }


    public long largestprimenumber(int c){
        while(c!=smallestfactor(c)){
            c/=smallestfactor(c);

        }
        return c;
        

    }

    public int smallestfactor(int k){
        boolean i = true;
        int x = 2;
        while(i){
            if(k%x==0){
                i = false;
            } else {
                x++;
            }
        }
        return x;

    }
}