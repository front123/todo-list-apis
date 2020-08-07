package com.thoughtworks.springbootemployee.integration;

import com.thoughtworks.springbootemployee.entity.Item;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class TodoListIntegrationTest extends CommonIntegrationTest{

    @Test
    void should_return_2_items_when_get_All_todo_items_given_a_db_with_2_items() throws Exception {
        //given
        addOneTodoItemToDB(new Item("olivia", false));
        addOneTodoItemToDB(new Item("front", false));

        //when and then
        mockMvc.perform(get("/todos").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(2));
    }

    @Test
    void should_return_item_with_text_front_when_add_todo_item_given() throws Exception {

        String newItemJsonString = "{\n" +
                "    \"text\": \"front\",\n" +
                "    \"done\": false\n" +
                "}";

        mockMvc.perform(post("/todos").contentType(MediaType.APPLICATION_JSON).content(newItemJsonString))
                .andExpect(status().isOk())
                .andExpect(jsonPath("text").value("front"));
    }
}
