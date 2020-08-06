package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.dto.ItemRequestDto;
import com.thoughtworks.springbootemployee.dto.ItemResponseDto;
import com.thoughtworks.springbootemployee.entity.Item;
import com.thoughtworks.springbootemployee.exception.ItemNotFoundException;
import com.thoughtworks.springbootemployee.service.TodoListService;
import com.thoughtworks.springbootemployee.utils.BeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoListService todoListService;

    public TodoController(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    @GetMapping()
    public List<ItemResponseDto> getTodoItems(){
        List<Item> items = todoListService.getTodoItems();
        return items.stream().map(BeanMapper::toDtoResponse).collect(Collectors.toList());
    }

    @PostMapping()
    public ItemResponseDto addTodoItem(@RequestBody @Valid ItemRequestDto itemRequestDto){
        Item item = BeanMapper.toItem(itemRequestDto);
        Item returnItem = todoListService.addTodoItem(item);
        return BeanMapper.toDtoResponse(returnItem);
    }

    @DeleteMapping("/{id}")
    public void deleteTodoItem(@PathVariable Integer id){
        todoListService.deleteTodoItem(id);
    }

    @PutMapping("/{id}")
    public ItemResponseDto modifyTodoItem(@PathVariable Integer id, @RequestBody @Valid ItemRequestDto itemRequestDto) throws ItemNotFoundException {
        Item item = BeanMapper.toItem(itemRequestDto);
        item.setId(id);
        Item returnItem = todoListService.modifyItem(item);
        return BeanMapper.toDtoResponse(returnItem);
    }

}
