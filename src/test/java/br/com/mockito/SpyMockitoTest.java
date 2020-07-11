package br.com.mockito;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class SpyMockitoTest {

    @Test
    public void whenSpyingOnList_thenCorrect() {
        List<String> list = new ArrayList<>();
        List<String> spyList = spy(list);

        spyList.add("one");
        spyList.add("two");

        verify(spyList).add("one");
        verify(spyList).add("two");

        assertEquals(2, spyList.size());
    }

    @Test
    public void whenStubASpy_thenStubbed() {
        List<String> list = new ArrayList<String>();

        List<String> spyList = spy(list);
        assertEquals(0, spyList.size());

        doReturn(100).when(spyList).size();
        assertEquals(100, spyList.size());
    }

    @Test
    public void whenCreateMock_thenCreated() {
        List mockedList = mock(ArrayList.class);

        mockedList.add("one");
        verify(mockedList).add("one");

        assertEquals(0, mockedList.size());
    }

    @Test
    public void whenCreateSpy_thenCreate() {
        List spyList = spy(new ArrayList());

        spyList.add("one");
        verify(spyList).add("one");

        assertEquals(1, spyList.size());
    }
}
