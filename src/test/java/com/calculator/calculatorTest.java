package com.calculator;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by localadmin on 11/11/16.
 */
public class calculatorTest {
    @Test
    public void calculate_givenIntegerFiveAndIntegerFiveAndOperatorAdd_returnStringTen() throws Exception {
        Calculator testCalculator = new Calculator();
        String testResult;

        testResult = testCalculator.calculate(5, 5, "add");

        assertThat(testResult, equalTo("10"));

    }

    @Test
    public void calculate_givenIntegerFiveAndIntegerSixAndOperatorAdd_returnsStringEleven() throws Exception {
        Calculator testCalculator = new Calculator();
        String testResult;

        testResult = testCalculator.calculate(5, 6, "add");

        assertThat(testResult, equalTo("11"));
    }

    @Test
    public void calculate_givenIntegerTenAndInteger5AndOperatorSubtract_returnsStringFive() throws Exception {
        Calculator testCalculator = new Calculator();
        String testResult;

        testResult = testCalculator.calculate(10, 5, "subtract");

        assertThat(testResult, equalTo("5"));
    }
}