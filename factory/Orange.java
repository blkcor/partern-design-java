/**
 * @author: blkcor
 * @DATE: 2022/9/26  13:21
 * @PROJECT_NAME: partern-design-java
 * @since: jdk1.8
 */
public class Orange extends Fruit{
    public Orange() {
        this.name = "橘子";
    }
    public void get() {
        System.out.println("采集" + this.name);
    }
}
