import java.util.function.BinaryOperator;

public class Test {


    @org.junit.Test
    public void test1() {
        int num = 10;//jdk1.7前,必须加final,jdk1.8会自动加上
        Runnable runnable = () -> System.out.println("Hello World!" + num);
        runnable.run();
    }

    @org.junit.Test
    public void test2(){
        BinaryOperator<Integer> bi = (x, y) -> {
            System.out.println("加法");
            return x + y;
        };
        Integer apply = bi.apply(23, 45);
        System.out.println(apply);

    }
}
