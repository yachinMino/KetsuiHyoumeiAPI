package com.rakyooooo.restapi.controller;

import com.rakyooooo.restapi.entity.TodoEntity;
import com.rakyooooo.restapi.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @GetMapping("/findAll")
    public List<TodoEntity> findAllTodo(){
        List<TodoEntity> ret = todoRepository.findAll();
        return ret;
    }



}
