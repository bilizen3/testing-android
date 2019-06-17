package com.flores.testingandroid.presentation.presenter;

/**
 * LoginContract
 *
 * @author Bill Flores
 * @since 06/15/2019
 */
public interface LoginContract {

    interface LoginView {

        void failure();

        void loading();

        void success();
    }

    interface LoginPresenter {
        void verificationUser(String user);
    }
}
