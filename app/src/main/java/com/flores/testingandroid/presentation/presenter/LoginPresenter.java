package com.flores.testingandroid.presentation.presenter;

import com.flores.testingandroid.domain.useCase.UserUseCase;

/**
 * LoginPresenter
 *
 * @author Bill Flores
 * @since 06/15/2019
 */
public class LoginPresenter implements LoginContract.LoginPresenter {

    LoginContract.LoginView loginView;

    public LoginPresenter(LoginContract.LoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void verificationUser(String user) {
        loginView.loading();
        if (UserUseCase.validationUser(user))
            loginView.success();
        else
            loginView.failure();
    }
}
