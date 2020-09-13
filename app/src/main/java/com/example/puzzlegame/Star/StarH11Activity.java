package com.example.puzzlegame.Star;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.puzzlegame.R;

public class StarH11Activity extends AppCompatActivity implements View.OnClickListener {

    ImageButton ib00, ib01, ib02, ib03, ib04, ib10, ib11, ib12, ib13, ib14, ib20, ib21, ib22, ib23, ib24, ib30, ib31, ib32, ib33, ib34, ib40, ib41, ib42, ib43, ib44;
    Button restarBtn;
    TextView timeTv;
    ImageView backIv;

    //    每行的图片个数
    private int imageX = 5;
    private int imageY = 5;  //每列的图片的个数

    //   图片的总个数
    private int imgCount = imageX * imageY;
    //    空白区域的位置
    private int blankSwap = imgCount - 1;
    //    初始化空白区域的按钮id
    private int blankImgid = R.id.pt_iv_04x04;


    //    定义计数时间的变量
    int time = 0;
    //    存放碎片的数组，便于进行统一的管理
    private int[] image = {R.mipmap.wangdalu5_01, R.mipmap.wangdalu5_02, R.mipmap.wangdalu5_03,
            R.mipmap.wangdalu5_04, R.mipmap.wangdalu5_05, R.mipmap.wangdalu5_06, R.mipmap.wangdalu5_07, R.mipmap.wangdalu5_08,
            R.mipmap.wangdalu5_09, R.mipmap.wangdalu5_10, R.mipmap.wangdalu5_11, R.mipmap.wangdalu5_12, R.mipmap.wangdalu5_13,
            R.mipmap.wangdalu5_14, R.mipmap.wangdalu5_15, R.mipmap.wangdalu5_16, R.mipmap.wangdalu5_17, R.mipmap.wangdalu5_18, R.mipmap.wangdalu5_19,
            R.mipmap.wangdalu5_20, R.mipmap.wangdalu5_21, R.mipmap.wangdalu5_22, R.mipmap.wangdalu5_23, R.mipmap.wangdalu5_24, R.mipmap.wangdalu5_25};
    //    声明一个图片数组的下标数组，随机排列这个数组
    private int[] imageIndex = new int[image.length];

    Handler handler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            if (msg.what == 1) {
                time++;
                timeTv.setText("时间： " + time + " 秒");
                handler.sendEmptyMessageDelayed(1, 1000);
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star_h11);

