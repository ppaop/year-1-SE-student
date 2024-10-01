import java.util.Scanner;
public class GCD_LCM_finder{
    public static int gcd(int a,int b){
        int x=Math.max(a,b);
        int y=Math.min(a,b);
        while (true){
            int n= x%y;
            if (n!=0){
                x=y;y=n;
            }else return y;
        }
    }
    public static int lcm(int a,int b){
        return a*b/(gcd(a,b));
    }
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        int a = kb.nextInt();
        int b= kb.nextInt();
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));
    }
}


