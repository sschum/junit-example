package de.tarent.example.unit1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTest {

	@Test
	void addsTwoNumbers() {
		Calculator toTest = new Calculator();
		assertEquals(2, toTest.add(1, 1));
	}

	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"0,    1,   1",
			"1,    2,   3",
			"49,  51, 100",
			"1,  100, 101"
	})
	void add(int a, int b, int expected) {
		Calculator toTest = new Calculator();
		assertEquals(expected, toTest.add(a, b));
	}
}
