package Code;

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
                   a++;
            } else {
                   num++;
                   a=2;

            }

       }
       return num;
        
        

    }
}
