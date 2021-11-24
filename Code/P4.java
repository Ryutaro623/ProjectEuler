package Code;

public class P4 {

    public static void main(String[] args) {
        P4 p = new P4();
        System.out.println(p.palindromic());
    }
    public int palindromic() {
        int p;
        int lastvalue = 0;
        String value;
        String revalue;
        for(int i = 100; i < 100; i++){
            for(int n = 100; n < 100; n++){
                p = i*n;
                value=String.valueOf(p);
                revalue = reverse(p);
                if(value.equals(revalue)){
                    if(p>lastvalue){
                        lastvalue = p;
                    }
                }

            }
            
        }
        return lastvalue;
    }
    public static String reverse(int number){
        String reversewords = "";
        String k = String.valueOf(number);
        for(int w = k.length()-1; w>=0; w--){
            reversewords += k.charAt(w);

        }
        return reversewords;
    }
    
}
