package com.example.demo.entities;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Entity
@Table(name="task_list")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    @Column(nullable = false )
    private String name;
    @Column
    private String description;
    @Column(name="creation_date" , nullable = false )
    private LocalDate DateCreation;
    @Column(name = "update_date", nullable = false )
    private LocalDate UpdateDate;
    @Column(name = "delete_update",nullable = false)
    private LocalDate DeleteDate;

}
