import lombok.Data;

import java.util.List;

/**
 * @author: blkcor
 * @DATE: 2022/9/30  11:33
 * @PROJECT_NAME: partern-design-java
 * @since: jdk1.8
 */
@Data
public class Student_Proto implements Cloneable {
    private String name;


    public Student_Proto() {
    }

    public Student_Proto(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //Object本身提供的clone 是浅拷贝 只拷贝基本类型 我们需要深拷贝
        Student_Proto clone = (Student_Proto) super.clone();
        clone.setName(this.name);
        return clone;
    }
}
