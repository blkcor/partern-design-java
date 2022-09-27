import lombok.*;

/**
 * @author: blkcor
 * @DATE: 2022/9/27  12:05
 * @PROJECT_NAME: partern-design-java
 * @since: jdk1.8
 */
@Data
public class Phone {
    String type;
    public Phone(String label) {
        this.type = label + "手机";
    }
}
