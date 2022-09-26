/**
 * @author: blkcor
 * @DATE: 2022/9/26  13:26
 * @PROJECT_NAME: partern-design-java
 * @since: jdk1.8
 */
public class BananaFactory extends FruitFactory<Banana> {
    @Override
    public Banana getFruit() {
        return new Banana();
    }
}

