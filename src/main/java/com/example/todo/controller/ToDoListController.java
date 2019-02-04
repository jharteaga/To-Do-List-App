package com.example.todo.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.todo.model.entity.ToDoItem;
import com.example.todo.model.entity.ToDoListViewModel;
import com.example.todo.service.ToDoListService;

@Controller
public class ToDoListController {
	
	@Autowired
	private ToDoListService toDoListService;
	
	@GetMapping("/")
	public String index(@Valid Model model) {
		ArrayList<ToDoItem> items = (ArrayList<ToDoItem>) toDoListService.findALl();
		model.addAttribute("items", new ToDoListViewModel(items));
		model.addAttribute("newitem", new ToDoItem());
		return "index";
	}
	
	@PostMapping("/add")
	public String save(@Valid @ModelAttribute ToDoItem requestItem, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
            return "error";
        }
		ToDoItem item = new ToDoItem(requestItem.getName(), requestItem.getCategory());
		toDoListService.save(item);
		return "redirect:/";
	}
	
	@PostMapping("/update")
	public String update(@Valid @ModelAttribute ToDoListViewModel requestLists) {
		for (ToDoItem item : requestLists.getToDoList()) {
			ToDoItem todo = new ToDoItem(item.getName(), item.getCategory());
			todo.setComplete(item.isComplete());
			todo.setId(item.getId());
			toDoListService.save(todo);
		}
		return "redirect:/";
	}
}
