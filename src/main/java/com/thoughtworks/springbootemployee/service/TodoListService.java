package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Item;
import com.thoughtworks.springbootemployee.exception.ItemNotFoundException;

import java.util.List;
//todo use dto
public interface TodoListService {
    List<Item> getTodoItems();

    Item addTodoItem(Item item);

    void deleteTodoItem(Integer id);

    Item modifyItem(Item newItem) throws ItemNotFoundException;
}
