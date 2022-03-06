package Code;
/** 
 * Problem 5
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class P5 {
    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();
        P5 p = new P5();
        System.out.println(p.number(20));
        long endtime = System.currentTimeMillis();
        System.out.println(endtime-starttime+"ms");
    }
    public long number(int x){
        int a = 2;
        long num = 1;
       while(a<=x){
            if(num%a==0){
                System.out.println(num);
                   a++;
            } else {
                   num++;
                   a=2;

            }

       }
       return num;
        
        

    }
}
