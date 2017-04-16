import java.util.Scanner;

/**
 * Created by mohammedissa on 1/17/17.
 */
public class BZU {


    public static void main(String[] args0){


        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String[] s = line.split(" ");
        int num = Integer.parseInt(s[0]);

        String unlock = s[1];

        String re = s[2];


        String[] lines = new String[num];

        for (int i = 0; i < num; i++) {
            lines[i]=scanner.nextLine();
        }


        int charn =-1;
        char ch = 0;

        for (int i = 0; i < re.length(); i++) {
            if (re.charAt(i)>='A' && re.charAt(i)<='Z'){
                charn=i;
                ch = re.charAt(i);
                break;
            }
        }



        for (int i = 0; i < num; i++) {
            String tmp = lines[i];
            char aa = unlock.charAt(i);
            int index =0;
            for (int j = 0; j < 26; j++) {
                if (tmp.charAt(j)==aa){
                    index=j;
                    break;
                }
            }

            String s1 = tmp.substring(0,index);
            String s2 = tmp.substring(index,tmp.length());

            lines[i] = s2+s1;


        }



        String word="";

        int ind=0;
        for (int i = 0; i < 26; i++) {
            if (lines[charn].charAt(i)==ch){
                ind = i;
                break;
            }
        }

        for (int i = 0; i < num; i++) {
            word+=lines[i].charAt(ind)+"";
        }

        System.out.print(unlock+" "+word);




    }


}
