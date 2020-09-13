package com.example.puzzlegame.BtnActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.puzzlegame.Animate.Animate10Activity;
import com.example.puzzlegame.Animate.Animate11Activity;
import com.example.puzzlegame.Animate.Animate12Activity;
import com.example.puzzlegame.Animate.Animate1Activity;
import com.example.puzzlegame.Animate.Animate2Activity;
import com.example.puzzlegame.Animate.Animate3Activity;
import com.example.puzzlegame.Animate.Animate4Activity;
import com.example.puzzlegame.Animate.Animate5Activity;
import com.example.puzzlegame.Animate.Animate6Activity;
import com.example.puzzlegame.Animate.Animate7Activity;
import com.example.puzzlegame.Animate.Animate8Activity;
import com.example.puzzlegame.Animate.Animate9Activity;
import com.example.puzzlegame.Star.Star10Activity;
import com.example.puzzlegame.Star.Star11Activity;
import com.example.puzzlegame.Star.Star12Activity;
import com.example.puzzlegame.Star.Star13Activity;
import com.example.puzzlegame.Star.Star14Activity;
import com.example.puzzlegame.Star.Star15Activity;
import com.example.puzzlegame.Star.Star16Activity;
import com.example.puzzlegame.Star.Star1Activity;
import com.example.puzzlegame.Star.Star2Activity;
import com.example.puzzlegame.Star.Star3Activity;
import com.example.puzzlegame.Star.Star4Activity;
import com.example.puzzlegame.Star.Star5Activity;
import com.example.puzzlegame.Star.Star6Activity;
import com.example.puzzlegame.Star.Star7Activity;
import com.example.puzzlegame.Star.Star8Activity;
import com.example.puzzlegame.Star.Star9Activity;
import com.example.puzzlegame.R;
import com.example.puzzlegame.View.View10Activity;
import com.example.puzzlegame.View.View11Activity;
import com.example.puzzlegame.View.View12Activity;
import com.example.puzzlegame.View.View1Activity;
import com.example.puzzlegame.View.View2Activity;
import com.example.puzzlegame.View.View3Activity;
import com.example.puzzlegame.View.View4Activity;
import com.example.puzzlegame.View.View5Activity;
import com.example.puzzlegame.View.View6Activity;
import com.example.puzzlegame.View.View7Activity;
import com.example.puzzlegame.View.View8Activity;
import com.example.puzzlegame.View.View9Activity;

public class GuankaActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,
                btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30,btn31,btn32,btn33,btn34,btn35,btn36,
                btn37,btn38,btn39,btn40;
    ImageView backIv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guanka);

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
                intent.setClass(this, Animate1Activity.class);
                startActivity(intent);
                break;
            case R.id.btn2:
                intent.setClass(this,Animate2Activity.class);
                startActivity(intent);
                break;
            case R.id.btn3:
                intent.setClass(this, Animate3Activity.class);
                startActivity(intent);
                break;
            case R.id.btn4:
                intent.setClass(this, Animate4Activity.class);
                startActivity(intent);
                break;
            case R.id.btn5:
                intent.setClass(this, Animate5Activity.class);
                startActivity(intent);
                break;
            case R.id.btn6:
                intent.setClass(this, Animate6Activity.class);
                startActivity(intent);
                break;
            case R.id.btn7:
                intent.setClass(this, Animate7Activity.class);
                startActivity(intent);
                break;
            case R.id.btn8:
                intent.setClass(this, Animate8Activity.class);
                startActivity(intent);
                break;
            case R.id.btn9:
                intent.setClass(this, Animate9Activity.class);
                startActivity(intent);
                break;
            case R.id.btn10:
                intent.setClass(this, Animate10Activity.class);
                startActivity(intent);
                break;
            case R.id.btn11:
                intent.setClass(this, Animate11Activity.class);
                startActivity(intent);
                break;
            case R.id.btn12:
                intent.setClass(this, Animate12Activity.class);
                startActivity(intent);
                break;
            case R.id.btn13:
                intent.setClass(this, Star1Activity.class);
                startActivity(intent);
                break;
            case R.id.btn14:
                intent.setClass(this, Star2Activity.class);
                startActivity(intent);
                break;
            case R.id.btn15:
                intent.setClass(this, Star3Activity.class);
                startActivity(intent);
                break;
            case R.id.btn16:
                intent.setClass(this, Star4Activity.class);
                startActivity(intent);
                break;
            case R.id.btn17:
                intent.setClass(this, Star5Activity.class);
                startActivity(intent);
                break;
            case R.id.btn18:
                intent.setClass(this, Star6Activity.class);
                startActivity(intent);
                break;
            case R.id.btn19:
                intent.setClass(this, Star7Activity.class);
                startActivity(intent);
                break;
            case R.id.btn20:
                intent.setClass(this, Star8Activity.class);
                startActivity(intent);
                break;
            case R.id.btn21:
                intent.setClass(this, Star9Activity.class);
                startActivity(intent);
                break;
            case R.id.btn22:
                intent.setClass(this, Star10Activity.class);
                startActivity(intent);
                break;
            case R.id.btn23:
                intent.setClass(this, Star11Activity.class);
                startActivity(intent);
                break;
            case R.id.btn24:
                intent.setClass(this, Star12Activity.class);
                startActivity(intent);
                break;
            case R.id.btn25:
                intent.setClass(this, Star13Activity.class);
                startActivity(intent);
                break;
            case R.id.btn26:
                intent.setClass(this, Star14Activity.class);
                startActivity(intent);
                break;
            case R.id.btn27:
                intent.setClass(this, Star15Activity.class);
                startActivity(intent);
                break;
            case R.id.btn28:
                intent.setClass(this, Star16Activity.class);
                startActivity(intent);
                break;
            case R.id.btn29:
                intent.setClass(this, View1Activity.class);
                startActivity(intent);
                break;
            case R.id.btn30:
                intent.setClass(this, View2Activity.class);
                startActivity(intent);
                break;
            case R.id.btn31:
                intent.setClass(this, View3Activity.class);
                startActivity(intent);
                break;
            case R.id.btn32:
                intent.setClass(this, View4Activity.class);
                startActivity(intent);
                break;
            case R.id.btn33:
                intent.setClass(this, View5Activity.class);
                startActivity(intent);
                break;
            case R.id.btn34:
                intent.setClass(this, View6Activity.class);
                startActivity(intent);
                break;
            case R.id.btn35:
                intent.setClass(this, View7Activity.class);
                startActivity(intent);
                break;
            case R.id.btn36:
                intent.setClass(this, View8Activity.class);
                startActivity(intent);
                break;
            case R.id.btn37:
                intent.setClass(this, View9Activity.class);
                startActivity(intent);
                break;
            case R.id.btn38:
                intent.setClass(this, View10Activity.class);
                startActivity(intent);
                break;
            case R.id.btn39:
                intent.setClass(this, View11Activity.class);
                startActivity(intent);
                break;
            case R.id.btn40:
                intent.setClass(this, View12Activity.class);
                startActivity(intent);
                break;
            case R.id.back:
                finish();
                break;
        }
    }
}
