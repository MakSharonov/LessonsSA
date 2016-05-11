package com.vl.mak.activityresult;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.datatype.Duration;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    final int REQUEST_CODE_COLOR = 1;
    final int REQUEST_CODE_ALIGN = 2;

    TextView tvText;
    Button btnColor, btnAlign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvText = (TextView) findViewById(R.id.tvText);

        btnColor = (Button) findViewById(R.id.btnColor);
        btnAlign = (Button) findViewById(R.id.btnAlign);

        btnColor.setOnClickListener(this);
        btnAlign.setOnClickListener(this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.d("MyLog", "requestCode: " + requestCode + ", resultCode: " + resultCode);
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case REQUEST_CODE_COLOR:
                    int color = data.getIntExtra("color", Color.WHITE);
                    tvText.setTextColor(color);
                    break;
                case REQUEST_CODE_ALIGN:
                    int align = data.getIntExtra("align", Gravity.LEFT);
                    tvText.setGravity(align);
                    break;
            }
        } else {
            Toast.makeText(this, "Wrong result", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btnColor:
                intent = new Intent(this, ColorActivity.class);
                startActivityForResult(intent, REQUEST_CODE_COLOR);
                break;
            case R.id.btnAlign:
                intent = new Intent(this, AlignActivity.class);
                startActivityForResult(intent, REQUEST_CODE_ALIGN);
                break;
        }

    }
}
