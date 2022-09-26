/**
 * @author: blkcor
 * @DATE: 2022/9/26  13:26
 * @PROJECT_NAME: partern-design-java
 * @since: jdk1.8
 */
public class OrangeFactory extends FruitFactory<Orange> {
    @Override
    public Orange getFruit() {
        return new Orange();
    }
}

