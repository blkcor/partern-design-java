import java.util.Arrays;

/**
 * @author: blkcor
 * @DATE: 2022/9/28  13:29
 * @PROJECT_NAME: partern-design-java
 * @since: jdk1.8
 */
public class BuilderTest {
    public static void main(String[] args) {
        Student student = Student.builder()
                .id(1)
                .name("张三")
                .college("计算机学院")
                .major("软件工程")
                .grade("大三")
                .awards(Arrays.asList("一等奖", "二等奖"))
                .build();
        System.out.println(student.toString());
    }
}

