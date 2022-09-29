import lombok.ToString;

import java.util.List;

/**
 * @author: blkcor
 * @DATE: 2022/9/28  13:22
 * @PROJECT_NAME: partern-design-java
 * @since: jdk1.8
 */
@ToString
public class Student {

    private Integer id;
    private String name;
    private String college;
    private String major;
    private String grade;
    private List<String> awards;

    private Student(StudentBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.college = builder.college;
        this.major = builder.major;
        this.grade = builder.grade;
        this.awards = builder.awards;
    }

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }


    public static class StudentBuilder {
        private Integer id;
        private String name;
        private String college;
        private String major;
        private String grade;
        private List<String> awards;

        //柯里化 链式调用
        public StudentBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder college(String college) {
            this.college = college;
            return this;
        }

        public StudentBuilder major(String major) {
            this.major = major;
            return this;
        }

        public StudentBuilder grade(String grade) {
            this.grade = grade;
            return this;
        }

        public StudentBuilder awards(List<String> awards) {
            this.awards = awards;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

}


