package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.entity.Item;
import com.thoughtworks.springbootemployee.exception.ItemNotFoundException;
import com.thoughtworks.springbootemployee.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoListService todoListService;

    public TodoController(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    @GetMapping()
    public List<Item> getTodoItems(){
        return todoListService.getTodoItems();
    }

    @PostMapping()
    public Item addTodoItem(@RequestBody @Valid Item item){
        return todoListService.addTodoItem(item);
    }

    @DeleteMapping("/{id}")
    public void deleteTodoItem(@PathVariable Integer id){
        todoListService.deleteTodoItem(id);
    }

    @PutMapping
    public Item modifyTodoItem(@RequestBody @Valid Item item) throws ItemNotFoundException {
        return todoListService.modifyItem(item);
    }



}
