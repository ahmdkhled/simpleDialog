package com.ahmedkhaled.alertdialogkibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ahmedkhaled.simpledialog.SimpleDialog;

public class MainActivity extends AppCompatActivity {
    SimpleDialog simpleDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        simpleDialog =new SimpleDialog(this);

    }



    @Override
    public void onBackPressed() {
        simpleDialog.setTitle("warning");
        simpleDialog.setMessage("are you sure you want to exit");
        simpleDialog.show();

        simpleDialog.setOnPositiveButtonClickListener("yes", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        simpleDialog.setOnNegativeButtonClickListener("no", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                simpleDialog.dismiss();

            }
        });

    }
}
