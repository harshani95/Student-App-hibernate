package entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Student {
    @Id
    private long id;
    private String name;
    private String address;

    @OneToOne(mappedBy = "student")
    private Laptop laptop;

    @OneToMany(mappedBy = "student")
    private Set<Book> books = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "course_detail",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "code")
    )
    private Set<Program> programs = new HashSet<>();

    public Student() {
    }

    public Student(long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
