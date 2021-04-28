package de.tarent.example.unit2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class CuboidTest {

    @Test
    public void volume() {
        Rectangle mockRect = mock(Rectangle.class);
        Cuboid toTest = new Cuboid(mockRect);

        when(mockRect.area(2, 2)).thenReturn(new Double(4));

        assertEquals(8, toTest.volume(2, 2, 2));
        verify(mockRect).area(2, 2);
    }
}
