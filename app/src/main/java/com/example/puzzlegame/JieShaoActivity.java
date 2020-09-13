package com.example.puzzlegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.puzzlegame.Animate.Animate1Activity;

public class JieShaoActivity extends AppCompatActivity implements View.OnClickListener {

    TextView jieshaoTv;
    ImageView backIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jie_shao);
        jieshaoTv = findViewById(R.id.jieshao_tv);
        backIv = findViewById(R.id.jieshao_back);
        jieshaoTv.setOnClickListener(this);
        backIv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.jieshao_tv:
                Intent intent = new Intent(JieShaoActivity.this, Animate1Activity.class);
                startActivity(intent);
                break;
            case R.id.jieshao_back:
                finish();
                break;
        }
    }
}
