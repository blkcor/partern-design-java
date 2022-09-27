/**
 * @author: blkcor
 * @DATE: 2022/9/27  12:12
 * @PROJECT_NAME: partern-design-java
 * @since: jdk1.8
 */
public class HuaWei extends AbstractFactory {
    public static final String HUAWEI = "华为";
    @Override
    public Phone getPhone() {
        Phone phone = new Phone(HUAWEI);
        System.out.println("生产了" + phone.getType());
        return phone;
    }

    @Override
    public Router getRouter() {
        Router router = new Router(HUAWEI);
        System.out.println("生产了" + router.getType());
        return router;
    }

    @Override
    public Table getTable() {
        Table table = new Table(HUAWEI);
        System.out.println("生产了" + table.getType());
        return table;
    }
}
