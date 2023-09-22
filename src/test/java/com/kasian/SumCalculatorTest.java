package com.kasian;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

class SumCalculatorTest {
    SumCalculator sumCalculator;

    @BeforeEach
     public void init() {
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testThatSumCalculatorWorksCorrectlyWith1() {
        Assertions.assertEquals(1, sumCalculator.sum(1));
    }

    @Test
    public void testThatSumCalculatorWorksCorrectlyWith3() {
        Assertions.assertEquals(6, sumCalculator.sum(3));
    }

    @Test
    public void testThatSumCalculatorThrowsExceptionWith0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }

    @Test
    public void testThatSumCalculatorThrowsExceptionWith65536() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(65536));
    }

    @Test
    public void testThatSumCalculatorThrowsExceptionWithMinus10() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(-10));
    }

    @Test
    public void testThatSumCalculatorThrowsExceptionWith66000() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(66000));
    }

    @Test
    public void testThatScanNumberWorksWithValidInput() throws NoSuchElementException {
        String input = "5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ScanNumber.scan();
        Assertions.assertEquals(5, ScanNumber.n);
    }

    @Test
    public void testThatScanNumberThrowsExceptionWithInvalidInput() throws NoSuchElementException {
        String input = "abc\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Assertions.assertThrows(NoSuchElementException.class, () -> {ScanNumber.scan();});
    }
}