package com.example.demo.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String location;

    private String date;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
    private List<Task> tasks;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
    private List<Attendee> attendees;

    // Getters and Setters
}
