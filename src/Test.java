/**
 * Created by mingfei.net@gmail.com
 * 2016/6/20 13:51
 */
public class Test {
    public static void main(String[] args) {
        Human zhangsan = new Human("张三", "男", 18, 1.7, 65, false); // Ctrl + P(arameter)
        System.out.println(zhangsan.name);
        System.out.println(zhangsan.gender);
        System.out.println(zhangsan.age);
        System.out.println(zhangsan.height);
        System.out.println(zhangsan.weight);
        System.out.println(zhangsan.isMarried);

        zhangsan.eat("米饭", "中午");
        System.out.println(zhangsan.sleep(8));
        zhangsan.study("Java SE");
        zhangsan.work();

//        Human lisi = new Human();
    }
}
