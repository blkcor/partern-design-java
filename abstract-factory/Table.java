import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: blkcor
 * @DATE: 2022/9/27  12:07
 * @PROJECT_NAME: partern-design-java
 * @since: jdk1.8
 */
@Data
public class Table {
    String type;

    public Table(String label) {
        this.type = label + "桌子";
    }
}
