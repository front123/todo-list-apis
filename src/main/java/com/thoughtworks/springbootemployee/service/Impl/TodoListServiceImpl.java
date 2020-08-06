package com.thoughtworks.springbootemployee.service.Impl;

import com.thoughtworks.springbootemployee.entity.Item;
import com.thoughtworks.springbootemployee.service.TodoListService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoListServiceImpl implements TodoListService {

    @Override
    public List<Item> getTodoItems() {
        return new ArrayList<>();
    }
}
