package com.example.puzzlegame.Star;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.puzzlegame.BtnActivity.GuankaActivity;
import com.example.puzzlegame.R;

public class Star1Activity extends AppCompatActivity implements View.OnClickListener {

    ImageButton ib00,ib01,ib02,ib10,ib11,ib12,ib20,ib21,ib22;
    Button restarBtn;
    TextView timeTv;
    ImageView backIv;
    int im1,im2,im3,im4,im5,im6,im7,im8,im9;

    //    每行的图片个数
    private int imageX = 3;
    private int imageY = 3;  //每列的图片的个数

    //   图片的总个数
    private int imgCount = imageX * imageY;
    //    空白区域的位置
    private int blankSwap = imgCount - 1;
    //    初始化空白区域的按钮id
    private int blankImgid = R.id.pt_iv_02x02;


    //    定义计数时间的变量
    int time = 0;
    //    存放碎片的数组，便于进行统一的管理
    private int[]image = {R.mipmap.biwenjun3_01,R.mipmap.biwenjun3_02,R.mipmap.biwenjun3_03,
            R.mipmap.biwenjun3_04,R.mipmap.biwenjun3_05,R.mipmap.biwenjun3_06,R.mipmap.biwenjun3_07,R.mipmap.biwenjun3_08,
            R.mipmap.biwenjun3_09};
    //    声明一个图片数组的下标数组，随机排列这个数组
    private int[]imageIndex = new int[image.length];

    Handler handler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            if (msg.what==1) {
                time++;
                timeTv.setText("时间： "+time+" 秒");
                handler.sendEmptyMessageDelayed(1,1000);
            }
        }
    };
    private SharedPreferences data;
    //    private int time1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star1);

//        if (savedInstanceState != null) {
//            time1 = savedInstanceState.getInt("time");
//        }
        initView();
//        data = getSharedPreferences("data", MODE_APPEND);
//        time = data.getInt("time", 0);
//        timeTv.setText("时间： "+time+" 秒");
//        imageIndex[0] = data.getInt("im1",0);
//        imageIndex[1] = data.getInt("im2",1);
//        imageIndex[2] = data.getInt("im3",2);
//        imageIndex[3] = data.getInt("im4",3);
//        imageIndex[4] = data.getInt("im5",4);
//        imageIndex[5] = data.getInt("im6",5);
//        imageIndex[6] = data.getInt("im7",6);
//        imageIndex[7] = data.getInt("im8",7);
//        imageIndex[8] = data.getInt("im9",8);

