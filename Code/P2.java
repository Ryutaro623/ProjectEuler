package Code;

public class P2 {
    public static void main(String[] args) {
        int previous= 1;
        int current =0;
        int fibonacci = 0;
        int sum = 0;
        while (previous<=4000000) {
            fibonacci =  current+ previous;
           current = previous;
           previous = fibonacci;
           if(previous%2 == 0){
               sum += previous;

           }
        }
        System.out.println(sum);
    }
    
}
