package com.flores.testingandroid.presentation.view;

import androidx.appcompat.app.AppCompatActivity;

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
        super.setContentView(R.layout.activity_main);
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
            }
        });
    }


    @Override
    public void showAlert() {
        showToast("user not valide!!");
    }
}
