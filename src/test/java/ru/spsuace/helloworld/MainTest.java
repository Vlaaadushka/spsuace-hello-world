package ru.spsuace.helloworld;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void hello() {
        Assert.assertEquals("Hello world!", Main.hello());
    }
}