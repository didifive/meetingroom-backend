package com.dio.meetingroombackend.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
@Table(name = "meetingroom")
public class Room {
    private long id;
    private String name;
    private String link;
    private String date;
    private String startHour;
    private String endHour;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    @Column(name = "link", nullable = false)
    public String getLink() {
        return link;
    }

    @Column(name = "date", nullable = false)
    public String getDate() {
        return date;
    }

    @Column(name = "startHour", nullable = false)
    public String getStartHour() {
        return startHour;
    }

    @Column(name = "endHour", nullable = false)
    public String getEndHour() {
        return endHour;
    }

    @Override
    public String toString() {
        return "Room [id=" + id
                + ", name=" + name
                + ", link=" + link
                + ", date=" + date
                + ", startHour=" + startHour
                + ", endHour=" + endHour
                + "]";
    }
}