package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Item;

import java.util.List;

public interface TodoListService {
    List<Item> getTodoItems();

    Item addTodoItem(Item item);

    void deleteTodoItem(Integer id);
}
