/**
 * @author: blkcor
 * @DATE: 2022/9/27  12:08
 * @PROJECT_NAME: partern-design-java
 * @since: jdk1.8
 */
public class XiaoMi extends AbstractFactory {
    public static final String XIAOMI = "小米";

    @Override
    public Phone getPhone() {
        Phone phone = new Phone(XIAOMI);
        System.out.println("生产了" + phone.getType());
        return phone;
    }

    @Override
    public Router getRouter() {
        Router router = new Router(XIAOMI);
        System.out.println("生产了" + router.getType());
        return router;
    }

    @Override
    public Table getTable() {
        Table table = new Table(XIAOMI);
        System.out.println("生产了" + table.getType());
        return table;
    }
}
