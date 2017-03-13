import java.util.Scanner;
/**
 * Created by vinnikovaai.18 on 13.03.2017.
 */
public class B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean flag = true;
        for(int i=2; i<a; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
         if (flag) System.out.println(i);
            flag=true;
        }
    }
}

