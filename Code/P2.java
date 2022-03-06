package Code;
/**Problem 2
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
 * By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
 * find the sum of the even-valued terms.
 * 
 */
public class P2 {
    public static void main(String[] args) {
        int previous= 1;
        int current =0;
        int fibonacci = 0;
        int sum = 0;
        while (previous<=4000000) {
            fibonacci =  current+ previous;
            System.out.println(fibonacci);
           current = previous;
           previous = fibonacci;
           if(previous%2 == 0){
               System.out.println("even number: "+previous);
               sum += previous;

           }
        }
        System.out.println(sum);
    }
    
}
