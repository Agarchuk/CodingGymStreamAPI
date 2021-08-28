import java.time.LocalDate;

public class Student {
    private String name;
    private LocalDate dateOfJoinProject;

    public Student(String name, LocalDate dateOfJoinProject) {
        this.name = name;
        this.dateOfJoinProject = dateOfJoinProject;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfJoinProject() {
        return dateOfJoinProject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dateOfJoinProject=" + dateOfJoinProject +
                '}';
    }
}
