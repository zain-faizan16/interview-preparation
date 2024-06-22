package java8.features.methodreference;

import java.util.Objects;

public class Student {
    private String stdName;

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public Student(String stdName) {
        this.stdName = stdName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdName='" + stdName + '\'' +
                '}';
    }
}
