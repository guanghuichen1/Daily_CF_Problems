import java.util.Scanner;

public class D1898_gh123 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int[]a=new int[n];
            int[]b=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i]=sc.nextInt();
            }
            long max=Long.MIN_VALUE;
            long min=Long.MAX_VALUE;
            long ans=0;
            for (int i = 0; i < n; i++) {
                ans+=Math.abs(a[i]-b[i]);
                max=Math.max(max, Math.min(a[i], b[i]));
                min=Math.min(min, Math.max(a[i], b[i]));
            }
            if(max>min){
                System.out.println(ans+2*(max-min));
            }else{
                System.out.println(ans);
            }
        }
        sc.close();
    }
}
