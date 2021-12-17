package com.todolist.todolist.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
@Getter
@Setter
@NoArgsConstructor

public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcategory;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "category")
    private List<ToDoList> toDoList;

}
