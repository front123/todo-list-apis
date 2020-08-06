package todolisttest;

import com.thoughtworks.springbootemployee.entity.Item;
import com.thoughtworks.springbootemployee.repository.TodoListRepository;
import com.thoughtworks.springbootemployee.service.Impl.TodoListServiceImpl;
import com.thoughtworks.springbootemployee.service.TodoListService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TodoListTest {
    @Mock
    private TodoListRepository todoListRepository;
    @InjectMocks
    private TodoListServiceImpl todoListService;

    @Test
    void should_return_2_items_when_get_todo_items_given_2_items_in_db() {
        //given
        Item item1 = new Item();
        Item item2 = new Item();
        List<Item> items = Arrays.asList(item1, item2);
        when(todoListRepository.findAll()).thenReturn(items);
        //when
        List<Item> newItems = todoListService.getTodoItems();
        //then
        assertEquals(2, newItems.size());
    }

}
