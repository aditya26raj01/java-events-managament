package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
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

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
    
    // Getters and Setters
}
