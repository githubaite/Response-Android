package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        Paint paint  = new Paint();
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);//设置抗锯齿
        canvas.drawCircle(200,150,100,paint);


       paint.setStrokeWidth(2);//描边宽度
        paint.setStyle(Paint.Style.STROKE);//设置不填充
        canvas.drawCircle(500,150,100,paint);// 圆心 cx 距离原点x坐标距离  cy 距离y距离 radius  半径

        Paint paint1 = new Paint();
        paint1.setAntiAlias(true);
        paint1.setColor(Color.BLUE);
        canvas.drawCircle(200,400,60,paint1);


        paint.setStrokeWidth(30);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(500,400,60,paint);
    }
}
