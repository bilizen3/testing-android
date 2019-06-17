package com.flores.testingandroid.presentation.presenter;
/**
 * LoginContract
 *
 * @author Bill Flores
 * @since 06/15/2019
 */
public interface LoginContract {

    interface LoginView{
        void showDialogAlert(String message);
        void ShowProgress();
        void success();
        void enableButtonLogin(boolean enable);
    }

    interface LoginPresenter{
        void verificationUser(String user);
    }
}
