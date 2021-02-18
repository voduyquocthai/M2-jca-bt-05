package Entities;

public class Person {
    private String name;

    private String dateOfBirth;

    private String job;

    private int id;

    public Person() {
    }

    public Person(String name, String dateOfBirth, String job, int id) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.job = job;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", job='" + job + '\'' +
                ", id=" + id +
                '}';
    }
}