        initView();
//        disrupRandom();
//        handler.sendEmptyMessageDelayed(1, 1000);
    }

    private void disrupRandom() {
        for (int i = 0; i < imageIndex.length; i++) {
            imageIndex[i] = i;
        }
//        规定20次随机选择两个角标对应的值进行交换
        int rand1, rand2;
        for (int j = 0; j < 20; j++) {
//            随机生成第一个角标，生成0到15之间的随机数
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
        ib03.setImageResource(image[imageIndex[3]]);
        ib04.setImageResource(image[imageIndex[4]]);
        ib10.setImageResource(image[imageIndex[5]]);
        ib11.setImageResource(image[imageIndex[6]]);
        ib12.setImageResource(image[imageIndex[7]]);
        ib13.setImageResource(image[imageIndex[8]]);
        ib14.setImageResource(image[imageIndex[9]]);
        ib20.setImageResource(image[imageIndex[10]]);
        ib21.setImageResource(image[imageIndex[11]]);
        ib22.setImageResource(image[imageIndex[12]]);
        ib23.setImageResource(image[imageIndex[13]]);
        ib24.setImageResource(image[imageIndex[14]]);
        ib30.setImageResource(image[imageIndex[15]]);
        ib31.setImageResource(image[imageIndex[16]]);
        ib32.setImageResource(image[imageIndex[17]]);
        ib33.setImageResource(image[imageIndex[18]]);
        ib34.setImageResource(image[imageIndex[19]]);
        ib40.setImageResource(image[imageIndex[20]]);
        ib41.setImageResource(image[imageIndex[21]]);
        ib42.setImageResource(image[imageIndex[22]]);
        ib43.setImageResource(image[imageIndex[23]]);
        ib44.setImageResource(image[imageIndex[24]]);
    }

    private void initView() {
        ib00 = findViewById(R.id.pt_iv_00x00);
        ib01 = findViewById(R.id.pt_iv_00x01);
        ib02 = findViewById(R.id.pt_iv_00x02);
        ib03 = findViewById(R.id.pt_iv_00x03);
        ib04 = findViewById(R.id.pt_iv_00x04);
        ib10 = findViewById(R.id.pt_iv_01x00);
        ib11 = findViewById(R.id.pt_iv_01x01);
        ib12 = findViewById(R.id.pt_iv_01x02);
        ib13 = findViewById(R.id.pt_iv_01x03);
        ib14 = findViewById(R.id.pt_iv_01x04);
        ib20 = findViewById(R.id.pt_iv_02x00);
        ib21 = findViewById(R.id.pt_iv_02x01);
        ib22 = findViewById(R.id.pt_iv_02x02);
        ib23 = findViewById(R.id.pt_iv_02x03);
        ib24 = findViewById(R.id.pt_iv_02x04);
        ib30 = findViewById(R.id.pt_iv_03x00);
        ib31 = findViewById(R.id.pt_iv_03x01);
        ib32 = findViewById(R.id.pt_iv_03x02);
        ib33 = findViewById(R.id.pt_iv_03x03);
        ib34 = findViewById(R.id.pt_iv_03x04);
        ib40 = findViewById(R.id.pt_iv_04x00);
        ib41 = findViewById(R.id.pt_iv_04x01);
        ib42 = findViewById(R.id.pt_iv_04x02);
        ib43 = findViewById(R.id.pt_iv_04x03);
        ib44 = findViewById(R.id.pt_iv_04x04);
        restarBtn = findViewById(R.id.pt_btn_restart);
        timeTv = findViewById(R.id.ipt_tv_time);
        backIv = findViewById(R.id.back_iv);

        backIv.setOnClickListener(this);

        ib00.setImageResource(image[0]);
        ib01.setImageResource(image[1]);
        ib02.setImageResource(image[2]);
        ib03.setImageResource(image[3]);
        ib04.setImageResource(image[4]);
        ib10.setImageResource(image[5]);
        ib11.setImageResource(image[6]);
        ib12.setImageResource(image[7]);
        ib13.setImageResource(image[8]);
        ib14.setImageResource(image[9]);
        ib20.setImageResource(image[10]);
        ib21.setImageResource(image[11]);
        ib22.setImageResource(image[12]);
        ib23.setImageResource(image[13]);
        ib24.setImageResource(image[14]);
        ib30.setImageResource(image[15]);
        ib31.setImageResource(image[16]);
        ib32.setImageResource(image[17]);
        ib33.setImageResource(image[18]);
        ib34.setImageResource(image[19]);
        ib40.setImageResource(image[20]);
        ib41.setImageResource(image[21]);
        ib42.setImageResource(image[22]);
        ib43.setImageResource(image[23]);
        ib44.setImageResource(image[24]);

    }

    public void onClick(View view) {
        int id = view.getId();
//        九个按钮执行的点击事件的逻辑是相同的，如果有空格在周围，可以将图片的位置发生改变，否则点击事件不响应
        switch (id) {
            case R.id.pt_iv_00x00:
                move(R.id.pt_iv_00x00, 0);

                break;
            case R.id.pt_iv_00x01:
                move(R.id.pt_iv_00x01, 1);

                break;
            case R.id.pt_iv_00x02:
                move(R.id.pt_iv_00x02, 2);

                break;
            case R.id.pt_iv_00x03:
                move(R.id.pt_iv_00x03, 3);

                break;
            case R.id.pt_iv_00x04:
                move(R.id.pt_iv_00x04, 4);

                break;
            case R.id.pt_iv_01x00:
                move(R.id.pt_iv_01x00, 5);

                break;
            case R.id.pt_iv_01x01:
                move(R.id.pt_iv_01x01, 6);

                break;
            case R.id.pt_iv_01x02:
                move(R.id.pt_iv_01x02, 7);

                break;
            case R.id.pt_iv_01x03:
                move(R.id.pt_iv_01x03, 8);

                break;
            case R.id.pt_iv_01x04:
                move(R.id.pt_iv_01x04, 9);

                break;
            case R.id.pt_iv_02x00:
                move(R.id.pt_iv_02x00, 10);

                break;
            case R.id.pt_iv_02x01:
                move(R.id.pt_iv_02x01, 11);

                break;
            case R.id.pt_iv_02x02:
                move(R.id.pt_iv_02x02, 12);

                break;
            case R.id.pt_iv_02x03:
                move(R.id.pt_iv_02x03, 13);

                break;
            case R.id.pt_iv_02x04:
                move(R.id.pt_iv_02x04, 14);

                break;
            case R.id.pt_iv_03x00:
                move(R.id.pt_iv_03x00, 15);

                break;
            case R.id.pt_iv_03x01:
                move(R.id.pt_iv_03x01, 16);

                break;
            case R.id.pt_iv_03x02:
                move(R.id.pt_iv_03x02, 17);

                break;
            case R.id.pt_iv_03x03:
                move(R.id.pt_iv_03x03, 18);

                break;
            case R.id.pt_iv_03x04:
                move(R.id.pt_iv_03x04, 19);

                break;
            case R.id.pt_iv_04x00:
                move(R.id.pt_iv_04x00, 20);

                break;
            case R.id.pt_iv_04x01:
                move(R.id.pt_iv_04x01, 21);

                break;
            case R.id.pt_iv_04x02:
                move(R.id.pt_iv_04x02, 22);

                break;
            case R.id.pt_iv_04x03:
                move(R.id.pt_iv_04x03, 23);

                break;
            case R.id.pt_iv_04x04:
                move(R.id.pt_iv_03x03, 24);

                break;
            case R.id.back_iv:
                finish();
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
        int sitex = site / imageX;
        int sitey = site % imageY;
//        获取空白区域的坐标
        int blankx = blankSwap / imageX;
        int blanky = blankSwap % imageY;
//        可以移动的条件有两个
//        1、在同一行，列数相减绝对值为1，可移动 ； 2、在同一列，行数相减绝对值为1，可以移动
        int x = Math.abs(sitex - blankx);
        int y = Math.abs(sitey - blanky);
        if ((x == 0 && y == 1) || (y == 0 && x == 1)) {
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
            swap(site, blankSwap);
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
            ib03.setClickable(false);
            ib04.setClickable(false);
            ib10.setClickable(false);
            ib11.setClickable(false);
            ib12.setClickable(false);
            ib13.setClickable(false);
            ib14.setClickable(false);
            ib20.setClickable(false);
            ib21.setClickable(false);
            ib22.setClickable(false);
            ib23.setClickable(false);
            ib24.setClickable(false);
            ib30.setClickable(false);
            ib31.setClickable(false);
            ib32.setClickable(false);
            ib33.setClickable(false);
            ib34.setClickable(false);
            ib40.setClickable(false);
            ib41.setClickable(false);
            ib42.setClickable(false);
            ib43.setClickable(false);
            ib44.setClickable(false);

            ib44.setImageResource(image[24]);
            ib44.setVisibility(View.VISIBLE);

//            弹出提示用户成功的对话框
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("恭喜，拼图成功！您用的时间为" + time + "秒")
                    .setNegativeButton("重玩本关", null);
            builder.setPositiveButton("下一关", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(StarH11Activity.this, StarH12Activity.class);
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
        timeTv.setText("时间： " + time + " 秒");
        handler.sendEmptyMessageDelayed(1, 1000);
    }

    private void restore() {

//       拼图游戏重新开始，允许玩家移动碎片按钮
        ib00.setClickable(true);
        ib01.setClickable(true);
        ib02.setClickable(true);
        ib03.setClickable(true);
        ib04.setClickable(true);
        ib10.setClickable(true);
        ib11.setClickable(true);
        ib12.setClickable(true);
        ib13.setClickable(true);
        ib14.setClickable(true);
        ib20.setClickable(true);
        ib21.setClickable(true);
        ib22.setClickable(true);
        ib23.setClickable(true);
        ib24.setClickable(true);
        ib30.setClickable(true);
        ib31.setClickable(true);
        ib32.setClickable(true);
        ib33.setClickable(true);
        ib34.setClickable(true);
        ib40.setClickable(true);
        ib41.setClickable(true);
        ib42.setClickable(true);
        ib43.setClickable(true);
        ib44.setClickable(true);
//        还原被点击的图片，变成初始化的模样
        ImageButton clickBtn = findViewById(blankImgid);
        clickBtn.setVisibility(View.VISIBLE);
//        默认隐藏第九张图片
        ImageButton blankBtn = findViewById(R.id.pt_iv_04x04);
        blankBtn.setVisibility(View.INVISIBLE);//不显示但是占着位置
        blankImgid = R.id.pt_iv_04x04;  //初始化空白区域的按钮id
        blankSwap = imgCount - 1;
    }
}
