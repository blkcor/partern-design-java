import lombok.*;

/**
 * @author: blkcor
 * @DATE: 2022/9/27  12:06
 * @PROJECT_NAME: partern-design-java
 * @since: jdk1.8
 */
@Data
public class Router {
    String type;
    public Router(String label) {
        this.type = label + "路由器";
    }
}
