https://codeforces.com/problemset/submission/1163/259293719
import java.util.Scanner;

public class B1163 {
    public static void main(String[] args) {
        int N=(int)1e5+10;
        int[]f=new int[N];
        int max=Integer.MIN_VALUE;
        int[]cnt=new int[N];
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=-1;
        for (int i = 1; i <=n; i++) {
            int tem=sc.nextInt();
            cnt[f[tem]]--;
            f[tem]++;
            cnt[f[tem]]++;
            max=Math.max(max, f[tem]);
            boolean flag=false;
            if(cnt[1]==i){
                flag=true;
            }else if(cnt[i]==1){
                flag=true;
            }else if(cnt[1]==1&&cnt[max]*max==i-1){
                flag=true;
            }else if(cnt[max-1]*(max-1)==i-max&&cnt[max]==1){
                flag=true;
            }
            if(flag){
                ans=i;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
