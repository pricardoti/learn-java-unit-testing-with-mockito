package br.com.mockito.business;

import br.com.mockito.data.TodoService;
import br.com.mockito.data.TodoServiceStub;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TodoBusinessImplStubTest {

    @Test
    public void usingAStub() {
        TodoService todoService = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);

        List<String> todos = todoBusinessImpl
                .retrieveTodosRelatedToSpring("Ranga");

        assertEquals(2, todos.size());
    }
}
