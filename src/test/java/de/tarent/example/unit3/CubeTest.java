package de.tarent.example.unit3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class CubeTest {

    @Test
    public void volume() {
        Cube toTest = spy(new Cube());

        when(toTest.area(2)).thenReturn(new Double(2));

        assertEquals(8, toTest.volume(2));
    }
}
