package com.flores.testingandroid.presentation.view;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * <p>
 * BaseActivity class
 * </p>
 *
 * @author Bill Flores
 * @since 06/16/2019
 */
public class BaseActivity extends AppCompatActivity {

    public void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

}
