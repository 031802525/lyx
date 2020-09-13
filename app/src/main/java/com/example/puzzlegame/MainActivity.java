package com.example.puzzlegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.puzzlegame.Animate.Animate1Activity;
import com.example.puzzlegame.BtnActivity.GuankaActivity;
import com.example.puzzlegame.BtnActivity.HardActivity;
import com.example.puzzlegame.BtnActivity.MiddleActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

//    声明控件
    Button beginBtn,easyBtn,middleBtn,hardBtn,jieshaoBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        初始化控件的函数
        initView();
    }

    private void initView() {
//        找到控件
        beginBtn = findViewById(R.id.main_begin);
        easyBtn = findViewById(R.id.main_easy);
        middleBtn = findViewById(R.id.main_middle);
        hardBtn = findViewById(R.id.main_hard);
        jieshaoBtn = findViewById(R.id.main_jieshao);

//        给每一个button设置点击事件
        beginBtn.setOnClickListener(this);
        easyBtn.setOnClickListener(this);
        middleBtn.setOnClickListener(this);
        hardBtn.setOnClickListener(this);
        jieshaoBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.main_begin:
                intent.setClass(this, Animate1Activity.class);
                break;
            case R.id.main_easy:
                intent.setClass(this, GuankaActivity.class);
                break;
            case R.id.main_middle:
                intent.setClass(this, MiddleActivity.class);
                break;
            case R.id.main_hard:
                intent.setClass(this, HardActivity.class);
                break;
            case R.id.main_jieshao:
                intent.setClass(this,JieShaoActivity.class);
                break;
        }
        startActivity(intent);
    }

    private long mExitTime;// 用于记当前时间的量

    @Override //再按一次退出程序
    public void onBackPressed() { // 返回操作
        if (System.currentTimeMillis() - mExitTime < 2000) {
            super.onBackPressed(); // 如果两次按返回键的时间小于 2 秒就调用系统返回方式
        } else {
            mExitTime = System.currentTimeMillis(); //获取当前时间 相当于 new Date（）
            Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();//第一次按下返回键当前时间肯定大于 2 秒，会弹出提示框
            // 第二次按下返回键 和上次的时间之差小于 2 秒就返回手机桌面 否则则继续重新设置当前时间 弹出提示框
        }
    }
}
