/**
 * @author: blkcor
 * @DATE: 2022/9/26  13:21
 * @PROJECT_NAME: partern-design-java
 * @since: jdk1.8
 */
public class Apple extends Fruit {
    public Apple() {
        this.name = "čšć";
    }

    public void get() {
        System.out.println("éé" + this.name);
    }
}
