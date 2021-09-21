package com.foxmula.inventory.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Course{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private float price;

    @Column(nullable = false)
    private float duration;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Course_Tutor",
            joinColumns = { @JoinColumn(name = "course_id") },
            inverseJoinColumns = { @JoinColumn(name = "tutor_id") }
    )
    private Set<Tutor> tutors = new HashSet<>();

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", duration=" + duration +
                ", tutors=" + tutors +
                '}';
    }
}
