package com.example.todo.model.entity;

import java.util.ArrayList;

import javax.validation.Valid;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class ToDoListViewModel {
	
	@Valid @Setter @Getter 
	private ArrayList<ToDoItem> toDoList = new ArrayList<ToDoItem>();
	
}
