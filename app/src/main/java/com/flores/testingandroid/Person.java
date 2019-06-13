package com.flores.testingandroid;

public class Person implements Email{

    @Override
    public String sendEmail() {
        return "send message";
    }

    @Override
    public String writeEmail() {
        return "write message";
    }
}
