package com.rakyooooo.restapi.repository;

import com.rakyooooo.restapi.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  TodoRepository extends JpaRepository<TodoEntity, Long> {

}
