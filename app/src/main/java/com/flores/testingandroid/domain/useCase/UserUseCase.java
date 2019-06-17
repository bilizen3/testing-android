package com.flores.testingandroid.domain.useCase;

public final class UserUseCase {

    public static boolean validationUser(String user) {
        return user.matches("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,30}");
    }

}
