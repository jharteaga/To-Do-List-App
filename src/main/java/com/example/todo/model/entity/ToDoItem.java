package com.example.todo.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@NoArgsConstructor
@Data
public class ToDoItem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Getter @Setter  
	private Long id;
	
	@Getter @Setter 
	@NotNull (message="Name cannot be NULL") 
	private String name;
	
	@Getter @Setter 
	@NotNull (message="Category cannot be NULL") 
	private String category;
	
	@Getter @Setter 
	@NotNull 
	private boolean complete;
	
	public ToDoItem(String name, String category) {
		this.name = name;
		this.category = category;
		this.complete = false;
	}
}