//        disrupRandom();
//        handler.sendEmptyMessageDelayed(1,1000);
    }

    private void disrupRandom() {
        for (int i = 0; i < imageIndex.length; i++) {
            imageIndex[i] = i;
        }
//        规定20次随机选择两个角标对应的值进行交换
        int rand1, rand2;
        for (int j = 0; j < 20; j++) {
//            随机生成第一个角标，生成0到8之间的随机数
            rand1 = (int) (Math.random() * (imageIndex.length - 1));
//            第二次随机生成的角标不能和第一次随机生成的角标相同，如果相同就不方便交换了
            do {
                rand2 = (int) (Math.random() * (imageIndex.length - 1));
                if (rand1 != rand2) {
                    break;
                }
            } while (true);

//            交换两个角标上对应的值
            swap(rand1, rand2);
        }

//        随机排列到指定的控件上
        ib00.setImageResource(image[imageIndex[0]]);
        ib01.setImageResource(image[imageIndex[1]]);
        ib02.setImageResource(image[imageIndex[2]]);
        ib10.setImageResource(image[imageIndex[3]]);
        ib11.setImageResource(image[imageIndex[4]]);
        ib12.setImageResource(image[imageIndex[5]]);
        ib20.setImageResource(image[imageIndex[6]]);
        ib21.setImageResource(image[imageIndex[7]]);
        ib22.setImageResource(image[imageIndex[8]]);
    }

    private void initView() {
        ib00 = findViewById(R.id.pt_iv_00x00);
        ib01 = findViewById(R.id.pt_iv_00x01);
        ib02 = findViewById(R.id.pt_iv_00x02);
        ib10 = findViewById(R.id.pt_iv_01x00);
        ib11 = findViewById(R.id.pt_iv_01x01);
        ib12 = findViewById(R.id.pt_iv_01x02);
        ib20 = findViewById(R.id.pt_iv_02x00);
        ib21 = findViewById(R.id.pt_iv_02x01);
        ib22 = findViewById(R.id.pt_iv_02x02);
        restarBtn = findViewById(R.id.pt_btn_restart);
        timeTv = findViewById(R.id.ipt_tv_time);
        backIv = findViewById(R.id.back_iv);

        backIv.setOnClickListener(this);
//        timeTv.setText("时间： "+time1+" 秒");
//        for (int i = 0; i < imageIndex.length; i++) {
//            imageIndex[i] = i;
//        }

        ib00.setImageResource(image[0]);
        ib01.setImageResource(image[1]);
        ib02.setImageResource(image[2]);
        ib10.setImageResource(image[3]);
        ib11.setImageResource(image[4]);
        ib12.setImageResource(image[5]);
        ib20.setImageResource(image[6]);
        ib21.setImageResource(image[7]);
        ib22.setImageResource(image[8]);

    }

    public void onClick(View view) {
        int id = view.getId();
//        九个按钮执行的点击事件的逻辑是相同的，如果有空格在周围，可以将图片的位置发生改变，否则点击事件不响应
        switch (id) {
            case R.id.pt_iv_00x00:
                move(R.id.pt_iv_00x00,0);

                break;
            case R.id.pt_iv_00x01:
                move(R.id.pt_iv_00x01,1);

                break;
            case R.id.pt_iv_00x02:
                move(R.id.pt_iv_00x02,2);

                break;
            case R.id.pt_iv_01x00:
                move(R.id.pt_iv_01x00,3);

                break;
            case R.id.pt_iv_01x01:
                move(R.id.pt_iv_01x01,4);

                break;
            case R.id.pt_iv_01x02:
                move(R.id.pt_iv_01x02,5);

                break;
            case R.id.pt_iv_02x00:
                move(R.id.pt_iv_02x00,6);

                break;
            case R.id.pt_iv_02x01:
                move(R.id.pt_iv_02x01,7);

                break;
            case R.id.pt_iv_02x02:
                move(R.id.pt_iv_02x02,8);

                break;
            case R.id.back_iv:
                Intent intent = new Intent(Star1Activity.this, GuankaActivity.class);
                startActivity(intent);
                break;
        }
    }

    //    交换数组指定角标上的数据
    private void swap(int rand1, int rand2) {
        int temp = imageIndex[rand1];
        imageIndex[rand1] = imageIndex[rand2];
        imageIndex[rand2] = temp;
    }

    //    表示移动指定位置的按钮的函数，将图片和空白区域进行交换
    private void move(int imagebuttonId, int site) {
//        判断选中的图片在第几行
        int sitex = site/imageX;
        int sitey = site%imageY;
//        获取空白区域的坐标
        int blankx = blankSwap/imageX;
        int blanky = blankSwap%imageY;
//        可以移动的条件有两个
//        1、在同一行，列数相减绝对值为1，可移动 ； 2、在同一列，行数相减绝对值为1，可以移动
        int x = Math.abs(sitex-blankx);
        int y = Math.abs(sitey-blanky);
        if((x==0&&y==1) || (y==0&&x==1)) {
//            通过id查找到这个可以移动的按钮
            ImageButton clickButton = findViewById(imagebuttonId);
            clickButton.setVisibility(View.INVISIBLE);
//            查找到空白区域的按钮
            ImageButton blankButton = findViewById(blankImgid);
//            将空白区域的按钮设置图片
            blankButton.setImageResource(image[imageIndex[site]]);
//            移动之前是不可见的，移动之后，将控件设置为可见
            blankButton.setVisibility(View.VISIBLE);
//            将改变角标的过程记录到存储图片位置数组当中
            swap(site,blankSwap);
//            将新的空白区域位置更新，等于传入的点击按钮的位置
            blankSwap = site;
            blankImgid = imagebuttonId;
        }

//        判断本次移动完成后是否完成了拼图游戏
        judgeGameOver();
    }

    //    判断拼图是否成功
    private void judgeGameOver() {
        boolean loop = true; //定义标志位
        for (int i = 0; i < imageIndex.length; i++) {
            if (imageIndex[i] != i) {
                loop = false;
                break;
            }
        }
        if (loop) {
//            拼图成功
//            停止计时
            handler.removeMessages(1);
//            拼图成功，禁止玩家继续移动按钮
            ib00.setClickable(false);
            ib01.setClickable(false);
            ib02.setClickable(false);
            ib10.setClickable(false);
            ib11.setClickable(false);
            ib12.setClickable(false);
            ib20.setClickable(false);
            ib21.setClickable(false);
            ib22.setClickable(false);
            ib22.setImageResource(image[8]);
            ib22.setVisibility(View.VISIBLE);

//            弹出提示用户成功的对话框
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("恭喜，拼图成功！您用的时间为"+time+"秒")
                    .setNegativeButton("重玩本关",null);
            builder.setPositiveButton("下一关", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(Star1Activity.this, Star2Activity.class);
                    startActivity(intent);
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }

    }


    //    重新开始按钮的点击事件
    public void restart(View view) {
//         将状态还原
        restore();
//        将拼图重新打乱
        disrupRandom();

//        先中断之前的消息
        handler.removeMessages(1);
//        将时间重新归零，并且重新开始计时
        time = 0;
        timeTv.setText("时间： "+time+" 秒");
        handler.sendEmptyMessageDelayed(1,1000);
    }


    private void restore(){

//       拼图游戏重新开始，允许玩家移动碎片按钮
        ib00.setClickable(true);
        ib01.setClickable(true);
        ib02.setClickable(true);
        ib10.setClickable(true);
        ib11.setClickable(true);
        ib12.setClickable(true);
        ib20.setClickable(true);
        ib21.setClickable(true);
        ib22.setClickable(true);
//        还原被点击的图片，变成初始化的模样
        ImageButton clickBtn = findViewById(blankImgid);
        clickBtn.setVisibility(View.VISIBLE);
//        默认隐藏第九张图片
        ImageButton blankBtn = findViewById(R.id.pt_iv_02x02);
        blankBtn.setVisibility(View.INVISIBLE);
        blankImgid = R.id.pt_iv_02x02;  //初始化空白区域的按钮id
        blankSwap = imgCount-1;

    }

    public void remain(View view) {

        handler.sendEmptyMessageDelayed(1,1000);

    }
//
//    @Override
//    protected void onSaveInstanceState(@NonNull Bundle outState) {
//        super.onSaveInstanceState(outState);
//        outState.putIntArray("img",imageIndex);
//        outState.putInt("time",time);
//    }

//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event) {
//        if (keyCode == KeyEvent.KEYCODE_BACK) {
//            moveTaskToBack(true);
//            return true;
//        }
//        return super.onKeyDown(keyCode,event);
//    }

//    @Override
//    protected void onPause() {
//        super.onPause();
//        SharedPreferences.Editor edit = data.edit();
//        edit.putInt("time",time);
//        im1 = imageIndex[0];
//        im2 = imageIndex[1];
//        im3 = imageIndex[2];
//        im4 = imageIndex[3];
//        im5 = imageIndex[4];
//        im6 = imageIndex[5];
//        im7 = imageIndex[6];
//        im8 = imageIndex[7];
//        im9 = imageIndex[8];
//        edit.putInt("im1",im1);
//        edit.putInt("im2",im2);
//        edit.putInt("im3",im3);
//        edit.putInt("im4",im4);
//        edit.putInt("im5",im5);
//        edit.putInt("im6",im6);
//        edit.putInt("im7",im7);
//        edit.putInt("im8",im8);
//        edit.putInt("im9",im9);
//        edit.commit();
//    }
}
