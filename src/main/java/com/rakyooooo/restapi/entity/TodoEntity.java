package com.rakyooooo.restapi.entity;

import javax.persistence.*;

@Entity
@Table(name="TODO")
public class TodoEntity {

    @Id
    @Column(name="TODO_ID")
    private int todoId;

    @Column(name="TODO_NAME")
    private String todoName;
}
