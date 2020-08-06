package com.thoughtworks.springbootemployee.integration;

import com.thoughtworks.springbootemployee.entity.Item;
import com.thoughtworks.springbootemployee.repository.TodoListRepository;
import com.thoughtworks.springbootemployee.service.TodoListService;
import org.junit.jupiter.api.AfterEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class CommonIntegrationTest {

    @Autowired
    protected MockMvc mockMvc;

    @Autowired
    protected TodoListRepository todoListRepository;

    @Autowired
    protected TodoListService todoListService;

    @AfterEach
    protected void clearRepository() {
        todoListRepository.deleteAll();
    }

    protected void addOneTodoItemToDB(Item item){
        todoListRepository.save(item);
    }
}
