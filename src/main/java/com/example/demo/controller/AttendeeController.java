package com.example.demo.controller;

import com.example.demo.model.Attendee;
import com.example.demo.service.AttendeeService;
import com.example.demo.service.EventService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attendees")
public class AttendeeController {

    private final AttendeeService attendeeService;

    public AttendeeController(AttendeeService attendeeService, EventService eventService) {
        this.attendeeService = attendeeService;
    }

    @GetMapping
    public List<Attendee> getAllAttendees() {
        return attendeeService.getAllAttendees();
    }

    @PostMapping
    public Attendee createAttendee(@RequestBody Attendee attendee) {
        
        return attendeeService.createAttendee(attendee);
    }
}
