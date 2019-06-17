package com.flores.testingandroid.presentation.view;

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

    private EditText etUser;
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
        etUser = findViewById(R.id.etUser);
        etPassword = findViewById(R.id.etPassword);
        btnSignIn = findViewById(R.id.btnSignIn);
        loginPresenter = new LoginPresenter(this);
    }

    public void settingBtnLogin() {
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.verificationUser(etUser.getText().toString().trim());
            }
        });
    }

    @Override
    public void loading() {
        btnSignIn.setEnabled(false);
        btnSignIn.setBackgroundResource(R.drawable.background_button_disable);
        btnSignIn.setText(R.string.loginActivity_loading);
    }

    @Override
    public void failure() {
        btnSignIn.setEnabled(true);
        btnSignIn.setBackgroundResource(R.drawable.background_button_enable);
        btnSignIn.setText(R.string.loginActivity_singIn);
    }

    @Override
    public void success() {
        btnSignIn.setEnabled(true);
        btnSignIn.setText(R.string.loginActivity_singIn);
        nextToActivity(new HomeActivity());
        finish();
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_login;
    }
}
