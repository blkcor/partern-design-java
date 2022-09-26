/**
 * @author: blkcor
 * @DATE: 2022/9/26  13:21
 * @PROJECT_NAME: partern-design-java
 * @since: jdk1.8
 */
public abstract class FruitFactory<T extends Fruit> {
    public abstract T getFruit();
}
