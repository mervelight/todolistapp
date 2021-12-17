package com.todolist.todolist.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "todolist")
@Getter
@Setter
@NoArgsConstructor
public class ToDoList {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "endtime")
    private Date endtime;

    @Column(name = "endof")
    private String endof;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idcategory", referencedColumnName = "idcategory")
    private Category category;

}
