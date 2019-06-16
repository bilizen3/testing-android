package com.flores.testingandroid.domain.useCase;

public final class UserUseCase {

    public static boolean validationUser(String user) {
        return user.matches("^[a-zA-ZáÁéÉíÍóÓúÚñÑüÜ.\\s]+$");
    }

}
