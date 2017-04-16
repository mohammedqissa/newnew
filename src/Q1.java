import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by mohammedissa on 1/17/17.
 */
public class Q1 {



        public static void main(String args[]){
            Scanner in=new Scanner(System.in);

            int n=in.nextInt();
            int m=in.nextInt();

            int [] a =new int[n];
            int [] b=new int[m];

            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }
            for(int j=0;j<m;j++){
                b[j]=in.nextInt();
            }

            int count=0 ;

            ArrayList list = new ArrayList<Integer>();
            int aa = a[n-1];
            while (aa>=a[n-1] && aa <=b[0]){

                list.add(aa);
                aa++;

            }



            int c =0;

            for (int i = 0; i <list.size() ; i++) {



                for (int j = 0; j < n; j++) {
                    if((int)list.get(i)%a[j]==0){
                        c++;
                    }
                }

                for (int j = 0; j < m; j++) {
                    if(b[j] % (int)list.get(i) ==0 ){
                        c++;

                    }

                }

                if (c==(m+n)){
                    count++;
                }
                c=0;
            }

            System.out.println(count);

        }
}
