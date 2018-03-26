package com.example.dell.androidb12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //get the name from previous activity
        String dataReceived = getIntent().getExtras().getString(Constants.KEY2);
        TextView resTextView = findViewById(R.id.HometextView);
        resTextView.setText(dataReceived);
    }

    public void handleClick(View view) {
        EditText hEditText = (EditText)findViewById(R.id.editTextHome);
        String home = hEditText.getText().toString();
        Intent intent = new Intent();
        intent.putExtra(Constants.KEY3,home);
        setResult(RESULT_OK, intent);
        finish();
    }
}
