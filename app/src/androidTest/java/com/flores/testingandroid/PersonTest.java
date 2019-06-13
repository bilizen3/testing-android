package com.flores.testingandroid;

import org.junit.Test;
import org.junit.Assert;

public class PersonTest {

    @Test
    public void sendMessage(){
        Person person= new Person();
        Assert.assertEquals("send message",person.sendEmail());
    }

}
