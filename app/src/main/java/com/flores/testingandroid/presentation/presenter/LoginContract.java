package com.flores.testingandroid.presentation.presenter;

public interface LoginContract {

    interface LoginView{
        void showAlert();
    }

    interface LoginPresenter{
        void verificationUser(String user);
    }
}
