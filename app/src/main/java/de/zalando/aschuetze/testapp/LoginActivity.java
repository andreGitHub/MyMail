package de.zalando.aschuetze.testapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    /** Called when the user clicks the Create Account butto*/
    public void createAccount(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivityForResult(intent,0);
    }
}
