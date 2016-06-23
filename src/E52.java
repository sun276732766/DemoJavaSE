/**
 * Created by mingfei.net@gmail.com
 * 2016/6/23 14:38
 */
public class E52 {

    int counter;

    public void hanoi(int n, char src, char with, char dest) {
        if (n == 1) {
            System.out.println(src + "->" + dest);
            counter++;
        } else {
            hanoi(n - 1, src, dest, with); // ***
            System.out.println(src + "->" + dest);
            counter++;
            hanoi(n - 1, with, src, dest);
        }
    }
}