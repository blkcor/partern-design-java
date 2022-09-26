/**
 * @author: blkcor
 * @DATE: 2022/9/26  13:21
 * @PROJECT_NAME: partern-design-java
 * @since: jdk1.8
 */
public class Apple extends Fruit {
    public Apple() {
        this.name = "苹果";
    }

    public void get() {
        System.out.println("采集" + this.name);
    }
}
