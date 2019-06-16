package com.flores.testingandroid.presentation.presenter;

import com.flores.testingandroid.domain.useCase.UserUseCase;

public class LoginPresenter implements LoginContract.LoginPresenter {

    LoginContract.LoginView loginView;

    public LoginPresenter(LoginContract.LoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void verificationUser(String user) {
        if(!UserUseCase.validationUser(user)){
            loginView.showAlert();
        }
    }
}
