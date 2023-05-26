package com.example;

import org.junit.Test;
import org.junit.Assert;
import com.exampale.Calculator;

public class ExampleTest {
    @Test public void example() {
        Assert.assertEquals(Calculator.add(1, 2), 3);
    }
}