import java.io.*;

public class problem1 {
    public static void main(String [] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int passes=0;
        while(n!=1){
            String [] s=String.valueOf(n).split("");
            if(s.length==1) {
                System.out.println(-1);
                return;
            }
            passes++;
            int sum=0;
            for(int i=0;i<s.length;i++){
                int num=Integer.parseInt(s[i]);
                sum+=num*num;
            }
            n=sum;
        }
        System.out.println(passes);
    }
}
