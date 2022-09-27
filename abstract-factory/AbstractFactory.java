/**
 * @author: blkcor
 * @DATE: 2022/9/27  12:04
 * @PROJECT_NAME: partern-design-java
 * @since: jdk1.8
 */
public abstract class AbstractFactory {
    public abstract Phone getPhone();
    public abstract Router getRouter();
    public abstract Table getTable();
}
