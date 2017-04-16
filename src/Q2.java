import java.util.ArrayList;
import java.util.List;

/**
 * Created by mohammedissa on 1/17/17.
 */
public class Q2 {


    public static List<Integer> primeFactors(int number) {
        int n = number;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }

    public static void main(String[] args) {

        int count =0;
        int i=1;
        int num=0;

        boolean cc = true;

        boolean a;
        while (cc){

            List<Integer> list = primeFactors(i++);

            a=true;

            for (int j = 0; j < list.size(); j++) {
                if (!list.get(j).equals(2) && !list.get(j).equals(3) && !list.get(j).equals(5)){
                    a=false;
                    break;
                }
            }

            if (a){
                count++;
                System.out.println(i);
            }

            if (count>=2000){
                break;
            }

        }




    }

}
