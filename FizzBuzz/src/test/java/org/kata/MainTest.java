package org.kata;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @ParameterizedTest
    @ValueSource(ints = {1, 2,4,97})
    void Calculate_ReturnsStringForNumbers(int number) {
        assertEquals(String.valueOf(number), Main.calculate(number));
    }
    @ParameterizedTest
    @ValueSource(ints = {3, 6,9})
    void Calculate_ReturnsFizzForMultipliesOf3(int number) {
        assertEquals("fizz", Main.calculate(number));
    }
    @ParameterizedTest
    @ValueSource(ints = {5, 10,20})
    void Calculate_ReturnsBuzzForMultipliesOf5(int number) {
        assertEquals("buzz", Main.calculate(number));
    }
    @ParameterizedTest
    @ValueSource(ints = {15, 30})
    void Calculate_ReturnsFizzBuzzForMultipliesOf15(int number) {
        assertEquals("fizzbuzz", Main.calculate(number));
    }
}