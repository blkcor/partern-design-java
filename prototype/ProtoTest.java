/**
 * @author: blkcor
 * @DATE: 2022/9/30  11:36
 * @PROJECT_NAME: partern-design-java
 * @since: jdk1.8
 */
public class ProtoTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student_Proto student = new Student_Proto("blkcor");
        Student_Proto clone_student = (Student_Proto) student.clone();
        //这是深拷贝还是浅拷贝? 浅拷贝
        System.out.println(student.getName()== clone_student.getName());

    }
}
