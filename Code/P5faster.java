package Code;

public class P5faster {
    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();
        P5faster p = new P5faster();
        p.findfactor(20);
        long endtime = System.currentTimeMillis();
        System.out.println(endtime-starttime+"ms");
    }
    public void findfactor(int x){
        
        long gg = 1;
        int primenumber;
        for(int i = 2;i<=x;i++){
            boolean is_it_smaller_than_x = true;
            if(largestprimenumber(i)==i){
                int exp = 1;
                primenumber = largestprimenumber(i);
                
                while(is_it_smaller_than_x){
                    if(Math.pow(primenumber, exp)<x){
                        exp++;

                    } else {
                        is_it_smaller_than_x = false;
                        exp--;

                    }
                }
                
                System.out.println("prime_number:"+primenumber+"^"+exp);
                gg*=(long)Math.pow(primenumber, exp);
                

            }
        }System.out.println("answer:"+gg);
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
