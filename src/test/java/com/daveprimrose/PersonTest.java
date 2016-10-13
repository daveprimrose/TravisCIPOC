package com.daveprimrose;

import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by David on 13/10/2016.
 */
public class PersonTest {
    @org.junit.Test
    public void sayHello() throws Exception {
        IPerson person = new Person();

        String expected = "Hello World";
        String actual = person.sayHello();

        Assert.assertEquals(expected, actual);
    }

}