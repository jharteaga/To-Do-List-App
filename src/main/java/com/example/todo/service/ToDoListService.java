package com.example.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todo.model.entity.ToDoItem;
import com.example.todo.model.repository.ToDoListRepository;

@Service
public class ToDoListService {

	@Autowired
	private ToDoListRepository toDoListRepository;
	
	public List<ToDoItem> findALl() {
		return (List<ToDoItem>) toDoListRepository.findAll();
	}

	public ToDoItem save(ToDoItem item) {
		return toDoListRepository.save(item);
	}
	
}
