package Code;
/**Problem 6
 * The sum of the squares of the first ten natural numbers is 385
 * The square of the sum of the first ten natural numbers is 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 
 * 3025−385=2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * 
 */
public class P6 {
    public static void main(String[] args) {
        P6 p = new P6();
        int diff = p.square_of_sum(100)-p.sum_of_square(100);
        System.out.println("answer: "+ diff);

        
    }
    public int square_of_sum(int x){
        int sum = (x*(x+1))/2;
        return sum*sum;

    }
    public int sum_of_square(int x) {
       return x*(x+1)*(2*x+1)/6;
    }
    
}
