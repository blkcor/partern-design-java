import java.util.function.Supplier;

/**
 * @author: blkcor
 * @DATE: 2022/9/26  13:27
 * @PROJECT_NAME: partern-design-java
 * @since: jdk1.8
 */
public class Test {
    public static void main(String[] args) {
        test(new AppleFactory()::getFruit);
        test(new OrangeFactory()::getFruit);
        test(new BananaFactory()::getFruit);
    }

    private static void test(Supplier<Fruit> supplier) {
        System.out.println(supplier.get().name + "被吃掉了, yummy!" );
    }
}
