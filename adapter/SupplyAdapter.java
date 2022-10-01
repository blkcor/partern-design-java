/**
 * @author: blkcor
 * @DATE: 2022/10/1  9:54
 * @PROJECT_NAME: partern-design-java
 * @since: jdk1.8
 */
public class SupplyAdapter extends TestSupplier implements Target {
    @Override
    public String supply() {
        return super.doSupply();
    }
}

