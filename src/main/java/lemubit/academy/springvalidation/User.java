package lemubit.academy.springvalidation;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class User {

    @NotBlank(message = "Name cannot be empty")
    public String name;

    @NotBlank(message = "Password cannot be empty")
    @Length(min = 6, max = 10, message = "Password size 6-10")
    public String password;

    @Min(value = 45, message = "Minimum grade of 45")
    public Double grade;

    public User(String name, String password, Double grade) {
        this.name = name;
        this.password = password;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
}
