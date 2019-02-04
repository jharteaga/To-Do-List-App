package com.example.todo.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.todo.model.entity.ToDoItem;

public interface ToDoListRepository extends CrudRepository<ToDoItem, Long>{

}
