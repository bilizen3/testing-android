package com.flores.testingandroid.presentation.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.flores.testingandroid.R;
import com.flores.testingandroid.presentation.presenter.LoginContract;
import com.flores.testingandroid.presentation.presenter.LoginPresenter;

/**
 * LoginActivity
 *
 * @author Bill Flores
 * @since 06/15/2019
 */
public class LoginActivity extends BaseActivity implements LoginContract.LoginView {

    private EditText etUserName;
    private EditText etPassword;
    private Button btnSignIn;
    private LoginContract.LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui();
        settingBtnLogin();
    }

    private void ui() {
        etUserName = findViewById(R.id.etUserName);
        etPassword = findViewById(R.id.etPassword);
        btnSignIn = findViewById(R.id.btnSignIn);
        loginPresenter = new LoginPresenter(this);
    }

    public void settingBtnLogin() {
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.verificationUser(etUserName.getText().toString().trim());
                enableButtonLogin(false);
            }
        });
    }

    @Override
    public void ShowProgress() {
        btnSignIn.setText(R.string.loginActivity_loading);
    }

    @Override
    public void enableButtonLogin(boolean enable) {
        btnSignIn.setEnabled(enable);
    }

    @Override
    public void showDialogAlert(String message) {

    }

    @Override
    public void success() {

    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_main;
    }
}
