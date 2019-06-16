package com.flores.testingandroid;

import com.flores.testingandroid.domain.User;

import org.junit.Test;
import org.junit.Assert;

public class PersonTest {

    @Test
    public void sendMessage(){
        User person= new User();
        Assert.assertEquals("send message",person.sendEmail());
    }

}
