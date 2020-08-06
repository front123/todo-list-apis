package com.thoughtworks.springbootemployee.service.Impl;
import com.thoughtworks.springbootemployee.entity.Item;
import com.thoughtworks.springbootemployee.repository.TodoListRepository;
import com.thoughtworks.springbootemployee.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TodoListServiceImpl implements TodoListService {
    @Autowired
    private TodoListRepository todoListRepository;
    @Override
    public List<Item> getTodoItems() {
        return todoListRepository.findAll();
    }

    @Override
    public Item addTodoItem(Item item) {
        return todoListRepository.save(item);
    }
}
