/**
 * @author: blkcor
 * @DATE: 2022/10/1  9:52
 * @PROJECT_NAME: partern-design-java
 * @since: jdk1.8
 */
public class TestAdapter {

    public static void main(String[] args) {
        SupplyAdapter supplyAdapter = new SupplyAdapter();
        test(supplyAdapter);
    }

    public static void test(Target target){
        System.out.println("得到了："+target.supply());
    }
}
