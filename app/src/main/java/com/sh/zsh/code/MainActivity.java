package com.sh.zsh.code;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.sh.zsh.code.shqrlibrary.zxing.ui.CaptureActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivityForResult(new Intent(this,CaptureActivity.class),10001);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Toast.makeText(this,data.getStringExtra(CaptureActivity.RESULT_STR),Toast.LENGTH_LONG).show();
    }
}
