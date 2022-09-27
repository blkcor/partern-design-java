/**
 * @author: blkcor
 * @DATE: 2022/9/27  12:14
 * @PROJECT_NAME: partern-design-java
 * @since: jdk1.8
 */
public class Apple_Company extends AbstractFactory {
    public static final String APPLE = "苹果";
    @Override
    public Phone getPhone() {
        Phone phone = new Phone(APPLE);
        System.out.println("生产了" + phone.getType());
        return phone;
    }

    @Override
    public Router getRouter() {
        Router router = new Router(APPLE);
        System.out.println("生产了" + router.getType());
        return router;
    }

    @Override
    public Table getTable() {
        Table table = new Table(APPLE);
        System.out.println("生产了" + table.getType());
        return table;
    }
}
