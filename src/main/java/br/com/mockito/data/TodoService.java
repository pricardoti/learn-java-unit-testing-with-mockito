package br.com.mockito.data;

import java.util.List;

public interface TodoService {

    List<String> retrieveTodos(String user);

    void deleteTodo(String todo);
}
