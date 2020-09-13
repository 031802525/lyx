package com.example.puzzlegame.BtnActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.puzzlegame.Animate.Animate1Activity;
import com.example.puzzlegame.Animate.AnimateH10Activity;
import com.example.puzzlegame.Animate.AnimateH11Activity;
import com.example.puzzlegame.Animate.AnimateH12Activity;
import com.example.puzzlegame.Animate.AnimateH1Activity;
import com.example.puzzlegame.Animate.AnimateH2Activity;
import com.example.puzzlegame.Animate.AnimateH3Activity;
import com.example.puzzlegame.Animate.AnimateH4Activity;
import com.example.puzzlegame.Animate.AnimateH5Activity;
import com.example.puzzlegame.Animate.AnimateH6Activity;
import com.example.puzzlegame.Animate.AnimateH7Activity;
import com.example.puzzlegame.Animate.AnimateH8Activity;
import com.example.puzzlegame.Animate.AnimateH9Activity;
import com.example.puzzlegame.Star.Star1Activity;
import com.example.puzzlegame.Star.StarH10Activity;
import com.example.puzzlegame.Star.StarH11Activity;
import com.example.puzzlegame.Star.StarH12Activity;
import com.example.puzzlegame.Star.StarH13Activity;
import com.example.puzzlegame.Star.StarH14Activity;
import com.example.puzzlegame.Star.StarH15Activity;
import com.example.puzzlegame.Star.StarH16Activity;
import com.example.puzzlegame.Star.StarH1Activity;
import com.example.puzzlegame.Star.StarH2Activity;
import com.example.puzzlegame.Star.StarH3Activity;
import com.example.puzzlegame.Star.StarH4Activity;
import com.example.puzzlegame.Star.StarH5Activity;
import com.example.puzzlegame.Star.StarH6Activity;
import com.example.puzzlegame.Star.StarH7Activity;
import com.example.puzzlegame.Star.StarH8Activity;
import com.example.puzzlegame.Star.StarH9Activity;
import com.example.puzzlegame.R;
import com.example.puzzlegame.View.ViewH10Activity;
import com.example.puzzlegame.View.ViewH11Activity;
import com.example.puzzlegame.View.ViewH12Activity;
import com.example.puzzlegame.View.ViewH1Activity;
import com.example.puzzlegame.View.ViewH2Activity;
import com.example.puzzlegame.View.ViewH3Activity;
import com.example.puzzlegame.View.ViewH4Activity;
import com.example.puzzlegame.View.ViewH5Activity;
import com.example.puzzlegame.View.ViewH6Activity;
import com.example.puzzlegame.View.ViewH7Activity;
import com.example.puzzlegame.View.ViewH8Activity;
import com.example.puzzlegame.View.ViewH9Activity;

public class HardActivity extends AppCompatActivity implements View.OnClickListener {


    ImageButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,
            btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30,btn31,btn32,btn33,btn34,btn35,btn36,
            btn37,btn38,btn39,btn40;
    ImageView backIv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard);

        initView();
    }

    private void initView() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn13 = findViewById(R.id.btn13);
        btn14 = findViewById(R.id.btn14);
        btn15 = findViewById(R.id.btn15);
        btn16 = findViewById(R.id.btn16);
        btn17 = findViewById(R.id.btn17);
        btn18 = findViewById(R.id.btn18);
        btn19 = findViewById(R.id.btn19);
        btn20 = findViewById(R.id.btn20);
        btn21 = findViewById(R.id.btn21);
        btn22 = findViewById(R.id.btn22);
        btn23 = findViewById(R.id.btn23);
        btn24 = findViewById(R.id.btn24);
        btn25 = findViewById(R.id.btn25);
        btn26 = findViewById(R.id.btn26);
        btn27 = findViewById(R.id.btn27);
        btn28 = findViewById(R.id.btn28);
        btn29 = findViewById(R.id.btn29);
        btn30 = findViewById(R.id.btn30);
        btn31 = findViewById(R.id.btn31);
        btn32 = findViewById(R.id.btn32);
        btn33 = findViewById(R.id.btn33);
        btn34 = findViewById(R.id.btn34);
        btn35 = findViewById(R.id.btn35);
        btn36 = findViewById(R.id.btn36);
        btn37 = findViewById(R.id.btn37);
        btn38 = findViewById(R.id.btn38);
        btn39 = findViewById(R.id.btn39);
        btn40 = findViewById(R.id.btn40);
        backIv = findViewById(R.id.back);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
        btn16.setOnClickListener(this);
        btn17.setOnClickListener(this);
        btn18.setOnClickListener(this);
        btn19.setOnClickListener(this);
        btn20.setOnClickListener(this);
        btn21.setOnClickListener(this);
        btn22.setOnClickListener(this);
        btn23.setOnClickListener(this);
        btn24.setOnClickListener(this);
        btn25.setOnClickListener(this);
        btn26.setOnClickListener(this);
        btn27.setOnClickListener(this);
        btn28.setOnClickListener(this);
        btn29.setOnClickListener(this);
        btn30.setOnClickListener(this);
        btn31.setOnClickListener(this);
        btn32.setOnClickListener(this);
        btn33.setOnClickListener(this);
        btn34.setOnClickListener(this);
        btn35.setOnClickListener(this);
        btn36.setOnClickListener(this);
        btn37.setOnClickListener(this);
        btn38.setOnClickListener(this);
        btn39.setOnClickListener(this);
        btn40.setOnClickListener(this);
        backIv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.btn1:
                intent.setClass(this, AnimateH1Activity.class);
                startActivity(intent);
                break;
            case R.id.btn2:
                intent.setClass(this, AnimateH2Activity.class);
                startActivity(intent);
                break;
            case R.id.btn3:
                intent.setClass(this, AnimateH3Activity.class);
                startActivity(intent);
                break;
            case R.id.btn4:
                intent.setClass(this, AnimateH4Activity.class);
                startActivity(intent);
                break;
            case R.id.btn5:
                intent.setClass(this, AnimateH5Activity.class);
                startActivity(intent);
                break;
            case R.id.btn6:
                intent.setClass(this, AnimateH6Activity.class);
                startActivity(intent);
                break;
            case R.id.btn7:
                intent.setClass(this, AnimateH7Activity.class);
                startActivity(intent);
                break;
            case R.id.btn8:
                intent.setClass(this, AnimateH8Activity.class);
                startActivity(intent);
                break;
            case R.id.btn9:
                intent.setClass(this, AnimateH9Activity.class);
                startActivity(intent);
                break;
            case R.id.btn10:
                intent.setClass(this, AnimateH10Activity.class);
                startActivity(intent);
                break;
            case R.id.btn11:
                intent.setClass(this, AnimateH11Activity.class);
                startActivity(intent);
                break;
            case R.id.btn12:
                intent.setClass(this, AnimateH12Activity.class);
                startActivity(intent);
                break;
            case R.id.btn13:
                intent.setClass(this, StarH1Activity.class);
                startActivity(intent);
                break;
            case R.id.btn14:
                intent.setClass(this, StarH2Activity.class);
                startActivity(intent);
                break;
            case R.id.btn15:
                intent.setClass(this, StarH3Activity.class);
                startActivity(intent);
                break;
            case R.id.btn16:
                intent.setClass(this, StarH4Activity.class);
                startActivity(intent);
                break;
            case R.id.btn17:
                intent.setClass(this, StarH5Activity.class);
                startActivity(intent);
                break;
            case R.id.btn18:
                intent.setClass(this, StarH6Activity.class);
                startActivity(intent);
                break;
            case R.id.btn19:
                intent.setClass(this, StarH7Activity.class);
                startActivity(intent);
                break;
            case R.id.btn20:
                intent.setClass(this, StarH8Activity.class);
                startActivity(intent);
                break;
            case R.id.btn21:
                intent.setClass(this, StarH9Activity.class);
                startActivity(intent);
                break;
            case R.id.btn22:
                intent.setClass(this, StarH10Activity.class);
                startActivity(intent);
                break;
            case R.id.btn23:
                intent.setClass(this, StarH11Activity.class);
                startActivity(intent);
                break;
            case R.id.btn24:
                intent.setClass(this, StarH12Activity.class);
                startActivity(intent);
                break;
            case R.id.btn25:
                intent.setClass(this, StarH13Activity.class);
                startActivity(intent);
                break;
            case R.id.btn26:
                intent.setClass(this, StarH14Activity.class);
                startActivity(intent);
                break;
            case R.id.btn27:
                intent.setClass(this, StarH15Activity.class);
                startActivity(intent);
                break;
            case R.id.btn28:
                intent.setClass(this, StarH16Activity.class);
                startActivity(intent);
                break;
            case R.id.btn29:
                intent.setClass(this, ViewH1Activity.class);
                startActivity(intent);
                break;
            case R.id.btn30:
                intent.setClass(this, ViewH2Activity.class);
                startActivity(intent);
                break;
            case R.id.btn31:
                intent.setClass(this, ViewH3Activity.class);
                startActivity(intent);
                break;
            case R.id.btn32:
                intent.setClass(this, ViewH4Activity.class);
                startActivity(intent);
                break;
            case R.id.btn33:
                intent.setClass(this, ViewH5Activity.class);
                startActivity(intent);
                break;
            case R.id.btn34:
                intent.setClass(this, ViewH6Activity.class);
                startActivity(intent);
                break;
            case R.id.btn35:
                intent.setClass(this, ViewH7Activity.class);
                startActivity(intent);
                break;
            case R.id.btn36:
                intent.setClass(this, ViewH8Activity.class);
                startActivity(intent);
                break;
            case R.id.btn37:
                intent.setClass(this, ViewH9Activity.class);
                startActivity(intent);
                break;
            case R.id.btn38:
                intent.setClass(this, ViewH10Activity.class);
                startActivity(intent);
                break;
            case R.id.btn39:
                intent.setClass(this, ViewH11Activity.class);
                startActivity(intent);
                break;
            case R.id.btn40:
                intent.setClass(this, ViewH12Activity.class);
                startActivity(intent);
                break;
            case R.id.back:
                finish();
                break;
        }
    }
}
