package com.foxmula.inventory.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Getter
@Setter
public class PaymentDetails{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private long id;

    @Column(nullable = false, unique = true)
    private int noOfCourse;

    @Column(nullable = false, unique = true)
    private float totalPrice;

    @OneToMany
    private Set<Course> courses = new HashSet<>();


}
